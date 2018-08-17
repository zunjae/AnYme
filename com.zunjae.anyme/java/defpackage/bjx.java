package defpackage;

import java.io.IOException;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

final class bjx<T> implements bjn<T> {
    private final blb<T, ?> a;
    @Nullable
    private final Object[] b;
    private volatile boolean c;
    @GuardedBy("this")
    @Nullable
    private bay d;
    @GuardedBy("this")
    @Nullable
    private Throwable e;
    @GuardedBy("this")
    private boolean f;

    bjx(blb<T, ?> blb_T__, @Nullable Object[] objArr) {
        this.a = blb_T__;
        this.b = objArr;
    }

    private bkx<T> a(bcs bcs) {
        bcu g = bcs.g();
        bcs = bcs.h().a(new bka(g.a(), g.b())).a();
        int b = bcs.b();
        if (b >= 200) {
            if (b < 300) {
                if (b != 204) {
                    if (b != 205) {
                        try {
                            return bkx.a(this.a.a(new bjy(g)), bcs);
                        } catch (RuntimeException e) {
                            throw e;
                        }
                    }
                }
                g.close();
                return bkx.a(null, bcs);
            }
        }
        try {
            bkx<T> a = bkx.a(bld.a(g), bcs);
            return a;
        } finally {
            g.close();
        }
    }

    private bjx<T> c() {
        return new bjx(this.a, this.b);
    }

    public final bkx<T> a() {
        bay bay;
        synchronized (this) {
            if (this.f) {
                throw new IllegalStateException("Already executed.");
            }
            this.f = true;
            if (this.e == null) {
                bay = this.d;
                if (bay == null) {
                    try {
                        bay = this.a.a(this.b);
                        if (bay != null) {
                            this.d = bay;
                        } else {
                            throw new NullPointerException("Call.Factory returned null.");
                        }
                    } catch (Throwable e) {
                        bld.a(e);
                        this.e = e;
                        throw e;
                    }
                }
            } else if (this.e instanceof IOException) {
                throw ((IOException) this.e);
            } else if (this.e instanceof RuntimeException) {
                throw ((RuntimeException) this.e);
            } else {
                throw ((Error) this.e);
            }
        }
        if (this.c) {
            bay.b();
        }
        return a(bay.a());
    }

    public final /* synthetic */ bjn b() {
        return c();
    }

    public final /* synthetic */ Object clone() {
        return c();
    }
}
