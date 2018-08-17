package defpackage;

import javax.annotation.Nullable;

final class bkl<T> extends bkb<T> {
    private final String a;
    private final bjq<T, String> b;
    private final boolean c;

    bkl(String str, bjq<T, String> bjq_T__java_lang_String, boolean z) {
        this.a = (String) bld.a((Object) str, "name == null");
        this.b = bjq_T__java_lang_String;
        this.c = z;
    }

    final void a(bkv bkv, @Nullable T t) {
        if (t != null) {
            bkv.a(this.a, (String) this.b.a(t), this.c);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Path parameter \"");
        stringBuilder.append(this.a);
        stringBuilder.append("\" value must not be null.");
        throw new IllegalArgumentException(stringBuilder.toString());
    }
}
