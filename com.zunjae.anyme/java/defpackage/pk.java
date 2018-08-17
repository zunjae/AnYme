package defpackage;

import android.app.Activity;
import java.util.Collections;

final class pk implements or {
    final od a;
    final ava b;
    final op c;
    final om d;
    private final long e;

    pk(od odVar, ava ava, op opVar, om omVar, long j) {
        this.a = odVar;
        this.b = ava;
        this.c = opVar;
        this.d = omVar;
        this.e = j;
    }

    public final void a() {
        avf.c();
        this.a.d();
    }

    public final void a(Activity activity, po poVar) {
        avf.c();
        new StringBuilder("Logged lifecycle event: ").append(poVar.name());
        this.a.a(pm.a(poVar, activity));
    }

    public final void a(pc pcVar) {
        avf.c();
        new StringBuilder("Logged predefined event: ").append(pcVar);
        this.a.a(pm.a(pcVar));
    }

    public final void b() {
        this.a.c();
        this.b.a(new ol(this, this.c));
        this.c.a((or) this);
        if ((this.d.b() ^ 1) != 0) {
            long j = this.e;
            avf.c();
            od odVar = this.a;
            pn pnVar = new pn(po.INSTALL);
            pnVar.c = Collections.singletonMap("installedAt", String.valueOf(j));
            odVar.b(pnVar);
            this.d.a();
        }
    }
}
