package org.jsoup.parser;

enum p extends a {
    p(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else {
            if (!(aaVar.b() || a.isWhitespace(aaVar))) {
                if (!aaVar.c() || !((ag) aaVar).l().equals("html")) {
                    if (!aaVar.g()) {
                        if (aaVar.c() && ((ag) aaVar).l().equals("noframes")) {
                            return htmlTreeBuilder.a(aaVar, InHead);
                        }
                        htmlTreeBuilder.b((a) this);
                        return false;
                    }
                }
            }
            return htmlTreeBuilder.a(aaVar, InBody);
        }
        return true;
    }
}
