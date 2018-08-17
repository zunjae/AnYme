package org.jsoup.select;

import java.util.Iterator;
import org.jsoup.nodes.Element;

final class f extends e {
    public f(Evaluator evaluator) {
        this.a = evaluator;
    }

    public final boolean matches(Element element, Element element2) {
        Iterator it = element2.getAllElements().iterator();
        while (it.hasNext()) {
            Element element3 = (Element) it.next();
            if (element3 != element2 && this.a.matches(element, element3)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":has(%s)", new Object[]{this.a});
    }
}
