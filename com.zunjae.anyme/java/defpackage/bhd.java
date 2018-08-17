package defpackage;

import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class bhd implements bhg, bhh, Cloneable, ByteChannel {
    private static final byte[] c = new byte[]{(byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) 52, (byte) 53, (byte) 54, (byte) 55, (byte) 56, (byte) 57, (byte) 97, (byte) 98, (byte) 99, (byte) 100, (byte) 101, (byte) 102};
    @Nullable
    bhv a;
    long b;

    private String a(long j, Charset charset) {
        bic.a(this.b, 0, j);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (j > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return BuildConfig.FLAVOR;
        } else {
            bhv bhv = this.a;
            int i = bhv.b;
            if (((long) i) + j > ((long) bhv.c)) {
                return new String(g(j), charset);
            }
            String str = new String(bhv.a, i, (int) j, charset);
            bhv.b = (int) (((long) bhv.b) + j);
            this.b -= j;
            if (bhv.b == bhv.c) {
                this.a = bhv.b();
                bhw.a(bhv);
            }
            return str;
        }
    }

    private String m(long j) {
        return a(j, bic.a);
    }

    public final int a(byte[] bArr, int i, int i2) {
        bic.a((long) bArr.length, (long) i, (long) i2);
        bhv bhv = this.a;
        if (bhv == null) {
            return -1;
        }
        i2 = Math.min(i2, bhv.c - bhv.b);
        System.arraycopy(bhv.a, bhv.b, bArr, i, i2);
        bhv.b += i2;
        this.b -= (long) i2;
        if (bhv.b == bhv.c) {
            this.a = bhv.b();
            bhw.a(bhv);
        }
        return i2;
    }

    public final long a(byte b, long j, long j2) {
        bhd bhd = this;
        long j3 = 0;
        if (j < 0 || j2 < j) {
            throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", new Object[]{Long.valueOf(bhd.b), Long.valueOf(j), Long.valueOf(j2)}));
        }
        long j4 = bhd.b;
        long j5 = j2 > j4 ? j4 : j2;
        if (j == j5) {
            return -1;
        }
        bhv bhv = bhd.a;
        if (bhv == null) {
            return -1;
        }
        long j6 = bhd.b;
        if (j6 - j >= j) {
            while (true) {
                j6 = j3;
                j3 = ((long) (bhv.c - bhv.b)) + j6;
                if (j3 >= j) {
                    break;
                }
                bhv = bhv.f;
            }
        } else {
            while (j6 > j) {
                bhv = bhv.g;
                j6 -= (long) (bhv.c - bhv.b);
            }
        }
        long j7 = j;
        while (j6 < j5) {
            byte[] bArr = bhv.a;
            int min = (int) Math.min((long) bhv.c, (((long) bhv.b) + j5) - j6);
            for (int i = (int) ((((long) bhv.b) + j7) - j6); i < min; i++) {
                if (bArr[i] == b) {
                    return ((long) (i - bhv.b)) + j6;
                }
            }
            byte b2 = b;
            j7 = ((long) (bhv.c - bhv.b)) + j6;
            bhv = bhv.f;
            j6 = j7;
        }
        return -1;
    }

    public final long a(bhd bhd, long j) {
        if (bhd == null) {
            throw new IllegalArgumentException("sink == null");
        } else if (j >= 0) {
            long j2 = this.b;
            if (j2 == 0) {
                return -1;
            }
            if (j > j2) {
                j = j2;
            }
            bhd.a_(this, j);
            return j;
        } else {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
    }

    public final long a(bhy bhy) {
        long j = this.b;
        if (j > 0) {
            bhy.a_(this, j);
        }
        return j;
    }

    public final long a(bhz bhz) {
        if (bhz != null) {
            long j = 0;
            while (true) {
                long a = bhz.a(this, 8192);
                if (a == -1) {
                    return j;
                }
                j += a;
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    public final bhd a(int i) {
        if (i >= 128) {
            int i2;
            if (i < 2048) {
                i2 = (i >> 6) | 192;
            } else {
                if (i < 65536) {
                    if (i < 55296 || i > 57343) {
                        i2 = (i >> 12) | 224;
                    } else {
                        b(63);
                        return this;
                    }
                } else if (i <= 1114111) {
                    b((i >> 18) | 240);
                    i2 = ((i >> 12) & 63) | 128;
                } else {
                    StringBuilder stringBuilder = new StringBuilder("Unexpected code point: ");
                    stringBuilder.append(Integer.toHexString(i));
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                b(i2);
                i2 = ((i >> 6) & 63) | 128;
            }
            b(i2);
            i = (i & 63) | 128;
        }
        b(i);
        return this;
    }

    public final bhd a(bhd bhd, long j, long j2) {
        if (bhd != null) {
            bic.a(this.b, j, j2);
            if (j2 == 0) {
                return this;
            }
            bhd.b += j2;
            bhv bhv = this.a;
            while (true) {
                int i = bhv.c;
                int i2 = bhv.b;
                if (j < ((long) (i - i2))) {
                    break;
                }
                j -= (long) (i - i2);
                bhv = bhv.f;
            }
            while (j2 > 0) {
                bhv a = bhv.a();
                a.b = (int) (((long) a.b) + j);
                a.c = Math.min(a.b + ((int) j2), a.c);
                bhv bhv2 = bhd.a;
                if (bhv2 == null) {
                    a.g = a;
                    a.f = a;
                    bhd.a = a;
                } else {
                    bhv2.g.a(a);
                }
                j2 -= (long) (a.c - a.b);
                bhv = bhv.f;
                j = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public final bhd a(bhi bhi) {
        if (bhi != null) {
            bhi.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public final bhd a(String str) {
        return a(str, 0, str.length());
    }

    public final bhd a(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            r0 = new StringBuilder("endIndex < beginIndex: ");
            r0.append(i2);
            r0.append(" < ");
            r0.append(i);
            throw new IllegalArgumentException(r0.toString());
        } else if (i2 <= str.length()) {
            while (i < i2) {
                char charAt = str.charAt(i);
                int i3;
                int min;
                int i4;
                if (charAt < '\u0080') {
                    bhv e = e(1);
                    byte[] bArr = e.a;
                    i3 = e.c - i;
                    min = Math.min(i2, 8192 - i3);
                    int i5 = i + 1;
                    bArr[i + i3] = (byte) charAt;
                    while (true) {
                        i = i5;
                        if (i >= min) {
                            break;
                        }
                        charAt = str.charAt(i);
                        if (charAt >= '\u0080') {
                            break;
                        }
                        i5 = i + 1;
                        bArr[i + i3] = (byte) charAt;
                    }
                    i3 += i;
                    i4 = e.c;
                    i3 -= i4;
                    e.c = i4 + i3;
                    this.b += (long) i3;
                } else {
                    int i6;
                    if (charAt < '\u0800') {
                        i6 = (charAt >> 6) | 192;
                    } else {
                        if (charAt >= '\ud800') {
                            if (charAt <= '\udfff') {
                                i3 = i + 1;
                                min = i3 < i2 ? str.charAt(i3) : 0;
                                if (charAt <= '\udbff' && min >= 56320) {
                                    if (min <= 57343) {
                                        i4 = (((charAt & -55297) << 10) | (-56321 & min)) + 65536;
                                        b((i4 >> 18) | 240);
                                        b(((i4 >> 12) & 63) | 128);
                                        b(((i4 >> 6) & 63) | 128);
                                        b((i4 & 63) | 128);
                                        i += 2;
                                    }
                                }
                                b(63);
                                i = i3;
                            }
                        }
                        b((charAt >> 12) | 224);
                        i6 = ((charAt >> 6) & 63) | 128;
                    }
                    b(i6);
                    b((charAt & 63) | 128);
                    i++;
                }
            }
            return this;
        } else {
            r0 = new StringBuilder("endIndex > string.length: ");
            r0.append(i2);
            r0.append(" > ");
            r0.append(str.length());
            throw new IllegalArgumentException(r0.toString());
        }
    }

    public final bhd a(String str, int i, int i2, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        } else if (i < 0) {
            throw new IllegalAccessError("beginIndex < 0: ".concat(String.valueOf(i)));
        } else if (i2 < i) {
            r5 = new StringBuilder("endIndex < beginIndex: ");
            r5.append(i2);
            r5.append(" < ");
            r5.append(i);
            throw new IllegalArgumentException(r5.toString());
        } else if (i2 > str.length()) {
            r5 = new StringBuilder("endIndex > string.length: ");
            r5.append(i2);
            r5.append(" > ");
            r5.append(str.length());
            throw new IllegalArgumentException(r5.toString());
        } else if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        } else if (charset.equals(bic.a)) {
            return a(str, i, i2);
        } else {
            byte[] bytes = str.substring(i, i2).getBytes(charset);
            return b(bytes, 0, bytes.length);
        }
    }

    public final bia a() {
        return bia.c;
    }

    public final String a(Charset charset) {
        try {
            return a(this.b, charset);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final void a(long j) {
        if (this.b < j) {
            throw new EOFException();
        }
    }

    public final void a(byte[] bArr) {
        int i = 0;
        while (i < bArr.length) {
            int a = a(bArr, i, bArr.length - i);
            if (a != -1) {
                i += a;
            } else {
                throw new EOFException();
            }
        }
    }

    public final void a_(bhd bhd, long j) {
        if (bhd == null) {
            throw new IllegalArgumentException("source == null");
        } else if (bhd != this) {
            bic.a(bhd.b, 0, j);
            while (j > 0) {
                bhv bhv;
                bhv bhv2 = bhd.a;
                int i = (j > ((long) (bhv2.c - bhv2.b)) ? 1 : (j == ((long) (bhv2.c - bhv2.b)) ? 0 : -1));
                int i2 = 0;
                if (i < 0) {
                    bhv = this.a;
                    bhv = bhv != null ? bhv.g : null;
                    if (bhv != null && bhv.e) {
                        if ((((long) bhv.c) + j) - ((long) (bhv.d ? 0 : bhv.b)) <= 8192) {
                            bhd.a.a(bhv, (int) j);
                            bhd.b -= j;
                            this.b += j;
                            return;
                        }
                    }
                    bhv = bhd.a;
                    i = (int) j;
                    if (i <= 0 || i > bhv.c - bhv.b) {
                        throw new IllegalArgumentException();
                    }
                    bhv a;
                    if (i >= 1024) {
                        a = bhv.a();
                    } else {
                        a = bhw.a();
                        System.arraycopy(bhv.a, bhv.b, a.a, 0, i);
                    }
                    a.c = a.b + i;
                    bhv.b += i;
                    bhv.g.a(a);
                    bhd.a = a;
                }
                bhv = bhd.a;
                long j2 = (long) (bhv.c - bhv.b);
                bhd.a = bhv.b();
                bhv bhv3 = this.a;
                if (bhv3 == null) {
                    this.a = bhv;
                    bhv2 = this.a;
                    bhv2.g = bhv2;
                    bhv2.f = bhv2;
                } else {
                    bhv = bhv3.g.a(bhv);
                    bhv3 = bhv.g;
                    if (bhv3 == bhv) {
                        throw new IllegalStateException();
                    } else if (bhv3.e) {
                        int i3 = bhv.c - bhv.b;
                        int i4 = 8192 - bhv3.c;
                        if (!bhv3.d) {
                            i2 = bhv3.b;
                        }
                        if (i3 <= i4 + i2) {
                            bhv.a(bhv.g, i3);
                            bhv.b();
                            bhw.a(bhv);
                        }
                    }
                }
                bhd.b -= j2;
                this.b += j2;
                j -= j2;
            }
        } else {
            throw new IllegalArgumentException("source == this");
        }
    }

    public final long b() {
        return this.b;
    }

    public final bhd b(int i) {
        bhv e = e(1);
        byte[] bArr = e.a;
        int i2 = e.c;
        e.c = i2 + 1;
        bArr[i2] = (byte) i;
        this.b++;
        return this;
    }

    public final bhd b(byte[] bArr) {
        if (bArr != null) {
            return b(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    public final bhd b(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = (long) i2;
            bic.a((long) bArr.length, (long) i, j);
            i2 += i;
            while (i < i2) {
                bhv e = e(1);
                int min = Math.min(i2 - i, 8192 - e.c);
                System.arraycopy(bArr, i, e.a, e.c, min);
                i += min;
                e.c += min;
            }
            this.b += j;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public final /* synthetic */ bhg b(String str) {
        return a(str);
    }

    public final boolean b(long j) {
        return this.b >= j;
    }

    public final boolean b(bhi bhi) {
        int g = bhi.g();
        if (g >= 0 && this.b - 0 >= ((long) g)) {
            if (bhi.g() - 0 >= g) {
                for (int i = 0; i < g; i++) {
                    if (c(((long) i) + 0) != bhi.a(i + 0)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final byte c(long j) {
        bic.a(this.b, j, 1);
        long j2 = this.b;
        bhv bhv;
        int i;
        int i2;
        if (j2 - j > j) {
            bhv = this.a;
            while (true) {
                i = bhv.c;
                i2 = bhv.b;
                long j3 = (long) (i - i2);
                if (j < j3) {
                    return bhv.a[i2 + ((int) j)];
                }
                j -= j3;
                bhv = bhv.f;
            }
        } else {
            j -= j2;
            bhv = this.a;
            do {
                bhv = bhv.g;
                i = bhv.c;
                i2 = bhv.b;
                j += (long) (i - i2);
            } while (j < 0);
            return bhv.a[i2 + ((int) j)];
        }
    }

    public final bhd c() {
        return this;
    }

    public final bhd c(int i) {
        bhv e = e(2);
        byte[] bArr = e.a;
        int i2 = e.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.c = i2;
        this.b += 2;
        return this;
    }

    public final /* synthetic */ bhg c(bhi bhi) {
        return a(bhi);
    }

    public final /* synthetic */ bhg c(byte[] bArr) {
        return b(bArr);
    }

    public final /* synthetic */ bhg c(byte[] bArr, int i, int i2) {
        return b(bArr, i, i2);
    }

    public final /* synthetic */ Object clone() {
        return u();
    }

    public final void close() {
    }

    public final bhd d(int i) {
        bhv e = e(4);
        byte[] bArr = e.a;
        int i2 = e.c;
        int i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 24) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) ((i >>> 16) & 255);
        i3 = i2 + 1;
        bArr[i2] = (byte) ((i >>> 8) & 255);
        i2 = i3 + 1;
        bArr[i3] = (byte) (i & 255);
        e.c = i2;
        this.b += 4;
        return this;
    }

    public final bhi d(long j) {
        return new bhi(g(j));
    }

    public final OutputStream d() {
        return new bhe(this);
    }

    final bhv e(int i) {
        if (i <= 0 || i > 8192) {
            throw new IllegalArgumentException();
        }
        bhv bhv = this.a;
        if (bhv == null) {
            this.a = bhw.a();
            bhv bhv2 = this.a;
            bhv2.g = bhv2;
            bhv2.f = bhv2;
            return bhv2;
        }
        bhv = bhv.g;
        if (bhv.c + i > 8192 || !bhv.e) {
            bhv = bhv.a(bhw.a());
        }
        return bhv;
    }

    public final String e(long j) {
        if (j >= 0) {
            long j2 = Long.MAX_VALUE;
            if (j != Long.MAX_VALUE) {
                j2 = j + 1;
            }
            long a = a((byte) 10, 0, j2);
            if (a != -1) {
                return f(a);
            }
            if (j2 < this.b && c(j2 - 1) == (byte) 13 && c(j2) == (byte) 10) {
                return f(j2);
            }
            bhd bhd = new bhd();
            a(bhd, 0, Math.min(32, this.b));
            StringBuilder stringBuilder = new StringBuilder("\\n not found: limit=");
            stringBuilder.append(Math.min(this.b, j));
            stringBuilder.append(" content=");
            stringBuilder.append(bhd.n().e());
            stringBuilder.append('\u2026');
            throw new EOFException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
    }

    public final boolean e() {
        return this.b == 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bhd)) {
            return false;
        }
        bhd bhd = (bhd) obj;
        long j = this.b;
        if (j != bhd.b) {
            return false;
        }
        long j2 = 0;
        if (j == 0) {
            return true;
        }
        bhv bhv = this.a;
        bhv bhv2 = bhd.a;
        int i = bhv.b;
        int i2 = bhv2.b;
        while (j2 < this.b) {
            long min = (long) Math.min(bhv.c - i, bhv2.c - i2);
            int i3 = i2;
            i2 = i;
            i = 0;
            while (((long) i) < min) {
                int i4 = i2 + 1;
                int i5 = i3 + 1;
                if (bhv.a[i2] != bhv2.a[i3]) {
                    return false;
                }
                i++;
                i2 = i4;
                i3 = i5;
            }
            if (i2 == bhv.c) {
                bhv = bhv.f;
                i = bhv.b;
            } else {
                i = i2;
            }
            if (i3 == bhv2.c) {
                bhv2 = bhv2.f;
                i2 = bhv2.b;
            } else {
                i2 = i3;
            }
            j2 += min;
        }
        return true;
    }

    public final /* synthetic */ bhg f(int i) {
        return d(i);
    }

    public final InputStream f() {
        return new bhf(this);
    }

    final String f(long j) {
        String m;
        long j2 = 1;
        if (j > 0) {
            long j3 = j - 1;
            if (c(j3) == (byte) 13) {
                m = m(j3);
                j2 = 2;
                h(j2);
                return m;
            }
        }
        m = m(j);
        h(j2);
        return m;
    }

    public final void flush() {
    }

    public final long g() {
        long j = this.b;
        if (j == 0) {
            return 0;
        }
        bhv bhv = this.a.g;
        int i = bhv.c;
        if (i < 8192 && bhv.e) {
            j -= (long) (i - bhv.b);
        }
        return j;
    }

    public final /* synthetic */ bhg g(int i) {
        return c(i);
    }

    public final byte[] g(long j) {
        bic.a(this.b, 0, j);
        if (j <= 2147483647L) {
            byte[] bArr = new byte[((int) j)];
            a(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: ".concat(String.valueOf(j)));
    }

    public final byte h() {
        long j = this.b;
        if (j != 0) {
            bhv bhv = this.a;
            int i = bhv.b;
            int i2 = bhv.c;
            int i3 = i + 1;
            byte b = bhv.a[i];
            this.b = j - 1;
            if (i3 == i2) {
                this.a = bhv.b();
                bhw.a(bhv);
            } else {
                bhv.b = i3;
            }
            return b;
        }
        throw new IllegalStateException("size == 0");
    }

    public final /* synthetic */ bhg h(int i) {
        return b(i);
    }

    public final void h(long j) {
        while (j > 0) {
            bhv bhv = this.a;
            if (bhv != null) {
                int min = (int) Math.min(j, (long) (bhv.c - bhv.b));
                long j2 = (long) min;
                this.b -= j2;
                j -= j2;
                bhv bhv2 = this.a;
                bhv2.b += min;
                if (bhv2.b == bhv2.c) {
                    this.a = bhv2.b();
                    bhw.a(bhv2);
                }
            } else {
                throw new EOFException();
            }
        }
    }

    public final int hashCode() {
        bhv bhv = this.a;
        if (bhv == null) {
            return 0;
        }
        int i = 1;
        do {
            for (int i2 = bhv.b; i2 < bhv.c; i2++) {
                i = (i * 31) + bhv.a[i2];
            }
            bhv = bhv.f;
        } while (bhv != this.a);
        return i;
    }

    public final bhd i(long j) {
        if (j == 0) {
            return b(48);
        }
        Object obj = null;
        int i = 1;
        if (j < 0) {
            j = -j;
            if (j < 0) {
                return a("-9223372036854775808");
            }
            obj = 1;
        }
        if (j >= 100000000) {
            i = j < 1000000000000L ? j < 10000000000L ? j < 1000000000 ? 9 : 10 : j < 100000000000L ? 11 : 12 : j < 1000000000000000L ? j < 10000000000000L ? 13 : j < 100000000000000L ? 14 : 15 : j < 100000000000000000L ? j < 10000000000000000L ? 16 : 17 : j < 1000000000000000000L ? 18 : 19;
        } else if (j >= 10000) {
            i = j < 1000000 ? j < 100000 ? 5 : 6 : j < 10000000 ? 7 : 8;
        } else if (j >= 100) {
            i = j < 1000 ? 3 : 4;
        } else if (j >= 10) {
            i = 2;
        }
        if (obj != null) {
            i++;
        }
        bhv e = e(i);
        byte[] bArr = e.a;
        int i2 = e.c + i;
        while (j != 0) {
            i2--;
            bArr[i2] = c[(int) (j % 10)];
            j /= 10;
        }
        if (obj != null) {
            bArr[i2 - 1] = (byte) 45;
        }
        e.c += i;
        this.b += (long) i;
        return this;
    }

    public final short i() {
        long j = this.b;
        if (j >= 2) {
            bhv bhv = this.a;
            int i = bhv.b;
            int i2 = bhv.c;
            if (i2 - i < 2) {
                return (short) (((h() & 255) << 8) | (h() & 255));
            }
            byte[] bArr = bhv.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            i = ((bArr[i] & 255) << 8) | (bArr[i3] & 255);
            this.b = j - 2;
            if (i4 == i2) {
                this.a = bhv.b();
                bhw.a(bhv);
            } else {
                bhv.b = i4;
            }
            return (short) i;
        }
        StringBuilder stringBuilder = new StringBuilder("size < 2: ");
        stringBuilder.append(this.b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final boolean isOpen() {
        return true;
    }

    public final int j() {
        long j = this.b;
        if (j >= 4) {
            bhv bhv = this.a;
            int i = bhv.b;
            int i2 = bhv.c;
            if (i2 - i < 4) {
                return ((((h() & 255) << 24) | ((h() & 255) << 16)) | ((h() & 255) << 8)) | (h() & 255);
            }
            byte[] bArr = bhv.a;
            int i3 = i + 1;
            int i4 = i3 + 1;
            i = ((bArr[i] & 255) << 24) | ((bArr[i3] & 255) << 16);
            i3 = i4 + 1;
            i |= (bArr[i4] & 255) << 8;
            i4 = i3 + 1;
            i |= bArr[i3] & 255;
            this.b = j - 4;
            if (i4 == i2) {
                this.a = bhv.b();
                bhw.a(bhv);
            } else {
                bhv.b = i4;
            }
            return i;
        }
        StringBuilder stringBuilder = new StringBuilder("size < 4: ");
        stringBuilder.append(this.b);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final bhd j(long j) {
        if (j == 0) {
            return b(48);
        }
        int numberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j)) / 4) + 1;
        bhv e = e(numberOfTrailingZeros);
        byte[] bArr = e.a;
        int i = e.c;
        for (int i2 = (i + numberOfTrailingZeros) - 1; i2 >= i; i2--) {
            bArr[i2] = c[(int) (15 & j)];
            j >>>= 4;
        }
        e.c += numberOfTrailingZeros;
        this.b += (long) numberOfTrailingZeros;
        return this;
    }

    public final /* synthetic */ bhg k(long j) {
        return j(j);
    }

    public final short k() {
        return bic.a(i());
    }

    public final int l() {
        return bic.a(j());
    }

    public final /* synthetic */ bhg l(long j) {
        return i(j);
    }

    public final long m() {
        if (this.b != 0) {
            long j = 0;
            int i = 0;
            Object obj = null;
            do {
                bhv bhv = this.a;
                byte[] bArr = bhv.a;
                int i2 = bhv.b;
                int i3 = bhv.c;
                while (i2 < i3) {
                    int i4;
                    int i5 = bArr[i2];
                    if (i5 < (byte) 48 || i5 > (byte) 57) {
                        if (i5 >= (byte) 97 && i5 <= (byte) 102) {
                            i4 = i5 - 97;
                        } else if (i5 >= (byte) 65 && i5 <= (byte) 70) {
                            i4 = i5 - 65;
                        } else if (i != 0) {
                            obj = 1;
                            if (i2 != i3) {
                                this.a = bhv.b();
                                bhw.a(bhv);
                            } else {
                                bhv.b = i2;
                            }
                            if (obj == null) {
                                break;
                            }
                        } else {
                            StringBuilder stringBuilder = new StringBuilder("Expected leading [0-9a-fA-F] character but was 0x");
                            stringBuilder.append(Integer.toHexString(i5));
                            throw new NumberFormatException(stringBuilder.toString());
                        }
                        i4 += 10;
                    } else {
                        i4 = i5 - 48;
                    }
                    if ((-1152921504606846976L & j) == 0) {
                        j = (j << 4) | ((long) i4);
                        i2++;
                        i++;
                    } else {
                        bhd b = new bhd().j(j).b(i5);
                        StringBuilder stringBuilder2 = new StringBuilder("Number too large: ");
                        stringBuilder2.append(b.o());
                        throw new NumberFormatException(stringBuilder2.toString());
                    }
                }
                if (i2 != i3) {
                    bhv.b = i2;
                } else {
                    this.a = bhv.b();
                    bhw.a(bhv);
                }
                if (obj == null) {
                    break;
                }
            } while (this.a != null);
            this.b -= (long) i;
            return j;
        }
        throw new IllegalStateException("size == 0");
    }

    public final bhi n() {
        return new bhi(r());
    }

    public final String o() {
        try {
            return a(this.b, bic.a);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final String p() {
        return e(Long.MAX_VALUE);
    }

    public final int q() {
        if (this.b != 0) {
            int i;
            int i2;
            int i3;
            byte c = c(0);
            int i4 = 1;
            if ((c & 128) == 0) {
                i = c & 127;
                i2 = 1;
                i3 = 0;
            } else if ((c & 224) == 192) {
                i = c & 31;
                i2 = 2;
                i3 = 128;
            } else if ((c & 240) == 224) {
                i = c & 15;
                i2 = 3;
                i3 = 2048;
            } else if ((c & 248) == 240) {
                i = c & 7;
                i2 = 4;
                i3 = 65536;
            } else {
                h(1);
                return 65533;
            }
            long j = (long) i2;
            if (this.b >= j) {
                while (i4 < i2) {
                    long j2 = (long) i4;
                    c = c(j2);
                    if ((c & 192) == 128) {
                        i = (i << 6) | (c & 63);
                        i4++;
                    } else {
                        h(j2);
                        return 65533;
                    }
                }
                h(j);
                return i > 1114111 ? 65533 : ((i < 55296 || i > 57343) && i >= i3) ? i : 65533;
            } else {
                StringBuilder stringBuilder = new StringBuilder("size < ");
                stringBuilder.append(i2);
                stringBuilder.append(": ");
                stringBuilder.append(this.b);
                stringBuilder.append(" (to read code point prefixed 0x");
                stringBuilder.append(Integer.toHexString(c));
                stringBuilder.append(")");
                throw new EOFException(stringBuilder.toString());
            }
        }
        throw new EOFException();
    }

    public final byte[] r() {
        try {
            return g(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final int read(ByteBuffer byteBuffer) {
        bhv bhv = this.a;
        if (bhv == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), bhv.c - bhv.b);
        byteBuffer.put(bhv.a, bhv.b, min);
        bhv.b += min;
        this.b -= (long) min;
        if (bhv.b == bhv.c) {
            this.a = bhv.b();
            bhw.a(bhv);
        }
        return min;
    }

    public final void s() {
        try {
            h(this.b);
        } catch (EOFException e) {
            throw new AssertionError(e);
        }
    }

    public final long t() {
        return a((byte) 0, 0, Long.MAX_VALUE);
    }

    public final String toString() {
        long j = this.b;
        if (j <= 2147483647L) {
            int i = (int) j;
            return (i == 0 ? bhi.b : new bhx(this, i)).toString();
        }
        StringBuilder stringBuilder = new StringBuilder("size > Integer.MAX_VALUE: ");
        stringBuilder.append(this.b);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final bhd u() {
        bhd bhd = new bhd();
        if (this.b == 0) {
            return bhd;
        }
        bhd.a = this.a.a();
        bhv bhv = bhd.a;
        bhv.g = bhv;
        bhv.f = bhv;
        bhv = this.a;
        while (true) {
            bhv = bhv.f;
            if (bhv != this.a) {
                bhd.a.g.a(bhv.a());
            } else {
                bhd.b = this.b;
                return bhd;
            }
        }
    }

    public final /* bridge */ /* synthetic */ bhg v() {
        return this;
    }

    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer != null) {
            int remaining = byteBuffer.remaining();
            int i = remaining;
            while (i > 0) {
                bhv e = e(1);
                int min = Math.min(i, 8192 - e.c);
                byteBuffer.get(e.a, e.c, min);
                i -= min;
                e.c += min;
            }
            this.b += (long) remaining;
            return remaining;
        }
        throw new IllegalArgumentException("source == null");
    }
}
