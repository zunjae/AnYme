package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

final class air {
    final Object a;
    private final Method b;
    private final int c;
    private boolean d = true;

    air(Object obj, Method method) {
        if (obj == null) {
            throw new NullPointerException("EventProducer target cannot be null.");
        } else if (method != null) {
            this.a = obj;
            this.b = method;
            method.setAccessible(true);
            this.c = ((method.hashCode() + 31) * 31) + obj.hashCode();
        } else {
            throw new NullPointerException("EventProducer method cannot be null.");
        }
    }

    public final boolean a() {
        return this.d;
    }

    public final void b() {
        this.d = false;
    }

    public final Object c() {
        if (this.d) {
            try {
                return this.b.invoke(this.a, new Object[0]);
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
        stringBuilder.append(" has been invalidated and can no longer produce events.");
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        air air = (air) obj;
        return this.b.equals(air.b) && this.a == air.a;
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[EventProducer ");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
