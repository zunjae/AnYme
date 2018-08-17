package defpackage;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

public class bia {
    public static final bia c = new bib();
    private boolean a;
    private long b;
    private long d;

    public bia a(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public bia a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
        } else if (timeUnit != null) {
            this.d = timeUnit.toNanos(j);
            return this;
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    public long d() {
        if (this.a) {
            return this.b;
        }
        throw new IllegalStateException("No deadline");
    }

    public bia f() {
        this.a = false;
        return this;
    }

    public long f_() {
        return this.d;
    }

    public void g() {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        } else if (!this.a) {
        } else {
            if (this.b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
        }
    }

    public boolean g_() {
        return this.a;
    }

    public bia h_() {
        this.d = 0;
        return this;
    }
}
