package org.jsoup.parser;

enum x extends a {
    x(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.f()) {
            htmlTreeBuilder.a((ab) aaVar);
        } else if (aaVar.g()) {
            htmlTreeBuilder.b((a) this);
            htmlTreeBuilder.i();
            htmlTreeBuilder.a(htmlTreeBuilder.d());
            return htmlTreeBuilder.a(aaVar);
        } else if (aaVar.d()) {
            htmlTreeBuilder.i();
            htmlTreeBuilder.a(htmlTreeBuilder.d());
        }
        return true;
    }
}
