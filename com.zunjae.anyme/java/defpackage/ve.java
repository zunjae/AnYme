package defpackage;

import java.util.AbstractCollection;
import java.util.Iterator;

final class ve extends AbstractCollection<V> {
    final /* synthetic */ ut a;

    private ve(ut utVar) {
        this.a = utVar;
    }

    public final void clear() {
        this.a.d();
    }

    public final boolean contains(Object obj) {
        return this.a.c(obj);
    }

    public final Iterator<V> iterator() {
        return new vd(this.a, (byte) 0);
    }

    public final int size() {
        return this.a.b;
    }
}
