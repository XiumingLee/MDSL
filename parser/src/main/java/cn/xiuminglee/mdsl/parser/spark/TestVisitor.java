/*
 * Copyright (c) 2022, Xiuming Lee.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * Please contact me via email lxmcoder@163.com if you need additional information
 * or have any questions.
 */

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
