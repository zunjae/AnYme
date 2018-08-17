package defpackage;

import android.os.Looper;

final class fn<Z> implements ft<Z> {
    private final ft<Z> a;
    private final boolean b;
    private fo c;
    private eg d;
    private int e;
    private boolean f;

    fn(ft<Z> ftVar, boolean z) {
        if (ftVar != null) {
            this.a = ftVar;
            this.b = z;
            return;
        }
        throw new NullPointerException("Wrapped resource must not be null");
    }

    final void a(eg egVar, fo foVar) {
        this.d = egVar;
        this.c = foVar;
    }

    final boolean a() {
        return this.b;
    }

    public final Z b() {
        return this.a.b();
    }

    public final int c() {
        return this.a.c();
    }

    public final void d() {
        if (this.e > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        } else if (this.f) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        } else {
            this.f = true;
            this.a.d();
        }
    }

    final void e() {
        if (this.f) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            this.e++;
        } else {
            throw new IllegalThreadStateException("Must call acquire on the main thread");
        }
    }

    final void f() {
        if (this.e <= 0) {
            throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
        } else if (Looper.getMainLooper().equals(Looper.myLooper())) {
            int i = this.e - 1;
            this.e = i;
            if (i == 0) {
                this.c.b(this.d, this);
            }
        } else {
            throw new IllegalThreadStateException("Must call release on the main thread");
        }
    }
}
