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

    STRING_DATA_RIGHT_TRUNCATION_WARNING(
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
        PgSqlStateClass.X0L, "P01"),


    INVALID_ROLE_SPECIFICATION(
        PgSqlStateClass.X0P, "000"),


    DIAGNOSTICS_EXCEPTION(
        PgSqlStateClass.X0Z, "000"),

    STACKED_DIAGNOSTICS_ACCESSED_WITHOUT_ACTIVE_HANDLER(
        PgSqlStateClass.X0Z, "002"),


    CASE_NOT_FOUND(
        PgSqlStateClass.X20, "000"),


    CARDINALITY_VIOLATION(
        PgSqlStateClass.X21, "000"),



    DATA_EXCEPTION(
        PgSqlStateClass.X22, "000"),

    ARRAY_SUBSCRIPT_ERROR(
        PgSqlStateClass.X22, "02E"),

    CHARACTER_NOT_IN_REPERTOIRE(
        PgSqlStateClass.X22, "021"),

    DATETIME_FIELD_OVERFLOW(
        PgSqlStateClass.X22, "008"),

    DIVISION_BY_ZERO(
        PgSqlStateClass.X22, "012"),

    ERROR_IN_ASSIGNMENT(
        PgSqlStateClass.X22, "005"),

    ESCAPE_CHARACTER_CONFLICT(
        PgSqlStateClass.X22, "00B"),

    INDICATOR_OVERFLOW(
        PgSqlStateClass.X22, "022"),

    INTERVAL_FIELD_OVERFLOW(
        PgSqlStateClass.X22, "015"),

    INVALID_ARGUMENT_FOR_LOGARITHM(
        PgSqlStateClass.X22, "01E"),

    INVALID_ARGUMENT_FOR_NTILE_FUNCTION(
        PgSqlStateClass.X22, "014"),

    INVALID_ARGUMENT_FOR_NTH_VALUE_FUNCTION(
        PgSqlStateClass.X22, "016"),

    INVALID_ARGUMENT_FOR_POWER_FUNCTION(
        PgSqlStateClass.X22, "01F"),

    INVALID_ARGUMENT_FOR_WIDTH_BUCKET_FUNCTION(
        PgSqlStateClass.X22, "01G"),

    INVALID_CHARACTER_VALUE_FOR_CAST(
        PgSqlStateClass.X22, "018"),

    INVALID_DATETIME_FORMAT(
        PgSqlStateClass.X22, "007"),

    INVALID_ESCAPE_CHARACTER(
        PgSqlStateClass.X22, "019"),

    INVALID_ESCAPE_OCTET(
        PgSqlStateClass.X22, "00D"),

    INVALID_ESCAPE_SEQUENCE(
        PgSqlStateClass.X22, "025"),

    NONSTANDARD_USE_OF_ESCAPE_CHARACTER(
        PgSqlStateClass.X22, "P06"),

    INVALID_INDICATOR_PARAMETER_VALUE(
        PgSqlStateClass.X22, "010"),

    INVALID_PARAMETER_VALUE(
        PgSqlStateClass.X22, "023"),

    INVALID_PRECEDING_OR_FOLLOWING_SIZE(
        PgSqlStateClass.X22, "013"),

    INVALID_REGULAR_EXPRESSION(
        PgSqlStateClass.X22, "01B"),

    INVALID_ROW_COUNT_IN_LIMIT_CLAUSE(
        PgSqlStateClass.X22, "01W"),

    INVALID_ROW_COUNT_IN_RESULT_OFFSET_CLAUSE(
        PgSqlStateClass.X22, "01X"),

    INVALID_TABLESAMPLE_ARGUMENT(
        PgSqlStateClass.X22, "02H"),

    INVALID_TABLESAMPLE_REPEAT(
        PgSqlStateClass.X22, "02G"),

    INVALID_TIME_ZONE_DISPLACEMENT_VALUE(
        PgSqlStateClass.X22, "009"),

    INVALID_USE_OF_ESCAPE_CHARACTER(
        PgSqlStateClass.X22, "00C"),

    MOST_SPECIFIC_TYPE_MISMATCH(
        PgSqlStateClass.X22, "00G"),

    NULL_VALUE_NOT_ALLOWED(
        PgSqlStateClass.X22, "004"),

    NULL_VALUE_NO_INDICATOR_PARAMETER(
        PgSqlStateClass.X22, "002"),

    NUMERIC_VALUE_OUT_OF_RANGE(
        PgSqlStateClass.X22, "003"),

    SEQUENCE_GENERATOR_LIMIT_EXCEEDED(
        PgSqlStateClass.X22, "00H"),

    STRING_DATA_LENGTH_MISMATCH(
        PgSqlStateClass.X22, "026"),

    STRING_DATA_RIGHT_TRUNCATION(
        PgSqlStateClass.X22, "001"),

    SUBSTRING_ERROR(
        PgSqlStateClass.X22, "011"),

    TRIM_ERROR(
        PgSqlStateClass.X22, "027"),

    UNTERMINATED_C_STRING(
        PgSqlStateClass.X22, "024"),

    ZERO_LENGTH_CHARACTER_STRING(
        PgSqlStateClass.X22, "00F"),

    FLOATING_POINT_EXCEPTION(
        PgSqlStateClass.X22, "P01"),

    INVALID_TEXT_REPRESENTATION(
        PgSqlStateClass.X22, "P02"),

    INVALID_BINARY_REPRESENTATION(
        PgSqlStateClass.X22, "P03"),

    BAD_COPY_FILE_FORMAT(
        PgSqlStateClass.X22, "P04"),

    UNTRANSLATABLE_CHARACTER(
        PgSqlStateClass.X22, "P05"),

    NOT_AN_XML_DOCUMENT(
        PgSqlStateClass.X22, "00L"),

    INVALID_XML_DOCUMENT(
        PgSqlStateClass.X22, "00M"),

    INVALID_XML_CONTENT(
        PgSqlStateClass.X22, "00N"),

    INVALID_XML_COMMENT(
        PgSqlStateClass.X22, "00S"),

    INVALID_XML_PROCESSING_INSTRUCTION(
        PgSqlStateClass.X22, "00T"),

    DUPLICATE_JSON_OBJECT_KEY_VALUE(
        PgSqlStateClass.X22, "030"),

    INVALID_ARGUMENT_FOR_SQL_JSON_DATETIME_FUNCTION(
        PgSqlStateClass.X22, "031"),

    INVALID_JSON_TEXT(
        PgSqlStateClass.X22, "032"),

    INVALID_SQL_JSON_SUBSCRIPT(
        PgSqlStateClass.X22, "033"),

    MORE_THAN_ONE_SQL_JSON_ITEM(
        PgSqlStateClass.X22, "034"),

    NO_SQL_JSON_ITEM(
        PgSqlStateClass.X22, "035"),

    NON_NUMERIC_SQL_JSON_ITEM(
        PgSqlStateClass.X22, "036"),

    NON_UNIQUE_KEYS_IN_A_JSON_OBJECT(
        PgSqlStateClass.X22, "037"),

    SINGLETON_SQL_JSON_ITEM_REQUIRED(
        PgSqlStateClass.X22, "038"),

    SQL_JSON_ARRAY_NOT_FOUND(
        PgSqlStateClass.X22, "039"),

    SQL_JSON_MEMBER_NOT_FOUND(
        PgSqlStateClass.X22, "03A"),

    SQL_JSON_NUMBER_NOT_FOUND(
        PgSqlStateClass.X22, "03B"),

    SQL_JSON_OBJECT_NOT_FOUND(
        PgSqlStateClass.X22, "03C"),

    TOO_MANY_JSON_ARRAY_ELEMENTS(
        PgSqlStateClass.X22, "03D"),

    TOO_MANY_JSON_OBJECT_MEMBERS(
        PgSqlStateClass.X22, "03E"),

    SQL_JSON_SCALAR_REQUIRED(
        PgSqlStateClass.X22, "03F"),


    INTEGRITY_CONSTRAINT_VIOLATION(
        PgSqlStateClass.X23, "000"),

    RESTRICT_VIOLATION(
        PgSqlStateClass.X23, "001"),

    NOT_NULL_VIOLATION(
        PgSqlStateClass.X23, "502"),

    FOREIGN_KEY_VIOLATION(
        PgSqlStateClass.X23, "503"),

    UNIQUE_VIOLATION(
        PgSqlStateClass.X23, "505"),

    CHECK_VIOLATION(
        PgSqlStateClass.X23, "514"),

    EXCLUSION_VIOLATION(
        PgSqlStateClass.X23, "P01"),


    INVALID_CURSOR_STATE(
        PgSqlStateClass.X24, "000"),


    INVALID_TRANSACTION_STATE(
        PgSqlStateClass.X25, "000"),

    ACTIVE_SQL_TRANSACTION(
        PgSqlStateClass.X25, "001"),

    BRANCH_TRANSACTION_ALREADY_ACTIVE(
        PgSqlStateClass.X25, "002"),

    HELD_CURSOR_REQUIRES_SAME_ISOLATION_LEVEL(
        PgSqlStateClass.X25, "008"),

    INAPPROPRIATE_ACCESS_MODE_FOR_BRANCH_TRANSACTION(
        PgSqlStateClass.X25, "003"),

    INAPPROPRIATE_ISOLATION_LEVEL_FOR_BRANCH_TRANSACTION(
        PgSqlStateClass.X25, "004"),

    NO_ACTIVE_SQL_TRANSACTION_FOR_BRANCH_TRANSACTION(
        PgSqlStateClass.X25, "005"),

    READ_ONLY_SQL_TRANSACTION(
        PgSqlStateClass.X25, "006"),

    SCHEMA_AND_DATA_STATEMENT_MIXING_NOT_SUPPORTED(
        PgSqlStateClass.X25, "007"),

    NO_ACTIVE_SQL_TRANSACTION(
        PgSqlStateClass.X25, "P01"),

    IN_FAILED_SQL_TRANSACTION(
        PgSqlStateClass.X25, "P02"),

    IDLE_IN_TRANSACTION_SESSION_TIMEOUT(
        PgSqlStateClass.X25, "P03"),


    INVALID_SQL_STATEMENT_NAME(
        PgSqlStateClass.X26, "000"),


    TRIGGERED_DATA_CHANGE_VIOLATION(
        PgSqlStateClass.X27, "000"),


    INVALID_AUTHORIZATION_SPECIFICATION(
        PgSqlStateClass.X28, "000"),

    INVALID_PASSWORD(
        PgSqlStateClass.X28, "P01"),


    DEPENDENT_PRIVILEGE_DESCRIPTORS_STILL_EXIST(
        PgSqlStateClass.X2B, "000"),

    DEPENDENT_OBJECTS_STILL_EXIST(
        PgSqlStateClass.X2B, "P01"),


    INVALID_TRANSACTION_TERMINATION(
        PgSqlStateClass.X2D, "000"),


    SQL_ROUTINE_EXCEPTION(
        PgSqlStateClass.X2F, "000"),

    FUNCTION_EXECUTED_NO_RETURN_STATEMENT(
        PgSqlStateClass.X2F, "005"),

    MODIFYING_SQL_DATA_NOT_PERMITTED(
        PgSqlStateClass.X2F, "002"),

    PROHIBITED_SQL_STATEMENT_ATTEMPTED(
        PgSqlStateClass.X2F, "003"),

    READING_SQL_DATA_NOT_PERMITTED(
        PgSqlStateClass.X2F, "004"),


    INVALID_CURSOR_NAME(
        PgSqlStateClass.X34, "000"),


    EXTERNAL_ROUTINE_EXCEPTION(
        PgSqlStateClass.X38, "000"),

    CONTAINING_SQL_NOT_PERMITTED(
        PgSqlStateClass.X38, "001"),

    MODIFYING_SQL_DATA_NOT_PERMITTED_EXT(
        PgSqlStateClass.X38, "002"),

    PROHIBITED_SQL_STATEMENT_ATTEMPTED_EXT(
        PgSqlStateClass.X38, "003"),

    READING_SQL_DATA_NOT_PERMITTED_EXT(
        PgSqlStateClass.X38, "004"),


    EXTERNAL_ROUTINE_INVOCATION_EXCEPTION(
        PgSqlStateClass.X39, "000"),

    INVALID_SQLSTATE_RETURNED(
        PgSqlStateClass.X39, "001"),

    NULL_VALUE_NOT_ALLOWED_EXT(
        PgSqlStateClass.X39, "004"),

    TRIGGER_PROTOCOL_VIOLATED(
        PgSqlStateClass.X39, "P01"),

    SRF_PROTOCOL_VIOLATED(
        PgSqlStateClass.X39, "P02"),

    EVENT_TRIGGER_PROTOCOL_VIOLATED(
        PgSqlStateClass.X39, "P03"),


    SAVEPOINT_EXCEPTION(
        PgSqlStateClass.X3B, "000"),

    INVALID_SAVEPOINT_SPECIFICATION(
        PgSqlStateClass.X3B, "001"),


    INVALID_CATALOG_NAME(
        PgSqlStateClass.X3D, "000"),


    INVALID_SCHEMA_NAME(
        PgSqlStateClass.X3F, "000"),


    TRANSACTION_ROLLBACK(
        PgSqlStateClass.X40, "000"),

    TRANSACTION_INTEGRITY_CONSTRAINT_VIOLATION(
        PgSqlStateClass.X40, "002"),

    SERIALIZATION_FAILURE(
        PgSqlStateClass.X40, "001"),

    STATEMENT_COMPLETION_UNKNOWN(
        PgSqlStateClass.X40, "003"),

    DEADLOCK_DETECTED(
        PgSqlStateClass.X40, "P01"),


    SYNTAX_ERROR_OR_ACCESS_RULE_VIOLATION(
        PgSqlStateClass.X42, "000"),

    SYNTAX_ERROR(
        PgSqlStateClass.X42, "601"),

    INSUFFICIENT_PRIVILEGE(
        PgSqlStateClass.X42, "501"),

    CANNOT_COERCE(
        PgSqlStateClass.X42, "846"),

    GROUPING_ERROR(
        PgSqlStateClass.X42, "803"),

    WINDOWING_ERROR(
        PgSqlStateClass.X42, "P20"),

    INVALID_RECURSION(
        PgSqlStateClass.X42, "P19"),

    INVALID_FOREIGN_KEY(
        PgSqlStateClass.X42, "830"),

    INVALID_NAME(
        PgSqlStateClass.X42, "602"),

    NAME_TOO_LONG(
        PgSqlStateClass.X42, "622"),

    RESERVED_NAME(
        PgSqlStateClass.X42, "939"),

    DATATYPE_MISMATCH(
        PgSqlStateClass.X42, "804"),

    INDETERMINATE_DATATYPE(
        PgSqlStateClass.X42, "P18"),

    COLLATION_MISMATCH(
        PgSqlStateClass.X42, "P21"),

    INDETERMINATE_COLLATION(
        PgSqlStateClass.X42, "P22"),

    WRONG_OBJECT_TYPE(
        PgSqlStateClass.X42, "809"),

    GENERATED_ALWAYS(
        PgSqlStateClass.X42, "8C9"),

    UNDEFINED_COLUMN(
        PgSqlStateClass.X42, "703"),

    UNDEFINED_FUNCTION(
        PgSqlStateClass.X42, "883"),

    UNDEFINED_TABLE(
        PgSqlStateClass.X42, "P01"),

    UNDEFINED_PARAMETER(
        PgSqlStateClass.X42, "P02"),

    UNDEFINED_OBJECT(
        PgSqlStateClass.X42, "704"),

    DUPLICATE_COLUMN(
        PgSqlStateClass.X42, "701"),

    DUPLICATE_CURSOR(
        PgSqlStateClass.X42, "P03"),

    DUPLICATE_DATABASE(
        PgSqlStateClass.X42, "P04"),

    DUPLICATE_FUNCTION(
        PgSqlStateClass.X42, "723"),

    DUPLICATE_PREPARED_STATEMENT(
        PgSqlStateClass.X42, "P05"),

    DUPLICATE_SCHEMA(
        PgSqlStateClass.X42, "P06"),

    DUPLICATE_TABLE(
        PgSqlStateClass.X42, "P07"),

    DUPLICATE_ALIAS(
        PgSqlStateClass.X42, "712"),

    DUPLICATE_OBJECT(
        PgSqlStateClass.X42, "710"),

    AMBIGUOUS_COLUMN(
        PgSqlStateClass.X42, "702"),

    AMBIGUOUS_FUNCTION(
        PgSqlStateClass.X42, "725"),

    AMBIGUOUS_PARAMETER(
        PgSqlStateClass.X42, "P08"),

    AMBIGUOUS_ALIAS(
        PgSqlStateClass.X42, "P09"),

    INVALID_COLUMN_REFERENCE(
        PgSqlStateClass.X42, "P10"),

    INVALID_COLUMN_DEFINITION(
        PgSqlStateClass.X42, "611"),

    INVALID_CURSOR_DEFINITION(
        PgSqlStateClass.X42, "P11"),

    INVALID_DATABASE_DEFINITION(
        PgSqlStateClass.X42, "P12"),

    INVALID_FUNCTION_DEFINITION(
        PgSqlStateClass.X42, "P13"),

    INVALID_PREPARED_STATEMENT_DEFINITION(
        PgSqlStateClass.X42, "P14"),

    INVALID_SCHEMA_DEFINITION(
        PgSqlStateClass.X42, "P15"),

    INVALID_TABLE_DEFINITION(
        PgSqlStateClass.X42, "P16"),

    INVALID_OBJECT_DEFINITION(
        PgSqlStateClass.X42, "P17"),


    WITH_CHECK_OPTION_VIOLATION(
        PgSqlStateClass.X44, "000"),


    INSUFFICIENT_RESOURCES(
        PgSqlStateClass.X53, "000"),

    DISK_FULL(
        PgSqlStateClass.X53, "100"),

    OUT_OF_MEMORY(
        PgSqlStateClass.X53, "200"),

    TOO_MANY_CONNECTIONS(
        PgSqlStateClass.X53, "300"),

    CONFIGURATION_LIMIT_EXCEEDED(
        PgSqlStateClass.X53, "400"),


    PROGRAM_LIMIT_EXCEEDED(
        PgSqlStateClass.X54, "000"),

    STATEMENT_TOO_COMPLEX(
        PgSqlStateClass.X54, "001"),

    TOO_MANY_COLUMNS(
        PgSqlStateClass.X54, "011"),

    TOO_MANY_ARGUMENTS(
        PgSqlStateClass.X54, "023"),


    OBJECT_NOT_IN_PREREQUISITE_STATE(
        PgSqlStateClass.X55, "000"),

    OBJECT_IN_USE(
        PgSqlStateClass.X55, "006"),

    CANT_CHANGE_RUNTIME_PARAM(
        PgSqlStateClass.X55, "P02"),

    LOCK_NOT_AVAILABLE(
        PgSqlStateClass.X55, "P03"),

    UNSAFE_NEW_ENUM_VALUE_USAGE(
        PgSqlStateClass.X55, "P04"),


    OPERATOR_INTERVENTION(
        PgSqlStateClass.X57, "000"),

    QUERY_CANCELED(
        PgSqlStateClass.X57, "014"),

    ADMIN_SHUTDOWN(
        PgSqlStateClass.X57, "P01"),

    CRASH_SHUTDOWN(
        PgSqlStateClass.X57, "P02"),

    CANNOT_CONNECT_NOW(
        PgSqlStateClass.X57, "P03"),

    DATABASE_DROPPED(
        PgSqlStateClass.X57, "P04"),

    IDLE_SESSION_TIMEOUT(
        PgSqlStateClass.X57, "P05"),


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
