package defpackage;

import javax.annotation.Nullable;

final class bkf<T> extends bkb<T> {
    private final String a;
    private final bjq<T, String> b;
    private final boolean c;

    bkf(String str, bjq<T, String> bjq_T__java_lang_String, boolean z) {
        this.a = (String) bld.a((Object) str, "name == null");
        this.b = bjq_T__java_lang_String;
        this.c = z;
    }

    final void a(bkv bkv, @Nullable T t) {
        if (t != null) {
            String str = (String) this.b.a(t);
            if (str != null) {
                bkv.c(this.a, str, this.c);
            }
        }
    }
}
