package defpackage;

import java.util.HashMap;
import java.util.Map.Entry;

public final class f<K, V> extends g<K, V> {
    private HashMap<K, j<K, V>> a = new HashMap();

    protected final j<K, V> a(K k) {
        return (j) this.a.get(k);
    }

    public final V a(K k, V v) {
        j a = a(k);
        if (a != null) {
            return a.b;
        }
        this.a.put(k, b(k, v));
        return null;
    }

    public final V b(K k) {
        V b = super.b(k);
        this.a.remove(k);
        return b;
    }

    public final boolean c(K k) {
        return this.a.containsKey(k);
    }

    public final Entry<K, V> d(K k) {
        return c(k) ? ((j) this.a.get(k)).d : null;
    }
}
