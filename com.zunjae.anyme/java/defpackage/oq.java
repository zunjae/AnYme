package defpackage;

final class oq implements Runnable {
    final /* synthetic */ op a;

    oq(op opVar) {
        this.a = opVar;
    }

    public final void run() {
        this.a.a.set(null);
        op.a(this.a);
    }
}
