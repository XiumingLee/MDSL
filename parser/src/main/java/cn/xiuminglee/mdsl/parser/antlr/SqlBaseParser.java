// Generated from /Users/xiuming/me/code/MyGithub/MDSL/parser/src/main/resources/antlr/SqlBaseParser.g4 by ANTLR 4.9.2
package cn.xiuminglee.mdsl.parser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SEMICOLON=1, LEFT_PAREN=2, RIGHT_PAREN=3, COMMA=4, DOT=5, LEFT_BRACKET=6, 
		RIGHT_BRACKET=7, ADD=8, AFTER=9, ALL=10, ALTER=11, ANALYZE=12, AND=13, 
		ANTI=14, ANY=15, ARCHIVE=16, ARRAY=17, AS=18, ASC=19, AT=20, AUTHORIZATION=21, 
		BETWEEN=22, BOTH=23, BUCKET=24, BUCKETS=25, BY=26, CACHE=27, CASCADE=28, 
		CASE=29, CAST=30, CATALOG=31, CATALOGS=32, CHANGE=33, CHECK=34, CLEAR=35, 
		CLUSTER=36, CLUSTERED=37, CODEGEN=38, COLLATE=39, COLLECTION=40, COLUMN=41, 
		COLUMNS=42, COMMENT=43, COMMIT=44, COMPACT=45, COMPACTIONS=46, COMPUTE=47, 
		CONCATENATE=48, CONSTRAINT=49, COST=50, CREATE=51, CROSS=52, CUBE=53, 
		CURRENT=54, CURRENT_DATE=55, CURRENT_TIME=56, CURRENT_TIMESTAMP=57, CURRENT_USER=58, 
		DAY=59, DAYOFYEAR=60, DATA=61, DATABASE=62, DATABASES=63, DATEADD=64, 
		DATEDIFF=65, DBPROPERTIES=66, DEFAULT=67, DEFINED=68, DELETE=69, DELIMITED=70, 
		DESC=71, DESCRIBE=72, DFS=73, DIRECTORIES=74, DIRECTORY=75, DISTINCT=76, 
		DISTRIBUTE=77, DIV=78, DROP=79, ELSE=80, END=81, ESCAPE=82, ESCAPED=83, 
		EXCEPT=84, EXCHANGE=85, EXISTS=86, EXPLAIN=87, EXPORT=88, EXTENDED=89, 
		EXTERNAL=90, EXTRACT=91, FALSE=92, FETCH=93, FIELDS=94, FILTER=95, FILEFORMAT=96, 
		FIRST=97, FOLLOWING=98, FOR=99, FOREIGN=100, FORMAT=101, FORMATTED=102, 
		FROM=103, FULL=104, FUNCTION=105, FUNCTIONS=106, GLOBAL=107, GRANT=108, 
		GROUP=109, GROUPING=110, HAVING=111, HOUR=112, IF=113, IGNORE=114, IMPORT=115, 
		IN=116, INDEX=117, INDEXES=118, INNER=119, INPATH=120, INPUTFORMAT=121, 
		INSERT=122, INTERSECT=123, INTERVAL=124, INTO=125, IS=126, ITEMS=127, 
		JOIN=128, KEYS=129, LAST=130, LATERAL=131, LAZY=132, LEADING=133, LEFT=134, 
		LIKE=135, ILIKE=136, LIMIT=137, LINES=138, LIST=139, LOAD=140, LOCAL=141, 
		LOCATION=142, LOCK=143, LOCKS=144, LOGICAL=145, MACRO=146, MAP=147, MATCHED=148, 
		MERGE=149, MICROSECOND=150, MILLISECOND=151, MINUTE=152, MONTH=153, MSCK=154, 
		NAMESPACE=155, NAMESPACES=156, NATURAL=157, NO=158, NOT=159, NULL=160, 
		NULLS=161, OF=162, ON=163, ONLY=164, OPTION=165, OPTIONS=166, OR=167, 
		ORDER=168, OUT=169, OUTER=170, OUTPUTFORMAT=171, OVER=172, OVERLAPS=173, 
		OVERLAY=174, OVERWRITE=175, PARTITION=176, PARTITIONED=177, PARTITIONS=178, 
		PERCENTILE_CONT=179, PERCENTLIT=180, PIVOT=181, PLACING=182, POSITION=183, 
		PRECEDING=184, PRIMARY=185, PRINCIPALS=186, PROPERTIES=187, PURGE=188, 
		QUARTER=189, QUERY=190, RANGE=191, RECORDREADER=192, RECORDWRITER=193, 
		RECOVER=194, REDUCE=195, REFERENCES=196, REFRESH=197, RENAME=198, REPAIR=199, 
		REPEATABLE=200, REPLACE=201, RESET=202, RESPECT=203, RESTRICT=204, REVOKE=205, 
		RIGHT=206, RLIKE=207, ROLE=208, ROLES=209, ROLLBACK=210, ROLLUP=211, ROW=212, 
		ROWS=213, SECOND=214, SCHEMA=215, SCHEMAS=216, SELECT=217, SEMI=218, SEPARATED=219, 
		SERDE=220, SERDEPROPERTIES=221, SESSION_USER=222, SET=223, SETMINUS=224, 
		SETS=225, SHOW=226, SKEWED=227, SOME=228, SORT=229, SORTED=230, START=231, 
		STATISTICS=232, STORED=233, STRATIFY=234, STRUCT=235, SUBSTR=236, SUBSTRING=237, 
		SYNC=238, SYSTEM_TIME=239, SYSTEM_VERSION=240, TABLE=241, TABLES=242, 
		TABLESAMPLE=243, TBLPROPERTIES=244, TEMPORARY=245, TERMINATED=246, THEN=247, 
		TIME=248, TIMESTAMP=249, TIMESTAMPADD=250, TIMESTAMPDIFF=251, TO=252, 
		TOUCH=253, TRAILING=254, TRANSACTION=255, TRANSACTIONS=256, TRANSFORM=257, 
		TRIM=258, TRUE=259, TRUNCATE=260, TRY_CAST=261, TYPE=262, UNARCHIVE=263, 
		UNBOUNDED=264, UNCACHE=265, UNION=266, UNIQUE=267, UNKNOWN=268, UNLOCK=269, 
		UNSET=270, UPDATE=271, USE=272, USER=273, USING=274, VALUES=275, VERSION=276, 
		VIEW=277, VIEWS=278, WEEK=279, WHEN=280, WHERE=281, WINDOW=282, WITH=283, 
		WITHIN=284, YEAR=285, ZONE=286, EQ=287, NSEQ=288, NEQ=289, NEQJ=290, LT=291, 
		LTE=292, GT=293, GTE=294, PLUS=295, MINUS=296, ASTERISK=297, SLASH=298, 
		PERCENT=299, TILDE=300, AMPERSAND=301, PIPE=302, CONCAT_PIPE=303, HAT=304, 
		COLON=305, ARROW=306, HENT_START=307, HENT_END=308, STRING=309, BIGINT_LITERAL=310, 
		SMALLINT_LITERAL=311, TINYINT_LITERAL=312, INTEGER_VALUE=313, EXPONENT_VALUE=314, 
		DECIMAL_VALUE=315, FLOAT_LITERAL=316, DOUBLE_LITERAL=317, BIGDECIMAL_LITERAL=318, 
		IDENTIFIER=319, BACKQUOTED_IDENTIFIER=320, SIMPLE_COMMENT=321, BRACKETED_COMMENT=322, 
		WS=323, UNRECOGNIZED=324;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_singleTableIdentifier = 2, 
		RULE_singleMultipartIdentifier = 3, RULE_singleFunctionIdentifier = 4, 
		RULE_singleDataType = 5, RULE_singleTableSchema = 6, RULE_statement = 7, 
		RULE_configKey = 8, RULE_configValue = 9, RULE_unsupportedHiveNativeCommands = 10, 
		RULE_createTableHeader = 11, RULE_replaceTableHeader = 12, RULE_bucketSpec = 13, 
		RULE_skewSpec = 14, RULE_locationSpec = 15, RULE_commentSpec = 16, RULE_query = 17, 
		RULE_insertInto = 18, RULE_partitionSpecLocation = 19, RULE_partitionSpec = 20, 
		RULE_partitionVal = 21, RULE_namespace = 22, RULE_namespaces = 23, RULE_describeFuncName = 24, 
		RULE_describeColName = 25, RULE_ctes = 26, RULE_namedQuery = 27, RULE_tableProvider = 28, 
		RULE_createTableClauses = 29, RULE_propertyList = 30, RULE_property = 31, 
		RULE_propertyKey = 32, RULE_propertyValue = 33, RULE_constantList = 34, 
		RULE_nestedConstantList = 35, RULE_createFileFormat = 36, RULE_fileFormat = 37, 
		RULE_storageHandler = 38, RULE_resource = 39, RULE_dmlStatementNoWith = 40, 
		RULE_queryOrganization = 41, RULE_multiInsertQueryBody = 42, RULE_queryTerm = 43, 
		RULE_queryPrimary = 44, RULE_sortItem = 45, RULE_fromStatement = 46, RULE_fromStatementBody = 47, 
		RULE_querySpecification = 48, RULE_transformClause = 49, RULE_selectClause = 50, 
		RULE_setClause = 51, RULE_matchedClause = 52, RULE_notMatchedClause = 53, 
		RULE_matchedAction = 54, RULE_notMatchedAction = 55, RULE_assignmentList = 56, 
		RULE_assignment = 57, RULE_whereClause = 58, RULE_havingClause = 59, RULE_hint = 60, 
		RULE_hintStatement = 61, RULE_fromClause = 62, RULE_temporalClause = 63, 
		RULE_aggregationClause = 64, RULE_groupByClause = 65, RULE_groupingAnalytics = 66, 
		RULE_groupingElement = 67, RULE_groupingSet = 68, RULE_pivotClause = 69, 
		RULE_pivotColumn = 70, RULE_pivotValue = 71, RULE_lateralView = 72, RULE_setQuantifier = 73, 
		RULE_relation = 74, RULE_joinRelation = 75, RULE_joinType = 76, RULE_joinCriteria = 77, 
		RULE_sample = 78, RULE_sampleMethod = 79, RULE_identifierList = 80, RULE_identifierSeq = 81, 
		RULE_orderedIdentifierList = 82, RULE_orderedIdentifier = 83, RULE_identifierCommentList = 84, 
		RULE_identifierComment = 85, RULE_relationPrimary = 86, RULE_inlineTable = 87, 
		RULE_functionTable = 88, RULE_tableAlias = 89, RULE_rowFormat = 90, RULE_multipartIdentifierList = 91, 
		RULE_multipartIdentifier = 92, RULE_multipartIdentifierPropertyList = 93, 
		RULE_multipartIdentifierProperty = 94, RULE_tableIdentifier = 95, RULE_functionIdentifier = 96, 
		RULE_namedExpression = 97, RULE_namedExpressionSeq = 98, RULE_partitionFieldList = 99, 
		RULE_partitionField = 100, RULE_transform = 101, RULE_transformArgument = 102, 
		RULE_expression = 103, RULE_expressionSeq = 104, RULE_booleanExpression = 105, 
		RULE_predicate = 106, RULE_valueExpression = 107, RULE_datetimeUnit = 108, 
		RULE_primaryExpression = 109, RULE_constant = 110, RULE_comparisonOperator = 111, 
		RULE_arithmeticOperator = 112, RULE_predicateOperator = 113, RULE_booleanValue = 114, 
		RULE_interval = 115, RULE_errorCapturingMultiUnitsInterval = 116, RULE_multiUnitsInterval = 117, 
		RULE_errorCapturingUnitToUnitInterval = 118, RULE_unitToUnitInterval = 119, 
		RULE_intervalValue = 120, RULE_colPosition = 121, RULE_dataType = 122, 
		RULE_qualifiedColTypeWithPositionList = 123, RULE_qualifiedColTypeWithPosition = 124, 
		RULE_defaultExpression = 125, RULE_colTypeList = 126, RULE_colType = 127, 
		RULE_createOrReplaceTableColTypeList = 128, RULE_createOrReplaceTableColType = 129, 
		RULE_complexColTypeList = 130, RULE_complexColType = 131, RULE_whenClause = 132, 
		RULE_windowClause = 133, RULE_namedWindow = 134, RULE_windowSpec = 135, 
		RULE_windowFrame = 136, RULE_frameBound = 137, RULE_qualifiedNameList = 138, 
		RULE_functionName = 139, RULE_qualifiedName = 140, RULE_errorCapturingIdentifier = 141, 
		RULE_errorCapturingIdentifierExtra = 142, RULE_identifier = 143, RULE_strictIdentifier = 144, 
		RULE_quotedIdentifier = 145, RULE_number = 146, RULE_alterColumnAction = 147, 
		RULE_ansiNonReserved = 148, RULE_strictNonReserved = 149, RULE_nonReserved = 150;
	private static String[] makeRuleNames() {
		return new String[] {
			"singleStatement", "singleExpression", "singleTableIdentifier", "singleMultipartIdentifier", 
			"singleFunctionIdentifier", "singleDataType", "singleTableSchema", "statement", 
			"configKey", "configValue", "unsupportedHiveNativeCommands", "createTableHeader", 
			"replaceTableHeader", "bucketSpec", "skewSpec", "locationSpec", "commentSpec", 
			"query", "insertInto", "partitionSpecLocation", "partitionSpec", "partitionVal", 
			"namespace", "namespaces", "describeFuncName", "describeColName", "ctes", 
			"namedQuery", "tableProvider", "createTableClauses", "propertyList", 
			"property", "propertyKey", "propertyValue", "constantList", "nestedConstantList", 
			"createFileFormat", "fileFormat", "storageHandler", "resource", "dmlStatementNoWith", 
			"queryOrganization", "multiInsertQueryBody", "queryTerm", "queryPrimary", 
			"sortItem", "fromStatement", "fromStatementBody", "querySpecification", 
			"transformClause", "selectClause", "setClause", "matchedClause", "notMatchedClause", 
			"matchedAction", "notMatchedAction", "assignmentList", "assignment", 
			"whereClause", "havingClause", "hint", "hintStatement", "fromClause", 
			"temporalClause", "aggregationClause", "groupByClause", "groupingAnalytics", 
			"groupingElement", "groupingSet", "pivotClause", "pivotColumn", "pivotValue", 
			"lateralView", "setQuantifier", "relation", "joinRelation", "joinType", 
			"joinCriteria", "sample", "sampleMethod", "identifierList", "identifierSeq", 
			"orderedIdentifierList", "orderedIdentifier", "identifierCommentList", 
			"identifierComment", "relationPrimary", "inlineTable", "functionTable", 
			"tableAlias", "rowFormat", "multipartIdentifierList", "multipartIdentifier", 
			"multipartIdentifierPropertyList", "multipartIdentifierProperty", "tableIdentifier", 
			"functionIdentifier", "namedExpression", "namedExpressionSeq", "partitionFieldList", 
			"partitionField", "transform", "transformArgument", "expression", "expressionSeq", 
			"booleanExpression", "predicate", "valueExpression", "datetimeUnit", 
			"primaryExpression", "constant", "comparisonOperator", "arithmeticOperator", 
			"predicateOperator", "booleanValue", "interval", "errorCapturingMultiUnitsInterval", 
			"multiUnitsInterval", "errorCapturingUnitToUnitInterval", "unitToUnitInterval", 
			"intervalValue", "colPosition", "dataType", "qualifiedColTypeWithPositionList", 
			"qualifiedColTypeWithPosition", "defaultExpression", "colTypeList", "colType", 
			"createOrReplaceTableColTypeList", "createOrReplaceTableColType", "complexColTypeList", 
			"complexColType", "whenClause", "windowClause", "namedWindow", "windowSpec", 
			"windowFrame", "frameBound", "qualifiedNameList", "functionName", "qualifiedName", 
			"errorCapturingIdentifier", "errorCapturingIdentifierExtra", "identifier", 
			"strictIdentifier", "quotedIdentifier", "number", "alterColumnAction", 
			"ansiNonReserved", "strictNonReserved", "nonReserved"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "'('", "')'", "','", "'.'", "'['", "']'", "'ADD'", "'AFTER'", 
			"'ALL'", "'ALTER'", "'ANALYZE'", "'AND'", "'ANTI'", "'ANY'", "'ARCHIVE'", 
			"'ARRAY'", "'AS'", "'ASC'", "'AT'", "'AUTHORIZATION'", "'BETWEEN'", "'BOTH'", 
			"'BUCKET'", "'BUCKETS'", "'BY'", "'CACHE'", "'CASCADE'", "'CASE'", "'CAST'", 
			"'CATALOG'", "'CATALOGS'", "'CHANGE'", "'CHECK'", "'CLEAR'", "'CLUSTER'", 
			"'CLUSTERED'", "'CODEGEN'", "'COLLATE'", "'COLLECTION'", "'COLUMN'", 
			"'COLUMNS'", "'COMMENT'", "'COMMIT'", "'COMPACT'", "'COMPACTIONS'", "'COMPUTE'", 
			"'CONCATENATE'", "'CONSTRAINT'", "'COST'", "'CREATE'", "'CROSS'", "'CUBE'", 
			"'CURRENT'", "'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", 
			"'CURRENT_USER'", "'DAY'", "'DAYOFYEAR'", "'DATA'", "'DATABASE'", "'DATABASES'", 
			"'DATEADD'", "'DATEDIFF'", "'DBPROPERTIES'", "'DEFAULT'", "'DEFINED'", 
			"'DELETE'", "'DELIMITED'", "'DESC'", "'DESCRIBE'", "'DFS'", "'DIRECTORIES'", 
			"'DIRECTORY'", "'DISTINCT'", "'DISTRIBUTE'", "'DIV'", "'DROP'", "'ELSE'", 
			"'END'", "'ESCAPE'", "'ESCAPED'", "'EXCEPT'", "'EXCHANGE'", "'EXISTS'", 
			"'EXPLAIN'", "'EXPORT'", "'EXTENDED'", "'EXTERNAL'", "'EXTRACT'", "'FALSE'", 
			"'FETCH'", "'FIELDS'", "'FILTER'", "'FILEFORMAT'", "'FIRST'", "'FOLLOWING'", 
			"'FOR'", "'FOREIGN'", "'FORMAT'", "'FORMATTED'", "'FROM'", "'FULL'", 
			"'FUNCTION'", "'FUNCTIONS'", "'GLOBAL'", "'GRANT'", "'GROUP'", "'GROUPING'", 
			"'HAVING'", "'HOUR'", "'IF'", "'IGNORE'", "'IMPORT'", "'IN'", "'INDEX'", 
			"'INDEXES'", "'INNER'", "'INPATH'", "'INPUTFORMAT'", "'INSERT'", "'INTERSECT'", 
			"'INTERVAL'", "'INTO'", "'IS'", "'ITEMS'", "'JOIN'", "'KEYS'", "'LAST'", 
			"'LATERAL'", "'LAZY'", "'LEADING'", "'LEFT'", "'LIKE'", "'ILIKE'", "'LIMIT'", 
			"'LINES'", "'LIST'", "'LOAD'", "'LOCAL'", "'LOCATION'", "'LOCK'", "'LOCKS'", 
			"'LOGICAL'", "'MACRO'", "'MAP'", "'MATCHED'", "'MERGE'", "'MICROSECOND'", 
			"'MILLISECOND'", "'MINUTE'", "'MONTH'", "'MSCK'", "'NAMESPACE'", "'NAMESPACES'", 
			"'NATURAL'", "'NO'", null, "'NULL'", "'NULLS'", "'OF'", "'ON'", "'ONLY'", 
			"'OPTION'", "'OPTIONS'", "'OR'", "'ORDER'", "'OUT'", "'OUTER'", "'OUTPUTFORMAT'", 
			"'OVER'", "'OVERLAPS'", "'OVERLAY'", "'OVERWRITE'", "'PARTITION'", "'PARTITIONED'", 
			"'PARTITIONS'", "'PERCENTILE_CONT'", "'PERCENT'", "'PIVOT'", "'PLACING'", 
			"'POSITION'", "'PRECEDING'", "'PRIMARY'", "'PRINCIPALS'", "'PROPERTIES'", 
			"'PURGE'", "'QUARTER'", "'QUERY'", "'RANGE'", "'RECORDREADER'", "'RECORDWRITER'", 
			"'RECOVER'", "'REDUCE'", "'REFERENCES'", "'REFRESH'", "'RENAME'", "'REPAIR'", 
			"'REPEATABLE'", "'REPLACE'", "'RESET'", "'RESPECT'", "'RESTRICT'", "'REVOKE'", 
			"'RIGHT'", null, "'ROLE'", "'ROLES'", "'ROLLBACK'", "'ROLLUP'", "'ROW'", 
			"'ROWS'", "'SECOND'", "'SCHEMA'", "'SCHEMAS'", "'SELECT'", "'SEMI'", 
			"'SEPARATED'", "'SERDE'", "'SERDEPROPERTIES'", "'SESSION_USER'", "'SET'", 
			"'MINUS'", "'SETS'", "'SHOW'", "'SKEWED'", "'SOME'", "'SORT'", "'SORTED'", 
			"'START'", "'STATISTICS'", "'STORED'", "'STRATIFY'", "'STRUCT'", "'SUBSTR'", 
			"'SUBSTRING'", "'SYNC'", "'SYSTEM_TIME'", "'SYSTEM_VERSION'", "'TABLE'", 
			"'TABLES'", "'TABLESAMPLE'", "'TBLPROPERTIES'", null, "'TERMINATED'", 
			"'THEN'", "'TIME'", "'TIMESTAMP'", "'TIMESTAMPADD'", "'TIMESTAMPDIFF'", 
			"'TO'", "'TOUCH'", "'TRAILING'", "'TRANSACTION'", "'TRANSACTIONS'", "'TRANSFORM'", 
			"'TRIM'", "'TRUE'", "'TRUNCATE'", "'TRY_CAST'", "'TYPE'", "'UNARCHIVE'", 
			"'UNBOUNDED'", "'UNCACHE'", "'UNION'", "'UNIQUE'", "'UNKNOWN'", "'UNLOCK'", 
			"'UNSET'", "'UPDATE'", "'USE'", "'USER'", "'USING'", "'VALUES'", "'VERSION'", 
			"'VIEW'", "'VIEWS'", "'WEEK'", "'WHEN'", "'WHERE'", "'WINDOW'", "'WITH'", 
			"'WITHIN'", "'YEAR'", "'ZONE'", null, "'<=>'", "'<>'", "'!='", "'<'", 
			null, "'>'", null, "'+'", "'-'", "'*'", "'/'", "'%'", "'~'", "'&'", "'|'", 
			"'||'", "'^'", "':'", "'->'", "'/*+'", "'*/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SEMICOLON", "LEFT_PAREN", "RIGHT_PAREN", "COMMA", "DOT", "LEFT_BRACKET", 
			"RIGHT_BRACKET", "ADD", "AFTER", "ALL", "ALTER", "ANALYZE", "AND", "ANTI", 
			"ANY", "ARCHIVE", "ARRAY", "AS", "ASC", "AT", "AUTHORIZATION", "BETWEEN", 
			"BOTH", "BUCKET", "BUCKETS", "BY", "CACHE", "CASCADE", "CASE", "CAST", 
			"CATALOG", "CATALOGS", "CHANGE", "CHECK", "CLEAR", "CLUSTER", "CLUSTERED", 
			"CODEGEN", "COLLATE", "COLLECTION", "COLUMN", "COLUMNS", "COMMENT", "COMMIT", 
			"COMPACT", "COMPACTIONS", "COMPUTE", "CONCATENATE", "CONSTRAINT", "COST", 
			"CREATE", "CROSS", "CUBE", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", 
			"CURRENT_TIMESTAMP", "CURRENT_USER", "DAY", "DAYOFYEAR", "DATA", "DATABASE", 
			"DATABASES", "DATEADD", "DATEDIFF", "DBPROPERTIES", "DEFAULT", "DEFINED", 
			"DELETE", "DELIMITED", "DESC", "DESCRIBE", "DFS", "DIRECTORIES", "DIRECTORY", 
			"DISTINCT", "DISTRIBUTE", "DIV", "DROP", "ELSE", "END", "ESCAPE", "ESCAPED", 
			"EXCEPT", "EXCHANGE", "EXISTS", "EXPLAIN", "EXPORT", "EXTENDED", "EXTERNAL", 
			"EXTRACT", "FALSE", "FETCH", "FIELDS", "FILTER", "FILEFORMAT", "FIRST", 
			"FOLLOWING", "FOR", "FOREIGN", "FORMAT", "FORMATTED", "FROM", "FULL", 
			"FUNCTION", "FUNCTIONS", "GLOBAL", "GRANT", "GROUP", "GROUPING", "HAVING", 
			"HOUR", "IF", "IGNORE", "IMPORT", "IN", "INDEX", "INDEXES", "INNER", 
			"INPATH", "INPUTFORMAT", "INSERT", "INTERSECT", "INTERVAL", "INTO", "IS", 
			"ITEMS", "JOIN", "KEYS", "LAST", "LATERAL", "LAZY", "LEADING", "LEFT", 
			"LIKE", "ILIKE", "LIMIT", "LINES", "LIST", "LOAD", "LOCAL", "LOCATION", 
			"LOCK", "LOCKS", "LOGICAL", "MACRO", "MAP", "MATCHED", "MERGE", "MICROSECOND", 
			"MILLISECOND", "MINUTE", "MONTH", "MSCK", "NAMESPACE", "NAMESPACES", 
			"NATURAL", "NO", "NOT", "NULL", "NULLS", "OF", "ON", "ONLY", "OPTION", 
			"OPTIONS", "OR", "ORDER", "OUT", "OUTER", "OUTPUTFORMAT", "OVER", "OVERLAPS", 
			"OVERLAY", "OVERWRITE", "PARTITION", "PARTITIONED", "PARTITIONS", "PERCENTILE_CONT", 
			"PERCENTLIT", "PIVOT", "PLACING", "POSITION", "PRECEDING", "PRIMARY", 
			"PRINCIPALS", "PROPERTIES", "PURGE", "QUARTER", "QUERY", "RANGE", "RECORDREADER", 
			"RECORDWRITER", "RECOVER", "REDUCE", "REFERENCES", "REFRESH", "RENAME", 
			"REPAIR", "REPEATABLE", "REPLACE", "RESET", "RESPECT", "RESTRICT", "REVOKE", 
			"RIGHT", "RLIKE", "ROLE", "ROLES", "ROLLBACK", "ROLLUP", "ROW", "ROWS", 
			"SECOND", "SCHEMA", "SCHEMAS", "SELECT", "SEMI", "SEPARATED", "SERDE", 
			"SERDEPROPERTIES", "SESSION_USER", "SET", "SETMINUS", "SETS", "SHOW", 
			"SKEWED", "SOME", "SORT", "SORTED", "START", "STATISTICS", "STORED", 
			"STRATIFY", "STRUCT", "SUBSTR", "SUBSTRING", "SYNC", "SYSTEM_TIME", "SYSTEM_VERSION", 
			"TABLE", "TABLES", "TABLESAMPLE", "TBLPROPERTIES", "TEMPORARY", "TERMINATED", 
			"THEN", "TIME", "TIMESTAMP", "TIMESTAMPADD", "TIMESTAMPDIFF", "TO", "TOUCH", 
			"TRAILING", "TRANSACTION", "TRANSACTIONS", "TRANSFORM", "TRIM", "TRUE", 
			"TRUNCATE", "TRY_CAST", "TYPE", "UNARCHIVE", "UNBOUNDED", "UNCACHE", 
			"UNION", "UNIQUE", "UNKNOWN", "UNLOCK", "UNSET", "UPDATE", "USE", "USER", 
			"USING", "VALUES", "VERSION", "VIEW", "VIEWS", "WEEK", "WHEN", "WHERE", 
			"WINDOW", "WITH", "WITHIN", "YEAR", "ZONE", "EQ", "NSEQ", "NEQ", "NEQJ", 
			"LT", "LTE", "GT", "GTE", "PLUS", "MINUS", "ASTERISK", "SLASH", "PERCENT", 
			"TILDE", "AMPERSAND", "PIPE", "CONCAT_PIPE", "HAT", "COLON", "ARROW", 
			"HENT_START", "HENT_END", "STRING", "BIGINT_LITERAL", "SMALLINT_LITERAL", 
			"TINYINT_LITERAL", "INTEGER_VALUE", "EXPONENT_VALUE", "DECIMAL_VALUE", 
			"FLOAT_LITERAL", "DOUBLE_LITERAL", "BIGDECIMAL_LITERAL", "IDENTIFIER", 
			"BACKQUOTED_IDENTIFIER", "SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", 
			"UNRECOGNIZED"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBaseParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	  /**
	   * When false, INTERSECT is given the greater precedence over the other set
	   * operations (UNION, EXCEPT and MINUS) as per the SQL standard.
	   */
	  public boolean legacy_setops_precedence_enabled = false;

	  /**
	   * When false, a literal with an exponent would be converted into
	   * double type rather than decimal type.
	   */
	  public boolean legacy_exponent_literal_as_decimal_enabled = false;

	  /**
	   * When true, the behavior of keywords follows ANSI SQL standard.
	   */
	  public boolean SQL_standard_keyword_behavior = false;

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public List<TerminalNode> SEMICOLON() { return getTokens(SqlBaseParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(SqlBaseParser.SEMICOLON, i);
		}
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(302);
			statement();
			setState(306);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(303);
				match(SEMICOLON);
				}
				}
				setState(308);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(309);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public NamedExpressionContext namedExpression() {
			return getRuleContext(NamedExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
			namedExpression();
			setState(312);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableIdentifierContext extends ParserRuleContext {
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableIdentifierContext singleTableIdentifier() throws RecognitionException {
		SingleTableIdentifierContext _localctx = new SingleTableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleTableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(314);
			tableIdentifier();
			setState(315);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleMultipartIdentifierContext extends ParserRuleContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleMultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleMultipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleMultipartIdentifierContext singleMultipartIdentifier() throws RecognitionException {
		SingleMultipartIdentifierContext _localctx = new SingleMultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_singleMultipartIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(317);
			multipartIdentifier();
			setState(318);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleFunctionIdentifierContext extends ParserRuleContext {
		public FunctionIdentifierContext functionIdentifier() {
			return getRuleContext(FunctionIdentifierContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleFunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleFunctionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleFunctionIdentifierContext singleFunctionIdentifier() throws RecognitionException {
		SingleFunctionIdentifierContext _localctx = new SingleFunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleFunctionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(320);
			functionIdentifier();
			setState(321);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleDataTypeContext extends ParserRuleContext {
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleDataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDataTypeContext singleDataType() throws RecognitionException {
		SingleDataTypeContext _localctx = new SingleDataTypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_singleDataType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			dataType();
			setState(324);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleTableSchemaContext extends ParserRuleContext {
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleTableSchemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleTableSchema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleTableSchema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleTableSchema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleTableSchema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleTableSchemaContext singleTableSchema() throws RecognitionException {
		SingleTableSchemaContext _localctx = new SingleTableSchemaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_singleTableSchema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(326);
			colTypeList();
			setState(327);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ResetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitResetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterViewQueryContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public AlterViewQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterViewQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterViewQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAlterViewQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropNamespaceContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public DropNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTempViewUsingContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateTempViewUsingContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTempViewUsing(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTempViewUsing(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTempViewUsing(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public MultipartIdentifierContext from;
		public MultipartIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FailNativeCommandContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() {
			return getRuleContext(UnsupportedHiveNativeCommandsContext.class,0);
		}
		public FailNativeCommandContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFailNativeCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFailNativeCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFailNativeCommand(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetCatalogContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public SetCatalogContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetCatalog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetCatalog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetCatalog(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ClearCacheContext extends StatementContext {
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public ClearCacheContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterClearCache(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitClearCache(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitClearCache(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RecoverPartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public RecoverPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRecoverPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRecoverPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRecoverPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropIndexContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public DropIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCurrentNamespaceContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public ShowCurrentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCurrentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCurrentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowCurrentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTablePartitionContext extends StatementContext {
		public PartitionSpecContext from;
		public PartitionSpecContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public RenameTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRenameTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepairTableContext extends StatementContext {
		public Token option;
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public RepairTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRepairTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRepairTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRepairTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshResourceContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public RefreshResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRefreshResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowNamespacesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public NamespacesContext namespaces() {
			return getRuleContext(NamespacesContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowNamespacesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext ns;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public List<TerminalNode> FROM() { return getTokens(SqlBaseParser.FROM); }
		public TerminalNode FROM(int i) {
			return getToken(SqlBaseParser.FROM, i);
		}
		public List<TerminalNode> IN() { return getTokens(SqlBaseParser.IN); }
		public TerminalNode IN(int i) {
			return getToken(SqlBaseParser.IN, i);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReplaceTableContext extends StatementContext {
		public ReplaceTableHeaderContext replaceTableHeader() {
			return getRuleContext(ReplaceTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ReplaceTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterReplaceTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitReplaceTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitReplaceTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeTablesContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public AnalyzeTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnalyzeTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnalyzeTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAnalyzeTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTablePartitionContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<PartitionSpecLocationContext> partitionSpecLocation() {
			return getRuleContexts(PartitionSpecLocationContext.class);
		}
		public PartitionSpecLocationContext partitionSpecLocation(int i) {
			return getRuleContext(PartitionSpecLocationContext.class,i);
		}
		public AddTablePartitionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAddTablePartition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAddTablePartition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAddTablePartition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespaceLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public SetNamespaceLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetNamespaceLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetNamespaceLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetNamespaceLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshTableContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRefreshTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetNamespacePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public SetNamespacePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetNamespaceProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetNamespaceProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetNamespaceProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ManageResourceContext extends StatementContext {
		public Token op;
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public ManageResourceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterManageResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitManageResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitManageResource(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetQuotedConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConfigValueContext configValue() {
			return getRuleContext(ConfigValueContext.class,0);
		}
		public SetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AnalyzeContext extends StatementContext {
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public AnalyzeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnalyze(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnalyze(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAnalyze(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateFunctionContext extends StatementContext {
		public Token className;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<ResourceContext> resource() {
			return getRuleContexts(ResourceContext.class);
		}
		public ResourceContext resource(int i) {
			return getRuleContext(ResourceContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveReplaceColumnsContext extends StatementContext {
		public MultipartIdentifierContext table;
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public HiveReplaceColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHiveReplaceColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHiveReplaceColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHiveReplaceColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentNamespaceContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCommentNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetQuotedConfigurationContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public ResetQuotedConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResetQuotedConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResetQuotedConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitResetQuotedConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public CreateTableHeaderContext createTableHeader() {
			return getRuleContext(CreateTableHeaderContext.class,0);
		}
		public CreateTableClausesContext createTableClauses() {
			return getRuleContext(CreateTableClausesContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() {
			return getRuleContext(CreateOrReplaceTableColTypeListContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DmlStatementContext extends StatementContext {
		public DmlStatementNoWithContext dmlStatementNoWith() {
			return getRuleContext(DmlStatementNoWithContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public DmlStatementContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDmlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDmlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDmlStatement(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableLikeContext extends StatementContext {
		public TableIdentifierContext target;
		public TableIdentifierContext source;
		public PropertyListContext tableProps;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<TableIdentifierContext> tableIdentifier() {
			return getRuleContexts(TableIdentifierContext.class);
		}
		public TableIdentifierContext tableIdentifier(int i) {
			return getRuleContext(TableIdentifierContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TableProviderContext> tableProvider() {
			return getRuleContexts(TableProviderContext.class);
		}
		public TableProviderContext tableProvider(int i) {
			return getRuleContext(TableProviderContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public CreateTableLikeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTableLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UncacheTableContext extends StatementContext {
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UncacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUncacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUncacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUncacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropFunctionContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeRelationContext extends StatementContext {
		public Token option;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public DescribeColNameContext describeColName() {
			return getRuleContext(DescribeColNameContext.class,0);
		}
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public DescribeRelationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LoadDataContext extends StatementContext {
		public Token path;
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LoadDataContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLoadData(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLoadData(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLoadData(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeFunctionContext extends StatementContext {
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public DescribeFuncNameContext describeFuncName() {
			return getRuleContext(DescribeFuncNameContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext from;
		public ErrorCapturingIdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public RenameTableColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRenameTableColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRenameTableColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRenameTableColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class HiveChangeColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext colName;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public HiveChangeColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHiveChangeColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHiveChangeColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHiveChangeColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTimeZoneContext extends StatementContext {
		public Token timezone;
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public SetTimeZoneContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeQueryContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public DescribeQueryContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TruncateTableContext extends StatementContext {
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TruncateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTruncateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTruncateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTruncateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableSerDeContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public SetTableSerDeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableSerDe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableSerDe(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTableSerDe(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierCommentListContext identifierCommentList() {
			return getRuleContext(IdentifierCommentListContext.class,0);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> ON() { return getTokens(SqlBaseParser.ON); }
		public TerminalNode ON(int i) {
			return getToken(SqlBaseParser.ON, i);
		}
		public List<IdentifierListContext> identifierList() {
			return getRuleContexts(IdentifierListContext.class);
		}
		public IdentifierListContext identifierList(int i) {
			return getRuleContext(IdentifierListContext.class,i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTablePartitionsContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public List<PartitionSpecContext> partitionSpec() {
			return getRuleContexts(PartitionSpecContext.class);
		}
		public PartitionSpecContext partitionSpec(int i) {
			return getRuleContext(PartitionSpecContext.class,i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTablePartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTablePartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTablePartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropTablePartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetConfigurationContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public ConfigKeyContext configKey() {
			return getRuleContext(ConfigKeyContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public SetConfigurationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetConfiguration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetConfiguration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetConfiguration(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTableExtendedContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ShowTableExtendedContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTableExtended(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTableExtended(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowTableExtended(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DescribeNamespaceContext extends StatementContext {
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public DescribeNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AlterTableAlterColumnContext extends StatementContext {
		public MultipartIdentifierContext table;
		public MultipartIdentifierContext column;
		public List<TerminalNode> ALTER() { return getTokens(SqlBaseParser.ALTER); }
		public TerminalNode ALTER(int i) {
			return getToken(SqlBaseParser.ALTER, i);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public AlterColumnActionContext alterColumnAction() {
			return getRuleContext(AlterColumnActionContext.class,0);
		}
		public AlterTableAlterColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterTableAlterColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterTableAlterColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAlterTableAlterColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RefreshFunctionContext extends StatementContext {
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public RefreshFunctionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRefreshFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRefreshFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRefreshFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommentTableContext extends StatementContext {
		public Token comment;
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCommentTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateIndexContext extends StatementContext {
		public IdentifierContext indexType;
		public MultipartIdentifierPropertyListContext columns;
		public PropertyListContext options;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() {
			return getRuleContext(MultipartIdentifierPropertyListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public CreateIndexContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateIndex(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseNamespaceContext extends StatementContext {
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public UseNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUseNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUseNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUseNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateNamespaceContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public NamespaceContext namespace() {
			return getRuleContext(NamespaceContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public List<TerminalNode> DBPROPERTIES() { return getTokens(SqlBaseParser.DBPROPERTIES); }
		public TerminalNode DBPROPERTIES(int i) {
			return getToken(SqlBaseParser.DBPROPERTIES, i);
		}
		public List<TerminalNode> PROPERTIES() { return getTokens(SqlBaseParser.PROPERTIES); }
		public TerminalNode PROPERTIES(int i) {
			return getToken(SqlBaseParser.PROPERTIES, i);
		}
		public CreateNamespaceContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateNamespace(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTblPropertiesContext extends StatementContext {
		public MultipartIdentifierContext table;
		public PropertyKeyContext key;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public ShowTblPropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowTblProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowTblProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowTblProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnsetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public UnsetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnsetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnsetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnsetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTableLocationContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public SetTableLocationContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTableLocation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableColumnsContext extends StatementContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public DropTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDropTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDropTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDropTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowViewsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public ShowViewsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowViews(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowViews(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowViews(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public MultipartIdentifierContext ns;
		public MultipartIdentifierContext legacy;
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CacheTableContext extends StatementContext {
		public PropertyListContext options;
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public CacheTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCacheTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCacheTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCacheTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddTableColumnsContext extends StatementContext {
		public QualifiedColTypeWithPositionListContext columns;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() {
			return getRuleContext(QualifiedColTypeWithPositionListContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public AddTableColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAddTableColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAddTableColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAddTableColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetTablePropertiesContext extends StatementContext {
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public SetTablePropertiesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_statement);
		int _la;
		try {
			int _alt;
			setState(1122);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				query();
				}
				break;
			case 2:
				_localctx = new DmlStatementContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(331);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(330);
					ctes();
					}
				}

				setState(333);
				dmlStatementNoWith();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(334);
				match(USE);
				setState(335);
				multipartIdentifier();
				}
				break;
			case 4:
				_localctx = new UseNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(336);
				match(USE);
				setState(337);
				namespace();
				setState(338);
				multipartIdentifier();
				}
				break;
			case 5:
				_localctx = new SetCatalogContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(340);
				match(SET);
				setState(341);
				match(CATALOG);
				setState(344);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
				case 1:
					{
					setState(342);
					identifier();
					}
					break;
				case 2:
					{
					setState(343);
					match(STRING);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new CreateNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(346);
				match(CREATE);
				setState(347);
				namespace();
				setState(351);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
				case 1:
					{
					setState(348);
					match(IF);
					setState(349);
					match(NOT);
					setState(350);
					match(EXISTS);
					}
					break;
				}
				setState(353);
				multipartIdentifier();
				setState(361);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==LOCATION || _la==WITH) {
					{
					setState(359);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(354);
						commentSpec();
						}
						break;
					case LOCATION:
						{
						setState(355);
						locationSpec();
						}
						break;
					case WITH:
						{
						{
						setState(356);
						match(WITH);
						setState(357);
						_la = _input.LA(1);
						if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(358);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(363);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 7:
				_localctx = new SetNamespacePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(364);
				match(ALTER);
				setState(365);
				namespace();
				setState(366);
				multipartIdentifier();
				setState(367);
				match(SET);
				setState(368);
				_la = _input.LA(1);
				if ( !(_la==DBPROPERTIES || _la==PROPERTIES) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(369);
				propertyList();
				}
				break;
			case 8:
				_localctx = new SetNamespaceLocationContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(371);
				match(ALTER);
				setState(372);
				namespace();
				setState(373);
				multipartIdentifier();
				setState(374);
				match(SET);
				setState(375);
				locationSpec();
				}
				break;
			case 9:
				_localctx = new DropNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(377);
				match(DROP);
				setState(378);
				namespace();
				setState(381);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(379);
					match(IF);
					setState(380);
					match(EXISTS);
					}
					break;
				}
				setState(383);
				multipartIdentifier();
				setState(385);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CASCADE || _la==RESTRICT) {
					{
					setState(384);
					_la = _input.LA(1);
					if ( !(_la==CASCADE || _la==RESTRICT) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				break;
			case 10:
				_localctx = new ShowNamespacesContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(387);
				match(SHOW);
				setState(388);
				namespaces();
				setState(391);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(389);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(390);
					multipartIdentifier();
					}
				}

				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(394);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(393);
						match(LIKE);
						}
					}

					setState(396);
					((ShowNamespacesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 11:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(399);
				createTableHeader();
				setState(404);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(400);
					match(LEFT_PAREN);
					setState(401);
					createOrReplaceTableColTypeList();
					setState(402);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(406);
					tableProvider();
					}
				}

				setState(409);
				createTableClauses();
				setState(414);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(410);
						match(AS);
						}
					}

					setState(413);
					query();
					}
				}

				}
				break;
			case 12:
				_localctx = new CreateTableLikeContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(416);
				match(CREATE);
				setState(417);
				match(TABLE);
				setState(421);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
				case 1:
					{
					setState(418);
					match(IF);
					setState(419);
					match(NOT);
					setState(420);
					match(EXISTS);
					}
					break;
				}
				setState(423);
				((CreateTableLikeContext)_localctx).target = tableIdentifier();
				setState(424);
				match(LIKE);
				setState(425);
				((CreateTableLikeContext)_localctx).source = tableIdentifier();
				setState(434);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==LOCATION || ((((_la - 212)) & ~0x3f) == 0 && ((1L << (_la - 212)) & ((1L << (ROW - 212)) | (1L << (STORED - 212)) | (1L << (TBLPROPERTIES - 212)) | (1L << (USING - 212)))) != 0)) {
					{
					setState(432);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case USING:
						{
						setState(426);
						tableProvider();
						}
						break;
					case ROW:
						{
						setState(427);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(428);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(429);
						locationSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(430);
						match(TBLPROPERTIES);
						setState(431);
						((CreateTableLikeContext)_localctx).tableProps = propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(436);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 13:
				_localctx = new ReplaceTableContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(437);
				replaceTableHeader();
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(438);
					match(LEFT_PAREN);
					setState(439);
					createOrReplaceTableColTypeList();
					setState(440);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(444);
					tableProvider();
					}
				}

				setState(447);
				createTableClauses();
				setState(452);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(449);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(448);
						match(AS);
						}
					}

					setState(451);
					query();
					}
				}

				}
				break;
			case 14:
				_localctx = new AnalyzeContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(454);
				match(ANALYZE);
				setState(455);
				match(TABLE);
				setState(456);
				multipartIdentifier();
				setState(458);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(457);
					partitionSpec();
					}
				}

				setState(460);
				match(COMPUTE);
				setState(461);
				match(STATISTICS);
				setState(469);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(462);
					identifier();
					}
					break;
				case 2:
					{
					setState(463);
					match(FOR);
					setState(464);
					match(COLUMNS);
					setState(465);
					identifierSeq();
					}
					break;
				case 3:
					{
					setState(466);
					match(FOR);
					setState(467);
					match(ALL);
					setState(468);
					match(COLUMNS);
					}
					break;
				}
				}
				break;
			case 15:
				_localctx = new AnalyzeTablesContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(471);
				match(ANALYZE);
				setState(472);
				match(TABLES);
				setState(475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(473);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(474);
					multipartIdentifier();
					}
				}

				setState(477);
				match(COMPUTE);
				setState(478);
				match(STATISTICS);
				setState(480);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
				case 1:
					{
					setState(479);
					identifier();
					}
					break;
				}
				}
				break;
			case 16:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(482);
				match(ALTER);
				setState(483);
				match(TABLE);
				setState(484);
				multipartIdentifier();
				setState(485);
				match(ADD);
				setState(486);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(487);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				}
				break;
			case 17:
				_localctx = new AddTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(489);
				match(ALTER);
				setState(490);
				match(TABLE);
				setState(491);
				multipartIdentifier();
				setState(492);
				match(ADD);
				setState(493);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(494);
				match(LEFT_PAREN);
				setState(495);
				((AddTableColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(496);
				match(RIGHT_PAREN);
				}
				break;
			case 18:
				_localctx = new RenameTableColumnContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(498);
				match(ALTER);
				setState(499);
				match(TABLE);
				setState(500);
				((RenameTableColumnContext)_localctx).table = multipartIdentifier();
				setState(501);
				match(RENAME);
				setState(502);
				match(COLUMN);
				setState(503);
				((RenameTableColumnContext)_localctx).from = multipartIdentifier();
				setState(504);
				match(TO);
				setState(505);
				((RenameTableColumnContext)_localctx).to = errorCapturingIdentifier();
				}
				break;
			case 19:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(507);
				match(ALTER);
				setState(508);
				match(TABLE);
				setState(509);
				multipartIdentifier();
				setState(510);
				match(DROP);
				setState(511);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(512);
				match(LEFT_PAREN);
				setState(513);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				setState(514);
				match(RIGHT_PAREN);
				}
				break;
			case 20:
				_localctx = new DropTableColumnsContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(516);
				match(ALTER);
				setState(517);
				match(TABLE);
				setState(518);
				multipartIdentifier();
				setState(519);
				match(DROP);
				setState(520);
				_la = _input.LA(1);
				if ( !(_la==COLUMN || _la==COLUMNS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(521);
				((DropTableColumnsContext)_localctx).columns = multipartIdentifierList();
				}
				break;
			case 21:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(523);
				match(ALTER);
				setState(524);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(525);
				((RenameTableContext)_localctx).from = multipartIdentifier();
				setState(526);
				match(RENAME);
				setState(527);
				match(TO);
				setState(528);
				((RenameTableContext)_localctx).to = multipartIdentifier();
				}
				break;
			case 22:
				_localctx = new SetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(530);
				match(ALTER);
				setState(531);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(532);
				multipartIdentifier();
				setState(533);
				match(SET);
				setState(534);
				match(TBLPROPERTIES);
				setState(535);
				propertyList();
				}
				break;
			case 23:
				_localctx = new UnsetTablePropertiesContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(537);
				match(ALTER);
				setState(538);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(539);
				multipartIdentifier();
				setState(540);
				match(UNSET);
				setState(541);
				match(TBLPROPERTIES);
				setState(544);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(542);
					match(IF);
					setState(543);
					match(EXISTS);
					}
				}

				setState(546);
				propertyList();
				}
				break;
			case 24:
				_localctx = new AlterTableAlterColumnContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(548);
				match(ALTER);
				setState(549);
				match(TABLE);
				setState(550);
				((AlterTableAlterColumnContext)_localctx).table = multipartIdentifier();
				setState(551);
				_la = _input.LA(1);
				if ( !(_la==ALTER || _la==CHANGE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(553);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(552);
					match(COLUMN);
					}
					break;
				}
				setState(555);
				((AlterTableAlterColumnContext)_localctx).column = multipartIdentifier();
				setState(557);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==COMMENT || _la==DROP || _la==FIRST || _la==SET || _la==TYPE) {
					{
					setState(556);
					alterColumnAction();
					}
				}

				}
				break;
			case 25:
				_localctx = new HiveChangeColumnContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(559);
				match(ALTER);
				setState(560);
				match(TABLE);
				setState(561);
				((HiveChangeColumnContext)_localctx).table = multipartIdentifier();
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(562);
					partitionSpec();
					}
				}

				setState(565);
				match(CHANGE);
				setState(567);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
				case 1:
					{
					setState(566);
					match(COLUMN);
					}
					break;
				}
				setState(569);
				((HiveChangeColumnContext)_localctx).colName = multipartIdentifier();
				setState(570);
				colType();
				setState(572);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AFTER || _la==FIRST) {
					{
					setState(571);
					colPosition();
					}
				}

				}
				break;
			case 26:
				_localctx = new HiveReplaceColumnsContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(574);
				match(ALTER);
				setState(575);
				match(TABLE);
				setState(576);
				((HiveReplaceColumnsContext)_localctx).table = multipartIdentifier();
				setState(578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(577);
					partitionSpec();
					}
				}

				setState(580);
				match(REPLACE);
				setState(581);
				match(COLUMNS);
				setState(582);
				match(LEFT_PAREN);
				setState(583);
				((HiveReplaceColumnsContext)_localctx).columns = qualifiedColTypeWithPositionList();
				setState(584);
				match(RIGHT_PAREN);
				}
				break;
			case 27:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(586);
				match(ALTER);
				setState(587);
				match(TABLE);
				setState(588);
				multipartIdentifier();
				setState(590);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(589);
					partitionSpec();
					}
				}

				setState(592);
				match(SET);
				setState(593);
				match(SERDE);
				setState(594);
				match(STRING);
				setState(598);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(595);
					match(WITH);
					setState(596);
					match(SERDEPROPERTIES);
					setState(597);
					propertyList();
					}
				}

				}
				break;
			case 28:
				_localctx = new SetTableSerDeContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(600);
				match(ALTER);
				setState(601);
				match(TABLE);
				setState(602);
				multipartIdentifier();
				setState(604);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(603);
					partitionSpec();
					}
				}

				setState(606);
				match(SET);
				setState(607);
				match(SERDEPROPERTIES);
				setState(608);
				propertyList();
				}
				break;
			case 29:
				_localctx = new AddTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(610);
				match(ALTER);
				setState(611);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(612);
				multipartIdentifier();
				setState(613);
				match(ADD);
				setState(617);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(614);
					match(IF);
					setState(615);
					match(NOT);
					setState(616);
					match(EXISTS);
					}
				}

				setState(620); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(619);
					partitionSpecLocation();
					}
					}
					setState(622); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==PARTITION );
				}
				break;
			case 30:
				_localctx = new RenameTablePartitionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(624);
				match(ALTER);
				setState(625);
				match(TABLE);
				setState(626);
				multipartIdentifier();
				setState(627);
				((RenameTablePartitionContext)_localctx).from = partitionSpec();
				setState(628);
				match(RENAME);
				setState(629);
				match(TO);
				setState(630);
				((RenameTablePartitionContext)_localctx).to = partitionSpec();
				}
				break;
			case 31:
				_localctx = new DropTablePartitionsContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(632);
				match(ALTER);
				setState(633);
				_la = _input.LA(1);
				if ( !(_la==TABLE || _la==VIEW) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(634);
				multipartIdentifier();
				setState(635);
				match(DROP);
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(636);
					match(IF);
					setState(637);
					match(EXISTS);
					}
				}

				setState(640);
				partitionSpec();
				setState(645);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(641);
					match(COMMA);
					setState(642);
					partitionSpec();
					}
					}
					setState(647);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(648);
					match(PURGE);
					}
				}

				}
				break;
			case 32:
				_localctx = new SetTableLocationContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(651);
				match(ALTER);
				setState(652);
				match(TABLE);
				setState(653);
				multipartIdentifier();
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(654);
					partitionSpec();
					}
				}

				setState(657);
				match(SET);
				setState(658);
				locationSpec();
				}
				break;
			case 33:
				_localctx = new RecoverPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(660);
				match(ALTER);
				setState(661);
				match(TABLE);
				setState(662);
				multipartIdentifier();
				setState(663);
				match(RECOVER);
				setState(664);
				match(PARTITIONS);
				}
				break;
			case 34:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(666);
				match(DROP);
				setState(667);
				match(TABLE);
				setState(670);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(668);
					match(IF);
					setState(669);
					match(EXISTS);
					}
					break;
				}
				setState(672);
				multipartIdentifier();
				setState(674);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PURGE) {
					{
					setState(673);
					match(PURGE);
					}
				}

				}
				break;
			case 35:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(676);
				match(DROP);
				setState(677);
				match(VIEW);
				setState(680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
				case 1:
					{
					setState(678);
					match(IF);
					setState(679);
					match(EXISTS);
					}
					break;
				}
				setState(682);
				multipartIdentifier();
				}
				break;
			case 36:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(683);
				match(CREATE);
				setState(686);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(684);
					match(OR);
					setState(685);
					match(REPLACE);
					}
				}

				setState(692);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL || _la==TEMPORARY) {
					{
					setState(689);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==GLOBAL) {
						{
						setState(688);
						match(GLOBAL);
						}
					}

					setState(691);
					match(TEMPORARY);
					}
				}

				setState(694);
				match(VIEW);
				setState(698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
				case 1:
					{
					setState(695);
					match(IF);
					setState(696);
					match(NOT);
					setState(697);
					match(EXISTS);
					}
					break;
				}
				setState(700);
				multipartIdentifier();
				setState(702);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(701);
					identifierCommentList();
					}
				}

				setState(712);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMENT || _la==PARTITIONED || _la==TBLPROPERTIES) {
					{
					setState(710);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case COMMENT:
						{
						setState(704);
						commentSpec();
						}
						break;
					case PARTITIONED:
						{
						{
						setState(705);
						match(PARTITIONED);
						setState(706);
						match(ON);
						setState(707);
						identifierList();
						}
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(708);
						match(TBLPROPERTIES);
						setState(709);
						propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(714);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(715);
				match(AS);
				setState(716);
				query();
				}
				break;
			case 37:
				_localctx = new CreateTempViewUsingContext(_localctx);
				enterOuterAlt(_localctx, 37);
				{
				setState(718);
				match(CREATE);
				setState(721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(719);
					match(OR);
					setState(720);
					match(REPLACE);
					}
				}

				setState(724);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==GLOBAL) {
					{
					setState(723);
					match(GLOBAL);
					}
				}

				setState(726);
				match(TEMPORARY);
				setState(727);
				match(VIEW);
				setState(728);
				tableIdentifier();
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(729);
					match(LEFT_PAREN);
					setState(730);
					colTypeList();
					setState(731);
					match(RIGHT_PAREN);
					}
				}

				setState(735);
				tableProvider();
				setState(738);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(736);
					match(OPTIONS);
					setState(737);
					propertyList();
					}
				}

				}
				break;
			case 38:
				_localctx = new AlterViewQueryContext(_localctx);
				enterOuterAlt(_localctx, 38);
				{
				setState(740);
				match(ALTER);
				setState(741);
				match(VIEW);
				setState(742);
				multipartIdentifier();
				setState(744);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(743);
					match(AS);
					}
				}

				setState(746);
				query();
				}
				break;
			case 39:
				_localctx = new CreateFunctionContext(_localctx);
				enterOuterAlt(_localctx, 39);
				{
				setState(748);
				match(CREATE);
				setState(751);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(749);
					match(OR);
					setState(750);
					match(REPLACE);
					}
				}

				setState(754);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(753);
					match(TEMPORARY);
					}
				}

				setState(756);
				match(FUNCTION);
				setState(760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
				case 1:
					{
					setState(757);
					match(IF);
					setState(758);
					match(NOT);
					setState(759);
					match(EXISTS);
					}
					break;
				}
				setState(762);
				multipartIdentifier();
				setState(763);
				match(AS);
				setState(764);
				((CreateFunctionContext)_localctx).className = match(STRING);
				setState(774);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(765);
					match(USING);
					setState(766);
					resource();
					setState(771);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(767);
						match(COMMA);
						setState(768);
						resource();
						}
						}
						setState(773);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 40:
				_localctx = new DropFunctionContext(_localctx);
				enterOuterAlt(_localctx, 40);
				{
				setState(776);
				match(DROP);
				setState(778);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TEMPORARY) {
					{
					setState(777);
					match(TEMPORARY);
					}
				}

				setState(780);
				match(FUNCTION);
				setState(783);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
				case 1:
					{
					setState(781);
					match(IF);
					setState(782);
					match(EXISTS);
					}
					break;
				}
				setState(785);
				multipartIdentifier();
				}
				break;
			case 41:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 41);
				{
				setState(786);
				match(EXPLAIN);
				setState(788);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CODEGEN || _la==COST || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (EXTENDED - 89)) | (1L << (FORMATTED - 89)) | (1L << (LOGICAL - 89)))) != 0)) {
					{
					setState(787);
					_la = _input.LA(1);
					if ( !(_la==CODEGEN || _la==COST || ((((_la - 89)) & ~0x3f) == 0 && ((1L << (_la - 89)) & ((1L << (EXTENDED - 89)) | (1L << (FORMATTED - 89)) | (1L << (LOGICAL - 89)))) != 0)) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(790);
				statement();
				}
				break;
			case 42:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 42);
				{
				setState(791);
				match(SHOW);
				setState(792);
				match(TABLES);
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(793);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(794);
					multipartIdentifier();
					}
				}

				setState(801);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(798);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(797);
						match(LIKE);
						}
					}

					setState(800);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 43:
				_localctx = new ShowTableExtendedContext(_localctx);
				enterOuterAlt(_localctx, 43);
				{
				setState(803);
				match(SHOW);
				setState(804);
				match(TABLE);
				setState(805);
				match(EXTENDED);
				setState(808);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(806);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(807);
					((ShowTableExtendedContext)_localctx).ns = multipartIdentifier();
					}
				}

				setState(810);
				match(LIKE);
				setState(811);
				((ShowTableExtendedContext)_localctx).pattern = match(STRING);
				setState(813);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(812);
					partitionSpec();
					}
				}

				}
				break;
			case 44:
				_localctx = new ShowTblPropertiesContext(_localctx);
				enterOuterAlt(_localctx, 44);
				{
				setState(815);
				match(SHOW);
				setState(816);
				match(TBLPROPERTIES);
				setState(817);
				((ShowTblPropertiesContext)_localctx).table = multipartIdentifier();
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN) {
					{
					setState(818);
					match(LEFT_PAREN);
					setState(819);
					((ShowTblPropertiesContext)_localctx).key = propertyKey();
					setState(820);
					match(RIGHT_PAREN);
					}
				}

				}
				break;
			case 45:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 45);
				{
				setState(824);
				match(SHOW);
				setState(825);
				match(COLUMNS);
				setState(826);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(827);
				((ShowColumnsContext)_localctx).table = multipartIdentifier();
				setState(830);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(828);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(829);
					((ShowColumnsContext)_localctx).ns = multipartIdentifier();
					}
				}

				}
				break;
			case 46:
				_localctx = new ShowViewsContext(_localctx);
				enterOuterAlt(_localctx, 46);
				{
				setState(832);
				match(SHOW);
				setState(833);
				match(VIEWS);
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(834);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(835);
					multipartIdentifier();
					}
				}

				setState(842);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(839);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(838);
						match(LIKE);
						}
					}

					setState(841);
					((ShowViewsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 47:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 47);
				{
				setState(844);
				match(SHOW);
				setState(845);
				match(PARTITIONS);
				setState(846);
				multipartIdentifier();
				setState(848);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(847);
					partitionSpec();
					}
				}

				}
				break;
			case 48:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 48);
				{
				setState(850);
				match(SHOW);
				setState(852);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
				case 1:
					{
					setState(851);
					identifier();
					}
					break;
				}
				setState(854);
				match(FUNCTIONS);
				setState(857);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
				case 1:
					{
					setState(855);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(856);
					((ShowFunctionsContext)_localctx).ns = multipartIdentifier();
					}
					break;
				}
				setState(866);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
				case 1:
					{
					setState(860);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
					case 1:
						{
						setState(859);
						match(LIKE);
						}
						break;
					}
					setState(864);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
					case 1:
						{
						setState(862);
						((ShowFunctionsContext)_localctx).legacy = multipartIdentifier();
						}
						break;
					case 2:
						{
						setState(863);
						((ShowFunctionsContext)_localctx).pattern = match(STRING);
						}
						break;
					}
					}
					break;
				}
				}
				break;
			case 49:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 49);
				{
				setState(868);
				match(SHOW);
				setState(869);
				match(CREATE);
				setState(870);
				match(TABLE);
				setState(871);
				multipartIdentifier();
				setState(874);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(872);
					match(AS);
					setState(873);
					match(SERDE);
					}
				}

				}
				break;
			case 50:
				_localctx = new ShowCurrentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 50);
				{
				setState(876);
				match(SHOW);
				setState(877);
				match(CURRENT);
				setState(878);
				namespace();
				}
				break;
			case 51:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 51);
				{
				setState(879);
				match(SHOW);
				setState(880);
				match(CATALOGS);
				setState(885);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIKE || _la==STRING) {
					{
					setState(882);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==LIKE) {
						{
						setState(881);
						match(LIKE);
						}
					}

					setState(884);
					((ShowCatalogsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 52:
				_localctx = new DescribeFunctionContext(_localctx);
				enterOuterAlt(_localctx, 52);
				{
				setState(887);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(888);
				match(FUNCTION);
				setState(890);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
				case 1:
					{
					setState(889);
					match(EXTENDED);
					}
					break;
				}
				setState(892);
				describeFuncName();
				}
				break;
			case 53:
				_localctx = new DescribeNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 53);
				{
				setState(893);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(894);
				namespace();
				setState(896);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
				case 1:
					{
					setState(895);
					match(EXTENDED);
					}
					break;
				}
				setState(898);
				multipartIdentifier();
				}
				break;
			case 54:
				_localctx = new DescribeRelationContext(_localctx);
				enterOuterAlt(_localctx, 54);
				{
				setState(900);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(902);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,86,_ctx) ) {
				case 1:
					{
					setState(901);
					match(TABLE);
					}
					break;
				}
				setState(905);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(904);
					((DescribeRelationContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==EXTENDED || _la==FORMATTED) ) {
						((DescribeRelationContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(907);
				multipartIdentifier();
				setState(909);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
				case 1:
					{
					setState(908);
					partitionSpec();
					}
					break;
				}
				setState(912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(911);
					describeColName();
					}
					break;
				}
				}
				break;
			case 55:
				_localctx = new DescribeQueryContext(_localctx);
				enterOuterAlt(_localctx, 55);
				{
				setState(914);
				_la = _input.LA(1);
				if ( !(_la==DESC || _la==DESCRIBE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(916);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==QUERY) {
					{
					setState(915);
					match(QUERY);
					}
				}

				setState(918);
				query();
				}
				break;
			case 56:
				_localctx = new CommentNamespaceContext(_localctx);
				enterOuterAlt(_localctx, 56);
				{
				setState(919);
				match(COMMENT);
				setState(920);
				match(ON);
				setState(921);
				namespace();
				setState(922);
				multipartIdentifier();
				setState(923);
				match(IS);
				setState(924);
				((CommentNamespaceContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentNamespaceContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 57:
				_localctx = new CommentTableContext(_localctx);
				enterOuterAlt(_localctx, 57);
				{
				setState(926);
				match(COMMENT);
				setState(927);
				match(ON);
				setState(928);
				match(TABLE);
				setState(929);
				multipartIdentifier();
				setState(930);
				match(IS);
				setState(931);
				((CommentTableContext)_localctx).comment = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==NULL || _la==STRING) ) {
					((CommentTableContext)_localctx).comment = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 58:
				_localctx = new RefreshTableContext(_localctx);
				enterOuterAlt(_localctx, 58);
				{
				setState(933);
				match(REFRESH);
				setState(934);
				match(TABLE);
				setState(935);
				multipartIdentifier();
				}
				break;
			case 59:
				_localctx = new RefreshFunctionContext(_localctx);
				enterOuterAlt(_localctx, 59);
				{
				setState(936);
				match(REFRESH);
				setState(937);
				match(FUNCTION);
				setState(938);
				multipartIdentifier();
				}
				break;
			case 60:
				_localctx = new RefreshResourceContext(_localctx);
				enterOuterAlt(_localctx, 60);
				{
				setState(939);
				match(REFRESH);
				setState(947);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
				case 1:
					{
					setState(940);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(944);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(941);
							matchWildcard();
							}
							} 
						}
						setState(946);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,91,_ctx);
					}
					}
					break;
				}
				}
				break;
			case 61:
				_localctx = new CacheTableContext(_localctx);
				enterOuterAlt(_localctx, 61);
				{
				setState(949);
				match(CACHE);
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LAZY) {
					{
					setState(950);
					match(LAZY);
					}
				}

				setState(953);
				match(TABLE);
				setState(954);
				multipartIdentifier();
				setState(957);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(955);
					match(OPTIONS);
					setState(956);
					((CacheTableContext)_localctx).options = propertyList();
					}
				}

				setState(963);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT_PAREN || _la==AS || _la==FROM || _la==MAP || ((((_la - 195)) & ~0x3f) == 0 && ((1L << (_la - 195)) & ((1L << (REDUCE - 195)) | (1L << (SELECT - 195)) | (1L << (TABLE - 195)))) != 0) || _la==VALUES || _la==WITH) {
					{
					setState(960);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(959);
						match(AS);
						}
					}

					setState(962);
					query();
					}
				}

				}
				break;
			case 62:
				_localctx = new UncacheTableContext(_localctx);
				enterOuterAlt(_localctx, 62);
				{
				setState(965);
				match(UNCACHE);
				setState(966);
				match(TABLE);
				setState(969);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
				case 1:
					{
					setState(967);
					match(IF);
					setState(968);
					match(EXISTS);
					}
					break;
				}
				setState(971);
				multipartIdentifier();
				}
				break;
			case 63:
				_localctx = new ClearCacheContext(_localctx);
				enterOuterAlt(_localctx, 63);
				{
				setState(972);
				match(CLEAR);
				setState(973);
				match(CACHE);
				}
				break;
			case 64:
				_localctx = new LoadDataContext(_localctx);
				enterOuterAlt(_localctx, 64);
				{
				setState(974);
				match(LOAD);
				setState(975);
				match(DATA);
				setState(977);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(976);
					match(LOCAL);
					}
				}

				setState(979);
				match(INPATH);
				setState(980);
				((LoadDataContext)_localctx).path = match(STRING);
				setState(982);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OVERWRITE) {
					{
					setState(981);
					match(OVERWRITE);
					}
				}

				setState(984);
				match(INTO);
				setState(985);
				match(TABLE);
				setState(986);
				multipartIdentifier();
				setState(988);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(987);
					partitionSpec();
					}
				}

				}
				break;
			case 65:
				_localctx = new TruncateTableContext(_localctx);
				enterOuterAlt(_localctx, 65);
				{
				setState(990);
				match(TRUNCATE);
				setState(991);
				match(TABLE);
				setState(992);
				multipartIdentifier();
				setState(994);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(993);
					partitionSpec();
					}
				}

				}
				break;
			case 66:
				_localctx = new RepairTableContext(_localctx);
				enterOuterAlt(_localctx, 66);
				{
				setState(996);
				match(MSCK);
				setState(997);
				match(REPAIR);
				setState(998);
				match(TABLE);
				setState(999);
				multipartIdentifier();
				setState(1002);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ADD || _la==DROP || _la==SYNC) {
					{
					setState(1000);
					((RepairTableContext)_localctx).option = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ADD || _la==DROP || _la==SYNC) ) {
						((RepairTableContext)_localctx).option = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1001);
					match(PARTITIONS);
					}
				}

				}
				break;
			case 67:
				_localctx = new ManageResourceContext(_localctx);
				enterOuterAlt(_localctx, 67);
				{
				setState(1004);
				((ManageResourceContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ADD || _la==LIST) ) {
					((ManageResourceContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1005);
				identifier();
				setState(1009);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1006);
						matchWildcard();
						}
						} 
					}
					setState(1011);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,103,_ctx);
				}
				}
				break;
			case 68:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 68);
				{
				setState(1012);
				match(SET);
				setState(1013);
				match(ROLE);
				setState(1017);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1014);
						matchWildcard();
						}
						} 
					}
					setState(1019);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
				}
				}
				break;
			case 69:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 69);
				{
				setState(1020);
				match(SET);
				setState(1021);
				match(TIME);
				setState(1022);
				match(ZONE);
				setState(1023);
				interval();
				}
				break;
			case 70:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 70);
				{
				setState(1024);
				match(SET);
				setState(1025);
				match(TIME);
				setState(1026);
				match(ZONE);
				setState(1027);
				((SetTimeZoneContext)_localctx).timezone = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOCAL || _la==STRING) ) {
					((SetTimeZoneContext)_localctx).timezone = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 71:
				_localctx = new SetTimeZoneContext(_localctx);
				enterOuterAlt(_localctx, 71);
				{
				setState(1028);
				match(SET);
				setState(1029);
				match(TIME);
				setState(1030);
				match(ZONE);
				setState(1034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1031);
						matchWildcard();
						}
						} 
					}
					setState(1036);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,105,_ctx);
				}
				}
				break;
			case 72:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 72);
				{
				setState(1037);
				match(SET);
				setState(1038);
				configKey();
				setState(1039);
				match(EQ);
				setState(1040);
				configValue();
				}
				break;
			case 73:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 73);
				{
				setState(1042);
				match(SET);
				setState(1043);
				configKey();
				setState(1051);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1044);
					match(EQ);
					setState(1048);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
						if ( _alt==1+1 ) {
							{
							{
							setState(1045);
							matchWildcard();
							}
							} 
						}
						setState(1050);
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
					}
					}
				}

				}
				break;
			case 74:
				_localctx = new SetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 74);
				{
				setState(1053);
				match(SET);
				setState(1057);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1054);
						matchWildcard();
						}
						} 
					}
					setState(1059);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,108,_ctx);
				}
				setState(1060);
				match(EQ);
				setState(1061);
				configValue();
				}
				break;
			case 75:
				_localctx = new SetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 75);
				{
				setState(1062);
				match(SET);
				setState(1066);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1063);
						matchWildcard();
						}
						} 
					}
					setState(1068);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,109,_ctx);
				}
				}
				break;
			case 76:
				_localctx = new ResetQuotedConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 76);
				{
				setState(1069);
				match(RESET);
				setState(1070);
				configKey();
				}
				break;
			case 77:
				_localctx = new ResetConfigurationContext(_localctx);
				enterOuterAlt(_localctx, 77);
				{
				setState(1071);
				match(RESET);
				setState(1075);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1072);
						matchWildcard();
						}
						} 
					}
					setState(1077);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,110,_ctx);
				}
				}
				break;
			case 78:
				_localctx = new CreateIndexContext(_localctx);
				enterOuterAlt(_localctx, 78);
				{
				setState(1078);
				match(CREATE);
				setState(1079);
				match(INDEX);
				setState(1083);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,111,_ctx) ) {
				case 1:
					{
					setState(1080);
					match(IF);
					setState(1081);
					match(NOT);
					setState(1082);
					match(EXISTS);
					}
					break;
				}
				setState(1085);
				identifier();
				setState(1086);
				match(ON);
				setState(1088);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
				case 1:
					{
					setState(1087);
					match(TABLE);
					}
					break;
				}
				setState(1090);
				multipartIdentifier();
				setState(1093);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==USING) {
					{
					setState(1091);
					match(USING);
					setState(1092);
					((CreateIndexContext)_localctx).indexType = identifier();
					}
				}

				setState(1095);
				match(LEFT_PAREN);
				setState(1096);
				((CreateIndexContext)_localctx).columns = multipartIdentifierPropertyList();
				setState(1097);
				match(RIGHT_PAREN);
				setState(1100);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1098);
					match(OPTIONS);
					setState(1099);
					((CreateIndexContext)_localctx).options = propertyList();
					}
				}

				}
				break;
			case 79:
				_localctx = new DropIndexContext(_localctx);
				enterOuterAlt(_localctx, 79);
				{
				setState(1102);
				match(DROP);
				setState(1103);
				match(INDEX);
				setState(1106);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,115,_ctx) ) {
				case 1:
					{
					setState(1104);
					match(IF);
					setState(1105);
					match(EXISTS);
					}
					break;
				}
				setState(1108);
				identifier();
				setState(1109);
				match(ON);
				setState(1111);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,116,_ctx) ) {
				case 1:
					{
					setState(1110);
					match(TABLE);
					}
					break;
				}
				setState(1113);
				multipartIdentifier();
				}
				break;
			case 80:
				_localctx = new FailNativeCommandContext(_localctx);
				enterOuterAlt(_localctx, 80);
				{
				setState(1115);
				unsupportedHiveNativeCommands();
				setState(1119);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1+1 ) {
						{
						{
						setState(1116);
						matchWildcard();
						}
						} 
					}
					setState(1121);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,117,_ctx);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigKeyContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConfigKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConfigKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConfigKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigKeyContext configKey() throws RecognitionException {
		ConfigKeyContext _localctx = new ConfigKeyContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_configKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1124);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConfigValueContext extends ParserRuleContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public ConfigValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConfigValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConfigValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConfigValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConfigValueContext configValue() throws RecognitionException {
		ConfigValueContext _localctx = new ConfigValueContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_configValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1126);
			quotedIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnsupportedHiveNativeCommandsContext extends ParserRuleContext {
		public Token kw1;
		public Token kw2;
		public Token kw3;
		public Token kw4;
		public Token kw5;
		public Token kw6;
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TableIdentifierContext tableIdentifier() {
			return getRuleContext(TableIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public UnsupportedHiveNativeCommandsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unsupportedHiveNativeCommands; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnsupportedHiveNativeCommands(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnsupportedHiveNativeCommands(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnsupportedHiveNativeCommands(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnsupportedHiveNativeCommandsContext unsupportedHiveNativeCommands() throws RecognitionException {
		UnsupportedHiveNativeCommandsContext _localctx = new UnsupportedHiveNativeCommandsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_unsupportedHiveNativeCommands);
		int _la;
		try {
			setState(1296);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1128);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1129);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1131);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1132);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(GRANT);
				setState(1134);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,119,_ctx) ) {
				case 1:
					{
					setState(1133);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1136);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(REVOKE);
				setState(1138);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,120,_ctx) ) {
				case 1:
					{
					setState(1137);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1140);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1141);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(GRANT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1142);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1143);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLE);
				setState(1145);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,121,_ctx) ) {
				case 1:
					{
					setState(1144);
					((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(GRANT);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1147);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1148);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(PRINCIPALS);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1149);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1150);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(ROLES);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1151);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1152);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CURRENT);
				setState(1153);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ROLES);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1154);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(EXPORT);
				setState(1155);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1156);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(IMPORT);
				setState(1157);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1158);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1159);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(COMPACTIONS);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1160);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1161);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(CREATE);
				setState(1162);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TABLE);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1163);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1164);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTIONS);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1165);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1166);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEXES);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1167);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(SHOW);
				setState(1168);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(LOCKS);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1169);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1170);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1171);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1172);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1173);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1174);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(INDEX);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1175);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1176);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1177);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(LOCK);
				setState(1178);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1179);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1180);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1181);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(UNLOCK);
				setState(1182);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(DATABASE);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1183);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(CREATE);
				setState(1184);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1185);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1186);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DROP);
				setState(1187);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TEMPORARY);
				setState(1188);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(MACRO);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1189);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1190);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1191);
				tableIdentifier();
				setState(1192);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1193);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(CLUSTERED);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1195);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1196);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1197);
				tableIdentifier();
				setState(1198);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CLUSTERED);
				setState(1199);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1201);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1202);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1203);
				tableIdentifier();
				setState(1204);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1205);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SORTED);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1207);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1208);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1209);
				tableIdentifier();
				setState(1210);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SKEWED);
				setState(1211);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(BY);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1213);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1214);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1215);
				tableIdentifier();
				setState(1216);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1217);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1219);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1220);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1221);
				tableIdentifier();
				setState(1222);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(NOT);
				setState(1223);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(STORED);
				setState(1224);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(AS);
				setState(1225);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw6 = match(DIRECTORIES);
				}
				break;
			case 32:
				enterOuterAlt(_localctx, 32);
				{
				setState(1227);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1228);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1229);
				tableIdentifier();
				setState(1230);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1231);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(SKEWED);
				setState(1232);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw5 = match(LOCATION);
				}
				break;
			case 33:
				enterOuterAlt(_localctx, 33);
				{
				setState(1234);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1235);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1236);
				tableIdentifier();
				setState(1237);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(EXCHANGE);
				setState(1238);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 34:
				enterOuterAlt(_localctx, 34);
				{
				setState(1240);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1241);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1242);
				tableIdentifier();
				setState(1243);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(ARCHIVE);
				setState(1244);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 35:
				enterOuterAlt(_localctx, 35);
				{
				setState(1246);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1247);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1248);
				tableIdentifier();
				setState(1249);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(UNARCHIVE);
				setState(1250);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(PARTITION);
				}
				break;
			case 36:
				enterOuterAlt(_localctx, 36);
				{
				setState(1252);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1253);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1254);
				tableIdentifier();
				setState(1255);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(TOUCH);
				}
				break;
			case 37:
				enterOuterAlt(_localctx, 37);
				{
				setState(1257);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1258);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1259);
				tableIdentifier();
				setState(1261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1260);
					partitionSpec();
					}
				}

				setState(1263);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(COMPACT);
				}
				break;
			case 38:
				enterOuterAlt(_localctx, 38);
				{
				setState(1265);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1266);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1267);
				tableIdentifier();
				setState(1269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1268);
					partitionSpec();
					}
				}

				setState(1271);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(CONCATENATE);
				}
				break;
			case 39:
				enterOuterAlt(_localctx, 39);
				{
				setState(1273);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1274);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1275);
				tableIdentifier();
				setState(1277);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1276);
					partitionSpec();
					}
				}

				setState(1279);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(SET);
				setState(1280);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(FILEFORMAT);
				}
				break;
			case 40:
				enterOuterAlt(_localctx, 40);
				{
				setState(1282);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ALTER);
				setState(1283);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TABLE);
				setState(1284);
				tableIdentifier();
				setState(1286);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1285);
					partitionSpec();
					}
				}

				setState(1288);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw3 = match(REPLACE);
				setState(1289);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw4 = match(COLUMNS);
				}
				break;
			case 41:
				enterOuterAlt(_localctx, 41);
				{
				setState(1291);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(START);
				setState(1292);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw2 = match(TRANSACTION);
				}
				break;
			case 42:
				enterOuterAlt(_localctx, 42);
				{
				setState(1293);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(COMMIT);
				}
				break;
			case 43:
				enterOuterAlt(_localctx, 43);
				{
				setState(1294);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(ROLLBACK);
				}
				break;
			case 44:
				enterOuterAlt(_localctx, 44);
				{
				setState(1295);
				((UnsupportedHiveNativeCommandsContext)_localctx).kw1 = match(DFS);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableHeaderContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public CreateTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableHeaderContext createTableHeader() throws RecognitionException {
		CreateTableHeaderContext _localctx = new CreateTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_createTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1298);
			match(CREATE);
			setState(1300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TEMPORARY) {
				{
				setState(1299);
				match(TEMPORARY);
				}
			}

			setState(1303);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXTERNAL) {
				{
				setState(1302);
				match(EXTERNAL);
				}
			}

			setState(1305);
			match(TABLE);
			setState(1309);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,129,_ctx) ) {
			case 1:
				{
				setState(1306);
				match(IF);
				setState(1307);
				match(NOT);
				setState(1308);
				match(EXISTS);
				}
				break;
			}
			setState(1311);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ReplaceTableHeaderContext extends ParserRuleContext {
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public ReplaceTableHeaderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replaceTableHeader; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterReplaceTableHeader(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitReplaceTableHeader(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitReplaceTableHeader(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReplaceTableHeaderContext replaceTableHeader() throws RecognitionException {
		ReplaceTableHeaderContext _localctx = new ReplaceTableHeaderContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_replaceTableHeader);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==CREATE) {
				{
				setState(1313);
				match(CREATE);
				setState(1314);
				match(OR);
				}
			}

			setState(1317);
			match(REPLACE);
			setState(1318);
			match(TABLE);
			setState(1319);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BucketSpecContext extends ParserRuleContext {
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public OrderedIdentifierListContext orderedIdentifierList() {
			return getRuleContext(OrderedIdentifierListContext.class,0);
		}
		public BucketSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bucketSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBucketSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBucketSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBucketSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BucketSpecContext bucketSpec() throws RecognitionException {
		BucketSpecContext _localctx = new BucketSpecContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bucketSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1321);
			match(CLUSTERED);
			setState(1322);
			match(BY);
			setState(1323);
			identifierList();
			setState(1327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SORTED) {
				{
				setState(1324);
				match(SORTED);
				setState(1325);
				match(BY);
				setState(1326);
				orderedIdentifierList();
				}
			}

			setState(1329);
			match(INTO);
			setState(1330);
			match(INTEGER_VALUE);
			setState(1331);
			match(BUCKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SkewSpecContext extends ParserRuleContext {
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public ConstantListContext constantList() {
			return getRuleContext(ConstantListContext.class,0);
		}
		public NestedConstantListContext nestedConstantList() {
			return getRuleContext(NestedConstantListContext.class,0);
		}
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public SkewSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_skewSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSkewSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSkewSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSkewSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SkewSpecContext skewSpec() throws RecognitionException {
		SkewSpecContext _localctx = new SkewSpecContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_skewSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1333);
			match(SKEWED);
			setState(1334);
			match(BY);
			setState(1335);
			identifierList();
			setState(1336);
			match(ON);
			setState(1339);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
			case 1:
				{
				setState(1337);
				constantList();
				}
				break;
			case 2:
				{
				setState(1338);
				nestedConstantList();
				}
				break;
			}
			setState(1344);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
			case 1:
				{
				setState(1341);
				match(STORED);
				setState(1342);
				match(AS);
				setState(1343);
				match(DIRECTORIES);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LocationSpecContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public LocationSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_locationSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLocationSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLocationSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLocationSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LocationSpecContext locationSpec() throws RecognitionException {
		LocationSpecContext _localctx = new LocationSpecContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_locationSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1346);
			match(LOCATION);
			setState(1347);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentSpecContext extends ParserRuleContext {
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public CommentSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_commentSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCommentSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCommentSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCommentSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommentSpecContext commentSpec() throws RecognitionException {
		CommentSpecContext _localctx = new CommentSpecContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_commentSpec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1349);
			match(COMMENT);
			setState(1350);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public CtesContext ctes() {
			return getRuleContext(CtesContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1353);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(1352);
				ctes();
				}
			}

			setState(1355);
			queryTerm(0);
			setState(1356);
			queryOrganization();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InsertIntoContext extends ParserRuleContext {
		public InsertIntoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insertInto; }
	 
		public InsertIntoContext() { }
		public void copyFrom(InsertIntoContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class InsertOverwriteHiveDirContext extends InsertIntoContext {
		public Token path;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public RowFormatContext rowFormat() {
			return getRuleContext(RowFormatContext.class,0);
		}
		public CreateFileFormatContext createFileFormat() {
			return getRuleContext(CreateFileFormatContext.class,0);
		}
		public InsertOverwriteHiveDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteHiveDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteHiveDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertOverwriteHiveDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteDirContext extends InsertIntoContext {
		public Token path;
		public PropertyListContext options;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TableProviderContext tableProvider() {
			return getRuleContext(TableProviderContext.class,0);
		}
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public InsertOverwriteDirContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertOverwriteDir(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertOverwriteTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public InsertOverwriteTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertOverwriteTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertOverwriteTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertOverwriteTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoTableContext extends InsertIntoContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public InsertIntoTableContext(InsertIntoContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInsertIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInsertIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInsertIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertIntoContext insertInto() throws RecognitionException {
		InsertIntoContext _localctx = new InsertIntoContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_insertInto);
		int _la;
		try {
			setState(1419);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,149,_ctx) ) {
			case 1:
				_localctx = new InsertOverwriteTableContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1358);
				match(INSERT);
				setState(1359);
				match(OVERWRITE);
				setState(1361);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
				case 1:
					{
					setState(1360);
					match(TABLE);
					}
					break;
				}
				setState(1363);
				multipartIdentifier();
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1364);
					partitionSpec();
					setState(1368);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==IF) {
						{
						setState(1365);
						match(IF);
						setState(1366);
						match(NOT);
						setState(1367);
						match(EXISTS);
						}
					}

					}
				}

				setState(1373);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,138,_ctx) ) {
				case 1:
					{
					setState(1372);
					identifierList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new InsertIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1375);
				match(INSERT);
				setState(1376);
				match(INTO);
				setState(1378);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
				case 1:
					{
					setState(1377);
					match(TABLE);
					}
					break;
				}
				setState(1380);
				multipartIdentifier();
				setState(1382);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==PARTITION) {
					{
					setState(1381);
					partitionSpec();
					}
				}

				setState(1387);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IF) {
					{
					setState(1384);
					match(IF);
					setState(1385);
					match(NOT);
					setState(1386);
					match(EXISTS);
					}
				}

				setState(1390);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,142,_ctx) ) {
				case 1:
					{
					setState(1389);
					identifierList();
					}
					break;
				}
				}
				break;
			case 3:
				_localctx = new InsertOverwriteHiveDirContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1392);
				match(INSERT);
				setState(1393);
				match(OVERWRITE);
				setState(1395);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1394);
					match(LOCAL);
					}
				}

				setState(1397);
				match(DIRECTORY);
				setState(1398);
				((InsertOverwriteHiveDirContext)_localctx).path = match(STRING);
				setState(1400);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(1399);
					rowFormat();
					}
				}

				setState(1403);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STORED) {
					{
					setState(1402);
					createFileFormat();
					}
				}

				}
				break;
			case 4:
				_localctx = new InsertOverwriteDirContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1405);
				match(INSERT);
				setState(1406);
				match(OVERWRITE);
				setState(1408);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LOCAL) {
					{
					setState(1407);
					match(LOCAL);
					}
				}

				setState(1410);
				match(DIRECTORY);
				setState(1412);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==STRING) {
					{
					setState(1411);
					((InsertOverwriteDirContext)_localctx).path = match(STRING);
					}
				}

				setState(1414);
				tableProvider();
				setState(1417);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPTIONS) {
					{
					setState(1415);
					match(OPTIONS);
					setState(1416);
					((InsertOverwriteDirContext)_localctx).options = propertyList();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecLocationContext extends ParserRuleContext {
		public PartitionSpecContext partitionSpec() {
			return getRuleContext(PartitionSpecContext.class,0);
		}
		public LocationSpecContext locationSpec() {
			return getRuleContext(LocationSpecContext.class,0);
		}
		public PartitionSpecLocationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpecLocation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionSpecLocation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionSpecLocation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionSpecLocation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecLocationContext partitionSpecLocation() throws RecognitionException {
		PartitionSpecLocationContext _localctx = new PartitionSpecLocationContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_partitionSpecLocation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1421);
			partitionSpec();
			setState(1423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LOCATION) {
				{
				setState(1422);
				locationSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionSpecContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PartitionValContext> partitionVal() {
			return getRuleContexts(PartitionValContext.class);
		}
		public PartitionValContext partitionVal(int i) {
			return getRuleContext(PartitionValContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionSpecContext partitionSpec() throws RecognitionException {
		PartitionSpecContext _localctx = new PartitionSpecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_partitionSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1425);
			match(PARTITION);
			setState(1426);
			match(LEFT_PAREN);
			setState(1427);
			partitionVal();
			setState(1432);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1428);
				match(COMMA);
				setState(1429);
				partitionVal();
				}
				}
				setState(1434);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1435);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionValContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public PartitionValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionValContext partitionVal() throws RecognitionException {
		PartitionValContext _localctx = new PartitionValContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_partitionVal);
		int _la;
		try {
			setState(1446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1437);
				identifier();
				setState(1440);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1438);
					match(EQ);
					setState(1439);
					constant();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1442);
				identifier();
				setState(1443);
				match(EQ);
				setState(1444);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespaceContext extends ParserRuleContext {
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public NamespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespace; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamespace(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamespace(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespaceContext namespace() throws RecognitionException {
		NamespaceContext _localctx = new NamespaceContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_namespace);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1448);
			_la = _input.LA(1);
			if ( !(_la==DATABASE || _la==NAMESPACE || _la==SCHEMA) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamespacesContext extends ParserRuleContext {
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public NamespacesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namespaces; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamespaces(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamespaces(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamespaces(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamespacesContext namespaces() throws RecognitionException {
		NamespacesContext _localctx = new NamespacesContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_namespaces);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1450);
			_la = _input.LA(1);
			if ( !(_la==DATABASES || _la==NAMESPACES || _la==SCHEMAS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeFuncNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ArithmeticOperatorContext arithmeticOperator() {
			return getRuleContext(ArithmeticOperatorContext.class,0);
		}
		public PredicateOperatorContext predicateOperator() {
			return getRuleContext(PredicateOperatorContext.class,0);
		}
		public DescribeFuncNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeFuncName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeFuncName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeFuncName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeFuncName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeFuncNameContext describeFuncName() throws RecognitionException {
		DescribeFuncNameContext _localctx = new DescribeFuncNameContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_describeFuncName);
		try {
			setState(1457);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1452);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1453);
				match(STRING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1454);
				comparisonOperator();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1455);
				arithmeticOperator();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1456);
				predicateOperator();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DescribeColNameContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> nameParts = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public DescribeColNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describeColName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDescribeColName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDescribeColName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDescribeColName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DescribeColNameContext describeColName() throws RecognitionException {
		DescribeColNameContext _localctx = new DescribeColNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_describeColName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1459);
			((DescribeColNameContext)_localctx).identifier = identifier();
			((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
			setState(1464);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(1460);
				match(DOT);
				setState(1461);
				((DescribeColNameContext)_localctx).identifier = identifier();
				((DescribeColNameContext)_localctx).nameParts.add(((DescribeColNameContext)_localctx).identifier);
				}
				}
				setState(1466);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CtesContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CtesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ctes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCtes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCtes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCtes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CtesContext ctes() throws RecognitionException {
		CtesContext _localctx = new CtesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ctes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			match(WITH);
			setState(1468);
			namedQuery();
			setState(1473);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1469);
				match(COMMA);
				setState(1470);
				namedQuery();
				}
				}
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public IdentifierListContext columnAliases;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1476);
			((NamedQueryContext)_localctx).name = errorCapturingIdentifier();
			setState(1478);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,157,_ctx) ) {
			case 1:
				{
				setState(1477);
				((NamedQueryContext)_localctx).columnAliases = identifierList();
				}
				break;
			}
			setState(1481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1480);
				match(AS);
				}
			}

			setState(1483);
			match(LEFT_PAREN);
			setState(1484);
			query();
			setState(1485);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableProviderContext extends ParserRuleContext {
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableProviderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProvider; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableProvider(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableProvider(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableProvider(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableProviderContext tableProvider() throws RecognitionException {
		TableProviderContext _localctx = new TableProviderContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tableProvider);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1487);
			match(USING);
			setState(1488);
			multipartIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateTableClausesContext extends ParserRuleContext {
		public PropertyListContext options;
		public PropertyListContext info;
		public PartitionFieldListContext partitioning;
		public PropertyListContext tableProps;
		public List<SkewSpecContext> skewSpec() {
			return getRuleContexts(SkewSpecContext.class);
		}
		public SkewSpecContext skewSpec(int i) {
			return getRuleContext(SkewSpecContext.class,i);
		}
		public List<BucketSpecContext> bucketSpec() {
			return getRuleContexts(BucketSpecContext.class);
		}
		public BucketSpecContext bucketSpec(int i) {
			return getRuleContext(BucketSpecContext.class,i);
		}
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public List<CreateFileFormatContext> createFileFormat() {
			return getRuleContexts(CreateFileFormatContext.class);
		}
		public CreateFileFormatContext createFileFormat(int i) {
			return getRuleContext(CreateFileFormatContext.class,i);
		}
		public List<LocationSpecContext> locationSpec() {
			return getRuleContexts(LocationSpecContext.class);
		}
		public LocationSpecContext locationSpec(int i) {
			return getRuleContext(LocationSpecContext.class,i);
		}
		public List<CommentSpecContext> commentSpec() {
			return getRuleContexts(CommentSpecContext.class);
		}
		public CommentSpecContext commentSpec(int i) {
			return getRuleContext(CommentSpecContext.class,i);
		}
		public List<TerminalNode> OPTIONS() { return getTokens(SqlBaseParser.OPTIONS); }
		public TerminalNode OPTIONS(int i) {
			return getToken(SqlBaseParser.OPTIONS, i);
		}
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public List<TerminalNode> PARTITIONED() { return getTokens(SqlBaseParser.PARTITIONED); }
		public TerminalNode PARTITIONED(int i) {
			return getToken(SqlBaseParser.PARTITIONED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<TerminalNode> TBLPROPERTIES() { return getTokens(SqlBaseParser.TBLPROPERTIES); }
		public TerminalNode TBLPROPERTIES(int i) {
			return getToken(SqlBaseParser.TBLPROPERTIES, i);
		}
		public List<PropertyListContext> propertyList() {
			return getRuleContexts(PropertyListContext.class);
		}
		public PropertyListContext propertyList(int i) {
			return getRuleContext(PropertyListContext.class,i);
		}
		public List<PartitionFieldListContext> partitionFieldList() {
			return getRuleContexts(PartitionFieldListContext.class);
		}
		public PartitionFieldListContext partitionFieldList(int i) {
			return getRuleContext(PartitionFieldListContext.class,i);
		}
		public CreateTableClausesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createTableClauses; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateTableClauses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateTableClauses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateTableClauses(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateTableClausesContext createTableClauses() throws RecognitionException {
		CreateTableClausesContext _localctx = new CreateTableClausesContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_createTableClauses);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1507);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(1505);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case OPTIONS:
						{
						{
						setState(1490);
						match(OPTIONS);
						setState(1491);
						((CreateTableClausesContext)_localctx).options = propertyList();
						}
						}
						break;
					case WITH:
						{
						{
						setState(1492);
						match(WITH);
						setState(1493);
						((CreateTableClausesContext)_localctx).info = propertyList();
						}
						}
						break;
					case PARTITIONED:
						{
						{
						setState(1494);
						match(PARTITIONED);
						setState(1495);
						match(BY);
						setState(1496);
						((CreateTableClausesContext)_localctx).partitioning = partitionFieldList();
						}
						}
						break;
					case SKEWED:
						{
						setState(1497);
						skewSpec();
						}
						break;
					case CLUSTERED:
						{
						setState(1498);
						bucketSpec();
						}
						break;
					case ROW:
						{
						setState(1499);
						rowFormat();
						}
						break;
					case STORED:
						{
						setState(1500);
						createFileFormat();
						}
						break;
					case LOCATION:
						{
						setState(1501);
						locationSpec();
						}
						break;
					case COMMENT:
						{
						setState(1502);
						commentSpec();
						}
						break;
					case TBLPROPERTIES:
						{
						{
						setState(1503);
						match(TBLPROPERTIES);
						setState(1504);
						((CreateTableClausesContext)_localctx).tableProps = propertyList();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(1509);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,160,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyListContext propertyList() throws RecognitionException {
		PropertyListContext _localctx = new PropertyListContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_propertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1510);
			match(LEFT_PAREN);
			setState(1511);
			property();
			setState(1516);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1512);
				match(COMMA);
				setState(1513);
				property();
				}
				}
				setState(1518);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1519);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyContext extends ParserRuleContext {
		public PropertyKeyContext key;
		public PropertyValueContext value;
		public PropertyKeyContext propertyKey() {
			return getRuleContext(PropertyKeyContext.class,0);
		}
		public PropertyValueContext propertyValue() {
			return getRuleContext(PropertyValueContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_property);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			((PropertyContext)_localctx).key = propertyKey();
			setState(1526);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FALSE || ((((_la - 259)) & ~0x3f) == 0 && ((1L << (_la - 259)) & ((1L << (TRUE - 259)) | (1L << (EQ - 259)) | (1L << (STRING - 259)) | (1L << (INTEGER_VALUE - 259)) | (1L << (DECIMAL_VALUE - 259)))) != 0)) {
				{
				setState(1523);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EQ) {
					{
					setState(1522);
					match(EQ);
					}
				}

				setState(1525);
				((PropertyContext)_localctx).value = propertyValue();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyKeyContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PropertyKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPropertyKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyKeyContext propertyKey() throws RecognitionException {
		PropertyKeyContext _localctx = new PropertyKeyContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_propertyKey);
		int _la;
		try {
			setState(1537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1528);
				identifier();
				setState(1533);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==DOT) {
					{
					{
					setState(1529);
					match(DOT);
					setState(1530);
					identifier();
					}
					}
					setState(1535);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1536);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PropertyValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public PropertyValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propertyValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPropertyValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPropertyValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPropertyValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropertyValueContext propertyValue() throws RecognitionException {
		PropertyValueContext _localctx = new PropertyValueContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_propertyValue);
		try {
			setState(1543);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1539);
				match(INTEGER_VALUE);
				}
				break;
			case DECIMAL_VALUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1540);
				match(DECIMAL_VALUE);
				}
				break;
			case FALSE:
			case TRUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(1541);
				booleanValue();
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 4);
				{
				setState(1542);
				match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantContext> constant() {
			return getRuleContexts(ConstantContext.class);
		}
		public ConstantContext constant(int i) {
			return getRuleContext(ConstantContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantListContext constantList() throws RecognitionException {
		ConstantListContext _localctx = new ConstantListContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_constantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1545);
			match(LEFT_PAREN);
			setState(1546);
			constant();
			setState(1551);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1547);
				match(COMMA);
				setState(1548);
				constant();
				}
				}
				setState(1553);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1554);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NestedConstantListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ConstantListContext> constantList() {
			return getRuleContexts(ConstantListContext.class);
		}
		public ConstantListContext constantList(int i) {
			return getRuleContext(ConstantListContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NestedConstantListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nestedConstantList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNestedConstantList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNestedConstantList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNestedConstantList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NestedConstantListContext nestedConstantList() throws RecognitionException {
		NestedConstantListContext _localctx = new NestedConstantListContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_nestedConstantList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1556);
			match(LEFT_PAREN);
			setState(1557);
			constantList();
			setState(1562);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1558);
				match(COMMA);
				setState(1559);
				constantList();
				}
				}
				setState(1564);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1565);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateFileFormatContext extends ParserRuleContext {
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public FileFormatContext fileFormat() {
			return getRuleContext(FileFormatContext.class,0);
		}
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public StorageHandlerContext storageHandler() {
			return getRuleContext(StorageHandlerContext.class,0);
		}
		public CreateFileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createFileFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateFileFormatContext createFileFormat() throws RecognitionException {
		CreateFileFormatContext _localctx = new CreateFileFormatContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_createFileFormat);
		try {
			setState(1573);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1567);
				match(STORED);
				setState(1568);
				match(AS);
				setState(1569);
				fileFormat();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1570);
				match(STORED);
				setState(1571);
				match(BY);
				setState(1572);
				storageHandler();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FileFormatContext extends ParserRuleContext {
		public FileFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fileFormat; }
	 
		public FileFormatContext() { }
		public void copyFrom(FileFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableFileFormatContext extends FileFormatContext {
		public Token inFmt;
		public Token outFmt;
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TableFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GenericFileFormatContext extends FileFormatContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GenericFileFormatContext(FileFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGenericFileFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGenericFileFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGenericFileFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FileFormatContext fileFormat() throws RecognitionException {
		FileFormatContext _localctx = new FileFormatContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_fileFormat);
		try {
			setState(1580);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
			case 1:
				_localctx = new TableFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1575);
				match(INPUTFORMAT);
				setState(1576);
				((TableFileFormatContext)_localctx).inFmt = match(STRING);
				setState(1577);
				match(OUTPUTFORMAT);
				setState(1578);
				((TableFileFormatContext)_localctx).outFmt = match(STRING);
				}
				break;
			case 2:
				_localctx = new GenericFileFormatContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1579);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StorageHandlerContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public StorageHandlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageHandler; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStorageHandler(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStorageHandler(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStorageHandler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageHandlerContext storageHandler() throws RecognitionException {
		StorageHandlerContext _localctx = new StorageHandlerContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_storageHandler);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1582);
			match(STRING);
			setState(1586);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,171,_ctx) ) {
			case 1:
				{
				setState(1583);
				match(WITH);
				setState(1584);
				match(SERDEPROPERTIES);
				setState(1585);
				propertyList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ResourceContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ResourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_resource; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterResource(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitResource(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitResource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ResourceContext resource() throws RecognitionException {
		ResourceContext _localctx = new ResourceContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_resource);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1588);
			identifier();
			setState(1589);
			match(STRING);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DmlStatementNoWithContext extends ParserRuleContext {
		public DmlStatementNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dmlStatementNoWith; }
	 
		public DmlStatementNoWithContext() { }
		public void copyFrom(DmlStatementNoWithContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DeleteFromTableContext extends DmlStatementNoWithContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public DeleteFromTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDeleteFromTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDeleteFromTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDeleteFromTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleInsertQueryContext extends DmlStatementNoWithContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SingleInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSingleInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSingleInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSingleInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MultiInsertQueryContext extends DmlStatementNoWithContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<MultiInsertQueryBodyContext> multiInsertQueryBody() {
			return getRuleContexts(MultiInsertQueryBodyContext.class);
		}
		public MultiInsertQueryBodyContext multiInsertQueryBody(int i) {
			return getRuleContext(MultiInsertQueryBodyContext.class,i);
		}
		public MultiInsertQueryContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiInsertQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiInsertQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultiInsertQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UpdateTableContext extends DmlStatementNoWithContext {
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SetClauseContext setClause() {
			return getRuleContext(SetClauseContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public UpdateTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUpdateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUpdateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUpdateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MergeIntoTableContext extends DmlStatementNoWithContext {
		public MultipartIdentifierContext target;
		public TableAliasContext targetAlias;
		public MultipartIdentifierContext source;
		public QueryContext sourceQuery;
		public TableAliasContext sourceAlias;
		public BooleanExpressionContext mergeCondition;
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TableAliasContext> tableAlias() {
			return getRuleContexts(TableAliasContext.class);
		}
		public TableAliasContext tableAlias(int i) {
			return getRuleContext(TableAliasContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public List<MatchedClauseContext> matchedClause() {
			return getRuleContexts(MatchedClauseContext.class);
		}
		public MatchedClauseContext matchedClause(int i) {
			return getRuleContext(MatchedClauseContext.class,i);
		}
		public List<NotMatchedClauseContext> notMatchedClause() {
			return getRuleContexts(NotMatchedClauseContext.class);
		}
		public NotMatchedClauseContext notMatchedClause(int i) {
			return getRuleContext(NotMatchedClauseContext.class,i);
		}
		public MergeIntoTableContext(DmlStatementNoWithContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMergeIntoTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMergeIntoTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMergeIntoTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DmlStatementNoWithContext dmlStatementNoWith() throws RecognitionException {
		DmlStatementNoWithContext _localctx = new DmlStatementNoWithContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_dmlStatementNoWith);
		int _la;
		try {
			int _alt;
			setState(1641);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				_localctx = new SingleInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1591);
				insertInto();
				setState(1592);
				query();
				}
				break;
			case FROM:
				_localctx = new MultiInsertQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1594);
				fromClause();
				setState(1596); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1595);
					multiInsertQueryBody();
					}
					}
					setState(1598); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==INSERT );
				}
				break;
			case DELETE:
				_localctx = new DeleteFromTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1600);
				match(DELETE);
				setState(1601);
				match(FROM);
				setState(1602);
				multipartIdentifier();
				setState(1603);
				tableAlias();
				setState(1605);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1604);
					whereClause();
					}
				}

				}
				break;
			case UPDATE:
				_localctx = new UpdateTableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1607);
				match(UPDATE);
				setState(1608);
				multipartIdentifier();
				setState(1609);
				tableAlias();
				setState(1610);
				setClause();
				setState(1612);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(1611);
					whereClause();
					}
				}

				}
				break;
			case MERGE:
				_localctx = new MergeIntoTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1614);
				match(MERGE);
				setState(1615);
				match(INTO);
				setState(1616);
				((MergeIntoTableContext)_localctx).target = multipartIdentifier();
				setState(1617);
				((MergeIntoTableContext)_localctx).targetAlias = tableAlias();
				setState(1618);
				match(USING);
				setState(1624);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
				case 1:
					{
					setState(1619);
					((MergeIntoTableContext)_localctx).source = multipartIdentifier();
					}
					break;
				case 2:
					{
					setState(1620);
					match(LEFT_PAREN);
					setState(1621);
					((MergeIntoTableContext)_localctx).sourceQuery = query();
					setState(1622);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(1626);
				((MergeIntoTableContext)_localctx).sourceAlias = tableAlias();
				setState(1627);
				match(ON);
				setState(1628);
				((MergeIntoTableContext)_localctx).mergeCondition = booleanExpression(0);
				setState(1632);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1629);
						matchedClause();
						}
						} 
					}
					setState(1634);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,176,_ctx);
				}
				setState(1638);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==WHEN) {
					{
					{
					setState(1635);
					notMatchedClause();
					}
					}
					setState(1640);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryOrganizationContext extends ParserRuleContext {
		public SortItemContext sortItem;
		public List<SortItemContext> order = new ArrayList<SortItemContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> clusterBy = new ArrayList<ExpressionContext>();
		public List<ExpressionContext> distributeBy = new ArrayList<ExpressionContext>();
		public List<SortItemContext> sort = new ArrayList<SortItemContext>();
		public ExpressionContext limit;
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryOrganizationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryOrganization; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryOrganization(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryOrganization(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQueryOrganization(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryOrganizationContext queryOrganization() throws RecognitionException {
		QueryOrganizationContext _localctx = new QueryOrganizationContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_queryOrganization);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1653);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
			case 1:
				{
				setState(1643);
				match(ORDER);
				setState(1644);
				match(BY);
				setState(1645);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1650);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1646);
						match(COMMA);
						setState(1647);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).order.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1652);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,179,_ctx);
				}
				}
				break;
			}
			setState(1665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
			case 1:
				{
				setState(1655);
				match(CLUSTER);
				setState(1656);
				match(BY);
				setState(1657);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1662);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1658);
						match(COMMA);
						setState(1659);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).clusterBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1664);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,181,_ctx);
				}
				}
				break;
			}
			setState(1677);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
			case 1:
				{
				setState(1667);
				match(DISTRIBUTE);
				setState(1668);
				match(BY);
				setState(1669);
				((QueryOrganizationContext)_localctx).expression = expression();
				((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
				setState(1674);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1670);
						match(COMMA);
						setState(1671);
						((QueryOrganizationContext)_localctx).expression = expression();
						((QueryOrganizationContext)_localctx).distributeBy.add(((QueryOrganizationContext)_localctx).expression);
						}
						} 
					}
					setState(1676);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,183,_ctx);
				}
				}
				break;
			}
			setState(1689);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
			case 1:
				{
				setState(1679);
				match(SORT);
				setState(1680);
				match(BY);
				setState(1681);
				((QueryOrganizationContext)_localctx).sortItem = sortItem();
				((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
				setState(1686);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1682);
						match(COMMA);
						setState(1683);
						((QueryOrganizationContext)_localctx).sortItem = sortItem();
						((QueryOrganizationContext)_localctx).sort.add(((QueryOrganizationContext)_localctx).sortItem);
						}
						} 
					}
					setState(1688);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,185,_ctx);
				}
				}
				break;
			}
			setState(1692);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
			case 1:
				{
				setState(1691);
				windowClause();
				}
				break;
			}
			setState(1699);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
			case 1:
				{
				setState(1694);
				match(LIMIT);
				setState(1697);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1695);
					match(ALL);
					}
					break;
				case 2:
					{
					setState(1696);
					((QueryOrganizationContext)_localctx).limit = expression();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiInsertQueryBodyContext extends ParserRuleContext {
		public InsertIntoContext insertInto() {
			return getRuleContext(InsertIntoContext.class,0);
		}
		public FromStatementBodyContext fromStatementBody() {
			return getRuleContext(FromStatementBodyContext.class,0);
		}
		public MultiInsertQueryBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiInsertQueryBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiInsertQueryBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiInsertQueryBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultiInsertQueryBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiInsertQueryBodyContext multiInsertQueryBody() throws RecognitionException {
		MultiInsertQueryBodyContext _localctx = new MultiInsertQueryBodyContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_multiInsertQueryBody);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1701);
			insertInto();
			setState(1702);
			fromStatementBody();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(1705);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(1730);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1728);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1707);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1708);
						if (!(legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "legacy_setops_precedence_enabled");
						setState(1709);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==INTERSECT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1711);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1710);
							setQuantifier();
							}
						}

						setState(1713);
						((SetOperationContext)_localctx).right = queryTerm(4);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1714);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1715);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1716);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(1718);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1717);
							setQuantifier();
							}
						}

						setState(1720);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 3:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(1721);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1722);
						if (!(!legacy_setops_precedence_enabled)) throw new FailedPredicateException(this, "!legacy_setops_precedence_enabled");
						setState(1723);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EXCEPT || _la==SETMINUS || _la==UNION) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(1725);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(1724);
							setQuantifier();
							}
						}

						setState(1727);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(1732);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,194,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault1Context extends QueryPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault1Context(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTableDefault1(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTableDefault1(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInlineTableDefault1(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FromStmtContext extends QueryPrimaryContext {
		public FromStatementContext fromStatement() {
			return getRuleContext(FromStatementContext.class,0);
		}
		public FromStmtContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_queryPrimary);
		try {
			setState(1742);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAP:
			case REDUCE:
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1733);
				querySpecification();
				}
				break;
			case FROM:
				_localctx = new FromStmtContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1734);
				fromStatement();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1735);
				match(TABLE);
				setState(1736);
				multipartIdentifier();
				}
				break;
			case VALUES:
				_localctx = new InlineTableDefault1Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1737);
				inlineTable();
				}
				break;
			case LEFT_PAREN:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1738);
				match(LEFT_PAREN);
				setState(1739);
				query();
				setState(1740);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrder;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1744);
			expression();
			setState(1746);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
			case 1:
				{
				setState(1745);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			setState(1750);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
			case 1:
				{
				setState(1748);
				match(NULLS);
				setState(1749);
				((SortItemContext)_localctx).nullOrder = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrder = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementContext extends ParserRuleContext {
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<FromStatementBodyContext> fromStatementBody() {
			return getRuleContexts(FromStatementBodyContext.class);
		}
		public FromStatementBodyContext fromStatementBody(int i) {
			return getRuleContext(FromStatementBodyContext.class,i);
		}
		public FromStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementContext fromStatement() throws RecognitionException {
		FromStatementContext _localctx = new FromStatementContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_fromStatement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1752);
			fromClause();
			setState(1754); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1753);
					fromStatementBody();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1756); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,198,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromStatementBodyContext extends ParserRuleContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public QueryOrganizationContext queryOrganization() {
			return getRuleContext(QueryOrganizationContext.class,0);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public FromStatementBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromStatementBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromStatementBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromStatementBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromStatementBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromStatementBodyContext fromStatementBody() throws RecognitionException {
		FromStatementBodyContext _localctx = new FromStatementBodyContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_fromStatementBody);
		try {
			int _alt;
			setState(1785);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1758);
				transformClause();
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1759);
					whereClause();
					}
					break;
				}
				setState(1762);
				queryOrganization();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1764);
				selectClause();
				setState(1768);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1765);
						lateralView();
						}
						} 
					}
					setState(1770);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,200,_ctx);
				}
				setState(1772);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1771);
					whereClause();
					}
					break;
				}
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1774);
					aggregationClause();
					}
					break;
				}
				setState(1778);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1777);
					havingClause();
					}
					break;
				}
				setState(1781);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
				case 1:
					{
					setState(1780);
					windowClause();
					}
					break;
				}
				setState(1783);
				queryOrganization();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
	 
		public QuerySpecificationContext() { }
		public void copyFrom(QuerySpecificationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RegularQuerySpecificationContext extends QuerySpecificationContext {
		public SelectClauseContext selectClause() {
			return getRuleContext(SelectClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public RegularQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRegularQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRegularQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRegularQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TransformQuerySpecificationContext extends QuerySpecificationContext {
		public TransformClauseContext transformClause() {
			return getRuleContext(TransformClauseContext.class,0);
		}
		public FromClauseContext fromClause() {
			return getRuleContext(FromClauseContext.class,0);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public WhereClauseContext whereClause() {
			return getRuleContext(WhereClauseContext.class,0);
		}
		public AggregationClauseContext aggregationClause() {
			return getRuleContext(AggregationClauseContext.class,0);
		}
		public HavingClauseContext havingClause() {
			return getRuleContext(HavingClauseContext.class,0);
		}
		public WindowClauseContext windowClause() {
			return getRuleContext(WindowClauseContext.class,0);
		}
		public TransformQuerySpecificationContext(QuerySpecificationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTransformQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_querySpecification);
		try {
			int _alt;
			setState(1831);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,218,_ctx) ) {
			case 1:
				_localctx = new TransformQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1787);
				transformClause();
				setState(1789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,206,_ctx) ) {
				case 1:
					{
					setState(1788);
					fromClause();
					}
					break;
				}
				setState(1794);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1791);
						lateralView();
						}
						} 
					}
					setState(1796);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,207,_ctx);
				}
				setState(1798);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,208,_ctx) ) {
				case 1:
					{
					setState(1797);
					whereClause();
					}
					break;
				}
				setState(1801);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,209,_ctx) ) {
				case 1:
					{
					setState(1800);
					aggregationClause();
					}
					break;
				}
				setState(1804);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,210,_ctx) ) {
				case 1:
					{
					setState(1803);
					havingClause();
					}
					break;
				}
				setState(1807);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,211,_ctx) ) {
				case 1:
					{
					setState(1806);
					windowClause();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RegularQuerySpecificationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1809);
				selectClause();
				setState(1811);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,212,_ctx) ) {
				case 1:
					{
					setState(1810);
					fromClause();
					}
					break;
				}
				setState(1816);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(1813);
						lateralView();
						}
						} 
					}
					setState(1818);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,213,_ctx);
				}
				setState(1820);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,214,_ctx) ) {
				case 1:
					{
					setState(1819);
					whereClause();
					}
					break;
				}
				setState(1823);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,215,_ctx) ) {
				case 1:
					{
					setState(1822);
					aggregationClause();
					}
					break;
				}
				setState(1826);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,216,_ctx) ) {
				case 1:
					{
					setState(1825);
					havingClause();
					}
					break;
				}
				setState(1829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,217,_ctx) ) {
				case 1:
					{
					setState(1828);
					windowClause();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformClauseContext extends ParserRuleContext {
		public Token kind;
		public RowFormatContext inRowFormat;
		public Token recordWriter;
		public Token script;
		public RowFormatContext outRowFormat;
		public Token recordReader;
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public ExpressionSeqContext expressionSeq() {
			return getRuleContext(ExpressionSeqContext.class,0);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public List<RowFormatContext> rowFormat() {
			return getRuleContexts(RowFormatContext.class);
		}
		public RowFormatContext rowFormat(int i) {
			return getRuleContext(RowFormatContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public ColTypeListContext colTypeList() {
			return getRuleContext(ColTypeListContext.class,0);
		}
		public TransformClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTransformClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformClauseContext transformClause() throws RecognitionException {
		TransformClauseContext _localctx = new TransformClauseContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_transformClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1852);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				{
				setState(1833);
				match(SELECT);
				setState(1834);
				((TransformClauseContext)_localctx).kind = match(TRANSFORM);
				setState(1835);
				match(LEFT_PAREN);
				setState(1837);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,219,_ctx) ) {
				case 1:
					{
					setState(1836);
					setQuantifier();
					}
					break;
				}
				setState(1839);
				expressionSeq();
				setState(1840);
				match(RIGHT_PAREN);
				}
				break;
			case MAP:
				{
				setState(1842);
				((TransformClauseContext)_localctx).kind = match(MAP);
				setState(1844);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,220,_ctx) ) {
				case 1:
					{
					setState(1843);
					setQuantifier();
					}
					break;
				}
				setState(1846);
				expressionSeq();
				}
				break;
			case REDUCE:
				{
				setState(1847);
				((TransformClauseContext)_localctx).kind = match(REDUCE);
				setState(1849);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,221,_ctx) ) {
				case 1:
					{
					setState(1848);
					setQuantifier();
					}
					break;
				}
				setState(1851);
				expressionSeq();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1855);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ROW) {
				{
				setState(1854);
				((TransformClauseContext)_localctx).inRowFormat = rowFormat();
				}
			}

			setState(1859);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RECORDWRITER) {
				{
				setState(1857);
				match(RECORDWRITER);
				setState(1858);
				((TransformClauseContext)_localctx).recordWriter = match(STRING);
				}
			}

			setState(1861);
			match(USING);
			setState(1862);
			((TransformClauseContext)_localctx).script = match(STRING);
			setState(1875);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,227,_ctx) ) {
			case 1:
				{
				setState(1863);
				match(AS);
				setState(1873);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,226,_ctx) ) {
				case 1:
					{
					setState(1864);
					identifierSeq();
					}
					break;
				case 2:
					{
					setState(1865);
					colTypeList();
					}
					break;
				case 3:
					{
					{
					setState(1866);
					match(LEFT_PAREN);
					setState(1869);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,225,_ctx) ) {
					case 1:
						{
						setState(1867);
						identifierSeq();
						}
						break;
					case 2:
						{
						setState(1868);
						colTypeList();
						}
						break;
					}
					setState(1871);
					match(RIGHT_PAREN);
					}
					}
					break;
				}
				}
				break;
			}
			setState(1878);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,228,_ctx) ) {
			case 1:
				{
				setState(1877);
				((TransformClauseContext)_localctx).outRowFormat = rowFormat();
				}
				break;
			}
			setState(1882);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,229,_ctx) ) {
			case 1:
				{
				setState(1880);
				match(RECORDREADER);
				setState(1881);
				((TransformClauseContext)_localctx).recordReader = match(STRING);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectClauseContext extends ParserRuleContext {
		public HintContext hint;
		public List<HintContext> hints = new ArrayList<HintContext>();
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<HintContext> hint() {
			return getRuleContexts(HintContext.class);
		}
		public HintContext hint(int i) {
			return getRuleContext(HintContext.class,i);
		}
		public SelectClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSelectClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSelectClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSelectClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectClauseContext selectClause() throws RecognitionException {
		SelectClauseContext _localctx = new SelectClauseContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_selectClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1884);
			match(SELECT);
			setState(1888);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1885);
					((SelectClauseContext)_localctx).hint = hint();
					((SelectClauseContext)_localctx).hints.add(((SelectClauseContext)_localctx).hint);
					}
					} 
				}
				setState(1890);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,230,_ctx);
			}
			setState(1892);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,231,_ctx) ) {
			case 1:
				{
				setState(1891);
				setQuantifier();
				}
				break;
			}
			setState(1894);
			namedExpressionSeq();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetClauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public SetClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetClauseContext setClause() throws RecognitionException {
		SetClauseContext _localctx = new SetClauseContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_setClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1896);
			match(SET);
			setState(1897);
			assignmentList();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext matchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public MatchedActionContext matchedAction() {
			return getRuleContext(MatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public MatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedClauseContext matchedClause() throws RecognitionException {
		MatchedClauseContext _localctx = new MatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_matchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1899);
			match(WHEN);
			setState(1900);
			match(MATCHED);
			setState(1903);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1901);
				match(AND);
				setState(1902);
				((MatchedClauseContext)_localctx).matchedCond = booleanExpression(0);
				}
			}

			setState(1905);
			match(THEN);
			setState(1906);
			matchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedClauseContext extends ParserRuleContext {
		public BooleanExpressionContext notMatchedCond;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public NotMatchedActionContext notMatchedAction() {
			return getRuleContext(NotMatchedActionContext.class,0);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public NotMatchedClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNotMatchedClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedClauseContext notMatchedClause() throws RecognitionException {
		NotMatchedClauseContext _localctx = new NotMatchedClauseContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_notMatchedClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1908);
			match(WHEN);
			setState(1909);
			match(NOT);
			setState(1910);
			match(MATCHED);
			setState(1913);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AND) {
				{
				setState(1911);
				match(AND);
				setState(1912);
				((NotMatchedClauseContext)_localctx).notMatchedCond = booleanExpression(0);
				}
			}

			setState(1915);
			match(THEN);
			setState(1916);
			notMatchedAction();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MatchedActionContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public AssignmentListContext assignmentList() {
			return getRuleContext(AssignmentListContext.class,0);
		}
		public MatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchedActionContext matchedAction() throws RecognitionException {
		MatchedActionContext _localctx = new MatchedActionContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_matchedAction);
		try {
			setState(1925);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,234,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1918);
				match(DELETE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1919);
				match(UPDATE);
				setState(1920);
				match(SET);
				setState(1921);
				match(ASTERISK);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1922);
				match(UPDATE);
				setState(1923);
				match(SET);
				setState(1924);
				assignmentList();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NotMatchedActionContext extends ParserRuleContext {
		public MultipartIdentifierListContext columns;
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public MultipartIdentifierListContext multipartIdentifierList() {
			return getRuleContext(MultipartIdentifierListContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NotMatchedActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notMatchedAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNotMatchedAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNotMatchedAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNotMatchedAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotMatchedActionContext notMatchedAction() throws RecognitionException {
		NotMatchedActionContext _localctx = new NotMatchedActionContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_notMatchedAction);
		int _la;
		try {
			setState(1945);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,236,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1927);
				match(INSERT);
				setState(1928);
				match(ASTERISK);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1929);
				match(INSERT);
				setState(1930);
				match(LEFT_PAREN);
				setState(1931);
				((NotMatchedActionContext)_localctx).columns = multipartIdentifierList();
				setState(1932);
				match(RIGHT_PAREN);
				setState(1933);
				match(VALUES);
				setState(1934);
				match(LEFT_PAREN);
				setState(1935);
				expression();
				setState(1940);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1936);
					match(COMMA);
					setState(1937);
					expression();
					}
					}
					setState(1942);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1943);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentListContext extends ParserRuleContext {
		public List<AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public AssignmentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAssignmentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAssignmentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAssignmentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentListContext assignmentList() throws RecognitionException {
		AssignmentListContext _localctx = new AssignmentListContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_assignmentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			assignment();
			setState(1952);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1948);
				match(COMMA);
				setState(1949);
				assignment();
				}
				}
				setState(1954);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public MultipartIdentifierContext key;
		public ExpressionContext value;
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAssignment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAssignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1955);
			((AssignmentContext)_localctx).key = multipartIdentifier();
			setState(1956);
			match(EQ);
			setState(1957);
			((AssignmentContext)_localctx).value = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhereClauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public WhereClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whereClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWhereClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWhereClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWhereClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereClauseContext whereClause() throws RecognitionException {
		WhereClauseContext _localctx = new WhereClauseContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_whereClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1959);
			match(WHERE);
			setState(1960);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingClauseContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public HavingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_havingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHavingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHavingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHavingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingClauseContext havingClause() throws RecognitionException {
		HavingClauseContext _localctx = new HavingClauseContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_havingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1962);
			match(HAVING);
			setState(1963);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintContext extends ParserRuleContext {
		public HintStatementContext hintStatement;
		public List<HintStatementContext> hintStatements = new ArrayList<HintStatementContext>();
		public TerminalNode HENT_START() { return getToken(SqlBaseParser.HENT_START, 0); }
		public TerminalNode HENT_END() { return getToken(SqlBaseParser.HENT_END, 0); }
		public List<HintStatementContext> hintStatement() {
			return getRuleContexts(HintStatementContext.class);
		}
		public HintStatementContext hintStatement(int i) {
			return getRuleContext(HintStatementContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintContext hint() throws RecognitionException {
		HintContext _localctx = new HintContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_hint);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1965);
			match(HENT_START);
			setState(1966);
			((HintContext)_localctx).hintStatement = hintStatement();
			((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
			setState(1973);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1968);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,238,_ctx) ) {
					case 1:
						{
						setState(1967);
						match(COMMA);
						}
						break;
					}
					setState(1970);
					((HintContext)_localctx).hintStatement = hintStatement();
					((HintContext)_localctx).hintStatements.add(((HintContext)_localctx).hintStatement);
					}
					} 
				}
				setState(1975);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,239,_ctx);
			}
			setState(1976);
			match(HENT_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HintStatementContext extends ParserRuleContext {
		public IdentifierContext hintName;
		public PrimaryExpressionContext primaryExpression;
		public List<PrimaryExpressionContext> parameters = new ArrayList<PrimaryExpressionContext>();
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public HintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hintStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterHintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitHintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitHintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HintStatementContext hintStatement() throws RecognitionException {
		HintStatementContext _localctx = new HintStatementContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_hintStatement);
		int _la;
		try {
			setState(1991);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,241,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1978);
				((HintStatementContext)_localctx).hintName = identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1979);
				((HintStatementContext)_localctx).hintName = identifier();
				setState(1980);
				match(LEFT_PAREN);
				setState(1981);
				((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
				((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
				setState(1986);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1982);
					match(COMMA);
					setState(1983);
					((HintStatementContext)_localctx).primaryExpression = primaryExpression(0);
					((HintStatementContext)_localctx).parameters.add(((HintStatementContext)_localctx).primaryExpression);
					}
					}
					setState(1988);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1989);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FromClauseContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<LateralViewContext> lateralView() {
			return getRuleContexts(LateralViewContext.class);
		}
		public LateralViewContext lateralView(int i) {
			return getRuleContext(LateralViewContext.class,i);
		}
		public PivotClauseContext pivotClause() {
			return getRuleContext(PivotClauseContext.class,0);
		}
		public FromClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fromClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFromClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFromClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFromClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FromClauseContext fromClause() throws RecognitionException {
		FromClauseContext _localctx = new FromClauseContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_fromClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1993);
			match(FROM);
			setState(1994);
			relation();
			setState(1999);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1995);
					match(COMMA);
					setState(1996);
					relation();
					}
					} 
				}
				setState(2001);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,242,_ctx);
			}
			setState(2005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2002);
					lateralView();
					}
					} 
				}
				setState(2007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,243,_ctx);
			}
			setState(2009);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,244,_ctx) ) {
			case 1:
				{
				setState(2008);
				pivotClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TemporalClauseContext extends ParserRuleContext {
		public Token version;
		public ValueExpressionContext timestamp;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TemporalClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTemporalClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTemporalClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTemporalClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporalClauseContext temporalClause() throws RecognitionException {
		TemporalClauseContext _localctx = new TemporalClauseContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_temporalClause);
		int _la;
		try {
			setState(2025);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,247,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2012);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2011);
					match(FOR);
					}
				}

				setState(2014);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_VERSION || _la==VERSION) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2015);
				match(AS);
				setState(2016);
				match(OF);
				setState(2017);
				((TemporalClauseContext)_localctx).version = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==STRING || _la==INTEGER_VALUE) ) {
					((TemporalClauseContext)_localctx).version = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2019);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2018);
					match(FOR);
					}
				}

				setState(2021);
				_la = _input.LA(1);
				if ( !(_la==SYSTEM_TIME || _la==TIMESTAMP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2022);
				match(AS);
				setState(2023);
				match(OF);
				setState(2024);
				((TemporalClauseContext)_localctx).timestamp = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AggregationClauseContext extends ParserRuleContext {
		public GroupByClauseContext groupByClause;
		public List<GroupByClauseContext> groupingExpressionsWithGroupingAnalytics = new ArrayList<GroupByClauseContext>();
		public ExpressionContext expression;
		public List<ExpressionContext> groupingExpressions = new ArrayList<ExpressionContext>();
		public Token kind;
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<GroupByClauseContext> groupByClause() {
			return getRuleContexts(GroupByClauseContext.class);
		}
		public GroupByClauseContext groupByClause(int i) {
			return getRuleContext(GroupByClauseContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public AggregationClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAggregationClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAggregationClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAggregationClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationClauseContext aggregationClause() throws RecognitionException {
		AggregationClauseContext _localctx = new AggregationClauseContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_aggregationClause);
		int _la;
		try {
			int _alt;
			setState(2066);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,252,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2027);
				match(GROUP);
				setState(2028);
				match(BY);
				setState(2029);
				((AggregationClauseContext)_localctx).groupByClause = groupByClause();
				((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
				setState(2034);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2030);
						match(COMMA);
						setState(2031);
						((AggregationClauseContext)_localctx).groupByClause = groupByClause();
						((AggregationClauseContext)_localctx).groupingExpressionsWithGroupingAnalytics.add(((AggregationClauseContext)_localctx).groupByClause);
						}
						} 
					}
					setState(2036);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,248,_ctx);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2037);
				match(GROUP);
				setState(2038);
				match(BY);
				setState(2039);
				((AggregationClauseContext)_localctx).expression = expression();
				((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
				setState(2044);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2040);
						match(COMMA);
						setState(2041);
						((AggregationClauseContext)_localctx).expression = expression();
						((AggregationClauseContext)_localctx).groupingExpressions.add(((AggregationClauseContext)_localctx).expression);
						}
						} 
					}
					setState(2046);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,249,_ctx);
				}
				setState(2064);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,251,_ctx) ) {
				case 1:
					{
					setState(2047);
					match(WITH);
					setState(2048);
					((AggregationClauseContext)_localctx).kind = match(ROLLUP);
					}
					break;
				case 2:
					{
					setState(2049);
					match(WITH);
					setState(2050);
					((AggregationClauseContext)_localctx).kind = match(CUBE);
					}
					break;
				case 3:
					{
					setState(2051);
					((AggregationClauseContext)_localctx).kind = match(GROUPING);
					setState(2052);
					match(SETS);
					setState(2053);
					match(LEFT_PAREN);
					setState(2054);
					groupingSet();
					setState(2059);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2055);
						match(COMMA);
						setState(2056);
						groupingSet();
						}
						}
						setState(2061);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2062);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByClauseContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public GroupByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByClauseContext groupByClause() throws RecognitionException {
		GroupByClauseContext _localctx = new GroupByClauseContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_groupByClause);
		try {
			setState(2070);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,253,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2068);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2069);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingAnalyticsContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public GroupingAnalyticsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingAnalytics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingAnalytics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingAnalytics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupingAnalytics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingAnalyticsContext groupingAnalytics() throws RecognitionException {
		GroupingAnalyticsContext _localctx = new GroupingAnalyticsContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_groupingAnalytics);
		int _la;
		try {
			setState(2097);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUBE:
			case ROLLUP:
				enterOuterAlt(_localctx, 1);
				{
				setState(2072);
				_la = _input.LA(1);
				if ( !(_la==CUBE || _la==ROLLUP) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2073);
				match(LEFT_PAREN);
				setState(2074);
				groupingSet();
				setState(2079);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2075);
					match(COMMA);
					setState(2076);
					groupingSet();
					}
					}
					setState(2081);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2082);
				match(RIGHT_PAREN);
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2084);
				match(GROUPING);
				setState(2085);
				match(SETS);
				setState(2086);
				match(LEFT_PAREN);
				setState(2087);
				groupingElement();
				setState(2092);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2088);
					match(COMMA);
					setState(2089);
					groupingElement();
					}
					}
					setState(2094);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2095);
				match(RIGHT_PAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingAnalyticsContext groupingAnalytics() {
			return getRuleContext(GroupingAnalyticsContext.class,0);
		}
		public GroupingSetContext groupingSet() {
			return getRuleContext(GroupingSetContext.class,0);
		}
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupingElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_groupingElement);
		try {
			setState(2101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,257,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2099);
				groupingAnalytics();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2100);
				groupingSet();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_groupingSet);
		int _la;
		try {
			setState(2116);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,260,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2103);
				match(LEFT_PAREN);
				setState(2112);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,259,_ctx) ) {
				case 1:
					{
					setState(2104);
					expression();
					setState(2109);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2105);
						match(COMMA);
						setState(2106);
						expression();
						}
						}
						setState(2111);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2114);
				match(RIGHT_PAREN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2115);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotClauseContext extends ParserRuleContext {
		public NamedExpressionSeqContext aggregates;
		public PivotValueContext pivotValue;
		public List<PivotValueContext> pivotValues = new ArrayList<PivotValueContext>();
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public PivotColumnContext pivotColumn() {
			return getRuleContext(PivotColumnContext.class,0);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public NamedExpressionSeqContext namedExpressionSeq() {
			return getRuleContext(NamedExpressionSeqContext.class,0);
		}
		public List<PivotValueContext> pivotValue() {
			return getRuleContexts(PivotValueContext.class);
		}
		public PivotValueContext pivotValue(int i) {
			return getRuleContext(PivotValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPivotClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotClauseContext pivotClause() throws RecognitionException {
		PivotClauseContext _localctx = new PivotClauseContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_pivotClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2118);
			match(PIVOT);
			setState(2119);
			match(LEFT_PAREN);
			setState(2120);
			((PivotClauseContext)_localctx).aggregates = namedExpressionSeq();
			setState(2121);
			match(FOR);
			setState(2122);
			pivotColumn();
			setState(2123);
			match(IN);
			setState(2124);
			match(LEFT_PAREN);
			setState(2125);
			((PivotClauseContext)_localctx).pivotValue = pivotValue();
			((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
			setState(2130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2126);
				match(COMMA);
				setState(2127);
				((PivotClauseContext)_localctx).pivotValue = pivotValue();
				((PivotClauseContext)_localctx).pivotValues.add(((PivotClauseContext)_localctx).pivotValue);
				}
				}
				setState(2132);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2133);
			match(RIGHT_PAREN);
			setState(2134);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotColumnContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> identifiers = new ArrayList<IdentifierContext>();
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PivotColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPivotColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotColumnContext pivotColumn() throws RecognitionException {
		PivotColumnContext _localctx = new PivotColumnContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_pivotColumn);
		int _la;
		try {
			setState(2148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,263,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2136);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2137);
				match(LEFT_PAREN);
				setState(2138);
				((PivotColumnContext)_localctx).identifier = identifier();
				((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
				setState(2143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2139);
					match(COMMA);
					setState(2140);
					((PivotColumnContext)_localctx).identifier = identifier();
					((PivotColumnContext)_localctx).identifiers.add(((PivotColumnContext)_localctx).identifier);
					}
					}
					setState(2145);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2146);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PivotValueContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public PivotValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pivotValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPivotValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPivotValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPivotValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PivotValueContext pivotValue() throws RecognitionException {
		PivotValueContext _localctx = new PivotValueContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_pivotValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2150);
			expression();
			setState(2155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,265,_ctx) ) {
			case 1:
				{
				setState(2152);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,264,_ctx) ) {
				case 1:
					{
					setState(2151);
					match(AS);
					}
					break;
				}
				setState(2154);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LateralViewContext extends ParserRuleContext {
		public IdentifierContext tblName;
		public IdentifierContext identifier;
		public List<IdentifierContext> colName = new ArrayList<IdentifierContext>();
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public LateralViewContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lateralView; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLateralView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLateralView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLateralView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LateralViewContext lateralView() throws RecognitionException {
		LateralViewContext _localctx = new LateralViewContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_lateralView);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2157);
			match(LATERAL);
			setState(2158);
			match(VIEW);
			setState(2160);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,266,_ctx) ) {
			case 1:
				{
				setState(2159);
				match(OUTER);
				}
				break;
			}
			setState(2162);
			qualifiedName();
			setState(2163);
			match(LEFT_PAREN);
			setState(2172);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,268,_ctx) ) {
			case 1:
				{
				setState(2164);
				expression();
				setState(2169);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2165);
					match(COMMA);
					setState(2166);
					expression();
					}
					}
					setState(2171);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2174);
			match(RIGHT_PAREN);
			setState(2175);
			((LateralViewContext)_localctx).tblName = identifier();
			setState(2187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,271,_ctx) ) {
			case 1:
				{
				setState(2177);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,269,_ctx) ) {
				case 1:
					{
					setState(2176);
					match(AS);
					}
					break;
				}
				setState(2179);
				((LateralViewContext)_localctx).identifier = identifier();
				((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
				setState(2184);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(2180);
						match(COMMA);
						setState(2181);
						((LateralViewContext)_localctx).identifier = identifier();
						((LateralViewContext)_localctx).colName.add(((LateralViewContext)_localctx).identifier);
						}
						} 
					}
					setState(2186);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,270,_ctx);
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2189);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public List<JoinRelationContext> joinRelation() {
			return getRuleContexts(JoinRelationContext.class);
		}
		public JoinRelationContext joinRelation(int i) {
			return getRuleContext(JoinRelationContext.class,i);
		}
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		RelationContext _localctx = new RelationContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_relation);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2192);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,272,_ctx) ) {
			case 1:
				{
				setState(2191);
				match(LATERAL);
				}
				break;
			}
			setState(2194);
			relationPrimary();
			setState(2198);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2195);
					joinRelation();
					}
					} 
				}
				setState(2200);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,273,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinRelationContext extends ParserRuleContext {
		public RelationPrimaryContext right;
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public JoinRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinRelationContext joinRelation() throws RecognitionException {
		JoinRelationContext _localctx = new JoinRelationContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_joinRelation);
		try {
			setState(2218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ANTI:
			case CROSS:
			case FULL:
			case INNER:
			case JOIN:
			case LEFT:
			case RIGHT:
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(2201);
				joinType();
				}
				setState(2202);
				match(JOIN);
				setState(2204);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,274,_ctx) ) {
				case 1:
					{
					setState(2203);
					match(LATERAL);
					}
					break;
				}
				setState(2206);
				((JoinRelationContext)_localctx).right = relationPrimary();
				setState(2208);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,275,_ctx) ) {
				case 1:
					{
					setState(2207);
					joinCriteria();
					}
					break;
				}
				}
				break;
			case NATURAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(2210);
				match(NATURAL);
				setState(2211);
				joinType();
				setState(2212);
				match(JOIN);
				setState(2214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,276,_ctx) ) {
				case 1:
					{
					setState(2213);
					match(LATERAL);
					}
					break;
				}
				setState(2216);
				((JoinRelationContext)_localctx).right = relationPrimary();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_joinType);
		int _la;
		try {
			setState(2244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,284,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(2220);
					match(INNER);
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2223);
				match(CROSS);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2224);
				match(LEFT);
				setState(2226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2225);
					match(OUTER);
					}
				}

				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2228);
					match(LEFT);
					}
				}

				setState(2231);
				match(SEMI);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2232);
				match(RIGHT);
				setState(2234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2233);
					match(OUTER);
					}
				}

				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2236);
				match(FULL);
				setState(2238);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(2237);
					match(OUTER);
					}
				}

				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2241);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LEFT) {
					{
					setState(2240);
					match(LEFT);
					}
				}

				setState(2243);
				match(ANTI);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_joinCriteria);
		try {
			setState(2250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(2246);
				match(ON);
				setState(2247);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(2248);
				match(USING);
				setState(2249);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleContext extends ParserRuleContext {
		public Token seed;
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public SampleMethodContext sampleMethod() {
			return getRuleContext(SampleMethodContext.class,0);
		}
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public SampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sample; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSample(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSample(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleContext sample() throws RecognitionException {
		SampleContext _localctx = new SampleContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_sample);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2252);
			match(TABLESAMPLE);
			setState(2253);
			match(LEFT_PAREN);
			setState(2255);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,286,_ctx) ) {
			case 1:
				{
				setState(2254);
				sampleMethod();
				}
				break;
			}
			setState(2257);
			match(RIGHT_PAREN);
			setState(2262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,287,_ctx) ) {
			case 1:
				{
				setState(2258);
				match(REPEATABLE);
				setState(2259);
				match(LEFT_PAREN);
				setState(2260);
				((SampleContext)_localctx).seed = match(INTEGER_VALUE);
				setState(2261);
				match(RIGHT_PAREN);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleMethodContext extends ParserRuleContext {
		public SampleMethodContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleMethod; }
	 
		public SampleMethodContext() { }
		public void copyFrom(SampleMethodContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SampleByRowsContext extends SampleMethodContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public SampleByRowsContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByRows(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByRows(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByRows(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByPercentileContext extends SampleMethodContext {
		public Token negativeSign;
		public Token percentage;
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SampleByPercentileContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBucketContext extends SampleMethodContext {
		public Token sampleType;
		public Token numerator;
		public Token denominator;
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SampleByBucketContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByBucket(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByBucket(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByBucket(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SampleByBytesContext extends SampleMethodContext {
		public ExpressionContext bytes;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SampleByBytesContext(SampleMethodContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSampleByBytes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSampleByBytes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSampleByBytes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleMethodContext sampleMethod() throws RecognitionException {
		SampleMethodContext _localctx = new SampleMethodContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_sampleMethod);
		int _la;
		try {
			setState(2288);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,291,_ctx) ) {
			case 1:
				_localctx = new SampleByPercentileContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2265);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(2264);
					((SampleByPercentileContext)_localctx).negativeSign = match(MINUS);
					}
				}

				setState(2267);
				((SampleByPercentileContext)_localctx).percentage = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==INTEGER_VALUE || _la==DECIMAL_VALUE) ) {
					((SampleByPercentileContext)_localctx).percentage = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2268);
				match(PERCENTLIT);
				}
				break;
			case 2:
				_localctx = new SampleByRowsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2269);
				expression();
				setState(2270);
				match(ROWS);
				}
				break;
			case 3:
				_localctx = new SampleByBucketContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2272);
				((SampleByBucketContext)_localctx).sampleType = match(BUCKET);
				setState(2273);
				((SampleByBucketContext)_localctx).numerator = match(INTEGER_VALUE);
				setState(2274);
				match(OUT);
				setState(2275);
				match(OF);
				setState(2276);
				((SampleByBucketContext)_localctx).denominator = match(INTEGER_VALUE);
				setState(2285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(2277);
					match(ON);
					setState(2283);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,289,_ctx) ) {
					case 1:
						{
						setState(2278);
						identifier();
						}
						break;
					case 2:
						{
						setState(2279);
						qualifiedName();
						setState(2280);
						match(LEFT_PAREN);
						setState(2281);
						match(RIGHT_PAREN);
						}
						break;
					}
					}
				}

				}
				break;
			case 4:
				_localctx = new SampleByBytesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2287);
				((SampleByBytesContext)_localctx).bytes = expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public IdentifierSeqContext identifierSeq() {
			return getRuleContext(IdentifierSeqContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_identifierList);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2290);
			match(LEFT_PAREN);
			setState(2291);
			identifierSeq();
			setState(2292);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierSeqContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> ident = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierSeqContext identifierSeq() throws RecognitionException {
		IdentifierSeqContext _localctx = new IdentifierSeqContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_identifierSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2294);
			((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
			setState(2299);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2295);
					match(COMMA);
					setState(2296);
					((IdentifierSeqContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((IdentifierSeqContext)_localctx).ident.add(((IdentifierSeqContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2301);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,292,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<OrderedIdentifierContext> orderedIdentifier() {
			return getRuleContexts(OrderedIdentifierContext.class);
		}
		public OrderedIdentifierContext orderedIdentifier(int i) {
			return getRuleContext(OrderedIdentifierContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public OrderedIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOrderedIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOrderedIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitOrderedIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierListContext orderedIdentifierList() throws RecognitionException {
		OrderedIdentifierListContext _localctx = new OrderedIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_orderedIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2302);
			match(LEFT_PAREN);
			setState(2303);
			orderedIdentifier();
			setState(2308);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2304);
				match(COMMA);
				setState(2305);
				orderedIdentifier();
				}
				}
				setState(2310);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2311);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderedIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext ident;
		public Token ordering;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public OrderedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOrderedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOrderedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitOrderedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderedIdentifierContext orderedIdentifier() throws RecognitionException {
		OrderedIdentifierContext _localctx = new OrderedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_orderedIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2313);
			((OrderedIdentifierContext)_localctx).ident = errorCapturingIdentifier();
			setState(2315);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(2314);
				((OrderedIdentifierContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((OrderedIdentifierContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentListContext extends ParserRuleContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<IdentifierCommentContext> identifierComment() {
			return getRuleContexts(IdentifierCommentContext.class);
		}
		public IdentifierCommentContext identifierComment(int i) {
			return getRuleContext(IdentifierCommentContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public IdentifierCommentListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierCommentList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierCommentList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierCommentList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierCommentList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentListContext identifierCommentList() throws RecognitionException {
		IdentifierCommentListContext _localctx = new IdentifierCommentListContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_identifierCommentList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2317);
			match(LEFT_PAREN);
			setState(2318);
			identifierComment();
			setState(2323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2319);
				match(COMMA);
				setState(2320);
				identifierComment();
				}
				}
				setState(2325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2326);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierCommentContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public IdentifierCommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierComment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifierComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifierComment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifierComment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierCommentContext identifierComment() throws RecognitionException {
		IdentifierCommentContext _localctx = new IdentifierCommentContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_identifierComment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2328);
			identifier();
			setState(2330);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(2329);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TableValuedFunctionContext extends RelationPrimaryContext {
		public FunctionTableContext functionTable() {
			return getRuleContext(FunctionTableContext.class,0);
		}
		public TableValuedFunctionContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableValuedFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableValuedFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableValuedFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableDefault2Context extends RelationPrimaryContext {
		public InlineTableContext inlineTable() {
			return getRuleContext(InlineTableContext.class,0);
		}
		public InlineTableDefault2Context(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTableDefault2(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTableDefault2(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInlineTableDefault2(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedRelationContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AliasedQueryContext extends RelationPrimaryContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public AliasedQueryContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAliasedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAliasedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAliasedQuery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public TemporalClauseContext temporalClause() {
			return getRuleContext(TemporalClauseContext.class,0);
		}
		public SampleContext sample() {
			return getRuleContext(SampleContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_relationPrimary);
		try {
			setState(2359);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,301,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2332);
				multipartIdentifier();
				setState(2334);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,297,_ctx) ) {
				case 1:
					{
					setState(2333);
					temporalClause();
					}
					break;
				}
				setState(2337);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,298,_ctx) ) {
				case 1:
					{
					setState(2336);
					sample();
					}
					break;
				}
				setState(2339);
				tableAlias();
				}
				break;
			case 2:
				_localctx = new AliasedQueryContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2341);
				match(LEFT_PAREN);
				setState(2342);
				query();
				setState(2343);
				match(RIGHT_PAREN);
				setState(2345);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,299,_ctx) ) {
				case 1:
					{
					setState(2344);
					sample();
					}
					break;
				}
				setState(2347);
				tableAlias();
				}
				break;
			case 3:
				_localctx = new AliasedRelationContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2349);
				match(LEFT_PAREN);
				setState(2350);
				relation();
				setState(2351);
				match(RIGHT_PAREN);
				setState(2353);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,300,_ctx) ) {
				case 1:
					{
					setState(2352);
					sample();
					}
					break;
				}
				setState(2355);
				tableAlias();
				}
				break;
			case 4:
				_localctx = new InlineTableDefault2Context(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2357);
				inlineTable();
				}
				break;
			case 5:
				_localctx = new TableValuedFunctionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2358);
				functionTable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InlineTableContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public InlineTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inlineTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InlineTableContext inlineTable() throws RecognitionException {
		InlineTableContext _localctx = new InlineTableContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_inlineTable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2361);
			match(VALUES);
			setState(2362);
			expression();
			setState(2367);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2363);
					match(COMMA);
					setState(2364);
					expression();
					}
					} 
				}
				setState(2369);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,302,_ctx);
			}
			setState(2370);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionTableContext extends ParserRuleContext {
		public FunctionNameContext funcName;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TableAliasContext tableAlias() {
			return getRuleContext(TableAliasContext.class,0);
		}
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionTableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionTable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionTableContext functionTable() throws RecognitionException {
		FunctionTableContext _localctx = new FunctionTableContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_functionTable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2372);
			((FunctionTableContext)_localctx).funcName = functionName();
			setState(2373);
			match(LEFT_PAREN);
			setState(2382);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,304,_ctx) ) {
			case 1:
				{
				setState(2374);
				expression();
				setState(2379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2375);
					match(COMMA);
					setState(2376);
					expression();
					}
					}
					setState(2381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(2384);
			match(RIGHT_PAREN);
			setState(2385);
			tableAlias();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableAliasContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TableAliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableAlias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableAliasContext tableAlias() throws RecognitionException {
		TableAliasContext _localctx = new TableAliasContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_tableAlias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2394);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,307,_ctx) ) {
			case 1:
				{
				setState(2388);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,305,_ctx) ) {
				case 1:
					{
					setState(2387);
					match(AS);
					}
					break;
				}
				setState(2390);
				strictIdentifier();
				setState(2392);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,306,_ctx) ) {
				case 1:
					{
					setState(2391);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RowFormatContext extends ParserRuleContext {
		public RowFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rowFormat; }
	 
		public RowFormatContext() { }
		public void copyFrom(RowFormatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RowFormatSerdeContext extends RowFormatContext {
		public Token name;
		public PropertyListContext props;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public RowFormatSerdeContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowFormatSerde(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowFormatSerde(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRowFormatSerde(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowFormatDelimitedContext extends RowFormatContext {
		public Token fieldsTerminatedBy;
		public Token escapedBy;
		public Token collectionItemsTerminatedBy;
		public Token keysTerminatedBy;
		public Token linesSeparatedBy;
		public Token nullDefinedAs;
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public List<TerminalNode> TERMINATED() { return getTokens(SqlBaseParser.TERMINATED); }
		public TerminalNode TERMINATED(int i) {
			return getToken(SqlBaseParser.TERMINATED, i);
		}
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public RowFormatDelimitedContext(RowFormatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowFormatDelimited(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowFormatDelimited(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRowFormatDelimited(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RowFormatContext rowFormat() throws RecognitionException {
		RowFormatContext _localctx = new RowFormatContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_rowFormat);
		try {
			setState(2445);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,315,_ctx) ) {
			case 1:
				_localctx = new RowFormatSerdeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2396);
				match(ROW);
				setState(2397);
				match(FORMAT);
				setState(2398);
				match(SERDE);
				setState(2399);
				((RowFormatSerdeContext)_localctx).name = match(STRING);
				setState(2403);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,308,_ctx) ) {
				case 1:
					{
					setState(2400);
					match(WITH);
					setState(2401);
					match(SERDEPROPERTIES);
					setState(2402);
					((RowFormatSerdeContext)_localctx).props = propertyList();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new RowFormatDelimitedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2405);
				match(ROW);
				setState(2406);
				match(FORMAT);
				setState(2407);
				match(DELIMITED);
				setState(2417);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,310,_ctx) ) {
				case 1:
					{
					setState(2408);
					match(FIELDS);
					setState(2409);
					match(TERMINATED);
					setState(2410);
					match(BY);
					setState(2411);
					((RowFormatDelimitedContext)_localctx).fieldsTerminatedBy = match(STRING);
					setState(2415);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,309,_ctx) ) {
					case 1:
						{
						setState(2412);
						match(ESCAPED);
						setState(2413);
						match(BY);
						setState(2414);
						((RowFormatDelimitedContext)_localctx).escapedBy = match(STRING);
						}
						break;
					}
					}
					break;
				}
				setState(2424);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,311,_ctx) ) {
				case 1:
					{
					setState(2419);
					match(COLLECTION);
					setState(2420);
					match(ITEMS);
					setState(2421);
					match(TERMINATED);
					setState(2422);
					match(BY);
					setState(2423);
					((RowFormatDelimitedContext)_localctx).collectionItemsTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2431);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,312,_ctx) ) {
				case 1:
					{
					setState(2426);
					match(MAP);
					setState(2427);
					match(KEYS);
					setState(2428);
					match(TERMINATED);
					setState(2429);
					match(BY);
					setState(2430);
					((RowFormatDelimitedContext)_localctx).keysTerminatedBy = match(STRING);
					}
					break;
				}
				setState(2437);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,313,_ctx) ) {
				case 1:
					{
					setState(2433);
					match(LINES);
					setState(2434);
					match(TERMINATED);
					setState(2435);
					match(BY);
					setState(2436);
					((RowFormatDelimitedContext)_localctx).linesSeparatedBy = match(STRING);
					}
					break;
				}
				setState(2443);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,314,_ctx) ) {
				case 1:
					{
					setState(2439);
					match(NULL);
					setState(2440);
					match(DEFINED);
					setState(2441);
					match(AS);
					setState(2442);
					((RowFormatDelimitedContext)_localctx).nullDefinedAs = match(STRING);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierListContext extends ParserRuleContext {
		public List<MultipartIdentifierContext> multipartIdentifier() {
			return getRuleContexts(MultipartIdentifierContext.class);
		}
		public MultipartIdentifierContext multipartIdentifier(int i) {
			return getRuleContext(MultipartIdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierListContext multipartIdentifierList() throws RecognitionException {
		MultipartIdentifierListContext _localctx = new MultipartIdentifierListContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_multipartIdentifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2447);
			multipartIdentifier();
			setState(2452);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2448);
				match(COMMA);
				setState(2449);
				multipartIdentifier();
				}
				}
				setState(2454);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext errorCapturingIdentifier;
		public List<ErrorCapturingIdentifierContext> parts = new ArrayList<ErrorCapturingIdentifierContext>();
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public MultipartIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierContext multipartIdentifier() throws RecognitionException {
		MultipartIdentifierContext _localctx = new MultipartIdentifierContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_multipartIdentifier);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2455);
			((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
			((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
			setState(2460);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2456);
					match(DOT);
					setState(2457);
					((MultipartIdentifierContext)_localctx).errorCapturingIdentifier = errorCapturingIdentifier();
					((MultipartIdentifierContext)_localctx).parts.add(((MultipartIdentifierContext)_localctx).errorCapturingIdentifier);
					}
					} 
				}
				setState(2462);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,317,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierPropertyListContext extends ParserRuleContext {
		public List<MultipartIdentifierPropertyContext> multipartIdentifierProperty() {
			return getRuleContexts(MultipartIdentifierPropertyContext.class);
		}
		public MultipartIdentifierPropertyContext multipartIdentifierProperty(int i) {
			return getRuleContext(MultipartIdentifierPropertyContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public MultipartIdentifierPropertyListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierPropertyList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierPropertyList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierPropertyList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifierPropertyList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyListContext multipartIdentifierPropertyList() throws RecognitionException {
		MultipartIdentifierPropertyListContext _localctx = new MultipartIdentifierPropertyListContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_multipartIdentifierPropertyList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2463);
			multipartIdentifierProperty();
			setState(2468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2464);
				match(COMMA);
				setState(2465);
				multipartIdentifierProperty();
				}
				}
				setState(2470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultipartIdentifierPropertyContext extends ParserRuleContext {
		public PropertyListContext options;
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public PropertyListContext propertyList() {
			return getRuleContext(PropertyListContext.class,0);
		}
		public MultipartIdentifierPropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multipartIdentifierProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultipartIdentifierProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultipartIdentifierProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultipartIdentifierProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultipartIdentifierPropertyContext multipartIdentifierProperty() throws RecognitionException {
		MultipartIdentifierPropertyContext _localctx = new MultipartIdentifierPropertyContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_multipartIdentifierProperty);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2471);
			multipartIdentifier();
			setState(2474);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPTIONS) {
				{
				setState(2472);
				match(OPTIONS);
				setState(2473);
				((MultipartIdentifierPropertyContext)_localctx).options = propertyList();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext table;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public TableIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTableIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTableIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTableIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableIdentifierContext tableIdentifier() throws RecognitionException {
		TableIdentifierContext _localctx = new TableIdentifierContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_tableIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2479);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,320,_ctx) ) {
			case 1:
				{
				setState(2476);
				((TableIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2477);
				match(DOT);
				}
				break;
			}
			setState(2481);
			((TableIdentifierContext)_localctx).table = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionIdentifierContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext db;
		public ErrorCapturingIdentifierContext function;
		public List<ErrorCapturingIdentifierContext> errorCapturingIdentifier() {
			return getRuleContexts(ErrorCapturingIdentifierContext.class);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier(int i) {
			return getRuleContext(ErrorCapturingIdentifierContext.class,i);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public FunctionIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionIdentifierContext functionIdentifier() throws RecognitionException {
		FunctionIdentifierContext _localctx = new FunctionIdentifierContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_functionIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2486);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,321,_ctx) ) {
			case 1:
				{
				setState(2483);
				((FunctionIdentifierContext)_localctx).db = errorCapturingIdentifier();
				setState(2484);
				match(DOT);
				}
				break;
			}
			setState(2488);
			((FunctionIdentifierContext)_localctx).function = errorCapturingIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionContext namedExpression() throws RecognitionException {
		NamedExpressionContext _localctx = new NamedExpressionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_namedExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2490);
			expression();
			setState(2498);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,324,_ctx) ) {
			case 1:
				{
				setState(2492);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,322,_ctx) ) {
				case 1:
					{
					setState(2491);
					match(AS);
					}
					break;
				}
				setState(2496);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,323,_ctx) ) {
				case 1:
					{
					setState(2494);
					((NamedExpressionContext)_localctx).name = errorCapturingIdentifier();
					}
					break;
				case 2:
					{
					setState(2495);
					identifierList();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedExpressionSeqContext extends ParserRuleContext {
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public NamedExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedExpressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedExpressionSeqContext namedExpressionSeq() throws RecognitionException {
		NamedExpressionSeqContext _localctx = new NamedExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_namedExpressionSeq);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2500);
			namedExpression();
			setState(2505);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(2501);
					match(COMMA);
					setState(2502);
					namedExpression();
					}
					} 
				}
				setState(2507);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,325,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldListContext extends ParserRuleContext {
		public PartitionFieldContext partitionField;
		public List<PartitionFieldContext> fields = new ArrayList<PartitionFieldContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<PartitionFieldContext> partitionField() {
			return getRuleContexts(PartitionFieldContext.class);
		}
		public PartitionFieldContext partitionField(int i) {
			return getRuleContext(PartitionFieldContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PartitionFieldListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionFieldList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionFieldList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionFieldList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionFieldList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldListContext partitionFieldList() throws RecognitionException {
		PartitionFieldListContext _localctx = new PartitionFieldListContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_partitionFieldList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2508);
			match(LEFT_PAREN);
			setState(2509);
			((PartitionFieldListContext)_localctx).partitionField = partitionField();
			((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
			setState(2514);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2510);
				match(COMMA);
				setState(2511);
				((PartitionFieldListContext)_localctx).partitionField = partitionField();
				((PartitionFieldListContext)_localctx).fields.add(((PartitionFieldListContext)_localctx).partitionField);
				}
				}
				setState(2516);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(2517);
			match(RIGHT_PAREN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionFieldContext extends ParserRuleContext {
		public PartitionFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionField; }
	 
		public PartitionFieldContext() { }
		public void copyFrom(PartitionFieldContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PartitionColumnContext extends PartitionFieldContext {
		public ColTypeContext colType() {
			return getRuleContext(ColTypeContext.class,0);
		}
		public PartitionColumnContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PartitionTransformContext extends PartitionFieldContext {
		public TransformContext transform() {
			return getRuleContext(TransformContext.class,0);
		}
		public PartitionTransformContext(PartitionFieldContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPartitionTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPartitionTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPartitionTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionFieldContext partitionField() throws RecognitionException {
		PartitionFieldContext _localctx = new PartitionFieldContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_partitionField);
		try {
			setState(2521);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,327,_ctx) ) {
			case 1:
				_localctx = new PartitionTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2519);
				transform();
				}
				break;
			case 2:
				_localctx = new PartitionColumnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2520);
				colType();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformContext extends ParserRuleContext {
		public TransformContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transform; }
	 
		public TransformContext() { }
		public void copyFrom(TransformContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IdentityTransformContext extends TransformContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public IdentityTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentityTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentityTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentityTransform(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ApplyTransformContext extends TransformContext {
		public IdentifierContext transformName;
		public TransformArgumentContext transformArgument;
		public List<TransformArgumentContext> argument = new ArrayList<TransformArgumentContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<TransformArgumentContext> transformArgument() {
			return getRuleContexts(TransformArgumentContext.class);
		}
		public TransformArgumentContext transformArgument(int i) {
			return getRuleContext(TransformArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ApplyTransformContext(TransformContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterApplyTransform(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitApplyTransform(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitApplyTransform(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformContext transform() throws RecognitionException {
		TransformContext _localctx = new TransformContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_transform);
		int _la;
		try {
			setState(2536);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,329,_ctx) ) {
			case 1:
				_localctx = new IdentityTransformContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2523);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new ApplyTransformContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2524);
				((ApplyTransformContext)_localctx).transformName = identifier();
				setState(2525);
				match(LEFT_PAREN);
				setState(2526);
				((ApplyTransformContext)_localctx).transformArgument = transformArgument();
				((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
				setState(2531);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2527);
					match(COMMA);
					setState(2528);
					((ApplyTransformContext)_localctx).transformArgument = transformArgument();
					((ApplyTransformContext)_localctx).argument.add(((ApplyTransformContext)_localctx).transformArgument);
					}
					}
					setState(2533);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2534);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransformArgumentContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public TransformArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transformArgument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTransformArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTransformArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTransformArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransformArgumentContext transformArgument() throws RecognitionException {
		TransformArgumentContext _localctx = new TransformArgumentContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_transformArgument);
		try {
			setState(2540);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,330,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2538);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2539);
				constant();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2542);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionSeqContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ExpressionSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionSeq; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExpressionSeq(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExpressionSeq(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExpressionSeq(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionSeqContext expressionSeq() throws RecognitionException {
		ExpressionSeqContext _localctx = new ExpressionSeqContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_expressionSeq);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2544);
			expression();
			setState(2549);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(2545);
				match(COMMA);
				setState(2546);
				expression();
				}
				}
				setState(2551);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PredicatedContext extends BooleanExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 210;
		enterRecursionRule(_localctx, 210, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2564);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,333,_ctx) ) {
			case 1:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2553);
				match(NOT);
				setState(2554);
				booleanExpression(5);
				}
				break;
			case 2:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2555);
				match(EXISTS);
				setState(2556);
				match(LEFT_PAREN);
				setState(2557);
				query();
				setState(2558);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new PredicatedContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2560);
				valueExpression(0);
				setState(2562);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,332,_ctx) ) {
				case 1:
					{
					setState(2561);
					predicate();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2574);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2572);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,334,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2566);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2567);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(2568);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(2569);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2570);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(2571);
						((LogicalBinaryContext)_localctx).right = booleanExpression(2);
						}
						break;
					}
					} 
				}
				setState(2576);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,335,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public Token kind;
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public ValueExpressionContext pattern;
		public Token quantifier;
		public Token escapeChar;
		public ValueExpressionContext right;
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_predicate);
		int _la;
		try {
			setState(2659);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,349,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(2578);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2577);
					match(NOT);
					}
				}

				setState(2580);
				((PredicateContext)_localctx).kind = match(BETWEEN);
				setState(2581);
				((PredicateContext)_localctx).lower = valueExpression(0);
				setState(2582);
				match(AND);
				setState(2583);
				((PredicateContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(2586);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2585);
					match(NOT);
					}
				}

				setState(2588);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2589);
				match(LEFT_PAREN);
				setState(2590);
				expression();
				setState(2595);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(2591);
					match(COMMA);
					setState(2592);
					expression();
					}
					}
					setState(2597);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(2598);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(2601);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2600);
					match(NOT);
					}
				}

				setState(2603);
				((PredicateContext)_localctx).kind = match(IN);
				setState(2604);
				match(LEFT_PAREN);
				setState(2605);
				query();
				setState(2606);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(2609);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2608);
					match(NOT);
					}
				}

				setState(2611);
				((PredicateContext)_localctx).kind = match(RLIKE);
				setState(2612);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(2614);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2613);
					match(NOT);
					}
				}

				setState(2616);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2617);
				((PredicateContext)_localctx).quantifier = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==ANY || _la==SOME) ) {
					((PredicateContext)_localctx).quantifier = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2631);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,343,_ctx) ) {
				case 1:
					{
					setState(2618);
					match(LEFT_PAREN);
					setState(2619);
					match(RIGHT_PAREN);
					}
					break;
				case 2:
					{
					setState(2620);
					match(LEFT_PAREN);
					setState(2621);
					expression();
					setState(2626);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2622);
						match(COMMA);
						setState(2623);
						expression();
						}
						}
						setState(2628);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(2629);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(2634);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2633);
					match(NOT);
					}
				}

				setState(2636);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LIKE || _la==ILIKE) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2637);
				((PredicateContext)_localctx).pattern = valueExpression(0);
				setState(2640);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,345,_ctx) ) {
				case 1:
					{
					setState(2638);
					match(ESCAPE);
					setState(2639);
					((PredicateContext)_localctx).escapeChar = match(STRING);
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(2642);
				match(IS);
				setState(2644);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2643);
					match(NOT);
					}
				}

				setState(2646);
				((PredicateContext)_localctx).kind = match(NULL);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(2647);
				match(IS);
				setState(2649);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2648);
					match(NOT);
					}
				}

				setState(2651);
				((PredicateContext)_localctx).kind = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FALSE || _la==TRUE || _la==UNKNOWN) ) {
					((PredicateContext)_localctx).kind = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(2652);
				match(IS);
				setState(2654);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(2653);
					match(NOT);
					}
				}

				setState(2656);
				((PredicateContext)_localctx).kind = match(DISTINCT);
				setState(2657);
				match(FROM);
				setState(2658);
				((PredicateContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ComparisonContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ComparisonContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 214;
		enterRecursionRule(_localctx, 214, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2665);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,350,_ctx) ) {
			case 1:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2662);
				primaryExpression(0);
				}
				break;
			case 2:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2663);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 295)) & ~0x3f) == 0 && ((1L << (_la - 295)) & ((1L << (PLUS - 295)) | (1L << (MINUS - 295)) | (1L << (TILDE - 295)))) != 0)) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2664);
				valueExpression(7);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2688);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2686);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,351,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2667);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(2668);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==DIV || ((((_la - 297)) & ~0x3f) == 0 && ((1L << (_la - 297)) & ((1L << (ASTERISK - 297)) | (1L << (SLASH - 297)) | (1L << (PERCENT - 297)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2669);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(7);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2670);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(2671);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 295)) & ~0x3f) == 0 && ((1L << (_la - 295)) & ((1L << (PLUS - 295)) | (1L << (MINUS - 295)) | (1L << (CONCAT_PIPE - 295)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(2672);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(6);
						}
						break;
					case 3:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2673);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(2674);
						((ArithmeticBinaryContext)_localctx).operator = match(AMPERSAND);
						setState(2675);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(5);
						}
						break;
					case 4:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2676);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(2677);
						((ArithmeticBinaryContext)_localctx).operator = match(HAT);
						setState(2678);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 5:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2679);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(2680);
						((ArithmeticBinaryContext)_localctx).operator = match(PIPE);
						setState(2681);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 6:
						{
						_localctx = new ComparisonContext(new ValueExpressionContext(_parentctx, _parentState));
						((ComparisonContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(2682);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(2683);
						comparisonOperator();
						setState(2684);
						((ComparisonContext)_localctx).right = valueExpression(2);
						}
						break;
					}
					} 
				}
				setState(2690);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,352,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class DatetimeUnitContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public DatetimeUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDatetimeUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDatetimeUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDatetimeUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeUnitContext datetimeUnit() throws RecognitionException {
		DatetimeUnitContext _localctx = new DatetimeUnitContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_datetimeUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2691);
			_la = _input.LA(1);
			if ( !(_la==DAY || _la==DAYOFYEAR || ((((_la - 112)) & ~0x3f) == 0 && ((1L << (_la - 112)) & ((1L << (HOUR - 112)) | (1L << (MICROSECOND - 112)) | (1L << (MILLISECOND - 112)) | (1L << (MINUTE - 112)) | (1L << (MONTH - 112)))) != 0) || _la==QUARTER || _la==SECOND || _la==WEEK || _la==YEAR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StructContext extends PrimaryExpressionContext {
		public NamedExpressionContext namedExpression;
		public List<NamedExpressionContext> argument = new ArrayList<NamedExpressionContext>();
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public StructContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStruct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStruct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStruct(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampaddContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext unitsAmount;
		public ValueExpressionContext timestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TimestampaddContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimestampadd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimestampadd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTimestampadd(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public ValueExpressionContext str;
		public ValueExpressionContext pos;
		public ValueExpressionContext len;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode ARROW() { return getToken(SqlBaseParser.ARROW, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TrimContext extends PrimaryExpressionContext {
		public Token trimOption;
		public ValueExpressionContext trimStr;
		public ValueExpressionContext srcStr;
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TrimContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTrim(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTrim(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTrim(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext value;
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentLikeContext extends PrimaryExpressionContext {
		public Token name;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public CurrentLikeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCurrentLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCurrentLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCurrentLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<NamedExpressionContext> namedExpression() {
			return getRuleContexts(NamedExpressionContext.class);
		}
		public NamedExpressionContext namedExpression(int i) {
			return getRuleContext(NamedExpressionContext.class,i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LastContext extends PrimaryExpressionContext {
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public LastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StarContext extends PrimaryExpressionContext {
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode DOT() { return getToken(SqlBaseParser.DOT, 0); }
		public StarContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStar(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class OverlayContext extends PrimaryExpressionContext {
		public ValueExpressionContext input;
		public ValueExpressionContext replace;
		public ValueExpressionContext position;
		public ValueExpressionContext length;
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public OverlayContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterOverlay(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitOverlay(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitOverlay(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public TerminalNode LEFT_BRACKET() { return getToken(SqlBaseParser.LEFT_BRACKET, 0); }
		public TerminalNode RIGHT_BRACKET() { return getToken(SqlBaseParser.RIGHT_BRACKET, 0); }
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimestampdiffContext extends PrimaryExpressionContext {
		public Token name;
		public DatetimeUnitContext unit;
		public ValueExpressionContext startTimestamp;
		public ValueExpressionContext endTimestamp;
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public DatetimeUnitContext datetimeUnit() {
			return getRuleContext(DatetimeUnitContext.class,0);
		}
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TimestampdiffContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTimestampdiff(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTimestampdiff(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTimestampdiff(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConstantDefaultContext extends PrimaryExpressionContext {
		public ConstantContext constant() {
			return getRuleContext(ConstantContext.class,0);
		}
		public ConstantDefaultContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterConstantDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitConstantDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitConstantDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public IdentifierContext field;
		public ValueExpressionContext source;
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PercentileContext extends PrimaryExpressionContext {
		public ValueExpressionContext percentage;
		public TerminalNode PERCENTILE_CONT() { return getToken(SqlBaseParser.PERCENTILE_CONT, 0); }
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public SortItemContext sortItem() {
			return getRuleContext(SortItemContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public PercentileContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPercentile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPercentile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPercentile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public ExpressionContext expression;
		public List<ExpressionContext> argument = new ArrayList<ExpressionContext>();
		public BooleanExpressionContext where;
		public Token nullsOption;
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public List<TerminalNode> LEFT_PAREN() { return getTokens(SqlBaseParser.LEFT_PAREN); }
		public TerminalNode LEFT_PAREN(int i) {
			return getToken(SqlBaseParser.LEFT_PAREN, i);
		}
		public List<TerminalNode> RIGHT_PAREN() { return getTokens(SqlBaseParser.RIGHT_PAREN); }
		public TerminalNode RIGHT_PAREN(int i) {
			return getToken(SqlBaseParser.RIGHT_PAREN, i);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public ValueExpressionContext substr;
		public ValueExpressionContext str;
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FirstContext extends PrimaryExpressionContext {
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public FirstContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFirst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFirst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFirst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 218;
		enterRecursionRule(_localctx, 218, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2914);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,374,_ctx) ) {
			case 1:
				{
				_localctx = new CurrentLikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(2694);
				((CurrentLikeContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CURRENT_DATE) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER))) != 0)) ) {
					((CurrentLikeContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				{
				_localctx = new TimestampaddContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2695);
				((TimestampaddContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEADD || _la==TIMESTAMPADD) ) {
					((TimestampaddContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2696);
				match(LEFT_PAREN);
				setState(2697);
				((TimestampaddContext)_localctx).unit = datetimeUnit();
				setState(2698);
				match(COMMA);
				setState(2699);
				((TimestampaddContext)_localctx).unitsAmount = valueExpression(0);
				setState(2700);
				match(COMMA);
				setState(2701);
				((TimestampaddContext)_localctx).timestamp = valueExpression(0);
				setState(2702);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				{
				_localctx = new TimestampdiffContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2704);
				((TimestampdiffContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DATEDIFF || _la==TIMESTAMPDIFF) ) {
					((TimestampdiffContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2705);
				match(LEFT_PAREN);
				setState(2706);
				((TimestampdiffContext)_localctx).unit = datetimeUnit();
				setState(2707);
				match(COMMA);
				setState(2708);
				((TimestampdiffContext)_localctx).startTimestamp = valueExpression(0);
				setState(2709);
				match(COMMA);
				setState(2710);
				((TimestampdiffContext)_localctx).endTimestamp = valueExpression(0);
				setState(2711);
				match(RIGHT_PAREN);
				}
				break;
			case 4:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2713);
				match(CASE);
				setState(2715); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2714);
					whenClause();
					}
					}
					setState(2717); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2721);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2719);
					match(ELSE);
					setState(2720);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2723);
				match(END);
				}
				break;
			case 5:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2725);
				match(CASE);
				setState(2726);
				((SimpleCaseContext)_localctx).value = expression();
				setState(2728); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2727);
					whenClause();
					}
					}
					setState(2730); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(2734);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(2732);
					match(ELSE);
					setState(2733);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(2736);
				match(END);
				}
				break;
			case 6:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2738);
				((CastContext)_localctx).name = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CAST || _la==TRY_CAST) ) {
					((CastContext)_localctx).name = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2739);
				match(LEFT_PAREN);
				setState(2740);
				expression();
				setState(2741);
				match(AS);
				setState(2742);
				dataType();
				setState(2743);
				match(RIGHT_PAREN);
				}
				break;
			case 7:
				{
				_localctx = new StructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2745);
				match(STRUCT);
				setState(2746);
				match(LEFT_PAREN);
				setState(2755);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,358,_ctx) ) {
				case 1:
					{
					setState(2747);
					((StructContext)_localctx).namedExpression = namedExpression();
					((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
					setState(2752);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2748);
						match(COMMA);
						setState(2749);
						((StructContext)_localctx).namedExpression = namedExpression();
						((StructContext)_localctx).argument.add(((StructContext)_localctx).namedExpression);
						}
						}
						setState(2754);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2757);
				match(RIGHT_PAREN);
				}
				break;
			case 8:
				{
				_localctx = new FirstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2758);
				match(FIRST);
				setState(2759);
				match(LEFT_PAREN);
				setState(2760);
				expression();
				setState(2763);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2761);
					match(IGNORE);
					setState(2762);
					match(NULLS);
					}
				}

				setState(2765);
				match(RIGHT_PAREN);
				}
				break;
			case 9:
				{
				_localctx = new LastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2767);
				match(LAST);
				setState(2768);
				match(LEFT_PAREN);
				setState(2769);
				expression();
				setState(2772);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE) {
					{
					setState(2770);
					match(IGNORE);
					setState(2771);
					match(NULLS);
					}
				}

				setState(2774);
				match(RIGHT_PAREN);
				}
				break;
			case 10:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2776);
				match(POSITION);
				setState(2777);
				match(LEFT_PAREN);
				setState(2778);
				((PositionContext)_localctx).substr = valueExpression(0);
				setState(2779);
				match(IN);
				setState(2780);
				((PositionContext)_localctx).str = valueExpression(0);
				setState(2781);
				match(RIGHT_PAREN);
				}
				break;
			case 11:
				{
				_localctx = new ConstantDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2783);
				constant();
				}
				break;
			case 12:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2784);
				match(ASTERISK);
				}
				break;
			case 13:
				{
				_localctx = new StarContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2785);
				qualifiedName();
				setState(2786);
				match(DOT);
				setState(2787);
				match(ASTERISK);
				}
				break;
			case 14:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2789);
				match(LEFT_PAREN);
				setState(2790);
				namedExpression();
				setState(2793); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2791);
					match(COMMA);
					setState(2792);
					namedExpression();
					}
					}
					setState(2795); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(2797);
				match(RIGHT_PAREN);
				}
				break;
			case 15:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2799);
				match(LEFT_PAREN);
				setState(2800);
				query();
				setState(2801);
				match(RIGHT_PAREN);
				}
				break;
			case 16:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2803);
				functionName();
				setState(2804);
				match(LEFT_PAREN);
				setState(2816);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,364,_ctx) ) {
				case 1:
					{
					setState(2806);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,362,_ctx) ) {
					case 1:
						{
						setState(2805);
						setQuantifier();
						}
						break;
					}
					setState(2808);
					((FunctionCallContext)_localctx).expression = expression();
					((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
					setState(2813);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(2809);
						match(COMMA);
						setState(2810);
						((FunctionCallContext)_localctx).expression = expression();
						((FunctionCallContext)_localctx).argument.add(((FunctionCallContext)_localctx).expression);
						}
						}
						setState(2815);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(2818);
				match(RIGHT_PAREN);
				setState(2825);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,365,_ctx) ) {
				case 1:
					{
					setState(2819);
					match(FILTER);
					setState(2820);
					match(LEFT_PAREN);
					setState(2821);
					match(WHERE);
					setState(2822);
					((FunctionCallContext)_localctx).where = booleanExpression(0);
					setState(2823);
					match(RIGHT_PAREN);
					}
					break;
				}
				setState(2829);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,366,_ctx) ) {
				case 1:
					{
					setState(2827);
					((FunctionCallContext)_localctx).nullsOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==IGNORE || _la==RESPECT) ) {
						((FunctionCallContext)_localctx).nullsOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2828);
					match(NULLS);
					}
					break;
				}
				setState(2833);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,367,_ctx) ) {
				case 1:
					{
					setState(2831);
					match(OVER);
					setState(2832);
					windowSpec();
					}
					break;
				}
				}
				break;
			case 17:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2835);
				identifier();
				setState(2836);
				match(ARROW);
				setState(2837);
				expression();
				}
				break;
			case 18:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2839);
				match(LEFT_PAREN);
				setState(2840);
				identifier();
				setState(2843); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(2841);
					match(COMMA);
					setState(2842);
					identifier();
					}
					}
					setState(2845); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==COMMA );
				setState(2847);
				match(RIGHT_PAREN);
				setState(2848);
				match(ARROW);
				setState(2849);
				expression();
				}
				break;
			case 19:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2851);
				identifier();
				}
				break;
			case 20:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2852);
				match(LEFT_PAREN);
				setState(2853);
				expression();
				setState(2854);
				match(RIGHT_PAREN);
				}
				break;
			case 21:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2856);
				match(EXTRACT);
				setState(2857);
				match(LEFT_PAREN);
				setState(2858);
				((ExtractContext)_localctx).field = identifier();
				setState(2859);
				match(FROM);
				setState(2860);
				((ExtractContext)_localctx).source = valueExpression(0);
				setState(2861);
				match(RIGHT_PAREN);
				}
				break;
			case 22:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2863);
				_la = _input.LA(1);
				if ( !(_la==SUBSTR || _la==SUBSTRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2864);
				match(LEFT_PAREN);
				setState(2865);
				((SubstringContext)_localctx).str = valueExpression(0);
				setState(2866);
				_la = _input.LA(1);
				if ( !(_la==COMMA || _la==FROM) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(2867);
				((SubstringContext)_localctx).pos = valueExpression(0);
				setState(2870);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA || _la==FOR) {
					{
					setState(2868);
					_la = _input.LA(1);
					if ( !(_la==COMMA || _la==FOR) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(2869);
					((SubstringContext)_localctx).len = valueExpression(0);
					}
				}

				setState(2872);
				match(RIGHT_PAREN);
				}
				break;
			case 23:
				{
				_localctx = new TrimContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2874);
				match(TRIM);
				setState(2875);
				match(LEFT_PAREN);
				setState(2877);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,370,_ctx) ) {
				case 1:
					{
					setState(2876);
					((TrimContext)_localctx).trimOption = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
						((TrimContext)_localctx).trimOption = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(2880);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,371,_ctx) ) {
				case 1:
					{
					setState(2879);
					((TrimContext)_localctx).trimStr = valueExpression(0);
					}
					break;
				}
				setState(2882);
				match(FROM);
				setState(2883);
				((TrimContext)_localctx).srcStr = valueExpression(0);
				setState(2884);
				match(RIGHT_PAREN);
				}
				break;
			case 24:
				{
				_localctx = new OverlayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2886);
				match(OVERLAY);
				setState(2887);
				match(LEFT_PAREN);
				setState(2888);
				((OverlayContext)_localctx).input = valueExpression(0);
				setState(2889);
				match(PLACING);
				setState(2890);
				((OverlayContext)_localctx).replace = valueExpression(0);
				setState(2891);
				match(FROM);
				setState(2892);
				((OverlayContext)_localctx).position = valueExpression(0);
				setState(2895);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(2893);
					match(FOR);
					setState(2894);
					((OverlayContext)_localctx).length = valueExpression(0);
					}
				}

				setState(2897);
				match(RIGHT_PAREN);
				}
				break;
			case 25:
				{
				_localctx = new PercentileContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(2899);
				match(PERCENTILE_CONT);
				setState(2900);
				match(LEFT_PAREN);
				setState(2901);
				((PercentileContext)_localctx).percentage = valueExpression(0);
				setState(2902);
				match(RIGHT_PAREN);
				setState(2903);
				match(WITHIN);
				setState(2904);
				match(GROUP);
				setState(2905);
				match(LEFT_PAREN);
				setState(2906);
				match(ORDER);
				setState(2907);
				match(BY);
				setState(2908);
				sortItem();
				setState(2909);
				match(RIGHT_PAREN);
				setState(2912);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,373,_ctx) ) {
				case 1:
					{
					setState(2910);
					match(OVER);
					setState(2911);
					windowSpec();
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(2926);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,376,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(2924);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,375,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2916);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(2917);
						match(LEFT_BRACKET);
						setState(2918);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(2919);
						match(RIGHT_BRACKET);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(2921);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(2922);
						match(DOT);
						setState(2923);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(2928);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,376,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ConstantContext extends ParserRuleContext {
		public ConstantContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant; }
	 
		public ConstantContext() { }
		public void copyFrom(ConstantContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class NullLiteralContext extends ConstantContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends ConstantContext {
		public List<TerminalNode> STRING() { return getTokens(SqlBaseParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(SqlBaseParser.STRING, i);
		}
		public StringLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends ConstantContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends ConstantContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends ConstantContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends ConstantContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(ConstantContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstantContext constant() throws RecognitionException {
		ConstantContext _localctx = new ConstantContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_constant);
		try {
			int _alt;
			setState(2941);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,378,_ctx) ) {
			case 1:
				_localctx = new NullLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2929);
				match(NULL);
				}
				break;
			case 2:
				_localctx = new IntervalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2930);
				interval();
				}
				break;
			case 3:
				_localctx = new TypeConstructorContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2931);
				identifier();
				setState(2932);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new NumericLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(2934);
				number();
				}
				break;
			case 5:
				_localctx = new BooleanLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(2935);
				booleanValue();
				}
				break;
			case 6:
				_localctx = new StringLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(2937); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(2936);
						match(STRING);
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(2939); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,377,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode NEQJ() { return getToken(SqlBaseParser.NEQJ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public TerminalNode NSEQ() { return getToken(SqlBaseParser.NSEQ, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2943);
			_la = _input.LA(1);
			if ( !(((((_la - 287)) & ~0x3f) == 0 && ((1L << (_la - 287)) & ((1L << (EQ - 287)) | (1L << (NSEQ - 287)) | (1L << (NEQ - 287)) | (1L << (NEQJ - 287)) | (1L << (LT - 287)) | (1L << (LTE - 287)) | (1L << (GT - 287)) | (1L << (GTE - 287)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArithmeticOperatorContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode TILDE() { return getToken(SqlBaseParser.TILDE, 0); }
		public TerminalNode AMPERSAND() { return getToken(SqlBaseParser.AMPERSAND, 0); }
		public TerminalNode PIPE() { return getToken(SqlBaseParser.PIPE, 0); }
		public TerminalNode CONCAT_PIPE() { return getToken(SqlBaseParser.CONCAT_PIPE, 0); }
		public TerminalNode HAT() { return getToken(SqlBaseParser.HAT, 0); }
		public ArithmeticOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithmeticOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterArithmeticOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitArithmeticOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitArithmeticOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithmeticOperatorContext arithmeticOperator() throws RecognitionException {
		ArithmeticOperatorContext _localctx = new ArithmeticOperatorContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_arithmeticOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2945);
			_la = _input.LA(1);
			if ( !(_la==DIV || ((((_la - 295)) & ~0x3f) == 0 && ((1L << (_la - 295)) & ((1L << (PLUS - 295)) | (1L << (MINUS - 295)) | (1L << (ASTERISK - 295)) | (1L << (SLASH - 295)) | (1L << (PERCENT - 295)) | (1L << (TILDE - 295)) | (1L << (AMPERSAND - 295)) | (1L << (PIPE - 295)) | (1L << (CONCAT_PIPE - 295)) | (1L << (HAT - 295)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public PredicateOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicateOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPredicateOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPredicateOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPredicateOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateOperatorContext predicateOperator() throws RecognitionException {
		PredicateOperatorContext _localctx = new PredicateOperatorContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_predicateOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2947);
			_la = _input.LA(1);
			if ( !(_la==AND || ((((_la - 116)) & ~0x3f) == 0 && ((1L << (_la - 116)) & ((1L << (IN - 116)) | (1L << (NOT - 116)) | (1L << (OR - 116)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2949);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() {
			return getRuleContext(ErrorCapturingMultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() {
			return getRuleContext(ErrorCapturingUnitToUnitIntervalContext.class,0);
		}
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_interval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2951);
			match(INTERVAL);
			setState(2954);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,379,_ctx) ) {
			case 1:
				{
				setState(2952);
				errorCapturingMultiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2953);
				errorCapturingUnitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingMultiUnitsIntervalContext extends ParserRuleContext {
		public MultiUnitsIntervalContext body;
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public UnitToUnitIntervalContext unitToUnitInterval() {
			return getRuleContext(UnitToUnitIntervalContext.class,0);
		}
		public ErrorCapturingMultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingMultiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorCapturingMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingMultiUnitsIntervalContext errorCapturingMultiUnitsInterval() throws RecognitionException {
		ErrorCapturingMultiUnitsIntervalContext _localctx = new ErrorCapturingMultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_errorCapturingMultiUnitsInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2956);
			((ErrorCapturingMultiUnitsIntervalContext)_localctx).body = multiUnitsInterval();
			setState(2958);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,380,_ctx) ) {
			case 1:
				{
				setState(2957);
				unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MultiUnitsIntervalContext extends ParserRuleContext {
		public IdentifierContext identifier;
		public List<IdentifierContext> unit = new ArrayList<IdentifierContext>();
		public List<IntervalValueContext> intervalValue() {
			return getRuleContexts(IntervalValueContext.class);
		}
		public IntervalValueContext intervalValue(int i) {
			return getRuleContext(IntervalValueContext.class,i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public MultiUnitsIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_multiUnitsInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterMultiUnitsInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitMultiUnitsInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitMultiUnitsInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MultiUnitsIntervalContext multiUnitsInterval() throws RecognitionException {
		MultiUnitsIntervalContext _localctx = new MultiUnitsIntervalContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_multiUnitsInterval);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(2963); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(2960);
					intervalValue();
					setState(2961);
					((MultiUnitsIntervalContext)_localctx).identifier = identifier();
					((MultiUnitsIntervalContext)_localctx).unit.add(((MultiUnitsIntervalContext)_localctx).identifier);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(2965); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,381,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingUnitToUnitIntervalContext extends ParserRuleContext {
		public UnitToUnitIntervalContext body;
		public MultiUnitsIntervalContext error1;
		public UnitToUnitIntervalContext error2;
		public List<UnitToUnitIntervalContext> unitToUnitInterval() {
			return getRuleContexts(UnitToUnitIntervalContext.class);
		}
		public UnitToUnitIntervalContext unitToUnitInterval(int i) {
			return getRuleContext(UnitToUnitIntervalContext.class,i);
		}
		public MultiUnitsIntervalContext multiUnitsInterval() {
			return getRuleContext(MultiUnitsIntervalContext.class,0);
		}
		public ErrorCapturingUnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingUnitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorCapturingUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingUnitToUnitIntervalContext errorCapturingUnitToUnitInterval() throws RecognitionException {
		ErrorCapturingUnitToUnitIntervalContext _localctx = new ErrorCapturingUnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_errorCapturingUnitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2967);
			((ErrorCapturingUnitToUnitIntervalContext)_localctx).body = unitToUnitInterval();
			setState(2970);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,382,_ctx) ) {
			case 1:
				{
				setState(2968);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error1 = multiUnitsInterval();
				}
				break;
			case 2:
				{
				setState(2969);
				((ErrorCapturingUnitToUnitIntervalContext)_localctx).error2 = unitToUnitInterval();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class UnitToUnitIntervalContext extends ParserRuleContext {
		public IntervalValueContext value;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UnitToUnitIntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unitToUnitInterval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnitToUnitInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnitToUnitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnitToUnitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnitToUnitIntervalContext unitToUnitInterval() throws RecognitionException {
		UnitToUnitIntervalContext _localctx = new UnitToUnitIntervalContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_unitToUnitInterval);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2972);
			((UnitToUnitIntervalContext)_localctx).value = intervalValue();
			setState(2973);
			((UnitToUnitIntervalContext)_localctx).from = identifier();
			setState(2974);
			match(TO);
			setState(2975);
			((UnitToUnitIntervalContext)_localctx).to = identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalValueContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_intervalValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(2978);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(2977);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(2980);
			_la = _input.LA(1);
			if ( !(((((_la - 309)) & ~0x3f) == 0 && ((1L << (_la - 309)) & ((1L << (STRING - 309)) | (1L << (INTEGER_VALUE - 309)) | (1L << (DECIMAL_VALUE - 309)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColPositionContext extends ParserRuleContext {
		public Token position;
		public ErrorCapturingIdentifierContext afterCol;
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public ColPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColPositionContext colPosition() throws RecognitionException {
		ColPositionContext _localctx = new ColPositionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_colPosition);
		try {
			setState(2985);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FIRST:
				enterOuterAlt(_localctx, 1);
				{
				setState(2982);
				((ColPositionContext)_localctx).position = match(FIRST);
				}
				break;
			case AFTER:
				enterOuterAlt(_localctx, 2);
				{
				setState(2983);
				((ColPositionContext)_localctx).position = match(AFTER);
				setState(2984);
				((ColPositionContext)_localctx).afterCol = errorCapturingIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DataTypeContext extends ParserRuleContext {
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
	 
		public DataTypeContext() { }
		public void copyFrom(DataTypeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ComplexDataTypeContext extends DataTypeContext {
		public Token complex;
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public List<DataTypeContext> dataType() {
			return getRuleContexts(DataTypeContext.class);
		}
		public DataTypeContext dataType(int i) {
			return getRuleContext(DataTypeContext.class,i);
		}
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode COMMA() { return getToken(SqlBaseParser.COMMA, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public ComplexColTypeListContext complexColTypeList() {
			return getRuleContext(ComplexColTypeListContext.class,0);
		}
		public ComplexDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComplexDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class YearMonthIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public List<TerminalNode> MONTH() { return getTokens(SqlBaseParser.MONTH); }
		public TerminalNode MONTH(int i) {
			return getToken(SqlBaseParser.MONTH, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public YearMonthIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterYearMonthIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitYearMonthIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitYearMonthIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DayTimeIntervalDataTypeContext extends DataTypeContext {
		public Token from;
		public Token to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public List<TerminalNode> HOUR() { return getTokens(SqlBaseParser.HOUR); }
		public TerminalNode HOUR(int i) {
			return getToken(SqlBaseParser.HOUR, i);
		}
		public List<TerminalNode> MINUTE() { return getTokens(SqlBaseParser.MINUTE); }
		public TerminalNode MINUTE(int i) {
			return getToken(SqlBaseParser.MINUTE, i);
		}
		public List<TerminalNode> SECOND() { return getTokens(SqlBaseParser.SECOND); }
		public TerminalNode SECOND(int i) {
			return getToken(SqlBaseParser.SECOND, i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public DayTimeIntervalDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDayTimeIntervalDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDayTimeIntervalDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDayTimeIntervalDataType(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrimitiveDataTypeContext extends DataTypeContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public List<TerminalNode> INTEGER_VALUE() { return getTokens(SqlBaseParser.INTEGER_VALUE); }
		public TerminalNode INTEGER_VALUE(int i) {
			return getToken(SqlBaseParser.INTEGER_VALUE, i);
		}
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public PrimitiveDataTypeContext(DataTypeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterPrimitiveDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitPrimitiveDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitPrimitiveDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_dataType);
		int _la;
		try {
			setState(3033);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,391,_ctx) ) {
			case 1:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(2987);
				((ComplexDataTypeContext)_localctx).complex = match(ARRAY);
				setState(2988);
				match(LT);
				setState(2989);
				dataType();
				setState(2990);
				match(GT);
				}
				break;
			case 2:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(2992);
				((ComplexDataTypeContext)_localctx).complex = match(MAP);
				setState(2993);
				match(LT);
				setState(2994);
				dataType();
				setState(2995);
				match(COMMA);
				setState(2996);
				dataType();
				setState(2997);
				match(GT);
				}
				break;
			case 3:
				_localctx = new ComplexDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(2999);
				((ComplexDataTypeContext)_localctx).complex = match(STRUCT);
				setState(3006);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case LT:
					{
					setState(3000);
					match(LT);
					setState(3002);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,385,_ctx) ) {
					case 1:
						{
						setState(3001);
						complexColTypeList();
						}
						break;
					}
					setState(3004);
					match(GT);
					}
					break;
				case NEQ:
					{
					setState(3005);
					match(NEQ);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case 4:
				_localctx = new YearMonthIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3008);
				match(INTERVAL);
				setState(3009);
				((YearMonthIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MONTH || _la==YEAR) ) {
					((YearMonthIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3012);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,387,_ctx) ) {
				case 1:
					{
					setState(3010);
					match(TO);
					setState(3011);
					((YearMonthIntervalDataTypeContext)_localctx).to = match(MONTH);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new DayTimeIntervalDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3014);
				match(INTERVAL);
				setState(3015);
				((DayTimeIntervalDataTypeContext)_localctx).from = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DAY || _la==HOUR || _la==MINUTE || _la==SECOND) ) {
					((DayTimeIntervalDataTypeContext)_localctx).from = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3018);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,388,_ctx) ) {
				case 1:
					{
					setState(3016);
					match(TO);
					setState(3017);
					((DayTimeIntervalDataTypeContext)_localctx).to = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==HOUR || _la==MINUTE || _la==SECOND) ) {
						((DayTimeIntervalDataTypeContext)_localctx).to = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new PrimitiveDataTypeContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3020);
				identifier();
				setState(3031);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,390,_ctx) ) {
				case 1:
					{
					setState(3021);
					match(LEFT_PAREN);
					setState(3022);
					match(INTEGER_VALUE);
					setState(3027);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3023);
						match(COMMA);
						setState(3024);
						match(INTEGER_VALUE);
						}
						}
						setState(3029);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(3030);
					match(RIGHT_PAREN);
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionListContext extends ParserRuleContext {
		public List<QualifiedColTypeWithPositionContext> qualifiedColTypeWithPosition() {
			return getRuleContexts(QualifiedColTypeWithPositionContext.class);
		}
		public QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition(int i) {
			return getRuleContext(QualifiedColTypeWithPositionContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedColTypeWithPositionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPositionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedColTypeWithPositionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedColTypeWithPositionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedColTypeWithPositionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionListContext qualifiedColTypeWithPositionList() throws RecognitionException {
		QualifiedColTypeWithPositionListContext _localctx = new QualifiedColTypeWithPositionListContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_qualifiedColTypeWithPositionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3035);
			qualifiedColTypeWithPosition();
			setState(3040);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3036);
				match(COMMA);
				setState(3037);
				qualifiedColTypeWithPosition();
				}
				}
				setState(3042);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedColTypeWithPositionContext extends ParserRuleContext {
		public MultipartIdentifierContext name;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public MultipartIdentifierContext multipartIdentifier() {
			return getRuleContext(MultipartIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public QualifiedColTypeWithPositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedColTypeWithPosition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedColTypeWithPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedColTypeWithPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedColTypeWithPosition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedColTypeWithPositionContext qualifiedColTypeWithPosition() throws RecognitionException {
		QualifiedColTypeWithPositionContext _localctx = new QualifiedColTypeWithPositionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_qualifiedColTypeWithPosition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3043);
			((QualifiedColTypeWithPositionContext)_localctx).name = multipartIdentifier();
			setState(3044);
			dataType();
			setState(3047);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3045);
				match(NOT);
				setState(3046);
				match(NULL);
				}
			}

			setState(3050);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(3049);
				defaultExpression();
				}
			}

			setState(3053);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3052);
				commentSpec();
				}
			}

			setState(3056);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AFTER || _la==FIRST) {
				{
				setState(3055);
				colPosition();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DefaultExpressionContext extends ParserRuleContext {
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public DefaultExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDefaultExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDefaultExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDefaultExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultExpressionContext defaultExpression() throws RecognitionException {
		DefaultExpressionContext _localctx = new DefaultExpressionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_defaultExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3058);
			match(DEFAULT);
			setState(3059);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeListContext extends ParserRuleContext {
		public List<ColTypeContext> colType() {
			return getRuleContexts(ColTypeContext.class);
		}
		public ColTypeContext colType(int i) {
			return getRuleContext(ColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeListContext colTypeList() throws RecognitionException {
		ColTypeListContext _localctx = new ColTypeListContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_colTypeList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3061);
			colType();
			setState(3066);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3062);
					match(COMMA);
					setState(3063);
					colType();
					}
					} 
				}
				setState(3068);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,397,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_colType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColTypeContext colType() throws RecognitionException {
		ColTypeContext _localctx = new ColTypeContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_colType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3069);
			((ColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3070);
			dataType();
			setState(3073);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,398,_ctx) ) {
			case 1:
				{
				setState(3071);
				match(NOT);
				setState(3072);
				match(NULL);
				}
				break;
			}
			setState(3076);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,399,_ctx) ) {
			case 1:
				{
				setState(3075);
				commentSpec();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateOrReplaceTableColTypeListContext extends ParserRuleContext {
		public List<CreateOrReplaceTableColTypeContext> createOrReplaceTableColType() {
			return getRuleContexts(CreateOrReplaceTableColTypeContext.class);
		}
		public CreateOrReplaceTableColTypeContext createOrReplaceTableColType(int i) {
			return getRuleContext(CreateOrReplaceTableColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public CreateOrReplaceTableColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateOrReplaceTableColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateOrReplaceTableColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateOrReplaceTableColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateOrReplaceTableColTypeListContext createOrReplaceTableColTypeList() throws RecognitionException {
		CreateOrReplaceTableColTypeListContext _localctx = new CreateOrReplaceTableColTypeListContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_createOrReplaceTableColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3078);
			createOrReplaceTableColType();
			setState(3083);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3079);
				match(COMMA);
				setState(3080);
				createOrReplaceTableColType();
				}
				}
				setState(3085);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CreateOrReplaceTableColTypeContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext colName;
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public CreateOrReplaceTableColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_createOrReplaceTableColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterCreateOrReplaceTableColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitCreateOrReplaceTableColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitCreateOrReplaceTableColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CreateOrReplaceTableColTypeContext createOrReplaceTableColType() throws RecognitionException {
		CreateOrReplaceTableColTypeContext _localctx = new CreateOrReplaceTableColTypeContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_createOrReplaceTableColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3086);
			((CreateOrReplaceTableColTypeContext)_localctx).colName = errorCapturingIdentifier();
			setState(3087);
			dataType();
			setState(3090);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3088);
				match(NOT);
				setState(3089);
				match(NULL);
				}
			}

			setState(3093);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(3092);
				defaultExpression();
				}
			}

			setState(3096);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3095);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeListContext extends ParserRuleContext {
		public List<ComplexColTypeContext> complexColType() {
			return getRuleContexts(ComplexColTypeContext.class);
		}
		public ComplexColTypeContext complexColType(int i) {
			return getRuleContext(ComplexColTypeContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public ComplexColTypeListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColTypeList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexColTypeList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexColTypeList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComplexColTypeList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeListContext complexColTypeList() throws RecognitionException {
		ComplexColTypeListContext _localctx = new ComplexColTypeListContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_complexColTypeList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3098);
			complexColType();
			setState(3103);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3099);
				match(COMMA);
				setState(3100);
				complexColType();
				}
				}
				setState(3105);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComplexColTypeContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public TerminalNode COLON() { return getToken(SqlBaseParser.COLON, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ComplexColTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_complexColType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterComplexColType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitComplexColType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitComplexColType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComplexColTypeContext complexColType() throws RecognitionException {
		ComplexColTypeContext _localctx = new ComplexColTypeContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_complexColType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3106);
			identifier();
			setState(3108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,405,_ctx) ) {
			case 1:
				{
				setState(3107);
				match(COLON);
				}
				break;
			}
			setState(3110);
			dataType();
			setState(3113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(3111);
				match(NOT);
				setState(3112);
				match(NULL);
				}
			}

			setState(3116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMENT) {
				{
				setState(3115);
				commentSpec();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3118);
			match(WHEN);
			setState(3119);
			((WhenClauseContext)_localctx).condition = expression();
			setState(3120);
			match(THEN);
			setState(3121);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowClauseContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public List<NamedWindowContext> namedWindow() {
			return getRuleContexts(NamedWindowContext.class);
		}
		public NamedWindowContext namedWindow(int i) {
			return getRuleContext(NamedWindowContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public WindowClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowClauseContext windowClause() throws RecognitionException {
		WindowClauseContext _localctx = new WindowClauseContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_windowClause);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3123);
			match(WINDOW);
			setState(3124);
			namedWindow();
			setState(3129);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3125);
					match(COMMA);
					setState(3126);
					namedWindow();
					}
					} 
				}
				setState(3131);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,408,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedWindowContext extends ParserRuleContext {
		public ErrorCapturingIdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public WindowSpecContext windowSpec() {
			return getRuleContext(WindowSpecContext.class,0);
		}
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public NamedWindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedWindow; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNamedWindow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNamedWindow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNamedWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedWindowContext namedWindow() throws RecognitionException {
		NamedWindowContext _localctx = new NamedWindowContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_namedWindow);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3132);
			((NamedWindowContext)_localctx).name = errorCapturingIdentifier();
			setState(3133);
			match(AS);
			setState(3134);
			windowSpec();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowSpecContext extends ParserRuleContext {
		public WindowSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpec; }
	 
		public WindowSpecContext() { }
		public void copyFrom(WindowSpecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class WindowRefContext extends WindowSpecContext {
		public ErrorCapturingIdentifierContext name;
		public ErrorCapturingIdentifierContext errorCapturingIdentifier() {
			return getRuleContext(ErrorCapturingIdentifierContext.class,0);
		}
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public WindowRefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowRef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WindowDefContext extends WindowSpecContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode LEFT_PAREN() { return getToken(SqlBaseParser.LEFT_PAREN, 0); }
		public TerminalNode RIGHT_PAREN() { return getToken(SqlBaseParser.RIGHT_PAREN, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public WindowDefContext(WindowSpecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecContext windowSpec() throws RecognitionException {
		WindowSpecContext _localctx = new WindowSpecContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_windowSpec);
		int _la;
		try {
			setState(3182);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,416,_ctx) ) {
			case 1:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3136);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				}
				break;
			case 2:
				_localctx = new WindowRefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3137);
				match(LEFT_PAREN);
				setState(3138);
				((WindowRefContext)_localctx).name = errorCapturingIdentifier();
				setState(3139);
				match(RIGHT_PAREN);
				}
				break;
			case 3:
				_localctx = new WindowDefContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3141);
				match(LEFT_PAREN);
				setState(3176);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CLUSTER:
					{
					setState(3142);
					match(CLUSTER);
					setState(3143);
					match(BY);
					setState(3144);
					((WindowDefContext)_localctx).expression = expression();
					((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
					setState(3149);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(3145);
						match(COMMA);
						setState(3146);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						}
						}
						setState(3151);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case RIGHT_PAREN:
				case DISTRIBUTE:
				case ORDER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case SORT:
					{
					setState(3162);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==DISTRIBUTE || _la==PARTITION) {
						{
						setState(3152);
						_la = _input.LA(1);
						if ( !(_la==DISTRIBUTE || _la==PARTITION) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3153);
						match(BY);
						setState(3154);
						((WindowDefContext)_localctx).expression = expression();
						((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
						setState(3159);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3155);
							match(COMMA);
							setState(3156);
							((WindowDefContext)_localctx).expression = expression();
							((WindowDefContext)_localctx).partition.add(((WindowDefContext)_localctx).expression);
							}
							}
							setState(3161);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(3174);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==ORDER || _la==SORT) {
						{
						setState(3164);
						_la = _input.LA(1);
						if ( !(_la==ORDER || _la==SORT) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(3165);
						match(BY);
						setState(3166);
						sortItem();
						setState(3171);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(3167);
							match(COMMA);
							setState(3168);
							sortItem();
							}
							}
							setState(3173);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(3179);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==RANGE || _la==ROWS) {
					{
					setState(3178);
					windowFrame();
					}
				}

				setState(3181);
				match(RIGHT_PAREN);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_windowFrame);
		try {
			setState(3200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,417,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3184);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3185);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3186);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3187);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3188);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(3189);
				match(BETWEEN);
				setState(3190);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3191);
				match(AND);
				setState(3192);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3194);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(3195);
				match(BETWEEN);
				setState(3196);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(3197);
				match(AND);
				setState(3198);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFrameBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFrameBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFrameBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_frameBound);
		int _la;
		try {
			setState(3209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,418,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3202);
				match(UNBOUNDED);
				setState(3203);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3204);
				((FrameBoundContext)_localctx).boundType = match(CURRENT);
				setState(3205);
				match(ROW);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3206);
				expression();
				setState(3207);
				((FrameBoundContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FOLLOWING || _la==PRECEDING) ) {
					((FrameBoundContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameListContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SqlBaseParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SqlBaseParser.COMMA, i);
		}
		public QualifiedNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameListContext qualifiedNameList() throws RecognitionException {
		QualifiedNameListContext _localctx = new QualifiedNameListContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_qualifiedNameList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3211);
			qualifiedName();
			setState(3216);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(3212);
				match(COMMA);
				setState(3213);
				qualifiedName();
				}
				}
				setState(3218);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionNameContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_functionName);
		try {
			setState(3223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,420,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3219);
				qualifiedName();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3220);
				match(FILTER);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3221);
				match(LEFT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3222);
				match(RIGHT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT() { return getTokens(SqlBaseParser.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(SqlBaseParser.DOT, i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(3225);
			identifier();
			setState(3230);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(3226);
					match(DOT);
					setState(3227);
					identifier();
					}
					} 
				}
				setState(3232);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,421,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() {
			return getRuleContext(ErrorCapturingIdentifierExtraContext.class,0);
		}
		public ErrorCapturingIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorCapturingIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorCapturingIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorCapturingIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierContext errorCapturingIdentifier() throws RecognitionException {
		ErrorCapturingIdentifierContext _localctx = new ErrorCapturingIdentifierContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_errorCapturingIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3233);
			identifier();
			setState(3234);
			errorCapturingIdentifierExtra();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorCapturingIdentifierExtraContext extends ParserRuleContext {
		public ErrorCapturingIdentifierExtraContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_errorCapturingIdentifierExtra; }
	 
		public ErrorCapturingIdentifierExtraContext() { }
		public void copyFrom(ErrorCapturingIdentifierExtraContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ErrorIdentContext extends ErrorCapturingIdentifierExtraContext {
		public List<TerminalNode> MINUS() { return getTokens(SqlBaseParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(SqlBaseParser.MINUS, i);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ErrorIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterErrorIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitErrorIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitErrorIdent(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RealIdentContext extends ErrorCapturingIdentifierExtraContext {
		public RealIdentContext(ErrorCapturingIdentifierExtraContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterRealIdent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitRealIdent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitRealIdent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorCapturingIdentifierExtraContext errorCapturingIdentifierExtra() throws RecognitionException {
		ErrorCapturingIdentifierExtraContext _localctx = new ErrorCapturingIdentifierExtraContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_errorCapturingIdentifierExtra);
		try {
			int _alt;
			setState(3243);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,423,_ctx) ) {
			case 1:
				_localctx = new ErrorIdentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3238); 
				_errHandler.sync(this);
				_alt = 1;
				do {
					switch (_alt) {
					case 1:
						{
						{
						setState(3236);
						match(MINUS);
						setState(3237);
						identifier();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					setState(3240); 
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,422,_ctx);
				} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
				}
				break;
			case 2:
				_localctx = new RealIdentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext strictIdentifier() {
			return getRuleContext(StrictIdentifierContext.class,0);
		}
		public StrictNonReservedContext strictNonReserved() {
			return getRuleContext(StrictNonReservedContext.class,0);
		}
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_identifier);
		try {
			setState(3248);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,424,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3245);
				strictIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3246);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3247);
				strictNonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictIdentifierContext extends ParserRuleContext {
		public StrictIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictIdentifier; }
	 
		public StrictIdentifierContext() { }
		public void copyFrom(StrictIdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends StrictIdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends StrictIdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public AnsiNonReservedContext ansiNonReserved() {
			return getRuleContext(AnsiNonReservedContext.class,0);
		}
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(StrictIdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictIdentifierContext strictIdentifier() throws RecognitionException {
		StrictIdentifierContext _localctx = new StrictIdentifierContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_strictIdentifier);
		try {
			setState(3256);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,425,_ctx) ) {
			case 1:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3250);
				match(IDENTIFIER);
				}
				break;
			case 2:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3251);
				quotedIdentifier();
				}
				break;
			case 3:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3252);
				if (!(SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "SQL_standard_keyword_behavior");
				setState(3253);
				ansiNonReserved();
				}
				break;
			case 4:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3254);
				if (!(!SQL_standard_keyword_behavior)) throw new FailedPredicateException(this, "!SQL_standard_keyword_behavior");
				setState(3255);
				nonReserved();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3258);
			match(BACKQUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigIntLiteralContext extends NumberContext {
		public TerminalNode BIGINT_LITERAL() { return getToken(SqlBaseParser.BIGINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBigIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBigIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBigIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TinyIntLiteralContext extends NumberContext {
		public TerminalNode TINYINT_LITERAL() { return getToken(SqlBaseParser.TINYINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TinyIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterTinyIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitTinyIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitTinyIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LegacyDecimalLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public LegacyDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterLegacyDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitLegacyDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitLegacyDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BigDecimalLiteralContext extends NumberContext {
		public TerminalNode BIGDECIMAL_LITERAL() { return getToken(SqlBaseParser.BIGDECIMAL_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public BigDecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterBigDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitBigDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitBigDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExponentLiteralContext extends NumberContext {
		public TerminalNode EXPONENT_VALUE() { return getToken(SqlBaseParser.EXPONENT_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ExponentLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterExponentLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitExponentLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitExponentLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DoubleLiteralContext extends NumberContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SqlBaseParser.DOUBLE_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public DoubleLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterDoubleLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitDoubleLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitDoubleLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FloatLiteralContext extends NumberContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SqlBaseParser.FLOAT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public FloatLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterFloatLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitFloatLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitFloatLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SmallIntLiteralContext extends NumberContext {
		public TerminalNode SMALLINT_LITERAL() { return getToken(SqlBaseParser.SMALLINT_LITERAL, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public SmallIntLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterSmallIntLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitSmallIntLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitSmallIntLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_number);
		int _la;
		try {
			setState(3303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,436,_ctx) ) {
			case 1:
				_localctx = new ExponentLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(3260);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3262);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3261);
					match(MINUS);
					}
				}

				setState(3264);
				match(EXPONENT_VALUE);
				}
				break;
			case 2:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(3265);
				if (!(!legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "!legacy_exponent_literal_as_decimal_enabled");
				setState(3267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3266);
					match(MINUS);
					}
				}

				setState(3269);
				match(DECIMAL_VALUE);
				}
				break;
			case 3:
				_localctx = new LegacyDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(3270);
				if (!(legacy_exponent_literal_as_decimal_enabled)) throw new FailedPredicateException(this, "legacy_exponent_literal_as_decimal_enabled");
				setState(3272);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3271);
					match(MINUS);
					}
				}

				setState(3274);
				_la = _input.LA(1);
				if ( !(_la==EXPONENT_VALUE || _la==DECIMAL_VALUE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 4:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(3276);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3275);
					match(MINUS);
					}
				}

				setState(3278);
				match(INTEGER_VALUE);
				}
				break;
			case 5:
				_localctx = new BigIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(3280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3279);
					match(MINUS);
					}
				}

				setState(3282);
				match(BIGINT_LITERAL);
				}
				break;
			case 6:
				_localctx = new SmallIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(3284);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3283);
					match(MINUS);
					}
				}

				setState(3286);
				match(SMALLINT_LITERAL);
				}
				break;
			case 7:
				_localctx = new TinyIntLiteralContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(3288);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3287);
					match(MINUS);
					}
				}

				setState(3290);
				match(TINYINT_LITERAL);
				}
				break;
			case 8:
				_localctx = new DoubleLiteralContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(3292);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3291);
					match(MINUS);
					}
				}

				setState(3294);
				match(DOUBLE_LITERAL);
				}
				break;
			case 9:
				_localctx = new FloatLiteralContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(3296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3295);
					match(MINUS);
					}
				}

				setState(3298);
				match(FLOAT_LITERAL);
				}
				break;
			case 10:
				_localctx = new BigDecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(3300);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(3299);
					match(MINUS);
					}
				}

				setState(3302);
				match(BIGDECIMAL_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AlterColumnActionContext extends ParserRuleContext {
		public Token setOrDrop;
		public Token dropDefault;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public CommentSpecContext commentSpec() {
			return getRuleContext(CommentSpecContext.class,0);
		}
		public ColPositionContext colPosition() {
			return getRuleContext(ColPositionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public DefaultExpressionContext defaultExpression() {
			return getRuleContext(DefaultExpressionContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public AlterColumnActionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alterColumnAction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAlterColumnAction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAlterColumnAction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAlterColumnAction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AlterColumnActionContext alterColumnAction() throws RecognitionException {
		AlterColumnActionContext _localctx = new AlterColumnActionContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_alterColumnAction);
		int _la;
		try {
			setState(3316);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,437,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(3305);
				match(TYPE);
				setState(3306);
				dataType();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(3307);
				commentSpec();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(3308);
				colPosition();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(3309);
				((AlterColumnActionContext)_localctx).setOrDrop = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DROP || _la==SET) ) {
					((AlterColumnActionContext)_localctx).setOrDrop = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(3310);
				match(NOT);
				setState(3311);
				match(NULL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(3312);
				match(SET);
				setState(3313);
				defaultExpression();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(3314);
				((AlterColumnActionContext)_localctx).dropDefault = match(DROP);
				setState(3315);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnsiNonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public AnsiNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ansiNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterAnsiNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitAnsiNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitAnsiNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnsiNonReservedContext ansiNonReserved() throws RecognitionException {
		AnsiNonReservedContext _localctx = new AnsiNonReservedContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_ansiNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3318);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALTER) | (1L << ANALYZE) | (1L << ANTI) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << ASC) | (1L << AT) | (1L << BETWEEN) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHANGE) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLECTION) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << COST) | (1L << CUBE) | (1L << CURRENT) | (1L << DAY) | (1L << DAYOFYEAR) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FIELDS - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GROUPING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (ITEMS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (KEYS - 129)) | (1L << (LAST - 129)) | (1L << (LAZY - 129)) | (1L << (LIKE - 129)) | (1L << (ILIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MICROSECOND - 129)) | (1L << (MILLISECOND - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OUT - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUARTER - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (RECORDWRITER - 193)) | (1L << (RECOVER - 193)) | (1L << (REDUCE - 193)) | (1L << (REFRESH - 193)) | (1L << (RENAME - 193)) | (1L << (REPAIR - 193)) | (1L << (REPEATABLE - 193)) | (1L << (REPLACE - 193)) | (1L << (RESET - 193)) | (1L << (RESPECT - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SECOND - 193)) | (1L << (SCHEMA - 193)) | (1L << (SCHEMAS - 193)) | (1L << (SEMI - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SET - 193)) | (1L << (SETMINUS - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SYNC - 193)) | (1L << (SYSTEM_TIME - 193)) | (1L << (SYSTEM_VERSION - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESAMPLE - 193)) | (1L << (TBLPROPERTIES - 193)) | (1L << (TEMPORARY - 193)) | (1L << (TERMINATED - 193)) | (1L << (TIMESTAMP - 193)) | (1L << (TIMESTAMPADD - 193)) | (1L << (TIMESTAMPDIFF - 193)) | (1L << (TOUCH - 193)) | (1L << (TRANSACTION - 193)) | (1L << (TRANSACTIONS - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (TRANSFORM - 257)) | (1L << (TRIM - 257)) | (1L << (TRUE - 257)) | (1L << (TRUNCATE - 257)) | (1L << (TRY_CAST - 257)) | (1L << (TYPE - 257)) | (1L << (UNARCHIVE - 257)) | (1L << (UNBOUNDED - 257)) | (1L << (UNCACHE - 257)) | (1L << (UNLOCK - 257)) | (1L << (UNSET - 257)) | (1L << (UPDATE - 257)) | (1L << (USE - 257)) | (1L << (VALUES - 257)) | (1L << (VERSION - 257)) | (1L << (VIEW - 257)) | (1L << (VIEWS - 257)) | (1L << (WEEK - 257)) | (1L << (WINDOW - 257)) | (1L << (YEAR - 257)) | (1L << (ZONE - 257)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StrictNonReservedContext extends ParserRuleContext {
		public TerminalNode ANTI() { return getToken(SqlBaseParser.ANTI, 0); }
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public TerminalNode LATERAL() { return getToken(SqlBaseParser.LATERAL, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode SEMI() { return getToken(SqlBaseParser.SEMI, 0); }
		public TerminalNode SETMINUS() { return getToken(SqlBaseParser.SETMINUS, 0); }
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public StrictNonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_strictNonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterStrictNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitStrictNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitStrictNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StrictNonReservedContext strictNonReserved() throws RecognitionException {
		StrictNonReservedContext _localctx = new StrictNonReservedContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_strictNonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3320);
			_la = _input.LA(1);
			if ( !(_la==ANTI || _la==CROSS || ((((_la - 84)) & ~0x3f) == 0 && ((1L << (_la - 84)) & ((1L << (EXCEPT - 84)) | (1L << (FULL - 84)) | (1L << (INNER - 84)) | (1L << (INTERSECT - 84)) | (1L << (JOIN - 84)) | (1L << (LATERAL - 84)) | (1L << (LEFT - 84)))) != 0) || ((((_la - 157)) & ~0x3f) == 0 && ((1L << (_la - 157)) & ((1L << (NATURAL - 157)) | (1L << (ON - 157)) | (1L << (RIGHT - 157)) | (1L << (SEMI - 157)))) != 0) || ((((_la - 224)) & ~0x3f) == 0 && ((1L << (_la - 224)) & ((1L << (SETMINUS - 224)) | (1L << (UNION - 224)) | (1L << (USING - 224)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode AFTER() { return getToken(SqlBaseParser.AFTER, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode ANY() { return getToken(SqlBaseParser.ANY, 0); }
		public TerminalNode ARCHIVE() { return getToken(SqlBaseParser.ARCHIVE, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode AUTHORIZATION() { return getToken(SqlBaseParser.AUTHORIZATION, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode BOTH() { return getToken(SqlBaseParser.BOTH, 0); }
		public TerminalNode BUCKET() { return getToken(SqlBaseParser.BUCKET, 0); }
		public TerminalNode BUCKETS() { return getToken(SqlBaseParser.BUCKETS, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public TerminalNode CACHE() { return getToken(SqlBaseParser.CACHE, 0); }
		public TerminalNode CASCADE() { return getToken(SqlBaseParser.CASCADE, 0); }
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public TerminalNode CATALOG() { return getToken(SqlBaseParser.CATALOG, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode CHANGE() { return getToken(SqlBaseParser.CHANGE, 0); }
		public TerminalNode CHECK() { return getToken(SqlBaseParser.CHECK, 0); }
		public TerminalNode CLEAR() { return getToken(SqlBaseParser.CLEAR, 0); }
		public TerminalNode CLUSTER() { return getToken(SqlBaseParser.CLUSTER, 0); }
		public TerminalNode CLUSTERED() { return getToken(SqlBaseParser.CLUSTERED, 0); }
		public TerminalNode CODEGEN() { return getToken(SqlBaseParser.CODEGEN, 0); }
		public TerminalNode COLLATE() { return getToken(SqlBaseParser.COLLATE, 0); }
		public TerminalNode COLLECTION() { return getToken(SqlBaseParser.COLLECTION, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COMMENT() { return getToken(SqlBaseParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode COMPACT() { return getToken(SqlBaseParser.COMPACT, 0); }
		public TerminalNode COMPACTIONS() { return getToken(SqlBaseParser.COMPACTIONS, 0); }
		public TerminalNode COMPUTE() { return getToken(SqlBaseParser.COMPUTE, 0); }
		public TerminalNode CONCATENATE() { return getToken(SqlBaseParser.CONCATENATE, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SqlBaseParser.CONSTRAINT, 0); }
		public TerminalNode COST() { return getToken(SqlBaseParser.COST, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_USER() { return getToken(SqlBaseParser.CURRENT_USER, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode DATABASE() { return getToken(SqlBaseParser.DATABASE, 0); }
		public TerminalNode DATABASES() { return getToken(SqlBaseParser.DATABASES, 0); }
		public TerminalNode DATEADD() { return getToken(SqlBaseParser.DATEADD, 0); }
		public TerminalNode DATEDIFF() { return getToken(SqlBaseParser.DATEDIFF, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode DAYOFYEAR() { return getToken(SqlBaseParser.DAYOFYEAR, 0); }
		public TerminalNode DBPROPERTIES() { return getToken(SqlBaseParser.DBPROPERTIES, 0); }
		public TerminalNode DEFAULT() { return getToken(SqlBaseParser.DEFAULT, 0); }
		public TerminalNode DEFINED() { return getToken(SqlBaseParser.DEFINED, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode DELIMITED() { return getToken(SqlBaseParser.DELIMITED, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DFS() { return getToken(SqlBaseParser.DFS, 0); }
		public TerminalNode DIRECTORIES() { return getToken(SqlBaseParser.DIRECTORIES, 0); }
		public TerminalNode DIRECTORY() { return getToken(SqlBaseParser.DIRECTORY, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode DISTRIBUTE() { return getToken(SqlBaseParser.DISTRIBUTE, 0); }
		public TerminalNode DIV() { return getToken(SqlBaseParser.DIV, 0); }
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public TerminalNode ESCAPED() { return getToken(SqlBaseParser.ESCAPED, 0); }
		public TerminalNode EXCHANGE() { return getToken(SqlBaseParser.EXCHANGE, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode EXPORT() { return getToken(SqlBaseParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(SqlBaseParser.EXTENDED, 0); }
		public TerminalNode EXTERNAL() { return getToken(SqlBaseParser.EXTERNAL, 0); }
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public TerminalNode FETCH() { return getToken(SqlBaseParser.FETCH, 0); }
		public TerminalNode FILTER() { return getToken(SqlBaseParser.FILTER, 0); }
		public TerminalNode FIELDS() { return getToken(SqlBaseParser.FIELDS, 0); }
		public TerminalNode FILEFORMAT() { return getToken(SqlBaseParser.FILEFORMAT, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode FOREIGN() { return getToken(SqlBaseParser.FOREIGN, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode FORMATTED() { return getToken(SqlBaseParser.FORMATTED, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FUNCTION() { return getToken(SqlBaseParser.FUNCTION, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode GLOBAL() { return getToken(SqlBaseParser.GLOBAL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode IGNORE() { return getToken(SqlBaseParser.IGNORE, 0); }
		public TerminalNode IMPORT() { return getToken(SqlBaseParser.IMPORT, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode INDEX() { return getToken(SqlBaseParser.INDEX, 0); }
		public TerminalNode INDEXES() { return getToken(SqlBaseParser.INDEXES, 0); }
		public TerminalNode INPATH() { return getToken(SqlBaseParser.INPATH, 0); }
		public TerminalNode INPUTFORMAT() { return getToken(SqlBaseParser.INPUTFORMAT, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode ITEMS() { return getToken(SqlBaseParser.ITEMS, 0); }
		public TerminalNode KEYS() { return getToken(SqlBaseParser.KEYS, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public TerminalNode LAZY() { return getToken(SqlBaseParser.LAZY, 0); }
		public TerminalNode LEADING() { return getToken(SqlBaseParser.LEADING, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode ILIKE() { return getToken(SqlBaseParser.ILIKE, 0); }
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode LINES() { return getToken(SqlBaseParser.LINES, 0); }
		public TerminalNode LIST() { return getToken(SqlBaseParser.LIST, 0); }
		public TerminalNode LOAD() { return getToken(SqlBaseParser.LOAD, 0); }
		public TerminalNode LOCAL() { return getToken(SqlBaseParser.LOCAL, 0); }
		public TerminalNode LOCATION() { return getToken(SqlBaseParser.LOCATION, 0); }
		public TerminalNode LOCK() { return getToken(SqlBaseParser.LOCK, 0); }
		public TerminalNode LOCKS() { return getToken(SqlBaseParser.LOCKS, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode MACRO() { return getToken(SqlBaseParser.MACRO, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode MATCHED() { return getToken(SqlBaseParser.MATCHED, 0); }
		public TerminalNode MERGE() { return getToken(SqlBaseParser.MERGE, 0); }
		public TerminalNode MICROSECOND() { return getToken(SqlBaseParser.MICROSECOND, 0); }
		public TerminalNode MILLISECOND() { return getToken(SqlBaseParser.MILLISECOND, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode MSCK() { return getToken(SqlBaseParser.MSCK, 0); }
		public TerminalNode NAMESPACE() { return getToken(SqlBaseParser.NAMESPACE, 0); }
		public TerminalNode NAMESPACES() { return getToken(SqlBaseParser.NAMESPACES, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode OF() { return getToken(SqlBaseParser.OF, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode OPTIONS() { return getToken(SqlBaseParser.OPTIONS, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode OUT() { return getToken(SqlBaseParser.OUT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode OUTPUTFORMAT() { return getToken(SqlBaseParser.OUTPUTFORMAT, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode OVERLAPS() { return getToken(SqlBaseParser.OVERLAPS, 0); }
		public TerminalNode OVERLAY() { return getToken(SqlBaseParser.OVERLAY, 0); }
		public TerminalNode OVERWRITE() { return getToken(SqlBaseParser.OVERWRITE, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode PARTITIONED() { return getToken(SqlBaseParser.PARTITIONED, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode PERCENTILE_CONT() { return getToken(SqlBaseParser.PERCENTILE_CONT, 0); }
		public TerminalNode PERCENTLIT() { return getToken(SqlBaseParser.PERCENTLIT, 0); }
		public TerminalNode PIVOT() { return getToken(SqlBaseParser.PIVOT, 0); }
		public TerminalNode PLACING() { return getToken(SqlBaseParser.PLACING, 0); }
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode PRIMARY() { return getToken(SqlBaseParser.PRIMARY, 0); }
		public TerminalNode PRINCIPALS() { return getToken(SqlBaseParser.PRINCIPALS, 0); }
		public TerminalNode PROPERTIES() { return getToken(SqlBaseParser.PROPERTIES, 0); }
		public TerminalNode PURGE() { return getToken(SqlBaseParser.PURGE, 0); }
		public TerminalNode QUARTER() { return getToken(SqlBaseParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(SqlBaseParser.QUERY, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode RECORDREADER() { return getToken(SqlBaseParser.RECORDREADER, 0); }
		public TerminalNode RECORDWRITER() { return getToken(SqlBaseParser.RECORDWRITER, 0); }
		public TerminalNode RECOVER() { return getToken(SqlBaseParser.RECOVER, 0); }
		public TerminalNode REDUCE() { return getToken(SqlBaseParser.REDUCE, 0); }
		public TerminalNode REFERENCES() { return getToken(SqlBaseParser.REFERENCES, 0); }
		public TerminalNode REFRESH() { return getToken(SqlBaseParser.REFRESH, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode REPAIR() { return getToken(SqlBaseParser.REPAIR, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode RESPECT() { return getToken(SqlBaseParser.RESPECT, 0); }
		public TerminalNode RESTRICT() { return getToken(SqlBaseParser.RESTRICT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode RLIKE() { return getToken(SqlBaseParser.RLIKE, 0); }
		public TerminalNode ROLE() { return getToken(SqlBaseParser.ROLE, 0); }
		public TerminalNode ROLES() { return getToken(SqlBaseParser.ROLES, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode SCHEMA() { return getToken(SqlBaseParser.SCHEMA, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode SEPARATED() { return getToken(SqlBaseParser.SEPARATED, 0); }
		public TerminalNode SERDE() { return getToken(SqlBaseParser.SERDE, 0); }
		public TerminalNode SERDEPROPERTIES() { return getToken(SqlBaseParser.SERDEPROPERTIES, 0); }
		public TerminalNode SESSION_USER() { return getToken(SqlBaseParser.SESSION_USER, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SKEWED() { return getToken(SqlBaseParser.SKEWED, 0); }
		public TerminalNode SOME() { return getToken(SqlBaseParser.SOME, 0); }
		public TerminalNode SORT() { return getToken(SqlBaseParser.SORT, 0); }
		public TerminalNode SORTED() { return getToken(SqlBaseParser.SORTED, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode STATISTICS() { return getToken(SqlBaseParser.STATISTICS, 0); }
		public TerminalNode STORED() { return getToken(SqlBaseParser.STORED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode STRUCT() { return getToken(SqlBaseParser.STRUCT, 0); }
		public TerminalNode SUBSTR() { return getToken(SqlBaseParser.SUBSTR, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public TerminalNode SYNC() { return getToken(SqlBaseParser.SYNC, 0); }
		public TerminalNode SYSTEM_TIME() { return getToken(SqlBaseParser.SYSTEM_TIME, 0); }
		public TerminalNode SYSTEM_VERSION() { return getToken(SqlBaseParser.SYSTEM_VERSION, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode TBLPROPERTIES() { return getToken(SqlBaseParser.TBLPROPERTIES, 0); }
		public TerminalNode TEMPORARY() { return getToken(SqlBaseParser.TEMPORARY, 0); }
		public TerminalNode TERMINATED() { return getToken(SqlBaseParser.TERMINATED, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMPADD() { return getToken(SqlBaseParser.TIMESTAMPADD, 0); }
		public TerminalNode TIMESTAMPDIFF() { return getToken(SqlBaseParser.TIMESTAMPDIFF, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode TOUCH() { return getToken(SqlBaseParser.TOUCH, 0); }
		public TerminalNode TRAILING() { return getToken(SqlBaseParser.TRAILING, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode TRANSACTIONS() { return getToken(SqlBaseParser.TRANSACTIONS, 0); }
		public TerminalNode TRANSFORM() { return getToken(SqlBaseParser.TRANSFORM, 0); }
		public TerminalNode TRIM() { return getToken(SqlBaseParser.TRIM, 0); }
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode TRUNCATE() { return getToken(SqlBaseParser.TRUNCATE, 0); }
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode UNARCHIVE() { return getToken(SqlBaseParser.UNARCHIVE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode UNCACHE() { return getToken(SqlBaseParser.UNCACHE, 0); }
		public TerminalNode UNIQUE() { return getToken(SqlBaseParser.UNIQUE, 0); }
		public TerminalNode UNKNOWN() { return getToken(SqlBaseParser.UNKNOWN, 0); }
		public TerminalNode UNLOCK() { return getToken(SqlBaseParser.UNLOCK, 0); }
		public TerminalNode UNSET() { return getToken(SqlBaseParser.UNSET, 0); }
		public TerminalNode UPDATE() { return getToken(SqlBaseParser.UPDATE, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode USER() { return getToken(SqlBaseParser.USER, 0); }
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public TerminalNode VERSION() { return getToken(SqlBaseParser.VERSION, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode VIEWS() { return getToken(SqlBaseParser.VIEWS, 0); }
		public TerminalNode WEEK() { return getToken(SqlBaseParser.WEEK, 0); }
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode WINDOW() { return getToken(SqlBaseParser.WINDOW, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode WITHIN() { return getToken(SqlBaseParser.WITHIN, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseParserListener ) ((SqlBaseParserListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseParserVisitor ) return ((SqlBaseParserVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_nonReserved);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(3322);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << ADD) | (1L << AFTER) | (1L << ALL) | (1L << ALTER) | (1L << ANALYZE) | (1L << AND) | (1L << ANY) | (1L << ARCHIVE) | (1L << ARRAY) | (1L << AS) | (1L << ASC) | (1L << AT) | (1L << AUTHORIZATION) | (1L << BETWEEN) | (1L << BOTH) | (1L << BUCKET) | (1L << BUCKETS) | (1L << BY) | (1L << CACHE) | (1L << CASCADE) | (1L << CASE) | (1L << CAST) | (1L << CATALOG) | (1L << CATALOGS) | (1L << CHANGE) | (1L << CHECK) | (1L << CLEAR) | (1L << CLUSTER) | (1L << CLUSTERED) | (1L << CODEGEN) | (1L << COLLATE) | (1L << COLLECTION) | (1L << COLUMN) | (1L << COLUMNS) | (1L << COMMENT) | (1L << COMMIT) | (1L << COMPACT) | (1L << COMPACTIONS) | (1L << COMPUTE) | (1L << CONCATENATE) | (1L << CONSTRAINT) | (1L << COST) | (1L << CREATE) | (1L << CUBE) | (1L << CURRENT) | (1L << CURRENT_DATE) | (1L << CURRENT_TIME) | (1L << CURRENT_TIMESTAMP) | (1L << CURRENT_USER) | (1L << DAY) | (1L << DAYOFYEAR) | (1L << DATA) | (1L << DATABASE) | (1L << DATABASES))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (DATEADD - 64)) | (1L << (DATEDIFF - 64)) | (1L << (DBPROPERTIES - 64)) | (1L << (DEFAULT - 64)) | (1L << (DEFINED - 64)) | (1L << (DELETE - 64)) | (1L << (DELIMITED - 64)) | (1L << (DESC - 64)) | (1L << (DESCRIBE - 64)) | (1L << (DFS - 64)) | (1L << (DIRECTORIES - 64)) | (1L << (DIRECTORY - 64)) | (1L << (DISTINCT - 64)) | (1L << (DISTRIBUTE - 64)) | (1L << (DIV - 64)) | (1L << (DROP - 64)) | (1L << (ELSE - 64)) | (1L << (END - 64)) | (1L << (ESCAPE - 64)) | (1L << (ESCAPED - 64)) | (1L << (EXCHANGE - 64)) | (1L << (EXISTS - 64)) | (1L << (EXPLAIN - 64)) | (1L << (EXPORT - 64)) | (1L << (EXTENDED - 64)) | (1L << (EXTERNAL - 64)) | (1L << (EXTRACT - 64)) | (1L << (FALSE - 64)) | (1L << (FETCH - 64)) | (1L << (FIELDS - 64)) | (1L << (FILTER - 64)) | (1L << (FILEFORMAT - 64)) | (1L << (FIRST - 64)) | (1L << (FOLLOWING - 64)) | (1L << (FOR - 64)) | (1L << (FOREIGN - 64)) | (1L << (FORMAT - 64)) | (1L << (FORMATTED - 64)) | (1L << (FROM - 64)) | (1L << (FUNCTION - 64)) | (1L << (FUNCTIONS - 64)) | (1L << (GLOBAL - 64)) | (1L << (GRANT - 64)) | (1L << (GROUP - 64)) | (1L << (GROUPING - 64)) | (1L << (HAVING - 64)) | (1L << (HOUR - 64)) | (1L << (IF - 64)) | (1L << (IGNORE - 64)) | (1L << (IMPORT - 64)) | (1L << (IN - 64)) | (1L << (INDEX - 64)) | (1L << (INDEXES - 64)) | (1L << (INPATH - 64)) | (1L << (INPUTFORMAT - 64)) | (1L << (INSERT - 64)) | (1L << (INTERVAL - 64)) | (1L << (INTO - 64)) | (1L << (IS - 64)) | (1L << (ITEMS - 64)))) != 0) || ((((_la - 129)) & ~0x3f) == 0 && ((1L << (_la - 129)) & ((1L << (KEYS - 129)) | (1L << (LAST - 129)) | (1L << (LAZY - 129)) | (1L << (LEADING - 129)) | (1L << (LIKE - 129)) | (1L << (ILIKE - 129)) | (1L << (LIMIT - 129)) | (1L << (LINES - 129)) | (1L << (LIST - 129)) | (1L << (LOAD - 129)) | (1L << (LOCAL - 129)) | (1L << (LOCATION - 129)) | (1L << (LOCK - 129)) | (1L << (LOCKS - 129)) | (1L << (LOGICAL - 129)) | (1L << (MACRO - 129)) | (1L << (MAP - 129)) | (1L << (MATCHED - 129)) | (1L << (MERGE - 129)) | (1L << (MICROSECOND - 129)) | (1L << (MILLISECOND - 129)) | (1L << (MINUTE - 129)) | (1L << (MONTH - 129)) | (1L << (MSCK - 129)) | (1L << (NAMESPACE - 129)) | (1L << (NAMESPACES - 129)) | (1L << (NO - 129)) | (1L << (NOT - 129)) | (1L << (NULL - 129)) | (1L << (NULLS - 129)) | (1L << (OF - 129)) | (1L << (ONLY - 129)) | (1L << (OPTION - 129)) | (1L << (OPTIONS - 129)) | (1L << (OR - 129)) | (1L << (ORDER - 129)) | (1L << (OUT - 129)) | (1L << (OUTER - 129)) | (1L << (OUTPUTFORMAT - 129)) | (1L << (OVER - 129)) | (1L << (OVERLAPS - 129)) | (1L << (OVERLAY - 129)) | (1L << (OVERWRITE - 129)) | (1L << (PARTITION - 129)) | (1L << (PARTITIONED - 129)) | (1L << (PARTITIONS - 129)) | (1L << (PERCENTILE_CONT - 129)) | (1L << (PERCENTLIT - 129)) | (1L << (PIVOT - 129)) | (1L << (PLACING - 129)) | (1L << (POSITION - 129)) | (1L << (PRECEDING - 129)) | (1L << (PRIMARY - 129)) | (1L << (PRINCIPALS - 129)) | (1L << (PROPERTIES - 129)) | (1L << (PURGE - 129)) | (1L << (QUARTER - 129)) | (1L << (QUERY - 129)) | (1L << (RANGE - 129)) | (1L << (RECORDREADER - 129)))) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & ((1L << (RECORDWRITER - 193)) | (1L << (RECOVER - 193)) | (1L << (REDUCE - 193)) | (1L << (REFERENCES - 193)) | (1L << (REFRESH - 193)) | (1L << (RENAME - 193)) | (1L << (REPAIR - 193)) | (1L << (REPEATABLE - 193)) | (1L << (REPLACE - 193)) | (1L << (RESET - 193)) | (1L << (RESPECT - 193)) | (1L << (RESTRICT - 193)) | (1L << (REVOKE - 193)) | (1L << (RLIKE - 193)) | (1L << (ROLE - 193)) | (1L << (ROLES - 193)) | (1L << (ROLLBACK - 193)) | (1L << (ROLLUP - 193)) | (1L << (ROW - 193)) | (1L << (ROWS - 193)) | (1L << (SECOND - 193)) | (1L << (SCHEMA - 193)) | (1L << (SCHEMAS - 193)) | (1L << (SELECT - 193)) | (1L << (SEPARATED - 193)) | (1L << (SERDE - 193)) | (1L << (SERDEPROPERTIES - 193)) | (1L << (SESSION_USER - 193)) | (1L << (SET - 193)) | (1L << (SETS - 193)) | (1L << (SHOW - 193)) | (1L << (SKEWED - 193)) | (1L << (SOME - 193)) | (1L << (SORT - 193)) | (1L << (SORTED - 193)) | (1L << (START - 193)) | (1L << (STATISTICS - 193)) | (1L << (STORED - 193)) | (1L << (STRATIFY - 193)) | (1L << (STRUCT - 193)) | (1L << (SUBSTR - 193)) | (1L << (SUBSTRING - 193)) | (1L << (SYNC - 193)) | (1L << (SYSTEM_TIME - 193)) | (1L << (SYSTEM_VERSION - 193)) | (1L << (TABLE - 193)) | (1L << (TABLES - 193)) | (1L << (TABLESAMPLE - 193)) | (1L << (TBLPROPERTIES - 193)) | (1L << (TEMPORARY - 193)) | (1L << (TERMINATED - 193)) | (1L << (THEN - 193)) | (1L << (TIME - 193)) | (1L << (TIMESTAMP - 193)) | (1L << (TIMESTAMPADD - 193)) | (1L << (TIMESTAMPDIFF - 193)) | (1L << (TO - 193)) | (1L << (TOUCH - 193)) | (1L << (TRAILING - 193)) | (1L << (TRANSACTION - 193)) | (1L << (TRANSACTIONS - 193)))) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & ((1L << (TRANSFORM - 257)) | (1L << (TRIM - 257)) | (1L << (TRUE - 257)) | (1L << (TRUNCATE - 257)) | (1L << (TRY_CAST - 257)) | (1L << (TYPE - 257)) | (1L << (UNARCHIVE - 257)) | (1L << (UNBOUNDED - 257)) | (1L << (UNCACHE - 257)) | (1L << (UNIQUE - 257)) | (1L << (UNKNOWN - 257)) | (1L << (UNLOCK - 257)) | (1L << (UNSET - 257)) | (1L << (UPDATE - 257)) | (1L << (USE - 257)) | (1L << (USER - 257)) | (1L << (VALUES - 257)) | (1L << (VERSION - 257)) | (1L << (VIEW - 257)) | (1L << (VIEWS - 257)) | (1L << (WEEK - 257)) | (1L << (WHEN - 257)) | (1L << (WHERE - 257)) | (1L << (WINDOW - 257)) | (1L << (WITH - 257)) | (1L << (WITHIN - 257)) | (1L << (YEAR - 257)) | (1L << (ZONE - 257)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 105:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 107:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 109:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 143:
			return identifier_sempred((IdentifierContext)_localctx, predIndex);
		case 144:
			return strictIdentifier_sempred((StrictIdentifierContext)_localctx, predIndex);
		case 146:
			return number_sempred((NumberContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		case 1:
			return legacy_setops_precedence_enabled;
		case 2:
			return precpred(_ctx, 2);
		case 3:
			return !legacy_setops_precedence_enabled;
		case 4:
			return precpred(_ctx, 1);
		case 5:
			return !legacy_setops_precedence_enabled;
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		case 13:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 14:
			return precpred(_ctx, 9);
		case 15:
			return precpred(_ctx, 7);
		}
		return true;
	}
	private boolean identifier_sempred(IdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean strictIdentifier_sempred(StrictIdentifierContext _localctx, int predIndex) {
		switch (predIndex) {
		case 17:
			return SQL_standard_keyword_behavior;
		case 18:
			return !SQL_standard_keyword_behavior;
		}
		return true;
	}
	private boolean number_sempred(NumberContext _localctx, int predIndex) {
		switch (predIndex) {
		case 19:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 20:
			return !legacy_exponent_literal_as_decimal_enabled;
		case 21:
			return legacy_exponent_literal_as_decimal_enabled;
		}
		return true;
	}

	private static final int _serializedATNSegments = 2;
	private static final String _serializedATNSegment0 =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\u0146\u0cff\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\4\u008a\t\u008a\4\u008b\t\u008b\4\u008c\t\u008c\4\u008d\t\u008d\4\u008e"+
		"\t\u008e\4\u008f\t\u008f\4\u0090\t\u0090\4\u0091\t\u0091\4\u0092\t\u0092"+
		"\4\u0093\t\u0093\4\u0094\t\u0094\4\u0095\t\u0095\4\u0096\t\u0096\4\u0097"+
		"\t\u0097\4\u0098\t\u0098\3\2\3\2\7\2\u0133\n\2\f\2\16\2\u0136\13\2\3\2"+
		"\3\2\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3"+
		"\b\3\b\3\t\3\t\5\t\u014e\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u015b\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0162\n\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\7\t\u016a\n\t\f\t\16\t\u016d\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0180\n\t\3\t\3\t\5\t\u0184\n"+
		"\t\3\t\3\t\3\t\3\t\5\t\u018a\n\t\3\t\5\t\u018d\n\t\3\t\5\t\u0190\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u0197\n\t\3\t\5\t\u019a\n\t\3\t\3\t\5\t\u019e\n"+
		"\t\3\t\5\t\u01a1\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u01a8\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u01b3\n\t\f\t\16\t\u01b6\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\5\t\u01bd\n\t\3\t\5\t\u01c0\n\t\3\t\3\t\5\t\u01c4\n\t\3\t\5\t\u01c7"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u01cd\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\5\t\u01d8\n\t\3\t\3\t\3\t\3\t\5\t\u01de\n\t\3\t\3\t\3\t\5\t\u01e3\n\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0223\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\5\t\u022c\n\t\3\t\3\t\5\t\u0230\n\t\3\t\3\t\3\t\3\t\5\t\u0236"+
		"\n\t\3\t\3\t\5\t\u023a\n\t\3\t\3\t\3\t\5\t\u023f\n\t\3\t\3\t\3\t\3\t\5"+
		"\t\u0245\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0251\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\5\t\u0259\n\t\3\t\3\t\3\t\3\t\5\t\u025f\n\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u026c\n\t\3\t\6\t\u026f\n\t"+
		"\r\t\16\t\u0270\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u0281\n\t\3\t\3\t\3\t\7\t\u0286\n\t\f\t\16\t\u0289\13\t\3\t\5\t"+
		"\u028c\n\t\3\t\3\t\3\t\3\t\5\t\u0292\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\5\t\u02a1\n\t\3\t\3\t\5\t\u02a5\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u02ab\n\t\3\t\3\t\3\t\3\t\5\t\u02b1\n\t\3\t\5\t\u02b4\n\t\3\t"+
		"\5\t\u02b7\n\t\3\t\3\t\3\t\3\t\5\t\u02bd\n\t\3\t\3\t\5\t\u02c1\n\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\7\t\u02c9\n\t\f\t\16\t\u02cc\13\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\5\t\u02d4\n\t\3\t\5\t\u02d7\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5"+
		"\t\u02e0\n\t\3\t\3\t\3\t\5\t\u02e5\n\t\3\t\3\t\3\t\3\t\5\t\u02eb\n\t\3"+
		"\t\3\t\3\t\3\t\3\t\5\t\u02f2\n\t\3\t\5\t\u02f5\n\t\3\t\3\t\3\t\3\t\5\t"+
		"\u02fb\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0304\n\t\f\t\16\t\u0307\13"+
		"\t\5\t\u0309\n\t\3\t\3\t\5\t\u030d\n\t\3\t\3\t\3\t\5\t\u0312\n\t\3\t\3"+
		"\t\3\t\5\t\u0317\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u031e\n\t\3\t\5\t\u0321\n"+
		"\t\3\t\5\t\u0324\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u032b\n\t\3\t\3\t\3\t\5\t"+
		"\u0330\n\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u0339\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\5\t\u0341\n\t\3\t\3\t\3\t\3\t\5\t\u0347\n\t\3\t\5\t\u034a\n\t\3"+
		"\t\5\t\u034d\n\t\3\t\3\t\3\t\3\t\5\t\u0353\n\t\3\t\3\t\5\t\u0357\n\t\3"+
		"\t\3\t\3\t\5\t\u035c\n\t\3\t\5\t\u035f\n\t\3\t\3\t\5\t\u0363\n\t\5\t\u0365"+
		"\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u036d\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t"+
		"\u0375\n\t\3\t\5\t\u0378\n\t\3\t\3\t\3\t\5\t\u037d\n\t\3\t\3\t\3\t\3\t"+
		"\5\t\u0383\n\t\3\t\3\t\3\t\3\t\5\t\u0389\n\t\3\t\5\t\u038c\n\t\3\t\3\t"+
		"\5\t\u0390\n\t\3\t\5\t\u0393\n\t\3\t\3\t\5\t\u0397\n\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\7\t\u03b1\n\t\f\t\16\t\u03b4\13\t\5\t\u03b6\n\t\3\t\3\t\5\t"+
		"\u03ba\n\t\3\t\3\t\3\t\3\t\5\t\u03c0\n\t\3\t\5\t\u03c3\n\t\3\t\5\t\u03c6"+
		"\n\t\3\t\3\t\3\t\3\t\5\t\u03cc\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03d4\n"+
		"\t\3\t\3\t\3\t\5\t\u03d9\n\t\3\t\3\t\3\t\3\t\5\t\u03df\n\t\3\t\3\t\3\t"+
		"\3\t\5\t\u03e5\n\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u03ed\n\t\3\t\3\t\3\t\7"+
		"\t\u03f2\n\t\f\t\16\t\u03f5\13\t\3\t\3\t\3\t\7\t\u03fa\n\t\f\t\16\t\u03fd"+
		"\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u040b\n\t\f"+
		"\t\16\t\u040e\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u0419\n\t\f"+
		"\t\16\t\u041c\13\t\5\t\u041e\n\t\3\t\3\t\7\t\u0422\n\t\f\t\16\t\u0425"+
		"\13\t\3\t\3\t\3\t\3\t\7\t\u042b\n\t\f\t\16\t\u042e\13\t\3\t\3\t\3\t\3"+
		"\t\7\t\u0434\n\t\f\t\16\t\u0437\13\t\3\t\3\t\3\t\3\t\3\t\5\t\u043e\n\t"+
		"\3\t\3\t\3\t\5\t\u0443\n\t\3\t\3\t\3\t\5\t\u0448\n\t\3\t\3\t\3\t\3\t\3"+
		"\t\5\t\u044f\n\t\3\t\3\t\3\t\3\t\5\t\u0455\n\t\3\t\3\t\3\t\5\t\u045a\n"+
		"\t\3\t\3\t\3\t\3\t\7\t\u0460\n\t\f\t\16\t\u0463\13\t\5\t\u0465\n\t\3\n"+
		"\3\n\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0471\n\f\3\f\3\f\5\f\u0475"+
		"\n\f\3\f\3\f\3\f\3\f\3\f\5\f\u047c\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\5\f\u04f0\n\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u04f8\n\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\5\f\u0500\n\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0509\n\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f\u0513\n\f\3\r\3\r\5\r\u0517\n\r\3\r\5"+
		"\r\u051a\n\r\3\r\3\r\3\r\3\r\5\r\u0520\n\r\3\r\3\r\3\16\3\16\5\16\u0526"+
		"\n\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u0532\n\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u053e\n\20\3\20"+
		"\3\20\3\20\5\20\u0543\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\23\5\23\u054c"+
		"\n\23\3\23\3\23\3\23\3\24\3\24\3\24\5\24\u0554\n\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u055b\n\24\5\24\u055d\n\24\3\24\5\24\u0560\n\24\3\24\3\24\3"+
		"\24\5\24\u0565\n\24\3\24\3\24\5\24\u0569\n\24\3\24\3\24\3\24\5\24\u056e"+
		"\n\24\3\24\5\24\u0571\n\24\3\24\3\24\3\24\5\24\u0576\n\24\3\24\3\24\3"+
		"\24\5\24\u057b\n\24\3\24\5\24\u057e\n\24\3\24\3\24\3\24\5\24\u0583\n\24"+
		"\3\24\3\24\5\24\u0587\n\24\3\24\3\24\3\24\5\24\u058c\n\24\5\24\u058e\n"+
		"\24\3\25\3\25\5\25\u0592\n\25\3\26\3\26\3\26\3\26\3\26\7\26\u0599\n\26"+
		"\f\26\16\26\u059c\13\26\3\26\3\26\3\27\3\27\3\27\5\27\u05a3\n\27\3\27"+
		"\3\27\3\27\3\27\5\27\u05a9\n\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\32"+
		"\3\32\5\32\u05b4\n\32\3\33\3\33\3\33\7\33\u05b9\n\33\f\33\16\33\u05bc"+
		"\13\33\3\34\3\34\3\34\3\34\7\34\u05c2\n\34\f\34\16\34\u05c5\13\34\3\35"+
		"\3\35\5\35\u05c9\n\35\3\35\5\35\u05cc\n\35\3\35\3\35\3\35\3\35\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\7\37\u05e4\n\37\f\37\16\37\u05e7\13\37\3 \3 \3 \3 \7 \u05ed"+
		"\n \f \16 \u05f0\13 \3 \3 \3!\3!\5!\u05f6\n!\3!\5!\u05f9\n!\3\"\3\"\3"+
		"\"\7\"\u05fe\n\"\f\"\16\"\u0601\13\"\3\"\5\"\u0604\n\"\3#\3#\3#\3#\5#"+
		"\u060a\n#\3$\3$\3$\3$\7$\u0610\n$\f$\16$\u0613\13$\3$\3$\3%\3%\3%\3%\7"+
		"%\u061b\n%\f%\16%\u061e\13%\3%\3%\3&\3&\3&\3&\3&\3&\5&\u0628\n&\3\'\3"+
		"\'\3\'\3\'\3\'\5\'\u062f\n\'\3(\3(\3(\3(\5(\u0635\n(\3)\3)\3)\3*\3*\3"+
		"*\3*\3*\6*\u063f\n*\r*\16*\u0640\3*\3*\3*\3*\3*\5*\u0648\n*\3*\3*\3*\3"+
		"*\3*\5*\u064f\n*\3*\3*\3*\3*\3*\3*\3*\3*\3*\3*\5*\u065b\n*\3*\3*\3*\3"+
		"*\7*\u0661\n*\f*\16*\u0664\13*\3*\7*\u0667\n*\f*\16*\u066a\13*\5*\u066c"+
		"\n*\3+\3+\3+\3+\3+\7+\u0673\n+\f+\16+\u0676\13+\5+\u0678\n+\3+\3+\3+\3"+
		"+\3+\7+\u067f\n+\f+\16+\u0682\13+\5+\u0684\n+\3+\3+\3+\3+\3+\7+\u068b"+
		"\n+\f+\16+\u068e\13+\5+\u0690\n+\3+\3+\3+\3+\3+\7+\u0697\n+\f+\16+\u069a"+
		"\13+\5+\u069c\n+\3+\5+\u069f\n+\3+\3+\3+\5+\u06a4\n+\5+\u06a6\n+\3,\3"+
		",\3,\3-\3-\3-\3-\3-\3-\3-\5-\u06b2\n-\3-\3-\3-\3-\3-\5-\u06b9\n-\3-\3"+
		"-\3-\3-\3-\5-\u06c0\n-\3-\7-\u06c3\n-\f-\16-\u06c6\13-\3.\3.\3.\3.\3."+
		"\3.\3.\3.\3.\5.\u06d1\n.\3/\3/\5/\u06d5\n/\3/\3/\5/\u06d9\n/\3\60\3\60"+
		"\6\60\u06dd\n\60\r\60\16\60\u06de\3\61\3\61\5\61\u06e3\n\61\3\61\3\61"+
		"\3\61\3\61\7\61\u06e9\n\61\f\61\16\61\u06ec\13\61\3\61\5\61\u06ef\n\61"+
		"\3\61\5\61\u06f2\n\61\3\61\5\61\u06f5\n\61\3\61\5\61\u06f8\n\61\3\61\3"+
		"\61\5\61\u06fc\n\61\3\62\3\62\5\62\u0700\n\62\3\62\7\62\u0703\n\62\f\62"+
		"\16\62\u0706\13\62\3\62\5\62\u0709\n\62\3\62\5\62\u070c\n\62\3\62\5\62"+
		"\u070f\n\62\3\62\5\62\u0712\n\62\3\62\3\62\5\62\u0716\n\62\3\62\7\62\u0719"+
		"\n\62\f\62\16\62\u071c\13\62\3\62\5\62\u071f\n\62\3\62\5\62\u0722\n\62"+
		"\3\62\5\62\u0725\n\62\3\62\5\62\u0728\n\62\5\62\u072a\n\62\3\63\3\63\3"+
		"\63\3\63\5\63\u0730\n\63\3\63\3\63\3\63\3\63\3\63\5\63\u0737\n\63\3\63"+
		"\3\63\3\63\5\63\u073c\n\63\3\63\5\63\u073f\n\63\3\63\5\63\u0742\n\63\3"+
		"\63\3\63\5\63\u0746\n\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63\5\63"+
		"\u0750\n\63\3\63\3\63\5\63\u0754\n\63\5\63\u0756\n\63\3\63\5\63\u0759"+
		"\n\63\3\63\3\63\5\63\u075d\n\63\3\64\3\64\7\64\u0761\n\64\f\64\16\64\u0764"+
		"\13\64\3\64\5\64\u0767\n\64\3\64\3\64\3\65\3\65\3\65\3\66\3\66\3\66\3"+
		"\66\5\66\u0772\n\66\3\66\3\66\3\66\3\67\3\67\3\67\3\67\3\67\5\67\u077c"+
		"\n\67\3\67\3\67\3\67\38\38\38\38\38\38\38\58\u0788\n8\39\39\39\39\39\3"+
		"9\39\39\39\39\39\79\u0795\n9\f9\169\u0798\139\39\39\59\u079c\n9\3:\3:"+
		"\3:\7:\u07a1\n:\f:\16:\u07a4\13:\3;\3;\3;\3;\3<\3<\3<\3=\3=\3=\3>\3>\3"+
		">\5>\u07b3\n>\3>\7>\u07b6\n>\f>\16>\u07b9\13>\3>\3>\3?\3?\3?\3?\3?\3?"+
		"\7?\u07c3\n?\f?\16?\u07c6\13?\3?\3?\5?\u07ca\n?\3@\3@\3@\3@\7@\u07d0\n"+
		"@\f@\16@\u07d3\13@\3@\7@\u07d6\n@\f@\16@\u07d9\13@\3@\5@\u07dc\n@\3A\5"+
		"A\u07df\nA\3A\3A\3A\3A\3A\5A\u07e6\nA\3A\3A\3A\3A\5A\u07ec\nA\3B\3B\3"+
		"B\3B\3B\7B\u07f3\nB\fB\16B\u07f6\13B\3B\3B\3B\3B\3B\7B\u07fd\nB\fB\16"+
		"B\u0800\13B\3B\3B\3B\3B\3B\3B\3B\3B\3B\3B\7B\u080c\nB\fB\16B\u080f\13"+
		"B\3B\3B\5B\u0813\nB\5B\u0815\nB\3C\3C\5C\u0819\nC\3D\3D\3D\3D\3D\7D\u0820"+
		"\nD\fD\16D\u0823\13D\3D\3D\3D\3D\3D\3D\3D\3D\7D\u082d\nD\fD\16D\u0830"+
		"\13D\3D\3D\5D\u0834\nD\3E\3E\5E\u0838\nE\3F\3F\3F\3F\7F\u083e\nF\fF\16"+
		"F\u0841\13F\5F\u0843\nF\3F\3F\5F\u0847\nF\3G\3G\3G\3G\3G\3G\3G\3G\3G\3"+
		"G\7G\u0853\nG\fG\16G\u0856\13G\3G\3G\3G\3H\3H\3H\3H\3H\7H\u0860\nH\fH"+
		"\16H\u0863\13H\3H\3H\5H\u0867\nH\3I\3I\5I\u086b\nI\3I\5I\u086e\nI\3J\3"+
		"J\3J\5J\u0873\nJ\3J\3J\3J\3J\3J\7J\u087a\nJ\fJ\16J\u087d\13J\5J\u087f"+
		"\nJ\3J\3J\3J\5J\u0884\nJ\3J\3J\3J\7J\u0889\nJ\fJ\16J\u088c\13J\5J\u088e"+
		"\nJ\3K\3K\3L\5L\u0893\nL\3L\3L\7L\u0897\nL\fL\16L\u089a\13L\3M\3M\3M\5"+
		"M\u089f\nM\3M\3M\5M\u08a3\nM\3M\3M\3M\3M\5M\u08a9\nM\3M\3M\5M\u08ad\n"+
		"M\3N\5N\u08b0\nN\3N\3N\3N\5N\u08b5\nN\3N\5N\u08b8\nN\3N\3N\3N\5N\u08bd"+
		"\nN\3N\3N\5N\u08c1\nN\3N\5N\u08c4\nN\3N\5N\u08c7\nN\3O\3O\3O\3O\5O\u08cd"+
		"\nO\3P\3P\3P\5P\u08d2\nP\3P\3P\3P\3P\3P\5P\u08d9\nP\3Q\5Q\u08dc\nQ\3Q"+
		"\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\3Q\5Q\u08ee\nQ\5Q\u08f0\nQ"+
		"\3Q\5Q\u08f3\nQ\3R\3R\3R\3R\3S\3S\3S\7S\u08fc\nS\fS\16S\u08ff\13S\3T\3"+
		"T\3T\3T\7T\u0905\nT\fT\16T\u0908\13T\3T\3T\3U\3U\5U\u090e\nU\3V\3V\3V"+
		"\3V\7V\u0914\nV\fV\16V\u0917\13V\3V\3V\3W\3W\5W\u091d\nW\3X\3X\5X\u0921"+
		"\nX\3X\5X\u0924\nX\3X\3X\3X\3X\3X\3X\5X\u092c\nX\3X\3X\3X\3X\3X\3X\5X"+
		"\u0934\nX\3X\3X\3X\3X\5X\u093a\nX\3Y\3Y\3Y\3Y\7Y\u0940\nY\fY\16Y\u0943"+
		"\13Y\3Y\3Y\3Z\3Z\3Z\3Z\3Z\7Z\u094c\nZ\fZ\16Z\u094f\13Z\5Z\u0951\nZ\3Z"+
		"\3Z\3Z\3[\5[\u0957\n[\3[\3[\5[\u095b\n[\5[\u095d\n[\3\\\3\\\3\\\3\\\3"+
		"\\\3\\\3\\\5\\\u0966\n\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\3\\\5\\\u0972"+
		"\n\\\5\\\u0974\n\\\3\\\3\\\3\\\3\\\3\\\5\\\u097b\n\\\3\\\3\\\3\\\3\\\3"+
		"\\\5\\\u0982\n\\\3\\\3\\\3\\\3\\\5\\\u0988\n\\\3\\\3\\\3\\\3\\\5\\\u098e"+
		"\n\\\5\\\u0990\n\\\3]\3]\3]\7]\u0995\n]\f]\16]\u0998\13]\3^\3^\3^\7^\u099d"+
		"\n^\f^\16^\u09a0\13^\3_\3_\3_\7_\u09a5\n_\f_\16_\u09a8\13_\3`\3`\3`\5"+
		"`\u09ad\n`\3a\3a\3a\5a\u09b2\na\3a\3a\3b\3b\3b\5b\u09b9\nb\3b\3b\3c\3"+
		"c\5c\u09bf\nc\3c\3c\5c\u09c3\nc\5c\u09c5\nc\3d\3d\3d\7d\u09ca\nd\fd\16"+
		"d\u09cd\13d\3e\3e\3e\3e\7e\u09d3\ne\fe\16e\u09d6\13e\3e\3e\3f\3f\5f\u09dc"+
		"\nf\3g\3g\3g\3g\3g\3g\7g\u09e4\ng\fg\16g\u09e7\13g\3g\3g\5g\u09eb\ng\3"+
		"h\3h\5h\u09ef\nh\3i\3i\3j\3j\3j\7j\u09f6\nj\fj\16j\u09f9\13j\3k\3k\3k"+
		"\3k\3k\3k\3k\3k\3k\3k\5k\u0a05\nk\5k\u0a07\nk\3k\3k\3k\3k\3k\3k\7k\u0a0f"+
		"\nk\fk\16k\u0a12\13k\3l\5l\u0a15\nl\3l\3l\3l\3l\3l\3l\5l\u0a1d\nl\3l\3"+
		"l\3l\3l\3l\7l\u0a24\nl\fl\16l\u0a27\13l\3l\3l\3l\5l\u0a2c\nl\3l\3l\3l"+
		"\3l\3l\3l\5l\u0a34\nl\3l\3l\3l\5l\u0a39\nl\3l\3l\3l\3l\3l\3l\3l\3l\7l"+
		"\u0a43\nl\fl\16l\u0a46\13l\3l\3l\5l\u0a4a\nl\3l\5l\u0a4d\nl\3l\3l\3l\3"+
		"l\5l\u0a53\nl\3l\3l\5l\u0a57\nl\3l\3l\3l\5l\u0a5c\nl\3l\3l\3l\5l\u0a61"+
		"\nl\3l\3l\3l\5l\u0a66\nl\3m\3m\3m\3m\5m\u0a6c\nm\3m\3m\3m\3m\3m\3m\3m"+
		"\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\3m\7m\u0a81\nm\fm\16m\u0a84\13m\3n\3"+
		"n\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\6"+
		"o\u0a9e\no\ro\16o\u0a9f\3o\3o\5o\u0aa4\no\3o\3o\3o\3o\3o\6o\u0aab\no\r"+
		"o\16o\u0aac\3o\3o\5o\u0ab1\no\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\7o\u0ac1\no\fo\16o\u0ac4\13o\5o\u0ac6\no\3o\3o\3o\3o\3o\3o\5o\u0ace"+
		"\no\3o\3o\3o\3o\3o\3o\3o\5o\u0ad7\no\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o"+
		"\3o\3o\3o\3o\3o\3o\3o\3o\6o\u0aec\no\ro\16o\u0aed\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\5o\u0af9\no\3o\3o\3o\7o\u0afe\no\fo\16o\u0b01\13o\5o\u0b03\no"+
		"\3o\3o\3o\3o\3o\3o\3o\5o\u0b0c\no\3o\3o\5o\u0b10\no\3o\3o\5o\u0b14\no"+
		"\3o\3o\3o\3o\3o\3o\3o\3o\6o\u0b1e\no\ro\16o\u0b1f\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0b39\no\3o\3o\3"+
		"o\3o\3o\5o\u0b40\no\3o\5o\u0b43\no\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3"+
		"o\3o\5o\u0b52\no\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\3o\5o\u0b63"+
		"\no\5o\u0b65\no\3o\3o\3o\3o\3o\3o\3o\3o\7o\u0b6f\no\fo\16o\u0b72\13o\3"+
		"p\3p\3p\3p\3p\3p\3p\3p\6p\u0b7c\np\rp\16p\u0b7d\5p\u0b80\np\3q\3q\3r\3"+
		"r\3s\3s\3t\3t\3u\3u\3u\5u\u0b8d\nu\3v\3v\5v\u0b91\nv\3w\3w\3w\6w\u0b96"+
		"\nw\rw\16w\u0b97\3x\3x\3x\5x\u0b9d\nx\3y\3y\3y\3y\3y\3z\5z\u0ba5\nz\3"+
		"z\3z\3{\3{\3{\5{\u0bac\n{\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3|\3"+
		"|\5|\u0bbd\n|\3|\3|\5|\u0bc1\n|\3|\3|\3|\3|\5|\u0bc7\n|\3|\3|\3|\3|\5"+
		"|\u0bcd\n|\3|\3|\3|\3|\3|\7|\u0bd4\n|\f|\16|\u0bd7\13|\3|\5|\u0bda\n|"+
		"\5|\u0bdc\n|\3}\3}\3}\7}\u0be1\n}\f}\16}\u0be4\13}\3~\3~\3~\3~\5~\u0bea"+
		"\n~\3~\5~\u0bed\n~\3~\5~\u0bf0\n~\3~\5~\u0bf3\n~\3\177\3\177\3\177\3\u0080"+
		"\3\u0080\3\u0080\7\u0080\u0bfb\n\u0080\f\u0080\16\u0080\u0bfe\13\u0080"+
		"\3\u0081\3\u0081\3\u0081\3\u0081\5\u0081\u0c04\n\u0081\3\u0081\5\u0081"+
		"\u0c07\n\u0081\3\u0082\3\u0082\3\u0082\7\u0082\u0c0c\n\u0082\f\u0082\16"+
		"\u0082\u0c0f\13\u0082\3\u0083\3\u0083\3\u0083\3\u0083\5\u0083\u0c15\n"+
		"\u0083\3\u0083\5\u0083\u0c18\n\u0083\3\u0083\5\u0083\u0c1b\n\u0083\3\u0084"+
		"\3\u0084\3\u0084\7\u0084\u0c20\n\u0084\f\u0084\16\u0084\u0c23\13\u0084"+
		"\3\u0085\3\u0085\5\u0085\u0c27\n\u0085\3\u0085\3\u0085\3\u0085\5\u0085"+
		"\u0c2c\n\u0085\3\u0085\5\u0085\u0c2f\n\u0085\3\u0086\3\u0086\3\u0086\3"+
		"\u0086\3\u0086\3\u0087\3\u0087\3\u0087\3\u0087\7\u0087\u0c3a\n\u0087\f"+
		"\u0087\16\u0087\u0c3d\13\u0087\3\u0088\3\u0088\3\u0088\3\u0088\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\7\u0089\u0c4e\n\u0089\f\u0089\16\u0089\u0c51\13\u0089\3\u0089"+
		"\3\u0089\3\u0089\3\u0089\3\u0089\7\u0089\u0c58\n\u0089\f\u0089\16\u0089"+
		"\u0c5b\13\u0089\5\u0089\u0c5d\n\u0089\3\u0089\3\u0089\3\u0089\3\u0089"+
		"\3\u0089\7\u0089\u0c64\n\u0089\f\u0089\16\u0089\u0c67\13\u0089\5\u0089"+
		"\u0c69\n\u0089\5\u0089\u0c6b\n\u0089\3\u0089\5\u0089\u0c6e\n\u0089\3\u0089"+
		"\5\u0089\u0c71\n\u0089\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a\3\u008a"+
		"\3\u008a\5\u008a\u0c83\n\u008a\3\u008b\3\u008b\3\u008b\3\u008b\3\u008b"+
		"\3\u008b\3\u008b\5\u008b\u0c8c\n\u008b\3\u008c\3\u008c\3\u008c\7\u008c"+
		"\u0c91\n\u008c\f\u008c\16\u008c\u0c94\13\u008c\3\u008d\3\u008d\3\u008d"+
		"\3\u008d\5\u008d\u0c9a\n\u008d\3\u008e\3\u008e\3\u008e\7\u008e\u0c9f\n"+
		"\u008e\f\u008e\16\u008e\u0ca2\13\u008e\3\u008f\3\u008f\3\u008f\3\u0090"+
		"\3\u0090\6\u0090\u0ca9\n\u0090\r\u0090\16\u0090\u0caa\3\u0090\5\u0090"+
		"\u0cae\n\u0090\3\u0091\3\u0091\3\u0091\5\u0091\u0cb3\n\u0091\3\u0092\3"+
		"\u0092\3\u0092\3\u0092\3\u0092\3\u0092\5\u0092\u0cbb\n\u0092\3\u0093\3"+
		"\u0093\3\u0094\3\u0094\5\u0094\u0cc1\n\u0094\3\u0094\3\u0094\3\u0094\5"+
		"\u0094\u0cc6\n\u0094\3\u0094\3\u0094\3\u0094\5\u0094\u0ccb\n\u0094\3\u0094"+
		"\3\u0094\5\u0094\u0ccf\n\u0094\3\u0094\3\u0094\5\u0094\u0cd3\n\u0094\3"+
		"\u0094\3\u0094\5\u0094\u0cd7\n\u0094\3\u0094\3\u0094\5\u0094\u0cdb\n\u0094"+
		"\3\u0094\3\u0094\5\u0094\u0cdf\n\u0094\3\u0094\3\u0094\5\u0094\u0ce3\n"+
		"\u0094\3\u0094\3\u0094\5\u0094\u0ce7\n\u0094\3\u0094\5\u0094\u0cea\n\u0094"+
		"\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095\3\u0095"+
		"\3\u0095\3\u0095\5\u0095\u0cf7\n\u0095\3\u0096\3\u0096\3\u0097\3\u0097"+
		"\3\u0098\3\u0098\3\u0098\13\u03b2\u03f3\u03fb\u040c\u041a\u0423\u042c"+
		"\u0435\u0461\6X\u00d4\u00d8\u00dc\u0099\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080"+
		"\u0082\u0084\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098"+
		"\u009a\u009c\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0"+
		"\u00b2\u00b4\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8"+
		"\u00ca\u00cc\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0"+
		"\u00e2\u00e4\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8"+
		"\u00fa\u00fc\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110"+
		"\u0112\u0114\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128"+
		"\u012a\u012c\u012e\2<\4\2DD\u00bd\u00bd\4\2\36\36\u00ce\u00ce\4\2iivv"+
		"\3\2+,\4\2\u00f3\u00f3\u0117\u0117\4\2\r\r##\7\2((\64\64[[hh\u0093\u0093"+
		"\3\2IJ\4\2[[hh\4\2\u00a2\u00a2\u0137\u0137\5\2\n\nQQ\u00f0\u00f0\4\2\n"+
		"\n\u008d\u008d\4\2\u008f\u008f\u0137\u0137\5\2@@\u009d\u009d\u00d9\u00d9"+
		"\5\2AA\u009e\u009e\u00da\u00da\6\2VV}}\u00e2\u00e2\u010c\u010c\5\2VV\u00e2"+
		"\u00e2\u010c\u010c\4\2\25\25II\4\2cc\u0084\u0084\4\2\u00f2\u00f2\u0116"+
		"\u0116\4\2\u0137\u0137\u013b\u013b\4\2\u00f1\u00f1\u00fb\u00fb\4\2\67"+
		"\67\u00d5\u00d5\4\2\f\fNN\4\2\u013b\u013b\u013d\u013d\3\2\u0089\u008a"+
		"\5\2\f\f\21\21\u00e6\u00e6\5\2^^\u0105\u0105\u010e\u010e\4\2\u0129\u012a"+
		"\u012e\u012e\4\2PP\u012b\u012d\4\2\u0129\u012a\u0131\u0131\t\2=>rr\u0098"+
		"\u009b\u00bf\u00bf\u00d8\u00d8\u0119\u0119\u011f\u011f\4\299;<\4\2BB\u00fc"+
		"\u00fc\4\2CC\u00fd\u00fd\4\2  \u0107\u0107\4\2tt\u00cd\u00cd\3\2\u00ee"+
		"\u00ef\4\2\6\6ii\4\2\6\6ee\5\2\31\31\u0087\u0087\u0100\u0100\3\2\u0121"+
		"\u0128\4\2PP\u0129\u0132\6\2\17\17vv\u00a1\u00a1\u00a9\u00a9\4\2^^\u0105"+
		"\u0105\3\2\u0129\u012a\5\2\u0137\u0137\u013b\u013b\u013d\u013d\4\2\u009b"+
		"\u009b\u011f\u011f\6\2==rr\u009a\u009a\u00d8\u00d8\5\2rr\u009a\u009a\u00d8"+
		"\u00d8\4\2OO\u00b2\u00b2\4\2\u00aa\u00aa\u00e7\u00e7\4\2dd\u00ba\u00ba"+
		"\3\2\u013c\u013d\4\2QQ\u00e1\u00e1\65\2\n\13\r\16\20\20\22\23\25\26\30"+
		"\30\32\36!#%(**,\62\64\64\678=MOQUUW]``bdghkmppruwxz|~~\u0081\u0081\u0083"+
		"\u0084\u0086\u0086\u0089\u009e\u00a0\u00a0\u00a3\u00a4\u00a7\u00a8\u00ab"+
		"\u00ab\u00ad\u00ae\u00b0\u00b4\u00b6\u00ba\u00bc\u00c5\u00c7\u00cf\u00d1"+
		"\u00da\u00dc\u00df\u00e1\u00e5\u00e7\u00f2\u00f4\u00f8\u00fb\u00fd\u00ff"+
		"\u00ff\u0101\u010b\u010f\u0112\u0115\u0119\u011c\u011c\u011f\u0120\22"+
		"\2\20\20\66\66VVjjyy}}\u0082\u0082\u0085\u0085\u0088\u0088\u009f\u009f"+
		"\u00a5\u00a5\u00d0\u00d0\u00dc\u00dc\u00e2\u00e2\u010c\u010c\u0114\u0114"+
		"\23\2\n\17\21\65\67UWikxz|~\u0081\u0083\u0084\u0086\u0087\u0089\u009e"+
		"\u00a0\u00a4\u00a6\u00cf\u00d1\u00db\u00dd\u00e1\u00e3\u010b\u010d\u0113"+
		"\u0115\u0120\2\u0f02\2\u0130\3\2\2\2\4\u0139\3\2\2\2\6\u013c\3\2\2\2\b"+
		"\u013f\3\2\2\2\n\u0142\3\2\2\2\f\u0145\3\2\2\2\16\u0148\3\2\2\2\20\u0464"+
		"\3\2\2\2\22\u0466\3\2\2\2\24\u0468\3\2\2\2\26\u0512\3\2\2\2\30\u0514\3"+
		"\2\2\2\32\u0525\3\2\2\2\34\u052b\3\2\2\2\36\u0537\3\2\2\2 \u0544\3\2\2"+
		"\2\"\u0547\3\2\2\2$\u054b\3\2\2\2&\u058d\3\2\2\2(\u058f\3\2\2\2*\u0593"+
		"\3\2\2\2,\u05a8\3\2\2\2.\u05aa\3\2\2\2\60\u05ac\3\2\2\2\62\u05b3\3\2\2"+
		"\2\64\u05b5\3\2\2\2\66\u05bd\3\2\2\28\u05c6\3\2\2\2:\u05d1\3\2\2\2<\u05e5"+
		"\3\2\2\2>\u05e8\3\2\2\2@\u05f3\3\2\2\2B\u0603\3\2\2\2D\u0609\3\2\2\2F"+
		"\u060b\3\2\2\2H\u0616\3\2\2\2J\u0627\3\2\2\2L\u062e\3\2\2\2N\u0630\3\2"+
		"\2\2P\u0636\3\2\2\2R\u066b\3\2\2\2T\u0677\3\2\2\2V\u06a7\3\2\2\2X\u06aa"+
		"\3\2\2\2Z\u06d0\3\2\2\2\\\u06d2\3\2\2\2^\u06da\3\2\2\2`\u06fb\3\2\2\2"+
		"b\u0729\3\2\2\2d\u073e\3\2\2\2f\u075e\3\2\2\2h\u076a\3\2\2\2j\u076d\3"+
		"\2\2\2l\u0776\3\2\2\2n\u0787\3\2\2\2p\u079b\3\2\2\2r\u079d\3\2\2\2t\u07a5"+
		"\3\2\2\2v\u07a9\3\2\2\2x\u07ac\3\2\2\2z\u07af\3\2\2\2|\u07c9\3\2\2\2~"+
		"\u07cb\3\2\2\2\u0080\u07eb\3\2\2\2\u0082\u0814\3\2\2\2\u0084\u0818\3\2"+
		"\2\2\u0086\u0833\3\2\2\2\u0088\u0837\3\2\2\2\u008a\u0846\3\2\2\2\u008c"+
		"\u0848\3\2\2\2\u008e\u0866\3\2\2\2\u0090\u0868\3\2\2\2\u0092\u086f\3\2"+
		"\2\2\u0094\u088f\3\2\2\2\u0096\u0892\3\2\2\2\u0098\u08ac\3\2\2\2\u009a"+
		"\u08c6\3\2\2\2\u009c\u08cc\3\2\2\2\u009e\u08ce\3\2\2\2\u00a0\u08f2\3\2"+
		"\2\2\u00a2\u08f4\3\2\2\2\u00a4\u08f8\3\2\2\2\u00a6\u0900\3\2\2\2\u00a8"+
		"\u090b\3\2\2\2\u00aa\u090f\3\2\2\2\u00ac\u091a\3\2\2\2\u00ae\u0939\3\2"+
		"\2\2\u00b0\u093b\3\2\2\2\u00b2\u0946\3\2\2\2\u00b4\u095c\3\2\2\2\u00b6"+
		"\u098f\3\2\2\2\u00b8\u0991\3\2\2\2\u00ba\u0999\3\2\2\2\u00bc\u09a1\3\2"+
		"\2\2\u00be\u09a9\3\2\2\2\u00c0\u09b1\3\2\2\2\u00c2\u09b8\3\2\2\2\u00c4"+
		"\u09bc\3\2\2\2\u00c6\u09c6\3\2\2\2\u00c8\u09ce\3\2\2\2\u00ca\u09db\3\2"+
		"\2\2\u00cc\u09ea\3\2\2\2\u00ce\u09ee\3\2\2\2\u00d0\u09f0\3\2\2\2\u00d2"+
		"\u09f2\3\2\2\2\u00d4\u0a06\3\2\2\2\u00d6\u0a65\3\2\2\2\u00d8\u0a6b\3\2"+
		"\2\2\u00da\u0a85\3\2\2\2\u00dc\u0b64\3\2\2\2\u00de\u0b7f\3\2\2\2\u00e0"+
		"\u0b81\3\2\2\2\u00e2\u0b83\3\2\2\2\u00e4\u0b85\3\2\2\2\u00e6\u0b87\3\2"+
		"\2\2\u00e8\u0b89\3\2\2\2\u00ea\u0b8e\3\2\2\2\u00ec\u0b95\3\2\2\2\u00ee"+
		"\u0b99\3\2\2\2\u00f0\u0b9e\3\2\2\2\u00f2\u0ba4\3\2\2\2\u00f4\u0bab\3\2"+
		"\2\2\u00f6\u0bdb\3\2\2\2\u00f8\u0bdd\3\2\2\2\u00fa\u0be5\3\2\2\2\u00fc"+
		"\u0bf4\3\2\2\2\u00fe\u0bf7\3\2\2\2\u0100\u0bff\3\2\2\2\u0102\u0c08\3\2"+
		"\2\2\u0104\u0c10\3\2\2\2\u0106\u0c1c\3\2\2\2\u0108\u0c24\3\2\2\2\u010a"+
		"\u0c30\3\2\2\2\u010c\u0c35\3\2\2\2\u010e\u0c3e\3\2\2\2\u0110\u0c70\3\2"+
		"\2\2\u0112\u0c82\3\2\2\2\u0114\u0c8b\3\2\2\2\u0116\u0c8d\3\2\2\2\u0118"+
		"\u0c99\3\2\2\2\u011a\u0c9b\3\2\2\2\u011c\u0ca3\3\2\2\2\u011e\u0cad\3\2"+
		"\2\2\u0120\u0cb2\3\2\2\2\u0122\u0cba\3\2\2\2\u0124\u0cbc\3\2\2\2\u0126"+
		"\u0ce9\3\2\2\2\u0128\u0cf6\3\2\2\2\u012a\u0cf8\3\2\2\2\u012c\u0cfa\3\2"+
		"\2\2\u012e\u0cfc\3\2\2\2\u0130\u0134\5\20\t\2\u0131\u0133\7\3\2\2\u0132"+
		"\u0131\3\2\2\2\u0133\u0136\3\2\2\2\u0134\u0132\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135\u0137\3\2\2\2\u0136\u0134\3\2\2\2\u0137\u0138\7\2\2\3\u0138"+
		"\3\3\2\2\2\u0139\u013a\5\u00c4c\2\u013a\u013b\7\2\2\3\u013b\5\3\2\2\2"+
		"\u013c\u013d\5\u00c0a\2\u013d\u013e\7\2\2\3\u013e\7\3\2\2\2\u013f\u0140"+
		"\5\u00ba^\2\u0140\u0141\7\2\2\3\u0141\t\3\2\2\2\u0142\u0143\5\u00c2b\2"+
		"\u0143\u0144\7\2\2\3\u0144\13\3\2\2\2\u0145\u0146\5\u00f6|\2\u0146\u0147"+
		"\7\2\2\3\u0147\r\3\2\2\2\u0148\u0149\5\u00fe\u0080\2\u0149\u014a\7\2\2"+
		"\3\u014a\17\3\2\2\2\u014b\u0465\5$\23\2\u014c\u014e\5\66\34\2\u014d\u014c"+
		"\3\2\2\2\u014d\u014e\3\2\2\2\u014e\u014f\3\2\2\2\u014f\u0465\5R*\2\u0150"+
		"\u0151\7\u0112\2\2\u0151\u0465\5\u00ba^\2\u0152\u0153\7\u0112\2\2\u0153"+
		"\u0154\5.\30\2\u0154\u0155\5\u00ba^\2\u0155\u0465\3\2\2\2\u0156\u0157"+
		"\7\u00e1\2\2\u0157\u015a\7!\2\2\u0158\u015b\5\u0120\u0091\2\u0159\u015b"+
		"\7\u0137\2\2\u015a\u0158\3\2\2\2\u015a\u0159\3\2\2\2\u015b\u0465\3\2\2"+
		"\2\u015c\u015d\7\65\2\2\u015d\u0161\5.\30\2\u015e\u015f\7s\2\2\u015f\u0160"+
		"\7\u00a1\2\2\u0160\u0162\7X\2\2\u0161\u015e\3\2\2\2\u0161\u0162\3\2\2"+
		"\2\u0162\u0163\3\2\2\2\u0163\u016b\5\u00ba^\2\u0164\u016a\5\"\22\2\u0165"+
		"\u016a\5 \21\2\u0166\u0167\7\u011d\2\2\u0167\u0168\t\2\2\2\u0168\u016a"+
		"\5> \2\u0169\u0164\3\2\2\2\u0169\u0165\3\2\2\2\u0169\u0166\3\2\2\2\u016a"+
		"\u016d\3\2\2\2\u016b\u0169\3\2\2\2\u016b\u016c\3\2\2\2\u016c\u0465\3\2"+
		"\2\2\u016d\u016b\3\2\2\2\u016e\u016f\7\r\2\2\u016f\u0170\5.\30\2\u0170"+
		"\u0171\5\u00ba^\2\u0171\u0172\7\u00e1\2\2\u0172\u0173\t\2\2\2\u0173\u0174"+
		"\5> \2\u0174\u0465\3\2\2\2\u0175\u0176\7\r\2\2\u0176\u0177\5.\30\2\u0177"+
		"\u0178\5\u00ba^\2\u0178\u0179\7\u00e1\2\2\u0179\u017a\5 \21\2\u017a\u0465"+
		"\3\2\2\2\u017b\u017c\7Q\2\2\u017c\u017f\5.\30\2\u017d\u017e\7s\2\2\u017e"+
		"\u0180\7X\2\2\u017f\u017d\3\2\2\2\u017f\u0180\3\2\2\2\u0180\u0181\3\2"+
		"\2\2\u0181\u0183\5\u00ba^\2\u0182\u0184\t\3\2\2\u0183\u0182\3\2\2\2\u0183"+
		"\u0184\3\2\2\2\u0184\u0465\3\2\2\2\u0185\u0186\7\u00e4\2\2\u0186\u0189"+
		"\5\60\31\2\u0187\u0188\t\4\2\2\u0188\u018a\5\u00ba^\2\u0189\u0187\3\2"+
		"\2\2\u0189\u018a\3\2\2\2\u018a\u018f\3\2\2\2\u018b\u018d\7\u0089\2\2\u018c"+
		"\u018b\3\2\2\2\u018c\u018d\3\2\2\2\u018d\u018e\3\2\2\2\u018e\u0190\7\u0137"+
		"\2\2\u018f\u018c\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u0465\3\2\2\2\u0191"+
		"\u0196\5\30\r\2\u0192\u0193\7\4\2\2\u0193\u0194\5\u0102\u0082\2\u0194"+
		"\u0195\7\5\2\2\u0195\u0197\3\2\2\2\u0196\u0192\3\2\2\2\u0196\u0197\3\2"+
		"\2\2\u0197\u0199\3\2\2\2\u0198\u019a\5:\36\2\u0199\u0198\3\2\2\2\u0199"+
		"\u019a\3\2\2\2\u019a\u019b\3\2\2\2\u019b\u01a0\5<\37\2\u019c\u019e\7\24"+
		"\2\2\u019d\u019c\3\2\2\2\u019d\u019e\3\2\2\2\u019e\u019f\3\2\2\2\u019f"+
		"\u01a1\5$\23\2\u01a0\u019d\3\2\2\2\u01a0\u01a1\3\2\2\2\u01a1\u0465\3\2"+
		"\2\2\u01a2\u01a3\7\65\2\2\u01a3\u01a7\7\u00f3\2\2\u01a4\u01a5\7s\2\2\u01a5"+
		"\u01a6\7\u00a1\2\2\u01a6\u01a8\7X\2\2\u01a7\u01a4\3\2\2\2\u01a7\u01a8"+
		"\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01aa\5\u00c0a\2\u01aa\u01ab\7\u0089"+
		"\2\2\u01ab\u01b4\5\u00c0a\2\u01ac\u01b3\5:\36\2\u01ad\u01b3\5\u00b6\\"+
		"\2\u01ae\u01b3\5J&\2\u01af\u01b3\5 \21\2\u01b0\u01b1\7\u00f6\2\2\u01b1"+
		"\u01b3\5> \2\u01b2\u01ac\3\2\2\2\u01b2\u01ad\3\2\2\2\u01b2\u01ae\3\2\2"+
		"\2\u01b2\u01af\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b2"+
		"\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b5\u0465\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7"+
		"\u01bc\5\32\16\2\u01b8\u01b9\7\4\2\2\u01b9\u01ba\5\u0102\u0082\2\u01ba"+
		"\u01bb\7\5\2\2\u01bb\u01bd\3\2\2\2\u01bc\u01b8\3\2\2\2\u01bc\u01bd\3\2"+
		"\2\2\u01bd\u01bf\3\2\2\2\u01be\u01c0\5:\36\2\u01bf\u01be\3\2\2\2\u01bf"+
		"\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c6\5<\37\2\u01c2\u01c4\7\24"+
		"\2\2\u01c3\u01c2\3\2\2\2\u01c3\u01c4\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5"+
		"\u01c7\5$\23\2\u01c6\u01c3\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u0465\3\2"+
		"\2\2\u01c8\u01c9\7\16\2\2\u01c9\u01ca\7\u00f3\2\2\u01ca\u01cc\5\u00ba"+
		"^\2\u01cb\u01cd\5*\26\2\u01cc\u01cb\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cd"+
		"\u01ce\3\2\2\2\u01ce\u01cf\7\61\2\2\u01cf\u01d7\7\u00ea\2\2\u01d0\u01d8"+
		"\5\u0120\u0091\2\u01d1\u01d2\7e\2\2\u01d2\u01d3\7,\2\2\u01d3\u01d8\5\u00a4"+
		"S\2\u01d4\u01d5\7e\2\2\u01d5\u01d6\7\f\2\2\u01d6\u01d8\7,\2\2\u01d7\u01d0"+
		"\3\2\2\2\u01d7\u01d1\3\2\2\2\u01d7\u01d4\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8"+
		"\u0465\3\2\2\2\u01d9\u01da\7\16\2\2\u01da\u01dd\7\u00f4\2\2\u01db\u01dc"+
		"\t\4\2\2\u01dc\u01de\5\u00ba^\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2"+
		"\2\u01de\u01df\3\2\2\2\u01df\u01e0\7\61\2\2\u01e0\u01e2\7\u00ea\2\2\u01e1"+
		"\u01e3\5\u0120\u0091\2\u01e2\u01e1\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3\u0465"+
		"\3\2\2\2\u01e4\u01e5\7\r\2\2\u01e5\u01e6\7\u00f3\2\2\u01e6\u01e7\5\u00ba"+
		"^\2\u01e7\u01e8\7\n\2\2\u01e8\u01e9\t\5\2\2\u01e9\u01ea\5\u00f8}\2\u01ea"+
		"\u0465\3\2\2\2\u01eb\u01ec\7\r\2\2\u01ec\u01ed\7\u00f3\2\2\u01ed\u01ee"+
		"\5\u00ba^\2\u01ee\u01ef\7\n\2\2\u01ef\u01f0\t\5\2\2\u01f0\u01f1\7\4\2"+
		"\2\u01f1\u01f2\5\u00f8}\2\u01f2\u01f3\7\5\2\2\u01f3\u0465\3\2\2\2\u01f4"+
		"\u01f5\7\r\2\2\u01f5\u01f6\7\u00f3\2\2\u01f6\u01f7\5\u00ba^\2\u01f7\u01f8"+
		"\7\u00c8\2\2\u01f8\u01f9\7+\2\2\u01f9\u01fa\5\u00ba^\2\u01fa\u01fb\7\u00fe"+
		"\2\2\u01fb\u01fc\5\u011c\u008f\2\u01fc\u0465\3\2\2\2\u01fd\u01fe\7\r\2"+
		"\2\u01fe\u01ff\7\u00f3\2\2\u01ff\u0200\5\u00ba^\2\u0200\u0201\7Q\2\2\u0201"+
		"\u0202\t\5\2\2\u0202\u0203\7\4\2\2\u0203\u0204\5\u00b8]\2\u0204\u0205"+
		"\7\5\2\2\u0205\u0465\3\2\2\2\u0206\u0207\7\r\2\2\u0207\u0208\7\u00f3\2"+
		"\2\u0208\u0209\5\u00ba^\2\u0209\u020a\7Q\2\2\u020a\u020b\t\5\2\2\u020b"+
		"\u020c\5\u00b8]\2\u020c\u0465\3\2\2\2\u020d\u020e\7\r\2\2\u020e\u020f"+
		"\t\6\2\2\u020f\u0210\5\u00ba^\2\u0210\u0211\7\u00c8\2\2\u0211\u0212\7"+
		"\u00fe\2\2\u0212\u0213\5\u00ba^\2\u0213\u0465\3\2\2\2\u0214\u0215\7\r"+
		"\2\2\u0215\u0216\t\6\2\2\u0216\u0217\5\u00ba^\2\u0217\u0218\7\u00e1\2"+
		"\2\u0218\u0219\7\u00f6\2\2\u0219\u021a\5> \2\u021a\u0465\3\2\2\2\u021b"+
		"\u021c\7\r\2\2\u021c\u021d\t\6\2\2\u021d\u021e\5\u00ba^\2\u021e\u021f"+
		"\7\u0110\2\2\u021f\u0222\7\u00f6\2\2\u0220\u0221\7s\2\2\u0221\u0223\7"+
		"X\2\2\u0222\u0220\3\2\2\2\u0222\u0223\3\2\2\2\u0223\u0224\3\2\2\2\u0224"+
		"\u0225\5> \2\u0225\u0465\3\2\2\2\u0226\u0227\7\r\2\2\u0227\u0228\7\u00f3"+
		"\2\2\u0228\u0229\5\u00ba^\2\u0229\u022b\t\7\2\2\u022a\u022c\7+\2\2\u022b"+
		"\u022a\3\2\2\2\u022b\u022c\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u022f\5\u00ba"+
		"^\2\u022e\u0230\5\u0128\u0095\2\u022f\u022e\3\2\2\2\u022f\u0230\3\2\2"+
		"\2\u0230\u0465\3\2\2\2\u0231\u0232\7\r\2\2\u0232\u0233\7\u00f3\2\2\u0233"+
		"\u0235\5\u00ba^\2\u0234\u0236\5*\26\2\u0235\u0234\3\2\2\2\u0235\u0236"+
		"\3\2\2\2\u0236\u0237\3\2\2\2\u0237\u0239\7#\2\2\u0238\u023a\7+\2\2\u0239"+
		"\u0238\3\2\2\2\u0239\u023a\3\2\2\2\u023a\u023b\3\2\2\2\u023b\u023c\5\u00ba"+
		"^\2\u023c\u023e\5\u0100\u0081\2\u023d\u023f\5\u00f4{\2\u023e\u023d\3\2"+
		"\2\2\u023e\u023f\3\2\2\2\u023f\u0465\3\2\2\2\u0240\u0241\7\r\2\2\u0241"+
		"\u0242\7\u00f3\2\2\u0242\u0244\5\u00ba^\2\u0243\u0245\5*\26\2\u0244\u0243"+
		"\3\2\2\2\u0244\u0245\3\2\2\2\u0245\u0246\3\2\2\2\u0246\u0247\7\u00cb\2"+
		"\2\u0247\u0248\7,\2\2\u0248\u0249\7\4\2\2\u0249\u024a\5\u00f8}\2\u024a"+
		"\u024b\7\5\2\2\u024b\u0465\3\2\2\2\u024c\u024d\7\r\2\2\u024d\u024e\7\u00f3"+
		"\2\2\u024e\u0250\5\u00ba^\2\u024f\u0251\5*\26\2\u0250\u024f\3\2\2\2\u0250"+
		"\u0251\3\2\2\2\u0251\u0252\3\2\2\2\u0252\u0253\7\u00e1\2\2\u0253\u0254"+
		"\7\u00de\2\2\u0254\u0258\7\u0137\2\2\u0255\u0256\7\u011d\2\2\u0256\u0257"+
		"\7\u00df\2\2\u0257\u0259\5> \2\u0258\u0255\3\2\2\2\u0258\u0259\3\2\2\2"+
		"\u0259\u0465\3\2\2\2\u025a\u025b\7\r\2\2\u025b\u025c\7\u00f3\2\2\u025c"+
		"\u025e\5\u00ba^\2\u025d\u025f\5*\26\2\u025e\u025d\3\2\2\2\u025e\u025f"+
		"\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u0261\7\u00e1\2\2\u0261\u0262\7\u00df"+
		"\2\2\u0262\u0263\5> \2\u0263\u0465\3\2\2\2\u0264\u0265\7\r\2\2\u0265\u0266"+
		"\t\6\2\2\u0266\u0267\5\u00ba^\2\u0267\u026b\7\n\2\2\u0268\u0269\7s\2\2"+
		"\u0269\u026a\7\u00a1\2\2\u026a\u026c\7X\2\2\u026b\u0268\3\2\2\2\u026b"+
		"\u026c\3\2\2\2\u026c\u026e\3\2\2\2\u026d\u026f\5(\25\2\u026e\u026d\3\2"+
		"\2\2\u026f\u0270\3\2\2\2\u0270\u026e\3\2\2\2\u0270\u0271\3\2\2\2\u0271"+
		"\u0465\3\2\2\2\u0272\u0273\7\r\2\2\u0273\u0274\7\u00f3\2\2\u0274\u0275"+
		"\5\u00ba^\2\u0275\u0276\5*\26\2\u0276\u0277\7\u00c8\2\2\u0277\u0278\7"+
		"\u00fe\2\2\u0278\u0279\5*\26\2\u0279\u0465\3\2\2\2\u027a\u027b\7\r\2\2"+
		"\u027b\u027c\t\6\2\2\u027c\u027d\5\u00ba^\2\u027d\u0280\7Q\2\2\u027e\u027f"+
		"\7s\2\2\u027f\u0281\7X\2\2\u0280\u027e\3\2\2\2\u0280\u0281\3\2\2\2\u0281"+
		"\u0282\3\2\2\2\u0282\u0287\5*\26\2\u0283\u0284\7\6\2\2\u0284\u0286\5*"+
		"\26\2\u0285\u0283\3\2\2\2\u0286\u0289\3\2\2\2\u0287\u0285\3\2\2\2\u0287"+
		"\u0288\3\2\2\2\u0288\u028b\3\2\2\2\u0289\u0287\3\2\2\2\u028a\u028c\7\u00be"+
		"\2\2\u028b\u028a\3\2\2\2\u028b\u028c\3\2\2\2\u028c\u0465\3\2\2\2\u028d"+
		"\u028e\7\r\2\2\u028e\u028f\7\u00f3\2\2\u028f\u0291\5\u00ba^\2\u0290\u0292"+
		"\5*\26\2\u0291\u0290\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293\3\2\2\2\u0293"+
		"\u0294\7\u00e1\2\2\u0294\u0295\5 \21\2\u0295\u0465\3\2\2\2\u0296\u0297"+
		"\7\r\2\2\u0297\u0298\7\u00f3\2\2\u0298\u0299\5\u00ba^\2\u0299\u029a\7"+
		"\u00c4\2\2\u029a\u029b\7\u00b4\2\2\u029b\u0465\3\2\2\2\u029c\u029d\7Q"+
		"\2\2\u029d\u02a0\7\u00f3\2\2\u029e\u029f\7s\2\2\u029f\u02a1\7X\2\2\u02a0"+
		"\u029e\3\2\2\2\u02a0\u02a1\3\2\2\2\u02a1\u02a2\3\2\2\2\u02a2\u02a4\5\u00ba"+
		"^\2\u02a3\u02a5\7\u00be\2\2\u02a4\u02a3\3\2\2\2\u02a4\u02a5\3\2\2\2\u02a5"+
		"\u0465\3\2\2\2\u02a6\u02a7\7Q\2\2\u02a7\u02aa\7\u0117\2\2\u02a8\u02a9"+
		"\7s\2\2\u02a9\u02ab\7X\2\2\u02aa\u02a8\3\2\2\2\u02aa\u02ab\3\2\2\2\u02ab"+
		"\u02ac\3\2\2\2\u02ac\u0465\5\u00ba^\2\u02ad\u02b0\7\65\2\2\u02ae\u02af"+
		"\7\u00a9\2\2\u02af\u02b1\7\u00cb\2\2\u02b0\u02ae\3\2\2\2\u02b0\u02b1\3"+
		"\2\2\2\u02b1\u02b6\3\2\2\2\u02b2\u02b4\7m\2\2\u02b3\u02b2\3\2\2\2\u02b3"+
		"\u02b4\3\2\2\2\u02b4\u02b5\3\2\2\2\u02b5\u02b7\7\u00f7\2\2\u02b6\u02b3"+
		"\3\2\2\2\u02b6\u02b7\3\2\2\2\u02b7\u02b8\3\2\2\2\u02b8\u02bc\7\u0117\2"+
		"\2\u02b9\u02ba\7s\2\2\u02ba\u02bb\7\u00a1\2\2\u02bb\u02bd\7X\2\2\u02bc"+
		"\u02b9\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\3\2\2\2\u02be\u02c0\5\u00ba"+
		"^\2\u02bf\u02c1\5\u00aaV\2\u02c0\u02bf\3\2\2\2\u02c0\u02c1\3\2\2\2\u02c1"+
		"\u02ca\3\2\2\2\u02c2\u02c9\5\"\22\2\u02c3\u02c4\7\u00b3\2\2\u02c4\u02c5"+
		"\7\u00a5\2\2\u02c5\u02c9\5\u00a2R\2\u02c6\u02c7\7\u00f6\2\2\u02c7\u02c9"+
		"\5> \2\u02c8\u02c2\3\2\2\2\u02c8\u02c3\3\2\2\2\u02c8\u02c6\3\2\2\2\u02c9"+
		"\u02cc\3\2\2\2\u02ca\u02c8\3\2\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cd\3\2"+
		"\2\2\u02cc\u02ca\3\2\2\2\u02cd\u02ce\7\24\2\2\u02ce\u02cf\5$\23\2\u02cf"+
		"\u0465\3\2\2\2\u02d0\u02d3\7\65\2\2\u02d1\u02d2\7\u00a9\2\2\u02d2\u02d4"+
		"\7\u00cb\2\2\u02d3\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2"+
		"\2\u02d5\u02d7\7m\2\2\u02d6\u02d5\3\2\2\2\u02d6\u02d7\3\2\2\2\u02d7\u02d8"+
		"\3\2\2\2\u02d8\u02d9\7\u00f7\2\2\u02d9\u02da\7\u0117\2\2\u02da\u02df\5"+
		"\u00c0a\2\u02db\u02dc\7\4\2\2\u02dc\u02dd\5\u00fe\u0080\2\u02dd\u02de"+
		"\7\5\2\2\u02de\u02e0\3\2\2\2\u02df\u02db\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0"+
		"\u02e1\3\2\2\2\u02e1\u02e4\5:\36\2\u02e2\u02e3\7\u00a8\2\2\u02e3\u02e5"+
		"\5> \2\u02e4\u02e2\3\2\2\2\u02e4\u02e5\3\2\2\2\u02e5\u0465\3\2\2\2\u02e6"+
		"\u02e7\7\r\2\2\u02e7\u02e8\7\u0117\2\2\u02e8\u02ea\5\u00ba^\2\u02e9\u02eb"+
		"\7\24\2\2\u02ea\u02e9\3\2\2\2\u02ea\u02eb\3\2\2\2\u02eb\u02ec\3\2\2\2"+
		"\u02ec\u02ed\5$\23\2\u02ed\u0465\3\2\2\2\u02ee\u02f1\7\65\2\2\u02ef\u02f0"+
		"\7\u00a9\2\2\u02f0\u02f2\7\u00cb\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3"+
		"\2\2\2\u02f2\u02f4\3\2\2\2\u02f3\u02f5\7\u00f7\2\2\u02f4\u02f3\3\2\2\2"+
		"\u02f4\u02f5\3\2\2\2\u02f5\u02f6\3\2\2\2\u02f6\u02fa\7k\2\2\u02f7\u02f8"+
		"\7s\2\2\u02f8\u02f9\7\u00a1\2\2\u02f9\u02fb\7X\2\2\u02fa\u02f7\3\2\2\2"+
		"\u02fa\u02fb\3\2\2\2\u02fb\u02fc\3\2\2\2\u02fc\u02fd\5\u00ba^\2\u02fd"+
		"\u02fe\7\24\2\2\u02fe\u0308\7\u0137\2\2\u02ff\u0300\7\u0114\2\2\u0300"+
		"\u0305\5P)\2\u0301\u0302\7\6\2\2\u0302\u0304\5P)\2\u0303\u0301\3\2\2\2"+
		"\u0304\u0307\3\2\2\2\u0305\u0303\3\2\2\2\u0305\u0306\3\2\2\2\u0306\u0309"+
		"\3\2\2\2\u0307\u0305\3\2\2\2\u0308\u02ff\3\2\2\2\u0308\u0309\3\2\2\2\u0309"+
		"\u0465\3\2\2\2\u030a\u030c\7Q\2\2\u030b\u030d\7\u00f7\2\2\u030c\u030b"+
		"\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030e\3\2\2\2\u030e\u0311\7k\2\2\u030f"+
		"\u0310\7s\2\2\u0310\u0312\7X\2\2\u0311\u030f\3\2\2\2\u0311\u0312\3\2\2"+
		"\2\u0312\u0313\3\2\2\2\u0313\u0465\5\u00ba^\2\u0314\u0316\7Y\2\2\u0315"+
		"\u0317\t\b\2\2\u0316\u0315\3\2\2\2\u0316\u0317\3\2\2\2\u0317\u0318\3\2"+
		"\2\2\u0318\u0465\5\20\t\2\u0319\u031a\7\u00e4\2\2\u031a\u031d\7\u00f4"+
		"\2\2\u031b\u031c\t\4\2\2\u031c\u031e\5\u00ba^\2\u031d\u031b\3\2\2\2\u031d"+
		"\u031e\3\2\2\2\u031e\u0323\3\2\2\2\u031f\u0321\7\u0089\2\2\u0320\u031f"+
		"\3\2\2\2\u0320\u0321\3\2\2\2\u0321\u0322\3\2\2\2\u0322\u0324\7\u0137\2"+
		"\2\u0323\u0320\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u0465\3\2\2\2\u0325\u0326"+
		"\7\u00e4\2\2\u0326\u0327\7\u00f3\2\2\u0327\u032a\7[\2\2\u0328\u0329\t"+
		"\4\2\2\u0329\u032b\5\u00ba^\2\u032a\u0328\3\2\2\2\u032a\u032b\3\2\2\2"+
		"\u032b\u032c\3\2\2\2\u032c\u032d\7\u0089\2\2\u032d\u032f\7\u0137\2\2\u032e"+
		"\u0330\5*\26\2\u032f\u032e\3\2\2\2\u032f\u0330\3\2\2\2\u0330\u0465\3\2"+
		"\2\2\u0331\u0332\7\u00e4\2\2\u0332\u0333\7\u00f6\2\2\u0333\u0338\5\u00ba"+
		"^\2\u0334\u0335\7\4\2\2\u0335\u0336\5B\"\2\u0336\u0337\7\5\2\2\u0337\u0339"+
		"\3\2\2\2\u0338\u0334\3\2\2\2\u0338\u0339\3\2\2\2\u0339\u0465\3\2\2\2\u033a"+
		"\u033b\7\u00e4\2\2\u033b\u033c\7,\2\2\u033c\u033d\t\4\2\2\u033d\u0340"+
		"\5\u00ba^\2\u033e\u033f\t\4\2\2\u033f\u0341\5\u00ba^\2\u0340\u033e\3\2"+
		"\2\2\u0340\u0341\3\2\2\2\u0341\u0465\3\2\2\2\u0342\u0343\7\u00e4\2\2\u0343"+
		"\u0346\7\u0118\2\2\u0344\u0345\t\4\2\2\u0345\u0347\5\u00ba^\2\u0346\u0344"+
		"\3\2\2\2\u0346\u0347\3\2\2\2\u0347\u034c\3\2\2\2\u0348\u034a\7\u0089\2"+
		"\2\u0349\u0348\3\2\2\2\u0349\u034a\3\2\2\2\u034a\u034b\3\2\2\2\u034b\u034d"+
		"\7\u0137\2\2\u034c\u0349\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u0465\3\2\2"+
		"\2\u034e\u034f\7\u00e4\2\2\u034f\u0350\7\u00b4\2\2\u0350\u0352\5\u00ba"+
		"^\2\u0351\u0353\5*\26\2\u0352\u0351\3\2\2\2\u0352\u0353\3\2\2\2\u0353"+
		"\u0465\3\2\2\2\u0354\u0356\7\u00e4\2\2\u0355\u0357\5\u0120\u0091\2\u0356"+
		"\u0355\3\2\2\2\u0356\u0357\3\2\2\2\u0357\u0358\3\2\2\2\u0358\u035b\7l"+
		"\2\2\u0359\u035a\t\4\2\2\u035a\u035c\5\u00ba^\2\u035b\u0359\3\2\2\2\u035b"+
		"\u035c\3\2\2\2\u035c\u0364\3\2\2\2\u035d\u035f\7\u0089\2\2\u035e\u035d"+
		"\3\2\2\2\u035e\u035f\3\2\2\2\u035f\u0362\3\2\2\2\u0360\u0363\5\u00ba^"+
		"\2\u0361\u0363\7\u0137\2\2\u0362\u0360\3\2\2\2\u0362\u0361\3\2\2\2\u0363"+
		"\u0365\3\2\2\2\u0364\u035e\3\2\2\2\u0364\u0365\3\2\2\2\u0365\u0465\3\2"+
		"\2\2\u0366\u0367\7\u00e4\2\2\u0367\u0368\7\65\2\2\u0368\u0369\7\u00f3"+
		"\2\2\u0369\u036c\5\u00ba^\2\u036a\u036b\7\24\2\2\u036b\u036d\7\u00de\2"+
		"\2\u036c\u036a\3\2\2\2\u036c\u036d\3\2\2\2\u036d\u0465\3\2\2\2\u036e\u036f"+
		"\7\u00e4\2\2\u036f\u0370\78\2\2\u0370\u0465\5.\30\2\u0371\u0372\7\u00e4"+
		"\2\2\u0372\u0377\7\"\2\2\u0373\u0375\7\u0089\2\2\u0374\u0373\3\2\2\2\u0374"+
		"\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u0378\7\u0137\2\2\u0377\u0374"+
		"\3\2\2\2\u0377\u0378\3\2\2\2\u0378\u0465\3\2\2\2\u0379\u037a\t\t\2\2\u037a"+
		"\u037c\7k\2\2\u037b\u037d\7[\2\2\u037c\u037b\3\2\2\2\u037c\u037d\3\2\2"+
		"\2\u037d\u037e\3\2\2\2\u037e\u0465\5\62\32\2\u037f\u0380\t\t\2\2\u0380"+
		"\u0382\5.\30\2\u0381\u0383\7[\2\2\u0382\u0381\3\2\2\2\u0382\u0383\3\2"+
		"\2\2\u0383\u0384\3\2\2\2\u0384\u0385\5\u00ba^\2\u0385\u0465\3\2\2\2\u0386"+
		"\u0388\t\t\2\2\u0387\u0389\7\u00f3\2\2\u0388\u0387\3\2\2\2\u0388\u0389"+
		"\3\2\2\2\u0389\u038b\3\2\2\2\u038a\u038c\t\n\2\2\u038b\u038a\3\2\2\2\u038b"+
		"\u038c\3\2\2\2\u038c\u038d\3\2\2\2\u038d\u038f\5\u00ba^\2\u038e\u0390"+
		"\5*\26\2\u038f\u038e\3\2\2\2\u038f\u0390\3\2\2\2\u0390\u0392\3\2\2\2\u0391"+
		"\u0393\5\64\33\2\u0392\u0391\3\2\2\2\u0392\u0393\3\2\2\2\u0393\u0465\3"+
		"\2\2\2\u0394\u0396\t\t\2\2\u0395\u0397\7\u00c0\2\2\u0396\u0395\3\2\2\2"+
		"\u0396\u0397\3\2\2\2\u0397\u0398\3\2\2\2\u0398\u0465\5$\23\2\u0399\u039a"+
		"\7-\2\2\u039a\u039b\7\u00a5\2\2\u039b\u039c\5.\30\2\u039c\u039d\5\u00ba"+
		"^\2\u039d\u039e\7\u0080\2\2\u039e\u039f\t\13\2\2\u039f\u0465\3\2\2\2\u03a0"+
		"\u03a1\7-\2\2\u03a1\u03a2\7\u00a5\2\2\u03a2\u03a3\7\u00f3\2\2\u03a3\u03a4"+
		"\5\u00ba^\2\u03a4\u03a5\7\u0080\2\2\u03a5\u03a6\t\13\2\2\u03a6\u0465\3"+
		"\2\2\2\u03a7\u03a8\7\u00c7\2\2\u03a8\u03a9\7\u00f3\2\2\u03a9\u0465\5\u00ba"+
		"^\2\u03aa\u03ab\7\u00c7\2\2\u03ab\u03ac\7k\2\2\u03ac\u0465\5\u00ba^\2"+
		"\u03ad\u03b5\7\u00c7\2\2\u03ae\u03b6\7\u0137\2\2\u03af\u03b1\13\2\2\2"+
		"\u03b0\u03af\3\2\2\2\u03b1\u03b4\3\2\2\2\u03b2\u03b3\3\2\2\2\u03b2\u03b0"+
		"\3\2\2\2\u03b3\u03b6\3\2\2\2\u03b4\u03b2\3\2\2\2\u03b5\u03ae\3\2\2\2\u03b5"+
		"\u03b2\3\2\2\2\u03b6\u0465\3\2\2\2\u03b7\u03b9\7\35\2\2\u03b8\u03ba\7"+
		"\u0086\2\2\u03b9\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2"+
		"\u03bb\u03bc\7\u00f3\2\2\u03bc\u03bf\5\u00ba^\2\u03bd\u03be\7\u00a8\2"+
		"\2\u03be\u03c0\5> \2\u03bf\u03bd\3\2\2\2\u03bf\u03c0\3\2\2\2\u03c0\u03c5"+
		"\3\2\2\2\u03c1\u03c3\7\24\2\2\u03c2\u03c1\3\2\2\2\u03c2\u03c3\3\2\2\2"+
		"\u03c3\u03c4\3\2\2\2\u03c4\u03c6\5$\23\2\u03c5\u03c2\3\2\2\2\u03c5\u03c6"+
		"\3\2\2\2\u03c6\u0465\3\2\2\2\u03c7\u03c8\7\u010b\2\2\u03c8\u03cb\7\u00f3"+
		"\2\2\u03c9\u03ca\7s\2\2\u03ca\u03cc\7X\2\2\u03cb\u03c9\3\2\2\2\u03cb\u03cc"+
		"\3\2\2\2\u03cc\u03cd\3\2\2\2\u03cd\u0465\5\u00ba^\2\u03ce\u03cf\7%\2\2"+
		"\u03cf\u0465\7\35\2\2\u03d0\u03d1\7\u008e\2\2\u03d1\u03d3\7?\2\2\u03d2"+
		"\u03d4\7\u008f\2\2\u03d3\u03d2\3\2\2\2\u03d3\u03d4\3\2\2\2\u03d4\u03d5"+
		"\3\2\2\2\u03d5\u03d6\7z\2\2\u03d6\u03d8\7\u0137\2\2\u03d7\u03d9\7\u00b1"+
		"\2\2\u03d8\u03d7\3\2\2\2\u03d8\u03d9\3\2\2\2\u03d9\u03da\3\2\2\2\u03da"+
		"\u03db\7\177\2\2\u03db\u03dc\7\u00f3\2\2\u03dc\u03de\5\u00ba^\2\u03dd"+
		"\u03df\5*\26\2\u03de\u03dd\3\2\2\2\u03de\u03df\3\2\2\2\u03df\u0465\3\2"+
		"\2\2\u03e0\u03e1\7\u0106\2\2\u03e1\u03e2\7\u00f3\2\2\u03e2\u03e4\5\u00ba"+
		"^\2\u03e3\u03e5\5*\26\2\u03e4\u03e3\3\2\2\2\u03e4\u03e5\3\2\2\2\u03e5"+
		"\u0465\3\2\2\2\u03e6\u03e7\7\u009c\2\2\u03e7\u03e8\7\u00c9\2\2\u03e8\u03e9"+
		"\7\u00f3\2\2\u03e9\u03ec\5\u00ba^\2\u03ea\u03eb\t\f\2\2\u03eb\u03ed\7"+
		"\u00b4\2\2\u03ec\u03ea\3\2\2\2\u03ec\u03ed\3\2\2\2\u03ed\u0465\3\2\2\2"+
		"\u03ee\u03ef\t\r\2\2\u03ef\u03f3\5\u0120\u0091\2\u03f0\u03f2\13\2\2\2"+
		"\u03f1\u03f0\3\2\2\2\u03f2\u03f5\3\2\2\2\u03f3\u03f4\3\2\2\2\u03f3\u03f1"+
		"\3\2\2\2\u03f4\u0465\3\2\2\2\u03f5\u03f3\3\2\2\2\u03f6\u03f7\7\u00e1\2"+
		"\2\u03f7\u03fb\7\u00d2\2\2\u03f8\u03fa\13\2\2\2\u03f9\u03f8\3\2\2\2\u03fa"+
		"\u03fd\3\2\2\2\u03fb\u03fc\3\2\2\2\u03fb\u03f9\3\2\2\2\u03fc\u0465\3\2"+
		"\2\2\u03fd\u03fb\3\2\2\2\u03fe\u03ff\7\u00e1\2\2\u03ff\u0400\7\u00fa\2"+
		"\2\u0400\u0401\7\u0120\2\2\u0401\u0465\5\u00e8u\2\u0402\u0403\7\u00e1"+
		"\2\2\u0403\u0404\7\u00fa\2\2\u0404\u0405\7\u0120\2\2\u0405\u0465\t\16"+
		"\2\2\u0406\u0407\7\u00e1\2\2\u0407\u0408\7\u00fa\2\2\u0408\u040c\7\u0120"+
		"\2\2\u0409\u040b\13\2\2\2\u040a\u0409\3\2\2\2\u040b\u040e\3\2\2\2\u040c"+
		"\u040d\3\2\2\2\u040c\u040a\3\2\2\2\u040d\u0465\3\2\2\2\u040e\u040c\3\2"+
		"\2\2\u040f\u0410\7\u00e1\2\2\u0410\u0411\5\22\n\2\u0411\u0412\7\u0121"+
		"\2\2\u0412\u0413\5\24\13\2\u0413\u0465\3\2\2\2\u0414\u0415\7\u00e1\2\2"+
		"\u0415\u041d\5\22\n\2\u0416\u041a\7\u0121\2\2\u0417\u0419\13\2\2\2\u0418"+
		"\u0417\3\2\2\2\u0419\u041c\3\2\2\2\u041a\u041b\3\2\2\2\u041a\u0418\3\2"+
		"\2\2\u041b\u041e\3\2\2\2\u041c\u041a\3\2\2\2\u041d\u0416\3\2\2\2\u041d"+
		"\u041e\3\2\2\2\u041e\u0465\3\2\2\2\u041f\u0423\7\u00e1\2\2\u0420\u0422"+
		"\13\2\2\2\u0421\u0420\3\2\2\2\u0422\u0425\3\2\2\2\u0423\u0424\3\2\2\2"+
		"\u0423\u0421\3\2\2\2\u0424\u0426\3\2\2\2\u0425\u0423\3\2\2\2\u0426\u0427"+
		"\7\u0121\2\2\u0427\u0465\5\24\13\2\u0428\u042c\7\u00e1\2\2\u0429\u042b"+
		"\13\2\2\2\u042a\u0429\3\2\2\2\u042b\u042e\3\2\2\2\u042c\u042d\3\2\2\2"+
		"\u042c\u042a\3\2\2\2\u042d\u0465\3\2\2\2\u042e\u042c\3\2\2\2\u042f\u0430"+
		"\7\u00cc\2\2\u0430\u0465\5\22\n\2\u0431\u0435\7\u00cc\2\2\u0432\u0434"+
		"\13\2\2\2\u0433\u0432\3\2\2\2\u0434\u0437\3\2\2\2\u0435\u0436\3\2\2\2"+
		"\u0435\u0433\3\2\2\2\u0436\u0465\3\2\2\2\u0437\u0435\3\2\2\2\u0438\u0439"+
		"\7\65\2\2\u0439\u043d\7w\2\2\u043a\u043b\7s\2\2\u043b\u043c\7\u00a1\2"+
		"\2\u043c\u043e\7X\2\2\u043d\u043a\3\2\2\2\u043d\u043e\3\2\2\2\u043e\u043f"+
		"\3\2\2\2\u043f\u0440\5\u0120\u0091\2\u0440\u0442\7\u00a5\2\2\u0441\u0443"+
		"\7\u00f3\2\2\u0442\u0441\3\2\2\2\u0442\u0443\3\2\2\2\u0443\u0444\3\2\2"+
		"\2\u0444\u0447\5\u00ba^\2\u0445\u0446\7\u0114\2\2\u0446\u0448\5\u0120"+
		"\u0091\2\u0447\u0445\3\2\2\2\u0447\u0448\3\2\2\2\u0448\u0449\3\2\2\2\u0449"+
		"\u044a\7\4\2\2\u044a\u044b\5\u00bc_\2\u044b\u044e\7\5\2\2\u044c\u044d"+
		"\7\u00a8\2\2\u044d\u044f\5> \2\u044e\u044c\3\2\2\2\u044e\u044f\3\2\2\2"+
		"\u044f\u0465\3\2\2\2\u0450\u0451\7Q\2\2\u0451\u0454\7w\2\2\u0452\u0453"+
		"\7s\2\2\u0453\u0455\7X\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455"+
		"\u0456\3\2\2\2\u0456\u0457\5\u0120\u0091\2\u0457\u0459\7\u00a5\2\2\u0458"+
		"\u045a\7\u00f3\2\2\u0459\u0458\3\2\2\2\u0459\u045a\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u045c\5\u00ba^\2\u045c\u0465\3\2\2\2\u045d\u0461\5\26\f"+
		"\2\u045e\u0460\13\2\2\2\u045f\u045e\3\2\2\2\u0460\u0463\3\2\2\2\u0461"+
		"\u0462\3\2\2\2\u0461\u045f\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2"+
		"\2\2\u0464\u014b\3\2\2\2\u0464\u014d\3\2\2\2\u0464\u0150\3\2\2\2\u0464"+
		"\u0152\3\2\2\2\u0464\u0156\3\2\2\2\u0464\u015c\3\2\2\2\u0464\u016e\3\2"+
		"\2\2\u0464\u0175\3\2\2\2\u0464\u017b\3\2\2\2\u0464\u0185\3\2\2\2\u0464"+
		"\u0191\3\2\2\2\u0464\u01a2\3\2\2\2\u0464\u01b7\3\2\2\2\u0464\u01c8\3\2"+
		"\2\2\u0464\u01d9\3\2\2\2\u0464\u01e4\3\2\2\2\u0464\u01eb\3\2\2\2\u0464"+
		"\u01f4\3\2\2\2\u0464\u01fd\3\2\2\2\u0464\u0206\3\2\2\2\u0464\u020d\3\2"+
		"\2\2\u0464\u0214\3\2\2\2\u0464\u021b\3\2\2\2\u0464\u0226\3\2\2\2\u0464"+
		"\u0231\3\2\2\2\u0464\u0240\3\2\2\2\u0464\u024c\3\2\2\2\u0464\u025a\3\2"+
		"\2\2\u0464\u0264\3\2\2\2\u0464\u0272\3\2\2\2\u0464\u027a\3\2\2\2\u0464"+
		"\u028d\3\2\2\2\u0464\u0296\3\2\2\2\u0464\u029c\3\2\2\2\u0464\u02a6\3\2"+
		"\2\2\u0464\u02ad\3\2\2\2\u0464\u02d0\3\2\2\2\u0464\u02e6\3\2\2\2\u0464"+
		"\u02ee\3\2\2\2\u0464\u030a\3\2\2\2\u0464\u0314\3\2\2\2\u0464\u0319\3\2"+
		"\2\2\u0464\u0325\3\2\2\2\u0464\u0331\3\2\2\2\u0464\u033a\3\2\2\2\u0464"+
		"\u0342\3\2\2\2\u0464\u034e\3\2\2\2\u0464\u0354\3\2\2\2\u0464\u0366\3\2"+
		"\2\2\u0464\u036e\3\2\2\2\u0464\u0371\3\2\2\2\u0464\u0379\3\2\2\2\u0464"+
		"\u037f\3\2\2\2\u0464\u0386\3\2\2\2\u0464\u0394\3\2\2\2\u0464\u0399\3\2"+
		"\2\2\u0464\u03a0\3\2\2\2\u0464\u03a7\3\2\2\2\u0464\u03aa\3\2\2\2\u0464"+
		"\u03ad\3\2\2\2\u0464\u03b7\3\2\2\2\u0464\u03c7\3\2\2\2\u0464\u03ce\3\2"+
		"\2\2\u0464\u03d0\3\2\2\2\u0464\u03e0\3\2\2\2\u0464\u03e6\3\2\2\2\u0464"+
		"\u03ee\3\2\2\2\u0464\u03f6\3\2\2\2\u0464\u03fe\3\2\2\2\u0464\u0402\3\2"+
		"\2\2\u0464\u0406\3\2\2\2\u0464\u040f\3\2\2\2\u0464\u0414\3\2\2\2\u0464"+
		"\u041f\3\2\2\2\u0464\u0428\3\2\2\2\u0464\u042f\3\2\2\2\u0464\u0431\3\2"+
		"\2\2\u0464\u0438\3\2\2\2\u0464\u0450\3\2\2\2\u0464\u045d\3\2\2\2\u0465"+
		"\21\3\2\2\2\u0466\u0467\5\u0124\u0093\2\u0467\23\3\2\2\2\u0468\u0469\5"+
		"\u0124\u0093\2\u0469\25\3\2\2\2\u046a\u046b\7\65\2\2\u046b\u0513\7\u00d2"+
		"\2\2\u046c\u046d\7Q\2\2\u046d\u0513\7\u00d2\2\2\u046e\u0470\7n\2\2\u046f"+
		"\u0471\7\u00d2\2\2\u0470\u046f\3\2\2\2\u0470\u0471\3\2\2\2\u0471\u0513"+
		"\3\2\2\2\u0472\u0474\7\u00cf\2\2\u0473\u0475\7\u00d2\2\2\u0474\u0473\3"+
		"\2\2\2\u0474\u0475\3\2\2\2\u0475\u0513\3\2\2\2\u0476\u0477\7\u00e4\2\2"+
		"\u0477\u0513\7n\2\2\u0478\u0479\7\u00e4\2\2\u0479\u047b\7\u00d2\2\2\u047a"+
		"\u047c\7n\2\2\u047b\u047a\3\2\2\2\u047b\u047c\3\2\2\2\u047c\u0513\3\2"+
		"\2\2\u047d\u047e\7\u00e4\2\2\u047e\u0513\7\u00bc\2\2\u047f\u0480\7\u00e4"+
		"\2\2\u0480\u0513\7\u00d3\2\2\u0481\u0482\7\u00e4\2\2\u0482\u0483\78\2"+
		"\2\u0483\u0513\7\u00d3\2\2\u0484\u0485\7Z\2\2\u0485\u0513\7\u00f3\2\2"+
		"\u0486\u0487\7u\2\2\u0487\u0513\7\u00f3\2\2\u0488\u0489\7\u00e4\2\2\u0489"+
		"\u0513\7\60\2\2\u048a\u048b\7\u00e4\2\2\u048b\u048c\7\65\2\2\u048c\u0513"+
		"\7\u00f3\2\2\u048d\u048e\7\u00e4\2\2\u048e\u0513\7\u0102\2\2\u048f\u0490"+
		"\7\u00e4\2\2\u0490\u0513\7x\2\2\u0491\u0492\7\u00e4\2\2\u0492\u0513\7"+
		"\u0092\2\2\u0493\u0494\7\65\2\2\u0494\u0513\7w\2\2\u0495\u0496\7Q\2\2"+
		"\u0496\u0513\7w\2\2\u0497\u0498\7\r\2\2\u0498\u0513\7w\2\2\u0499\u049a"+
		"\7\u0091\2\2\u049a\u0513\7\u00f3\2\2\u049b\u049c\7\u0091\2\2\u049c\u0513"+
		"\7@\2\2\u049d\u049e\7\u010f\2\2\u049e\u0513\7\u00f3\2\2\u049f\u04a0\7"+
		"\u010f\2\2\u04a0\u0513\7@\2\2\u04a1\u04a2\7\65\2\2\u04a2\u04a3\7\u00f7"+
		"\2\2\u04a3\u0513\7\u0094\2\2\u04a4\u04a5\7Q\2\2\u04a5\u04a6\7\u00f7\2"+
		"\2\u04a6\u0513\7\u0094\2\2\u04a7\u04a8\7\r\2\2\u04a8\u04a9\7\u00f3\2\2"+
		"\u04a9\u04aa\5\u00c0a\2\u04aa\u04ab\7\u00a1\2\2\u04ab\u04ac\7\'\2\2\u04ac"+
		"\u0513\3\2\2\2\u04ad\u04ae\7\r\2\2\u04ae\u04af\7\u00f3\2\2\u04af\u04b0"+
		"\5\u00c0a\2\u04b0\u04b1\7\'\2\2\u04b1\u04b2\7\34\2\2\u04b2\u0513\3\2\2"+
		"\2\u04b3\u04b4\7\r\2\2\u04b4\u04b5\7\u00f3\2\2\u04b5\u04b6\5\u00c0a\2"+
		"\u04b6\u04b7\7\u00a1\2\2\u04b7\u04b8\7\u00e8\2\2\u04b8\u0513\3\2\2\2\u04b9"+
		"\u04ba\7\r\2\2\u04ba\u04bb\7\u00f3\2\2\u04bb\u04bc\5\u00c0a\2\u04bc\u04bd"+
		"\7\u00e5\2\2\u04bd\u04be\7\34\2\2\u04be\u0513\3\2\2\2\u04bf\u04c0\7\r"+
		"\2\2\u04c0\u04c1\7\u00f3\2\2\u04c1\u04c2\5\u00c0a\2\u04c2\u04c3\7\u00a1"+
		"\2\2\u04c3\u04c4\7\u00e5\2\2\u04c4\u0513\3\2\2\2\u04c5\u04c6\7\r\2\2\u04c6"+
		"\u04c7\7\u00f3\2\2\u04c7\u04c8\5\u00c0a\2\u04c8\u04c9\7\u00a1\2\2\u04c9"+
		"\u04ca\7\u00eb\2\2\u04ca\u04cb\7\24\2\2\u04cb\u04cc\7L\2\2\u04cc\u0513"+
		"\3\2\2\2\u04cd\u04ce\7\r\2\2\u04ce\u04cf\7\u00f3\2\2\u04cf\u04d0\5\u00c0"+
		"a\2\u04d0\u04d1\7\u00e1\2\2\u04d1\u04d2\7\u00e5\2\2\u04d2\u04d3\7\u0090"+
		"\2\2\u04d3\u0513\3\2\2\2\u04d4\u04d5\7\r\2\2\u04d5\u04d6\7\u00f3\2\2\u04d6"+
		"\u04d7\5\u00c0a\2\u04d7\u04d8\7W\2\2\u04d8\u04d9\7\u00b2\2\2\u04d9\u0513"+
		"\3\2\2\2\u04da\u04db\7\r\2\2\u04db\u04dc\7\u00f3\2\2\u04dc\u04dd\5\u00c0"+
		"a\2\u04dd\u04de\7\22\2\2\u04de\u04df\7\u00b2\2\2\u04df\u0513\3\2\2\2\u04e0"+
		"\u04e1\7\r\2\2\u04e1\u04e2\7\u00f3\2\2\u04e2\u04e3\5\u00c0a\2\u04e3\u04e4"+
		"\7\u0109\2\2\u04e4\u04e5\7\u00b2\2\2\u04e5\u0513\3\2\2\2\u04e6\u04e7\7"+
		"\r\2\2\u04e7\u04e8\7\u00f3\2\2\u04e8\u04e9\5\u00c0a\2\u04e9\u04ea\7\u00ff"+
		"\2\2\u04ea\u0513\3\2\2\2\u04eb\u04ec\7\r\2\2\u04ec\u04ed\7\u00f3\2\2\u04ed"+
		"\u04ef\5\u00c0a\2\u04ee\u04f0\5*\26\2\u04ef\u04ee\3\2\2\2\u04ef\u04f0"+
		"\3\2\2\2\u04f0\u04f1\3\2\2\2\u04f1\u04f2\7/\2\2\u04f2\u0513\3\2\2\2\u04f3"+
		"\u04f4\7\r\2\2\u04f4\u04f5\7\u00f3\2\2\u04f5\u04f7\5\u00c0a\2\u04f6\u04f8"+
		"\5*\26\2\u04f7\u04f6\3\2\2\2\u04f7\u04f8\3\2\2\2\u04f8\u04f9\3\2\2\2\u04f9"+
		"\u04fa\7\62\2\2\u04fa\u0513\3\2\2\2\u04fb\u04fc\7\r\2\2\u04fc\u04fd\7"+
		"\u00f3\2\2\u04fd\u04ff\5\u00c0a\2\u04fe\u0500\5*\26\2\u04ff\u04fe\3\2"+
		"\2\2\u04ff\u0500\3\2\2\2\u0500\u0501\3\2\2\2\u0501\u0502\7\u00e1\2\2\u0502"+
		"\u0503\7b\2\2\u0503\u0513\3\2\2\2\u0504\u0505\7\r\2\2\u0505\u0506\7\u00f3"+
		"\2\2\u0506\u0508\5\u00c0a\2\u0507\u0509\5*\26\2\u0508\u0507\3\2\2\2\u0508"+
		"\u0509\3\2\2\2\u0509\u050a\3\2\2\2\u050a\u050b\7\u00cb\2\2\u050b\u050c"+
		"\7,\2\2\u050c\u0513\3\2\2\2\u050d\u050e\7\u00e9\2\2\u050e\u0513\7\u0101"+
		"\2\2\u050f\u0513\7.\2\2\u0510\u0513\7\u00d4\2\2\u0511\u0513\7K\2\2\u0512"+
		"\u046a\3\2\2\2\u0512\u046c\3\2\2\2\u0512\u046e\3\2\2\2\u0512\u0472\3\2"+
		"\2\2\u0512\u0476\3\2\2\2\u0512\u0478\3\2\2\2\u0512\u047d\3\2\2\2\u0512"+
		"\u047f\3\2\2\2\u0512\u0481\3\2\2\2\u0512\u0484\3\2\2\2\u0512\u0486\3\2"+
		"\2\2\u0512\u0488\3\2\2\2\u0512\u048a\3\2\2\2\u0512\u048d\3\2\2\2\u0512"+
		"\u048f\3\2\2\2\u0512\u0491\3\2\2\2\u0512\u0493\3\2\2\2\u0512\u0495\3\2"+
		"\2\2\u0512\u0497\3\2\2\2\u0512\u0499\3\2\2\2\u0512\u049b\3\2\2\2\u0512"+
		"\u049d\3\2\2\2\u0512\u049f\3\2\2\2\u0512\u04a1\3\2\2\2\u0512\u04a4\3\2"+
		"\2\2\u0512\u04a7\3\2\2\2\u0512\u04ad\3\2\2\2\u0512\u04b3\3\2\2\2\u0512"+
		"\u04b9\3\2\2\2\u0512\u04bf\3\2\2\2\u0512\u04c5\3\2\2\2\u0512\u04cd\3\2"+
		"\2\2\u0512\u04d4\3\2\2\2\u0512\u04da\3\2\2\2\u0512\u04e0\3\2\2\2\u0512"+
		"\u04e6\3\2\2\2\u0512\u04eb\3\2\2\2\u0512\u04f3\3\2\2\2\u0512\u04fb\3\2"+
		"\2\2\u0512\u0504\3\2\2\2\u0512\u050d\3\2\2\2\u0512\u050f\3\2\2\2\u0512"+
		"\u0510\3\2\2\2\u0512\u0511\3\2\2\2\u0513\27\3\2\2\2\u0514\u0516\7\65\2"+
		"\2\u0515\u0517\7\u00f7\2\2\u0516\u0515\3\2\2\2\u0516\u0517\3\2\2\2\u0517"+
		"\u0519\3\2\2\2\u0518\u051a\7\\\2\2\u0519\u0518\3\2\2\2\u0519\u051a\3\2"+
		"\2\2\u051a\u051b\3\2\2\2\u051b\u051f\7\u00f3\2\2\u051c\u051d\7s\2\2\u051d"+
		"\u051e\7\u00a1\2\2\u051e\u0520\7X\2\2\u051f\u051c\3\2\2\2\u051f\u0520"+
		"\3\2\2\2\u0520\u0521\3\2\2\2\u0521\u0522\5\u00ba^\2\u0522\31\3\2\2\2\u0523"+
		"\u0524\7\65\2\2\u0524\u0526\7\u00a9\2\2\u0525\u0523\3\2\2\2\u0525\u0526"+
		"\3\2\2\2\u0526\u0527\3\2\2\2\u0527\u0528\7\u00cb\2\2\u0528\u0529\7\u00f3"+
		"\2\2\u0529\u052a\5\u00ba^\2\u052a\33\3\2\2\2\u052b\u052c\7\'\2\2\u052c"+
		"\u052d\7\34\2\2\u052d\u0531\5\u00a2R\2\u052e\u052f\7\u00e8\2\2\u052f\u0530"+
		"\7\34\2\2\u0530\u0532\5\u00a6T\2\u0531\u052e\3\2\2\2\u0531\u0532\3\2\2"+
		"\2\u0532\u0533\3\2\2\2\u0533\u0534\7\177\2\2\u0534\u0535\7\u013b\2\2\u0535"+
		"\u0536\7\33\2\2\u0536\35\3\2\2\2\u0537\u0538\7\u00e5\2\2\u0538\u0539\7"+
		"\34\2\2\u0539\u053a\5\u00a2R\2\u053a\u053d\7\u00a5\2\2\u053b\u053e\5F"+
		"$\2\u053c\u053e\5H%\2\u053d\u053b\3\2\2\2\u053d\u053c\3\2\2\2\u053e\u0542"+
		"\3\2\2\2\u053f\u0540\7\u00eb\2\2\u0540\u0541\7\24\2\2\u0541\u0543\7L\2"+
		"\2\u0542\u053f\3\2\2\2\u0542\u0543\3\2\2\2\u0543\37\3\2\2\2\u0544\u0545"+
		"\7\u0090\2\2\u0545\u0546\7\u0137\2\2\u0546!\3\2\2\2\u0547\u0548\7-\2\2"+
		"\u0548\u0549\7\u0137\2\2\u0549#\3\2\2\2\u054a\u054c\5\66\34\2\u054b\u054a"+
		"\3\2\2\2\u054b\u054c\3\2\2\2\u054c\u054d\3\2\2\2\u054d\u054e\5X-\2\u054e"+
		"\u054f\5T+\2\u054f%\3\2\2\2\u0550\u0551\7|\2\2\u0551\u0553\7\u00b1\2\2"+
		"\u0552\u0554\7\u00f3\2\2\u0553\u0552\3\2\2\2\u0553\u0554\3\2\2\2\u0554"+
		"\u0555\3\2\2\2\u0555\u055c\5\u00ba^\2\u0556\u055a\5*\26\2\u0557\u0558"+
		"\7s\2\2\u0558\u0559\7\u00a1\2\2\u0559\u055b\7X\2\2\u055a\u0557\3\2\2\2"+
		"\u055a\u055b\3\2\2\2\u055b\u055d\3\2\2\2\u055c\u0556\3\2\2\2\u055c\u055d"+
		"\3\2\2\2\u055d\u055f\3\2\2\2\u055e\u0560\5\u00a2R\2\u055f\u055e\3\2\2"+
		"\2\u055f\u0560\3\2\2\2\u0560\u058e\3\2\2\2\u0561\u0562\7|\2\2\u0562\u0564"+
		"\7\177\2\2\u0563\u0565\7\u00f3\2\2\u0564\u0563\3\2\2\2\u0564\u0565\3\2"+
		"\2\2\u0565\u0566\3\2\2\2\u0566\u0568\5\u00ba^\2\u0567\u0569\5*\26\2\u0568"+
		"\u0567\3\2\2\2\u0568\u0569\3\2\2\2\u0569\u056d\3\2\2\2\u056a\u056b\7s"+
		"\2\2\u056b\u056c\7\u00a1\2\2\u056c\u056e\7X\2\2\u056d\u056a\3\2\2\2\u056d"+
		"\u056e\3\2\2\2\u056e\u0570\3\2\2\2\u056f\u0571\5\u00a2R\2\u0570\u056f"+
		"\3\2\2\2\u0570\u0571\3\2\2\2\u0571\u058e\3\2\2\2\u0572\u0573\7|\2\2\u0573"+
		"\u0575\7\u00b1\2\2\u0574\u0576\7\u008f\2\2\u0575\u0574\3\2\2\2\u0575\u0576"+
		"\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u0578\7M\2\2\u0578\u057a\7\u0137\2"+
		"\2\u0579\u057b\5\u00b6\\\2\u057a\u0579\3\2\2\2\u057a\u057b\3\2\2\2\u057b"+
		"\u057d\3\2\2\2\u057c\u057e\5J&\2\u057d\u057c\3\2\2\2\u057d\u057e\3\2\2"+
		"\2\u057e\u058e\3\2\2\2\u057f\u0580\7|\2\2\u0580\u0582\7\u00b1\2\2\u0581"+
		"\u0583\7\u008f\2\2\u0582\u0581\3\2\2\2\u0582\u0583\3\2\2\2\u0583\u0584"+
		"\3\2\2\2\u0584\u0586\7M\2\2\u0585\u0587\7\u0137\2\2\u0586\u0585\3\2\2"+
		"\2\u0586\u0587\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u058b\5:\36\2\u0589\u058a"+
		"\7\u00a8\2\2\u058a\u058c\5> \2\u058b\u0589\3\2\2\2\u058b\u058c\3\2\2\2"+
		"\u058c\u058e\3\2\2\2\u058d\u0550\3\2\2\2\u058d\u0561\3\2\2\2\u058d\u0572"+
		"\3\2\2\2\u058d\u057f\3\2\2\2\u058e\'\3\2\2\2\u058f\u0591\5*\26\2\u0590"+
		"\u0592\5 \21\2\u0591\u0590\3\2\2\2\u0591\u0592\3\2\2\2\u0592)\3\2\2\2"+
		"\u0593\u0594\7\u00b2\2\2\u0594\u0595\7\4\2\2\u0595\u059a\5,\27\2\u0596"+
		"\u0597\7\6\2\2\u0597\u0599\5,\27\2\u0598\u0596\3\2\2\2\u0599\u059c\3\2"+
		"\2\2\u059a\u0598\3\2\2\2\u059a\u059b\3\2\2\2\u059b\u059d\3\2\2\2\u059c"+
		"\u059a\3\2\2\2\u059d\u059e\7\5\2\2\u059e+\3\2\2\2\u059f\u05a2\5\u0120"+
		"\u0091\2\u05a0\u05a1\7\u0121\2\2\u05a1\u05a3\5\u00dep\2\u05a2\u05a0\3"+
		"\2\2\2\u05a2\u05a3\3\2\2\2\u05a3\u05a9\3\2\2\2\u05a4\u05a5\5\u0120\u0091"+
		"\2\u05a5\u05a6\7\u0121\2\2\u05a6\u05a7\7E\2\2\u05a7\u05a9\3\2\2\2\u05a8"+
		"\u059f\3\2\2\2\u05a8\u05a4\3\2\2\2\u05a9-\3\2\2\2\u05aa\u05ab\t\17\2\2"+
		"\u05ab/\3\2\2\2\u05ac\u05ad\t\20\2\2\u05ad\61\3\2\2\2\u05ae\u05b4\5\u011a"+
		"\u008e\2\u05af\u05b4\7\u0137\2\2\u05b0\u05b4\5\u00e0q\2\u05b1\u05b4\5"+
		"\u00e2r\2\u05b2\u05b4\5\u00e4s\2\u05b3\u05ae\3\2\2\2\u05b3\u05af\3\2\2"+
		"\2\u05b3\u05b0\3\2\2\2\u05b3\u05b1\3\2\2\2\u05b3\u05b2\3\2\2\2\u05b4\63"+
		"\3\2\2\2\u05b5\u05ba\5\u0120\u0091\2\u05b6\u05b7\7\7\2\2\u05b7\u05b9\5"+
		"\u0120\u0091\2\u05b8\u05b6\3\2\2\2\u05b9\u05bc\3\2\2\2\u05ba\u05b8\3\2"+
		"\2\2\u05ba\u05bb\3\2\2\2\u05bb\65\3\2\2\2\u05bc\u05ba\3\2\2\2\u05bd\u05be"+
		"\7\u011d\2\2\u05be\u05c3\58\35\2\u05bf\u05c0\7\6\2\2\u05c0\u05c2\58\35"+
		"\2\u05c1\u05bf\3\2\2\2\u05c2\u05c5\3\2\2\2\u05c3\u05c1\3\2\2\2\u05c3\u05c4"+
		"\3\2\2\2\u05c4\67\3\2\2\2\u05c5\u05c3\3\2\2\2\u05c6\u05c8\5\u011c\u008f"+
		"\2\u05c7\u05c9\5\u00a2R\2\u05c8\u05c7\3\2\2\2\u05c8\u05c9\3\2\2\2\u05c9"+
		"\u05cb\3\2\2\2\u05ca\u05cc\7\24\2\2\u05cb\u05ca\3\2\2\2\u05cb\u05cc\3"+
		"\2\2\2\u05cc\u05cd\3\2\2\2\u05cd\u05ce\7\4\2\2\u05ce\u05cf\5$\23\2\u05cf"+
		"\u05d0\7\5\2\2\u05d09\3\2\2\2\u05d1\u05d2\7\u0114\2\2\u05d2\u05d3\5\u00ba"+
		"^\2\u05d3;\3\2\2\2\u05d4\u05d5\7\u00a8\2\2\u05d5\u05e4\5> \2\u05d6\u05d7"+
		"\7\u011d\2\2\u05d7\u05e4\5> \2\u05d8\u05d9\7\u00b3\2\2\u05d9\u05da\7\34"+
		"\2\2\u05da\u05e4\5\u00c8e\2\u05db\u05e4\5\36\20\2\u05dc\u05e4\5\34\17"+
		"\2\u05dd\u05e4\5\u00b6\\\2\u05de\u05e4\5J&\2\u05df\u05e4\5 \21\2\u05e0"+
		"\u05e4\5\"\22\2\u05e1\u05e2\7\u00f6\2\2\u05e2\u05e4\5> \2\u05e3\u05d4"+
		"\3\2\2\2\u05e3\u05d6\3\2\2\2\u05e3\u05d8\3\2\2\2\u05e3\u05db\3\2\2\2\u05e3"+
		"\u05dc\3\2\2\2\u05e3\u05dd\3\2\2\2\u05e3\u05de\3\2\2\2\u05e3\u05df\3\2"+
		"\2\2\u05e3\u05e0\3\2\2\2\u05e3\u05e1\3\2\2\2\u05e4\u05e7\3\2\2\2\u05e5"+
		"\u05e3\3\2\2\2\u05e5\u05e6\3\2\2\2\u05e6=\3\2\2\2\u05e7\u05e5\3\2\2\2"+
		"\u05e8\u05e9\7\4\2\2\u05e9\u05ee\5@!\2\u05ea\u05eb\7\6\2\2\u05eb\u05ed"+
		"\5@!\2\u05ec\u05ea\3\2\2\2\u05ed\u05f0\3\2\2\2\u05ee\u05ec\3\2\2\2\u05ee"+
		"\u05ef\3\2\2\2\u05ef\u05f1\3\2\2\2\u05f0\u05ee\3\2\2\2\u05f1\u05f2\7\5"+
		"\2\2\u05f2?\3\2\2\2\u05f3\u05f8\5B\"\2\u05f4\u05f6\7\u0121\2\2\u05f5\u05f4"+
		"\3\2\2\2\u05f5\u05f6\3\2\2\2\u05f6\u05f7\3\2\2\2\u05f7\u05f9\5D#\2\u05f8"+
		"\u05f5\3\2\2\2\u05f8\u05f9\3\2\2\2\u05f9A\3\2\2\2\u05fa\u05ff\5\u0120"+
		"\u0091\2\u05fb\u05fc\7\7\2\2\u05fc\u05fe\5\u0120\u0091\2\u05fd\u05fb\3"+
		"\2\2\2\u05fe\u0601\3\2\2\2\u05ff\u05fd\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u0604\3\2\2\2\u0601\u05ff\3\2\2\2\u0602\u0604\7\u0137\2\2\u0603\u05fa"+
		"\3\2\2\2\u0603\u0602\3\2\2\2\u0604C\3\2\2\2\u0605\u060a\7\u013b\2\2\u0606"+
		"\u060a\7\u013d\2\2\u0607\u060a\5\u00e6t\2\u0608\u060a\7\u0137\2\2\u0609"+
		"\u0605\3\2\2\2\u0609\u0606\3\2\2\2\u0609\u0607\3\2\2\2\u0609\u0608\3\2"+
		"\2\2\u060aE\3\2\2\2\u060b\u060c\7\4\2\2\u060c\u0611\5\u00dep\2\u060d\u060e"+
		"\7\6\2\2\u060e\u0610\5\u00dep\2\u060f\u060d\3\2\2\2\u0610\u0613\3\2\2"+
		"\2\u0611\u060f\3\2\2\2\u0611\u0612\3\2\2\2\u0612\u0614\3\2\2\2\u0613\u0611"+
		"\3\2\2\2\u0614\u0615\7\5\2\2\u0615G\3\2\2\2\u0616\u0617\7\4\2\2\u0617"+
		"\u061c\5F$\2\u0618\u0619\7\6\2\2\u0619\u061b\5F$\2\u061a\u0618\3\2\2\2"+
		"\u061b\u061e\3\2\2\2\u061c\u061a\3\2\2\2\u061c\u061d\3\2\2\2\u061d\u061f"+
		"\3\2\2\2\u061e\u061c\3\2\2\2\u061f\u0620\7\5\2\2\u0620I\3\2\2\2\u0621"+
		"\u0622\7\u00eb\2\2\u0622\u0623\7\24\2\2\u0623\u0628\5L\'\2\u0624\u0625"+
		"\7\u00eb\2\2\u0625\u0626\7\34\2\2\u0626\u0628\5N(\2\u0627\u0621\3\2\2"+
		"\2\u0627\u0624\3\2\2\2\u0628K\3\2\2\2\u0629\u062a\7{\2\2\u062a\u062b\7"+
		"\u0137\2\2\u062b\u062c\7\u00ad\2\2\u062c\u062f\7\u0137\2\2\u062d\u062f"+
		"\5\u0120\u0091\2\u062e\u0629\3\2\2\2\u062e\u062d\3\2\2\2\u062fM\3\2\2"+
		"\2\u0630\u0634\7\u0137\2\2\u0631\u0632\7\u011d\2\2\u0632\u0633\7\u00df"+
		"\2\2\u0633\u0635\5> \2\u0634\u0631\3\2\2\2\u0634\u0635\3\2\2\2\u0635O"+
		"\3\2\2\2\u0636\u0637\5\u0120\u0091\2\u0637\u0638\7\u0137\2\2\u0638Q\3"+
		"\2\2\2\u0639\u063a\5&\24\2\u063a\u063b\5$\23\2\u063b\u066c\3\2\2\2\u063c"+
		"\u063e\5~@\2\u063d\u063f\5V,\2\u063e\u063d\3\2\2\2\u063f\u0640\3\2\2\2"+
		"\u0640\u063e\3\2\2\2\u0640\u0641\3\2\2\2\u0641\u066c\3\2\2\2\u0642\u0643"+
		"\7G\2\2\u0643\u0644\7i\2\2\u0644\u0645\5\u00ba^\2\u0645\u0647\5\u00b4"+
		"[\2\u0646\u0648\5v<\2\u0647\u0646\3\2\2\2\u0647\u0648\3\2\2\2\u0648\u066c"+
		"\3\2\2\2\u0649\u064a\7\u0111\2\2\u064a\u064b\5\u00ba^\2\u064b\u064c\5"+
		"\u00b4[\2\u064c\u064e\5h\65\2\u064d\u064f\5v<\2\u064e\u064d\3\2\2\2\u064e"+
		"\u064f\3\2\2\2\u064f\u066c\3\2\2\2\u0650\u0651\7\u0097\2\2\u0651\u0652"+
		"\7\177\2\2\u0652\u0653\5\u00ba^\2\u0653\u0654\5\u00b4[\2\u0654\u065a\7"+
		"\u0114\2\2\u0655\u065b\5\u00ba^\2\u0656\u0657\7\4\2\2\u0657\u0658\5$\23"+
		"\2\u0658\u0659\7\5\2\2\u0659\u065b\3\2\2\2\u065a\u0655\3\2\2\2\u065a\u0656"+
		"\3\2\2\2\u065b\u065c\3\2\2\2\u065c\u065d\5\u00b4[\2\u065d\u065e\7\u00a5"+
		"\2\2\u065e\u0662\5\u00d4k\2\u065f\u0661\5j\66\2\u0660\u065f\3\2\2\2\u0661"+
		"\u0664\3\2\2\2\u0662\u0660\3\2\2\2\u0662\u0663\3\2\2\2\u0663\u0668\3\2"+
		"\2\2\u0664\u0662\3\2\2\2\u0665\u0667\5l\67\2\u0666\u0665\3\2\2\2\u0667"+
		"\u066a\3\2\2\2\u0668\u0666\3\2\2\2\u0668\u0669\3\2\2\2\u0669\u066c\3\2"+
		"\2\2\u066a\u0668\3\2\2\2\u066b\u0639\3\2\2\2\u066b\u063c\3\2\2\2\u066b"+
		"\u0642\3\2\2\2\u066b\u0649\3\2\2\2\u066b\u0650\3\2\2\2\u066cS\3\2\2\2"+
		"\u066d\u066e\7\u00aa\2\2\u066e\u066f\7\34\2\2\u066f\u0674\5\\/\2\u0670"+
		"\u0671\7\6\2\2\u0671\u0673\5\\/\2\u0672\u0670\3\2\2\2\u0673\u0676\3\2"+
		"\2\2\u0674\u0672\3\2\2\2\u0674\u0675\3\2\2\2\u0675\u0678\3\2\2\2\u0676"+
		"\u0674\3\2\2\2\u0677\u066d\3\2\2\2\u0677\u0678\3\2\2\2\u0678\u0683\3\2"+
		"\2\2\u0679\u067a\7&\2\2\u067a\u067b\7\34\2\2\u067b\u0680\5\u00d0i\2\u067c"+
		"\u067d\7\6\2\2\u067d\u067f\5\u00d0i\2\u067e\u067c\3\2\2\2\u067f\u0682"+
		"\3\2\2\2\u0680\u067e\3\2\2\2\u0680\u0681\3\2\2\2\u0681\u0684\3\2\2\2\u0682"+
		"\u0680\3\2\2\2\u0683\u0679\3\2\2\2\u0683\u0684\3\2\2\2\u0684\u068f\3\2"+
		"\2\2\u0685\u0686\7O\2\2\u0686\u0687\7\34\2\2\u0687\u068c\5\u00d0i\2\u0688"+
		"\u0689\7\6\2\2\u0689\u068b\5\u00d0i\2\u068a\u0688\3\2\2\2\u068b\u068e"+
		"\3\2\2\2\u068c\u068a\3\2\2\2\u068c\u068d\3\2\2\2\u068d\u0690\3\2\2\2\u068e"+
		"\u068c\3\2\2\2\u068f\u0685\3\2\2\2\u068f\u0690\3\2\2\2\u0690\u069b\3\2"+
		"\2\2\u0691\u0692\7\u00e7\2\2\u0692\u0693\7\34\2\2\u0693\u0698\5\\/\2\u0694"+
		"\u0695\7\6\2\2\u0695\u0697\5\\/\2\u0696\u0694\3\2\2\2\u0697\u069a\3\2"+
		"\2\2\u0698\u0696\3\2\2\2\u0698\u0699\3\2\2\2\u0699\u069c\3\2\2\2\u069a"+
		"\u0698\3\2\2\2\u069b\u0691\3\2\2\2\u069b\u069c\3\2\2\2\u069c\u069e\3\2"+
		"\2\2\u069d\u069f\5\u010c\u0087\2\u069e\u069d\3\2\2\2\u069e\u069f\3\2\2"+
		"\2\u069f\u06a5\3\2\2\2\u06a0\u06a3\7\u008b\2\2\u06a1\u06a4\7\f\2\2\u06a2"+
		"\u06a4\5\u00d0i\2\u06a3\u06a1\3\2\2\2\u06a3\u06a2\3\2\2\2\u06a4\u06a6"+
		"\3\2\2\2\u06a5\u06a0\3\2\2\2\u06a5\u06a6\3\2\2\2\u06a6U\3\2\2\2\u06a7"+
		"\u06a8\5&\24\2\u06a8\u06a9\5`\61\2\u06a9W\3\2\2\2\u06aa\u06ab\b-\1\2\u06ab"+
		"\u06ac\5Z.\2\u06ac\u06c4\3\2\2\2\u06ad\u06ae\f\5\2\2\u06ae\u06af\6-\3"+
		"\2\u06af\u06b1\t\21\2\2\u06b0\u06b2\5\u0094K\2\u06b1\u06b0\3\2\2\2\u06b1"+
		"\u06b2\3\2\2\2\u06b2\u06b3\3\2\2\2\u06b3\u06c3\5X-\6\u06b4\u06b5\f\4\2"+
		"\2\u06b5\u06b6\6-\5\2\u06b6\u06b8\7}\2\2\u06b7\u06b9\5\u0094K\2\u06b8"+
		"\u06b7\3\2\2\2\u06b8\u06b9\3\2\2\2\u06b9\u06ba\3\2\2\2\u06ba\u06c3\5X"+
		"-\5\u06bb\u06bc\f\3\2\2\u06bc\u06bd\6-\7\2\u06bd\u06bf\t\22\2\2\u06be"+
		"\u06c0\5\u0094K\2\u06bf\u06be\3\2\2\2\u06bf\u06c0\3\2\2\2\u06c0\u06c1"+
		"\3\2\2\2\u06c1\u06c3\5X-\4\u06c2\u06ad\3\2\2\2\u06c2\u06b4\3\2\2\2\u06c2"+
		"\u06bb\3\2\2\2\u06c3\u06c6\3\2\2\2\u06c4\u06c2\3\2\2\2\u06c4\u06c5\3\2"+
		"\2\2\u06c5Y\3\2\2\2\u06c6\u06c4\3\2\2\2\u06c7\u06d1\5b\62\2\u06c8\u06d1"+
		"\5^\60\2\u06c9\u06ca\7\u00f3\2\2\u06ca\u06d1\5\u00ba^\2\u06cb\u06d1\5"+
		"\u00b0Y\2\u06cc\u06cd\7\4\2\2\u06cd\u06ce\5$\23\2\u06ce\u06cf\7\5\2\2"+
		"\u06cf\u06d1\3\2\2\2\u06d0\u06c7\3\2\2\2\u06d0\u06c8\3\2\2\2\u06d0\u06c9"+
		"\3\2\2\2\u06d0\u06cb\3\2\2\2\u06d0\u06cc\3\2\2\2\u06d1[\3\2\2\2\u06d2"+
		"\u06d4\5\u00d0i\2\u06d3\u06d5\t\23\2\2\u06d4\u06d3\3\2\2\2\u06d4\u06d5"+
		"\3\2\2\2\u06d5\u06d8\3\2\2\2\u06d6\u06d7\7\u00a3\2\2\u06d7\u06d9\t\24"+
		"\2\2\u06d8\u06d6\3\2\2\2\u06d8\u06d9\3\2\2\2\u06d9]\3\2\2\2\u06da\u06dc"+
		"\5~@\2\u06db\u06dd\5`\61\2\u06dc\u06db\3\2\2\2\u06dd\u06de\3\2\2\2\u06de"+
		"\u06dc\3\2\2\2\u06de\u06df\3\2\2\2\u06df_\3\2\2\2\u06e0\u06e2\5d\63\2"+
		"\u06e1\u06e3\5v<\2\u06e2\u06e1\3\2\2\2\u06e2\u06e3\3\2\2\2\u06e3\u06e4"+
		"\3\2\2\2\u06e4\u06e5\5T+\2\u06e5\u06fc\3\2\2\2\u06e6\u06ea\5f\64\2\u06e7"+
		"\u06e9\5\u0092J\2\u06e8\u06e7\3\2\2\2\u06e9\u06ec\3\2\2\2\u06ea\u06e8"+
		"\3\2\2\2\u06ea\u06eb\3\2\2\2\u06eb\u06ee\3\2\2\2\u06ec\u06ea\3\2\2\2\u06ed"+
		"\u06ef\5v<\2\u06ee\u06ed\3\2\2\2\u06ee\u06ef\3\2\2\2\u06ef\u06f1\3\2\2"+
		"\2\u06f0\u06f2\5\u0082B\2\u06f1\u06f0\3\2\2\2\u06f1\u06f2\3\2\2\2\u06f2"+
		"\u06f4\3\2\2\2\u06f3\u06f5\5x=\2\u06f4\u06f3\3\2\2\2\u06f4\u06f5\3\2\2"+
		"\2\u06f5\u06f7\3\2\2\2\u06f6\u06f8\5\u010c\u0087\2\u06f7\u06f6\3\2\2\2"+
		"\u06f7\u06f8\3\2\2\2\u06f8\u06f9\3\2\2\2\u06f9\u06fa\5T+\2\u06fa\u06fc"+
		"\3\2\2\2\u06fb\u06e0\3\2\2\2\u06fb\u06e6\3\2\2\2\u06fca\3\2\2\2\u06fd"+
		"\u06ff\5d\63\2\u06fe\u0700\5~@\2\u06ff\u06fe\3\2\2\2\u06ff\u0700\3\2\2"+
		"\2\u0700\u0704\3\2\2\2\u0701\u0703\5\u0092J\2\u0702\u0701\3\2\2\2\u0703"+
		"\u0706\3\2\2\2\u0704\u0702\3\2\2\2\u0704\u0705\3\2\2\2\u0705\u0708\3\2"+
		"\2\2\u0706\u0704\3\2\2\2\u0707\u0709\5v<\2\u0708\u0707\3\2\2\2\u0708\u0709"+
		"\3\2\2\2\u0709\u070b\3\2\2\2\u070a\u070c\5\u0082B\2\u070b\u070a\3\2\2"+
		"\2\u070b\u070c\3\2\2\2\u070c\u070e\3\2\2\2\u070d\u070f\5x=\2\u070e\u070d"+
		"\3\2\2\2\u070e\u070f\3\2\2\2\u070f\u0711\3\2\2\2\u0710\u0712\5\u010c\u0087"+
		"\2\u0711\u0710\3\2\2\2\u0711\u0712\3\2\2\2\u0712\u072a\3\2\2\2\u0713\u0715"+
		"\5f\64\2\u0714\u0716\5~@\2\u0715\u0714\3\2\2\2\u0715\u0716\3\2\2\2\u0716"+
		"\u071a\3\2\2\2\u0717\u0719\5\u0092J\2\u0718\u0717\3\2\2\2\u0719\u071c"+
		"\3\2\2\2\u071a\u0718\3\2\2\2\u071a\u071b\3\2\2\2\u071b\u071e\3\2\2\2\u071c"+
		"\u071a\3\2\2\2\u071d\u071f\5v<\2\u071e\u071d\3\2\2\2\u071e\u071f\3\2\2"+
		"\2\u071f\u0721\3\2\2\2\u0720\u0722\5\u0082B\2\u0721\u0720\3\2\2\2\u0721"+
		"\u0722\3\2\2\2\u0722\u0724\3\2\2\2\u0723\u0725\5x=\2\u0724\u0723\3\2\2"+
		"\2\u0724\u0725\3\2\2\2\u0725\u0727\3\2\2\2\u0726\u0728\5\u010c\u0087\2"+
		"\u0727\u0726\3\2\2\2\u0727\u0728\3\2\2\2\u0728\u072a\3\2\2\2\u0729\u06fd"+
		"\3\2\2\2\u0729\u0713\3\2\2\2\u072ac\3\2\2\2\u072b\u072c\7\u00db\2\2\u072c"+
		"\u072d\7\u0103\2\2\u072d\u072f\7\4\2\2\u072e\u0730\5\u0094K\2\u072f\u072e"+
		"\3\2\2\2\u072f\u0730\3\2\2\2\u0730\u0731\3\2\2\2\u0731\u0732\5\u00d2j"+
		"\2\u0732\u0733\7\5\2\2\u0733\u073f\3\2\2\2\u0734\u0736\7\u0095\2\2\u0735"+
		"\u0737\5\u0094K\2\u0736\u0735\3\2\2\2\u0736\u0737\3\2\2\2\u0737\u0738"+
		"\3\2\2\2\u0738\u073f\5\u00d2j\2\u0739\u073b\7\u00c5\2\2\u073a\u073c\5"+
		"\u0094K\2\u073b\u073a\3\2\2\2\u073b\u073c\3\2\2\2\u073c\u073d\3\2\2\2"+
		"\u073d\u073f\5\u00d2j\2\u073e\u072b\3\2\2\2\u073e\u0734\3\2\2\2\u073e"+
		"\u0739\3\2\2\2\u073f\u0741\3\2\2\2\u0740\u0742\5\u00b6\\\2\u0741\u0740"+
		"\3\2\2\2\u0741\u0742\3\2\2\2\u0742\u0745\3\2\2\2\u0743\u0744\7\u00c3\2"+
		"\2\u0744\u0746\7\u0137\2\2\u0745\u0743\3\2\2\2\u0745\u0746\3\2\2\2\u0746"+
		"\u0747\3\2\2\2\u0747\u0748\7\u0114\2\2\u0748\u0755\7\u0137\2\2\u0749\u0753"+
		"\7\24\2\2\u074a\u0754\5\u00a4S\2\u074b\u0754\5\u00fe\u0080\2\u074c\u074f"+
		"\7\4\2\2\u074d\u0750\5\u00a4S\2\u074e\u0750\5\u00fe\u0080\2\u074f\u074d"+
		"\3\2\2\2\u074f\u074e\3\2\2\2\u0750\u0751\3\2\2\2\u0751\u0752\7\5\2\2\u0752"+
		"\u0754\3\2\2\2\u0753\u074a\3\2\2\2\u0753\u074b\3\2\2\2\u0753\u074c\3\2"+
		"\2\2\u0754\u0756\3\2\2\2\u0755\u0749\3\2\2\2\u0755\u0756\3\2\2\2\u0756"+
		"\u0758\3\2\2\2\u0757\u0759\5\u00b6\\\2\u0758\u0757\3\2\2\2\u0758\u0759"+
		"\3\2\2\2\u0759\u075c\3\2\2\2\u075a\u075b\7\u00c2\2\2\u075b\u075d\7\u0137"+
		"\2\2\u075c\u075a\3\2\2\2\u075c\u075d\3\2\2\2\u075de\3\2\2\2\u075e\u0762"+
		"\7\u00db\2\2\u075f\u0761\5z>\2\u0760\u075f\3\2\2\2\u0761\u0764\3\2\2\2"+
		"\u0762\u0760\3\2\2\2\u0762\u0763\3\2\2\2\u0763\u0766\3\2\2\2\u0764\u0762"+
		"\3\2\2\2\u0765\u0767\5\u0094K\2\u0766\u0765\3\2\2\2\u0766\u0767\3\2\2"+
		"\2\u0767\u0768\3\2\2\2\u0768\u0769\5\u00c6d\2\u0769g\3\2\2\2\u076a\u076b"+
		"\7\u00e1\2\2\u076b\u076c\5r:\2\u076ci\3\2\2\2\u076d\u076e\7\u011a\2\2"+
		"\u076e\u0771\7\u0096\2\2\u076f\u0770\7\17\2\2\u0770\u0772\5\u00d4k\2\u0771"+
		"\u076f\3\2\2\2\u0771\u0772\3\2\2\2\u0772\u0773\3\2\2\2\u0773\u0774\7\u00f9"+
		"\2\2\u0774\u0775\5n8\2\u0775k\3\2\2\2\u0776\u0777\7\u011a\2\2\u0777\u0778"+
		"\7\u00a1\2\2\u0778\u077b\7\u0096\2\2\u0779\u077a\7\17\2\2\u077a\u077c"+
		"\5\u00d4k\2\u077b\u0779\3\2\2\2\u077b\u077c\3\2\2\2\u077c\u077d\3\2\2"+
		"\2\u077d\u077e\7\u00f9\2\2\u077e\u077f\5p9\2\u077fm\3\2\2\2\u0780\u0788"+
		"\7G\2\2\u0781\u0782\7\u0111\2\2\u0782\u0783\7\u00e1\2\2\u0783\u0788\7"+
		"\u012b\2\2\u0784\u0785\7\u0111\2\2\u0785\u0786\7\u00e1\2\2\u0786\u0788"+
		"\5r:\2\u0787\u0780\3\2\2\2\u0787\u0781\3\2\2\2\u0787\u0784\3\2\2\2\u0788"+
		"o\3\2\2\2\u0789\u078a\7|\2\2\u078a\u079c\7\u012b\2\2\u078b\u078c\7|\2"+
		"\2\u078c\u078d\7\4\2\2\u078d\u078e\5\u00b8]\2\u078e\u078f\7\5\2\2\u078f"+
		"\u0790\7\u0115\2\2\u0790\u0791\7\4\2\2\u0791\u0796\5\u00d0i\2\u0792\u0793"+
		"\7\6\2\2\u0793\u0795\5\u00d0i\2\u0794\u0792\3\2\2\2\u0795\u0798\3\2\2"+
		"\2\u0796\u0794\3\2\2\2\u0796\u0797\3\2\2\2\u0797\u0799\3\2\2\2\u0798\u0796"+
		"\3\2\2\2\u0799\u079a\7\5\2\2\u079a\u079c\3\2\2\2\u079b\u0789\3\2\2\2\u079b"+
		"\u078b\3\2\2\2\u079cq\3\2\2\2\u079d\u07a2\5t;\2\u079e\u079f\7\6\2\2\u079f"+
		"\u07a1\5t;\2\u07a0\u079e\3\2\2\2\u07a1\u07a4\3\2\2\2\u07a2\u07a0\3\2\2"+
		"\2\u07a2\u07a3\3\2\2\2\u07a3s\3\2\2\2\u07a4\u07a2\3\2\2\2\u07a5\u07a6"+
		"\5\u00ba^\2\u07a6\u07a7\7\u0121\2\2\u07a7\u07a8\5\u00d0i\2\u07a8u\3\2"+
		"\2\2\u07a9\u07aa\7\u011b\2\2\u07aa\u07ab\5\u00d4k\2\u07abw\3\2\2\2\u07ac"+
		"\u07ad\7q\2\2\u07ad\u07ae\5\u00d4k\2\u07aey\3\2\2\2\u07af\u07b0\7\u0135"+
		"\2\2\u07b0\u07b7\5|?\2\u07b1\u07b3\7\6\2\2\u07b2\u07b1\3\2\2\2\u07b2\u07b3"+
		"\3\2\2\2\u07b3\u07b4\3\2\2\2\u07b4\u07b6\5|?\2\u07b5\u07b2\3\2\2\2\u07b6"+
		"\u07b9\3\2\2\2\u07b7\u07b5\3\2\2\2\u07b7\u07b8\3\2\2\2\u07b8\u07ba\3\2"+
		"\2\2\u07b9\u07b7\3\2\2\2\u07ba\u07bb\7\u0136\2\2\u07bb{\3\2\2\2\u07bc"+
		"\u07ca\5\u0120\u0091\2\u07bd\u07be\5\u0120\u0091\2\u07be\u07bf\7\4\2\2"+
		"\u07bf\u07c4\5\u00dco\2\u07c0\u07c1\7\6\2\2\u07c1\u07c3\5\u00dco\2\u07c2"+
		"\u07c0\3\2\2\2\u07c3\u07c6\3\2\2\2\u07c4\u07c2\3\2\2\2\u07c4\u07c5\3\2"+
		"\2\2\u07c5\u07c7\3\2\2\2\u07c6\u07c4\3\2\2\2\u07c7\u07c8\7\5\2\2\u07c8"+
		"\u07ca\3\2\2\2\u07c9\u07bc\3\2\2\2\u07c9\u07bd\3\2\2\2\u07ca}\3\2\2\2"+
		"\u07cb\u07cc\7i\2\2\u07cc\u07d1\5\u0096L\2\u07cd\u07ce\7\6\2\2\u07ce\u07d0"+
		"\5\u0096L\2\u07cf\u07cd\3\2\2\2\u07d0\u07d3\3\2\2\2\u07d1\u07cf\3\2\2"+
		"\2\u07d1\u07d2\3\2\2\2\u07d2\u07d7\3\2\2\2\u07d3\u07d1\3\2\2\2\u07d4\u07d6"+
		"\5\u0092J\2\u07d5\u07d4\3\2\2\2\u07d6\u07d9\3\2\2\2\u07d7\u07d5\3\2\2"+
		"\2\u07d7\u07d8\3\2\2\2\u07d8\u07db\3\2\2\2\u07d9\u07d7\3\2\2\2\u07da\u07dc"+
		"\5\u008cG\2\u07db\u07da\3\2\2\2\u07db\u07dc\3\2\2\2\u07dc\177\3\2\2\2"+
		"\u07dd\u07df\7e\2\2\u07de\u07dd\3\2\2\2\u07de\u07df\3\2\2\2\u07df\u07e0"+
		"\3\2\2\2\u07e0\u07e1\t\25\2\2\u07e1\u07e2\7\24\2\2\u07e2\u07e3\7\u00a4"+
		"\2\2\u07e3\u07ec\t\26\2\2\u07e4\u07e6\7e\2\2\u07e5\u07e4\3\2\2\2\u07e5"+
		"\u07e6\3\2\2\2\u07e6\u07e7\3\2\2\2\u07e7\u07e8\t\27\2\2\u07e8\u07e9\7"+
		"\24\2\2\u07e9\u07ea\7\u00a4\2\2\u07ea\u07ec\5\u00d8m\2\u07eb\u07de\3\2"+
		"\2\2\u07eb\u07e5\3\2\2\2\u07ec\u0081\3\2\2\2\u07ed\u07ee\7o\2\2\u07ee"+
		"\u07ef\7\34\2\2\u07ef\u07f4\5\u0084C\2\u07f0\u07f1\7\6\2\2\u07f1\u07f3"+
		"\5\u0084C\2\u07f2\u07f0\3\2\2\2\u07f3\u07f6\3\2\2\2\u07f4\u07f2\3\2\2"+
		"\2\u07f4\u07f5\3\2\2\2\u07f5\u0815\3\2\2\2\u07f6\u07f4\3\2\2\2\u07f7\u07f8"+
		"\7o\2\2\u07f8\u07f9\7\34\2\2\u07f9\u07fe\5\u00d0i\2\u07fa\u07fb\7\6\2"+
		"\2\u07fb\u07fd\5\u00d0i\2\u07fc\u07fa\3\2\2\2\u07fd\u0800\3\2\2\2\u07fe"+
		"\u07fc\3\2\2\2\u07fe\u07ff\3\2\2\2\u07ff\u0812\3\2\2\2\u0800\u07fe\3\2"+
		"\2\2\u0801\u0802\7\u011d\2\2\u0802\u0813\7\u00d5\2\2\u0803\u0804\7\u011d"+
		"\2\2\u0804\u0813\7\67\2\2\u0805\u0806\7p\2\2\u0806\u0807\7\u00e3\2\2\u0807"+
		"\u0808\7\4\2\2\u0808\u080d\5\u008aF\2\u0809\u080a\7\6\2\2\u080a\u080c"+
		"\5\u008aF\2\u080b\u0809\3\2\2\2\u080c\u080f\3\2\2\2\u080d\u080b\3\2\2"+
		"\2\u080d\u080e\3\2\2\2\u080e\u0810\3\2\2\2\u080f\u080d\3\2\2\2\u0810\u0811"+
		"\7\5\2\2\u0811\u0813\3\2\2\2\u0812\u0801\3\2\2\2\u0812\u0803\3\2\2\2\u0812"+
		"\u0805\3\2\2\2\u0812\u0813\3\2\2\2\u0813\u0815\3\2\2\2\u0814\u07ed\3\2"+
		"\2\2\u0814\u07f7\3\2\2\2\u0815\u0083\3\2\2\2\u0816\u0819\5\u0086D\2\u0817"+
		"\u0819\5\u00d0i";
	private static final String _serializedATNSegment1 =
		"\2\u0818\u0816\3\2\2\2\u0818\u0817\3\2\2\2\u0819\u0085\3\2\2\2\u081a\u081b"+
		"\t\30\2\2\u081b\u081c\7\4\2\2\u081c\u0821\5\u008aF\2\u081d\u081e\7\6\2"+
		"\2\u081e\u0820\5\u008aF\2\u081f\u081d\3\2\2\2\u0820\u0823\3\2\2\2\u0821"+
		"\u081f\3\2\2\2\u0821\u0822\3\2\2\2\u0822\u0824\3\2\2\2\u0823\u0821\3\2"+
		"\2\2\u0824\u0825\7\5\2\2\u0825\u0834\3\2\2\2\u0826\u0827\7p\2\2\u0827"+
		"\u0828\7\u00e3\2\2\u0828\u0829\7\4\2\2\u0829\u082e\5\u0088E\2\u082a\u082b"+
		"\7\6\2\2\u082b\u082d\5\u0088E\2\u082c\u082a\3\2\2\2\u082d\u0830\3\2\2"+
		"\2\u082e\u082c\3\2\2\2\u082e\u082f\3\2\2\2\u082f\u0831\3\2\2\2\u0830\u082e"+
		"\3\2\2\2\u0831\u0832\7\5\2\2\u0832\u0834\3\2\2\2\u0833\u081a\3\2\2\2\u0833"+
		"\u0826\3\2\2\2\u0834\u0087\3\2\2\2\u0835\u0838\5\u0086D\2\u0836\u0838"+
		"\5\u008aF\2\u0837\u0835\3\2\2\2\u0837\u0836\3\2\2\2\u0838\u0089\3\2\2"+
		"\2\u0839\u0842\7\4\2\2\u083a\u083f\5\u00d0i\2\u083b\u083c\7\6\2\2\u083c"+
		"\u083e\5\u00d0i\2\u083d\u083b\3\2\2\2\u083e\u0841\3\2\2\2\u083f\u083d"+
		"\3\2\2\2\u083f\u0840\3\2\2\2\u0840\u0843\3\2\2\2\u0841\u083f\3\2\2\2\u0842"+
		"\u083a\3\2\2\2\u0842\u0843\3\2\2\2\u0843\u0844\3\2\2\2\u0844\u0847\7\5"+
		"\2\2\u0845\u0847\5\u00d0i\2\u0846\u0839\3\2\2\2\u0846\u0845\3\2\2\2\u0847"+
		"\u008b\3\2\2\2\u0848\u0849\7\u00b7\2\2\u0849\u084a\7\4\2\2\u084a\u084b"+
		"\5\u00c6d\2\u084b\u084c\7e\2\2\u084c\u084d\5\u008eH\2\u084d\u084e\7v\2"+
		"\2\u084e\u084f\7\4\2\2\u084f\u0854\5\u0090I\2\u0850\u0851\7\6\2\2\u0851"+
		"\u0853\5\u0090I\2\u0852\u0850\3\2\2\2\u0853\u0856\3\2\2\2\u0854\u0852"+
		"\3\2\2\2\u0854\u0855\3\2\2\2\u0855\u0857\3\2\2\2\u0856\u0854\3\2\2\2\u0857"+
		"\u0858\7\5\2\2\u0858\u0859\7\5\2\2\u0859\u008d\3\2\2\2\u085a\u0867\5\u0120"+
		"\u0091\2\u085b\u085c\7\4\2\2\u085c\u0861\5\u0120\u0091\2\u085d\u085e\7"+
		"\6\2\2\u085e\u0860\5\u0120\u0091\2\u085f\u085d\3\2\2\2\u0860\u0863\3\2"+
		"\2\2\u0861\u085f\3\2\2\2\u0861\u0862\3\2\2\2\u0862\u0864\3\2\2\2\u0863"+
		"\u0861\3\2\2\2\u0864\u0865\7\5\2\2\u0865\u0867\3\2\2\2\u0866\u085a\3\2"+
		"\2\2\u0866\u085b\3\2\2\2\u0867\u008f\3\2\2\2\u0868\u086d\5\u00d0i\2\u0869"+
		"\u086b\7\24\2\2\u086a\u0869\3\2\2\2\u086a\u086b\3\2\2\2\u086b\u086c\3"+
		"\2\2\2\u086c\u086e\5\u0120\u0091\2\u086d\u086a\3\2\2\2\u086d\u086e\3\2"+
		"\2\2\u086e\u0091\3\2\2\2\u086f\u0870\7\u0085\2\2\u0870\u0872\7\u0117\2"+
		"\2\u0871\u0873\7\u00ac\2\2\u0872\u0871\3\2\2\2\u0872\u0873\3\2\2\2\u0873"+
		"\u0874\3\2\2\2\u0874\u0875\5\u011a\u008e\2\u0875\u087e\7\4\2\2\u0876\u087b"+
		"\5\u00d0i\2\u0877\u0878\7\6\2\2\u0878\u087a\5\u00d0i\2\u0879\u0877\3\2"+
		"\2\2\u087a\u087d\3\2\2\2\u087b\u0879\3\2\2\2\u087b\u087c\3\2\2\2\u087c"+
		"\u087f\3\2\2\2\u087d\u087b\3\2\2\2\u087e\u0876\3\2\2\2\u087e\u087f\3\2"+
		"\2\2\u087f\u0880\3\2\2\2\u0880\u0881\7\5\2\2\u0881\u088d\5\u0120\u0091"+
		"\2\u0882\u0884\7\24\2\2\u0883\u0882\3\2\2\2\u0883\u0884\3\2\2\2\u0884"+
		"\u0885\3\2\2\2\u0885\u088a\5\u0120\u0091\2\u0886\u0887\7\6\2\2\u0887\u0889"+
		"\5\u0120\u0091\2\u0888\u0886\3\2\2\2\u0889\u088c\3\2\2\2\u088a\u0888\3"+
		"\2\2\2\u088a\u088b\3\2\2\2\u088b\u088e\3\2\2\2\u088c\u088a\3\2\2\2\u088d"+
		"\u0883\3\2\2\2\u088d\u088e\3\2\2\2\u088e\u0093\3\2\2\2\u088f\u0890\t\31"+
		"\2\2\u0890\u0095\3\2\2\2\u0891\u0893\7\u0085\2\2\u0892\u0891\3\2\2\2\u0892"+
		"\u0893\3\2\2\2\u0893\u0894\3\2\2\2\u0894\u0898\5\u00aeX\2\u0895\u0897"+
		"\5\u0098M\2\u0896\u0895\3\2\2\2\u0897\u089a\3\2\2\2\u0898\u0896\3\2\2"+
		"\2\u0898\u0899\3\2\2\2\u0899\u0097\3\2\2\2\u089a\u0898\3\2\2\2\u089b\u089c"+
		"\5\u009aN\2\u089c\u089e\7\u0082\2\2\u089d\u089f\7\u0085\2\2\u089e\u089d"+
		"\3\2\2\2\u089e\u089f\3\2\2\2\u089f\u08a0\3\2\2\2\u08a0\u08a2\5\u00aeX"+
		"\2\u08a1\u08a3\5\u009cO\2\u08a2\u08a1\3\2\2\2\u08a2\u08a3\3\2\2\2\u08a3"+
		"\u08ad\3\2\2\2\u08a4\u08a5\7\u009f\2\2\u08a5\u08a6\5\u009aN\2\u08a6\u08a8"+
		"\7\u0082\2\2\u08a7\u08a9\7\u0085\2\2\u08a8\u08a7\3\2\2\2\u08a8\u08a9\3"+
		"\2\2\2\u08a9\u08aa\3\2\2\2\u08aa\u08ab\5\u00aeX\2\u08ab\u08ad\3\2\2\2"+
		"\u08ac\u089b\3\2\2\2\u08ac\u08a4\3\2\2\2\u08ad\u0099\3\2\2\2\u08ae\u08b0"+
		"\7y\2\2\u08af\u08ae\3\2\2\2\u08af\u08b0\3\2\2\2\u08b0\u08c7\3\2\2\2\u08b1"+
		"\u08c7\7\66\2\2\u08b2\u08b4\7\u0088\2\2\u08b3\u08b5\7\u00ac\2\2\u08b4"+
		"\u08b3\3\2\2\2\u08b4\u08b5\3\2\2\2\u08b5\u08c7\3\2\2\2\u08b6\u08b8\7\u0088"+
		"\2\2\u08b7\u08b6\3\2\2\2\u08b7\u08b8\3\2\2\2\u08b8\u08b9\3\2\2\2\u08b9"+
		"\u08c7\7\u00dc\2\2\u08ba\u08bc\7\u00d0\2\2\u08bb\u08bd\7\u00ac\2\2\u08bc"+
		"\u08bb\3\2\2\2\u08bc\u08bd\3\2\2\2\u08bd\u08c7\3\2\2\2\u08be\u08c0\7j"+
		"\2\2\u08bf\u08c1\7\u00ac\2\2\u08c0\u08bf\3\2\2\2\u08c0\u08c1\3\2\2\2\u08c1"+
		"\u08c7\3\2\2\2\u08c2\u08c4\7\u0088\2\2\u08c3\u08c2\3\2\2\2\u08c3\u08c4"+
		"\3\2\2\2\u08c4\u08c5\3\2\2\2\u08c5\u08c7\7\20\2\2\u08c6\u08af\3\2\2\2"+
		"\u08c6\u08b1\3\2\2\2\u08c6\u08b2\3\2\2\2\u08c6\u08b7\3\2\2\2\u08c6\u08ba"+
		"\3\2\2\2\u08c6\u08be\3\2\2\2\u08c6\u08c3\3\2\2\2\u08c7\u009b\3\2\2\2\u08c8"+
		"\u08c9\7\u00a5\2\2\u08c9\u08cd\5\u00d4k\2\u08ca\u08cb\7\u0114\2\2\u08cb"+
		"\u08cd\5\u00a2R\2\u08cc\u08c8\3\2\2\2\u08cc\u08ca\3\2\2\2\u08cd\u009d"+
		"\3\2\2\2\u08ce\u08cf\7\u00f5\2\2\u08cf\u08d1\7\4\2\2\u08d0\u08d2\5\u00a0"+
		"Q\2\u08d1\u08d0\3\2\2\2\u08d1\u08d2\3\2\2\2\u08d2\u08d3\3\2\2\2\u08d3"+
		"\u08d8\7\5\2\2\u08d4\u08d5\7\u00ca\2\2\u08d5\u08d6\7\4\2\2\u08d6\u08d7"+
		"\7\u013b\2\2\u08d7\u08d9\7\5\2\2\u08d8\u08d4\3\2\2\2\u08d8\u08d9\3\2\2"+
		"\2\u08d9\u009f\3\2\2\2\u08da\u08dc\7\u012a\2\2\u08db\u08da\3\2\2\2\u08db"+
		"\u08dc\3\2\2\2\u08dc\u08dd\3\2\2\2\u08dd\u08de\t\32\2\2\u08de\u08f3\7"+
		"\u00b6\2\2\u08df\u08e0\5\u00d0i\2\u08e0\u08e1\7\u00d7\2\2\u08e1\u08f3"+
		"\3\2\2\2\u08e2\u08e3\7\32\2\2\u08e3\u08e4\7\u013b\2\2\u08e4\u08e5\7\u00ab"+
		"\2\2\u08e5\u08e6\7\u00a4\2\2\u08e6\u08ef\7\u013b\2\2\u08e7\u08ed\7\u00a5"+
		"\2\2\u08e8\u08ee\5\u0120\u0091\2\u08e9\u08ea\5\u011a\u008e\2\u08ea\u08eb"+
		"\7\4\2\2\u08eb\u08ec\7\5\2\2\u08ec\u08ee\3\2\2\2\u08ed\u08e8\3\2\2\2\u08ed"+
		"\u08e9\3\2\2\2\u08ee\u08f0\3\2\2\2\u08ef\u08e7\3\2\2\2\u08ef\u08f0\3\2"+
		"\2\2\u08f0\u08f3\3\2\2\2\u08f1\u08f3\5\u00d0i\2\u08f2\u08db\3\2\2\2\u08f2"+
		"\u08df\3\2\2\2\u08f2\u08e2\3\2\2\2\u08f2\u08f1\3\2\2\2\u08f3\u00a1\3\2"+
		"\2\2\u08f4\u08f5\7\4\2\2\u08f5\u08f6\5\u00a4S\2\u08f6\u08f7\7\5\2\2\u08f7"+
		"\u00a3\3\2\2\2\u08f8\u08fd\5\u011c\u008f\2\u08f9\u08fa\7\6\2\2\u08fa\u08fc"+
		"\5\u011c\u008f\2\u08fb\u08f9\3\2\2\2\u08fc\u08ff\3\2\2\2\u08fd\u08fb\3"+
		"\2\2\2\u08fd\u08fe\3\2\2\2\u08fe\u00a5\3\2\2\2\u08ff\u08fd\3\2\2\2\u0900"+
		"\u0901\7\4\2\2\u0901\u0906\5\u00a8U\2\u0902\u0903\7\6\2\2\u0903\u0905"+
		"\5\u00a8U\2\u0904\u0902\3\2\2\2\u0905\u0908\3\2\2\2\u0906\u0904\3\2\2"+
		"\2\u0906\u0907\3\2\2\2\u0907\u0909\3\2\2\2\u0908\u0906\3\2\2\2\u0909\u090a"+
		"\7\5\2\2\u090a\u00a7\3\2\2\2\u090b\u090d\5\u011c\u008f\2\u090c\u090e\t"+
		"\23\2\2\u090d\u090c\3\2\2\2\u090d\u090e\3\2\2\2\u090e\u00a9\3\2\2\2\u090f"+
		"\u0910\7\4\2\2\u0910\u0915\5\u00acW\2\u0911\u0912\7\6\2\2\u0912\u0914"+
		"\5\u00acW\2\u0913\u0911\3\2\2\2\u0914\u0917\3\2\2\2\u0915\u0913\3\2\2"+
		"\2\u0915\u0916\3\2\2\2\u0916\u0918\3\2\2\2\u0917\u0915\3\2\2\2\u0918\u0919"+
		"\7\5\2\2\u0919\u00ab\3\2\2\2\u091a\u091c\5\u0120\u0091\2\u091b\u091d\5"+
		"\"\22\2\u091c\u091b\3\2\2\2\u091c\u091d\3\2\2\2\u091d\u00ad\3\2\2\2\u091e"+
		"\u0920\5\u00ba^\2\u091f\u0921\5\u0080A\2\u0920\u091f\3\2\2\2\u0920\u0921"+
		"\3\2\2\2\u0921\u0923\3\2\2\2\u0922\u0924\5\u009eP\2\u0923\u0922\3\2\2"+
		"\2\u0923\u0924\3\2\2\2\u0924\u0925\3\2\2\2\u0925\u0926\5\u00b4[\2\u0926"+
		"\u093a\3\2\2\2\u0927\u0928\7\4\2\2\u0928\u0929\5$\23\2\u0929\u092b\7\5"+
		"\2\2\u092a\u092c\5\u009eP\2\u092b\u092a\3\2\2\2\u092b\u092c\3\2\2\2\u092c"+
		"\u092d\3\2\2\2\u092d\u092e\5\u00b4[\2\u092e\u093a\3\2\2\2\u092f\u0930"+
		"\7\4\2\2\u0930\u0931\5\u0096L\2\u0931\u0933\7\5\2\2\u0932\u0934\5\u009e"+
		"P\2\u0933\u0932\3\2\2\2\u0933\u0934\3\2\2\2\u0934\u0935\3\2\2\2\u0935"+
		"\u0936\5\u00b4[\2\u0936\u093a\3\2\2\2\u0937\u093a\5\u00b0Y\2\u0938\u093a"+
		"\5\u00b2Z\2\u0939\u091e\3\2\2\2\u0939\u0927\3\2\2\2\u0939\u092f\3\2\2"+
		"\2\u0939\u0937\3\2\2\2\u0939\u0938\3\2\2\2\u093a\u00af\3\2\2\2\u093b\u093c"+
		"\7\u0115\2\2\u093c\u0941\5\u00d0i\2\u093d\u093e\7\6\2\2\u093e\u0940\5"+
		"\u00d0i\2\u093f\u093d\3\2\2\2\u0940\u0943\3\2\2\2\u0941\u093f\3\2\2\2"+
		"\u0941\u0942\3\2\2\2\u0942\u0944\3\2\2\2\u0943\u0941\3\2\2\2\u0944\u0945"+
		"\5\u00b4[\2\u0945\u00b1\3\2\2\2\u0946\u0947\5\u0118\u008d\2\u0947\u0950"+
		"\7\4\2\2\u0948\u094d\5\u00d0i\2\u0949\u094a\7\6\2\2\u094a\u094c\5\u00d0"+
		"i\2\u094b\u0949\3\2\2\2\u094c\u094f\3\2\2\2\u094d\u094b\3\2\2\2\u094d"+
		"\u094e\3\2\2\2\u094e\u0951\3\2\2\2\u094f\u094d\3\2\2\2\u0950\u0948\3\2"+
		"\2\2\u0950\u0951\3\2\2\2\u0951\u0952\3\2\2\2\u0952\u0953\7\5\2\2\u0953"+
		"\u0954\5\u00b4[\2\u0954\u00b3\3\2\2\2\u0955\u0957\7\24\2\2\u0956\u0955"+
		"\3\2\2\2\u0956\u0957\3\2\2\2\u0957\u0958\3\2\2\2\u0958\u095a\5\u0122\u0092"+
		"\2\u0959\u095b\5\u00a2R\2\u095a\u0959\3\2\2\2\u095a\u095b\3\2\2\2\u095b"+
		"\u095d\3\2\2\2\u095c\u0956\3\2\2\2\u095c\u095d\3\2\2\2\u095d\u00b5\3\2"+
		"\2\2\u095e\u095f\7\u00d6\2\2\u095f\u0960\7g\2\2\u0960\u0961\7\u00de\2"+
		"\2\u0961\u0965\7\u0137\2\2\u0962\u0963\7\u011d\2\2\u0963\u0964\7\u00df"+
		"\2\2\u0964\u0966\5> \2\u0965\u0962\3\2\2\2\u0965\u0966\3\2\2\2\u0966\u0990"+
		"\3\2\2\2\u0967\u0968\7\u00d6\2\2\u0968\u0969\7g\2\2\u0969\u0973\7H\2\2"+
		"\u096a\u096b\7`\2\2\u096b\u096c\7\u00f8\2\2\u096c\u096d\7\34\2\2\u096d"+
		"\u0971\7\u0137\2\2\u096e\u096f\7U\2\2\u096f\u0970\7\34\2\2\u0970\u0972"+
		"\7\u0137\2\2\u0971\u096e\3\2\2\2\u0971\u0972\3\2\2\2\u0972\u0974\3\2\2"+
		"\2\u0973\u096a\3\2\2\2\u0973\u0974\3\2\2\2\u0974\u097a\3\2\2\2\u0975\u0976"+
		"\7*\2\2\u0976\u0977\7\u0081\2\2\u0977\u0978\7\u00f8\2\2\u0978\u0979\7"+
		"\34\2\2\u0979\u097b\7\u0137\2\2\u097a\u0975\3\2\2\2\u097a\u097b\3\2\2"+
		"\2\u097b\u0981\3\2\2\2\u097c\u097d\7\u0095\2\2\u097d\u097e\7\u0083\2\2"+
		"\u097e\u097f\7\u00f8\2\2\u097f\u0980\7\34\2\2\u0980\u0982\7\u0137\2\2"+
		"\u0981\u097c\3\2\2\2\u0981\u0982\3\2\2\2\u0982\u0987\3\2\2\2\u0983\u0984"+
		"\7\u008c\2\2\u0984\u0985\7\u00f8\2\2\u0985\u0986\7\34\2\2\u0986\u0988"+
		"\7\u0137\2\2\u0987\u0983\3\2\2\2\u0987\u0988\3\2\2\2\u0988\u098d\3\2\2"+
		"\2\u0989\u098a\7\u00a2\2\2\u098a\u098b\7F\2\2\u098b\u098c\7\24\2\2\u098c"+
		"\u098e\7\u0137\2\2\u098d\u0989\3\2\2\2\u098d\u098e\3\2\2\2\u098e\u0990"+
		"\3\2\2\2\u098f\u095e\3\2\2\2\u098f\u0967\3\2\2\2\u0990\u00b7\3\2\2\2\u0991"+
		"\u0996\5\u00ba^\2\u0992\u0993\7\6\2\2\u0993\u0995\5\u00ba^\2\u0994\u0992"+
		"\3\2\2\2\u0995\u0998\3\2\2\2\u0996\u0994\3\2\2\2\u0996\u0997\3\2\2\2\u0997"+
		"\u00b9\3\2\2\2\u0998\u0996\3\2\2\2\u0999\u099e\5\u011c\u008f\2\u099a\u099b"+
		"\7\7\2\2\u099b\u099d\5\u011c\u008f\2\u099c\u099a\3\2\2\2\u099d\u09a0\3"+
		"\2\2\2\u099e\u099c\3\2\2\2\u099e\u099f\3\2\2\2\u099f\u00bb\3\2\2\2\u09a0"+
		"\u099e\3\2\2\2\u09a1\u09a6\5\u00be`\2\u09a2\u09a3\7\6\2\2\u09a3\u09a5"+
		"\5\u00be`\2\u09a4\u09a2\3\2\2\2\u09a5\u09a8\3\2\2\2\u09a6\u09a4\3\2\2"+
		"\2\u09a6\u09a7\3\2\2\2\u09a7\u00bd\3\2\2\2\u09a8\u09a6\3\2\2\2\u09a9\u09ac"+
		"\5\u00ba^\2\u09aa\u09ab\7\u00a8\2\2\u09ab\u09ad\5> \2\u09ac\u09aa\3\2"+
		"\2\2\u09ac\u09ad\3\2\2\2\u09ad\u00bf\3\2\2\2\u09ae\u09af\5\u011c\u008f"+
		"\2\u09af\u09b0\7\7\2\2\u09b0\u09b2\3\2\2\2\u09b1\u09ae\3\2\2\2\u09b1\u09b2"+
		"\3\2\2\2\u09b2\u09b3\3\2\2\2\u09b3\u09b4\5\u011c\u008f\2\u09b4\u00c1\3"+
		"\2\2\2\u09b5\u09b6\5\u011c\u008f\2\u09b6\u09b7\7\7\2\2\u09b7\u09b9\3\2"+
		"\2\2\u09b8\u09b5\3\2\2\2\u09b8\u09b9\3\2\2\2\u09b9\u09ba\3\2\2\2\u09ba"+
		"\u09bb\5\u011c\u008f\2\u09bb\u00c3\3\2\2\2\u09bc\u09c4\5\u00d0i\2\u09bd"+
		"\u09bf\7\24\2\2\u09be\u09bd\3\2\2\2\u09be\u09bf\3\2\2\2\u09bf\u09c2\3"+
		"\2\2\2\u09c0\u09c3\5\u011c\u008f\2\u09c1\u09c3\5\u00a2R\2\u09c2\u09c0"+
		"\3\2\2\2\u09c2\u09c1\3\2\2\2\u09c3\u09c5\3\2\2\2\u09c4\u09be\3\2\2\2\u09c4"+
		"\u09c5\3\2\2\2\u09c5\u00c5\3\2\2\2\u09c6\u09cb\5\u00c4c\2\u09c7\u09c8"+
		"\7\6\2\2\u09c8\u09ca\5\u00c4c\2\u09c9\u09c7\3\2\2\2\u09ca\u09cd\3\2\2"+
		"\2\u09cb\u09c9\3\2\2\2\u09cb\u09cc\3\2\2\2\u09cc\u00c7\3\2\2\2\u09cd\u09cb"+
		"\3\2\2\2\u09ce\u09cf\7\4\2\2\u09cf\u09d4\5\u00caf\2\u09d0\u09d1\7\6\2"+
		"\2\u09d1\u09d3\5\u00caf\2\u09d2\u09d0\3\2\2\2\u09d3\u09d6\3\2\2\2\u09d4"+
		"\u09d2\3\2\2\2\u09d4\u09d5\3\2\2\2\u09d5\u09d7\3\2\2\2\u09d6\u09d4\3\2"+
		"\2\2\u09d7\u09d8\7\5\2\2\u09d8\u00c9\3\2\2\2\u09d9\u09dc\5\u00ccg\2\u09da"+
		"\u09dc\5\u0100\u0081\2\u09db\u09d9\3\2\2\2\u09db\u09da\3\2\2\2\u09dc\u00cb"+
		"\3\2\2\2\u09dd\u09eb\5\u011a\u008e\2\u09de\u09df\5\u0120\u0091\2\u09df"+
		"\u09e0\7\4\2\2\u09e0\u09e5\5\u00ceh\2\u09e1\u09e2\7\6\2\2\u09e2\u09e4"+
		"\5\u00ceh\2\u09e3\u09e1\3\2\2\2\u09e4\u09e7\3\2\2\2\u09e5\u09e3\3\2\2"+
		"\2\u09e5\u09e6\3\2\2\2\u09e6\u09e8\3\2\2\2\u09e7\u09e5\3\2\2\2\u09e8\u09e9"+
		"\7\5\2\2\u09e9\u09eb\3\2\2\2\u09ea\u09dd\3\2\2\2\u09ea\u09de\3\2\2\2\u09eb"+
		"\u00cd\3\2\2\2\u09ec\u09ef\5\u011a\u008e\2\u09ed\u09ef\5\u00dep\2\u09ee"+
		"\u09ec\3\2\2\2\u09ee\u09ed\3\2\2\2\u09ef\u00cf\3\2\2\2\u09f0\u09f1\5\u00d4"+
		"k\2\u09f1\u00d1\3\2\2\2\u09f2\u09f7\5\u00d0i\2\u09f3\u09f4\7\6\2\2\u09f4"+
		"\u09f6\5\u00d0i\2\u09f5\u09f3\3\2\2\2\u09f6\u09f9\3\2\2\2\u09f7\u09f5"+
		"\3\2\2\2\u09f7\u09f8\3\2\2\2\u09f8\u00d3\3\2\2\2\u09f9\u09f7\3\2\2\2\u09fa"+
		"\u09fb\bk\1\2\u09fb\u09fc\7\u00a1\2\2\u09fc\u0a07\5\u00d4k\7\u09fd\u09fe"+
		"\7X\2\2\u09fe\u09ff\7\4\2\2\u09ff\u0a00\5$\23\2\u0a00\u0a01\7\5\2\2\u0a01"+
		"\u0a07\3\2\2\2\u0a02\u0a04\5\u00d8m\2\u0a03\u0a05\5\u00d6l\2\u0a04\u0a03"+
		"\3\2\2\2\u0a04\u0a05\3\2\2\2\u0a05\u0a07\3\2\2\2\u0a06\u09fa\3\2\2\2\u0a06"+
		"\u09fd\3\2\2\2\u0a06\u0a02\3\2\2\2\u0a07\u0a10\3\2\2\2\u0a08\u0a09\f\4"+
		"\2\2\u0a09\u0a0a\7\17\2\2\u0a0a\u0a0f\5\u00d4k\5\u0a0b\u0a0c\f\3\2\2\u0a0c"+
		"\u0a0d\7\u00a9\2\2\u0a0d\u0a0f\5\u00d4k\4\u0a0e\u0a08\3\2\2\2\u0a0e\u0a0b"+
		"\3\2\2\2\u0a0f\u0a12\3\2\2\2\u0a10\u0a0e\3\2\2\2\u0a10\u0a11\3\2\2\2\u0a11"+
		"\u00d5\3\2\2\2\u0a12\u0a10\3\2\2\2\u0a13\u0a15\7\u00a1\2\2\u0a14\u0a13"+
		"\3\2\2\2\u0a14\u0a15\3\2\2\2\u0a15\u0a16\3\2\2\2\u0a16\u0a17\7\30\2\2"+
		"\u0a17\u0a18\5\u00d8m\2\u0a18\u0a19\7\17\2\2\u0a19\u0a1a\5\u00d8m\2\u0a1a"+
		"\u0a66\3\2\2\2\u0a1b\u0a1d\7\u00a1\2\2\u0a1c\u0a1b\3\2\2\2\u0a1c\u0a1d"+
		"\3\2\2\2\u0a1d\u0a1e\3\2\2\2\u0a1e\u0a1f\7v\2\2\u0a1f\u0a20\7\4\2\2\u0a20"+
		"\u0a25\5\u00d0i\2\u0a21\u0a22\7\6\2\2\u0a22\u0a24\5\u00d0i\2\u0a23\u0a21"+
		"\3\2\2\2\u0a24\u0a27\3\2\2\2\u0a25\u0a23\3\2\2\2\u0a25\u0a26\3\2\2\2\u0a26"+
		"\u0a28\3\2\2\2\u0a27\u0a25\3\2\2\2\u0a28\u0a29\7\5\2\2\u0a29\u0a66\3\2"+
		"\2\2\u0a2a\u0a2c\7\u00a1\2\2\u0a2b\u0a2a\3\2\2\2\u0a2b\u0a2c\3\2\2\2\u0a2c"+
		"\u0a2d\3\2\2\2\u0a2d\u0a2e\7v\2\2\u0a2e\u0a2f\7\4\2\2\u0a2f\u0a30\5$\23"+
		"\2\u0a30\u0a31\7\5\2\2\u0a31\u0a66\3\2\2\2\u0a32\u0a34\7\u00a1\2\2\u0a33"+
		"\u0a32\3\2\2\2\u0a33\u0a34\3\2\2\2\u0a34\u0a35\3\2\2\2\u0a35\u0a36\7\u00d1"+
		"\2\2\u0a36\u0a66\5\u00d8m\2\u0a37\u0a39\7\u00a1\2\2\u0a38\u0a37\3\2\2"+
		"\2\u0a38\u0a39\3\2\2\2\u0a39\u0a3a\3\2\2\2\u0a3a\u0a3b\t\33\2\2\u0a3b"+
		"\u0a49\t\34\2\2\u0a3c\u0a3d\7\4\2\2\u0a3d\u0a4a\7\5\2\2\u0a3e\u0a3f\7"+
		"\4\2\2\u0a3f\u0a44\5\u00d0i\2\u0a40\u0a41\7\6\2\2\u0a41\u0a43\5\u00d0"+
		"i\2\u0a42\u0a40\3\2\2\2\u0a43\u0a46\3\2\2\2\u0a44\u0a42\3\2\2\2\u0a44"+
		"\u0a45\3\2\2\2\u0a45\u0a47\3\2\2\2\u0a46\u0a44\3\2\2\2\u0a47\u0a48\7\5"+
		"\2\2\u0a48\u0a4a\3\2\2\2\u0a49\u0a3c\3\2\2\2\u0a49\u0a3e\3\2\2\2\u0a4a"+
		"\u0a66\3\2\2\2\u0a4b\u0a4d\7\u00a1\2\2\u0a4c\u0a4b\3\2\2\2\u0a4c\u0a4d"+
		"\3\2\2\2\u0a4d\u0a4e\3\2\2\2\u0a4e\u0a4f\t\33\2\2\u0a4f\u0a52\5\u00d8"+
		"m\2\u0a50\u0a51\7T\2\2\u0a51\u0a53\7\u0137\2\2\u0a52\u0a50\3\2\2\2\u0a52"+
		"\u0a53\3\2\2\2\u0a53\u0a66\3\2\2\2\u0a54\u0a56\7\u0080\2\2\u0a55\u0a57"+
		"\7\u00a1\2\2\u0a56\u0a55\3\2\2\2\u0a56\u0a57\3\2\2\2\u0a57\u0a58\3\2\2"+
		"\2\u0a58\u0a66\7\u00a2\2\2\u0a59\u0a5b\7\u0080\2\2\u0a5a\u0a5c\7\u00a1"+
		"\2\2\u0a5b\u0a5a\3\2\2\2\u0a5b\u0a5c\3\2\2\2\u0a5c\u0a5d\3\2\2\2\u0a5d"+
		"\u0a66\t\35\2\2\u0a5e\u0a60\7\u0080\2\2\u0a5f\u0a61\7\u00a1\2\2\u0a60"+
		"\u0a5f\3\2\2\2\u0a60\u0a61\3\2\2\2\u0a61\u0a62\3\2\2\2\u0a62\u0a63\7N"+
		"\2\2\u0a63\u0a64\7i\2\2\u0a64\u0a66\5\u00d8m\2\u0a65\u0a14\3\2\2\2\u0a65"+
		"\u0a1c\3\2\2\2\u0a65\u0a2b\3\2\2\2\u0a65\u0a33\3\2\2\2\u0a65\u0a38\3\2"+
		"\2\2\u0a65\u0a4c\3\2\2\2\u0a65\u0a54\3\2\2\2\u0a65\u0a59\3\2\2\2\u0a65"+
		"\u0a5e\3\2\2\2\u0a66\u00d7\3\2\2\2\u0a67\u0a68\bm\1\2\u0a68\u0a6c\5\u00dc"+
		"o\2\u0a69\u0a6a\t\36\2\2\u0a6a\u0a6c\5\u00d8m\t\u0a6b\u0a67\3\2\2\2\u0a6b"+
		"\u0a69\3\2\2\2\u0a6c\u0a82\3\2\2\2\u0a6d\u0a6e\f\b\2\2\u0a6e\u0a6f\t\37"+
		"\2\2\u0a6f\u0a81\5\u00d8m\t\u0a70\u0a71\f\7\2\2\u0a71\u0a72\t \2\2\u0a72"+
		"\u0a81\5\u00d8m\b\u0a73\u0a74\f\6\2\2\u0a74\u0a75\7\u012f\2\2\u0a75\u0a81"+
		"\5\u00d8m\7\u0a76\u0a77\f\5\2\2\u0a77\u0a78\7\u0132\2\2\u0a78\u0a81\5"+
		"\u00d8m\6\u0a79\u0a7a\f\4\2\2\u0a7a\u0a7b\7\u0130\2\2\u0a7b\u0a81\5\u00d8"+
		"m\5\u0a7c\u0a7d\f\3\2\2\u0a7d\u0a7e\5\u00e0q\2\u0a7e\u0a7f\5\u00d8m\4"+
		"\u0a7f\u0a81\3\2\2\2\u0a80\u0a6d\3\2\2\2\u0a80\u0a70\3\2\2\2\u0a80\u0a73"+
		"\3\2\2\2\u0a80\u0a76\3\2\2\2\u0a80\u0a79\3\2\2\2\u0a80\u0a7c\3\2\2\2\u0a81"+
		"\u0a84\3\2\2\2\u0a82\u0a80\3\2\2\2\u0a82\u0a83\3\2\2\2\u0a83\u00d9\3\2"+
		"\2\2\u0a84\u0a82\3\2\2\2\u0a85\u0a86\t!\2\2\u0a86\u00db\3\2\2\2\u0a87"+
		"\u0a88\bo\1\2\u0a88\u0b65\t\"\2\2\u0a89\u0a8a\t#\2\2\u0a8a\u0a8b\7\4\2"+
		"\2\u0a8b\u0a8c\5\u00dan\2\u0a8c\u0a8d\7\6\2\2\u0a8d\u0a8e\5\u00d8m\2\u0a8e"+
		"\u0a8f\7\6\2\2\u0a8f\u0a90\5\u00d8m\2\u0a90\u0a91\7\5\2\2\u0a91\u0b65"+
		"\3\2\2\2\u0a92\u0a93\t$\2\2\u0a93\u0a94\7\4\2\2\u0a94\u0a95\5\u00dan\2"+
		"\u0a95\u0a96\7\6\2\2\u0a96\u0a97\5\u00d8m\2\u0a97\u0a98\7\6\2\2\u0a98"+
		"\u0a99\5\u00d8m\2\u0a99\u0a9a\7\5\2\2\u0a9a\u0b65\3\2\2\2\u0a9b\u0a9d"+
		"\7\37\2\2\u0a9c\u0a9e\5\u010a\u0086\2\u0a9d\u0a9c\3\2\2\2\u0a9e\u0a9f"+
		"\3\2\2\2\u0a9f\u0a9d\3\2\2\2\u0a9f\u0aa0\3\2\2\2\u0aa0\u0aa3\3\2\2\2\u0aa1"+
		"\u0aa2\7R\2\2\u0aa2\u0aa4\5\u00d0i\2\u0aa3\u0aa1\3\2\2\2\u0aa3\u0aa4\3"+
		"\2\2\2\u0aa4\u0aa5\3\2\2\2\u0aa5\u0aa6\7S\2\2\u0aa6\u0b65\3\2\2\2\u0aa7"+
		"\u0aa8\7\37\2\2\u0aa8\u0aaa\5\u00d0i\2\u0aa9\u0aab\5\u010a\u0086\2\u0aaa"+
		"\u0aa9\3\2\2\2\u0aab\u0aac\3\2\2\2\u0aac\u0aaa\3\2\2\2\u0aac\u0aad\3\2"+
		"\2\2\u0aad\u0ab0\3\2\2\2\u0aae\u0aaf\7R\2\2\u0aaf\u0ab1\5\u00d0i\2\u0ab0"+
		"\u0aae\3\2\2\2\u0ab0\u0ab1\3\2\2\2\u0ab1\u0ab2\3\2\2\2\u0ab2\u0ab3\7S"+
		"\2\2\u0ab3\u0b65\3\2\2\2\u0ab4\u0ab5\t%\2\2\u0ab5\u0ab6\7\4\2\2\u0ab6"+
		"\u0ab7\5\u00d0i\2\u0ab7\u0ab8\7\24\2\2\u0ab8\u0ab9\5\u00f6|\2\u0ab9\u0aba"+
		"\7\5\2\2\u0aba\u0b65\3\2\2\2\u0abb\u0abc\7\u00ed\2\2\u0abc\u0ac5\7\4\2"+
		"\2\u0abd\u0ac2\5\u00c4c\2\u0abe\u0abf\7\6\2\2\u0abf\u0ac1\5\u00c4c\2\u0ac0"+
		"\u0abe\3\2\2\2\u0ac1\u0ac4\3\2\2\2\u0ac2\u0ac0\3\2\2\2\u0ac2\u0ac3\3\2"+
		"\2\2\u0ac3\u0ac6\3\2\2\2\u0ac4\u0ac2\3\2\2\2\u0ac5\u0abd\3\2\2\2\u0ac5"+
		"\u0ac6\3\2\2\2\u0ac6\u0ac7\3\2\2\2\u0ac7\u0b65\7\5\2\2\u0ac8\u0ac9\7c"+
		"\2\2\u0ac9\u0aca\7\4\2\2\u0aca\u0acd\5\u00d0i\2\u0acb\u0acc\7t\2\2\u0acc"+
		"\u0ace\7\u00a3\2\2\u0acd\u0acb\3\2\2\2\u0acd\u0ace\3\2\2\2\u0ace\u0acf"+
		"\3\2\2\2\u0acf\u0ad0\7\5\2\2\u0ad0\u0b65\3\2\2\2\u0ad1\u0ad2\7\u0084\2"+
		"\2\u0ad2\u0ad3\7\4\2\2\u0ad3\u0ad6\5\u00d0i\2\u0ad4\u0ad5\7t\2\2\u0ad5"+
		"\u0ad7\7\u00a3\2\2\u0ad6\u0ad4\3\2\2\2\u0ad6\u0ad7\3\2\2\2\u0ad7\u0ad8"+
		"\3\2\2\2\u0ad8\u0ad9\7\5\2\2\u0ad9\u0b65\3\2\2\2\u0ada\u0adb\7\u00b9\2"+
		"\2\u0adb\u0adc\7\4\2\2\u0adc\u0add\5\u00d8m\2\u0add\u0ade\7v\2\2\u0ade"+
		"\u0adf\5\u00d8m\2\u0adf\u0ae0\7\5\2\2\u0ae0\u0b65\3\2\2\2\u0ae1\u0b65"+
		"\5\u00dep\2\u0ae2\u0b65\7\u012b\2\2\u0ae3\u0ae4\5\u011a\u008e\2\u0ae4"+
		"\u0ae5\7\7\2\2\u0ae5\u0ae6\7\u012b\2\2\u0ae6\u0b65\3\2\2\2\u0ae7\u0ae8"+
		"\7\4\2\2\u0ae8\u0aeb\5\u00c4c\2\u0ae9\u0aea\7\6\2\2\u0aea\u0aec\5\u00c4"+
		"c\2\u0aeb\u0ae9\3\2\2\2\u0aec\u0aed\3\2\2\2\u0aed\u0aeb\3\2\2\2\u0aed"+
		"\u0aee\3\2\2\2\u0aee\u0aef\3\2\2\2\u0aef\u0af0\7\5\2\2\u0af0\u0b65\3\2"+
		"\2\2\u0af1\u0af2\7\4\2\2\u0af2\u0af3\5$\23\2\u0af3\u0af4\7\5\2\2\u0af4"+
		"\u0b65\3\2\2\2\u0af5\u0af6\5\u0118\u008d\2\u0af6\u0b02\7\4\2\2\u0af7\u0af9"+
		"\5\u0094K\2\u0af8\u0af7\3\2\2\2\u0af8\u0af9\3\2\2\2\u0af9\u0afa\3\2\2"+
		"\2\u0afa\u0aff\5\u00d0i\2\u0afb\u0afc\7\6\2\2\u0afc\u0afe\5\u00d0i\2\u0afd"+
		"\u0afb\3\2\2\2\u0afe\u0b01\3\2\2\2\u0aff\u0afd\3\2\2\2\u0aff\u0b00\3\2"+
		"\2\2\u0b00\u0b03\3\2\2\2\u0b01\u0aff\3\2\2\2\u0b02\u0af8\3\2\2\2\u0b02"+
		"\u0b03\3\2\2\2\u0b03\u0b04\3\2\2\2\u0b04\u0b0b\7\5\2\2\u0b05\u0b06\7a"+
		"\2\2\u0b06\u0b07\7\4\2\2\u0b07\u0b08\7\u011b\2\2\u0b08\u0b09\5\u00d4k"+
		"\2\u0b09\u0b0a\7\5\2\2\u0b0a\u0b0c\3\2\2\2\u0b0b\u0b05\3\2\2\2\u0b0b\u0b0c"+
		"\3\2\2\2\u0b0c\u0b0f\3\2\2\2\u0b0d\u0b0e\t&\2\2\u0b0e\u0b10\7\u00a3\2"+
		"\2\u0b0f\u0b0d\3\2\2\2\u0b0f\u0b10\3\2\2\2\u0b10\u0b13\3\2\2\2\u0b11\u0b12"+
		"\7\u00ae\2\2\u0b12\u0b14\5\u0110\u0089\2\u0b13\u0b11\3\2\2\2\u0b13\u0b14"+
		"\3\2\2\2\u0b14\u0b65\3\2\2\2\u0b15\u0b16\5\u0120\u0091\2\u0b16\u0b17\7"+
		"\u0134\2\2\u0b17\u0b18\5\u00d0i\2\u0b18\u0b65\3\2\2\2\u0b19\u0b1a\7\4"+
		"\2\2\u0b1a\u0b1d\5\u0120\u0091\2\u0b1b\u0b1c\7\6\2\2\u0b1c\u0b1e\5\u0120"+
		"\u0091\2\u0b1d\u0b1b\3\2\2\2\u0b1e\u0b1f\3\2\2\2\u0b1f\u0b1d\3\2\2\2\u0b1f"+
		"\u0b20\3\2\2\2\u0b20\u0b21\3\2\2\2\u0b21\u0b22\7\5\2\2\u0b22\u0b23\7\u0134"+
		"\2\2\u0b23\u0b24\5\u00d0i\2\u0b24\u0b65\3\2\2\2\u0b25\u0b65\5\u0120\u0091"+
		"\2\u0b26\u0b27\7\4\2\2\u0b27\u0b28\5\u00d0i\2\u0b28\u0b29\7\5\2\2\u0b29"+
		"\u0b65\3\2\2\2\u0b2a\u0b2b\7]\2\2\u0b2b\u0b2c\7\4\2\2\u0b2c\u0b2d\5\u0120"+
		"\u0091\2\u0b2d\u0b2e\7i\2\2\u0b2e\u0b2f\5\u00d8m\2\u0b2f\u0b30\7\5\2\2"+
		"\u0b30\u0b65\3\2\2\2\u0b31\u0b32\t\'\2\2\u0b32\u0b33\7\4\2\2\u0b33\u0b34"+
		"\5\u00d8m\2\u0b34\u0b35\t(\2\2\u0b35\u0b38\5\u00d8m\2\u0b36\u0b37\t)\2"+
		"\2\u0b37\u0b39\5\u00d8m\2\u0b38\u0b36\3\2\2\2\u0b38\u0b39\3\2\2\2\u0b39"+
		"\u0b3a\3\2\2\2\u0b3a\u0b3b\7\5\2\2\u0b3b\u0b65\3\2\2\2\u0b3c\u0b3d\7\u0104"+
		"\2\2\u0b3d\u0b3f\7\4\2\2\u0b3e\u0b40\t*\2\2\u0b3f\u0b3e\3\2\2\2\u0b3f"+
		"\u0b40\3\2\2\2\u0b40\u0b42\3\2\2\2\u0b41\u0b43\5\u00d8m\2\u0b42\u0b41"+
		"\3\2\2\2\u0b42\u0b43\3\2\2\2\u0b43\u0b44\3\2\2\2\u0b44\u0b45\7i\2\2\u0b45"+
		"\u0b46\5\u00d8m\2\u0b46\u0b47\7\5\2\2\u0b47\u0b65\3\2\2\2\u0b48\u0b49"+
		"\7\u00b0\2\2\u0b49\u0b4a\7\4\2\2\u0b4a\u0b4b\5\u00d8m\2\u0b4b\u0b4c\7"+
		"\u00b8\2\2\u0b4c\u0b4d\5\u00d8m\2\u0b4d\u0b4e\7i\2\2\u0b4e\u0b51\5\u00d8"+
		"m\2\u0b4f\u0b50\7e\2\2\u0b50\u0b52\5\u00d8m\2\u0b51\u0b4f\3\2\2\2\u0b51"+
		"\u0b52\3\2\2\2\u0b52\u0b53\3\2\2\2\u0b53\u0b54\7\5\2\2\u0b54\u0b65\3\2"+
		"\2\2\u0b55\u0b56\7\u00b5\2\2\u0b56\u0b57\7\4\2\2\u0b57\u0b58\5\u00d8m"+
		"\2\u0b58\u0b59\7\5\2\2\u0b59\u0b5a\7\u011e\2\2\u0b5a\u0b5b\7o\2\2\u0b5b"+
		"\u0b5c\7\4\2\2\u0b5c\u0b5d\7\u00aa\2\2\u0b5d\u0b5e\7\34\2\2\u0b5e\u0b5f"+
		"\5\\/\2\u0b5f\u0b62\7\5\2\2\u0b60\u0b61\7\u00ae\2\2\u0b61\u0b63\5\u0110"+
		"\u0089\2\u0b62\u0b60\3\2\2\2\u0b62\u0b63\3\2\2\2\u0b63\u0b65\3\2\2\2\u0b64"+
		"\u0a87\3\2\2\2\u0b64\u0a89\3\2\2\2\u0b64\u0a92\3\2\2\2\u0b64\u0a9b\3\2"+
		"\2\2\u0b64\u0aa7\3\2\2\2\u0b64\u0ab4\3\2\2\2\u0b64\u0abb\3\2\2\2\u0b64"+
		"\u0ac8\3\2\2\2\u0b64\u0ad1\3\2\2\2\u0b64\u0ada\3\2\2\2\u0b64\u0ae1\3\2"+
		"\2\2\u0b64\u0ae2\3\2\2\2\u0b64\u0ae3\3\2\2\2\u0b64\u0ae7\3\2\2\2\u0b64"+
		"\u0af1\3\2\2\2\u0b64\u0af5\3\2\2\2\u0b64\u0b15\3\2\2\2\u0b64\u0b19\3\2"+
		"\2\2\u0b64\u0b25\3\2\2\2\u0b64\u0b26\3\2\2\2\u0b64\u0b2a\3\2\2\2\u0b64"+
		"\u0b31\3\2\2\2\u0b64\u0b3c\3\2\2\2\u0b64\u0b48\3\2\2\2\u0b64\u0b55\3\2"+
		"\2\2\u0b65\u0b70\3\2\2\2\u0b66\u0b67\f\13\2\2\u0b67\u0b68\7\b\2\2\u0b68"+
		"\u0b69\5\u00d8m\2\u0b69\u0b6a\7\t\2\2\u0b6a\u0b6f\3\2\2\2\u0b6b\u0b6c"+
		"\f\t\2\2\u0b6c\u0b6d\7\7\2\2\u0b6d\u0b6f\5\u0120\u0091\2\u0b6e\u0b66\3"+
		"\2\2\2\u0b6e\u0b6b\3\2\2\2\u0b6f\u0b72\3\2\2\2\u0b70\u0b6e\3\2\2\2\u0b70"+
		"\u0b71\3\2\2\2\u0b71\u00dd\3\2\2\2\u0b72\u0b70\3\2\2\2\u0b73\u0b80\7\u00a2"+
		"\2\2\u0b74\u0b80\5\u00e8u\2\u0b75\u0b76\5\u0120\u0091\2\u0b76\u0b77\7"+
		"\u0137\2\2\u0b77\u0b80\3\2\2\2\u0b78\u0b80\5\u0126\u0094\2\u0b79\u0b80"+
		"\5\u00e6t\2\u0b7a\u0b7c\7\u0137\2\2\u0b7b\u0b7a\3\2\2\2\u0b7c\u0b7d\3"+
		"\2\2\2\u0b7d\u0b7b\3\2\2\2\u0b7d\u0b7e\3\2\2\2\u0b7e\u0b80\3\2\2\2\u0b7f"+
		"\u0b73\3\2\2\2\u0b7f\u0b74\3\2\2\2\u0b7f\u0b75\3\2\2\2\u0b7f\u0b78\3\2"+
		"\2\2\u0b7f\u0b79\3\2\2\2\u0b7f\u0b7b\3\2\2\2\u0b80\u00df\3\2\2\2\u0b81"+
		"\u0b82\t+\2\2\u0b82\u00e1\3\2\2\2\u0b83\u0b84\t,\2\2\u0b84\u00e3\3\2\2"+
		"\2\u0b85\u0b86\t-\2\2\u0b86\u00e5\3\2\2\2\u0b87\u0b88\t.\2\2\u0b88\u00e7"+
		"\3\2\2\2\u0b89\u0b8c\7~\2\2\u0b8a\u0b8d\5\u00eav\2\u0b8b\u0b8d\5\u00ee"+
		"x\2\u0b8c\u0b8a\3\2\2\2\u0b8c\u0b8b\3\2\2\2\u0b8c\u0b8d\3\2\2\2\u0b8d"+
		"\u00e9\3\2\2\2\u0b8e\u0b90\5\u00ecw\2\u0b8f\u0b91\5\u00f0y\2\u0b90\u0b8f"+
		"\3\2\2\2\u0b90\u0b91\3\2\2\2\u0b91\u00eb\3\2\2\2\u0b92\u0b93\5\u00f2z"+
		"\2\u0b93\u0b94\5\u0120\u0091\2\u0b94\u0b96\3\2\2\2\u0b95\u0b92\3\2\2\2"+
		"\u0b96\u0b97\3\2\2\2\u0b97\u0b95\3\2\2\2\u0b97\u0b98\3\2\2\2\u0b98\u00ed"+
		"\3\2\2\2\u0b99\u0b9c\5\u00f0y\2\u0b9a\u0b9d\5\u00ecw\2\u0b9b\u0b9d\5\u00f0"+
		"y\2\u0b9c\u0b9a\3\2\2\2\u0b9c\u0b9b\3\2\2\2\u0b9c\u0b9d\3\2\2\2\u0b9d"+
		"\u00ef\3\2\2\2\u0b9e\u0b9f\5\u00f2z\2\u0b9f\u0ba0\5\u0120\u0091\2\u0ba0"+
		"\u0ba1\7\u00fe\2\2\u0ba1\u0ba2\5\u0120\u0091\2\u0ba2\u00f1\3\2\2\2\u0ba3"+
		"\u0ba5\t/\2\2\u0ba4\u0ba3\3\2\2\2\u0ba4\u0ba5\3\2\2\2\u0ba5\u0ba6\3\2"+
		"\2\2\u0ba6\u0ba7\t\60\2\2\u0ba7\u00f3\3\2\2\2\u0ba8\u0bac\7c\2\2\u0ba9"+
		"\u0baa\7\13\2\2\u0baa\u0bac\5\u011c\u008f\2\u0bab\u0ba8\3\2\2\2\u0bab"+
		"\u0ba9\3\2\2\2\u0bac\u00f5\3\2\2\2\u0bad\u0bae\7\23\2\2\u0bae\u0baf\7"+
		"\u0125\2\2\u0baf\u0bb0\5\u00f6|\2\u0bb0\u0bb1\7\u0127\2\2\u0bb1\u0bdc"+
		"\3\2\2\2\u0bb2\u0bb3\7\u0095\2\2\u0bb3\u0bb4\7\u0125\2\2\u0bb4\u0bb5\5"+
		"\u00f6|\2\u0bb5\u0bb6\7\6\2\2\u0bb6\u0bb7\5\u00f6|\2\u0bb7\u0bb8\7\u0127"+
		"\2\2\u0bb8\u0bdc\3\2\2\2\u0bb9\u0bc0\7\u00ed\2\2\u0bba\u0bbc\7\u0125\2"+
		"\2\u0bbb\u0bbd\5\u0106\u0084\2\u0bbc\u0bbb\3\2\2\2\u0bbc\u0bbd\3\2\2\2"+
		"\u0bbd\u0bbe\3\2\2\2\u0bbe\u0bc1\7\u0127\2\2\u0bbf\u0bc1\7\u0123\2\2\u0bc0"+
		"\u0bba\3\2\2\2\u0bc0\u0bbf\3\2\2\2\u0bc1\u0bdc\3\2\2\2\u0bc2\u0bc3\7~"+
		"\2\2\u0bc3\u0bc6\t\61\2\2\u0bc4\u0bc5\7\u00fe\2\2\u0bc5\u0bc7\7\u009b"+
		"\2\2\u0bc6\u0bc4\3\2\2\2\u0bc6\u0bc7\3\2\2\2\u0bc7\u0bdc\3\2\2\2\u0bc8"+
		"\u0bc9\7~\2\2\u0bc9\u0bcc\t\62\2\2\u0bca\u0bcb\7\u00fe\2\2\u0bcb\u0bcd"+
		"\t\63\2\2\u0bcc\u0bca\3\2\2\2\u0bcc\u0bcd\3\2\2\2\u0bcd\u0bdc\3\2\2\2"+
		"\u0bce\u0bd9\5\u0120\u0091\2\u0bcf\u0bd0\7\4\2\2\u0bd0\u0bd5\7\u013b\2"+
		"\2\u0bd1\u0bd2\7\6\2\2\u0bd2\u0bd4\7\u013b\2\2\u0bd3\u0bd1\3\2\2\2\u0bd4"+
		"\u0bd7\3\2\2\2\u0bd5\u0bd3\3\2\2\2\u0bd5\u0bd6\3\2\2\2\u0bd6\u0bd8\3\2"+
		"\2\2\u0bd7\u0bd5\3\2\2\2\u0bd8\u0bda\7\5\2\2\u0bd9\u0bcf\3\2\2\2\u0bd9"+
		"\u0bda\3\2\2\2\u0bda\u0bdc\3\2\2\2\u0bdb\u0bad\3\2\2\2\u0bdb\u0bb2\3\2"+
		"\2\2\u0bdb\u0bb9\3\2\2\2\u0bdb\u0bc2\3\2\2\2\u0bdb\u0bc8\3\2\2\2\u0bdb"+
		"\u0bce\3\2\2\2\u0bdc\u00f7\3\2\2\2\u0bdd\u0be2\5\u00fa~\2\u0bde\u0bdf"+
		"\7\6\2\2\u0bdf\u0be1\5\u00fa~\2\u0be0\u0bde\3\2\2\2\u0be1\u0be4\3\2\2"+
		"\2\u0be2\u0be0\3\2\2\2\u0be2\u0be3\3\2\2\2\u0be3\u00f9\3\2\2\2\u0be4\u0be2"+
		"\3\2\2\2\u0be5\u0be6\5\u00ba^\2\u0be6\u0be9\5\u00f6|\2\u0be7\u0be8\7\u00a1"+
		"\2\2\u0be8\u0bea\7\u00a2\2\2\u0be9\u0be7\3\2\2\2\u0be9\u0bea\3\2\2\2\u0bea"+
		"\u0bec\3\2\2\2\u0beb\u0bed\5\u00fc\177\2\u0bec\u0beb\3\2\2\2\u0bec\u0bed"+
		"\3\2\2\2\u0bed\u0bef\3\2\2\2\u0bee\u0bf0\5\"\22\2\u0bef\u0bee\3\2\2\2"+
		"\u0bef\u0bf0\3\2\2\2\u0bf0\u0bf2\3\2\2\2\u0bf1\u0bf3\5\u00f4{\2\u0bf2"+
		"\u0bf1\3\2\2\2\u0bf2\u0bf3\3\2\2\2\u0bf3\u00fb\3\2\2\2\u0bf4\u0bf5\7E"+
		"\2\2\u0bf5\u0bf6\5\u00d0i\2\u0bf6\u00fd\3\2\2\2\u0bf7\u0bfc\5\u0100\u0081"+
		"\2\u0bf8\u0bf9\7\6\2\2\u0bf9\u0bfb\5\u0100\u0081\2\u0bfa\u0bf8\3\2\2\2"+
		"\u0bfb\u0bfe\3\2\2\2\u0bfc\u0bfa\3\2\2\2\u0bfc\u0bfd\3\2\2\2\u0bfd\u00ff"+
		"\3\2\2\2\u0bfe\u0bfc\3\2\2\2\u0bff\u0c00\5\u011c\u008f\2\u0c00\u0c03\5"+
		"\u00f6|\2\u0c01\u0c02\7\u00a1\2\2\u0c02\u0c04\7\u00a2\2\2\u0c03\u0c01"+
		"\3\2\2\2\u0c03\u0c04\3\2\2\2\u0c04\u0c06\3\2\2\2\u0c05\u0c07\5\"\22\2"+
		"\u0c06\u0c05\3\2\2\2\u0c06\u0c07\3\2\2\2\u0c07\u0101\3\2\2\2\u0c08\u0c0d"+
		"\5\u0104\u0083\2\u0c09\u0c0a\7\6\2\2\u0c0a\u0c0c\5\u0104\u0083\2\u0c0b"+
		"\u0c09\3\2\2\2\u0c0c\u0c0f\3\2\2\2\u0c0d\u0c0b\3\2\2\2\u0c0d\u0c0e\3\2"+
		"\2\2\u0c0e\u0103\3\2\2\2\u0c0f\u0c0d\3\2\2\2\u0c10\u0c11\5\u011c\u008f"+
		"\2\u0c11\u0c14\5\u00f6|\2\u0c12\u0c13\7\u00a1\2\2\u0c13\u0c15\7\u00a2"+
		"\2\2\u0c14\u0c12\3\2\2\2\u0c14\u0c15\3\2\2\2\u0c15\u0c17\3\2\2\2\u0c16"+
		"\u0c18\5\u00fc\177\2\u0c17\u0c16\3\2\2\2\u0c17\u0c18\3\2\2\2\u0c18\u0c1a"+
		"\3\2\2\2\u0c19\u0c1b\5\"\22\2\u0c1a\u0c19\3\2\2\2\u0c1a\u0c1b\3\2\2\2"+
		"\u0c1b\u0105\3\2\2\2\u0c1c\u0c21\5\u0108\u0085\2\u0c1d\u0c1e\7\6\2\2\u0c1e"+
		"\u0c20\5\u0108\u0085\2\u0c1f\u0c1d\3\2\2\2\u0c20\u0c23\3\2\2\2\u0c21\u0c1f"+
		"\3\2\2\2\u0c21\u0c22\3\2\2\2\u0c22\u0107\3\2\2\2\u0c23\u0c21\3\2\2\2\u0c24"+
		"\u0c26\5\u0120\u0091\2\u0c25\u0c27\7\u0133\2\2\u0c26\u0c25\3\2\2\2\u0c26"+
		"\u0c27\3\2\2\2\u0c27\u0c28\3\2\2\2\u0c28\u0c2b\5\u00f6|\2\u0c29\u0c2a"+
		"\7\u00a1\2\2\u0c2a\u0c2c\7\u00a2\2\2\u0c2b\u0c29\3\2\2\2\u0c2b\u0c2c\3"+
		"\2\2\2\u0c2c\u0c2e\3\2\2\2\u0c2d\u0c2f\5\"\22\2\u0c2e\u0c2d\3\2\2\2\u0c2e"+
		"\u0c2f\3\2\2\2\u0c2f\u0109\3\2\2\2\u0c30\u0c31\7\u011a\2\2\u0c31\u0c32"+
		"\5\u00d0i\2\u0c32\u0c33\7\u00f9\2\2\u0c33\u0c34\5\u00d0i\2\u0c34\u010b"+
		"\3\2\2\2\u0c35\u0c36\7\u011c\2\2\u0c36\u0c3b\5\u010e\u0088\2\u0c37\u0c38"+
		"\7\6\2\2\u0c38\u0c3a\5\u010e\u0088\2\u0c39\u0c37\3\2\2\2\u0c3a\u0c3d\3"+
		"\2\2\2\u0c3b\u0c39\3\2\2\2\u0c3b\u0c3c\3\2\2\2\u0c3c\u010d\3\2\2\2\u0c3d"+
		"\u0c3b\3\2\2\2\u0c3e\u0c3f\5\u011c\u008f\2\u0c3f\u0c40\7\24\2\2\u0c40"+
		"\u0c41\5\u0110\u0089\2\u0c41\u010f\3\2\2\2\u0c42\u0c71\5\u011c\u008f\2"+
		"\u0c43\u0c44\7\4\2\2\u0c44\u0c45\5\u011c\u008f\2\u0c45\u0c46\7\5\2\2\u0c46"+
		"\u0c71\3\2\2\2\u0c47\u0c6a\7\4\2\2\u0c48\u0c49\7&\2\2\u0c49\u0c4a\7\34"+
		"\2\2\u0c4a\u0c4f\5\u00d0i\2\u0c4b\u0c4c\7\6\2\2\u0c4c\u0c4e\5\u00d0i\2"+
		"\u0c4d\u0c4b\3\2\2\2\u0c4e\u0c51\3\2\2\2\u0c4f\u0c4d\3\2\2\2\u0c4f\u0c50"+
		"\3\2\2\2\u0c50\u0c6b\3\2\2\2\u0c51\u0c4f\3\2\2\2\u0c52\u0c53\t\64\2\2"+
		"\u0c53\u0c54\7\34\2\2\u0c54\u0c59\5\u00d0i\2\u0c55\u0c56\7\6\2\2\u0c56"+
		"\u0c58\5\u00d0i\2\u0c57\u0c55\3\2\2\2\u0c58\u0c5b\3\2\2\2\u0c59\u0c57"+
		"\3\2\2\2\u0c59\u0c5a\3\2\2\2\u0c5a\u0c5d\3\2\2\2\u0c5b\u0c59\3\2\2\2\u0c5c"+
		"\u0c52\3\2\2\2\u0c5c\u0c5d\3\2\2\2\u0c5d\u0c68\3\2\2\2\u0c5e\u0c5f\t\65"+
		"\2\2\u0c5f\u0c60\7\34\2\2\u0c60\u0c65\5\\/\2\u0c61\u0c62\7\6\2\2\u0c62"+
		"\u0c64\5\\/\2\u0c63\u0c61\3\2\2\2\u0c64\u0c67\3\2\2\2\u0c65\u0c63\3\2"+
		"\2\2\u0c65\u0c66\3\2\2\2\u0c66\u0c69\3\2\2\2\u0c67\u0c65\3\2\2\2\u0c68"+
		"\u0c5e\3\2\2\2\u0c68\u0c69\3\2\2\2\u0c69\u0c6b\3\2\2\2\u0c6a\u0c48\3\2"+
		"\2\2\u0c6a\u0c5c\3\2\2\2\u0c6b\u0c6d\3\2\2\2\u0c6c\u0c6e\5\u0112\u008a"+
		"\2\u0c6d\u0c6c\3\2\2\2\u0c6d\u0c6e\3\2\2\2\u0c6e\u0c6f\3\2\2\2\u0c6f\u0c71"+
		"\7\5\2\2\u0c70\u0c42\3\2\2\2\u0c70\u0c43\3\2\2\2\u0c70\u0c47\3\2\2\2\u0c71"+
		"\u0111\3\2\2\2\u0c72\u0c73\7\u00c1\2\2\u0c73\u0c83\5\u0114\u008b\2\u0c74"+
		"\u0c75\7\u00d7\2\2\u0c75\u0c83\5\u0114\u008b\2\u0c76\u0c77\7\u00c1\2\2"+
		"\u0c77\u0c78\7\30\2\2\u0c78\u0c79\5\u0114\u008b\2\u0c79\u0c7a\7\17\2\2"+
		"\u0c7a\u0c7b\5\u0114\u008b\2\u0c7b\u0c83\3\2\2\2\u0c7c\u0c7d\7\u00d7\2"+
		"\2\u0c7d\u0c7e\7\30\2\2\u0c7e\u0c7f\5\u0114\u008b\2\u0c7f\u0c80\7\17\2"+
		"\2\u0c80\u0c81\5\u0114\u008b\2\u0c81\u0c83\3\2\2\2\u0c82\u0c72\3\2\2\2"+
		"\u0c82\u0c74\3\2\2\2\u0c82\u0c76\3\2\2\2\u0c82\u0c7c\3\2\2\2\u0c83\u0113"+
		"\3\2\2\2\u0c84\u0c85\7\u010a\2\2\u0c85\u0c8c\t\66\2\2\u0c86\u0c87\78\2"+
		"\2\u0c87\u0c8c\7\u00d6\2\2\u0c88\u0c89\5\u00d0i\2\u0c89\u0c8a\t\66\2\2"+
		"\u0c8a\u0c8c\3\2\2\2\u0c8b\u0c84\3\2\2\2\u0c8b\u0c86\3\2\2\2\u0c8b\u0c88"+
		"\3\2\2\2\u0c8c\u0115\3\2\2\2\u0c8d\u0c92\5\u011a\u008e\2\u0c8e\u0c8f\7"+
		"\6\2\2\u0c8f\u0c91\5\u011a\u008e\2\u0c90\u0c8e\3\2\2\2\u0c91\u0c94\3\2"+
		"\2\2\u0c92\u0c90\3\2\2\2\u0c92\u0c93\3\2\2\2\u0c93\u0117\3\2\2\2\u0c94"+
		"\u0c92\3\2\2\2\u0c95\u0c9a\5\u011a\u008e\2\u0c96\u0c9a\7a\2\2\u0c97\u0c9a"+
		"\7\u0088\2\2\u0c98\u0c9a\7\u00d0\2\2\u0c99\u0c95\3\2\2\2\u0c99\u0c96\3"+
		"\2\2\2\u0c99\u0c97\3\2\2\2\u0c99\u0c98\3\2\2\2\u0c9a\u0119\3\2\2\2\u0c9b"+
		"\u0ca0\5\u0120\u0091\2\u0c9c\u0c9d\7\7\2\2\u0c9d\u0c9f\5\u0120\u0091\2"+
		"\u0c9e\u0c9c\3\2\2\2\u0c9f\u0ca2\3\2\2\2\u0ca0\u0c9e\3\2\2\2\u0ca0\u0ca1"+
		"\3\2\2\2\u0ca1\u011b\3\2\2\2\u0ca2\u0ca0\3\2\2\2\u0ca3\u0ca4\5\u0120\u0091"+
		"\2\u0ca4\u0ca5\5\u011e\u0090\2\u0ca5\u011d\3\2\2\2\u0ca6\u0ca7\7\u012a"+
		"\2\2\u0ca7\u0ca9\5\u0120\u0091\2\u0ca8\u0ca6\3\2\2\2\u0ca9\u0caa\3\2\2"+
		"\2\u0caa\u0ca8\3\2\2\2\u0caa\u0cab\3\2\2\2\u0cab\u0cae\3\2\2\2\u0cac\u0cae"+
		"\3\2\2\2\u0cad\u0ca8\3\2\2\2\u0cad\u0cac\3\2\2\2\u0cae\u011f\3\2\2\2\u0caf"+
		"\u0cb3\5\u0122\u0092\2\u0cb0\u0cb1\6\u0091\22\2\u0cb1\u0cb3\5\u012c\u0097"+
		"\2\u0cb2\u0caf\3\2\2\2\u0cb2\u0cb0\3\2\2\2\u0cb3\u0121\3\2\2\2\u0cb4\u0cbb"+
		"\7\u0141\2\2\u0cb5\u0cbb\5\u0124\u0093\2\u0cb6\u0cb7\6\u0092\23\2\u0cb7"+
		"\u0cbb\5\u012a\u0096\2\u0cb8\u0cb9\6\u0092\24\2\u0cb9\u0cbb\5\u012e\u0098"+
		"\2\u0cba\u0cb4\3\2\2\2\u0cba\u0cb5\3\2\2\2\u0cba\u0cb6\3\2\2\2\u0cba\u0cb8"+
		"\3\2\2\2\u0cbb\u0123\3\2\2\2\u0cbc\u0cbd\7\u0142\2\2\u0cbd\u0125\3\2\2"+
		"\2\u0cbe\u0cc0\6\u0094\25\2\u0cbf\u0cc1\7\u012a\2\2\u0cc0\u0cbf\3\2\2"+
		"\2\u0cc0\u0cc1\3\2\2\2\u0cc1\u0cc2\3\2\2\2\u0cc2\u0cea\7\u013c\2\2\u0cc3"+
		"\u0cc5\6\u0094\26\2\u0cc4\u0cc6\7\u012a\2\2\u0cc5\u0cc4\3\2\2\2\u0cc5"+
		"\u0cc6\3\2\2\2\u0cc6\u0cc7\3\2\2\2\u0cc7\u0cea\7\u013d\2\2\u0cc8\u0cca"+
		"\6\u0094\27\2\u0cc9\u0ccb\7\u012a\2\2\u0cca\u0cc9\3\2\2\2\u0cca\u0ccb"+
		"\3\2\2\2\u0ccb\u0ccc\3\2\2\2\u0ccc\u0cea\t\67\2\2\u0ccd\u0ccf\7\u012a"+
		"\2\2\u0cce\u0ccd\3\2\2\2\u0cce\u0ccf\3\2\2\2\u0ccf\u0cd0\3\2\2\2\u0cd0"+
		"\u0cea\7\u013b\2\2\u0cd1\u0cd3\7\u012a\2\2\u0cd2\u0cd1\3\2\2\2\u0cd2\u0cd3"+
		"\3\2\2\2\u0cd3\u0cd4\3\2\2\2\u0cd4\u0cea\7\u0138\2\2\u0cd5\u0cd7\7\u012a"+
		"\2\2\u0cd6\u0cd5\3\2\2\2\u0cd6\u0cd7\3\2\2\2\u0cd7\u0cd8\3\2\2\2\u0cd8"+
		"\u0cea\7\u0139\2\2\u0cd9\u0cdb\7\u012a\2\2\u0cda\u0cd9\3\2\2\2\u0cda\u0cdb"+
		"\3\2\2\2\u0cdb\u0cdc\3\2\2\2\u0cdc\u0cea\7\u013a\2\2\u0cdd\u0cdf\7\u012a"+
		"\2\2\u0cde\u0cdd\3\2\2\2\u0cde\u0cdf\3\2\2\2\u0cdf\u0ce0\3\2\2\2\u0ce0"+
		"\u0cea\7\u013f\2\2\u0ce1\u0ce3\7\u012a\2\2\u0ce2\u0ce1\3\2\2\2\u0ce2\u0ce3"+
		"\3\2\2\2\u0ce3\u0ce4\3\2\2\2\u0ce4\u0cea\7\u013e\2\2\u0ce5\u0ce7\7\u012a"+
		"\2\2\u0ce6\u0ce5\3\2\2\2\u0ce6\u0ce7\3\2\2\2\u0ce7\u0ce8\3\2\2\2\u0ce8"+
		"\u0cea\7\u0140\2\2\u0ce9\u0cbe\3\2\2\2\u0ce9\u0cc3\3\2\2\2\u0ce9\u0cc8"+
		"\3\2\2\2\u0ce9\u0cce\3\2\2\2\u0ce9\u0cd2\3\2\2\2\u0ce9\u0cd6\3\2\2\2\u0ce9"+
		"\u0cda\3\2\2\2\u0ce9\u0cde\3\2\2\2\u0ce9\u0ce2\3\2\2\2\u0ce9\u0ce6\3\2"+
		"\2\2\u0cea\u0127\3\2\2\2\u0ceb\u0cec\7\u0108\2\2\u0cec\u0cf7\5\u00f6|"+
		"\2\u0ced\u0cf7\5\"\22\2\u0cee\u0cf7\5\u00f4{\2\u0cef\u0cf0\t8\2\2\u0cf0"+
		"\u0cf1\7\u00a1\2\2\u0cf1\u0cf7\7\u00a2\2\2\u0cf2\u0cf3\7\u00e1\2\2\u0cf3"+
		"\u0cf7\5\u00fc\177\2\u0cf4\u0cf5\7Q\2\2\u0cf5\u0cf7\7E\2\2\u0cf6\u0ceb"+
		"\3\2\2\2\u0cf6\u0ced\3\2\2\2\u0cf6\u0cee\3\2\2\2\u0cf6\u0cef\3\2\2\2\u0cf6"+
		"\u0cf2\3\2\2\2\u0cf6\u0cf4\3\2\2\2\u0cf7\u0129\3\2\2\2\u0cf8\u0cf9\t9"+
		"\2\2\u0cf9\u012b\3\2\2\2\u0cfa\u0cfb\t:\2\2\u0cfb\u012d\3\2\2\2\u0cfc"+
		"\u0cfd\t;\2\2\u0cfd\u012f\3\2\2\2\u01b8\u0134\u014d\u015a\u0161\u0169"+
		"\u016b\u017f\u0183\u0189\u018c\u018f\u0196\u0199\u019d\u01a0\u01a7\u01b2"+
		"\u01b4\u01bc\u01bf\u01c3\u01c6\u01cc\u01d7\u01dd\u01e2\u0222\u022b\u022f"+
		"\u0235\u0239\u023e\u0244\u0250\u0258\u025e\u026b\u0270\u0280\u0287\u028b"+
		"\u0291\u02a0\u02a4\u02aa\u02b0\u02b3\u02b6\u02bc\u02c0\u02c8\u02ca\u02d3"+
		"\u02d6\u02df\u02e4\u02ea\u02f1\u02f4\u02fa\u0305\u0308\u030c\u0311\u0316"+
		"\u031d\u0320\u0323\u032a\u032f\u0338\u0340\u0346\u0349\u034c\u0352\u0356"+
		"\u035b\u035e\u0362\u0364\u036c\u0374\u0377\u037c\u0382\u0388\u038b\u038f"+
		"\u0392\u0396\u03b2\u03b5\u03b9\u03bf\u03c2\u03c5\u03cb\u03d3\u03d8\u03de"+
		"\u03e4\u03ec\u03f3\u03fb\u040c\u041a\u041d\u0423\u042c\u0435\u043d\u0442"+
		"\u0447\u044e\u0454\u0459\u0461\u0464\u0470\u0474\u047b\u04ef\u04f7\u04ff"+
		"\u0508\u0512\u0516\u0519\u051f\u0525\u0531\u053d\u0542\u054b\u0553\u055a"+
		"\u055c\u055f\u0564\u0568\u056d\u0570\u0575\u057a\u057d\u0582\u0586\u058b"+
		"\u058d\u0591\u059a\u05a2\u05a8\u05b3\u05ba\u05c3\u05c8\u05cb\u05e3\u05e5"+
		"\u05ee\u05f5\u05f8\u05ff\u0603\u0609\u0611\u061c\u0627\u062e\u0634\u0640"+
		"\u0647\u064e\u065a\u0662\u0668\u066b\u0674\u0677\u0680\u0683\u068c\u068f"+
		"\u0698\u069b\u069e\u06a3\u06a5\u06b1\u06b8\u06bf\u06c2\u06c4\u06d0\u06d4"+
		"\u06d8\u06de\u06e2\u06ea\u06ee\u06f1\u06f4\u06f7\u06fb\u06ff\u0704\u0708"+
		"\u070b\u070e\u0711\u0715\u071a\u071e\u0721\u0724\u0727\u0729\u072f\u0736"+
		"\u073b\u073e\u0741\u0745\u074f\u0753\u0755\u0758\u075c\u0762\u0766\u0771"+
		"\u077b\u0787\u0796\u079b\u07a2\u07b2\u07b7\u07c4\u07c9\u07d1\u07d7\u07db"+
		"\u07de\u07e5\u07eb\u07f4\u07fe\u080d\u0812\u0814\u0818\u0821\u082e\u0833"+
		"\u0837\u083f\u0842\u0846\u0854\u0861\u0866\u086a\u086d\u0872\u087b\u087e"+
		"\u0883\u088a\u088d\u0892\u0898\u089e\u08a2\u08a8\u08ac\u08af\u08b4\u08b7"+
		"\u08bc\u08c0\u08c3\u08c6\u08cc\u08d1\u08d8\u08db\u08ed\u08ef\u08f2\u08fd"+
		"\u0906\u090d\u0915\u091c\u0920\u0923\u092b\u0933\u0939\u0941\u094d\u0950"+
		"\u0956\u095a\u095c\u0965\u0971\u0973\u097a\u0981\u0987\u098d\u098f\u0996"+
		"\u099e\u09a6\u09ac\u09b1\u09b8\u09be\u09c2\u09c4\u09cb\u09d4\u09db\u09e5"+
		"\u09ea\u09ee\u09f7\u0a04\u0a06\u0a0e\u0a10\u0a14\u0a1c\u0a25\u0a2b\u0a33"+
		"\u0a38\u0a44\u0a49\u0a4c\u0a52\u0a56\u0a5b\u0a60\u0a65\u0a6b\u0a80\u0a82"+
		"\u0a9f\u0aa3\u0aac\u0ab0\u0ac2\u0ac5\u0acd\u0ad6\u0aed\u0af8\u0aff\u0b02"+
		"\u0b0b\u0b0f\u0b13\u0b1f\u0b38\u0b3f\u0b42\u0b51\u0b62\u0b64\u0b6e\u0b70"+
		"\u0b7d\u0b7f\u0b8c\u0b90\u0b97\u0b9c\u0ba4\u0bab\u0bbc\u0bc0\u0bc6\u0bcc"+
		"\u0bd5\u0bd9\u0bdb\u0be2\u0be9\u0bec\u0bef\u0bf2\u0bfc\u0c03\u0c06\u0c0d"+
		"\u0c14\u0c17\u0c1a\u0c21\u0c26\u0c2b\u0c2e\u0c3b\u0c4f\u0c59\u0c5c\u0c65"+
		"\u0c68\u0c6a\u0c6d\u0c70\u0c82\u0c8b\u0c92\u0c99\u0ca0\u0caa\u0cad\u0cb2"+
		"\u0cba\u0cc0\u0cc5\u0cca\u0cce\u0cd2\u0cd6\u0cda\u0cde\u0ce2\u0ce6\u0ce9"+
		"\u0cf6";
	public static final String _serializedATN = Utils.join(
		new String[] {
			_serializedATNSegment0,
			_serializedATNSegment1
		},
		""
	);
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}