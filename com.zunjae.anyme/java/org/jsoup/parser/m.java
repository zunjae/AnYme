package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum m extends a {
    m(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.a("html");
        htmlTreeBuilder.a(BeforeHead);
        return htmlTreeBuilder.a(aaVar);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.b()) {
            htmlTreeBuilder.b((a) this);
            return false;
        }
        if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else if (a.isWhitespace(aaVar)) {
            return true;
        } else {
            if (aaVar.c()) {
                ag agVar = (ag) aaVar;
                if (agVar.l().equals("html")) {
                    htmlTreeBuilder.a(agVar);
                    htmlTreeBuilder.a(BeforeHead);
                }
            }
            if (aaVar.d() && StringUtil.in(((af) aaVar).l(), "head", "body", "html", "br")) {
                return anythingElse(aaVar, htmlTreeBuilder);
            }
            if (!aaVar.d()) {
                return anythingElse(aaVar, htmlTreeBuilder);
            }
            htmlTreeBuilder.b((a) this);
            return false;
        }
        return true;
    }
}
