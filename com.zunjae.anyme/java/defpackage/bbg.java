package defpackage;

import java.lang.ref.Reference;
import java.net.Socket;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;

public final class bbg {
    static final /* synthetic */ boolean c = true;
    private static final Executor d = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), bdb.a("OkHttp ConnectionPool", (boolean) c));
    final bdq a;
    boolean b;
    private final int e;
    private final long f;
    private final Runnable g;
    private final Deque<bdp> h;

    public bbg() {
        this(TimeUnit.MINUTES);
    }

    private bbg(TimeUnit timeUnit) {
        this.g = new bbh(this);
        this.h = new ArrayDeque();
        this.a = new bdq();
        this.e = 5;
        this.f = timeUnit.toNanos(5);
    }

    final long a(long j) {
        synchronized (this) {
            long j2 = Long.MIN_VALUE;
            bdp bdp = null;
            int i = 0;
            int i2 = 0;
            for (bdp bdp2 : this.h) {
                int i3;
                List list = bdp2.d;
                int i4 = 0;
                while (i4 < list.size()) {
                    Reference reference = (Reference) list.get(i4);
                    if (reference.get() != null) {
                        i4++;
                    } else {
                        bdv bdv = (bdv) reference;
                        StringBuilder stringBuilder = new StringBuilder("A connection to ");
                        stringBuilder.append(bdp2.b().a.a);
                        stringBuilder.append(" was leaked. Did you forget to close a response body?");
                        bgo.c().a(stringBuilder.toString(), bdv.a);
                        list.remove(i4);
                        bdp2.a = c;
                        if (list.isEmpty()) {
                            bdp2.e = j - this.f;
                            i3 = 0;
                            break;
                        }
                    }
                }
                i3 = list.size();
                if (i3 > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - bdp2.e;
                    if (j3 > j2) {
                        bdp = bdp2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.f) {
                if (i <= this.e) {
                    if (i > 0) {
                        j = this.f - j2;
                        return j;
                    } else if (i2 > 0) {
                        j = this.f;
                        return j;
                    } else {
                        this.b = false;
                        return -1;
                    }
                }
            }
            this.h.remove(bdp);
            bdb.a(bdp.d());
            return 0;
        }
    }

    @Nullable
    final bdp a(bas bas, bdu bdu, bcx bcx) {
        if (!c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        for (bdp bdp : this.h) {
            if (bdp.a(bas, bcx)) {
                bdu.a(bdp, (boolean) c);
                return bdp;
            }
        }
        return null;
    }

    @Nullable
    final Socket a(bas bas, bdu bdu) {
        if (!c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        for (bdp bdp : this.h) {
            if (bdp.a(bas, null) && bdp.f() && bdp != bdu.c()) {
                return bdu.a(bdp);
            }
        }
        return null;
    }

    final void a(bdp bdp) {
        if (!c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!this.b) {
            this.b = c;
            d.execute(this.g);
        }
        this.h.add(bdp);
    }

    final boolean b(bdp bdp) {
        if (!c) {
            if (!Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        if (!bdp.a) {
            if (this.e != 0) {
                notifyAll();
                return false;
            }
        }
        this.h.remove(bdp);
        return c;
    }
}
