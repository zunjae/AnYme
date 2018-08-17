package defpackage;

import java.io.Reader;

final class zf extends Reader {
    zf() {
    }

    public final void close() {
        throw new AssertionError();
    }

    public final int read(char[] cArr, int i, int i2) {
        throw new AssertionError();
    }
}
