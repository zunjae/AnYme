package org.jsoup.parser;

import defpackage.mh;
import org.jsoup.helper.StringUtil;

enum f extends a {
    f(String str, int i) {
        super(str, i);
    }

    private boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        return htmlTreeBuilder.a(aaVar, InTable);
    }

    private boolean exitTableBody(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (htmlTreeBuilder.h("tbody") || htmlTreeBuilder.h("thead") || htmlTreeBuilder.e("tfoot")) {
            htmlTreeBuilder.l();
            htmlTreeBuilder.m(htmlTreeBuilder.y().nodeName());
            return htmlTreeBuilder.a(aaVar);
        }
        htmlTreeBuilder.b((a) this);
        return false;
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        a aVar;
        switch (r.a[aaVar.a.ordinal()]) {
            case f.c /*3*/:
                aa aaVar2 = (ag) aaVar;
                String l = aaVar2.l();
                if (l.equals("tr")) {
                    htmlTreeBuilder.l();
                    htmlTreeBuilder.a((ag) aaVar2);
                    aVar = InRow;
                    break;
                } else if (!StringUtil.in(l, "th", "td")) {
                    return StringUtil.in(l, "caption", "col", "colgroup", "tbody", "tfoot", "thead") ? exitTableBody(aaVar, htmlTreeBuilder) : anythingElse(aaVar, htmlTreeBuilder);
                } else {
                    htmlTreeBuilder.b((a) this);
                    htmlTreeBuilder.l("tr");
                    return htmlTreeBuilder.a(aaVar2);
                }
            case mh.d /*4*/:
                String l2 = ((af) aaVar).l();
                if (StringUtil.in(l2, "tbody", "tfoot", "thead")) {
                    if (htmlTreeBuilder.h(l2)) {
                        htmlTreeBuilder.l();
                        htmlTreeBuilder.i();
                        aVar = InTable;
                        break;
                    }
                    htmlTreeBuilder.b((a) this);
                    return false;
                } else if (l2.equals("table")) {
                    return exitTableBody(aaVar, htmlTreeBuilder);
                } else {
                    if (!StringUtil.in(l2, "body", "caption", "col", "colgroup", "html", "td", "th", "tr")) {
                        return anythingElse(aaVar, htmlTreeBuilder);
                    }
                    htmlTreeBuilder.b((a) this);
                    return false;
                }
            default:
                return anythingElse(aaVar, htmlTreeBuilder);
        }
        htmlTreeBuilder.a(aVar);
        return true;
    }
}
