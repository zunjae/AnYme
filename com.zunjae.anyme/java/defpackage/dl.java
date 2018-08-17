package defpackage;

public final class dl {
    final /* synthetic */ dk a;
    private final A b;
    private final Class<A> c;
    private final boolean d = true;

    dl(dk dkVar, A a) {
        this.a = dkVar;
        this.b = a;
        this.c = a != null ? a.getClass() : null;
    }

    public final <Z> dd<A, T, Z> a(Class<Z> cls) {
        dd<A, T, Z> ddVar = new dd(this.a.a.a, this.a.a.e, this.c, this.a.b, this.a.c, cls, this.a.a.d, this.a.a.b, this.a.a.f);
        if (this.d) {
            ddVar.b(this.b);
        }
        return ddVar;
    }
}
