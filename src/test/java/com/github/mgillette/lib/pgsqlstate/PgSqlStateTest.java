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

import com.github.mgillette.lib.sqlstate.SqlStateLeafClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PgSqlStateTest {

    @Test
    void getRootClass() {
        assertEquals(
            PgSqlStateClass.SUCCESSFUL_COMPLETION,
            PgSqlState.SUCCESSFUL_COMPLETION.getRootClass()
        );
    }

    @Test
    void getLeafClass() {
        assertEquals(
            new SqlStateLeafClass("000", "successful_completion"),
            PgSqlState.SUCCESSFUL_COMPLETION.getLeafClass()
        );
    }

    @Test
    void getCode() {
        assertEquals(
            "00000",
            PgSqlState.SUCCESSFUL_COMPLETION.getCode()
        );
    }

}
