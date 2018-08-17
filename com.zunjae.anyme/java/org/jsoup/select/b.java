package org.jsoup.select;

import java.util.ArrayList;
import java.util.Collection;

abstract class b extends Evaluator {
    final ArrayList<Evaluator> a;
    int b;

    b() {
        this.b = 0;
        this.a = new ArrayList();
    }

    b(Collection<Evaluator> collection) {
        this();
        this.a.addAll(collection);
        b();
    }

    final Evaluator a() {
        int i = this.b;
        return i > 0 ? (Evaluator) this.a.get(i - 1) : null;
    }

    final void a(Evaluator evaluator) {
        this.a.set(this.b - 1, evaluator);
    }

    final void b() {
        this.b = this.a.size();
    }
}
