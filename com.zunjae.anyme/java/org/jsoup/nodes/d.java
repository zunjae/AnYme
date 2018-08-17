package org.jsoup.nodes;

import org.jsoup.select.NodeVisitor;

final class d implements NodeVisitor {
    final /* synthetic */ StringBuilder a;
    final /* synthetic */ Element b;

    d(Element element, StringBuilder stringBuilder) {
        this.b = element;
        this.a = stringBuilder;
    }

    public final void head(Node node, int i) {
        if (node instanceof TextNode) {
            Element.b(this.a, (TextNode) node);
            return;
        }
        if (node instanceof Element) {
            Element element = (Element) node;
            if (this.a.length() > 0 && ((element.isBlock() || element.f.getName().equals("br")) && !TextNode.a(this.a))) {
                this.a.append(" ");
            }
        }
    }

    public final void tail(Node node, int i) {
    }
}
