package defpackage;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public final class bbn {
    private int a = 64;
    private int b = 5;
    @Nullable
    private Runnable c;
    @Nullable
    private ExecutorService d;
    private final Deque<bcm> e = new ArrayDeque();
    private final Deque<bcm> f = new ArrayDeque();
    private final Deque<bcl> g = new ArrayDeque();

    private synchronized ExecutorService a() {
        if (this.d == null) {
            this.d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), bdb.a("OkHttp Dispatcher", false));
        }
        return this.d;
    }

    private <T> void a(Deque<T> deque, T t, boolean z) {
        synchronized (this) {
            if (deque.remove(t)) {
                if (z) {
                    b();
                }
                int c = c();
                Runnable runnable = this.c;
            } else {
                throw new AssertionError("Call wasn't in-flight!");
            }
        }
        if (c == 0 && runnable != null) {
            runnable.run();
        }
    }

    private void b() {
        if (this.f.size() < this.a && !this.e.isEmpty()) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                bcm bcm = (bcm) it.next();
                int i = 0;
                for (bcm bcm2 : this.f) {
                    if (!bcm2.a.d && bcm2.a().equals(bcm.a())) {
                        i++;
                    }
                }
                if (i < this.b) {
                    it.remove();
                    this.f.add(bcm);
                    a().execute(bcm);
                }
                if (this.f.size() >= this.a) {
                    break;
                }
            }
        }
    }

    private synchronized int c() {
        return this.f.size() + this.g.size();
    }

    final synchronized void a(bcl bcl) {
        this.g.add(bcl);
    }

    final void a(bcm bcm) {
        a(this.f, bcm, true);
    }

    final void b(bcl bcl) {
        a(this.g, bcl, false);
    }
}
