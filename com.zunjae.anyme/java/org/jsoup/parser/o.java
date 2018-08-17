package org.jsoup.parser;

enum o extends a {
    o(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else {
            if (!(aaVar.b() || a.isWhitespace(aaVar))) {
                if (!aaVar.c() || !((ag) aaVar).l().equals("html")) {
                    if (!aaVar.g()) {
                        htmlTreeBuilder.b((a) this);
                        htmlTreeBuilder.a(InBody);
                        return htmlTreeBuilder.a(aaVar);
                    }
                }
            }
            return htmlTreeBuilder.a(aaVar, InBody);
        }
        return true;
    }
}
