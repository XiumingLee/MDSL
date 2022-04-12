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

package cn.xiuminglee.mdsl.core.parser;

import cn.xiuminglee.mdsl.core.request.Request;

/**
 * @author Xiuming Lee
 */
public interface Parser {

    /**
     * 表达式解析与解释.
     * @param request 请求数据
     * @return
     * TODO：由于一个分析流程存在多个表达式语句，每个表达式会走一遍解释器，并返回相应的翻译语句。
     * 多个表达式，会有多个返回语句，而且多个表达式可能可能会存在上下的联动关系，所以此方法中需要
     * 思考下一句表达式的翻译是否需要上一句表达式的某些内容。还要思考不同表达式的翻译顺序。是否需要提取
     * 公共变量，供不同表达式翻译时使用。
     */
    Object parse(Request request);

}
