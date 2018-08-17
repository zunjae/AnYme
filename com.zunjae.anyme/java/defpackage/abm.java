package defpackage;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class abm<T> {
    final Class<? super T> a;
    final Type b;
    final int c;

    protected abm() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        this.b = xi.a(((ParameterizedType) genericSuperclass).getActualTypeArguments()[0]);
        this.a = xi.b(this.b);
        this.c = this.b.hashCode();
    }

    private abm(Type type) {
        this.b = xi.a((Type) xh.a((Object) type));
        this.a = xi.b(this.b);
        this.c = this.b.hashCode();
    }

    public static <T> abm<T> a(Class<T> cls) {
        return new abm(cls);
    }

    public static abm<?> a(Type type) {
        return new abm(type);
    }

    public final Class<? super T> a() {
        return this.a;
    }

    public final Type b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof abm) && xi.a(this.b, ((abm) obj).b);
    }

    public final int hashCode() {
        return this.c;
    }

    public final String toString() {
        return xi.c(this.b);
    }
}
