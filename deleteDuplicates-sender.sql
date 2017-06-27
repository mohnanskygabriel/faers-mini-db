--PostgreSQL version 9.6
--run as pgscript or separate queries
DROP INDEX IF EXISTS faers.IX_sender_id;
CREATE INDEX IX_sender_id ON faers.sender(id);

UPDATE faers.sender SET type = 0 WHERE type IS NULL;
UPDATE faers.sender SET organization = 'UNKNOWN' WHERE organization IS NULL;

DROP TABLE IF EXISTS first_sender;
CREATE TEMPORARY TABLE IF NOT EXISTS first_sender AS
(
SELECT
	min(id),
	type,
	organization
FROM 
	faers.sender
GROUP BY 
	type,organization
);

DROP TABLE IF EXISTS sender_id_min;
CREATE TEMPORARY TABLE IF NOT EXISTS sender_id_min AS
(
SELECT 
	s.id,
	fs.min
FROM
	faers.sender s
INNER JOIN
	first_sender fs
ON
	s.type = fs.type
	AND
	s.organization = fs.organization 
);

ALTER TABLE faers.event_result SET(FILLFACTOR = 70);

DROP INDEX IF EXISTS IX_sender_id_min_id;
CREATE INDEX IX_sender_id_min_id ON sender_id_min(id);

UPDATE
	faers.event_result er
SET
	sender_id = (SELECT min FROM sender_id_min sim WHERE er.sender_id = sim.id)
WHERE 
	sender_id IS NOT NULL;

DROP INDEX IF EXISTS faers.IX_event_result_sender_id;
CREATE INDEX IX_event_result_sender_id ON faers.event_result(sender_id);

DROP INDEX faers.IX_sender_id;

DELETE FROM faers.sender WHERE id NOT IN(SELECT sender_id FROM faers.event_result WHERE sender_id IS NOT NULL);
CREATE INDEX IX_sender_id ON faers.sender(id);
VACUUM FULL faers.sender;