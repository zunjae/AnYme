package defpackage;

import javax.annotation.Nullable;

abstract class bkb<T> {
    bkb() {
    }

    final bkb<Iterable<T>> a() {
        return new bkc(this);
    }

    abstract void a(bkv bkv, @Nullable T t);

    final bkb<Object> b() {
        return new bkd(this);
    }
}
