package org.jsoup.parser;

enum k extends a {
    k(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (a.isWhitespace(aaVar)) {
            return htmlTreeBuilder.a(aaVar, InBody);
        }
        if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else if (aaVar.b()) {
            htmlTreeBuilder.b((a) this);
            return false;
        } else if (aaVar.c() && ((ag) aaVar).l().equals("html")) {
            return htmlTreeBuilder.a(aaVar, InBody);
        } else {
            if (aaVar.d() && ((af) aaVar).l().equals("html")) {
                if (htmlTreeBuilder.h()) {
                    htmlTreeBuilder.b((a) this);
                    return false;
                }
                htmlTreeBuilder.a(AfterAfterBody);
            } else if (!aaVar.g()) {
                htmlTreeBuilder.b((a) this);
                htmlTreeBuilder.a(InBody);
                return htmlTreeBuilder.a(aaVar);
            }
        }
        return true;
    }
}
