package defpackage;

import java.util.LinkedList;
import java.util.concurrent.Executor;

final class axp implements Executor {
    final LinkedList<Runnable> a;
    Runnable b;

    private axp() {
        this.a = new LinkedList();
    }

    protected final synchronized void a() {
        Runnable runnable = (Runnable) this.a.poll();
        this.b = runnable;
        if (runnable != null) {
            axi.b.execute(this.b);
        }
    }

    public final synchronized void execute(Runnable runnable) {
        this.a.offer(new axq(this, runnable));
        if (this.b == null) {
            a();
        }
    }
}
