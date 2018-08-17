package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class yy implements xb {
    yy() {
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        Type b = abm_T.b();
        if (!(b instanceof GenericArrayType) && (!(b instanceof Class) || !((Class) b).isArray())) {
            return null;
        }
        b = xi.d(b);
        return new yx(weVar, weVar.a(abm.a(b)), xi.b(b));
    }
}
