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

import java.util.Objects;

/**
 * @author xiuming
 * 解释器类型
 */
public enum InterpreterType {
    /** spark解释器 */
    SPARK("spark")
    ;

    private String value;

    InterpreterType(String value) {
        this.value = value;
    }

    public static InterpreterType create(Object value) {
        final String stringValue = value.toString();
        for (InterpreterType item : values()) {
            if (Objects.equals(stringValue, item.getValue())) {
                return item;
            }else if (Objects.equals(stringValue, item.name())) {
                return item;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
