package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

enum y extends a {
    y(String str, int i) {
        super(str, i);
    }

    final boolean anythingElse(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        htmlTreeBuilder.b((a) this);
        if (!StringUtil.in(htmlTreeBuilder.y().nodeName(), "table", "tbody", "tfoot", "thead", "tr")) {
            return htmlTreeBuilder.a(aaVar, InBody);
        }
        htmlTreeBuilder.b(true);
        boolean a = htmlTreeBuilder.a(aaVar, InBody);
        htmlTreeBuilder.b(false);
        return a;
    }

    final boolean process(aa aaVar, HtmlTreeBuilder htmlTreeBuilder) {
        a aVar = this;
        aa aaVar2 = aaVar;
        HtmlTreeBuilder htmlTreeBuilder2 = htmlTreeBuilder;
        if (aaVar.f()) {
            htmlTreeBuilder.r();
            htmlTreeBuilder.c();
            htmlTreeBuilder2.a(InTableText);
            return htmlTreeBuilder2.a(aaVar2);
        } else if (aaVar.e()) {
            htmlTreeBuilder2.a((ac) aaVar2);
            return true;
        } else if (aaVar.b()) {
            htmlTreeBuilder2.b(aVar);
            return false;
        } else if (aaVar.c()) {
            a aVar2;
            ag agVar = (ag) aaVar2;
            String l = agVar.l();
            if (l.equals("caption")) {
                htmlTreeBuilder.k();
                htmlTreeBuilder.w();
                htmlTreeBuilder2.a(agVar);
                aVar2 = InCaption;
            } else if (l.equals("colgroup")) {
                htmlTreeBuilder.k();
                htmlTreeBuilder2.a(agVar);
                aVar2 = InColumnGroup;
            } else if (l.equals("col")) {
                htmlTreeBuilder2.l("colgroup");
                return htmlTreeBuilder2.a(aaVar2);
            } else if (StringUtil.in(l, "tbody", "tfoot", "thead")) {
                htmlTreeBuilder.k();
                htmlTreeBuilder2.a(agVar);
                aVar2 = InTableBody;
            } else if (StringUtil.in(l, "td", "th", "tr")) {
                htmlTreeBuilder2.l("tbody");
                return htmlTreeBuilder2.a(aaVar2);
            } else {
                if (l.equals("table")) {
                    htmlTreeBuilder2.b(aVar);
                    if (htmlTreeBuilder2.m("table")) {
                        return htmlTreeBuilder2.a(aaVar2);
                    }
                } else if (StringUtil.in(l, "style", "script")) {
                    return htmlTreeBuilder2.a(aaVar2, InHead);
                } else {
                    if (l.equals("input")) {
                        if (!agVar.e.get("type").equalsIgnoreCase("hidden")) {
                            return anythingElse(aaVar, htmlTreeBuilder);
                        }
                        htmlTreeBuilder2.b(agVar);
                    } else if (!l.equals("form")) {
                        return anythingElse(aaVar, htmlTreeBuilder);
                    } else {
                        htmlTreeBuilder2.b(aVar);
                        if (htmlTreeBuilder.p() != null) {
                            return false;
                        }
                        htmlTreeBuilder2.a(agVar, false);
                    }
                }
                return true;
            }
            htmlTreeBuilder2.a(aVar2);
            return true;
        } else if (aaVar.d()) {
            String l2 = ((af) aaVar2).l();
            if (l2.equals("table")) {
                if (htmlTreeBuilder2.h(l2)) {
                    htmlTreeBuilder2.c("table");
                    htmlTreeBuilder.n();
                    return true;
                }
                htmlTreeBuilder2.b(aVar);
                return false;
            } else if (!StringUtil.in(l2, "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr")) {
                return anythingElse(aaVar, htmlTreeBuilder);
            } else {
                htmlTreeBuilder2.b(aVar);
                return false;
            }
        } else if (!aaVar.g()) {
            return anythingElse(aaVar, htmlTreeBuilder);
        } else {
            if (htmlTreeBuilder.y().nodeName().equals("html")) {
                htmlTreeBuilder2.b(aVar);
            }
            return true;
        }
    }
}
