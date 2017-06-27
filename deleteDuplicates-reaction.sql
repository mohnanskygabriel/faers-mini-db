--PostgreSQL version 9.6
--run as pgscript or separate queries
DROP INDEX IF EXISTS faers.IX_reaction_id;
CREATE INDEX IX_reaction_id ON faers.reaction(id);
UPDATE faers.reaction SET meddra_pt = LOWER(meddra_pt);
UPDATE faers.reaction SET meddra_version_pt = 0 WHERE meddra_version_pt IS NULL;
UPDATE faers.reaction SET outcome = 0 WHERE outcome IS NULL;
--get every meddra_pt first occurence
ALTER TABLE faers.patient_reaction_mapping SET(FILLFACTOR = 70);
DROP INDEX IF EXISTS faers.IX_patient_reaction_mapping_reaction_id;
CREATE INDEX IX_patient_reaction_mapping_reaction_id ON faers.patient_reaction_mapping(reaction_id);
DROP TABLE IF EXISTS first;
CREATE LOCAL TEMPORARY TABLE first AS
( 
SELECT
	map.reaction_id,
	first_occurence.id first_occurence
FROM faers.patient_reaction_mapping map INNER JOIN faers.reaction r ON map.reaction_id = r.id
INNER JOIN (
SELECT 
	min(id) id,
	meddra_pt,
	meddra_version_pt,
	outcome
FROM faers.reaction
GROUP BY meddra_pt, meddra_version_pt, outcome ORDER BY meddra_pt, meddra_version_pt, outcome
) first_occurence ON r.meddra_pt = first_occurence.meddra_pt 
	AND r.meddra_version_pt = first_occurence.meddra_version_pt
	AND r.outcome = first_occurence.outcome
);

DROP INDEX IF EXISTS faers.IX_reaction_id;
DROP INDEX IF EXISTS faers.IX_patient_reaction_mapping_reaction_id;
DROP INDEX IF EXISTS IX_first_reaction_id;
CREATE INDEX IX_first_reaction_id ON first(reaction_id);
UPDATE
	faers.patient_reaction_mapping map 
SET
	reaction_id = (SELECT first_occurence FROM first f WHERE map.reaction_id = f.reaction_id);

CREATE INDEX IX_patient_reaction_mapping_reaction_id ON faers.patient_reaction_mapping(reaction_id);
DELETE FROM faers.reaction WHERE id NOT IN(SELECT reaction_id FROM faers.patient_reaction_mapping);
CREATE INDEX IX_reaction_id ON faers.reaction(id);
VACUUM FULL faers.reaction;