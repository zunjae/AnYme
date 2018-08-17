package defpackage;

import java.io.IOException;
import java.io.InputStream;

final class bhu extends InputStream {
    final /* synthetic */ bht a;

    bhu(bht bht) {
        this.a = bht;
    }

    public final int available() {
        bht bht = this.a;
        if (!bht.c) {
            return (int) Math.min(bht.a.b, 2147483647L);
        }
        throw new IOException("closed");
    }

    public final void close() {
        this.a.close();
    }

    public final int read() {
        bht bht = this.a;
        if (bht.c) {
            throw new IOException("closed");
        }
        bhd bhd = bht.a;
        return (bhd.b == 0 && bht.b.a(bhd, 8192) == -1) ? -1 : this.a.a.h() & 255;
    }

    public final int read(byte[] bArr, int i, int i2) {
        if (this.a.c) {
            throw new IOException("closed");
        }
        bic.a((long) bArr.length, (long) i, (long) i2);
        bht bht = this.a;
        bhd bhd = bht.a;
        return (bhd.b == 0 && bht.b.a(bhd, 8192) == -1) ? -1 : this.a.a.a(bArr, i, i2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".inputStream()");
        return stringBuilder.toString();
    }
}
