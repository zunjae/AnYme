package defpackage;

public final class kt implements ft<ks> {
    private final ks a;

    public kt(ks ksVar) {
        if (ksVar != null) {
            this.a = ksVar;
            return;
        }
        throw new NullPointerException("Data must not be null");
    }

    public final /* bridge */ /* synthetic */ Object b() {
        return this.a;
    }

    public final int c() {
        return this.a.a();
    }

    public final void d() {
        ft b = this.a.b();
        if (b != null) {
            b.d();
        }
        b = this.a.c();
        if (b != null) {
            b.d();
        }
    }
}
