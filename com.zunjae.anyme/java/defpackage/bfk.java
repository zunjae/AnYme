package defpackage;

final class bfk extends bda {
    final boolean a;
    final int c;
    final int d;
    final /* synthetic */ bfa e;

    bfk(bfa bfa, boolean z, int i, int i2) {
        this.e = bfa;
        super("OkHttp %s ping %08x%08x", bfa.d, Integer.valueOf(i), Integer.valueOf(i2));
        this.a = z;
        this.c = i;
        this.d = i2;
    }

    public final void b() {
        this.e.a(this.a, this.c, this.d);
    }
}
