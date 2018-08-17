package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum g extends a {
    g(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        return htmlTreeBuilder.a(aaVar, InTable);
    }

    private boolean handleMissingTr(aa aaVar, da daVar) {
        return daVar.m("tr") ? daVar.a(aaVar) : false;
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (aaVar.c()) {
            ag agVar = (ag) aaVar;
            String l = agVar.l();
            if (!StringUtil.in(l, "th", "td")) {
                return StringUtil.in(l, "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr") ? handleMissingTr(aaVar, htmlTreeBuilder) : anythingElse(aaVar, htmlTreeBuilder);
            } else {
                htmlTreeBuilder.m();
                htmlTreeBuilder.a(agVar);
                htmlTreeBuilder.a(InCell);
                htmlTreeBuilder.w();
            }
        } else if (!aaVar.d()) {
            return anythingElse(aaVar, htmlTreeBuilder);
        } else {
            String l2 = ((af) aaVar).l();
            if (l2.equals("tr")) {
                if (htmlTreeBuilder.h(l2)) {
                    htmlTreeBuilder.m();
                    htmlTreeBuilder.i();
                    htmlTreeBuilder.a(InTableBody);
                } else {
                    htmlTreeBuilder.b((a) this);
                    return false;
                }
            } else if (l2.equals("table")) {
                return handleMissingTr(aaVar, htmlTreeBuilder);
            } else {
                if (StringUtil.in(l2, "tbody", "tfoot", "thead")) {
                    if (htmlTreeBuilder.h(l2)) {
                        htmlTreeBuilder.m("tr");
                        return htmlTreeBuilder.a(aaVar);
                    }
                    htmlTreeBuilder.b((a) this);
                    return false;
                } else if (!StringUtil.in(l2, "body", "caption", "col", "colgroup", "html", "td", "th")) {
                    return anythingElse(aaVar, htmlTreeBuilder);
                } else {
                    htmlTreeBuilder.b((a) this);
                    return false;
                }
            }
        }
        return true;
    }
}
