package org.jsoup.select;

import org.jsoup.nodes.Node;

public interface NodeVisitor {
    void head(Node node, int i);

    void tail(Node node, int i);
}
