package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum a {
    Initial,
    BeforeHtml,
    BeforeHead,
    InHead,
    InHeadNoscript,
    AfterHead,
    InBody,
    Text,
    InTable,
    InTableText,
    InCaption,
    InColumnGroup,
    InTableBody,
    InRow,
    InCell,
    InSelect,
    InSelectInTable,
    AfterBody,
    InFrameset,
    AfterFrameset,
    AfterAfterBody,
    AfterAfterFrameset,
    ForeignContent;
    
    private static String nullString = "\u0000";

    private static void handleRawtext(ag agVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a(agVar);
        htmlTreeBuilder.c.a(ak.Rawtext);
        htmlTreeBuilder.c();
        htmlTreeBuilder.a(Text);
    }

    private static void handleRcData(ag agVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a(agVar);
        htmlTreeBuilder.c.a(ak.Rcdata);
        htmlTreeBuilder.c();
        htmlTreeBuilder.a(Text);
    }

    private static boolean isWhitespace(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!StringUtil.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isWhitespace(aa aaVar) {
        return aaVar.f() ? isWhitespace(((ab) aaVar).h()) : false;
    }

    abstract boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder);
}
