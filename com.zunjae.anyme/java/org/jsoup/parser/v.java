package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

enum v extends a {
    v(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.l("body");
        htmlTreeBuilder.a(true);
        return htmlTreeBuilder.a(aaVar);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (a.isWhitespace(aaVar)) {
            htmlTreeBuilder.a((ab) aaVar);
        } else if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else if (aaVar.b()) {
            htmlTreeBuilder.b((a) this);
        } else {
            if (aaVar.c()) {
                ag agVar = (ag) aaVar;
                String l = agVar.l();
                if (l.equals("html")) {
                    return htmlTreeBuilder.a(aaVar, InBody);
                }
                a aVar;
                if (l.equals("body")) {
                    htmlTreeBuilder.a(agVar);
                    htmlTreeBuilder.a(false);
                    aVar = InBody;
                } else if (l.equals("frameset")) {
                    htmlTreeBuilder.a(agVar);
                    aVar = InFrameset;
                } else if (StringUtil.in(l, "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title")) {
                    htmlTreeBuilder.b((a) this);
                    Element o = htmlTreeBuilder.o();
                    htmlTreeBuilder.b(o);
                    htmlTreeBuilder.a(aaVar, InHead);
                    htmlTreeBuilder.d(o);
                } else if (l.equals("head")) {
                    htmlTreeBuilder.b((a) this);
                    return false;
                }
                htmlTreeBuilder.a(aVar);
            } else if (aaVar.d()) {
                if (!StringUtil.in(((af) aaVar).l(), "body", "html")) {
                    htmlTreeBuilder.b((a) this);
                    return false;
                }
            }
            anythingElse(aaVar, htmlTreeBuilder);
        }
        return true;
    }
}
