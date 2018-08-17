package defpackage;

import java.util.HashMap;
import java.util.Map;

public final class mc {
    private static final nv a = new nv();
    private final Map<nv, mb<?, ?>> b = new HashMap();

    public final <T, Z> mb<T, Z> a(Class<T> cls, Class<Z> cls2) {
        mb<T, Z> mbVar;
        synchronized (a) {
            a.a(cls, cls2);
            mbVar = (mb) this.b.get(a);
        }
        return mbVar == null ? md.e() : mbVar;
    }

    public final <T, Z> void a(Class<T> cls, Class<Z> cls2, mb<T, Z> mbVar) {
        this.b.put(new nv(cls, cls2), mbVar);
    }
}
