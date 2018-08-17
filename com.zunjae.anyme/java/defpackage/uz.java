package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class uz implements Iterator<K> {
    final Iterator<Entry<K, Collection<V>>> a = this.c.a.entrySet().iterator();
    Entry<K, Collection<V>> b;
    final /* synthetic */ uy c;

    uz(uy uyVar) {
        this.c = uyVar;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final K next() {
        this.b = (Entry) this.a.next();
        return this.b.getKey();
    }

    public final void remove() {
        if ((this.b != null ? 1 : null) != null) {
            Collection collection = (Collection) this.b.getValue();
            this.a.remove();
            ut.b(this.c.b, collection.size());
            collection.clear();
            return;
        }
        throw new IllegalStateException();
    }
}
