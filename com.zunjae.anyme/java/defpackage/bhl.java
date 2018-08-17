package defpackage;

import java.util.concurrent.TimeUnit;

public final class bhl extends bia {
    private bia a;

    public bhl(bia bia) {
        if (bia != null) {
            this.a = bia;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final bhl a(bia bia) {
        if (bia != null) {
            this.a = bia;
            return this;
        }
        throw new IllegalArgumentException("delegate == null");
    }

    public final bia a() {
        return this.a;
    }

    public final bia a(long j) {
        return this.a.a(j);
    }

    public final bia a(long j, TimeUnit timeUnit) {
        return this.a.a(j, timeUnit);
    }

    public final long d() {
        return this.a.d();
    }

    public final bia f() {
        return this.a.f();
    }

    public final long f_() {
        return this.a.f_();
    }

    public final void g() {
        this.a.g();
    }

    public final boolean g_() {
        return this.a.g_();
    }

    public final bia h_() {
        return this.a.h_();
    }
}
