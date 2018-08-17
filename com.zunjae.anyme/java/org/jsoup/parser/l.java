package org.jsoup.parser;

enum l extends a {
    l(String str, int i) {
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
        } else if (aaVar.c()) {
            a aVar;
            ag agVar = (ag) aaVar;
            String l = agVar.l();
            if (l.equals("html")) {
                aVar = InBody;
            } else if (l.equals("frameset")) {
                htmlTreeBuilder.a(agVar);
            } else if (l.equals("frame")) {
                htmlTreeBuilder.b(agVar);
            } else if (l.equals("noframes")) {
                aVar = InHead;
            } else {
                htmlTreeBuilder.b((a) this);
                return false;
            }
            return htmlTreeBuilder.a((aa) agVar, aVar);
        } else if (aaVar.d() && ((af) aaVar).l().equals("frameset")) {
            if (htmlTreeBuilder.y().nodeName().equals("html")) {
                htmlTreeBuilder.b((a) this);
                return false;
            }
            htmlTreeBuilder.i();
            if (!(htmlTreeBuilder.h() || htmlTreeBuilder.y().nodeName().equals("frameset"))) {
                htmlTreeBuilder.a(AfterFrameset);
            }
        } else if (!aaVar.g()) {
            htmlTreeBuilder.b((a) this);
            return false;
        } else if (!htmlTreeBuilder.y().nodeName().equals("html")) {
            htmlTreeBuilder.b((a) this);
        }
        return true;
    }
}
