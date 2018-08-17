package defpackage;

import java.io.Writer;

final class zh extends Writer {
    zh() {
    }

    public final void close() {
        throw new AssertionError();
    }

    public final void flush() {
        throw new AssertionError();
    }

    public final void write(char[] cArr, int i, int i2) {
        throw new AssertionError();
    }
}
