package defpackage;

import java.util.concurrent.Callable;

final class rp implements Callable<Void> {
    final /* synthetic */ long a;
    final /* synthetic */ String b;
    final /* synthetic */ qp c;

    rp(qp qpVar, long j, String str) {
        this.c = qpVar;
        this.a = j;
        this.b = str;
    }

    public final /* synthetic */ Object call() {
        if (!this.c.d()) {
            this.c.r.a(this.a, this.b);
        }
        return null;
    }
}
