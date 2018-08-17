package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;

public class abq implements Closeable, Flushable {
    private static final String[] a = new String[128];
    private static final String[] b;
    private final Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private String f;
    private String g;
    private boolean h;
    private boolean i;
    private String j;
    private boolean k;

    static {
        for (int i = 0; i <= 31; i++) {
            a[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        Object obj = a;
        obj[34] = "\\\"";
        obj[92] = "\\\\";
        obj[9] = "\\t";
        obj[8] = "\\b";
        obj[10] = "\\n";
        obj[13] = "\\r";
        obj[12] = "\\f";
        String[] strArr = (String[]) obj.clone();
        b = strArr;
        strArr[60] = "\\u003c";
        strArr = b;
        strArr[62] = "\\u003e";
        strArr[38] = "\\u0026";
        strArr[61] = "\\u003d";
        strArr[39] = "\\u0027";
    }

    public abq(Writer writer) {
        a(6);
        this.g = ":";
        this.k = true;
        if (writer != null) {
            this.c = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private int a() {
        int i = this.e;
        if (i != 0) {
            return this.d[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private abq a(int i, int i2, String str) {
        int a = a();
        if (a != i2) {
            if (a != i) {
                throw new IllegalStateException("Nesting problem.");
            }
        }
        if (this.j == null) {
            this.e--;
            if (a == i2) {
                k();
            }
            this.c.write(str);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder("Dangling name: ");
        stringBuilder.append(this.j);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private abq a(int i, String str) {
        m();
        a(i);
        this.c.write(str);
        return this;
    }

    private void a(int i) {
        int i2 = this.e;
        Object obj = this.d;
        if (i2 == obj.length) {
            Object obj2 = new int[(i2 * 2)];
            System.arraycopy(obj, 0, obj2, 0, i2);
            this.d = obj2;
        }
        int[] iArr = this.d;
        int i3 = this.e;
        this.e = i3 + 1;
        iArr[i3] = i;
    }

    private void b(int i) {
        this.d[this.e - 1] = i;
    }

    private void d(String str) {
        String[] strArr = this.i ? b : a;
        this.c.write("\"");
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            String str2;
            char charAt = str.charAt(i2);
            if (charAt < '\u0080') {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == '\u2028') {
                str2 = "\\u2028";
            } else if (charAt == '\u2029') {
                str2 = "\\u2029";
            } else {
            }
            if (i < i2) {
                this.c.write(str, i, i2 - i);
            }
            this.c.write(str2);
            i = i2 + 1;
        }
        if (i < length) {
            this.c.write(str, i, length - i);
        }
        this.c.write("\"");
    }

    private void j() {
        if (this.j != null) {
            l();
            d(this.j);
            this.j = null;
        }
    }

    private void k() {
        if (this.f != null) {
            this.c.write("\n");
            int i = this.e;
            for (int i2 = 1; i2 < i; i2++) {
                this.c.write(this.f);
            }
        }
    }

    private void l() {
        int a = a();
        if (a == 5) {
            this.c.write(44);
        } else if (a != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        k();
        b(4);
    }

    private void m() {
        switch (a()) {
            case tw.a /*1*/:
                b(2);
                k();
                return;
            case tw.b /*2*/:
                this.c.append(',');
                k();
                return;
            case mh.d /*4*/:
                this.c.append(this.g);
                b(5);
                return;
            case mh.f /*6*/:
                break;
            case mh.g /*7*/:
                if (this.h) {
                    break;
                }
                throw new IllegalStateException("JSON must have only one top-level value.");
            default:
                throw new IllegalStateException("Nesting problem.");
        }
        b(7);
    }

    public abq a(long j) {
        j();
        m();
        this.c.write(Long.toString(j));
        return this;
    }

    public abq a(Boolean bool) {
        if (bool == null) {
            return f();
        }
        j();
        m();
        this.c.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public abq a(Number number) {
        if (number == null) {
            return f();
        }
        j();
        CharSequence obj = number.toString();
        if (!this.h) {
            if (obj.equals("-Infinity") || obj.equals("Infinity") || obj.equals("NaN")) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(String.valueOf(number)));
            }
        }
        m();
        this.c.append(obj);
        return this;
    }

    public abq a(String str) {
        if (str == null) {
            throw new NullPointerException("name == null");
        } else if (this.j != null) {
            throw new IllegalStateException();
        } else if (this.e != 0) {
            this.j = str;
            return this;
        } else {
            throw new IllegalStateException("JsonWriter is closed.");
        }
    }

    public abq a(boolean z) {
        j();
        m();
        this.c.write(z ? "true" : "false");
        return this;
    }

    public abq b() {
        j();
        return a(1, "[");
    }

    public abq b(String str) {
        if (str == null) {
            return f();
        }
        j();
        m();
        d(str);
        return this;
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public abq c() {
        return a(1, 2, "]");
    }

    public final void c(String str) {
        if (str.length() == 0) {
            this.f = null;
            str = ":";
        } else {
            this.f = str;
            str = ": ";
        }
        this.g = str;
    }

    public final void c(boolean z) {
        this.i = z;
    }

    public void close() {
        this.c.close();
        int i = this.e;
        if (i > 1 || (i == 1 && this.d[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.e = 0;
    }

    public abq d() {
        j();
        return a(3, "{");
    }

    public final void d(boolean z) {
        this.k = z;
    }

    public abq e() {
        return a(3, 5, "}");
    }

    public abq f() {
        if (this.j != null) {
            if (this.k) {
                j();
            } else {
                this.j = null;
                return this;
            }
        }
        m();
        this.c.write("null");
        return this;
    }

    public void flush() {
        if (this.e != 0) {
            this.c.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public final boolean g() {
        return this.h;
    }

    public final boolean h() {
        return this.i;
    }

    public final boolean i() {
        return this.k;
    }
}
