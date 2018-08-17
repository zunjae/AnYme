package defpackage;

import java.util.ArrayList;
import java.util.List;

final class gd<K, V> {
    gd<K, V> a;
    gd<K, V> b;
    private final K c;
    private List<V> d;

    public gd() {
        this(null);
    }

    public gd(K k) {
        this.b = this;
        this.a = this;
        this.c = k;
    }

    public final V a() {
        int b = b();
        return b > 0 ? this.d.remove(b - 1) : null;
    }

    public final void a(V v) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(v);
    }

    public final int b() {
        List list = this.d;
        return list != null ? list.size() : 0;
    }
}
