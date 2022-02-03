/*
 * Copyright (c) 2022. Michael Gillette.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is furnished
 * to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included
 * in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM,
 * DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR
 * THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.mgillette.lib.pgsqlstate;

import com.github.mgillette.lib.sqlstate.*;

/**
 * Postgres SqlState Class
 *
 * @since 0.1.0
 */
public abstract class PgSqlStateClass {

    private PgSqlStateClass() {
        // this is a utility class
    }

    public static final SqlStateRootClass S00 =
        SqlStateCategory.SUCCESS.newRootClass(
            "00", "Successful Completion");

    public static final SqlStateRootClass W01 =
        SqlStateCategory.WARNING.newRootClass(
            "01", "Warning");

    public static final SqlStateRootClass N02 =
        SqlStateCategory.NO_DATA.newRootClass(
            "02", "No Data");

    public static final SqlStateRootClass X03 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "03", "SQL Statement Not Yet Complete");

    public static final SqlStateRootClass X08 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "08", "Connection Exception");

    public static final SqlStateRootClass SUCCESSFUL_COMPLETION = S00;
    public static final SqlStateRootClass WARNING = W01;
    public static final SqlStateRootClass NO_DATA = N02;
    public static final SqlStateRootClass SQL_STATEMENT_NOT_COMPLETE = X03;
    public static final SqlStateRootClass CONNECTION_EXCEPTION = X08;

}
