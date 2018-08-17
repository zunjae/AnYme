package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

final class bfw implements Closeable {
    private static final Logger b = Logger.getLogger(bex.class.getName());
    final bew a = new bew(this.e);
    private final bhg c;
    private final boolean d;
    private final bhd e = new bhd();
    private int f = 16384;
    private boolean g;

    bfw(bhg bhg, boolean z) {
        this.c = bhg;
        this.d = z;
    }

    private void a(int i, int i2, byte b, byte b2) {
        if (b.isLoggable(Level.FINE)) {
            b.fine(bex.a(false, i, i2, b, b2));
        }
        if (i2 > this.f) {
            throw bex.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(this.f), Integer.valueOf(i2));
        } else if ((Integer.MIN_VALUE & i) == 0) {
            bfw.a(this.c, i2);
            this.c.h(b & 255);
            this.c.h(b2 & 255);
            this.c.f(i & Integer.MAX_VALUE);
        } else {
            throw bex.a("reserved bit set: %s", Integer.valueOf(i));
        }
    }

    private static void a(bhg bhg, int i) {
        bhg.h((i >>> 16) & 255);
        bhg.h((i >>> 8) & 255);
        bhg.h(i & 255);
    }

    private void b(int i, long j) {
        while (j > 0) {
            int min = (int) Math.min((long) this.f, j);
            long j2 = (long) min;
            j -= j2;
            a(i, min, (byte) 9, j == 0 ? (byte) 4 : (byte) 0);
            this.c.a_(this.e, j2);
        }
    }

    public final synchronized void a() {
        if (this.g) {
            throw new IOException("closed");
        } else if (this.d) {
            if (b.isLoggable(Level.FINE)) {
                b.fine(bdb.a(">> CONNECTION %s", bex.a.e()));
            }
            this.c.c(bex.a.h());
            this.c.flush();
        }
    }

    public final synchronized void a(int i, long j) {
        if (this.g) {
            throw new IOException("closed");
        } else if (j == 0 || j > 2147483647L) {
            throw bex.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j));
        } else {
            a(i, 4, (byte) 8, (byte) 0);
            this.c.f((int) j);
            this.c.flush();
        }
    }

    public final synchronized void a(int i, bes bes) {
        if (this.g) {
            throw new IOException("closed");
        } else if (bes.httpCode != -1) {
            a(i, 4, (byte) 3, (byte) 0);
            this.c.f(bes.httpCode);
            this.c.flush();
        } else {
            throw new IllegalArgumentException();
        }
    }

    public final synchronized void a(int i, bes bes, byte[] bArr) {
        if (this.g) {
            throw new IOException("closed");
        } else if (bes.httpCode != -1) {
            a(0, bArr.length + 8, (byte) 7, (byte) 0);
            this.c.f(i);
            this.c.f(bes.httpCode);
            if (bArr.length > 0) {
                this.c.c(bArr);
            }
            this.c.flush();
        } else {
            throw bex.a("errorCode.httpCode == -1", new Object[0]);
        }
    }

    public final synchronized void a(bgb bgb) {
        if (this.g) {
            throw new IOException("closed");
        }
        this.f = bgb.c(this.f);
        if (bgb.b() != -1) {
            this.a.a(bgb.b());
        }
        a(0, 0, (byte) 4, (byte) 1);
        this.c.flush();
    }

    public final synchronized void a(boolean z, int i, int i2) {
        if (this.g) {
            throw new IOException("closed");
        }
        a(0, 8, (byte) 6, z ? (byte) 1 : (byte) 0);
        this.c.f(i);
        this.c.f(i2);
        this.c.flush();
    }

    public final synchronized void a(boolean z, int i, bhd bhd, int i2) {
        if (this.g) {
            throw new IOException("closed");
        }
        a(i, i2, (byte) 0, (byte) z);
        if (i2 > 0) {
            this.c.a_(bhd, (long) i2);
        }
    }

    public final synchronized void a(boolean z, int i, List<bet> list) {
        if (this.g) {
            throw new IOException("closed");
        } else if (this.g) {
            throw new IOException("closed");
        } else {
            this.a.a((List) list);
            long b = this.e.b();
            int min = (int) Math.min((long) this.f, b);
            long j = (long) min;
            byte b2 = b == j ? (byte) 4 : (byte) 0;
            if (z) {
                b2 = (byte) (b2 | 1);
            }
            a(i, min, (byte) 1, b2);
            this.c.a_(this.e, j);
            if (b > j) {
                b(i, b - j);
            }
        }
    }

    public final synchronized void b() {
        if (this.g) {
            throw new IOException("closed");
        }
        this.c.flush();
    }

    public final synchronized void b(bgb bgb) {
        if (this.g) {
            throw new IOException("closed");
        }
        int i = (byte) 0;
        a(0, bgb.a() * 6, (byte) 4, (byte) 0);
        while (i < 10) {
            if (bgb.a(i)) {
                int i2 = i == 4 ? 3 : i == 7 ? 4 : i;
                this.c.g(i2);
                this.c.f(bgb.b(i));
            }
            i++;
        }
        this.c.flush();
    }

    public final int c() {
        return this.f;
    }

    public final synchronized void close() {
        this.g = true;
        this.c.close();
    }
}
