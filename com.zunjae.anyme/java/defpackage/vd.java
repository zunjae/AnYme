package defpackage;

import java.util.Iterator;
import java.util.Map.Entry;

final class vd implements Iterator<V> {
    final Iterator<Entry<K, V>> a;
    final /* synthetic */ ut b;

    private vd(ut utVar) {
        this.b = utVar;
        this.a = new ux(this.b);
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final V next() {
        return ((Entry) this.a.next()).getValue();
    }

    public final void remove() {
        this.a.remove();
    }
}
