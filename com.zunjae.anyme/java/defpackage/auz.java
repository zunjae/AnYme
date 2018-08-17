package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

final class auz<T> implements ParameterizedType {
    private final Class<?> a;

    auz(Class<T> cls) {
        this.a = cls;
    }

    public final Type[] getActualTypeArguments() {
        return new Type[]{this.a};
    }

    public final Type getOwnerType() {
        return null;
    }

    public final Type getRawType() {
        return List.class;
    }
}
