package defpackage;

import java.util.Collection;
import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
import ut.uy;

final class vc extends uy implements SortedSet<K> {
    final /* synthetic */ ut c;

    vc(ut utVar, SortedMap<K, Collection<V>> sortedMap) {
        this.c = utVar;
        super(utVar, sortedMap);
    }

    public final Comparator<? super K> comparator() {
        return ((SortedMap) this.a).comparator();
    }

    public final K first() {
        return ((SortedMap) this.a).firstKey();
    }

    public final SortedSet<K> headSet(K k) {
        return new vc(this.c, ((SortedMap) this.a).headMap(k));
    }

    public final K last() {
        return ((SortedMap) this.a).lastKey();
    }

    public final SortedSet<K> subSet(K k, K k2) {
        return new vc(this.c, ((SortedMap) this.a).subMap(k, k2));
    }

    public final SortedSet<K> tailSet(K k) {
        return new vc(this.c, ((SortedMap) this.a).tailMap(k));
    }
}
