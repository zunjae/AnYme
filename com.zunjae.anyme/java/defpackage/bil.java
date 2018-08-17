package defpackage;

import java.io.Serializable;
import java.io.Writer;

public final class bil extends Writer implements Serializable {
    private final StringBuilder a;

    public bil() {
        this.a = new StringBuilder();
    }

    public bil(byte b) {
        this.a = new StringBuilder(4);
    }

    public final Writer append(char c) {
        this.a.append(c);
        return this;
    }

    public final Writer append(CharSequence charSequence) {
        this.a.append(charSequence);
        return this;
    }

    public final Writer append(CharSequence charSequence, int i, int i2) {
        this.a.append(charSequence, i, i2);
        return this;
    }

    public final void close() {
    }

    public final void flush() {
    }

    public final String toString() {
        return this.a.toString();
    }

    public final void write(String str) {
        if (str != null) {
            this.a.append(str);
        }
    }

    public final void write(char[] cArr, int i, int i2) {
        if (cArr != null) {
            this.a.append(cArr, i, i2);
        }
    }
}
