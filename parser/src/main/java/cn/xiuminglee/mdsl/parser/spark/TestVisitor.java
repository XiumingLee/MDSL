package cn.xiuminglee.mdsl.parser.spark;

import cn.xiuminglee.mdsl.parser.antlr.SqlBaseParser;
import cn.xiuminglee.mdsl.parser.antlr.SqlBaseParserBaseVisitor;
import org.antlr.v4.runtime.tree.RuleNode;

/**
 * @author xiuming
 */
public class TestVisitor extends SqlBaseParserBaseVisitor {

    @Override
    public Object visitSingleStatement(SqlBaseParser.SingleStatementContext ctx) {
        return visit(ctx.statement());
    }

    @Override
    public Object visitQuery(SqlBaseParser.QueryContext ctx){
        return visit(ctx.queryTerm());
    }

    @Override
    public Object visitQueryTermDefault(SqlBaseParser.QueryTermDefaultContext ctx) {
        return visit(ctx.queryPrimary());
    }

    @Override
    public Object visitQueryPrimaryDefault(SqlBaseParser.QueryPrimaryDefaultContext ctx) {
        return visit(ctx.querySpecification());
    }

    @Override
    public Object visitRegularQuerySpecification(SqlBaseParser.RegularQuerySpecificationContext ctx) {
        return visit(ctx.selectClause());
    }

    @Override
    public Object visitSelectClause(SqlBaseParser.SelectClauseContext ctx) {
        // selectid,name,age
        System.out.println(ctx.getText());
        System.out.println(ctx.namedExpressionSeq().getText());
        return super.visitSelectClause(ctx);
    }
}
