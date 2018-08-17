package defpackage;

import javax.annotation.Nullable;

final class bko<T> extends bkb<T> {
    private final bjq<T, String> a;
    private final boolean b;

    bko(bjq<T, String> bjq_T__java_lang_String, boolean z) {
        this.a = bjq_T__java_lang_String;
        this.b = z;
    }

    final void a(bkv bkv, @Nullable T t) {
        if (t != null) {
            bkv.b((String) this.a.a(t), null, this.b);
        }
    }
}
