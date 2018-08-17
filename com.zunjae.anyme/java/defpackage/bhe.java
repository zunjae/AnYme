package defpackage;

import java.io.OutputStream;

final class bhe extends OutputStream {
    final /* synthetic */ bhd a;

    bhe(bhd bhd) {
        this.a = bhd;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(".outputStream()");
        return stringBuilder.toString();
    }

    public final void write(int i) {
        this.a.b((byte) i);
    }

    public final void write(byte[] bArr, int i, int i2) {
        this.a.b(bArr, i, i2);
    }
}
