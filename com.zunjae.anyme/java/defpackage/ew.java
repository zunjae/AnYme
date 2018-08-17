package defpackage;

import android.util.Log;
import java.io.File;

final class ew<A, T, Z> {
    private static final ey a = new ey();
    private final fl b;
    private final int c;
    private final int d;
    private final en<A> e;
    private final mb<A, T> f;
    private final ek<T> g;
    private final ld<T, Z> h;
    private final ex i;
    private final fa j;
    private final int k;
    private final ey l;
    private volatile boolean m;

    public ew(fl flVar, int i, int i2, en<A> enVar, mb<A, T> mbVar, ek<T> ekVar, ld<T, Z> ldVar, ex exVar, fa faVar, int i3) {
        this(flVar, i, i2, enVar, mbVar, ekVar, ldVar, exVar, faVar, i3, a);
    }

    private ew(fl flVar, int i, int i2, en<A> enVar, mb<A, T> mbVar, ek<T> ekVar, ld<T, Z> ldVar, ex exVar, fa faVar, int i3, ey eyVar) {
        this.b = flVar;
        this.c = i;
        this.d = i2;
        this.e = enVar;
        this.f = mbVar;
        this.g = ekVar;
        this.h = ldVar;
        this.i = exVar;
        this.j = faVar;
        this.k = i3;
        this.l = eyVar;
    }

    private ft<T> a(eg egVar) {
        File a = this.i.a().a(egVar);
        if (a == null) {
            return null;
        }
        try {
            ft<T> a2 = this.f.a().a(a, this.c, this.d);
            if (a2 == null) {
            }
            return a2;
        } finally {
            this.i.a().b(egVar);
        }
    }

    private ft<Z> a(ft<T> ftVar) {
        long a = ns.a();
        ft c = c(ftVar);
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transformed resource from source", a);
        }
        b(c);
        a = ns.a();
        ft<Z> d = d(c);
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transcoded transformed from source", a);
        }
        return d;
    }

    private void a(String str, long j) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(ns.a(j));
        stringBuilder.append(", key: ");
        stringBuilder.append(this.b);
    }

    private void b(ft<T> ftVar) {
        if (ftVar == null) {
            return;
        }
        if (this.j.cacheResult()) {
            long a = ns.a();
            this.i.a().a(this.b, new ez(this, this.f.d(), ftVar));
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Wrote transformed from source to cache", a);
            }
        }
    }

    private ft<T> c(ft<T> ftVar) {
        if (ftVar == null) {
            return null;
        }
        ft<T> a = this.g.a(ftVar, this.c, this.d);
        if (!ftVar.equals(a)) {
            ftVar.d();
        }
        return a;
    }

    private ft<Z> d(ft<T> ftVar) {
        return ftVar == null ? null : this.h.a(ftVar);
    }

    private ft<T> e() {
        try {
            long a = ns.a();
            Object a2 = this.e.a(this.k);
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Fetched data", a);
            }
            if (this.m) {
                return null;
            }
            ft<T> a3;
            String str;
            if (this.j.cacheSource()) {
                a = ns.a();
                this.i.a().a(this.b.a(), new ez(this, this.f.c(), a2));
                if (Log.isLoggable("DecodeJob", 2)) {
                    a("Wrote source to cache", a);
                }
                a = ns.a();
                a3 = a(this.b.a());
                if (Log.isLoggable("DecodeJob", 2) && a3 != null) {
                    str = "Decoded source from cache";
                }
                this.e.a();
                return a3;
            }
            a = ns.a();
            a3 = this.f.b().a(a2, this.c, this.d);
            if (Log.isLoggable("DecodeJob", 2)) {
                str = "Decoded from source";
            }
            this.e.a();
            return a3;
            a(str, a);
            this.e.a();
            return a3;
        } finally {
            this.e.a();
        }
    }

    public final ft<Z> a() {
        if (!this.j.cacheResult()) {
            return null;
        }
        long a = ns.a();
        ft a2 = a(this.b);
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Decoded transformed from cache", a);
        }
        a = ns.a();
        ft<Z> d = d(a2);
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Transcoded transformed from cache", a);
        }
        return d;
    }

    public final ft<Z> b() {
        if (!this.j.cacheSource()) {
            return null;
        }
        long a = ns.a();
        ft a2 = a(this.b.a());
        if (Log.isLoggable("DecodeJob", 2)) {
            a("Decoded source from cache", a);
        }
        return a(a2);
    }

    public final ft<Z> c() {
        return a(e());
    }

    public final void d() {
        this.m = true;
        this.e.c();
    }
}
