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

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.nio.file.Path;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class PgSqlStateIT {

    static final String ORIGIN = "https://www.postgresql.org/docs/current/errcodes-appendix.html";

    @Test
    void verifyAllCodesRepresented(@TempDir Path tmpDir) throws Exception {
        Set<String> expectCodes = determinePostgresCodes(tmpDir);
        Set<String> actualCodes = Stream.of(PgSqlState.values())
            .map(PgSqlState::getCode)
            .collect(Collectors.toSet());

        assertThat(actualCodes)
            .containsExactlyInAnyOrderElementsOf(expectCodes);
    }

    @SuppressWarnings("CommentedOutCode")
    private Set<String> determinePostgresCodes(Path tmpDir) throws Exception {
        Document document = Jsoup.connect(ORIGIN).get();

//        document.select("#ERRCODES-TABLE tr:has(code)")
//            .forEach(it -> {
//                Element code = it.selectFirst(".literal");
//                Element text = it.selectFirst(".symbol");
//
//                if (code == null || text == null) {
//                    return;
//                }
//
//                System.out.printf(
//                    "%s(\n    PgSqlStateClass.X%s, \"%s\"),\n\n",
//                    text.text().toUpperCase(),
//                    code.text().substring(0, 2),
//                    code.text().substring(2)
//                );
//            });

        return document.select("td > code.literal")
            .stream()
            .map(Element::text)
            .collect(Collectors.toSet());
    }

}
