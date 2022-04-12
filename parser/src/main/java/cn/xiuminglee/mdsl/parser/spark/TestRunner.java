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
        //String command = "select id,name,age from student where id in (1001,1002);";
        String command = "select id,name,age ， student where id in (1001,1002);";
        SqlBaseLexer sqlBaseLexer = new SqlBaseLexer(new UpperCaseCharStream(CharStreams.fromString(command)));

        CommonTokenStream tokenStream = new CommonTokenStream(sqlBaseLexer);
        SqlBaseParser parser = new SqlBaseParser(tokenStream);
        parser.addParseListener(new TestListener());
        // 移除默认的错误监听器
        parser.removeErrorListeners();
        // 使用自定义的错误监听器
        parser.addErrorListener(new TestErrorListener());

        TestVisitor testVisitor = new TestVisitor();
        testVisitor.visitSingleStatement(parser.singleStatement());


        // SELECTID,NAME,AGEFROMSTUDENTWHEREIDIN(1001,1002)

    }
}
