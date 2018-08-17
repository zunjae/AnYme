package defpackage;

import java.util.concurrent.Executor;

final class bjw<T> implements bjn<T> {
    final Executor a;
    final bjn<T> b;

    bjw(Executor executor, bjn<T> bjn_T) {
        this.a = executor;
        this.b = bjn_T;
    }

    public final bkx<T> a() {
        return this.b.a();
    }

    public final bjn<T> b() {
        return new bjw(this.a, this.b.b());
    }

    public final /* synthetic */ Object clone() {
        return b();
    }
}
