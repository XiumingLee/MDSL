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

/**
 * @author xiuming
 * 解释器接口
 *
 * 1、environment设置器，不同的执行环境，环境准备不同，比如Spark、Flink一开始的设置session.
 * 2、SourceInterpreter
 * 3、TransformInterpreter
 * 4、ModelInterpreter
 *      4.1、CreateModel  // Antlr 中根据创建表的语句，添加创建Model的语句
 *      4.2、PredictModel // Antlr 中根据Select和Insert语句，添加预测的语句
 * 5、SinkInterpreter
 */
public interface Interpreter {

    /** Interpreter类型  */
    InterpreterType getType();



}

