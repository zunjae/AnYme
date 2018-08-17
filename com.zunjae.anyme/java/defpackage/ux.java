package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class ux implements Iterator<Entry<K, V>> {
    final Iterator<Entry<K, Collection<V>>> a;
    K b;
    Collection<V> c;
    Iterator<V> d;
    final /* synthetic */ ut e;

    ux(ut utVar) {
        this.e = utVar;
        this.a = utVar.a.entrySet().iterator();
        if (this.a.hasNext()) {
            a();
        } else {
            this.d = vo.a();
        }
    }

    private void a() {
        Entry entry = (Entry) this.a.next();
        this.b = entry.getKey();
        this.c = (Collection) entry.getValue();
        this.d = this.c.iterator();
    }

    public final boolean hasNext() {
        if (!this.a.hasNext()) {
            if (!this.d.hasNext()) {
                return false;
            }
        }
        return true;
    }

    public final /* synthetic */ Object next() {
        if (!this.d.hasNext()) {
            a();
        }
        return vs.a(this.b, this.d.next());
    }

    public final void remove() {
        this.d.remove();
        if (this.c.isEmpty()) {
            this.a.remove();
        }
        this.e.b = this.e.b - 1;
    }
}
