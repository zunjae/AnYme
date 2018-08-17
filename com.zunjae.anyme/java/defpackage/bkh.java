package defpackage;

import javax.annotation.Nullable;

final class bkh<T> extends bkb<T> {
    private final String a;
    private final bjq<T, String> b;

    bkh(String str, bjq<T, String> bjq_T__java_lang_String) {
        this.a = (String) bld.a((Object) str, "name == null");
        this.b = bjq_T__java_lang_String;
    }

    final void a(bkv bkv, @Nullable T t) {
        if (t != null) {
            String str = (String) this.b.a(t);
            if (str != null) {
                bkv.a(this.a, str);
            }
        }
    }
}
