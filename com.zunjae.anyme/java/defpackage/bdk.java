package defpackage;

public final class bdk {
    final bdl a;
    final /* synthetic */ bdj b;
    private boolean c;

    public final void a() {
        synchronized (this.b) {
            if (this.c) {
                throw new IllegalStateException();
            }
            if (this.a.f == this) {
                this.b.a(this);
            }
            this.c = true;
        }
    }
}
