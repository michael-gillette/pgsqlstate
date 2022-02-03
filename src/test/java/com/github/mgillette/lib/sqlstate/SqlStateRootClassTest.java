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

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SqlStateRootClassTest {

    @Nested
    @DisplayName("constructor(SqlStateCategory, String, String)")
    class PrimaryConstructorTest {

        final SqlStateCategory category = SqlStateCategory.EXCEPTION;
        final String code = "05";
        final String text = "test";

        @Test
        void requiresCategoryToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "category is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateRootClass(null, code, text)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

        @Test
        void requiresCodeToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "code is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateRootClass(category, null, text)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

        @Test
        void requiresTextToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "text is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateRootClass(category, code, null)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

        @ParameterizedTest
        @EmptySource
        @ValueSource(strings = {
            "0",
            "000",
        })
        void requiresCodeToBe2Characters(String code) {
            Class<IllegalArgumentException> expectedErr = IllegalArgumentException.class;
            String expectedMsg = "code must be 2 characters.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateRootClass(category, code, text)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

    }

    @Test
    @DisplayName("equals() and hashCode()")
    void equalsAndHashcode() {
        SqlStateRootClass one = SqlStateCategory.NO_DATA.newRootClass("02", "");
        SqlStateRootClass two = SqlStateCategory.NO_DATA.newRootClass("02", "");

        assertEquals(one, two);
        assertEquals(one.hashCode(), two.hashCode());
    }

    @Test
    @DisplayName("toString()")
    void toStringMethod() {
        SqlStateRootClass one = SqlStateCategory.NO_DATA.newRootClass("02", "");
        String expected = "SqlStateRootClass[category=NO_DATA, code='02', text='']";

        assertEquals(one.toString(), expected);
    }

}
