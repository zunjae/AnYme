package defpackage;

import java.util.concurrent.Executor;

public class a extends e {
    private static volatile a a;
    private static final Executor d = new b();
    private static final Executor e = new c();
    private e b = this.c;
    private e c = new d();

    private a() {
    }

    public static a a() {
        a aVar = a;
        if (aVar != null) {
            return aVar;
        }
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
        }
        return a;
    }

    public static Executor b() {
        return e;
    }

    public final void a(Runnable runnable) {
        this.b.a(runnable);
    }

    public final void b(Runnable runnable) {
        this.b.b(runnable);
    }

    public final boolean c() {
        return this.b.c();
    }
}
