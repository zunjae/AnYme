package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class nu extends FilterInputStream {
    private int a = Integer.MIN_VALUE;

    public nu(InputStream inputStream) {
        super(inputStream);
    }

    private long a(long j) {
        int i = this.a;
        if (i == 0) {
            return -1;
        }
        if (i != Integer.MIN_VALUE && j > ((long) i)) {
            j = (long) i;
        }
        return j;
    }

    private void b(long j) {
        int i = this.a;
        if (i != Integer.MIN_VALUE && j != -1) {
            this.a = (int) (((long) i) - j);
        }
    }

    public final int available() {
        int i = this.a;
        return i == Integer.MIN_VALUE ? super.available() : Math.min(i, super.available());
    }

    public final void mark(int i) {
        super.mark(i);
        this.a = i;
    }

    public final int read() {
        if (a(1) == -1) {
            return -1;
        }
        int read = super.read();
        b(1);
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        i2 = (int) a((long) i2);
        if (i2 == -1) {
            return -1;
        }
        int read = super.read(bArr, i, i2);
        b((long) read);
        return read;
    }

    public final void reset() {
        super.reset();
        this.a = Integer.MIN_VALUE;
    }

    public final long skip(long j) {
        j = a(j);
        if (j == -1) {
            return -1;
        }
        j = super.skip(j);
        b(j);
        return j;
    }
}
