package defpackage;

import java.lang.reflect.Type;
import java.util.Collection;

public final class yz implements xb {
    private final xm a;

    public yz(xm xmVar) {
        this.a = xmVar;
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        Type b = abm_T.b();
        Class a = abm_T.a();
        if (!Collection.class.isAssignableFrom(a)) {
            return null;
        }
        b = xi.a(b, a);
        return new za(weVar, b, weVar.a(abm.a(b)), this.a.a((abm) abm_T));
    }
}
