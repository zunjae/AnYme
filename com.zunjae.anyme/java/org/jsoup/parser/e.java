package org.jsoup.parser;

import defpackage.mh;
import defpackage.tw;

enum e extends a {
    e(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, da daVar) {
        return daVar.m("colgroup") ? daVar.a(aaVar) : true;
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (a.isWhitespace(aaVar)) {
            htmlTreeBuilder.a((ab) aaVar);
            return true;
        }
        int i = r.a[aaVar.a.ordinal()];
        if (i == 6) {
            return htmlTreeBuilder.y().nodeName().equals("html") ? true : anythingElse(aaVar, htmlTreeBuilder);
        } else {
            switch (i) {
                case tw.a /*1*/:
                    htmlTreeBuilder.a((ac) aaVar);
                    break;
                case tw.b /*2*/:
                    htmlTreeBuilder.b((a) this);
                    break;
                case f.c /*3*/:
                    ag agVar = (ag) aaVar;
                    String l = agVar.l();
                    if (l.equals("html")) {
                        return htmlTreeBuilder.a(aaVar, InBody);
                    }
                    if (l.equals("col")) {
                        htmlTreeBuilder.b(agVar);
                        break;
                    }
                    return anythingElse(aaVar, htmlTreeBuilder);
                case mh.d /*4*/:
                    if (((af) aaVar).l().equals("colgroup")) {
                        if (!htmlTreeBuilder.y().nodeName().equals("html")) {
                            htmlTreeBuilder.i();
                            htmlTreeBuilder.a(InTable);
                            break;
                        }
                        htmlTreeBuilder.b((a) this);
                        return false;
                    }
                    return anythingElse(aaVar, htmlTreeBuilder);
                default:
                    return anythingElse(aaVar, htmlTreeBuilder);
            }
            return true;
        }
    }
}
