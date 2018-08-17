package defpackage;

public class jp<T> implements ft<T> {
    protected final T a;

    public jp(T t) {
        if (t != null) {
            this.a = t;
            return;
        }
        throw new NullPointerException("Data must not be null");
    }

    public final T b() {
        return this.a;
    }

    public final int c() {
        return 1;
    }

    public final void d() {
    }
}
