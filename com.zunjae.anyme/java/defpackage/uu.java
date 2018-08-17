package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.Nullable;

class uu extends AbstractMap<K, Collection<V>> {
    final transient Map<K, Collection<V>> a;
    transient Set<Entry<K, Collection<V>>> b;
    final /* synthetic */ ut c;

    uu(ut utVar, Map<K, Collection<V>> map) {
        this.c = utVar;
        this.a = map;
    }

    public boolean containsKey(Object obj) {
        return vs.b(this.a, obj);
    }

    public Set<Entry<K, Collection<V>>> entrySet() {
        Set<Entry<K, Collection<V>>> set = this.b;
        if (set != null) {
            return set;
        }
        set = new uv(this);
        this.b = set;
        return set;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!this.a.equals(obj)) {
                return false;
            }
        }
        return true;
    }

    public /* synthetic */ Object get(Object obj) {
        Collection collection = (Collection) vs.a(this.a, obj);
        return collection == null ? null : this.c.a(obj, collection);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public Set<K> keySet() {
        return this.c.e();
    }

    public /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.a.remove(obj);
        if (collection == null) {
            return null;
        }
        Collection b = this.c.b();
        b.addAll(collection);
        ut.b(this.c, collection.size());
        collection.clear();
        return b;
    }

    public String toString() {
        return this.a.toString();
    }
}
