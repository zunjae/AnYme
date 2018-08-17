package defpackage;

import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class zg extends abq {
    private static final Writer a = new zh();
    private static final wt b = new wt("closed");
    private final List<wo> c = new ArrayList();
    private String d;
    private wo e = wq.a;

    public zg() {
        super(a);
    }

    private void a(wo woVar) {
        if (this.d != null) {
            if (!(woVar instanceof wq) || i()) {
                ((wr) j()).a(this.d, woVar);
            }
            this.d = null;
        } else if (this.c.isEmpty()) {
            this.e = woVar;
        } else {
            wo j = j();
            if (j instanceof wm) {
                ((wm) j).a(woVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    private wo j() {
        List list = this.c;
        return (wo) list.get(list.size() - 1);
    }

    public final abq a(long j) {
        a(new wt(Long.valueOf(j)));
        return this;
    }

    public final abq a(Boolean bool) {
        if (bool == null) {
            return f();
        }
        a(new wt(bool));
        return this;
    }

    public final abq a(Number number) {
        if (number == null) {
            return f();
        }
        if (!g()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: ".concat(String.valueOf(number)));
            }
        }
        a(new wt(number));
        return this;
    }

    public final abq a(String str) {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof wr) {
            this.d = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final abq a(boolean z) {
        a(new wt(Boolean.valueOf(z)));
        return this;
    }

    public final wo a() {
        if (this.c.isEmpty()) {
            return this.e;
        }
        StringBuilder stringBuilder = new StringBuilder("Expected one JSON element but was ");
        stringBuilder.append(this.c);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final abq b() {
        wo wmVar = new wm();
        a(wmVar);
        this.c.add(wmVar);
        return this;
    }

    public final abq b(String str) {
        if (str == null) {
            return f();
        }
        a(new wt(str));
        return this;
    }

    public final abq c() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof wm) {
            List list = this.c;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final void close() {
        if (this.c.isEmpty()) {
            this.c.add(b);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public final abq d() {
        wo wrVar = new wr();
        a(wrVar);
        this.c.add(wrVar);
        return this;
    }

    public final abq e() {
        if (this.c.isEmpty() || this.d != null) {
            throw new IllegalStateException();
        } else if (j() instanceof wr) {
            List list = this.c;
            list.remove(list.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    public final abq f() {
        a(wq.a);
        return this;
    }

    public final void flush() {
    }
}
