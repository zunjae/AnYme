package defpackage;

import android.content.Context;

final class sc implements Runnable {
    private final Context a;
    private final tv b;
    private final tx c;

    public sc(Context context, tv tvVar, tx txVar) {
        this.a = context;
        this.b = tvVar;
        this.c = txVar;
    }

    public final void run() {
        if (awj.n(this.a)) {
            avf.c();
            this.c.a(this.b);
        }
    }
}
