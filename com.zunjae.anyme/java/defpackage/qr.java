package defpackage;

import java.util.concurrent.Callable;

final class qr implements Callable<Void> {
    final /* synthetic */ qp a;

    qr(qp qpVar) {
        this.a = qpVar;
    }

    public final /* synthetic */ Object call() {
        qp.b(this.a);
        return null;
    }
}
