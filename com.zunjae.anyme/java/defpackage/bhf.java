package defpackage;

import java.io.InputStream;

final class bhf extends InputStream {
    final /* synthetic */ bhd a;

    bhf(bhd bhd) {
        this.a = bhd;
    }

    public final int available() {
        return (int) Math.min(this.a.b, 2147483647L);
    }

    public final void close() {
    }

    public final int read() {
        bhd bhd = this.a;
        return bhd.b > 0 ? bhd.h() & 255 : -1;
    }

    public final int read(byte[] bArr, int i, int i2) {
        return this.a.a(bArr, i, i2);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".inputStream()");
        return stringBuilder.toString();
    }
}
