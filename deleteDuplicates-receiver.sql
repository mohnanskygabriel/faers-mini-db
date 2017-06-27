--PostgreSQL version 9.6
--run as pgscript or separate queries
DROP INDEX IF EXISTS faers.IX_receiver_id;
CREATE INDEX IX_receiver_id ON faers.receiver(id);

UPDATE faers.receiver SET type = 0 WHERE type IS NULL;
UPDATE faers.receiver SET organization = 'UNKNOWN' WHERE organization IS NULL;

DROP TABLE IF EXISTS first_receiver;
CREATE TEMPORARY TABLE IF NOT EXISTS first_receiver AS
(
SELECT
	min(id),
	type,
	organization
FROM 
	faers.receiver
GROUP BY 
	type,organization
);

DROP TABLE IF EXISTS receiver_id_min;
CREATE TEMPORARY TABLE IF NOT EXISTS receiver_id_min AS
(
SELECT 
	r.id,
	fr.min
FROM
	faers.receiver r
INNER JOIN
	first_receiver fr
ON
	r.type = fr.type
	AND
	r.organization = fr.organization 
);

ALTER TABLE faers.event_result SET(FILLFACTOR = 70);

DROP INDEX IF EXISTS IX_receiver_id_min_id;
CREATE INDEX IX_receiver_id_min_id ON receiver_id_min(id);

UPDATE
	faers.event_result er
SET
	receiver_id = (SELECT min FROM receiver_id_min rim WHERE er.receiver_id = rim.id)
WHERE 
	receiver_id IS NOT NULL;

DROP INDEX IF EXISTS faers.IX_event_result_receiver_id;
CREATE INDEX IX_event_result_receiver_id ON faers.event_result(receiver_id);

DROP INDEX faers.IX_receiver_id;

DELETE FROM faers.receiver WHERE id NOT IN(SELECT receiver_id FROM faers.event_result WHERE receiver_id IS NOT NULL);
CREATE INDEX IX_receiver_id ON faers.receiver(id);
VACUUM FULL faers.receiver;