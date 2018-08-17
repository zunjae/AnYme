package org.jsoup.nodes;

import org.jsoup.select.NodeVisitor;

final class g implements NodeVisitor {
    final /* synthetic */ String a;
    final /* synthetic */ Node b;

    g(Node node, String str) {
        this.b = node;
        this.a = str;
    }

    public final void head(Node node, int i) {
        node.d = this.a;
    }

    public final void tail(Node node, int i) {
    }
}
