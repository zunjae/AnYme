package defpackage;

import java.io.File;
import java.util.Set;
import java.util.concurrent.Callable;

final class qv implements Callable<Boolean> {
    final /* synthetic */ sm a;
    final /* synthetic */ qp b;

    qv(qp qpVar, sm smVar) {
        this.b = qpVar;
        this.a = smVar;
    }

    public final /* synthetic */ Object call() {
        Set set = this.a.a;
        String d = qp.d(this.b);
        if (!(d == null || set.isEmpty())) {
            File file = (File) set.first();
            if (file != null) {
                qp qpVar = this.b;
                qp.a(qpVar, qpVar.j.m(), file, d);
            }
        }
        qp.a(this.b, set);
        return Boolean.TRUE;
    }
}
