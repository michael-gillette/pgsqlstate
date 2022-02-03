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

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SqlStateEntityTest {

    final SqlStateRootClass rootClass = SqlStateCategory.SUCCESS.newRootClass("00", "a");
    final SqlStateLeafClass leafClass = new SqlStateLeafClass("000", "b");
    final SqlStateEntity subject = new SqlStateEntity(rootClass, leafClass);

    @Nested
    @DisplayName("constructor(SqlStateRootClass, SqlStateLeafClass)")
    class PrimaryConstructorTest {

        @Test
        void requiresRootClassToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "rootClass is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateEntity(null, leafClass)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

        @Test
        void requiresLeafClassToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "leafClass is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateEntity(rootClass, null)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

    }
    @Nested
    @DisplayName("constructor(SqlStateRootClass, String, String)")
    class FactoryConstructorTest {

        final String code = leafClass.getCode();
        final String text = leafClass.getText();

        @Test
        void requiresRootClassToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "rootClass is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateEntity(null, code, text)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

        @Test
        void requiresCodeToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "code is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateEntity(rootClass, null, text)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

        @Test
        void requiresTextToBeNonNull() {
            Class<NullPointerException> expectedErr = NullPointerException.class;
            String expectedMsg = "text is required.";

            Exception actualErr = assertThrows(
                expectedErr, () -> new SqlStateEntity(rootClass, code, null)
            );

            assertEquals(expectedMsg, actualErr.getMessage());
        }

    }

    @Test
    @DisplayName("equals() and hashCode()")
    void equalsAndHashcode() {
        SqlStateEntity one = new SqlStateEntity(rootClass, leafClass);
        SqlStateEntity two = new SqlStateEntity(rootClass, leafClass);

        assertEquals(one, two);
        assertEquals(one.hashCode(), two.hashCode());
    }

    @Test
    @DisplayName("toString()")
    void toStringMethod() {
        SqlStateEntity one = new SqlStateEntity(rootClass, leafClass);
        String expected = String.format(
            "SqlState[rootClass=%s, leafClass=%s, sqlState='00000']",
            rootClass, leafClass
        );

        assertEquals(one.toString(), expected);
    }

    @Test
    void getCategory() {
        assertEquals(subject.getCategory(), rootClass.getCategory());
    }

    @Test
    void getRootClass() {
        assertEquals(subject.getRootClass(), rootClass);
    }

    @Test
    void getLeafClass() {
        assertEquals(subject.getLeafClass(), leafClass);
    }

    @Test
    void getCode() {
        assertEquals(
            subject.getCode(),
            subject.getRootClass().getCode() + subject.getLeafClass().getCode()
        );
    }

}
