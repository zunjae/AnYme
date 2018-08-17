package defpackage;

import java.io.Serializable;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;

final class xk implements Serializable, ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;

    public xk(Type type, Type type2, Type... typeArr) {
        if (type2 instanceof Class) {
            Object obj;
            Class cls = (Class) type2;
            boolean z = true;
            if (!Modifier.isStatic(cls.getModifiers())) {
                if (cls.getEnclosingClass() != null) {
                    obj = null;
                    if (type == null) {
                        if (obj != null) {
                            z = false;
                        }
                    }
                    xh.a(z);
                }
            }
            obj = 1;
            if (type == null) {
                if (obj != null) {
                    z = false;
                }
            }
            xh.a(z);
        }
        this.a = type == null ? null : xi.a(type);
        this.b = xi.a(type2);
        this.c = (Type[]) typeArr.clone();
        int length = this.c.length;
        for (int i = 0; i < length; i++) {
            xh.a(this.c[i]);
            xi.e(this.c[i]);
            Type[] typeArr2 = this.c;
            typeArr2[i] = xi.a(typeArr2[i]);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && xi.a((Type) this, (ParameterizedType) obj);
    }

    public final Type[] getActualTypeArguments() {
        return (Type[]) this.c.clone();
    }

    public final Type getOwnerType() {
        return this.a;
    }

    public final Type getRawType() {
        return this.b;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.c) ^ this.b.hashCode()) ^ xi.a(this.a);
    }

    public final String toString() {
        int length = this.c.length;
        if (length == 0) {
            return xi.c(this.b);
        }
        StringBuilder stringBuilder = new StringBuilder((length + 1) * 30);
        stringBuilder.append(xi.c(this.b));
        stringBuilder.append("<");
        stringBuilder.append(xi.c(this.c[0]));
        for (int i = 1; i < length; i++) {
            stringBuilder.append(", ");
            stringBuilder.append(xi.c(this.c[i]));
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
