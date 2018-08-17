package defpackage;

import java.io.EOFException;
import java.io.IOException;

final class bfu implements bhz {
    static final /* synthetic */ boolean c = true;
    boolean a;
    boolean b;
    final /* synthetic */ bfs d;
    private final bhd e = new bhd();
    private final bhd f = new bhd();
    private final long g;

    static {
        Class cls = bfs.class;
    }

    bfu(bfs bfs, long j) {
        this.d = bfs;
        this.g = j;
    }

    private void a(long j) {
        if (!c) {
            if (Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
        }
        this.d.d.a(j);
    }

    private void b() {
        this.d.f.c();
        while (this.f.b() == 0 && !this.b && !this.a && this.d.h == null) {
            try {
                this.d.i();
            } catch (Throwable th) {
                this.d.f.b();
            }
        }
        this.d.f.b();
    }

    public final long a(bhd bhd, long j) {
        if (j >= 0) {
            bes bes;
            long a;
            synchronized (this.d) {
                b();
                if (this.a) {
                    throw new IOException("stream closed");
                }
                bes = this.d.h;
                if (this.f.b() > 0) {
                    a = this.f.a(bhd, Math.min(j, this.f.b()));
                    bfs bfs = this.d;
                    bfs.a += a;
                } else {
                    a = -1;
                }
                if (bes == null && this.d.a >= ((long) (this.d.d.k.d() / 2))) {
                    this.d.d.a(this.d.c, this.d.a);
                    this.d.a = 0;
                }
            }
            if (a != -1) {
                a(a);
                return a;
            } else if (bes == null) {
                return -1;
            } else {
                throw new bgc(bes);
            }
        }
        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
    }

    public final bia a() {
        return this.d.f;
    }

    final void a(bhh bhh, long j) {
        if (!c) {
            if (Thread.holdsLock(this.d)) {
                throw new AssertionError();
            }
        }
        while (j > 0) {
            synchronized (this.d) {
                boolean z = this.b;
                Object obj = null;
                Object obj2 = this.f.b() + j > this.g ? 1 : null;
            }
            if (obj2 != null) {
                bhh.h(j);
                this.d.b(bes.FLOW_CONTROL_ERROR);
                return;
            } else if (z) {
                bhh.h(j);
                return;
            } else {
                long a = bhh.a(this.e, j);
                if (a != -1) {
                    j -= a;
                    synchronized (this.d) {
                        if (this.f.b() == 0) {
                            obj = 1;
                        }
                        this.f.a(this.e);
                        if (obj != null) {
                            this.d.notifyAll();
                        }
                    }
                } else {
                    throw new EOFException();
                }
            }
        }
    }

    public final void close() {
        synchronized (this.d) {
            this.a = c;
            long b = this.f.b();
            this.f.s();
            this.d.notifyAll();
        }
        if (b > 0) {
            a(b);
        }
        this.d.g();
    }
}
