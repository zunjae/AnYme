package defpackage;

import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class bey implements bdz {
    private static final bhi b = bhi.a("connection");
    private static final bhi c = bhi.a("host");
    private static final bhi d = bhi.a("keep-alive");
    private static final bhi e = bhi.a("proxy-connection");
    private static final bhi f = bhi.a("transfer-encoding");
    private static final bhi g = bhi.a("te");
    private static final bhi h = bhi.a("encoding");
    private static final bhi i = bhi.a("upgrade");
    private static final List<bhi> j = bdb.a(b, c, d, e, g, f, h, i, bet.c, bet.d, bet.e, bet.f);
    private static final List<bhi> k = bdb.a(b, c, d, e, g, f, h, i);
    final bdu a;
    private final bcc l;
    private final bfa m;
    private bfs n;
    private final bck o;

    public bey(bch bch, bcc bcc, bdu bdu, bfa bfa) {
        this.l = bcc;
        this.a = bdu;
        this.m = bfa;
        this.o = bch.p().contains(bck.H2_PRIOR_KNOWLEDGE) ? bck.H2_PRIOR_KNOWLEDGE : bck.HTTP_2;
    }

    public final bct a(boolean z) {
        List c = this.n.c();
        bck bck = this.o;
        bby bby = new bby();
        int size = c.size();
        bby bby2 = bby;
        bei bei = null;
        for (int i = 0; i < size; i++) {
            bet bet = (bet) c.get(i);
            if (bet != null) {
                bhi bhi = bet.g;
                String a = bet.h.a();
                if (bhi.equals(bet.b)) {
                    bei = bei.a("HTTP/1.1 ".concat(String.valueOf(a)));
                } else if (!k.contains(bhi)) {
                    bcz.a.a(bby2, bhi.a(), a);
                }
            } else if (bei != null && bei.b == 100) {
                bby2 = new bby();
                bei = null;
            }
        }
        if (bei != null) {
            bct a2 = new bct().a(bck).a(bei.b).a(bei.c).a(bby2.a());
            return (z && bcz.a.a(a2) == 100) ? null : a2;
        } else {
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public final bcu a(bcs bcs) {
        return new bef(bcs.a("Content-Type"), bec.a(bcs), bho.a(new bez(this, this.n.d())));
    }

    public final bhy a(bcn bcn, long j) {
        return this.n.e();
    }

    public final void a() {
        this.m.o.b();
    }

    public final void a(bcn bcn) {
        if (this.n == null) {
            boolean z = bcn.d() != null;
            bbx c = bcn.c();
            List arrayList = new ArrayList(c.a() + 4);
            arrayList.add(new bet(bet.c, bcn.b()));
            arrayList.add(new bet(bet.d, beg.a(bcn.a())));
            String a = bcn.a("Host");
            if (a != null) {
                arrayList.add(new bet(bet.f, a));
            }
            arrayList.add(new bet(bet.e, bcn.a().b()));
            int a2 = c.a();
            for (int i = 0; i < a2; i++) {
                bhi a3 = bhi.a(c.a(i).toLowerCase(Locale.US));
                if (!j.contains(a3)) {
                    arrayList.add(new bet(a3, c.b(i)));
                }
            }
            this.n = this.m.a(arrayList, z);
            this.n.f.a((long) this.l.d(), TimeUnit.MILLISECONDS);
            this.n.g.a((long) this.l.e(), TimeUnit.MILLISECONDS);
        }
    }

    public final void b() {
        this.n.e().close();
    }

    public final void c() {
        bfs bfs = this.n;
        if (bfs != null) {
            bfs.b(bes.CANCEL);
        }
    }
}
