package defpackage;

import android.content.Context;

public final class s {
    Context a;
    String b;
    q c;

    s(Context context) {
        this.a = context;
    }

    public final r a() {
        q qVar = this.c;
        if (qVar != null) {
            Context context = this.a;
            if (context != null) {
                return new r(context, this.b, qVar);
            }
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        }
        throw new IllegalArgumentException("Must set a callback to create the configuration.");
    }

    public final s a(String str) {
        this.b = str;
        return this;
    }

    public final s a(q qVar) {
        this.c = qVar;
        return this;
    }
}
