package defpackage;

import javax.annotation.Nullable;

final class bkc extends bkb<Iterable<T>> {
    final /* synthetic */ bkb a;

    bkc(bkb bkb) {
        this.a = bkb;
    }

    final /* synthetic */ void a(bkv bkv, @Nullable Object obj) {
        Iterable<Object> iterable = (Iterable) obj;
        if (iterable != null) {
            for (Object a : iterable) {
                this.a.a(bkv, a);
            }
        }
    }
}
