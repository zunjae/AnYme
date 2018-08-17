package defpackage;

import java.util.List;
import javax.annotation.Nullable;

public final class bce extends bcp {
    public static final bcd a = bcd.a("multipart/mixed");
    public static final bcd b = bcd.a("multipart/alternative");
    public static final bcd c = bcd.a("multipart/digest");
    public static final bcd d = bcd.a("multipart/parallel");
    public static final bcd e = bcd.a("multipart/form-data");
    private static final byte[] f = new byte[]{(byte) 58, (byte) 32};
    private static final byte[] g = new byte[]{(byte) 13, (byte) 10};
    private static final byte[] h = new byte[]{(byte) 45, (byte) 45};
    private final bhi i;
    private final bcd j;
    private final bcd k;
    private final List<bcg> l;
    private long m = -1;

    bce(bhi bhi, bcd bcd, List<bcg> list) {
        this.i = bhi;
        this.j = bcd;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bcd);
        stringBuilder.append("; boundary=");
        stringBuilder.append(bhi.a());
        this.k = bcd.a(stringBuilder.toString());
        this.l = bdb.a((List) list);
    }

    private long a(@Nullable bhg bhg, boolean z) {
        bhd bhd;
        if (z) {
            bhg = new bhd();
            bhd = bhg;
        } else {
            bhd = null;
        }
        int size = this.l.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            bcg bcg = (bcg) this.l.get(i);
            bbx bbx = bcg.a;
            bcp bcp = bcg.b;
            bhg.c(h);
            bhg.c(this.i);
            bhg.c(g);
            if (bbx != null) {
                int a = bbx.a();
                for (int i2 = 0; i2 < a; i2++) {
                    bhg.b(bbx.a(i2)).c(f).b(bbx.b(i2)).c(g);
                }
            }
            bcd a2 = bcp.a();
            if (a2 != null) {
                bhg.b("Content-Type: ").b(a2.toString()).c(g);
            }
            long b = bcp.b();
            if (b != -1) {
                bhg.b("Content-Length: ").l(b).c(g);
            } else if (z) {
                bhd.s();
                return -1;
            }
            bhg.c(g);
            if (z) {
                j += b;
            } else {
                bcp.a(bhg);
            }
            bhg.c(g);
        }
        bhg.c(h);
        bhg.c(this.i);
        bhg.c(h);
        bhg.c(g);
        if (z) {
            j += bhd.b();
            bhd.s();
        }
        return j;
    }

    public final bcd a() {
        return this.k;
    }

    public final void a(bhg bhg) {
        a(bhg, false);
    }

    public final long b() {
        long j = this.m;
        if (j != -1) {
            return j;
        }
        j = a(null, true);
        this.m = j;
        return j;
    }
}
