package defpackage;

import java.util.Collection;
import java.util.concurrent.ExecutorService;

public abstract class axx<Params, Progress, Result> extends axi<Params, Progress, Result> implements axt<ayg>, ayc, ayg {
    private final ayd a = new ayd();

    public int a() {
        return this.a.a();
    }

    public final void a(ayg ayg) {
        if (c_() == axr.a) {
            this.a.a(ayg);
            return;
        }
        throw new IllegalStateException("Must not add Dependency after task is running");
    }

    public final void a(Throwable th) {
        this.a.a(th);
    }

    public final void a(ExecutorService executorService, Params... paramsArr) {
        super.a(new axy(executorService, this), (Object[]) paramsArr);
    }

    public final void a(boolean z) {
        this.a.a(z);
    }

    public int compareTo(Object obj) {
        return axw.a(this, obj);
    }

    public final Collection<ayg> f() {
        return this.a.f();
    }

    public final boolean g() {
        return this.a.g();
    }

    public final boolean i() {
        return this.a.i();
    }
}
