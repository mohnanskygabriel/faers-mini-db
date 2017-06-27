--PostgreSQL version 9.6
--run as pgscript or separate queries
DROP INDEX IF EXISTS faers.IX_drug_active_substance_id;
CREATE INDEX IX_drug_active_substance_id ON faers.drug(active_substance_id);

DROP INDEX IF EXISTS faers.IX_active_substance_id;
CREATE INDEX IX_active_substance_id ON faers.active_substance(id);

DROP TABLE IF EXISTS old_new_active_substance_id;
CREATE TEMPORARY TABLE old_new_active_substance_id AS(
SELECT
	d.active_substance_id old_active_substance_id,
	first.min new_active_substance_id
FROM 
	faers.drug d
INNER JOIN
	faers.active_substance acs
ON
	d.active_substance_id = acs.id
INNER JOIN 
	(SELECT
		min(id),
		name
	FROM
		faers.active_substance fas
	GROUP BY 
		name) first
ON
	acs.name = first.name
);

ALTER TABLE faers.drug SET(FILLFACTOR = 70);
REINDEX TABLE faers.drug;
DROP INDEX IF EXISTS faers.IX_drug_active_substance_id;

DROP INDEX IF EXISTS IX_old_new_active_substance_id;
CREATE INDEX IX_old_new_active_substance_id ON old_new_active_substance_id(old_active_substance_id,new_active_substance_id);

UPDATE
	faers.drug d
SET active_substance_id = (	SELECT 
				new_active_substance_id 
				FROM 
				old_new_active_substance_id onas
				WHERE d.active_substance_id = onas.old_active_substance_id LIMIT 1);
				
DROP INDEX IF EXISTS faers.IX_drug_active_substance_id;
CREATE INDEX IX_drug_active_substance_id ON faers.drug(active_substance_id);				

DELETE FROM faers.active_substance WHERE id NOT IN(SELECT active_substance_id FROM faers.drug WHERE active_substance_id IS NOT NULL)
VACUUM FULL faers.active_substance