package defpackage;

import java.io.InputStream;

final class axd extends InputStream {
    final /* synthetic */ axa a;
    private int b;
    private int c;

    private axd(axa axa, axc axc) {
        this.a = axa;
        this.b = axa.b(axc.b + 4);
        this.c = axc.c;
    }

    public final int read() {
        if (this.c == 0) {
            return -1;
        }
        this.a.c.seek((long) this.b);
        int read = this.a.c.read();
        this.b = this.a.b(this.b + 1);
        this.c--;
        return read;
    }

    public final int read(byte[] bArr, int i, int i2) {
        axa.b((Object) bArr, "buffer");
        if ((i | i2) < 0 || i2 > bArr.length - i) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int i3 = this.c;
        if (i3 <= 0) {
            return -1;
        }
        if (i2 > i3) {
            i2 = i3;
        }
        this.a.a(this.b, bArr, i, i2);
        this.b = this.a.b(this.b + i2);
        this.c -= i2;
        return i2;
    }
}
