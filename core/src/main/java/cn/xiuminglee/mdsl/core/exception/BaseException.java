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
public class BaseException extends RuntimeException{

    /**
     * MDSL 错误
     */
    private final Error error;


    /**
     * 获取BaseException中的错误
     * @return
     */
    public Error getError() {
        return error;
    }


    public BaseException(Error error) {
        super(error.cause());
        this.error = error;
    }

    public BaseException(Error error,Throwable cause) {
        super(error.cause(),cause);
        this.error = error;
    }
}
