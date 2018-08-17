package defpackage;

import java.lang.reflect.Method;

final class yv extends ys {
    final /* synthetic */ Method a;

    yv(Method method) {
        this.a = method;
    }

    public final <T> T a(Class<T> cls) {
        ys.b(cls);
        return this.a.invoke(null, new Object[]{cls, Object.class});
    }
}
