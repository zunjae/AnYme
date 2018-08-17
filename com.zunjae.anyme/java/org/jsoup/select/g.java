package org.jsoup.select;

import org.jsoup.nodes.Element;

final class g extends e {
    public g(Evaluator evaluator) {
        this.a = evaluator;
    }

    public final boolean matches(Element element, Element element2) {
        if (element == element2) {
            return false;
        }
        element2 = element2.parent();
        return element2 != null && this.a.matches(element, element2);
    }

    public final String toString() {
        return String.format(":ImmediateParent%s", new Object[]{this.a});
    }
}
