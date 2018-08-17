package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.WritableByteChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class axa implements Closeable {
    private static final Logger b = Logger.getLogger(axa.class.getName());
    int a;
    private final RandomAccessFile c;
    private int d;
    private axc e;
    private axc f;
    private final byte[] g = new byte[16];

    public axa(File file) {
        if (!file.exists()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file.getPath());
            stringBuilder.append(".tmp");
            File file2 = new File(stringBuilder.toString());
            RandomAccessFile a = axa.a(file2);
            try {
                a.setLength(4096);
                a.seek(0);
                byte[] bArr = new byte[16];
                axa.a(bArr, 4096, 0, 0, 0);
                a.write(bArr);
                if (!file2.renameTo(file)) {
                    throw new IOException("Rename failed!");
                }
            } finally {
                a.close();
            }
        }
        this.c = axa.a(file);
        this.c.seek(0);
        this.c.readFully(this.g);
        this.a = axa.a(this.g, 0);
        if (((long) this.a) <= this.c.length()) {
            this.d = axa.a(this.g, 4);
            int a2 = axa.a(this.g, 8);
            int a3 = axa.a(this.g, 12);
            this.e = a(a2);
            this.f = a(a3);
            return;
        }
        StringBuilder stringBuilder2 = new StringBuilder("File is truncated. Expected length: ");
        stringBuilder2.append(this.a);
        stringBuilder2.append(", Actual length: ");
        stringBuilder2.append(this.c.length());
        throw new IOException(stringBuilder2.toString());
    }

    private static int a(byte[] bArr, int i) {
        return ((((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16)) + ((bArr[i + 2] & 255) << 8)) + (bArr[i + 3] & 255);
    }

    private axc a(int i) {
        if (i == 0) {
            return axc.a;
        }
        this.c.seek((long) i);
        return new axc(i, this.c.readInt());
    }

    private static RandomAccessFile a(File file) {
        return new RandomAccessFile(file, "rwd");
    }

    private void a(int i, int i2, int i3, int i4) {
        axa.a(this.g, i, i2, i3, i4);
        this.c.seek(0);
        this.c.write(this.g);
    }

    private void a(int i, byte[] bArr, int i2) {
        i = b(i);
        int i3 = i + i2;
        int i4 = this.a;
        if (i3 <= i4) {
            this.c.seek((long) i);
            this.c.write(bArr, 0, i2);
            return;
        }
        i4 -= i;
        this.c.seek((long) i);
        this.c.write(bArr, 0, i4);
        this.c.seek(16);
        this.c.write(bArr, i4 + 0, i2 - i4);
    }

    private void a(int i, byte[] bArr, int i2, int i3) {
        RandomAccessFile randomAccessFile;
        i = b(i);
        int i4 = i + i3;
        int i5 = this.a;
        if (i4 <= i5) {
            this.c.seek((long) i);
            randomAccessFile = this.c;
        } else {
            i5 -= i;
            this.c.seek((long) i);
            this.c.readFully(bArr, i2, i5);
            this.c.seek(16);
            randomAccessFile = this.c;
            i2 += i5;
            i3 -= i5;
        }
        randomAccessFile.readFully(bArr, i2, i3);
    }

    private static void a(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    private static void a(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            axa.a(bArr, i, iArr[i2]);
            i += 4;
        }
    }

    private int b(int i) {
        int i2 = this.a;
        return i < i2 ? i : (i + 16) - i2;
    }

    private static <T> T b(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    private synchronized void b(byte[] bArr, int i) {
        axa.b((Object) bArr, "buffer");
        if ((i | 0) < 0 || i > bArr.length - 0) {
            throw new IndexOutOfBoundsException();
        }
        c(i);
        boolean b = b();
        axc axc = new axc(b ? 16 : b((this.f.b + 4) + this.f.c), i);
        axa.a(this.g, 0, i);
        a(axc.b, this.g, 4);
        a(axc.b + 4, bArr, i);
        a(this.a, this.d + 1, b ? axc.b : this.e.b, axc.b);
        this.f = axc;
        this.d++;
        if (b) {
            this.e = this.f;
        }
    }

    private void c(int i) {
        i += 4;
        int a = this.a - a();
        if (a < i) {
            int i2 = this.a;
            do {
                a += i2;
                i2 <<= 1;
            } while (a < i);
            d(i2);
            axc axc = this.f;
            i = b((axc.b + 4) + axc.c);
            if (i < this.e.b) {
                WritableByteChannel channel = this.c.getChannel();
                channel.position((long) this.a);
                long j = (long) (i - 4);
                if (channel.transferTo(16, j, channel) != j) {
                    throw new AssertionError("Copied insufficient number of bytes!");
                }
            }
            i = this.f.b;
            a = this.e.b;
            if (i < a) {
                int i3 = (this.a + i) - 16;
                a(i2, this.d, a, i3);
                this.f = new axc(i3, this.f.c);
            } else {
                a(i2, this.d, a, i);
            }
            this.a = i2;
        }
    }

    private synchronized void d() {
        a(4096, 0, 0, 0);
        this.d = 0;
        this.e = axc.a;
        this.f = axc.a;
        if (this.a > 4096) {
            d(4096);
        }
        this.a = 4096;
    }

    private void d(int i) {
        this.c.setLength((long) i);
        this.c.getChannel().force(true);
    }

    public final int a() {
        if (this.d == 0) {
            return 16;
        }
        axc axc = this.f;
        int i = axc.b;
        int i2 = this.e.b;
        return i >= i2 ? (((i - i2) + 4) + axc.c) + 16 : (((i + 4) + axc.c) + this.a) - i2;
    }

    public final synchronized void a(axe axe) {
        int i = this.e.b;
        for (int i2 = 0; i2 < this.d; i2++) {
            axc a = a(i);
            axe.a(new axd(this, a, (byte) 0), a.c);
            i = b((a.b + 4) + a.c);
        }
    }

    public final void a(byte[] bArr) {
        b(bArr, bArr.length);
    }

    public final boolean a(int i, int i2) {
        return (a() + 4) + i <= i2;
    }

    public final synchronized boolean b() {
        return this.d == 0;
    }

    public final synchronized void c() {
        if (b()) {
            throw new NoSuchElementException();
        } else if (this.d == 1) {
            d();
        } else {
            int b = b((this.e.b + 4) + this.e.c);
            a(b, this.g, 0, 4);
            int a = axa.a(this.g, 0);
            a(this.a, this.d - 1, b, this.f.b);
            this.d--;
            this.e = new axc(b, a);
        }
    }

    public synchronized void close() {
        this.c.close();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append('[');
        stringBuilder.append("fileLength=");
        stringBuilder.append(this.a);
        stringBuilder.append(", size=");
        stringBuilder.append(this.d);
        stringBuilder.append(", first=");
        stringBuilder.append(this.e);
        stringBuilder.append(", last=");
        stringBuilder.append(this.f);
        stringBuilder.append(", element lengths=[");
        try {
            a(new axb(this, stringBuilder));
        } catch (Throwable e) {
            b.log(Level.WARNING, "read error", e);
        }
        stringBuilder.append("]]");
        return stringBuilder.toString();
    }
}
