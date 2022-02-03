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

package com.github.mgillette.lib.sqlstate;

import java.util.Objects;

/**
 * Sql State Category
 *
 * @since 0.1.0
 */
public enum SqlStateCategory {

    /**
     * Success
     *
     * A return code which states the call was a success.
     */
    SUCCESS("S"),

    /**
     * Warning
     *
     * A return code which states the call may require attention.
     */
    WARNING("W"),

    /**
     * No Data
     *
     * A return code which states the call completed with no results.
     */
    NO_DATA("N"),

    /**
     * Exception
     *
     * A return code which states the call resulted in an error.
     */
    EXCEPTION("X"),

    ;

    private final String code;

    SqlStateCategory(String code) {
        this.code = Objects.requireNonNull(code, "code is required.");
    }

    /**
     * Code
     *
     * @return the SqlState Category code
     */
    public String getCode() {
        return code;
    }

    /**
     * Create {@link SqlStateRootClass}
     *
     * @param code for {@link SqlStateRootClass#getCode()}
     * @param text for {@link SqlStateRootClass#getText()} ()}
     * @return an instance of {@link SqlStateRootClass}
     */
    public SqlStateRootClass newRootClass(String code, String text) {
        return new SqlStateRootClass(this, code, text);
    }

}
