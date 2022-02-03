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
 * Sql State Class
 *
 * @since 0.1.0
 */
public final class SqlStateLeafClass implements SqlStateClass {

    private final String code;
    private final String text;

    public SqlStateLeafClass(String code, String text) {
        this.code = requireValidCode(code);
        this.text = Objects.requireNonNull(
            text, "text is required.");
    }

    /**
     * Code
     *
     * @return the SqlState class code
     */
    @Override
    public String getCode() {
        return code;
    }

    /**
     * Text
     *
     * @return the SqlState class text
     */
    @Override
    public String getText() {
        return text;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SqlStateLeafClass that = (SqlStateLeafClass) o;
        return Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", "SqlStateLeafClass[", "]")
            .add("code='" + code + "'")
            .add("text='" + text + "'")
            .toString();
    }

    private static final IllegalArgumentException CODE_NOT_3_CHARS =
        new IllegalArgumentException("code must be 3 characters.");

    private static String requireValidCode(String code) {
        Objects.requireNonNull(code, "code is required.");

        if (code.length() != 3) {
            throw CODE_NOT_3_CHARS;
        }

        return code;
    }
}
