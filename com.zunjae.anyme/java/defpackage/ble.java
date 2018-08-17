package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;

final class ble implements GenericArrayType {
    private final Type a;

    ble(Type type) {
        this.a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof GenericArrayType) && bld.a((Type) this, (GenericArrayType) obj);
    }

    public final Type getGenericComponentType() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bld.b(this.a));
        stringBuilder.append("[]");
        return stringBuilder.toString();
    }
}
