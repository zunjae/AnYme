package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class bch implements baz, Cloneable {
    static final List<bck> a = bdb.a(bck.HTTP_2, bck.HTTP_1_1);
    static final List<bbi> b = bdb.a(bbi.b, bbi.d);
    final int A;
    final int B;
    final int C;
    final bbn c;
    @Nullable
    final Proxy d;
    final List<bck> e;
    final List<bbi> f;
    final List<bcb> g;
    final List<bcb> h;
    final bbt i;
    final ProxySelector j;
    final bbl k;
    @Nullable
    final bav l;
    @Nullable
    final bdm m;
    final SocketFactory n;
    @Nullable
    final SSLSocketFactory o;
    @Nullable
    final bgr p;
    final HostnameVerifier q;
    final bba r;
    final bat s;
    final bat t;
    final bbg u;
    final bbo v;
    final boolean w;
    final boolean x;
    final boolean y;
    final int z;

    static {
        bcz.a = new bci();
    }

    public bch() {
        this(new bcj());
    }

    bch(bcj bcj) {
        bgr a;
        StringBuilder stringBuilder;
        this.c = bcj.a;
        this.d = bcj.b;
        this.e = bcj.c;
        this.f = bcj.d;
        this.g = bdb.a(bcj.e);
        this.h = bdb.a(bcj.f);
        this.i = bcj.g;
        this.j = bcj.h;
        this.k = bcj.i;
        this.l = bcj.j;
        this.m = bcj.k;
        this.n = bcj.l;
        loop0:
        while (true) {
            Object obj = null;
            for (bbi bbi : this.f) {
                if (obj != null || bbi.e) {
                    obj = 1;
                }
            }
            break loop0;
        }
        if (bcj.m == null) {
            if (obj != null) {
                X509TrustManager a2 = bdb.a();
                this.o = bch.a(a2);
                a = bgo.c().a(a2);
                this.p = a;
                if (this.o != null) {
                    bgo.c().a(this.o);
                }
                this.q = bcj.o;
                this.r = bcj.p.a(this.p);
                this.s = bcj.q;
                this.t = bcj.r;
                this.u = bcj.s;
                this.v = bcj.t;
                this.w = bcj.u;
                this.x = bcj.v;
                this.y = bcj.w;
                this.z = bcj.x;
                this.A = bcj.y;
                this.B = bcj.z;
                this.C = bcj.A;
                if (!this.g.contains(null)) {
                    stringBuilder = new StringBuilder("Null interceptor: ");
                    stringBuilder.append(this.g);
                    throw new IllegalStateException(stringBuilder.toString());
                } else if (!this.h.contains(null)) {
                    stringBuilder = new StringBuilder("Null network interceptor: ");
                    stringBuilder.append(this.h);
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
        }
        this.o = bcj.m;
        a = bcj.n;
        this.p = a;
        if (this.o != null) {
            bgo.c().a(this.o);
        }
        this.q = bcj.o;
        this.r = bcj.p.a(this.p);
        this.s = bcj.q;
        this.t = bcj.r;
        this.u = bcj.s;
        this.v = bcj.t;
        this.w = bcj.u;
        this.x = bcj.v;
        this.y = bcj.w;
        this.z = bcj.x;
        this.A = bcj.y;
        this.B = bcj.z;
        this.C = bcj.A;
        if (!this.g.contains(null)) {
            stringBuilder = new StringBuilder("Null interceptor: ");
            stringBuilder.append(this.g);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (!this.h.contains(null)) {
            stringBuilder = new StringBuilder("Null network interceptor: ");
            stringBuilder.append(this.h);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private static SSLSocketFactory a(X509TrustManager x509TrustManager) {
        try {
            SSLContext b = bgo.c().b();
            b.init(null, new TrustManager[]{x509TrustManager}, null);
            return b.getSocketFactory();
        } catch (Exception e) {
            throw bdb.a("No System TLS", e);
        }
    }

    public final int a() {
        return this.C;
    }

    public final bay a(bcn bcn) {
        return bcl.a(this, bcn, false);
    }

    public final Proxy b() {
        return this.d;
    }

    public final ProxySelector c() {
        return this.j;
    }

    public final bbl d() {
        return this.k;
    }

    final bdm e() {
        bav bav = this.l;
        return bav != null ? bav.a : this.m;
    }

    public final bbo f() {
        return this.v;
    }

    public final SocketFactory g() {
        return this.n;
    }

    public final SSLSocketFactory h() {
        return this.o;
    }

    public final HostnameVerifier i() {
        return this.q;
    }

    public final bba j() {
        return this.r;
    }

    public final bat k() {
        return this.s;
    }

    public final bbg l() {
        return this.u;
    }

    public final boolean m() {
        return this.w;
    }

    public final boolean n() {
        return this.x;
    }

    public final boolean o() {
        return this.y;
    }

    public final List<bck> p() {
        return this.e;
    }

    public final List<bbi> q() {
        return this.f;
    }
}
