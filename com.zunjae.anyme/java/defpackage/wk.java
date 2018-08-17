package defpackage;

final class wk<T> extends wz<T> {
    private wz<T> a;

    wk() {
    }

    public final T a(abn abn) {
        wz wzVar = this.a;
        if (wzVar != null) {
            return wzVar.a(abn);
        }
        throw new IllegalStateException();
    }

    public final void a(abq abq, T t) {
        wz wzVar = this.a;
        if (wzVar != null) {
            wzVar.a(abq, t);
            return;
        }
        throw new IllegalStateException();
    }

    public final void a(wz<T> wzVar) {
        if (this.a == null) {
            this.a = wzVar;
            return;
        }
        throw new AssertionError();
    }
}
