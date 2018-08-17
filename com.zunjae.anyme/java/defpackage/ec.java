package defpackage;

import java.io.OutputStream;

final class ec {
    int a;
    int b = 12;
    int c;
    int d = 4096;
    int[] e = new int[5003];
    int[] f = new int[5003];
    int g = 5003;
    int h = 0;
    boolean i = false;
    int j;
    int k;
    int l;
    int m = 0;
    int n = 0;
    int[] o = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    int p;
    byte[] q = new byte[256];
    private int r;
    private int s;
    private byte[] t;
    private int u;
    private int v;
    private int w;

    ec(int i, int i2, byte[] bArr, int i3) {
        this.r = i;
        this.s = i2;
        this.t = bArr;
        this.u = Math.max(2, i3);
    }

    private int a() {
        int i = this.v;
        if (i == 0) {
            return -1;
        }
        this.v = i - 1;
        byte[] bArr = this.t;
        int i2 = this.w;
        this.w = i2 + 1;
        return bArr[i2] & 255;
    }

    private void a(byte b, OutputStream outputStream) {
        byte[] bArr = this.q;
        int i = this.p;
        this.p = i + 1;
        bArr[i] = b;
        if (this.p >= 254) {
            b(outputStream);
        }
    }

    private void a(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.e[i2] = -1;
        }
    }

    private void a(int i, OutputStream outputStream) {
        int i2 = this.m;
        int[] iArr = this.o;
        int i3 = this.n;
        this.m = i2 & iArr[i3];
        if (i3 > 0) {
            this.m |= i << i3;
        } else {
            this.m = i;
        }
        i2 = this.n + this.a;
        while (true) {
            this.n = i2;
            if (this.n < 8) {
                break;
            }
            a((byte) (this.m & 255), outputStream);
            this.m >>= 8;
            i2 = this.n - 8;
        }
        if (this.h > this.c || this.i) {
            if (this.i) {
                i2 = this.j;
                this.a = i2;
                this.c = (1 << i2) - 1;
                this.i = false;
            } else {
                this.a++;
                i2 = this.a;
                this.c = i2 == this.b ? this.d : (1 << i2) - 1;
            }
        }
        if (i == this.l) {
            while (this.n > 0) {
                a((byte) (this.m & 255), outputStream);
                this.m >>= 8;
                this.n -= 8;
            }
            b(outputStream);
        }
    }

    private void b(OutputStream outputStream) {
        int i = this.p;
        if (i > 0) {
            outputStream.write(i);
            outputStream.write(this.q, 0, this.p);
            this.p = 0;
        }
    }

    final void a(OutputStream outputStream) {
        int i;
        outputStream.write(this.u);
        this.v = this.r * this.s;
        this.w = 0;
        int i2 = this.u + 1;
        this.j = i2;
        this.i = false;
        this.a = this.j;
        this.c = (1 << this.a) - 1;
        this.k = 1 << (i2 - 1);
        i2 = this.k;
        this.l = i2 + 1;
        this.h = i2 + 2;
        this.p = 0;
        i2 = a();
        int i3 = 0;
        for (i = this.g; i < 65536; i *= 2) {
            i3++;
        }
        i = 8 - i3;
        i3 = this.g;
        a(i3);
        a(this.k, outputStream);
        while (true) {
            int a = a();
            if (a != -1) {
                int i4 = (a << this.b) + i2;
                int i5 = (a << i) ^ i2;
                int[] iArr = this.e;
                if (iArr[i5] == i4) {
                    i2 = this.f[i5];
                } else if (iArr[i5] >= 0) {
                    int i6 = i3 - i5;
                    if (i5 == 0) {
                        i6 = 1;
                    }
                    int[] iArr2;
                    do {
                        i5 -= i6;
                        if (i5 < 0) {
                            i5 += i3;
                        }
                        iArr2 = this.e;
                        if (iArr2[i5] == i4) {
                            i2 = this.f[i5];
                            break;
                        }
                    } while (iArr2[i5] >= 0);
                    a(i2, outputStream);
                    i2 = this.h;
                    if (i2 >= this.d) {
                        iArr = this.f;
                        this.h = i2 + 1;
                        iArr[i5] = i2;
                        this.e[i5] = i4;
                    } else {
                        a(this.g);
                        i2 = this.k;
                        this.h = i2 + 2;
                        this.i = true;
                        a(i2, outputStream);
                    }
                    i2 = a;
                } else {
                    a(i2, outputStream);
                    i2 = this.h;
                    if (i2 >= this.d) {
                        a(this.g);
                        i2 = this.k;
                        this.h = i2 + 2;
                        this.i = true;
                        a(i2, outputStream);
                    } else {
                        iArr = this.f;
                        this.h = i2 + 1;
                        iArr[i5] = i2;
                        this.e[i5] = i4;
                    }
                    i2 = a;
                }
            } else {
                a(i2, outputStream);
                a(this.l, outputStream);
                outputStream.write(0);
                return;
            }
        }
    }
}
