package org.jsoup.select;

import org.jsoup.nodes.Element;

final class k extends e {
    public k(Evaluator evaluator) {
        this.a = evaluator;
    }

    public final boolean matches(Element element, Element element2) {
        if (element == element2) {
            return false;
        }
        do {
            element2 = element2.previousElementSibling();
            if (element2 == null) {
                return false;
            }
        } while (!this.a.matches(element, element2));
        return true;
    }

    public final String toString() {
        return String.format(":prev*%s", new Object[]{this.a});
    }
}
