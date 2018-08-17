package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum c extends a {
    c(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (r.a[aaVar.a.ordinal()] != 5) {
            if (htmlTreeBuilder.s().size() > 0) {
                for (String str : htmlTreeBuilder.s()) {
                    if (a.isWhitespace(str)) {
                        htmlTreeBuilder.a(new ab().a(str));
                    } else {
                        htmlTreeBuilder.b((a) this);
                        if (StringUtil.in(htmlTreeBuilder.y().nodeName(), "table", "tbody", "tfoot", "thead", "tr")) {
                            htmlTreeBuilder.b(true);
                            htmlTreeBuilder.a(new ab().a(str), InBody);
                            htmlTreeBuilder.b(false);
                        } else {
                            htmlTreeBuilder.a(new ab().a(str), InBody);
                        }
                    }
                }
                htmlTreeBuilder.r();
            }
            htmlTreeBuilder.a(htmlTreeBuilder.d());
            return htmlTreeBuilder.a(aaVar);
        }
        ab abVar = (ab) aaVar;
        if (abVar.h().equals(a.nullString)) {
            htmlTreeBuilder.b((a) this);
            return false;
        }
        htmlTreeBuilder.s().add(abVar.h());
        return true;
    }
}
