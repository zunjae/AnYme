package defpackage;

import android.annotation.TargetApi;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class aye extends ThreadPoolExecutor {
    private static final int a;
    private static final int b;
    private static final int c = ((a * 2) + 1);

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        a = availableProcessors;
        b = availableProcessors + 1;
    }

    private <T extends Runnable & axt & ayg & ayc> aye(int i, int i2, TimeUnit timeUnit, axu<T> axu_T, ThreadFactory threadFactory) {
        super(i, i2, 1, timeUnit, axu_T, threadFactory);
        prestartAllCoreThreads();
    }

    public static aye a() {
        return new aye(b, c, TimeUnit.SECONDS, new axu(), new ayf());
    }

    protected final void afterExecute(Runnable runnable, Throwable th) {
        ayg ayg = (ayg) runnable;
        ayg.a(true);
        ayg.a(th);
        ((axu) super.getQueue()).a();
        super.afterExecute(runnable, th);
    }

    @TargetApi(9)
    public final void execute(Runnable runnable) {
        if (ayd.b(runnable)) {
            super.execute(runnable);
        } else {
            super.execute(newTaskFor(runnable, null));
        }
    }

    public final /* bridge */ /* synthetic */ BlockingQueue getQueue() {
        return (axu) super.getQueue();
    }

    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new ayb(runnable, t);
    }

    protected final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return new ayb(callable);
    }
}
