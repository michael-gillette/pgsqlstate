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
 * Postgres SqlState
 *
 * An enumeration of all current Postgres SQLState Errors.
 *
 * @see <a href="https://www.postgresql.org/docs/14/errcodes-appendix.html">Offical Postgres Error States</a>
 * @since 0.1.0
 */
public enum PgSqlState implements SqlState {

    SUCCESSFUL_COMPLETION(
        PgSqlStateClass.S00, "000"),


    WARNING(
        PgSqlStateClass.W01, "000"),

    NULL_VALUE_ELIMINATED_IN_SET_FUNCTION(
        PgSqlStateClass.W01, "003"),

    STRING_DATA_RIGHT_TRUNCATION(
        PgSqlStateClass.W01, "004"),

    PRIVILEGE_NOT_REVOKED(
        PgSqlStateClass.W01, "006"),

    PRIVILEGE_NOT_GRANTED(
        PgSqlStateClass.W01, "007"),

    IMPLICIT_ZERO_BIT_PADDING(
        PgSqlStateClass.W01, "008"),

    DYNAMIC_RESULT_SETS_RETURNED(
        PgSqlStateClass.W01, "00C"),

    DEPRECATED_FEATURE(
        PgSqlStateClass.W01, "P01"),


    NO_DATA(
        PgSqlStateClass.N02, "000"),

    NO_ADDITIONAL_DYNAMIC_RESULT_SETS_RETURNED(
        PgSqlStateClass.N02, "001"),


    SQL_STATEMENT_NOT_YET_COMPLETE(
        PgSqlStateClass.X03, "000"),


    CONNECTION_EXCEPTION(
        PgSqlStateClass.X08, "000"),

    SQLCLIENT_UNABLE_TO_ESTABLISH_SQLCONNECTION(
        PgSqlStateClass.X08, "001"),

    CONNECTION_DOES_NOT_EXIST(
        PgSqlStateClass.X08, "003"),

    SQLSERVER_REJECTED_ESTABLISHMENT_OF_SQLCONNECTION(
        PgSqlStateClass.X08, "004"),

    CONNECTION_FAILURE(
        PgSqlStateClass.X08, "006"),

    TRANSACTION_RESOLUTION_UNKNOWN(
        PgSqlStateClass.X08, "007"),

    PROTOCOL_VIOLATION(
        PgSqlStateClass.X08, "P01"),

    ;

    private final SqlState sqlState;

    PgSqlState(SqlStateRootClass rootClass, String code) {
        this.sqlState = new SqlStateEntity(rootClass, code, name().toLowerCase());
    }

    @Override
    public SqlStateCategory getCategory() {
        return sqlState.getCategory();
    }

    @Override
    public SqlStateClass getRootClass() {
        return sqlState.getRootClass();
    }

    @Override
    public SqlStateClass getLeafClass() {
        return sqlState.getLeafClass();
    }

    @Override
    public String getCode() {
        return sqlState.getCode();
    }

}
