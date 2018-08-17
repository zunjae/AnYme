package defpackage;

import java.util.Queue;

abstract class fz<T extends gi> {
    private final Queue<T> a = nw.a(20);

    fz() {
    }

    protected abstract T a();

    public final void a(T t) {
        if (this.a.size() < 20) {
            this.a.offer(t);
        }
    }

    protected final T b() {
        gi giVar = (gi) this.a.poll();
        return giVar == null ? a() : giVar;
    }
}
