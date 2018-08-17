package defpackage;

import java.io.File;

public final class ma<A, T, Z, R> implements Cloneable, mf<A, T, Z, R> {
    private final mf<A, T, Z, R> a;
    private ei<File, Z> b;
    private ei<T, Z> c;
    private ej<Z> d;
    private ld<Z, R> e;
    private ef<T> f;

    public ma(mf<A, T, Z, R> mfVar) {
        this.a = mfVar;
    }

    public final ei<File, Z> a() {
        ei<File, Z> eiVar = this.b;
        return eiVar != null ? eiVar : this.a.a();
    }

    public final void a(ef<T> efVar) {
        this.f = efVar;
    }

    public final void a(ei<T, Z> eiVar) {
        this.c = eiVar;
    }

    public final ei<T, Z> b() {
        ei<T, Z> eiVar = this.c;
        return eiVar != null ? eiVar : this.a.b();
    }

    public final ef<T> c() {
        ef<T> efVar = this.f;
        return efVar != null ? efVar : this.a.c();
    }

    public final /* synthetic */ Object clone() {
        return g();
    }

    public final ej<Z> d() {
        ej<Z> ejVar = this.d;
        return ejVar != null ? ejVar : this.a.d();
    }

    public final ii<A, T> e() {
        return this.a.e();
    }

    public final ld<Z, R> f() {
        ld<Z, R> ldVar = this.e;
        return ldVar != null ? ldVar : this.a.f();
    }

    public final ma<A, T, Z, R> g() {
        try {
            return (ma) super.clone();
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
