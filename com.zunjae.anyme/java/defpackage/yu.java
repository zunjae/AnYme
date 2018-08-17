package defpackage;

import java.lang.reflect.Method;

final class yu extends ys {
    final /* synthetic */ Method a;
    final /* synthetic */ int b;

    yu(Method method, int i) {
        this.a = method;
        this.b = i;
    }

    public final <T> T a(Class<T> cls) {
        ys.b(cls);
        return this.a.invoke(null, new Object[]{cls, Integer.valueOf(this.b)});
    }
}
