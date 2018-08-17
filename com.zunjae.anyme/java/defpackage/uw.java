package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class uw implements Iterator<Entry<K, Collection<V>>> {
    final Iterator<Entry<K, Collection<V>>> a = this.c.a.entrySet().iterator();
    Collection<V> b;
    final /* synthetic */ uu c;

    uw(uu uuVar) {
        this.c = uuVar;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* synthetic */ Object next() {
        Entry entry = (Entry) this.a.next();
        Object key = entry.getKey();
        this.b = (Collection) entry.getValue();
        return vs.a(key, this.c.c.a(key, this.b));
    }

    public final void remove() {
        this.a.remove();
        ut.b(this.c.c, this.b.size());
        this.b.clear();
    }
}
