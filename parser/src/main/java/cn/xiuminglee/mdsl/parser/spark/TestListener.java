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
import cn.xiuminglee.mdsl.parser.antlr.SqlBaseParserBaseListener;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.Pair;
import org.antlr.v4.runtime.tree.TerminalNodeImpl;

import java.util.function.Function;

/**
 * @author xiuming
 * 后处理器在解析过程中验证和清理解析树。
 * {@see org.apache.spark.sql.catalyst.parser.PostProcessor}
 */
public class TestListener extends SqlBaseParserBaseListener {

    /**
     * Throws error message when exiting a explicitly captured wrong identifier rule
     */
    @Override
    public void exitErrorIdent(SqlBaseParser.ErrorIdentContext ctx) {
        String ident = ctx.getParent().getText();
        System.err.println(ident + "：错误！！！");
    }

    /** Remove the back ticks from an Identifier. */
    @Override
    public void exitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx) {
        replaceTokenByIdentifier(ctx, 1, (token) -> {
                    token.setText(token.getText().replace("``", "`"));
                    return token;
                }
        );
    }

    /** Treat non-reserved keywords as Identifiers. */
    @Override
    public void exitNonReserved(SqlBaseParser.NonReservedContext ctx) {
        replaceTokenByIdentifier(ctx, 0, (token) -> token);
    }


    private void replaceTokenByIdentifier(ParserRuleContext ctx, Integer stripMargins, Function<CommonToken, CommonToken> f) {
        ParserRuleContext parent = ctx.getParent();
        parent.removeLastChild();
        Token token = (Token) ctx.getChild(0).getPayload();
        CommonToken newToken = new CommonToken(
                new Pair(token.getTokenSource(), token.getInputStream()),
                SqlBaseParser.IDENTIFIER,
                token.getChannel(),
                token.getStartIndex() + stripMargins,
                token.getStopIndex() - stripMargins);
        parent.addChild(new TerminalNodeImpl(f.apply(newToken)));
    }
}
