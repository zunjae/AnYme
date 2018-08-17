package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import ut.uu;

final class vb extends uu implements SortedMap<K, Collection<V>> {
    SortedSet<K> d;
    final /* synthetic */ ut e;

    vb(ut utVar, SortedMap<K, Collection<V>> sortedMap) {
        this.e = utVar;
        super(utVar, sortedMap);
    }

    public final Comparator<? super K> comparator() {
        return ((SortedMap) this.a).comparator();
    }

    public final K firstKey() {
        return ((SortedMap) this.a).firstKey();
    }

    public final SortedMap<K, Collection<V>> headMap(K k) {
        return new vb(this.e, ((SortedMap) this.a).headMap(k));
    }

    public final /* synthetic */ Set keySet() {
        Set set = this.d;
        if (set != null) {
            return set;
        }
        set = new vc(this.e, (SortedMap) this.a);
        this.d = set;
        return set;
    }

    public final K lastKey() {
        return ((SortedMap) this.a).lastKey();
    }

    public final SortedMap<K, Collection<V>> subMap(K k, K k2) {
        return new vb(this.e, ((SortedMap) this.a).subMap(k, k2));
    }

    public final SortedMap<K, Collection<V>> tailMap(K k) {
        return new vb(this.e, ((SortedMap) this.a).tailMap(k));
    }
}
