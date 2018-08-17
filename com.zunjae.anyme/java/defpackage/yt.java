package defpackage;

import java.lang.reflect.Method;

final class yt extends ys {
    final /* synthetic */ Method a;
    final /* synthetic */ Object b;

    yt(Method method, Object obj) {
        this.a = method;
        this.b = obj;
    }

    public final <T> T a(Class<T> cls) {
        ys.b(cls);
        return this.a.invoke(this.b, new Object[]{cls});
    }
}
