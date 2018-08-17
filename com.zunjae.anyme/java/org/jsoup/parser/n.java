package org.jsoup.parser;

enum n extends a {
    n(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (a.isWhitespace(aaVar)) {
            htmlTreeBuilder.a((ab) aaVar);
        } else if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else if (aaVar.b()) {
            htmlTreeBuilder.b((a) this);
            return false;
        } else {
            a aVar;
            if (aaVar.c() && ((ag) aaVar).l().equals("html")) {
                aVar = InBody;
            } else if (aaVar.d() && ((af) aaVar).l().equals("html")) {
                htmlTreeBuilder.a(AfterAfterFrameset);
            } else if (aaVar.c() && ((ag) aaVar).l().equals("noframes")) {
                aVar = InHead;
            } else if (!aaVar.g()) {
                htmlTreeBuilder.b((a) this);
                return false;
            }
            return htmlTreeBuilder.a(aaVar, aVar);
        }
        return true;
    }
}
