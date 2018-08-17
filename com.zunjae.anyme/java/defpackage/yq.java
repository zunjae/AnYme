package defpackage;

import java.io.Writer;

final class yq extends Writer {
    private final Appendable a;
    private final yr b = new yr();

    yq(Appendable appendable) {
        this.a = appendable;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final void write(int i) {
        this.a.append((char) i);
    }

    public final void write(char[] cArr, int i, int i2) {
        CharSequence charSequence = this.b;
        charSequence.a = cArr;
        this.a.append(charSequence, i, i2 + i);
    }
}
