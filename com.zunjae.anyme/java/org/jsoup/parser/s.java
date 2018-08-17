package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum s extends a {
    s(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (a.isWhitespace(aaVar)) {
            return true;
        }
        if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else if (aaVar.b()) {
            htmlTreeBuilder.b((a) this);
            return false;
        } else if (aaVar.c() && ((ag) aaVar).l().equals("html")) {
            return InBody.process(aaVar, htmlTreeBuilder);
        } else {
            if (aaVar.c()) {
                ag agVar = (ag) aaVar;
                if (agVar.l().equals("head")) {
                    htmlTreeBuilder.f(htmlTreeBuilder.a(agVar));
                    htmlTreeBuilder.a(InHead);
                }
            }
            if (aaVar.d() && StringUtil.in(((af) aaVar).l(), "head", "body", "html", "br")) {
                htmlTreeBuilder.l("head");
                return htmlTreeBuilder.a(aaVar);
            } else if (aaVar.d()) {
                htmlTreeBuilder.b((a) this);
                return false;
            } else {
                htmlTreeBuilder.l("head");
                return htmlTreeBuilder.a(aaVar);
            }
        }
        return true;
    }
}
