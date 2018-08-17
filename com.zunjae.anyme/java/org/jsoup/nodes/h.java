package org.jsoup.nodes;

import org.jsoup.SerializationException;
import org.jsoup.nodes.Document.OutputSettings;
import org.jsoup.select.NodeVisitor;

final class h implements NodeVisitor {
    private Appendable a;
    private OutputSettings b;

    h(Appendable appendable, OutputSettings outputSettings) {
        this.a = appendable;
        this.b = outputSettings;
    }

    public final void head(Node node, int i) {
        try {
            node.a(this.a, i, this.b);
        } catch (Throwable e) {
            throw new SerializationException(e);
        }
    }

    public final void tail(Node node, int i) {
        if (!node.nodeName().equals("#text")) {
            try {
                node.b(this.a, i, this.b);
            } catch (Throwable e) {
                throw new SerializationException(e);
            }
        }
    }
}
