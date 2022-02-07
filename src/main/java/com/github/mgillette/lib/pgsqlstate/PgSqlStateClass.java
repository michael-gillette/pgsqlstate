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

    public static final SqlStateRootClass X09 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "09", "Triggered Action Exception");

    public static final SqlStateRootClass X0A =
        SqlStateCategory.EXCEPTION.newRootClass(
            "0A", "Feature Not Supported");

    public static final SqlStateRootClass X0B =
        SqlStateCategory.EXCEPTION.newRootClass(
            "0B", "Invalid Transaction Initiation");

    public static final SqlStateRootClass X0F =
        SqlStateCategory.EXCEPTION.newRootClass(
            "0F", "Locator Exception");

    public static final SqlStateRootClass X0L =
        SqlStateCategory.EXCEPTION.newRootClass(
            "0L", "Invalid Grantor");

    public static final SqlStateRootClass X0P =
        SqlStateCategory.EXCEPTION.newRootClass(
            "0P", "Invalid Role Specification");

    public static final SqlStateRootClass X0Z =
        SqlStateCategory.EXCEPTION.newRootClass(
            "0Z", "Diagnostics Exception");

    public static final SqlStateRootClass X20 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "20", "Case Not Found");

    public static final SqlStateRootClass X21 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "21", "Cardinality Violation");

    public static final SqlStateRootClass X22 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "22", "Data Exception");

    public static final SqlStateRootClass X23 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "23", "Integrity Constraint Violation");

    public static final SqlStateRootClass X24 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "24", "Invalid Cursor State");

    public static final SqlStateRootClass X25 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "25", "Invalid Transaction State");

    public static final SqlStateRootClass X26 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "26", "Invalid SQL Statement Name");

    public static final SqlStateRootClass X27 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "27", "Triggered Data Change Violation");

    public static final SqlStateRootClass X28 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "28", "Invalid Authorization Specification");

    public static final SqlStateRootClass X2B =
        SqlStateCategory.EXCEPTION.newRootClass(
            "2B", "Dependent Privilege Descriptors Still Exist");

    public static final SqlStateRootClass X2D =
        SqlStateCategory.EXCEPTION.newRootClass(
            "2D", "Invalid Transaction Termination");

    public static final SqlStateRootClass X2F =
        SqlStateCategory.EXCEPTION.newRootClass(
            "2F", "SQL Routine Exception");

    public static final SqlStateRootClass X34 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "34", "Invalid Cursor Name");

    public static final SqlStateRootClass X38 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "38", "External Routine Exception");

    public static final SqlStateRootClass X39 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "39", "External Routine Invocation Exception");

    public static final SqlStateRootClass X3B =
        SqlStateCategory.EXCEPTION.newRootClass(
            "3B", "Savepoint Exception");

    public static final SqlStateRootClass X3D =
        SqlStateCategory.EXCEPTION.newRootClass(
            "3D", "Invalid Catalog Name");

    public static final SqlStateRootClass X3F =
        SqlStateCategory.EXCEPTION.newRootClass(
            "3F", "Invalid Schema Name");

    public static final SqlStateRootClass X40 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "40", "Transaction Rollback");

    public static final SqlStateRootClass X42 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "42", "Syntax Error or Access Rule Violation");

    public static final SqlStateRootClass X44 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "44", "WITH CHECK OPTION Violation");

    public static final SqlStateRootClass X53 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "53", "Insufficient Resources");

    public static final SqlStateRootClass X54 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "54", "Program Limit Exceeded");

    public static final SqlStateRootClass X55 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "55", "Object Not In Prerequisite State");

    public static final SqlStateRootClass X57 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "57", "Operator Intervention");

    public static final SqlStateRootClass X58 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "58", "System Error");

    public static final SqlStateRootClass X72 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "72", "Snapshot Failure");

    public static final SqlStateRootClass XF0 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "F0", "Configuration File Error");

    public static final SqlStateRootClass XHV =
        SqlStateCategory.EXCEPTION.newRootClass(
            "HV", "Foreign Data Wrapper Error");

    public static final SqlStateRootClass XP0 =
        SqlStateCategory.EXCEPTION.newRootClass(
            "P0", "PL/pgSQL Error");

    public static final SqlStateRootClass XXX =
        SqlStateCategory.EXCEPTION.newRootClass(
            "XX", "Internal Error");

    public static final SqlStateRootClass SUCCESSFUL_COMPLETION = S00;
    public static final SqlStateRootClass WARNING = W01;
    public static final SqlStateRootClass NO_DATA = N02;
    public static final SqlStateRootClass SQL_STATEMENT_NOT_COMPLETE = X03;
    public static final SqlStateRootClass CONNECTION_EXCEPTION = X08;
    public static final SqlStateRootClass TRIGGERED_ACTION_EXCEPTION = X09;
    public static final SqlStateRootClass FEATURE_NOT_SUPPORTED = X0A;
    public static final SqlStateRootClass INVALID_TRANSACTION_INITIATION = X0B;
    public static final SqlStateRootClass LOCATOR_EXCEPTION = X0F;
    public static final SqlStateRootClass INVALID_GRANTOR = X0L;
    public static final SqlStateRootClass INVALID_ROLE_SPECIFICATION = X0P;
    public static final SqlStateRootClass DIAGNOSTICS_EXCEPTION = X0Z;
    public static final SqlStateRootClass CASE_NOT_FOUND = X20;
    public static final SqlStateRootClass CARDINALITY_VIOLATION = X21;
    public static final SqlStateRootClass DATA_EXCEPTION = X22;
    public static final SqlStateRootClass SYSTEM_ERROR = X58;
    public static final SqlStateRootClass SNAPSHOT_FAILURE = X72;
    public static final SqlStateRootClass CONFIGURATION_FILE_ERROR = XF0;
    public static final SqlStateRootClass FOREIGN_DATA_WRAPPER_ERROR = XHV;
    public static final SqlStateRootClass PL_PGSQL_ERROR = XP0;
    public static final SqlStateRootClass INTERNAL_ERROR = XXX;

}
