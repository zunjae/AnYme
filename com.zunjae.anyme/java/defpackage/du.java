package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;

final class du extends ByteArrayOutputStream {
    final /* synthetic */ dt a;

    du(dt dtVar, int i) {
        this.a = dtVar;
        super(i);
    }

    public final String toString() {
        int i = this.count;
        i = (i <= 0 || this.buf[i - 1] != (byte) 13) ? this.count : i - 1;
        try {
            return new String(this.buf, 0, i, this.a.b.name());
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }
}
