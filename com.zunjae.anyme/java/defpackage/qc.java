package defpackage;

import java.io.Flushable;
import java.io.InputStream;
import java.io.OutputStream;

final class qc implements Flushable {
    private final byte[] a;
    private final int b = 4096;
    private int c = 0;
    private final OutputStream d;

    private qc(OutputStream outputStream, byte[] bArr) {
        this.d = outputStream;
        this.a = bArr;
    }

    public static int a() {
        return qc.d(1) + 4;
    }

    public static int a(int i) {
        return qc.d(i) + 1;
    }

    public static qc a(OutputStream outputStream) {
        return new qc(outputStream, new byte[4096]);
    }

    private void a(byte b) {
        if (this.c == this.b) {
            b();
        }
        byte[] bArr = this.a;
        int i = this.c;
        this.c = i + 1;
        bArr[i] = b;
    }

    private void a(long j) {
        while ((-128 & j) != 0) {
            a((byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        a((byte) ((int) j));
    }

    public static int b(int i) {
        return qc.d(2) + qc.f(qc.g(i));
    }

    public static int b(int i, long j) {
        i = qc.d(i);
        int i2 = (-128 & j) == 0 ? 1 : (-16384 & j) == 0 ? 2 : (-2097152 & j) == 0 ? 3 : (-268435456 & j) == 0 ? 4 : (-34359738368L & j) == 0 ? 5 : (-4398046511104L & j) == 0 ? 6 : (-562949953421312L & j) == 0 ? 7 : (-72057594037927936L & j) == 0 ? 8 : (j & Long.MIN_VALUE) == 0 ? 9 : 10;
        return i + i2;
    }

    public static int b(int i, py pyVar) {
        return qc.d(i) + (qc.f(pyVar.a()) + pyVar.a());
    }

    private void b() {
        OutputStream outputStream = this.d;
        if (outputStream != null) {
            outputStream.write(this.a, 0, this.c);
            this.c = 0;
            return;
        }
        throw new qd();
    }

    public static int c(int i, int i2) {
        return qc.d(i) + qc.f(i2);
    }

    public static int d(int i) {
        return qc.f(um.a(i, 0));
    }

    public static int d(int i, int i2) {
        return qc.d(i) + (i2 >= 0 ? qc.f(i2) : 10);
    }

    public static int f(int i) {
        return (i & -128) == 0 ? 1 : (i & -16384) == 0 ? 2 : (-2097152 & i) == 0 ? 3 : (i & -268435456) == 0 ? 4 : 5;
    }

    public static int g(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public final void a(int i, int i2) {
        e(i, 0);
        e(i2);
    }

    public final void a(int i, long j) {
        e(i, 0);
        a(j);
    }

    public final void a(int i, py pyVar) {
        e(i, 2);
        e(pyVar.a());
        i = pyVar.a();
        int i2 = this.b;
        int i3 = this.c;
        if (i2 - i3 >= i) {
            pyVar.a(this.a, 0, i3, i);
            this.c += i;
            return;
        }
        i2 -= i3;
        pyVar.a(this.a, 0, i3, i2);
        i3 = i2 + 0;
        i -= i2;
        this.c = this.b;
        b();
        if (i <= this.b) {
            pyVar.a(this.a, i3, 0, i);
            this.c = i;
            return;
        }
        InputStream b = pyVar.b();
        long j = (long) i3;
        if (j == b.skip(j)) {
            while (i > 0) {
                i2 = Math.min(i, this.b);
                i3 = b.read(this.a, 0, i2);
                if (i3 == i2) {
                    this.d.write(this.a, 0, i3);
                    i -= i3;
                } else {
                    throw new IllegalStateException("Read failed.");
                }
            }
            return;
        }
        throw new IllegalStateException("Skip failed.");
    }

    public final void a(int i, boolean z) {
        e(i, 0);
        a((byte) z);
    }

    public final void a(byte[] bArr) {
        int length = bArr.length;
        int i = this.b;
        int i2 = this.c;
        if (i - i2 >= length) {
            System.arraycopy(bArr, 0, this.a, i2, length);
            this.c += length;
            return;
        }
        i -= i2;
        System.arraycopy(bArr, 0, this.a, i2, i);
        i2 = i + 0;
        length -= i;
        this.c = this.b;
        b();
        if (length <= this.b) {
            System.arraycopy(bArr, i2, this.a, 0, length);
            this.c = length;
            return;
        }
        this.d.write(bArr, i2, length);
    }

    public final void b(int i, int i2) {
        e(i, 0);
        if (i2 >= 0) {
            e(i2);
        } else {
            a((long) i2);
        }
    }

    public final void c(int i) {
        a((byte) i);
    }

    public final void e(int i) {
        while ((i & -128) != 0) {
            a((byte) ((i & 127) | 128));
            i >>>= 7;
        }
        a((byte) i);
    }

    public final void e(int i, int i2) {
        e(um.a(i, i2));
    }

    public final void flush() {
        if (this.d != null) {
            b();
        }
    }
}
