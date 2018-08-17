package defpackage;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class blg implements WildcardType {
    private final Type a;
    private final Type b;

    blg(Type[] typeArr, Type[] typeArr2) {
        if (typeArr2.length <= 1) {
            Type type;
            if (typeArr2.length == 1) {
                if (typeArr2[0] != null) {
                    bld.c(typeArr2[0]);
                    if (typeArr[0] == Object.class) {
                        this.b = typeArr2[0];
                        type = Object.class;
                    } else {
                        throw new IllegalArgumentException();
                    }
                }
                throw new NullPointerException();
            } else if (typeArr[0] != null) {
                bld.c(typeArr[0]);
                this.b = null;
                type = typeArr[0];
            } else {
                throw new NullPointerException();
            }
            this.a = type;
            return;
        }
        throw new IllegalArgumentException();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && bld.a((Type) this, (WildcardType) obj);
    }

    public final Type[] getLowerBounds() {
        if (this.b == null) {
            return bld.a;
        }
        return new Type[]{this.b};
    }

    public final Type[] getUpperBounds() {
        return new Type[]{this.a};
    }

    public final int hashCode() {
        Type type = this.b;
        return (type != null ? type.hashCode() + 31 : 1) ^ (this.a.hashCode() + 31);
    }

    public final String toString() {
        StringBuilder stringBuilder;
        Type type;
        if (this.b != null) {
            stringBuilder = new StringBuilder("? super ");
            type = this.b;
        } else if (this.a == Object.class) {
            return "?";
        } else {
            stringBuilder = new StringBuilder("? extends ");
            type = this.a;
        }
        stringBuilder.append(bld.b(type));
        return stringBuilder.toString();
    }
}
