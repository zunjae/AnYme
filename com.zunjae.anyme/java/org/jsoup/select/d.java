package org.jsoup.select;

import java.util.Arrays;
import java.util.Collection;
import org.jsoup.nodes.Element;

final class d extends b {
    d() {
    }

    private d(Collection<Evaluator> collection) {
        if (this.b > 1) {
            this.a.add(new c((Collection) collection));
        } else {
            this.a.addAll(collection);
        }
        b();
    }

    d(Evaluator... evaluatorArr) {
        this(Arrays.asList(evaluatorArr));
    }

    public final void b(Evaluator evaluator) {
        this.a.add(evaluator);
        b();
    }

    public final boolean matches(Element element, Element element2) {
        for (int i = 0; i < this.b; i++) {
            if (((Evaluator) this.a.get(i)).matches(element, element2)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return String.format(":or%s", new Object[]{this.a});
    }
}
