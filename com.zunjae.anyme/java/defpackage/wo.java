package defpackage;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class wo {
    public Number a() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public String b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public double c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public long d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public int e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public boolean f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    public final wt g() {
        if (this instanceof wt) {
            return (wt) this;
        }
        throw new IllegalStateException("Not a JSON Primitive: ".concat(String.valueOf(this)));
    }

    public String toString() {
        try {
            Writer stringWriter = new StringWriter();
            abq abq = new abq(stringWriter);
            abq.b(true);
            yp.a(this, abq);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
