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

package cn.xiuminglee.mdsl.parser.common;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CodePointCharStream;
import org.antlr.v4.runtime.IntStream;
import org.antlr.v4.runtime.misc.Interval;

/**
 * @author Xiuming Lee
 * 此字符串流仅向词法分析器提供大写字符。这极大地简化了流的词法分析，同时我们可以保持原始命令。
 * 这是基于 Hive 的 org.apache.hadoop.hive.ql.parse.ParseDriver.ANTLRNoCaseStringStream
 * 下面的评论（取自原始类）描述了这样做的理由：
 * 此类为 antlr 的词法分析部分提供和实现不区分大小写的标记检查器。通过在检查词法规则时将标记流转换为大写，该类确保词法规则只需要将标记与大写字母匹配，而不是大小写字符的组合。这纯粹用于匹配词法规则。实际的标记文本以与用户输入相同的方式存储，而无需实际将其转换为大写。令牌值由超类 ANTLRStringStream 的 consume() 函数生成。 LA() 函数是前瞻函数，纯粹用于匹配词法规则。这也意味着语法将只接受大写标记，以防它从其他工具（如 antlrworks）运行，这些工具没有 UpperCaseCharStream 实现
 */
public class UpperCaseCharStream implements CharStream {

    private final CodePointCharStream wrapped;

    public UpperCaseCharStream(CodePointCharStream wrapped) {
        this.wrapped = wrapped;
    }

    @Override
    public String getText(Interval interval) {
        return wrapped.getText(interval);
    }

    @Override
    public void consume() {
        wrapped.consume();
    }

    @Override
    public int LA(int i) {
        int la = wrapped.LA(i);
        if (la == 0 || la == IntStream.EOF) {
            return la;
        } else {
            return Character.toUpperCase(la);
        }
    }

    @Override
    public int mark() {
        return wrapped.mark();
    }

    @Override
    public void release(int marker) {
        wrapped.release(marker);
    }

    @Override
    public int index() {
        return wrapped.index();
    }

    @Override
    public void seek(int where) {
        wrapped.seek(where);
    }

    @Override
    public int size() {
        return wrapped.size();
    }

    @Override
    public String getSourceName() {
        return wrapped.getSourceName();
    }
}
