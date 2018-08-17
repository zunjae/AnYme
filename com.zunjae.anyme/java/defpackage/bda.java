package defpackage;

public abstract class bda implements Runnable {
    protected final String b;

    public bda(String str, Object... objArr) {
        this.b = bdb.a(str, objArr);
    }

    protected abstract void b();

    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(this.b);
        try {
            b();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
