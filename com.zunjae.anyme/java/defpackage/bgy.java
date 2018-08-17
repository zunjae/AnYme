package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public class bgy extends bia {
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    @Nullable
    static bgy b;
    private static final long d = TimeUnit.MILLISECONDS.toNanos(a);
    private boolean e;
    @Nullable
    private bgy f;
    private long g;

    private static synchronized void a(bgy bgy, long j, boolean z) {
        synchronized (bgy.class) {
            if (b == null) {
                b = new bgy();
                new bhb().start();
            }
            long nanoTime = System.nanoTime();
            if (j != 0 && z) {
                bgy.g = Math.min(j, bgy.d() - nanoTime) + nanoTime;
            } else if (j != 0) {
                bgy.g = j + nanoTime;
            } else if (z) {
                bgy.g = bgy.d();
            } else {
                throw new AssertionError();
            }
            j = bgy.g - nanoTime;
            bgy bgy2 = b;
            while (bgy2.f != null) {
                if (j < bgy2.f.g - nanoTime) {
                    break;
                }
                bgy2 = bgy2.f;
            }
            bgy.f = bgy2.f;
            bgy2.f = bgy;
            if (bgy2 == b) {
                bgy.class.notify();
                return;
            }
        }
    }

    private static synchronized boolean a(bgy bgy) {
        boolean z;
        synchronized (bgy.class) {
            for (bgy bgy2 = b; bgy2 != null; bgy2 = bgy2.f) {
                if (bgy2.f == bgy) {
                    bgy2.f = bgy.f;
                    bgy.f = null;
                    z = false;
                    break;
                }
            }
            z = true;
        }
        return z;
    }

    @Nullable
    static bgy e() {
        bgy bgy = b.f;
        if (bgy == null) {
            long nanoTime = System.nanoTime();
            bgy.class.wait(a);
            return (b.f != null || System.nanoTime() - nanoTime < d) ? null : b;
        } else {
            long nanoTime2 = bgy.g - System.nanoTime();
            if (nanoTime2 > 0) {
                long j = nanoTime2 / 1000000;
                bgy.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
                return null;
            }
            b.f = bgy.f;
            bgy.f = null;
            return bgy;
        }
    }

    protected IOException a(@Nullable IOException iOException) {
        IOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    protected void a() {
    }

    final void a(boolean z) {
        if (!e_()) {
            return;
        }
        if (z) {
            throw a(null);
        }
    }

    final IOException b(IOException iOException) {
        return !e_() ? iOException : a(iOException);
    }

    public final void c() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long f_ = f_();
        boolean g_ = g_();
        if (f_ != 0 || g_) {
            this.e = true;
            bgy.a(this, f_, g_);
        }
    }

    public final boolean e_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return bgy.a(this);
    }
}
