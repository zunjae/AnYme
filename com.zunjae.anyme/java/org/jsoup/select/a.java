package org.jsoup.select;

import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

final class a implements NodeVisitor {
    private final Element a;
    private final Elements b;
    private final Evaluator c;

    a(Element element, Elements elements, Evaluator evaluator) {
        this.a = element;
        this.b = elements;
        this.c = evaluator;
    }

    public final void head(Node node, int i) {
        if (node instanceof Element) {
            Element element = (Element) node;
            if (this.c.matches(this.a, element)) {
                this.b.add(element);
            }
        }
    }

    public final void tail(Node node, int i) {
    }
}
