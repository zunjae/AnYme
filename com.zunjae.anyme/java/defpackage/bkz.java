package defpackage;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import javax.annotation.Nullable;

final class bkz implements InvocationHandler {
    final /* synthetic */ Class a;
    final /* synthetic */ bky b;
    private final bkr c = bkr.a();

    bkz(bky bky, Class cls) {
        this.b = bky;
        this.a = cls;
    }

    public final Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
        if (method.getDeclaringClass() == Object.class) {
            return method.invoke(this, objArr);
        }
        if (this.c.a(method)) {
            return this.c.a(method, this.a, obj, objArr);
        }
        blb a = this.b.a(method);
        return a.a(new bjx(a, objArr));
    }
}
