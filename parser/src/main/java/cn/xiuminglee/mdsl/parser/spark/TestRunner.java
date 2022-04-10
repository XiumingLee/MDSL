package cn.xiuminglee.mdsl.parser.spark;

import cn.xiuminglee.mdsl.parser.antlr.SqlBaseLexer;
import cn.xiuminglee.mdsl.parser.antlr.SqlBaseParser;
import cn.xiuminglee.mdsl.parser.common.UpperCaseCharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

/**
 * @author xiuming
 */
public class TestRunner {
    public static void main(String[] args) {
        String command =
                "select id,name,age from student where id in (1001,1002);";
        SqlBaseLexer sqlBaseLexer = new SqlBaseLexer(new UpperCaseCharStream(CharStreams.fromString(command)));

        CommonTokenStream tokenStream = new CommonTokenStream(sqlBaseLexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        parser.addParseListener(new TestListener());

        TestVisitor testVisitor = new TestVisitor();
        testVisitor.visitSingleStatement(parser.singleStatement());


        // SELECTID,NAME,AGEFROMSTUDENTWHEREIDIN(1001,1002)

    }
}
