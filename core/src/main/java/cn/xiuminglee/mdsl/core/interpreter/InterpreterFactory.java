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

package cn.xiuminglee.mdsl.core.interpreter;

import java.util.List;
import java.util.Objects;

/**
 * @author xiuming
 * 解释器工程类
 */
public class InterpreterFactory {

    static List<Interpreter> interpreters;


    /**
     * 获取执行器
     *
     * @param type 类型
     * @return {@link Interpreter}
     */
    public static synchronized Interpreter get(InterpreterType type) {
        if (interpreters == null || interpreters.size() == 0) {
            return null;
        }
        for (Interpreter interpreter : interpreters) {
            if (interpreter.getType().equals(type)) {
                return interpreter;
            }
        }
        return null;
    }



    public static void  setInterpreters(List<Interpreter> interpreterList) {
        interpreters = interpreterList;
    }
}
