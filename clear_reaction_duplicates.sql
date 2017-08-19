CREATE OR REPLACE FUNCTION faers.clear_reaction_duplicates()
  RETURNS INTEGER AS
$BODY$
BEGIN
DROP INDEX IF EXISTS faers.IX_reaction_id;
CREATE INDEX IX_reaction_id ON faers.reaction(id);
--get every meddra_pt first occurence
ALTER TABLE faers.patient_reaction_mapping SET(FILLFACTOR = 70);
DROP INDEX IF EXISTS faers.IX_patient_reaction_mapping_reaction_id;
CREATE INDEX IX_patient_reaction_mapping_reaction_id ON faers.patient_reaction_mapping(reaction_id);
DROP TABLE IF EXISTS first;
CREATE LOCAL TEMPORARY TABLE first AS
( 
SELECT 
	map.reaction_id map_id,
	temp_first.first_id
FROM faers.patient_reaction_mapping map INNER JOIN(
	SELECT
		react.id original_id, 
		first_occurence.id first_id
	FROM faers.reaction react INNER JOIN(
		SELECT DISTINCT ON (meddra_pt) id, meddra_pt FROM faers.reaction ORDER BY meddra_pt, id
		) first_occurence ON react.meddra_pt = first_occurence.meddra_pt)
temp_first ON temp_first.original_id = map.reaction_id);

DROP INDEX IF EXISTS faers.IX_reaction_id;
DROP INDEX IF EXISTS faers.IX_patient_reaction_mapping_reaction_id;
DROP INDEX IF EXISTS IX_first_reaction_id;
CREATE INDEX IX_first_reaction_id ON first(map_id);
UPDATE
	faers.patient_reaction_mapping map 
SET
	reaction_id = (SELECT first_id FROM first f WHERE map.reaction_id = f.map_id) WHERE map.reaction_id NOT IN (SELECT first_id FROM first);

CREATE INDEX IX_patient_reaction_mapping_reaction_id ON faers.patient_reaction_mapping(reaction_id);
DELETE FROM faers.reaction WHERE id NOT IN(SELECT reaction_id FROM faers.patient_reaction_mapping);
CREATE INDEX IX_reaction_id ON faers.reaction(id);
RETURN 0;
END;
$BODY$
  LANGUAGE plpgsql VOLATILE
  COST 100;
ALTER FUNCTION faers.clear_reaction_duplicates()
  OWNER TO faers_data_admin;