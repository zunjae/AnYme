package defpackage;

final class bfg extends bda {
    final /* synthetic */ int a;
    final /* synthetic */ bes c;
    final /* synthetic */ bfa d;

    bfg(bfa bfa, String str, Object[] objArr, int i, bes bes) {
        this.d = bfa;
        this.a = i;
        this.c = bes;
        super(str, objArr);
    }

    public final void b() {
        synchronized (this.d) {
            this.d.q.remove(Integer.valueOf(this.a));
        }
    }
}
