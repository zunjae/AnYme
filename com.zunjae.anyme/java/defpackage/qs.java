package defpackage;

import java.util.concurrent.Callable;

final class qs implements Callable<Boolean> {
    final /* synthetic */ bah a;
    final /* synthetic */ qp b;

    qs(qp qpVar, bah bah) {
        this.b = qpVar;
        this.a = bah;
    }

    public final /* synthetic */ Object call() {
        if (this.b.d()) {
            avf.c();
            return Boolean.FALSE;
        }
        avf.c();
        this.b.a(this.a, true);
        avf.c();
        return Boolean.TRUE;
    }
}
