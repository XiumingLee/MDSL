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

package cn.xiuminglee.mdsl.core.request;

import cn.xiuminglee.mdsl.core.interpreter.InterpreterType;

import java.util.List;

/**
 * @author Xiuming Lee
 *
 */
public class Request {
    /** 整个分析流程的表达式 */
    private String expression;
    /** 单条语句的集合 */
    private List<String> statements;
    /** 解释器类型 */
    private InterpreterType interpreterType;


    public String getExpression() {
        return expression;
    }

    public void setExpression(String expression) {
        this.expression = expression;
    }

    public List<String> getStatements() {
        return statements;
    }


    public InterpreterType getInterpreterType() {
        return interpreterType;
    }

    public void setInterpreterType(InterpreterType interpreterType) {
        this.interpreterType = interpreterType;
    }
}
