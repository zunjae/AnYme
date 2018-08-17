package defpackage;

import javax.annotation.Nullable;

public final class bkx<T> {
    private final bcs a;
    @Nullable
    private final T b;
    @Nullable
    private final bcu c;

    private bkx(bcs bcs, @Nullable T t, @Nullable bcu bcu) {
        this.a = bcs;
        this.b = t;
        this.c = bcu;
    }

    public static <T> bkx<T> a(bcu bcu, bcs bcs) {
        bld.a((Object) bcu, "body == null");
        bld.a((Object) bcs, "rawResponse == null");
        if (!bcs.c()) {
            return new bkx(bcs, null, bcu);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> bkx<T> a(@Nullable T t, bcs bcs) {
        bld.a((Object) bcs, "rawResponse == null");
        if (bcs.c()) {
            return new bkx(bcs, t, null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public final int a() {
        return this.a.b();
    }

    @Nullable
    public final T b() {
        return this.b;
    }

    public final String toString() {
        return this.a.toString();
    }
}
