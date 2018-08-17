package org.jsoup.safety;

import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.select.NodeVisitor;

final class a implements NodeVisitor {
    final /* synthetic */ Cleaner a;
    private int b;
    private final Element c;
    private Element d;

    private a(Cleaner cleaner, Element element, Element element2) {
        this.a = cleaner;
        this.b = 0;
        this.c = element;
        this.d = element2;
    }

    public final void head(Node node, int i) {
        if (node instanceof Element) {
            Element element = (Element) node;
            if (this.a.a.a(element.tagName())) {
                b a = Cleaner.a(this.a, element);
                Node node2 = a.a;
                this.d.appendChild(node2);
                this.b += a.b;
                this.d = node2;
                return;
            }
            if (node != this.c) {
                this.b++;
            }
        } else if (node instanceof TextNode) {
            this.d.appendChild(new TextNode(((TextNode) node).getWholeText(), node.baseUri()));
        } else if ((node instanceof DataNode) && this.a.a.a(node.parent().nodeName())) {
            this.d.appendChild(new DataNode(((DataNode) node).getWholeData(), node.baseUri()));
        } else {
            this.b++;
        }
    }

    public final void tail(Node node, int i) {
        if ((node instanceof Element) && this.a.a.a(node.nodeName())) {
            this.d = this.d.parent();
        }
    }
}
