package defpackage;

import java.io.Serializable;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class xj implements Serializable, GenericArrayType {
    private final Type a;

    public xj(Type type) {
        this.a = xi.a(type);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && xi.a((Type) this, (GenericArrayType) obj);
    }

    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xi.c(this.a));
        stringBuilder.append("[]");
        return stringBuilder.toString();
    }
}
