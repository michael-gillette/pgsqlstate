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
 * Sql State Root Class
 *
 * A {@link SqlStateClass} which is associated with a
 * {@link SqlStateCategory}.
 *
 * @since 0.1.0
 */
public final class SqlStateRootClass implements SqlStateClass {

    private final SqlStateCategory category;
    private final String code;
    private final String text;

    public SqlStateRootClass(SqlStateCategory category, String code, String text) {
        this.category = Objects.requireNonNull(
            category, "category is required.");
        this.code = requireValidCode(code);
        this.text = Objects.requireNonNull(
            text, "text is required.");
    }

    public SqlStateCategory getCategory() {
        return category;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SqlStateRootClass that = (SqlStateRootClass) o;
        return
            category == that.category &&
            Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, code);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "SqlStateRootClass[", "]")
            .add("category=" + category)
            .add("code='" + code + "'")
            .add("text='" + text + "'")
            .toString();
    }

    private static final IllegalArgumentException CODE_NOT_2_CHARS =
        new IllegalArgumentException("code must be 2 characters.");

    private static String requireValidCode(String code) {
        Objects.requireNonNull(code, "code is required.");

        if (code.length() != 2) {
            throw CODE_NOT_2_CHARS;
        }

        return code;
    }

}
