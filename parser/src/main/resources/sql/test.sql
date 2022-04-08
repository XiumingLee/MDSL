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
