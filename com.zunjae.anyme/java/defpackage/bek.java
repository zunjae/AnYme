package defpackage;

import java.io.IOException;
import java.net.Proxy.Type;

public final class bek implements bdz {
    final bch a;
    final bdu b;
    final bhh c;
    final bhg d;
    int e = 0;
    private long f = 262144;

    public bek(bch bch, bdu bdu, bhh bhh, bhg bhg) {
        this.a = bch;
        this.b = bdu;
        this.c = bhh;
        this.d = bhg;
    }

    static void a(bhl bhl) {
        bia a = bhl.a();
        bhl.a(bia.c);
        a.f();
        a.h_();
    }

    private String e() {
        String e = this.c.e(this.f);
        this.f -= (long) e.length();
        return e;
    }

    public final bct a(boolean z) {
        int i = this.e;
        if (i != 1) {
            if (i != 3) {
                StringBuilder stringBuilder = new StringBuilder("state: ");
                stringBuilder.append(this.e);
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        try {
            bei a = bei.a(e());
            bct a2 = new bct().a(a.a).a(a.b).a(a.c).a(d());
            if (z && a.b == 100) {
                return null;
            }
            if (a.b == 100) {
                this.e = 3;
                return a2;
            }
            this.e = 4;
            return a2;
        } catch (Throwable e) {
            StringBuilder stringBuilder2 = new StringBuilder("unexpected end of stream on ");
            stringBuilder2.append(this.b);
            IOException iOException = new IOException(stringBuilder2.toString());
            iOException.initCause(e);
            throw iOException;
        }
    }

    public final bcu a(bcs bcs) {
        String a = bcs.a("Content-Type");
        if (!bec.b(bcs)) {
            return new bef(a, 0, bho.a(a(0)));
        }
        if ("chunked".equalsIgnoreCase(bcs.a("Transfer-Encoding"))) {
            bbz a2 = bcs.a().a();
            if (this.e == 4) {
                this.e = 5;
                return new bef(a, -1, bho.a(new ben(this, a2)));
            }
            StringBuilder stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.e);
            throw new IllegalStateException(stringBuilder.toString());
        }
        long a3 = bec.a(bcs);
        if (a3 != -1) {
            return new bef(a, a3, bho.a(a(a3)));
        }
        if (this.e == 4) {
            bdu bdu = this.b;
            if (bdu != null) {
                this.e = 5;
                bdu.e();
                return new bef(a, -1, bho.a(new beq(this)));
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        stringBuilder = new StringBuilder("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final bhy a(bcn bcn, long j) {
        StringBuilder stringBuilder;
        if ("chunked".equalsIgnoreCase(bcn.a("Transfer-Encoding"))) {
            if (this.e == 1) {
                this.e = 2;
                return new bem(this);
            }
            stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.e);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.e == 1) {
            this.e = 2;
            return new beo(this, j);
        } else {
            stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.e);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public final bhz a(long j) {
        if (this.e == 4) {
            this.e = 5;
            return new bep(this, j);
        }
        StringBuilder stringBuilder = new StringBuilder("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a() {
        this.d.flush();
    }

    public final void a(bbx bbx, String str) {
        if (this.e == 0) {
            this.d.b(str).b("\r\n");
            int a = bbx.a();
            for (int i = 0; i < a; i++) {
                this.d.b(bbx.a(i)).b(": ").b(bbx.b(i)).b("\r\n");
            }
            this.d.b("\r\n");
            this.e = 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a(bcn bcn) {
        Type type = this.b.c().b().b().type();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bcn.b());
        stringBuilder.append(' ');
        Object obj = (bcn.g() || type != Type.HTTP) ? null : 1;
        if (obj != null) {
            stringBuilder.append(bcn.a());
        } else {
            stringBuilder.append(beg.a(bcn.a()));
        }
        stringBuilder.append(" HTTP/1.1");
        a(bcn.c(), stringBuilder.toString());
    }

    public final void b() {
        this.d.flush();
    }

    public final void c() {
        bdp c = this.b.c();
        if (c != null) {
            c.c();
        }
    }

    public final bbx d() {
        bby bby = new bby();
        while (true) {
            String e = e();
            if (e.length() == 0) {
                return bby.a();
            }
            bcz.a.a(bby, e);
        }
    }
}
