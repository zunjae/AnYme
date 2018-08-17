package defpackage;

import android.util.Log;

final class fp implements ho, Runnable {
    private final int a;
    private final fq b;
    private final ew<?, ?, ?> c;
    private int d = fr.a;
    private volatile boolean e;

    public fp(fq fqVar, ew<?, ?, ?> ewVar, int i) {
        this.b = fqVar;
        this.c = ewVar;
        this.a = i;
    }

    private boolean c() {
        return this.d == fr.a;
    }

    private ft<?> d() {
        ft<?> a;
        try {
            a = this.c.a();
        } catch (Exception e) {
            if (Log.isLoggable("EngineRunnable", 3)) {
                new StringBuilder("Exception decoding result from cache: ").append(e);
            }
            a = null;
        }
        return a == null ? this.c.b() : a;
    }

    public final void a() {
        this.e = true;
        this.c.d();
    }

    public final int b() {
        return this.a - 1;
    }

    public final void run() {
        if (!this.e) {
            Exception exception;
            ft ftVar = null;
            try {
                exception = null;
                ftVar = c() ? d() : this.c.c();
            } catch (Exception e) {
                exception = e;
            }
            if (this.e) {
                if (ftVar != null) {
                    ftVar.d();
                }
            } else if (ftVar != null) {
                this.b.a(ftVar);
            } else if (c()) {
                this.d = fr.b;
                this.b.b(this);
            } else {
                this.b.a(exception);
            }
        }
    }
}
