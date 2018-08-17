package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

final class bht implements bhh {
    public final bhd a = new bhd();
    public final bhz b;
    boolean c;

    bht(bhz bhz) {
        if (bhz != null) {
            this.b = bhz;
            return;
        }
        throw new NullPointerException("source == null");
    }

    private long a(byte b, long j, long j2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j2 >= 0) {
            while (j < j2) {
                long a = this.a.a(b, j, j2);
                if (a != -1) {
                    return a;
                }
                bhd bhd = this.a;
                a = bhd.b;
                if (a >= j2) {
                    break;
                } else if (this.b.a(bhd, 8192) == -1) {
                    break;
                } else {
                    j = Math.max(j, a);
                }
            }
            return -1;
        } else {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(0), Long.valueOf(j2)}));
        }
    }

    public final long a(bhd bhd, long j) {
        if (bhd == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            bhd bhd2 = this.a;
            if (bhd2.b == 0 && this.b.a(bhd2, 8192) == -1) {
                return -1;
            }
            return this.a.a(bhd, Math.min(j, this.a.b));
        }
    }

    public final long a(bhy bhy) {
        long j = 0;
        while (this.b.a(this.a, 8192) != -1) {
            long g = this.a.g();
            if (g > 0) {
                j += g;
                bhy.a_(this.a, g);
            }
        }
        bhd bhd = this.a;
        long j2 = bhd.b;
        if (j2 <= 0) {
            return j;
        }
        j += j2;
        bhy.a_(bhd, j2);
        return j;
    }

    public final bia a() {
        return this.b.a();
    }

    public final String a(Charset charset) {
        if (charset != null) {
            this.a.a(this.b);
            return this.a.a(charset);
        }
        throw new IllegalArgumentException("charset == null");
    }

    public final void a(long j) {
        if (!b(j)) {
            throw new EOFException();
        }
    }

    public final void a(byte[] bArr) {
        try {
            a((long) bArr.length);
            this.a.a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (true) {
                bhd bhd = this.a;
                long j = bhd.b;
                if (j > 0) {
                    int a = bhd.a(bArr, i, (int) j);
                    if (a != -1) {
                        i += a;
                    } else {
                        throw new AssertionError();
                    }
                }
                throw e;
            }
        }
    }

    public final boolean b(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.c) {
            throw new IllegalStateException("closed");
        } else {
            bhd bhd;
            do {
                bhd = this.a;
                if (bhd.b >= j) {
                    return true;
                }
            } while (this.b.a(bhd, 8192) != -1);
            return false;
        }
    }

    public final boolean b(bhi bhi) {
        int g = bhi.g();
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (g >= 0) {
            if (bhi.g() - 0 >= g) {
                int i = 0;
                while (i < g) {
                    long j = ((long) i) + 0;
                    if (!b(1 + j) || this.a.c(j) != bhi.a(i + 0)) {
                        return false;
                    }
                    i++;
                }
                return true;
            }
        }
        return false;
    }

    public final bhd c() {
        return this.a;
    }

    public final void close() {
        if (!this.c) {
            this.c = true;
            this.b.close();
            this.a.s();
        }
    }

    public final bhi d(long j) {
        a(j);
        return this.a.d(j);
    }

    public final String e(long j) {
        if (j >= 0) {
            long j2 = j == Long.MAX_VALUE ? Long.MAX_VALUE : j + 1;
            long a = a((byte) 10, 0, j2);
            if (a != -1) {
                return this.a.f(a);
            }
            if (j2 < Long.MAX_VALUE && b(j2) && this.a.c(j2 - 1) == (byte) 13 && b(1 + j2) && this.a.c(j2) == (byte) 10) {
                return this.a.f(j2);
            }
            bhd bhd = new bhd();
            bhd bhd2 = this.a;
            bhd2.a(bhd, 0, Math.min(32, bhd2.b));
            StringBuilder stringBuilder = new StringBuilder("\\n not found: limit=");
            stringBuilder.append(Math.min(this.a.b, j));
            stringBuilder.append(" content=");
            stringBuilder.append(bhd.n().e());
            stringBuilder.append('\u2026');
            throw new EOFException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    public final boolean e() {
        if (!this.c) {
            return this.a.e() && this.b.a(this.a, 8192) == -1;
        } else {
            throw new IllegalStateException("closed");
        }
    }

    public final InputStream f() {
        return new bhu(this);
    }

    public final byte[] g(long j) {
        a(j);
        return this.a.g(j);
    }

    public final byte h() {
        a(1);
        return this.a.h();
    }

    public final void h(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (j > 0) {
            bhd bhd = this.a;
            if (bhd.b == 0) {
                if (this.b.a(bhd, 8192) == -1) {
                    throw new EOFException();
                }
            }
            long min = Math.min(j, this.a.b);
            this.a.h(min);
            j -= min;
        }
    }

    public final short i() {
        a(2);
        return this.a.i();
    }

    public final boolean isOpen() {
        return !this.c;
    }

    public final int j() {
        a(4);
        return this.a.j();
    }

    public final short k() {
        a(2);
        return bic.a(this.a.i());
    }

    public final int l() {
        a(4);
        return bic.a(this.a.j());
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m() {
        /*
        r6 = this;
        r0 = 1;
        r6.a(r0);
        r0 = 0;
        r1 = 0;
    L_0x0007:
        r2 = r1 + 1;
        r3 = (long) r2;
        r3 = r6.b(r3);
        if (r3 == 0) goto L_0x004a;
    L_0x0010:
        r3 = r6.a;
        r4 = (long) r1;
        r3 = r3.c(r4);
        r4 = 48;
        if (r3 < r4) goto L_0x001f;
    L_0x001b:
        r4 = 57;
        if (r3 <= r4) goto L_0x0030;
    L_0x001f:
        r4 = 97;
        if (r3 < r4) goto L_0x0027;
    L_0x0023:
        r4 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r3 <= r4) goto L_0x0030;
    L_0x0027:
        r4 = 65;
        if (r3 < r4) goto L_0x0032;
    L_0x002b:
        r4 = 70;
        if (r3 <= r4) goto L_0x0030;
    L_0x002f:
        goto L_0x0032;
    L_0x0030:
        r1 = r2;
        goto L_0x0007;
    L_0x0032:
        if (r1 == 0) goto L_0x0035;
    L_0x0034:
        goto L_0x004a;
    L_0x0035:
        r1 = new java.lang.NumberFormatException;
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = java.lang.Byte.valueOf(r3);
        r2[r0] = r3;
        r0 = "Expected leading [0-9a-fA-F] character but was %#x";
        r0 = java.lang.String.format(r0, r2);
        r1.<init>(r0);
        throw r1;
    L_0x004a:
        r0 = r6.a;
        r0 = r0.m();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bht.m():long");
    }

    public final String p() {
        return e(Long.MAX_VALUE);
    }

    public final int read(ByteBuffer byteBuffer) {
        bhd bhd = this.a;
        return (bhd.b == 0 && this.b.a(bhd, 8192) == -1) ? -1 : this.a.read(byteBuffer);
    }

    public final long t() {
        return a((byte) 0, 0, Long.MAX_VALUE);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
