package defpackage;

import java.lang.reflect.Type;
import java.util.Map;

public final class zi implements xb {
    final boolean a = false;
    private final xm b;

    public zi(xm xmVar) {
        this.b = xmVar;
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        Type b = abm_T.b();
        if (!Map.class.isAssignableFrom(abm_T.a())) {
            return null;
        }
        wz a;
        Type[] b2 = xi.b(b, xi.b(b));
        Type type = b2[0];
        if (type != Boolean.TYPE) {
            if (type != Boolean.class) {
                a = weVar.a(abm.a(type));
                return new zj(this, weVar, b2[0], a, b2[1], weVar.a(abm.a(b2[1])), this.b.a((abm) abm_T));
            }
        }
        a = zy.f;
        return new zj(this, weVar, b2[0], a, b2[1], weVar.a(abm.a(b2[1])), this.b.a((abm) abm_T));
    }
}
