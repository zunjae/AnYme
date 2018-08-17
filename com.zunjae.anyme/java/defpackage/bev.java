package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

final class bev {
    bet[] a;
    int b;
    int c;
    int d;
    private final List<bet> e;
    private final bhh f;
    private final int g;
    private int h;

    bev(bhz bhz) {
        this(bhz, (byte) 0);
    }

    private bev(bhz bhz, byte b) {
        this.e = new ArrayList();
        this.a = new bet[8];
        this.b = this.a.length - 1;
        this.c = 0;
        this.d = 0;
        this.g = 4096;
        this.h = 4096;
        this.f = bho.a(bhz);
    }

    private int a(int i) {
        int i2 = 0;
        if (i > 0) {
            int length;
            for (length = this.a.length - 1; length >= this.b && i > 0; length--) {
                bet[] betArr = this.a;
                i -= betArr[length].i;
                this.d -= betArr[length].i;
                this.c--;
                i2++;
            }
            Object obj = this.a;
            length = this.b;
            System.arraycopy(obj, length + 1, obj, (length + 1) + i2, this.c);
            this.b += i2;
        }
        return i2;
    }

    private int a(int i, int i2) {
        i &= i2;
        if (i < i2) {
            return i;
        }
        i = 0;
        while (true) {
            int e = e();
            if ((e & 128) == 0) {
                return i2 + (e << i);
            }
            i2 += (e & 127) << i;
            i += 7;
        }
    }

    private void a(bet bet) {
        this.e.add(bet);
        int i = bet.i;
        int i2 = this.h;
        if (i > i2) {
            d();
            return;
        }
        a((this.d + i) - i2);
        i2 = this.c + 1;
        Object obj = this.a;
        if (i2 > obj.length) {
            Object obj2 = new bet[(obj.length * 2)];
            System.arraycopy(obj, 0, obj2, obj.length, obj.length);
            this.b = this.a.length - 1;
            this.a = obj2;
        }
        i2 = this.b;
        this.b = i2 - 1;
        this.a[i2] = bet;
        this.c++;
        this.d += i;
    }

    private int b(int i) {
        return (this.b + 1) + i;
    }

    private bhi c(int i) {
        bet bet;
        if (bev.d(i)) {
            bet = beu.a[i];
        } else {
            int b = b(i - beu.a.length);
            if (b >= 0) {
                bet[] betArr = this.a;
                if (b < betArr.length) {
                    bet = betArr[b];
                }
            }
            StringBuilder stringBuilder = new StringBuilder("Header index too large ");
            stringBuilder.append(i + 1);
            throw new IOException(stringBuilder.toString());
        }
        return bet.g;
    }

    private void c() {
        int i = this.h;
        int i2 = this.d;
        if (i < i2) {
            if (i == 0) {
                d();
                return;
            }
            a(i2 - i);
        }
    }

    private void d() {
        Arrays.fill(this.a, null);
        this.b = this.a.length - 1;
        this.c = 0;
        this.d = 0;
    }

    private static boolean d(int i) {
        return i >= 0 && i <= beu.a.length - 1;
    }

    private int e() {
        return this.f.h() & 255;
    }

    private bhi f() {
        int e = e();
        Object obj = (e & 128) == 128 ? 1 : null;
        e = a(e, 127);
        return obj != null ? bhi.a(bfx.a().a(this.f.g((long) e))) : this.f.d((long) e);
    }

    final void a() {
        while (!this.f.e()) {
            int h = this.f.h() & 255;
            if (h == 128) {
                throw new IOException("index == 0");
            } else if ((h & 128) == 128) {
                h = a(h, 127) - 1;
                if (bev.d(h)) {
                    this.e.add(beu.a[h]);
                } else {
                    int b = b(h - beu.a.length);
                    if (b >= 0) {
                        bet[] betArr = this.a;
                        if (b < betArr.length) {
                            this.e.add(betArr[b]);
                        }
                    }
                    StringBuilder stringBuilder = new StringBuilder("Header index too large ");
                    stringBuilder.append(h + 1);
                    throw new IOException(stringBuilder.toString());
                }
            } else {
                bet bet;
                if (h == 64) {
                    bet = new bet(beu.a(f()), f());
                } else if ((h & 64) == 64) {
                    bet = new bet(c(a(h, 63) - 1), f());
                } else if ((h & 32) == 32) {
                    this.h = a(h, 31);
                    h = this.h;
                    if (h < 0 || h > this.g) {
                        StringBuilder stringBuilder2 = new StringBuilder("Invalid dynamic table size update ");
                        stringBuilder2.append(this.h);
                        throw new IOException(stringBuilder2.toString());
                    }
                    c();
                } else {
                    bhi c;
                    bhi f;
                    List list;
                    Object bet2;
                    if (h != 16) {
                        if (h != 0) {
                            c = c(a(h, 15) - 1);
                            f = f();
                            list = this.e;
                            bet2 = new bet(c, f);
                            list.add(bet2);
                        }
                    }
                    c = beu.a(f());
                    f = f();
                    list = this.e;
                    bet2 = new bet(c, f);
                    list.add(bet2);
                }
                a(bet);
            }
        }
    }

    public final List<bet> b() {
        List arrayList = new ArrayList(this.e);
        this.e.clear();
        return arrayList;
    }
}
