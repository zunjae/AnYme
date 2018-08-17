package defpackage;

import java.util.Arrays;

final class bhx extends bhi {
    final transient byte[][] f;
    final transient int[] g;

    bhx(bhd bhd, int i) {
        super(null);
        bic.a(bhd.b, 0, (long) i);
        int i2 = 0;
        bhv bhv = bhd.a;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = bhv.c;
            int i6 = bhv.b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                bhv = bhv.f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f = new byte[i4][];
        this.g = new int[(i4 * 2)];
        bhv bhv2 = bhd.a;
        int i7 = 0;
        while (i2 < i) {
            this.f[i7] = bhv2.a;
            i2 += bhv2.c - bhv2.b;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.g;
            iArr[i7] = i2;
            iArr[this.f.length + i7] = bhv2.b;
            bhv2.d = true;
            i7++;
            bhv2 = bhv2.f;
        }
    }

    private int b(int i) {
        i = Arrays.binarySearch(this.g, 0, this.f.length, i + 1);
        return i >= 0 ? i : i ^ -1;
    }

    private bhi i() {
        return new bhi(h());
    }

    public final byte a(int i) {
        bic.a((long) this.g[this.f.length - 1], (long) i, 1);
        int b = b(i);
        int i2 = b == 0 ? 0 : this.g[b - 1];
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    public final bhi a(int i, int i2) {
        return i().a(i, i2);
    }

    public final String a() {
        return i().a();
    }

    final void a(bhd bhd) {
        int length = this.f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            bhv bhv = new bhv(this.f[i], i3, (i3 + i4) - i2);
            bhv bhv2 = bhd.a;
            if (bhv2 == null) {
                bhv.g = bhv;
                bhv.f = bhv;
                bhd.a = bhv;
            } else {
                bhv2.g.a(bhv);
            }
            i++;
            i2 = i4;
        }
        bhd.b += (long) i2;
    }

    public final boolean a(int i, bhi bhi, int i2, int i3) {
        if (g() - i3 < 0) {
            return false;
        }
        int b = b(0);
        while (i3 > 0) {
            int i4 = b == 0 ? 0 : this.g[b - 1];
            int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
            int[] iArr = this.g;
            byte[][] bArr = this.f;
            if (!bhi.a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    public final boolean a(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0 && i <= g() - i3 && i2 >= 0) {
            if (i2 <= bArr.length - i3) {
                int b = b(i);
                while (i3 > 0) {
                    int i4 = b == 0 ? 0 : this.g[b - 1];
                    int min = Math.min(i3, ((this.g[b] - i4) + i4) - i);
                    int[] iArr = this.g;
                    byte[][] bArr2 = this.f;
                    if (!bic.a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                        return false;
                    }
                    i += min;
                    i2 += min;
                    i3 -= min;
                    b++;
                }
                return true;
            }
        }
        return false;
    }

    public final String b() {
        return i().b();
    }

    public final bhi c() {
        return i().c();
    }

    public final bhi d() {
        return i().d();
    }

    public final String e() {
        return i().e();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bhi) {
            bhi bhi = (bhi) obj;
            return bhi.g() == g() && a(0, bhi, 0, g());
        }
    }

    public final bhi f() {
        return i().f();
    }

    public final int g() {
        return this.g[this.f.length - 1];
    }

    public final byte[] h() {
        int[] iArr = this.g;
        byte[][] bArr = this.f;
        Object obj = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f[i], i3, obj, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return obj;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        i = this.f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            byte[] bArr = this.f[i2];
            int[] iArr = this.g;
            int i5 = iArr[i + i2];
            int i6 = iArr[i2];
            i3 = (i6 - i3) + i5;
            while (i5 < i3) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.d = i4;
        return i4;
    }

    public final String toString() {
        return i().toString();
    }
}
