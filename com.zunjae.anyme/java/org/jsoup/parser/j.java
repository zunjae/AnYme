package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum j extends a {
    j(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.c() && StringUtil.in(((ag) aaVar).l(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
            htmlTreeBuilder.b((a) this);
            htmlTreeBuilder.m("select");
            return htmlTreeBuilder.a(aaVar);
        }
        if (aaVar.d()) {
            af afVar = (af) aaVar;
            if (StringUtil.in(afVar.l(), "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th")) {
                htmlTreeBuilder.b((a) this);
                if (!htmlTreeBuilder.h(afVar.l())) {
                    return false;
                }
                htmlTreeBuilder.m("select");
                return htmlTreeBuilder.a(aaVar);
            }
        }
        return htmlTreeBuilder.a(aaVar, InSelect);
    }
}
