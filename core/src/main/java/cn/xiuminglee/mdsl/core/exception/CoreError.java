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

package cn.xiuminglee.mdsl.core.exception;

/**
 * @author Xiuming Lee
 */
public enum CoreError implements Error{

    /** 解析错误 */
    PARSE_ERROR("parse_error","解析错误！");


    private final String code;
    private final String cause;

    CoreError(String code, String cause) {
        this.code = code;
        this.cause = cause;
    }

    @Override
    public String code() {
        return code;
    }

    @Override
    public String cause() {
        return cause;
    }
}
