package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum d extends a {
    d(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.d()) {
            af afVar = (af) aaVar;
            if (afVar.l().equals("caption")) {
                if (htmlTreeBuilder.h(afVar.l())) {
                    htmlTreeBuilder.t();
                    if (!htmlTreeBuilder.y().nodeName().equals("caption")) {
                        htmlTreeBuilder.b((a) this);
                    }
                    htmlTreeBuilder.c("caption");
                    htmlTreeBuilder.v();
                    htmlTreeBuilder.a(InTable);
                    return true;
                }
                htmlTreeBuilder.b((a) this);
                return false;
            }
        }
        if ((aaVar.c() && StringUtil.in(((ag) aaVar).l(), "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr")) || (aaVar.d() && ((af) aaVar).l().equals("table"))) {
            htmlTreeBuilder.b((a) this);
            if (htmlTreeBuilder.m("caption")) {
                return htmlTreeBuilder.a(aaVar);
            }
            return true;
        } else if (!aaVar.d() || !StringUtil.in(((af) aaVar).l(), "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
            return htmlTreeBuilder.a(aaVar, InBody);
        } else {
            htmlTreeBuilder.b((a) this);
            return false;
        }
    }
}
