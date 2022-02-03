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
import java.util.StringJoiner;

/**
 * Sql State Entity
 *
 * @since 0.1.0
 */
public final class SqlStateEntity implements SqlState {

    private final SqlStateRootClass rootClass;
    private final SqlStateLeafClass leafClass;
    private final String sqlStateCode;

    public SqlStateEntity(
        SqlStateRootClass rootClass,
        SqlStateLeafClass leafClass
    ) {
        this.rootClass = Objects.requireNonNull(
            rootClass, "rootClass is required.");
        this.leafClass = Objects.requireNonNull(
            leafClass, "leafClass is required.");
        this.sqlStateCode = rootClass.getCode() + leafClass.getCode();
    }

    public SqlStateEntity(
        SqlStateRootClass rootClass,
        String code,
        String text
    ) {
        this(rootClass, new SqlStateLeafClass(code, text));
    }

    @Override
    public SqlStateCategory getCategory() {
        return rootClass.getCategory();
    }

    @Override
    public SqlStateClass getRootClass() {
        return rootClass;
    }

    @Override
    public SqlStateClass getLeafClass() {
        return leafClass;
    }

    @Override
    public String getCode() {
        return sqlStateCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SqlStateEntity sqlState = (SqlStateEntity) o;
        return
            rootClass.equals(sqlState.rootClass) &&
            leafClass.equals(sqlState.leafClass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rootClass, leafClass);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "SqlState[", "]")
            .add("rootClass=" + rootClass)
            .add("leafClass=" + leafClass)
            .add("sqlState='" + sqlStateCode + "'")
            .toString();
    }

}
