package defpackage;

import java.util.concurrent.Executor;

final class axy<Result> implements Executor {
    private final Executor a;
    private final axx b;

    public axy(Executor executor, axx axx) {
        this.a = executor;
        this.b = axx;
    }

    public final void execute(Runnable runnable) {
        this.a.execute(new axz(this, runnable));
    }
}
