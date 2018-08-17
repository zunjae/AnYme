package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum h extends a {
    h(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        return htmlTreeBuilder.a(aaVar, InBody);
    }

    private void closeCell(HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.m(htmlTreeBuilder.h("td") ? "td" : "th");
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.d()) {
            String l = ((af) aaVar).l();
            if (StringUtil.in(l, "td", "th")) {
                if (htmlTreeBuilder.h(l)) {
                    htmlTreeBuilder.t();
                    if (!htmlTreeBuilder.y().nodeName().equals(l)) {
                        htmlTreeBuilder.b((a) this);
                    }
                    htmlTreeBuilder.c(l);
                    htmlTreeBuilder.v();
                    htmlTreeBuilder.a(InRow);
                    return true;
                }
                htmlTreeBuilder.b((a) this);
                htmlTreeBuilder.a(InRow);
                return false;
            } else if (StringUtil.in(l, "body", "caption", "col", "colgroup", "html")) {
                htmlTreeBuilder.b((a) this);
                return false;
            } else if (!StringUtil.in(l, "table", "tbody", "tfoot", "thead", "tr")) {
                return anythingElse(aaVar, htmlTreeBuilder);
            } else {
                if (!htmlTreeBuilder.h(l)) {
                    htmlTreeBuilder.b((a) this);
                    return false;
                }
            }
        } else if (!aaVar.c() || !StringUtil.in(((ag) aaVar).l(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) {
            return anythingElse(aaVar, htmlTreeBuilder);
        } else {
            if (!(htmlTreeBuilder.h("td") || htmlTreeBuilder.h("th"))) {
                htmlTreeBuilder.b((a) this);
                return false;
            }
        }
        closeCell(htmlTreeBuilder);
        return htmlTreeBuilder.a(aaVar);
    }
}
