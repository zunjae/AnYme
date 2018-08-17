package org.jsoup.select;

import org.jsoup.nodes.Element;

final class i extends e {
    public i(Evaluator evaluator) {
        this.a = evaluator;
    }

    public final boolean matches(Element element, Element element2) {
        return !this.a.matches(element, element2);
    }

    public final String toString() {
        return String.format(":not%s", new Object[]{this.a});
    }
}
