## MDSL
打造一套特定的类SQL语言，通过Antlr解析，自定义生成特定的分析代码（Flink/Spark/.....）。



## 步骤

```shell
### 1、使用什么解释器
use interpreter spark;

### 2、创建数据源
creat table table_name (
	xxx int,
	xxx string,
) with (
	'connector' = 'hive',
	xxx = xxx
);

### 3、特征工程
[insert int table_name_b]
select xxxx,COUNT(*) as bbb from table_name_a where xxx = xxx;

### 4、创建模型
create or replace model model_name 
options(xxx=xxx) as ....;

### 5、使用模型
[insert int table_name_c]
select xxxx from ML.PREDICT(MODEL `model_name`,xxxxxsql);

### 6、保存数据
INSERT { INTO | OVERWRITE } [catalog_name.][db_name.]table_name [PARTITION part_spec] [column_list] select_statement
part_spec:
  (part_col_name1=val1 [, part_col_name2=val2, ...])
column_list:
  (col_name1 [, column_name2, ...])
```




## 参考

- [Apache Flink Table SQL](https://nightlies.apache.org/flink/flink-docs-release-1.14/docs/dev/table/overview/)
- [BigQuery ML 文档  | Google Cloud](https://cloud.google.com/bigquery-ml/docs?hl=zh-cn)
- [什么是 BigQuery ML？(中文)  | Google Cloud](https://cloud.google.com/bigquery-ml/docs/introduction?hl=zh-cn)
- [spark/SqlBaseParser.g4  apache/spark (github.com)](https://github.com/apache/spark/blob/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser/SqlBaseParser.g4)
- [spark/SqlBaseLexer.g4  apache/spark (github.com)](https://github.com/apache/spark/blob/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser/SqlBaseLexer.g4)
