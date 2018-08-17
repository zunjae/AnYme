package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class bas {
    final bbz a;
    final bbo b;
    final SocketFactory c;
    final bat d;
    final List<bck> e;
    final List<bbi> f;
    final ProxySelector g;
    @Nullable
    final Proxy h;
    @Nullable
    final SSLSocketFactory i;
    @Nullable
    final HostnameVerifier j;
    @Nullable
    final bba k;

    public bas(String str, int i, bbo bbo, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable bba bba, bat bat, @Nullable Proxy proxy, List<bck> list, List<bbi> list2, ProxySelector proxySelector) {
        bca bca = new bca();
        String str2 = sSLSocketFactory != null ? "https" : "http";
        if (str2.equalsIgnoreCase("http")) {
            str2 = "http";
        } else if (str2.equalsIgnoreCase("https")) {
            str2 = "https";
        } else {
            throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str2)));
        }
        bca.a = str2;
        bca a = bca.a(str);
        if (i <= 0 || i > 65535) {
            throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i)));
        }
        a.e = i;
        this.a = a.b();
        if (bbo != null) {
            this.b = bbo;
            if (socketFactory != null) {
                this.c = socketFactory;
                if (bat != null) {
                    this.d = bat;
                    if (list != null) {
                        this.e = bdb.a((List) list);
                        if (list2 != null) {
                            this.f = bdb.a((List) list2);
                            if (proxySelector != null) {
                                this.g = proxySelector;
                                this.h = proxy;
                                this.i = sSLSocketFactory;
                                this.j = hostnameVerifier;
                                this.k = bba;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }

    public final bbz a() {
        return this.a;
    }

    final boolean a(bas bas) {
        return this.b.equals(bas.b) && this.d.equals(bas.d) && this.e.equals(bas.e) && this.f.equals(bas.f) && this.g.equals(bas.g) && bdb.a(this.h, bas.h) && bdb.a(this.i, bas.i) && bdb.a(this.j, bas.j) && bdb.a(this.k, bas.k) && this.a.c == bas.a.c;
    }

    public final bbo b() {
        return this.b;
    }

    public final SocketFactory c() {
        return this.c;
    }

    public final List<bck> d() {
        return this.e;
    }

    public final List<bbi> e() {
        return this.f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof bas) {
            bas bas = (bas) obj;
            if (this.a.equals(bas.a) && a(bas)) {
                return true;
            }
        }
        return false;
    }

    public final ProxySelector f() {
        return this.g;
    }

    @Nullable
    public final Proxy g() {
        return this.h;
    }

    @Nullable
    public final SSLSocketFactory h() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = (((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31;
        Proxy proxy = this.h;
        int i = 0;
        hashCode = (hashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.i;
        hashCode = (hashCode + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.j;
        hashCode = (hashCode + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        bba bba = this.k;
        if (bba != null) {
            i = bba.hashCode();
        }
        return hashCode + i;
    }

    @Nullable
    public final HostnameVerifier i() {
        return this.j;
    }

    @Nullable
    public final bba j() {
        return this.k;
    }

    public final String toString() {
        Object obj;
        StringBuilder stringBuilder = new StringBuilder("Address{");
        stringBuilder.append(this.a.b);
        stringBuilder.append(":");
        stringBuilder.append(this.a.c);
        if (this.h != null) {
            stringBuilder.append(", proxy=");
            obj = this.h;
        } else {
            stringBuilder.append(", proxySelector=");
            obj = this.g;
        }
        stringBuilder.append(obj);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}
