package defpackage;

import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class ayb<V> extends FutureTask<V> implements axt<ayg>, ayc, ayg {
    final Object b;

    public ayb(Runnable runnable, V v) {
        super(runnable, v);
        this.b = ayb.b(runnable);
    }

    public ayb(Callable<V> callable) {
        super(callable);
        this.b = ayb.b(callable);
    }

    private static <T extends axt<ayg> & ayc & ayg> T b(Object obj) {
        return ayd.b(obj) ? (axt) obj : new ayd();
    }

    public final int a() {
        return ((ayc) b()).a();
    }

    public final /* synthetic */ void a(Object obj) {
        ((axt) ((ayc) b())).a((ayg) obj);
    }

    public final void a(Throwable th) {
        ((ayg) ((ayc) b())).a(th);
    }

    public final void a(boolean z) {
        ((ayg) ((ayc) b())).a(z);
    }

    public <T extends axt<ayg> & ayc & ayg> T b() {
        return (axt) this.b;
    }

    public int compareTo(Object obj) {
        return ((ayc) b()).compareTo(obj);
    }

    public final Collection<ayg> f() {
        return ((axt) ((ayc) b())).f();
    }

    public final boolean g() {
        return ((axt) ((ayc) b())).g();
    }

    public final boolean i() {
        return ((ayg) ((ayc) b())).i();
    }
}
