package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumSet;

final class xw implements yn<T> {
    final /* synthetic */ Type a;
    final /* synthetic */ xm b;

    xw(xm xmVar, Type type) {
        this.b = xmVar;
        this.a = type;
    }

    public final T a() {
        Type type = this.a;
        if (type instanceof ParameterizedType) {
            type = ((ParameterizedType) type).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return EnumSet.noneOf((Class) type);
            }
            StringBuilder stringBuilder = new StringBuilder("Invalid EnumSet type: ");
            stringBuilder.append(this.a.toString());
            throw new wp(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder("Invalid EnumSet type: ");
        stringBuilder.append(this.a.toString());
        throw new wp(stringBuilder.toString());
    }
}
