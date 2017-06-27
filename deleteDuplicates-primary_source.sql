--PostgreSQL version 9.6
--run as pgscript or separate queries
DROP INDEX IF EXISTS faers.IX_primary_source_id;
CREATE INDEX IX_primary_source_id ON faers.primary_source(id);

UPDATE faers.primary_source SET qualification = 0 WHERE qualification IS NULL;
UPDATE faers.primary_source SET reporter_country = 'UNKNOWN' WHERE reporter_country IS NULL;

DROP TABLE IF EXISTS first_primary_source;
CREATE TEMPORARY TABLE IF NOT EXISTS first_primary_source AS
(
SELECT
	min(id),
	qualification,
	reporter_country
FROM 
	faers.primary_source
GROUP BY 
	qualification,reporter_country
);

DROP TABLE IF EXISTS primary_source_id_min;
CREATE TEMPORARY TABLE IF NOT EXISTS primary_source_id_min AS
(
SELECT 
	ps.id,
	fps.min
FROM
	faers.primary_source ps
INNER JOIN
	first_primary_source fps
ON
	ps.qualification = fps.qualification
	AND
	ps.reporter_country = fps.reporter_country 
);

ALTER TABLE faers.event_result SET(FILLFACTOR = 70);

DROP INDEX IF EXISTS IX_primary_source_id_min_id;
CREATE INDEX IX_primary_source_id_min_id ON primary_source_id_min(id);

UPDATE
	faers.event_result er
SET
	primary_source_id = (SELECT min FROM primary_source_id_min psim WHERE er.primary_source_id = psim.id)
WHERE 
	primary_source_id IS NOT NULL;

DROP INDEX IF EXISTS faers.IX_event_result_primary_source_id;
CREATE INDEX IX_event_result_primary_source_id ON faers.event_result(primary_source_id);

DROP INDEX faers.IX_primary_source_id;

DELETE FROM faers.primary_source WHERE id NOT IN(SELECT primary_source_id FROM faers.event_result WHERE primary_source_id IS NOT NULL);
CREATE INDEX IX_primary_source_id ON faers.primary_source(id);
VACUUM FULL faers.primary_source;