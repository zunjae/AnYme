package defpackage;

import java.io.File;

public final class me<A, T, Z, R> implements mf<A, T, Z, R> {
    private final ii<A, T> a;
    private final ld<Z, R> b;
    private final mb<T, Z> c;

    public me(ii<A, T> iiVar, ld<Z, R> ldVar, mb<T, Z> mbVar) {
        if (iiVar != null) {
            this.a = iiVar;
            if (ldVar != null) {
                this.b = ldVar;
                if (mbVar != null) {
                    this.c = mbVar;
                    return;
                }
                throw new NullPointerException("DataLoadProvider must not be null");
            }
            throw new NullPointerException("Transcoder must not be null");
        }
        throw new NullPointerException("ModelLoader must not be null");
    }

    public final ei<File, Z> a() {
        return this.c.a();
    }

    public final ei<T, Z> b() {
        return this.c.b();
    }

    public final ef<T> c() {
        return this.c.c();
    }

    public final ej<Z> d() {
        return this.c.d();
    }

    public final ii<A, T> e() {
        return this.a;
    }

    public final ld<Z, R> f() {
        return this.b;
    }
}
