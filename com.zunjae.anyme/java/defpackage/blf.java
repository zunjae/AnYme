package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import javax.annotation.Nullable;

final class blf implements ParameterizedType {
    private final Type a;
    private final Type b;
    private final Type[] c;

    blf(@Nullable Type type, Type type2, Type... typeArr) {
        Object obj;
        if (type2 instanceof Class) {
            Object obj2 = 1;
            obj = type == null ? 1 : null;
            if (((Class) type2).getEnclosingClass() != null) {
                obj2 = null;
            }
            if (obj != obj2) {
                throw new IllegalArgumentException();
            }
        }
        for (Object obj3 : typeArr) {
            bld.a(obj3, "typeArgument == null");
            bld.c(obj3);
        }
        this.a = type;
        this.b = type2;
        this.c = (Type[]) typeArr.clone();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ParameterizedType) && bld.a((Type) this, (ParameterizedType) obj);
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
        int hashCode = Arrays.hashCode(this.c) ^ this.b.hashCode();
        Type type = this.a;
        return hashCode ^ (type != null ? type.hashCode() : 0);
    }

    public final String toString() {
        Type[] typeArr = this.c;
        if (typeArr.length == 0) {
            return bld.b(this.b);
        }
        int i = 1;
        StringBuilder stringBuilder = new StringBuilder((typeArr.length + 1) * 30);
        stringBuilder.append(bld.b(this.b));
        stringBuilder.append("<");
        stringBuilder.append(bld.b(this.c[0]));
        while (i < this.c.length) {
            stringBuilder.append(", ");
            stringBuilder.append(bld.b(this.c[i]));
            i++;
        }
        stringBuilder.append(">");
        return stringBuilder.toString();
    }
}
