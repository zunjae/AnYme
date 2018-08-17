package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class aiq {
    private final Object a;
    private final Method b;
    private final int c;
    private boolean d = true;

    aiq(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventHandler target cannot be null.");
        } else if (method != null) {
            this.a = obj;
            this.b = method;
            method.setAccessible(true);
            this.c = ((method.hashCode() + 31) * 31) + obj.hashCode();
        } else {
            throw new NullPointerException("EventHandler method cannot be null.");
        }
    }

    public final void a(Object obj) {
        if (this.d) {
            try {
                this.b.invoke(this.a, new Object[]{obj});
                return;
            } catch (IllegalAccessException e) {
                throw new AssertionError(e);
            } catch (InvocationTargetException e2) {
                if (e2.getCause() instanceof Error) {
                    throw ((Error) e2.getCause());
                }
                throw e2;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(toString());
        stringBuilder.append(" has been invalidated and can no longer handle events.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean a() {
        return this.d;
    }

    public final void b() {
        this.d = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aiq aiq = (aiq) obj;
        return this.b.equals(aiq.b) && this.a == aiq.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[EventHandler ");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
