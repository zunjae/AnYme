package defpackage;

import java.util.Date;
import java.util.concurrent.Callable;

final class ro implements Callable<Void> {
    final /* synthetic */ Date a;
    final /* synthetic */ Thread b;
    final /* synthetic */ Throwable c;
    final /* synthetic */ sr d;
    final /* synthetic */ boolean e;
    final /* synthetic */ qp f;

    ro(qp qpVar, Date date, Thread thread, Throwable th, sr srVar, boolean z) {
        this.f = qpVar;
        this.a = date;
        this.b = thread;
        this.c = th;
        this.d = srVar;
        this.e = z;
    }

    public final /* synthetic */ Object call() {
        bah bah;
        bae bae;
        Object obj;
        this.f.j.j();
        qp.a(this.f, this.a, this.b, this.c);
        bam a = this.d.a();
        if (a != null) {
            bah = a.b;
            bae = a.d;
        } else {
            bah = null;
            bae = bah;
        }
        if (bae != null) {
            if (!bae.e) {
                obj = null;
                if (obj != null || this.e) {
                    qp.a(this.f, this.a.getTime());
                }
                this.f.b(bah);
                qp.b(this.f);
                if (bah != null) {
                    this.f.a(bah.g);
                }
                if (!this.f.b(a)) {
                    qp.b(this.f, a);
                }
                return null;
            }
        }
        obj = 1;
        qp.a(this.f, this.a.getTime());
        this.f.b(bah);
        qp.b(this.f);
        if (bah != null) {
            this.f.a(bah.g);
        }
        if (this.f.b(a)) {
            qp.b(this.f, a);
        }
        return null;
    }
}
