package defpackage;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

class uy extends AbstractSet<K> {
    final Map<K, Collection<V>> a;
    final /* synthetic */ ut b;

    uy(ut utVar, Map<K, Collection<V>> map) {
        this.b = utVar;
        this.a = map;
    }

    public boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return this.a.keySet().containsAll(collection);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!this.a.keySet().equals(obj)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.a.keySet().hashCode();
    }

    public Iterator<K> iterator() {
        return new uz(this);
    }

    public boolean remove(Object obj) {
        int size;
        Collection collection = (Collection) this.a.remove(obj);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            ut.b(this.b, size);
        } else {
            size = 0;
        }
        return size > 0;
    }

    public int size() {
        return this.a.size();
    }
}
