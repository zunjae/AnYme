package org.jsoup.parser;

import org.jsoup.nodes.Document.QuirksMode;
import org.jsoup.nodes.DocumentType;

enum b extends a {
    b(String str, int i) {
        super(str, i);
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        if (a.isWhitespace(aaVar)) {
            return true;
        }
        if (aaVar.e()) {
            htmlTreeBuilder.a((ac) aaVar);
        } else if (aaVar.b()) {
            ad adVar = (ad) aaVar;
            htmlTreeBuilder.f().appendChild(new DocumentType(htmlTreeBuilder.i.a(adVar.b.toString()), adVar.c, adVar.d.toString(), adVar.e.toString(), htmlTreeBuilder.g()));
            if (adVar.f) {
                htmlTreeBuilder.f().quirksMode(QuirksMode.quirks);
            }
            htmlTreeBuilder.a(BeforeHtml);
        } else {
            htmlTreeBuilder.a(BeforeHtml);
            return htmlTreeBuilder.a(aaVar);
        }
        return true;
    }
}
