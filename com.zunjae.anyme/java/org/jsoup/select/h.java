package org.jsoup.select;

import org.jsoup.nodes.Element;

final class h extends e {
    public h(Evaluator evaluator) {
        this.a = evaluator;
    }

    public final boolean matches(Element element, Element element2) {
        if (element == element2) {
            return false;
        }
        element2 = element2.previousElementSibling();
        return element2 != null && this.a.matches(element, element2);
    }

    public final String toString() {
        return String.format(":prev%s", new Object[]{this.a});
    }
}
