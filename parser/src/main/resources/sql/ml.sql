-- `with xx as ()` 是SQL的语法。
--把MODEL换成TABLE就是标准的SQL，该SQL来自：https://cloud.google.com/bigquery-ml/docs/kmeans-tutorial?hl=zh-cn
CREATE OR REPLACE MODEL
  BQML_TUTORIAL.LONDON_STATION_CLUSTERS OPTIONS(MODEL_TYPE='KMEANS',
    NUM_CLUSTERS=4) AS
WITH
  HS AS (
  SELECT
    H.START_STATION_NAME AS STATION_NAME,
  IF
    (EXTRACT(DAYOFWEEK
      FROM
        H.START_DATE) = 1
      OR EXTRACT(DAYOFWEEK
      FROM
        H.START_DATE) = 7,
      "WEEKEND",
      "WEEKDAY") AS ISWEEKDAY,
    H.DURATION,
    ST_DISTANCE(ST_GEOGPOINT(S.LONGITUDE,
        S.LATITUDE),
      ST_GEOGPOINT(-0.1,
        51.5))/1000 AS DISTANCE_FROM_CITY_CENTER
  FROM
    `BIGQUERY-PUBLIC-DATA.LONDON_BICYCLES.CYCLE_HIRE` AS H
  JOIN
    `BIGQUERY-PUBLIC-DATA.LONDON_BICYCLES.CYCLE_STATIONS` AS S
  ON
    H.START_STATION_ID = S.ID
  WHERE
    H.START_DATE BETWEEN CAST('2015-01-01 00:00:00' AS TIMESTAMP)
    AND CAST('2016-01-01 00:00:00' AS TIMESTAMP) ),
  STATIONSTATS AS (
  SELECT
    STATION_NAME,
    ISWEEKDAY,
    AVG(DURATION) AS DURATION,
    COUNT(DURATION) AS NUM_TRIPS,
    MAX(DISTANCE_FROM_CITY_CENTER) AS DISTANCE_FROM_CITY_CENTER
  FROM
    HS
  GROUP BY
    STATION_NAME, ISWEEKDAY)
SELECT
    * EXCEPT(STATION_NAME, ISWEEKDAY)
FROM
  STATIONSTATS