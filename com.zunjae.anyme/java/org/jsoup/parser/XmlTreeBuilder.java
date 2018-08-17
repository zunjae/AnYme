package org.jsoup.parser;

import defpackage.mh;
import defpackage.tw;
import java.util.List;
import org.jsoup.Jsoup;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document.OutputSettings.Syntax;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;

public class XmlTreeBuilder extends da {
    private void a(Node node) {
        y().appendChild(node);
    }

    final ParseSettings a() {
        return ParseSettings.preserveCase;
    }

    protected final boolean a(aa aaVar) {
        Node comment;
        Node element;
        String k;
        Element element2;
        switch (db.a[aaVar.a.ordinal()]) {
            case tw.a /*1*/:
                ag agVar = (ag) aaVar;
                Tag valueOf = Tag.valueOf(agVar.k(), this.i);
                element = new Element(valueOf, this.f, this.i.a(agVar.e));
                a(element);
                if (!agVar.d) {
                    this.e.add(element);
                    break;
                }
                this.c.b();
                if (!valueOf.isKnownTag()) {
                    valueOf.a();
                    break;
                }
                break;
            case tw.b /*2*/:
                int size;
                k = ((af) aaVar).k();
                Element element3 = null;
                for (int size2 = this.e.size() - 1; size2 >= 0; size2--) {
                    Element element4 = (Element) this.e.get(size2);
                    if (element4.nodeName().equals(k)) {
                        element3 = element4;
                        if (element3 != null) {
                            for (size = this.e.size() - 1; size >= 0; size--) {
                                element2 = (Element) this.e.get(size);
                                this.e.remove(size);
                                if (element2 == element3) {
                                    break;
                                }
                            }
                            break;
                        }
                    }
                }
                if (element3 != null) {
                    while (size >= 0) {
                        element2 = (Element) this.e.get(size);
                        this.e.remove(size);
                        if (element2 == element3) {
                        }
                    }
                }
                break;
            case f.c /*3*/:
                ac acVar = (ac) aaVar;
                comment = new Comment(acVar.b.toString(), this.f);
                if (acVar.c) {
                    k = comment.getData();
                    if (k.length() > 1 && (k.startsWith("!") || k.startsWith("?"))) {
                        StringBuilder stringBuilder = new StringBuilder("<");
                        stringBuilder.append(k.substring(1, k.length() - 1));
                        stringBuilder.append(">");
                        element2 = Jsoup.parse(stringBuilder.toString(), this.f, Parser.xmlParser()).child(0);
                        Node xmlDeclaration = new XmlDeclaration(this.i.a(element2.tagName()), comment.baseUri(), k.startsWith("!"));
                        xmlDeclaration.attributes().addAll(element2.attributes());
                        comment = xmlDeclaration;
                        break;
                    }
                }
                break;
            case mh.d /*4*/:
                comment = new TextNode(((ab) aaVar).h(), this.f);
                break;
            case mh.e /*5*/:
                ad adVar = (ad) aaVar;
                element = new DocumentType(this.i.a(adVar.b.toString()), adVar.c, adVar.d.toString(), adVar.e.toString(), this.f);
                break;
            case mh.f /*6*/:
                break;
            default:
                StringBuilder stringBuilder2 = new StringBuilder("Unexpected token type: ");
                stringBuilder2.append(aaVar.a);
                Validate.fail(stringBuilder2.toString());
                break;
        }
        a(comment);
        return true;
    }

    protected final void b(String str, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
        super.b(str, str2, parseErrorList, parseSettings);
        this.e.add(this.d);
        this.d.outputSettings().syntax(Syntax.xml);
    }

    final List<Node> c(String str, String str2, ParseErrorList parseErrorList, ParseSettings parseSettings) {
        b(str, str2, parseErrorList, parseSettings);
        x();
        return this.d.childNodes();
    }

    public /* bridge */ /* synthetic */ boolean processStartTag(String str, Attributes attributes) {
        return super.processStartTag(str, attributes);
    }
}
