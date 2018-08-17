package defpackage;

import java.util.Arrays;
import java.util.List;

final class bew {
    int a;
    int b;
    bet[] c;
    int d;
    int e;
    int f;
    private final bhd g;
    private final boolean h;
    private int i;
    private boolean j;

    bew(bhd bhd) {
        this(bhd, (byte) 0);
    }

    private bew(bhd bhd, byte b) {
        this.i = Integer.MAX_VALUE;
        this.c = new bet[8];
        this.d = this.c.length - 1;
        this.e = 0;
        this.f = 0;
        this.a = 4096;
        this.b = 4096;
        this.h = true;
        this.g = bhd;
    }

    private void a() {
        Arrays.fill(this.c, null);
        this.d = this.c.length - 1;
        this.e = 0;
        this.f = 0;
    }

    private void a(int i, int i2, int i3) {
        bhd bhd;
        if (i < i2) {
            bhd = this.g;
            i |= i3;
        } else {
            this.g.b(i3 | i2);
            i -= i2;
            while (i >= 128) {
                this.g.b(128 | (i & 127));
                i >>>= 7;
            }
            bhd = this.g;
        }
        bhd.b(i);
    }

    private void a(bet bet) {
        int i = bet.i;
        int i2 = this.b;
        if (i > i2) {
            a();
            return;
        }
        b((this.f + i) - i2);
        i2 = this.e + 1;
        Object obj = this.c;
        if (i2 > obj.length) {
            Object obj2 = new bet[(obj.length * 2)];
            System.arraycopy(obj, 0, obj2, obj.length, obj.length);
            this.d = this.c.length - 1;
            this.c = obj2;
        }
        i2 = this.d;
        this.d = i2 - 1;
        this.c[i2] = bet;
        this.e++;
        this.f += i;
    }

    private void a(bhi bhi) {
        int g;
        int i;
        if (this.h) {
            bfx.a();
            if (bfx.a(bhi) < bhi.g()) {
                Object bhd = new bhd();
                bfx.a();
                bfx.a(bhi, bhd);
                bhi = bhd.n();
                g = bhi.g();
                i = 128;
                a(g, 127, i);
                this.g.a(bhi);
            }
        }
        g = bhi.g();
        i = 0;
        a(g, 127, i);
        this.g.a(bhi);
    }

    private int b(int i) {
        int i2 = 0;
        if (i > 0) {
            int length;
            for (length = this.c.length - 1; length >= this.d && i > 0; length--) {
                bet[] betArr = this.c;
                i -= betArr[length].i;
                this.f -= betArr[length].i;
                this.e--;
                i2++;
            }
            Object obj = this.c;
            length = this.d;
            System.arraycopy(obj, length + 1, obj, (length + 1) + i2, this.e);
            bet[] betArr2 = this.c;
            length = this.d;
            Arrays.fill(betArr2, length + 1, (length + 1) + i2, null);
            this.d += i2;
        }
        return i2;
    }

    final void a(int i) {
        this.a = i;
        i = Math.min(i, 16384);
        int i2 = this.b;
        if (i2 != i) {
            if (i < i2) {
                this.i = Math.min(this.i, i);
            }
            this.j = true;
            this.b = i;
            i = this.b;
            i2 = this.f;
            if (i < i2) {
                if (i == 0) {
                    a();
                    return;
                }
                b(i2 - i);
            }
        }
    }

    final void a(List<bet> list) {
        int i;
        if (this.j) {
            i = this.i;
            if (i < this.b) {
                a(i, 31, 32);
            }
            this.j = false;
            this.i = Integer.MAX_VALUE;
            a(this.b, 31, 32);
        }
        i = list.size();
        for (int i2 = 0; i2 < i; i2++) {
            int intValue;
            int i3;
            bet bet = (bet) list.get(i2);
            bhi f = bet.g.f();
            bhi bhi = bet.h;
            Integer num = (Integer) beu.b.get(f);
            if (num != null) {
                intValue = num.intValue() + 1;
                if (intValue > 1 && intValue < 8) {
                    if (bdb.a(beu.a[intValue - 1].h, (Object) bhi)) {
                        i3 = intValue;
                    } else if (bdb.a(beu.a[intValue].h, (Object) bhi)) {
                        i3 = intValue;
                        intValue++;
                    }
                }
                i3 = intValue;
                intValue = -1;
            } else {
                intValue = -1;
                i3 = -1;
            }
            if (intValue == -1) {
                int length = this.c.length;
                for (int i4 = this.d + 1; i4 < length; i4++) {
                    if (bdb.a(this.c[i4].g, (Object) f)) {
                        if (bdb.a(this.c[i4].h, (Object) bhi)) {
                            intValue = beu.a.length + (i4 - this.d);
                            break;
                        } else if (i3 == -1) {
                            i3 = (i4 - this.d) + beu.a.length;
                        }
                    }
                }
            }
            if (intValue != -1) {
                a(intValue, 127, 128);
            } else {
                if (i3 == -1) {
                    this.g.b(64);
                    a(f);
                } else {
                    bhi bhi2 = bet.a;
                    if (!f.a(0, bhi2, 0, bhi2.g()) || bet.f.equals(f)) {
                        a(i3, 63, 64);
                    } else {
                        a(i3, 15, 0);
                        a(bhi);
                    }
                }
                a(bhi);
                a(bet);
            }
        }
    }
}
