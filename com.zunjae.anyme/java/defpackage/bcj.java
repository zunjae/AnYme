package defpackage;

import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

public final class bcj {
    int A;
    bbn a = new bbn();
    @Nullable
    Proxy b;
    List<bck> c = bch.a;
    List<bbi> d = bch.b;
    final List<bcb> e = new ArrayList();
    final List<bcb> f = new ArrayList();
    bbt g = bbq.a(bbq.a);
    ProxySelector h = ProxySelector.getDefault();
    bbl i = bbl.a;
    @Nullable
    bav j;
    @Nullable
    bdm k;
    SocketFactory l = SocketFactory.getDefault();
    @Nullable
    SSLSocketFactory m;
    @Nullable
    bgr n;
    HostnameVerifier o = bgs.a;
    bba p = bba.a;
    bat q;
    bat r;
    bbg s;
    bbo t;
    boolean u;
    boolean v;
    boolean w;
    int x;
    int y;
    int z;

    public bcj() {
        bat bat = bat.a;
        this.q = bat;
        this.r = bat;
        this.s = new bbg();
        this.t = bbo.a;
        this.u = true;
        this.v = true;
        this.w = true;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.A = 0;
    }

    public final bch a() {
        return new bch(this);
    }

    public final bcj a(long j, TimeUnit timeUnit) {
        this.x = bdb.a("timeout", j, timeUnit);
        return this;
    }

    public final bcj a(bcb bcb) {
        if (bcb != null) {
            this.e.add(bcb);
            return this;
        }
        throw new IllegalArgumentException("interceptor == null");
    }

    public final bcj a(TimeUnit timeUnit) {
        this.z = bdb.a("timeout", 10, timeUnit);
        return this;
    }

    public final bcj b(long j, TimeUnit timeUnit) {
        this.y = bdb.a("timeout", j, timeUnit);
        return this;
    }
}
