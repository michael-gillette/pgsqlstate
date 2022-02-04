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


    TRIGGERED_ACTION_EXCEPTION(
        PgSqlStateClass.X09, "000"),


    FEATURE_NOT_SUPPORTED(
        PgSqlStateClass.X0A, "000"),


    INVALID_TRANSACTION_INITIATION(
        PgSqlStateClass.X0B, "000"),


    LOCATOR_EXCEPTION(
        PgSqlStateClass.X0F, "000"),

    INVALID_LOCATOR_SPECIFICATION(
        PgSqlStateClass.X0F, "001"),


    INVALID_GRANTOR(
        PgSqlStateClass.X0L, "000"),

    INVALID_GRANT_SPECIFICATION(
        PgSqlStateClass.X0L, "001"),


    SYSTEM_ERROR(
        PgSqlStateClass.X58, "000"),

    IO_ERROR(
        PgSqlStateClass.X58, "030"),

    UNDEFINED_FILE(
        PgSqlStateClass.X58, "P01"),

    DUPLICATE_FILE(
        PgSqlStateClass.X58, "P02"),


    SNAPSHOT_TOO_OLD(
        PgSqlStateClass.X72, "000"),


    CONFIG_FILE_ERROR(
        PgSqlStateClass.XF0, "000"),

    LOCK_FILE_EXISTS(
        PgSqlStateClass.XF0, "001"),


    FDW_ERROR(
        PgSqlStateClass.XHV, "000"),

    FDW_OUT_OF_MEMORY(
        PgSqlStateClass.XHV, "001"),

    FDW_DYNAMIC_PARAMETER_VALUE_NEEDED(
        PgSqlStateClass.XHV, "002"),

    FDW_INVALID_DATA_TYPE(
        PgSqlStateClass.XHV, "004"),

    FDW_COLUMN_NAME_NOT_FOUND(
        PgSqlStateClass.XHV, "005"),

    FDW_INVALID_DATA_TYPE_DESCRIPTORS(
        PgSqlStateClass.XHV, "006"),

    FDW_INVALID_COLUMN_NAME(
        PgSqlStateClass.XHV, "007"),

    FDW_INVALID_COLUMN_NUMBER(
        PgSqlStateClass.XHV, "008"),

    FDW_INVALID_USE_OF_NULL_POINTER(
        PgSqlStateClass.XHV, "009"),

    FDW_INVALID_STRING_FORMAT(
        PgSqlStateClass.XHV, "00A"),

    FDW_INVALID_HANDLE(
        PgSqlStateClass.XHV, "00B"),

    FDW_INVALID_OPTION_INDEX(
        PgSqlStateClass.XHV, "00C"),

    FDW_INVALID_OPTION_NAME(
        PgSqlStateClass.XHV, "00D"),

    FDW_OPTION_NAME_NOT_FOUND(
        PgSqlStateClass.XHV, "00J"),

    FDW_REPLY_HANDLE(
        PgSqlStateClass.XHV, "00K"),

    FDW_UNABLE_TO_CREATE_EXCEPTION(
        PgSqlStateClass.XHV, "00L"),

    FDW_UNABLE_TO_CREATE_REPLY(
        PgSqlStateClass.XHV, "00M"),

    FDW_UNABLE_TO_ESTABLISH_CONNECTION(
        PgSqlStateClass.XHV, "00N"),

    FDW_NO_SCHEMAS(
        PgSqlStateClass.XHV, "00P"),

    FDW_SCHEMA_NOT_FOUND(
        PgSqlStateClass.XHV, "00Q"),

    FDW_TABLE_NOT_FOUND(
        PgSqlStateClass.XHV, "00R"),

    FDW_FUNCTION_SEQUENCE_ERROR(
        PgSqlStateClass.XHV, "010"),

    FDW_TOO_MANY_HANDLES(
        PgSqlStateClass.XHV, "014"),

    FDW_INCONSISTENT_DESCRIPTOR_INFORMATION(
        PgSqlStateClass.XHV, "021"),

    FDW_INVALID_ATTRIBUTE_VALUE(
        PgSqlStateClass.XHV, "024"),

    FDW_INVALID_STRING_LENGTH_OR_BUFFER_LENGTH(
        PgSqlStateClass.XHV, "090"),

    FDW_INVALID_DESCRIPTOR_FIELD_IDENTIFIER(
        PgSqlStateClass.XHV, "091"),


    PL_PGSQL_ERROR(
        PgSqlStateClass.XP0, "000"),

    RAISE_EXCEPTION(
        PgSqlStateClass.XP0, "001"),

    NO_DATA_FOUND(
        PgSqlStateClass.XP0, "002"),

    TOO_MANY_ROWS(
        PgSqlStateClass.XP0, "003"),

    ASSERT_FAILURE(
        PgSqlStateClass.XP0, "004"),


    INTERNAL_ERROR(
        PgSqlStateClass.XXX, "000"),

    DATA_CORRUPTED(
        PgSqlStateClass.XXX, "001"),

    INDEX_CORRUPTED(
        PgSqlStateClass.XXX, "002"),

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
