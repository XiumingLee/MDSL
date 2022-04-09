SELECT 'name' AS `n`, 'age' AS `a`
FROM T1;

SELECT 'name' AS `n`, 'age' AS `a`
FROM T1
         LEFT JOIN T2 ON `T1.name` = `T2.name` AND `T1.name` = `T2.name`
WHERE `T1.name` = '小明';



SELECT 'name' AS `n`, 'age' AS `a`
FROM T1
         LEFT JOIN T2 ON `T1.name` = `T2.name` AND `T1.name` = `T2.name`
WHERE `T1.name` = '小明';


SELECT NAME AS N, AGE AS A_J
FROM TABLE1 AS T1
         LEFT JOIN TABLE2 AS T2 ON T1.NAME = T2.NAME;


--- Flink创建Table的方式。
--- TODO: 1、需要在标准SQL中添加WITH (key1=val1, key2=val2, ...)的支持 `createTableClauses`
--- TODO: 2、当某些字段需要特殊处理时，可能需要添加而外的信息，具体查看:https://nightlies.apache.org/flink/flink-docs-release-1.14/docs/dev/table/sql/create/#create-table
CREATE TABLE MyTable (
    `user_id` BIGINT,
    `name` STRING,
    `record_time` TIMESTAMP_LTZ(3) METADATA FROM 'timestamp'    -- reads and writes a Kafka record's timestamp
) WITH (
      'connector' = 'kafka'
      );


CREATE TABLE MYTABLE (
                         `USER_ID` BIGINT,
                         `NAME` STRING,
                         `RECORD_TIME` TIMESTAMP_LTZ(3)
) WITH (
      'CONNECTOR' = 'KAFKA'
      );


