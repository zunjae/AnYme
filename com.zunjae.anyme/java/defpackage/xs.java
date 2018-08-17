package defpackage;

import java.lang.reflect.Type;

final class xs implements yn<T> {
    final /* synthetic */ Class a;
    final /* synthetic */ Type b;
    final /* synthetic */ xm c;
    private final ys d = ys.a();

    xs(xm xmVar, Class cls, Type type) {
        this.c = xmVar;
        this.a = cls;
        this.b = type;
    }

    public final T a() {
        try {
            return this.d.a(this.a);
        } catch (Throwable e) {
            StringBuilder stringBuilder = new StringBuilder("Unable to invoke no-args constructor for ");
            stringBuilder.append(this.b);
            stringBuilder.append(". Registering an InstanceCreator with Gson for this type may fix this problem.");
            throw new RuntimeException(stringBuilder.toString(), e);
        }
    }
}
