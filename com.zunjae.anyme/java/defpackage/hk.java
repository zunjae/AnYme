package defpackage;

import java.util.concurrent.FutureTask;

final class hk<T> extends FutureTask<T> implements Comparable<hk<?>> {
    private final int a;
    private final int b;

    public hk(Runnable runnable, T t, int i) {
        super(runnable, t);
        if (runnable instanceof ho) {
            this.a = ((ho) runnable).b();
            this.b = i;
            return;
        }
        throw new IllegalArgumentException("FifoPriorityThreadPoolExecutor must be given Runnables that implement Prioritized");
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        hk hkVar = (hk) obj;
        int i = this.a - hkVar.a;
        return i == 0 ? this.b - hkVar.b : i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof hk) {
            hk hkVar = (hk) obj;
            if (this.b == hkVar.b && this.a == hkVar.a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 31) + this.b;
    }
}
