package org.jsoup.select;

import org.jsoup.nodes.Element;

final class l extends Evaluator {
    l() {
    }

    public final boolean matches(Element element, Element element2) {
        return element == element2;
    }
}
