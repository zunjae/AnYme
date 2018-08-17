package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

final class xu implements yn<T> {
    final /* synthetic */ Constructor a;
    final /* synthetic */ xm b;

    xu(xm xmVar, Constructor constructor) {
        this.b = xmVar;
        this.a = constructor;
    }

    public final T a() {
        StringBuilder stringBuilder;
        try {
            return this.a.newInstance(null);
        } catch (Throwable e) {
            stringBuilder = new StringBuilder("Failed to invoke ");
            stringBuilder.append(this.a);
            stringBuilder.append(" with no args");
            throw new RuntimeException(stringBuilder.toString(), e);
        } catch (InvocationTargetException e2) {
            stringBuilder = new StringBuilder("Failed to invoke ");
            stringBuilder.append(this.a);
            stringBuilder.append(" with no args");
            throw new RuntimeException(stringBuilder.toString(), e2.getTargetException());
        } catch (IllegalAccessException e3) {
            throw new AssertionError(e3);
        }
    }
}
