package defpackage;

import javax.annotation.Nullable;

final class bkj<T> extends bkb<T> {
    private final bbx a;
    private final bjq<T, bcp> b;

    bkj(bbx bbx, bjq<T, bcp> bjq_T__bcp) {
        this.a = bbx;
        this.b = bjq_T__bcp;
    }

    final void a(bkv bkv, @Nullable T t) {
        if (t != null) {
            try {
                bkv.a(this.a, (bcp) this.b.a(t));
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Unable to convert ");
                stringBuilder.append(t);
                stringBuilder.append(" to RequestBody");
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
    }
}
