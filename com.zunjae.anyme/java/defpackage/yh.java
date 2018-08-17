package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;

final class yh extends AbstractSet<Entry<K, V>> {
    final /* synthetic */ yf a;

    yh(yf yfVar) {
        this.a = yfVar;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        return (obj instanceof Entry) && this.a.a((Entry) obj) != null;
    }

    public final Iterator<Entry<K, V>> iterator() {
        return new yi(this);
    }

    public final boolean remove(Object obj) {
        if (!(obj instanceof Entry)) {
            return false;
        }
        ym a = this.a.a((Entry) obj);
        if (a == null) {
            return false;
        }
        this.a.a(a, true);
        return true;
    }

    public final int size() {
        return this.a.c;
    }
}
