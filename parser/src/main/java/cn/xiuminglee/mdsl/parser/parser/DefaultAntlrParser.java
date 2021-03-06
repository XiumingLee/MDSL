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

package cn.xiuminglee.mdsl.parser.parser;

import cn.xiuminglee.mdsl.core.interpreter.Interpreter;
import cn.xiuminglee.mdsl.core.interpreter.InterpreterFactory;
import cn.xiuminglee.mdsl.core.parser.Parser;
import cn.xiuminglee.mdsl.core.request.Request;

/**
 * @author Xiuming Lee
 */
public class DefaultAntlrParser implements Parser {

    /**
     * 1、根据InterpreterType获取Interpreter；
     * 2、todo:注意验证语句的标准性。
     * @param request 请求数据
     * @return
     */
    @Override
    public Object parse(Request request) {
        Interpreter interpreter = InterpreterFactory.get(request.getInterpreterType());
        return null;
    }
}
