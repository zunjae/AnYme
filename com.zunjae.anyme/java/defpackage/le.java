package defpackage;

import java.util.HashMap;
import java.util.Map;

public final class le {
    private static final nv a = new nv();
    private final Map<nv, ld<?, ?>> b = new HashMap();

    public final <Z, R> ld<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls.equals(cls2)) {
            return lf.b();
        }
        synchronized (a) {
            a.a(cls, cls2);
            ld<Z, R> ldVar = (ld) this.b.get(a);
        }
        if (ldVar != null) {
            return ldVar;
        }
        StringBuilder stringBuilder = new StringBuilder("No transcoder registered for ");
        stringBuilder.append(cls);
        stringBuilder.append(" and ");
        stringBuilder.append(cls2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final <Z, R> void a(Class<Z> cls, Class<R> cls2, ld<Z, R> ldVar) {
        this.b.put(new nv(cls, cls2), ldVar);
    }
}
