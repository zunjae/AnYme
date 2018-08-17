package defpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class axi<Params, Progress, Result> {
    private static final int a;
    public static final Executor b = new ThreadPoolExecutor(d, e, 1, TimeUnit.SECONDS, g, f);
    public static final Executor c = new axp();
    private static final int d;
    private static final int e = ((a * 2) + 1);
    private static final ThreadFactory f = new axj();
    private static final BlockingQueue<Runnable> g = new LinkedBlockingQueue(128);
    private static final axo h = new axo();
    private static volatile Executor i = c;
    private final axs<Params, Result> j = new axk(this);
    private final FutureTask<Result> k = new axl(this, this.j);
    private volatile int l = axr.a;
    private final AtomicBoolean m = new AtomicBoolean();
    private final AtomicBoolean n = new AtomicBoolean();

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        d = availableProcessors + 1;
    }

    private Result b(Result result) {
        h.obtainMessage(1, new axn(this, result)).sendToTarget();
        return result;
    }

    static /* synthetic */ void b(axi axi) {
        if (axi.m.get()) {
            axi.d();
        } else {
            axi.c();
        }
        axi.l = axr.c;
    }

    static /* synthetic */ void b(axi axi, Object obj) {
        if (!axi.n.get()) {
            axi.b(obj);
        }
    }

    public final axi<Params, Progress, Result> a(Executor executor, Params... paramsArr) {
        int i = this.l;
        if (i != axr.a) {
            switch (axm.a[i - 1]) {
                case tw.a /*1*/:
                    throw new IllegalStateException("Cannot execute task: the task is already running.");
                case tw.b /*2*/:
                    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
                default:
                    break;
            }
        }
        this.l = axr.b;
        b();
        this.j.b = paramsArr;
        executor.execute(this.k);
        return this;
    }

    protected void b() {
    }

    protected void c() {
    }

    public final int c_() {
        return this.l;
    }

    protected void d() {
    }

    public final boolean d_() {
        return this.m.get();
    }

    protected abstract Result e();

    public final boolean h() {
        this.m.set(true);
        return this.k.cancel(true);
    }
}
