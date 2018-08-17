package defpackage;

import java.io.Writer;

public class bje extends biw {
    private final int b = 32;
    private final int c = 127;
    private final boolean d = false;

    protected bje() {
    }

    public final boolean a(int i, Writer writer) {
        if (this.d) {
            if (i < this.b || i > this.c) {
                return false;
            }
        } else if (i >= this.b && i <= this.c) {
            return false;
        }
        if (i > 65535) {
            writer.write(b(i));
        } else {
            writer.write("\\u");
            writer.write(a[(i >> 12) & 15]);
            writer.write(a[(i >> 8) & 15]);
            writer.write(a[(i >> 4) & 15]);
            writer.write(a[i & 15]);
        }
        return true;
    }

    protected String b(int i) {
        StringBuilder stringBuilder = new StringBuilder("\\u");
        stringBuilder.append(biv.a(i));
        return stringBuilder.toString();
    }
}
