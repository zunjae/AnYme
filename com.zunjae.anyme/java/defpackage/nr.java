package defpackage;

import java.io.IOException;
import java.io.InputStream;
import java.util.Queue;

public final class nr extends InputStream {
    private static final Queue<nr> a = nw.a(0);
    private InputStream b;
    private IOException c;

    nr() {
    }

    public static nr a(InputStream inputStream) {
        nr nrVar;
        synchronized (a) {
            nrVar = (nr) a.poll();
        }
        if (nrVar == null) {
            nrVar = new nr();
        }
        nrVar.b = inputStream;
        return nrVar;
    }

    public final IOException a() {
        return this.c;
    }

    public final int available() {
        return this.b.available();
    }

    public final void b() {
        this.c = null;
        this.b = null;
        synchronized (a) {
            a.offer(this);
        }
    }

    public final void close() {
        this.b.close();
    }

    public final void mark(int i) {
        this.b.mark(i);
    }

    public final boolean markSupported() {
        return this.b.markSupported();
    }

    public final int read() {
        try {
            return this.b.read();
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public final int read(byte[] bArr) {
        try {
            return this.b.read(bArr);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.b.read(bArr, i, i2);
        } catch (IOException e) {
            this.c = e;
            return -1;
        }
    }

    public final synchronized void reset() {
        this.b.reset();
    }

    public final long skip(long j) {
        try {
            return this.b.skip(j);
        } catch (IOException e) {
            this.c = e;
            return 0;
        }
    }
}
