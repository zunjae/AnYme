package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

final class fh implements fq {
    private static final fi a = new fi();
    private static final Handler b = new Handler(Looper.getMainLooper(), new fj());
    private final List<ml> c;
    private final fi d;
    private final fk e;
    private final eg f;
    private final ExecutorService g;
    private final ExecutorService h;
    private final boolean i;
    private boolean j;
    private ft<?> k;
    private boolean l;
    private Exception m;
    private boolean n;
    private Set<ml> o;
    private fp p;
    private fn<?> q;
    private volatile Future<?> r;

    public fh(eg egVar, ExecutorService executorService, ExecutorService executorService2, boolean z, fk fkVar) {
        this(egVar, executorService, executorService2, z, fkVar, a);
    }

    private fh(eg egVar, ExecutorService executorService, ExecutorService executorService2, boolean z, fk fkVar, fi fiVar) {
        this.c = new ArrayList();
        this.f = egVar;
        this.g = executorService;
        this.h = executorService2;
        this.i = z;
        this.e = fkVar;
        this.d = fiVar;
    }

    static /* synthetic */ void a(fh fhVar) {
        if (fhVar.j) {
            fhVar.k.d();
        } else if (fhVar.c.isEmpty()) {
            throw new IllegalStateException("Received a resource without any callbacks to notify");
        } else {
            fhVar.q = new fn(fhVar.k, fhVar.i);
            fhVar.l = true;
            fhVar.q.e();
            fhVar.e.a(fhVar.f, fhVar.q);
            for (ml mlVar : fhVar.c) {
                if (!fhVar.c(mlVar)) {
                    fhVar.q.e();
                    mlVar.a(fhVar.q);
                }
            }
            fhVar.q.f();
        }
    }

    static /* synthetic */ void b(fh fhVar) {
        if (!fhVar.j) {
            if (fhVar.c.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            fhVar.n = true;
            fhVar.e.a(fhVar.f, null);
            for (ml mlVar : fhVar.c) {
                if (!fhVar.c(mlVar)) {
                    mlVar.a(fhVar.m);
                }
            }
        }
    }

    private boolean c(ml mlVar) {
        Set set = this.o;
        return set != null && set.contains(mlVar);
    }

    public final void a(fp fpVar) {
        this.p = fpVar;
        this.r = this.g.submit(fpVar);
    }

    public final void a(ft<?> ftVar) {
        this.k = ftVar;
        b.obtainMessage(1, this).sendToTarget();
    }

    public final void a(Exception exception) {
        this.m = exception;
        b.obtainMessage(2, this).sendToTarget();
    }

    public final void a(ml mlVar) {
        nw.a();
        if (this.l) {
            mlVar.a(this.q);
        } else if (this.n) {
            mlVar.a(this.m);
        } else {
            this.c.add(mlVar);
        }
    }

    public final void b(fp fpVar) {
        this.r = this.h.submit(fpVar);
    }

    public final void b(ml mlVar) {
        nw.a();
        if (!this.l) {
            if (!this.n) {
                this.c.remove(mlVar);
                if (!(!this.c.isEmpty() || this.n || this.l)) {
                    if (!this.j) {
                        this.p.a();
                        Future future = this.r;
                        if (future != null) {
                            future.cancel(true);
                        }
                        this.j = true;
                        this.e.a(this, this.f);
                    }
                }
                return;
            }
        }
        if (this.o == null) {
            this.o = new HashSet();
        }
        this.o.add(mlVar);
    }
}
