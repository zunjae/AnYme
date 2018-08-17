package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum u extends a {
    u(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.b((a) this);
        htmlTreeBuilder.a(new ab().a(aaVar.toString()));
        return true;
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.b()) {
            htmlTreeBuilder.b((a) this);
        } else if (aaVar.c() && ((ag) aaVar).l().equals("html")) {
            return htmlTreeBuilder.a(aaVar, InBody);
        } else {
            if (aaVar.d() && ((af) aaVar).l().equals("noscript")) {
                htmlTreeBuilder.i();
                htmlTreeBuilder.a(InHead);
            } else {
                if (!(a.isWhitespace(aaVar) || aaVar.e())) {
                    if (!aaVar.c() || !StringUtil.in(((ag) aaVar).l(), "basefont", "bgsound", "link", "meta", "noframes", "style")) {
                        if (aaVar.d() && ((af) aaVar).l().equals("br")) {
                            return anythingElse(aaVar, htmlTreeBuilder);
                        }
                        if ((!aaVar.c() || !StringUtil.in(((ag) aaVar).l(), "head", "noscript")) && !aaVar.d()) {
                            return anythingElse(aaVar, htmlTreeBuilder);
                        }
                        htmlTreeBuilder.b((a) this);
                        return false;
                    }
                }
                return htmlTreeBuilder.a(aaVar, InHead);
            }
        }
        return true;
    }
}
