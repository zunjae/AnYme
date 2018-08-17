package defpackage;

import java.util.List;

public final class bee implements bcc {
    private final List<bcb> a;
    private final bdu b;
    private final bdz c;
    private final bdp d;
    private final int e;
    private final bcn f;
    private final bay g;
    private final bbq h;
    private final int i;
    private final int j;
    private final int k;
    private int l;

    public bee(List<bcb> list, bdu bdu, bdz bdz, bdp bdp, int i, bcn bcn, bay bay, bbq bbq, int i2, int i3, int i4) {
        this.a = list;
        this.d = bdp;
        this.b = bdu;
        this.c = bdz;
        this.e = i;
        this.f = bcn;
        this.g = bay;
        this.h = bbq;
        this.i = i2;
        this.j = i3;
        this.k = i4;
    }

    public final bcn a() {
        return this.f;
    }

    public final bcs a(bcn bcn) {
        return a(bcn, this.b, this.c, this.d);
    }

    public final bcs a(bcn bcn, bdu bdu, bdz bdz, bdp bdp) {
        if (this.e < this.a.size()) {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2;
            r0.l++;
            if (r0.c != null) {
                if (!r0.d.a(bcn.a())) {
                    stringBuilder = new StringBuilder("network interceptor ");
                    stringBuilder.append(r0.a.get(r0.e - 1));
                    stringBuilder.append(" must retain the same host and port");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            if (r0.c != null) {
                if (r0.l > 1) {
                    stringBuilder = new StringBuilder("network interceptor ");
                    stringBuilder.append(r0.a.get(r0.e - 1));
                    stringBuilder.append(" must call proceed() exactly once");
                    throw new IllegalStateException(stringBuilder.toString());
                }
            }
            bee bee = new bee(r0.a, bdu, bdz, bdp, r0.e + 1, bcn, r0.g, r0.h, r0.i, r0.j, r0.k);
            bcb bcb = (bcb) r0.a.get(r0.e);
            bcs intercept = bcb.intercept(bee);
            if (bdz != null && r0.e + 1 < r0.a.size()) {
                if (bee.l != 1) {
                    stringBuilder2 = new StringBuilder("network interceptor ");
                    stringBuilder2.append(bcb);
                    stringBuilder2.append(" must call proceed() exactly once");
                    throw new IllegalStateException(stringBuilder2.toString());
                }
            }
            if (intercept == null) {
                stringBuilder2 = new StringBuilder("interceptor ");
                stringBuilder2.append(bcb);
                stringBuilder2.append(" returned null");
                throw new NullPointerException(stringBuilder2.toString());
            } else if (intercept.g() != null) {
                return intercept;
            } else {
                stringBuilder2 = new StringBuilder("interceptor ");
                stringBuilder2.append(bcb);
                stringBuilder2.append(" returned a response with no body");
                throw new IllegalStateException(stringBuilder2.toString());
            }
        }
        throw new AssertionError();
    }

    public final bbf b() {
        return this.d;
    }

    public final int c() {
        return this.i;
    }

    public final int d() {
        return this.j;
    }

    public final int e() {
        return this.k;
    }

    public final bdu f() {
        return this.b;
    }

    public final bdz g() {
        return this.c;
    }

    public final bay h() {
        return this.g;
    }

    public final bbq i() {
        return this.h;
    }
}
