package defpackage;

import javax.annotation.Nullable;

final class bke<T> extends bkb<T> {
    private final bjq<T, bcp> a;

    bke(bjq<T, bcp> bjq_T__bcp) {
        this.a = bjq_T__bcp;
    }

    final void a(bkv bkv, @Nullable T t) {
        if (t != null) {
            try {
                bkv.a((bcp) this.a.a(t));
                return;
            } catch (Throwable e) {
                StringBuilder stringBuilder = new StringBuilder("Unable to convert ");
                stringBuilder.append(t);
                stringBuilder.append(" to RequestBody");
                throw new RuntimeException(stringBuilder.toString(), e);
            }
        }
        throw new IllegalArgumentException("Body parameter value must not be null.");
    }
}
