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

import java.util.Objects;

/**
 * PgSqlState
 *
 * An enumeration of all current Postgres SQLState Errors.
 *
 * @see <a href="https://www.postgresql.org/docs/14/errcodes-appendix.html">Offical Postgres Error States</a>
 * @since 0.1.0
 */
public enum PgSqlState {

    SUCCESSFUL_COMPLETION(
        "00", "000"),


    WARNING(
        "01", "000"),

    NULL_VALUE_ELIMINATED_IN_SET_FUNCTION(
        "01", "003"),

    STRING_DATA_RIGHT_TRUNCATION(
        "01", "004"),

    PRIVILEGE_NOT_REVOKED(
        "01", "006"),

    PRIVILEGE_NOT_GRANTED(
        "01", "007"),

    IMPLICIT_ZERO_BIT_PADDING(
        "01", "008"),

    DYNAMIC_RESULT_SETS_RETURNED(
        "01", "00C"),

    DEPRECATED_FEATURE(
        "01", "P01"),


    NO_DATA(
        "02", "000"),

    NO_ADDITIONAL_DYNAMIC_RESULT_SETS_RETURNED(
        "02", "001"),


    SQL_STATEMENT_NOT_YET_COMPLETE(
        "03", "000"),

    ;

    private final String errorClass;
    private final String errorCode;
    private final String errorState;

    PgSqlState(
        String errorClass,
        String errorCode
    ) {
        this.errorClass = Objects.requireNonNull(
             errorClass, "errorClass is required.");
        this.errorCode = Objects.requireNonNull(
             errorCode, "errorCode is required.");
        this.errorState = errorClass + errorCode;
    }

    /**
     * Error Class
     *
     * @return {@link #errorClass}
     */
    public String getErrorClass() {
        return errorClass;
    }

    /**
     * Error Code
     *
     * @return {@link #errorCode}
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Error Label
     *
     * @return the lower-cased {@link #name()}
     */
    public String getErrorLabel() {
        return name().toLowerCase();
    }

    /**
     * Error State
     *
     * @return {@link #errorClass} and {@link #errorCode}
     */
    public String getErrorState() {
        return errorState;
    }

}
