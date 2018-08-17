package defpackage;

import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class hg extends ThreadPoolExecutor {
    private final AtomicInteger a;
    private final hl b;

    public hg(int i) {
        this(i, hl.LOG);
    }

    private hg(int i, int i2, TimeUnit timeUnit, ThreadFactory threadFactory, hl hlVar) {
        super(i, i2, 0, timeUnit, new PriorityBlockingQueue(), threadFactory);
        this.a = new AtomicInteger();
        this.b = hlVar;
    }

    private hg(int i, hl hlVar) {
        this(i, i, TimeUnit.MILLISECONDS, new hi(), hlVar);
    }

    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (th == null && (runnable instanceof Future)) {
            Future future = (Future) runnable;
            if (future.isDone() && !future.isCancelled()) {
                try {
                    future.get();
                } catch (Throwable e) {
                    this.b.handle(e);
                } catch (Throwable e2) {
                    this.b.handle(e2);
                }
            }
        }
    }

    protected final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return new hk(runnable, t, this.a.getAndIncrement());
    }
}
