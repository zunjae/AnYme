package defpackage;

import java.nio.ByteBuffer;

final class bhs implements bhg {
    public final bhd a = new bhd();
    public final bhy b;
    boolean c;

    bhs(bhy bhy) {
        if (bhy != null) {
            this.b = bhy;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    public final bia a() {
        return this.b.a();
    }

    public final void a_(bhd bhd, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a_(bhd, j);
        v();
    }

    public final bhg b(String str) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a(str);
        return v();
    }

    public final bhd c() {
        return this.a;
    }

    public final bhg c(bhi bhi) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a(bhi);
        return v();
    }

    public final bhg c(byte[] bArr) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(bArr);
        return v();
    }

    public final bhg c(byte[] bArr, int i, int i2) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(bArr, i, i2);
        return v();
    }

    public final void close() {
        if (!this.c) {
            Throwable th = null;
            try {
                if (this.a.b > 0) {
                    this.b.a_(this.a, this.a.b);
                }
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.b.close();
            } catch (Throwable th3) {
                if (th == null) {
                    th = th3;
                }
            }
            this.c = true;
            if (th != null) {
                bic.a(th);
            }
        }
    }

    public final bhg f(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.d(i);
        return v();
    }

    public final void flush() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        bhd bhd = this.a;
        long j = bhd.b;
        if (j > 0) {
            this.b.a_(bhd, j);
        }
        this.b.flush();
    }

    public final bhg g(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(i);
        return v();
    }

    public final bhg h(int i) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(i);
        return v();
    }

    public final boolean isOpen() {
        return !this.c;
    }

    public final bhg k(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.j(j);
        return v();
    }

    public final bhg l(long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.i(j);
        return v();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("buffer(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final bhg v() {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long g = this.a.g();
        if (g > 0) {
            this.b.a_(this.a, g);
        }
        return this;
    }

    public final int write(ByteBuffer byteBuffer) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int write = this.a.write(byteBuffer);
        v();
        return write;
    }
}
