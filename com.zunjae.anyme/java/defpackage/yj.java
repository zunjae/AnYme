package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;

final class yj extends AbstractSet<K> {
    final /* synthetic */ yf a;

    yj(yf yfVar) {
        this.a = yfVar;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    public final Iterator<K> iterator() {
        return new yk(this);
    }

    public final boolean remove(Object obj) {
        return this.a.a(obj) != null;
    }

    public final int size() {
        return this.a.c;
    }
}
