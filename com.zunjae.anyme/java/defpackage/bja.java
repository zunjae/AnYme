package defpackage;

import java.io.Writer;

public final class bja extends biw {
    private final int b;
    private final int c;
    private final boolean d;

    public bja() {
        this(0, Integer.MAX_VALUE);
    }

    private bja(int i, int i2) {
        this.b = i;
        this.c = i2;
        this.d = true;
    }

    public static bja a(int i, int i2) {
        return new bja(i, i2);
    }

    public final boolean a(int i, Writer writer) {
        if (this.d) {
            if (i < this.b || i > this.c) {
                return false;
            }
        } else if (i >= this.b && i <= this.c) {
            return false;
        }
        writer.write("&#");
        writer.write(Integer.toString(i, 10));
        writer.write(59);
        return true;
    }
}
