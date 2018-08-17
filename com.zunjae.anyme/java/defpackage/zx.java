package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;

final class zx<T> extends wz<T> {
    private final we a;
    private final wz<T> b;
    private final Type c;

    zx(we weVar, wz<T> wzVar, Type type) {
        this.a = weVar;
        this.b = wzVar;
        this.c = type;
    }

    public final T a(abn abn) {
        return this.b.a(abn);
    }

    public final void a(abq abq, T t) {
        wz wzVar = this.b;
        Type type = this.c;
        if (t != null && (type == Object.class || (type instanceof TypeVariable) || (type instanceof Class))) {
            type = t.getClass();
        }
        if (type != this.c) {
            wzVar = this.a.a(abm.a(type));
            if (wzVar instanceof zp) {
                wz wzVar2 = this.b;
                if (!(wzVar2 instanceof zp)) {
                    wzVar = wzVar2;
                }
            }
        }
        wzVar.a(abq, t);
    }
}
