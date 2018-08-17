package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map.Entry;

final class uv extends AbstractSet<Entry<K, Collection<V>>> {
    final /* synthetic */ uu a;

    uv(uu uuVar) {
        this.a = uuVar;
    }

    public final boolean contains(Object obj) {
        return vm.a(this.a.a.entrySet(), obj);
    }

    public final Iterator<Entry<K, Collection<V>>> iterator() {
        return new uw(this.a);
    }

    public final boolean remove(Object obj) {
        if (!contains(obj)) {
            return false;
        }
        this.a.c.a(((Entry) obj).getKey());
        return true;
    }

    public final int size() {
        return this.a.a.size();
    }
}
