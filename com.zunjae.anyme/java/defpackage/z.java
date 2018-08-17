package defpackage;

import android.content.Context;

final class z implements p {
    private final aa a;

    z(Context context, String str, q qVar) {
        this.a = new aa(context, str, new x[1], qVar);
    }

    public final o a() {
        return this.a.a();
    }

    public final void a(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
