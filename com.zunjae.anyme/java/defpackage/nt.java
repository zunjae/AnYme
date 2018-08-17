package defpackage;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class nt<T, Y> {
    private final LinkedHashMap<T, Y> a = new LinkedHashMap(100, 0.75f, true);
    private int b;
    private final int c;
    private int d = 0;

    public nt(int i) {
        this.c = i;
        this.b = i;
    }

    protected int a(Y y) {
        return 1;
    }

    public final void a() {
        b(0);
    }

    protected void a(T t, Y y) {
    }

    public final int b() {
        return this.d;
    }

    public final Y b(T t) {
        return this.a.get(t);
    }

    public final Y b(T t, Y y) {
        if (a(y) >= this.b) {
            a(t, y);
            return null;
        }
        Y put = this.a.put(t, y);
        if (y != null) {
            this.d += a(y);
        }
        if (put != null) {
            this.d -= a(put);
        }
        b(this.b);
        return put;
    }

    protected final void b(int i) {
        while (this.d > i) {
            Entry entry = (Entry) this.a.entrySet().iterator().next();
            Object value = entry.getValue();
            this.d -= a(value);
            Object key = entry.getKey();
            this.a.remove(key);
            a(key, value);
        }
    }

    public final Y c(T t) {
        Y remove = this.a.remove(t);
        if (remove != null) {
            this.d -= a(remove);
        }
        return remove;
    }
}
