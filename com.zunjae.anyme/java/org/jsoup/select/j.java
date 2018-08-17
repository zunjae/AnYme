package org.jsoup.select;

import org.jsoup.nodes.Element;

final class j extends e {
    public j(Evaluator evaluator) {
        this.a = evaluator;
    }

    public final boolean matches(Element element, Element element2) {
        if (element == element2) {
            return false;
        }
        do {
            element2 = element2.parent();
            if (this.a.matches(element, element2)) {
                return true;
            }
        } while (element2 != element);
        return false;
    }

    public final String toString() {
        return String.format(":parent%s", new Object[]{this.a});
    }
}
