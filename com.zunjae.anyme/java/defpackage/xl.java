package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;

final class xl implements Serializable, WildcardType {
    private final Type a;
    private final Type b;

    public xl(Type[] typeArr, Type[] typeArr2) {
        Type type;
        boolean z = true;
        xh.a(typeArr2.length <= 1);
        xh.a(typeArr.length == 1);
        if (typeArr2.length == 1) {
            xh.a(typeArr2[0]);
            xi.e(typeArr2[0]);
            if (typeArr[0] != Object.class) {
                z = false;
            }
            xh.a(z);
            this.b = xi.a(typeArr2[0]);
            type = Object.class;
        } else {
            xh.a(typeArr[0]);
            xi.e(typeArr[0]);
            this.b = null;
            type = xi.a(typeArr[0]);
        }
        this.a = type;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof WildcardType) && xi.a((Type) this, (WildcardType) obj);
    }

    public final Type[] getLowerBounds() {
        if (this.b == null) {
            return xi.a;
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
        stringBuilder.append(xi.c(type));
        return stringBuilder.toString();
    }
}
