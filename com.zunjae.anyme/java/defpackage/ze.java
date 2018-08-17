package defpackage;

import java.io.Reader;
import java.util.Iterator;
import java.util.Map.Entry;

public final class ze extends abn {
    private static final Reader b = new zf();
    private static final Object c = new Object();
    private Object[] d;
    private int e;
    private String[] f;
    private int[] g;

    private void a(abp abp) {
        if (f() != abp) {
            StringBuilder stringBuilder = new StringBuilder("Expected ");
            stringBuilder.append(abp);
            stringBuilder.append(" but was ");
            stringBuilder.append(f());
            stringBuilder.append(v());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    private void a(Object obj) {
        int i = this.e;
        Object obj2 = this.d;
        if (i == obj2.length) {
            Object obj3 = new Object[(i * 2)];
            Object obj4 = new int[(i * 2)];
            Object obj5 = new String[(i * 2)];
            System.arraycopy(obj2, 0, obj3, 0, i);
            System.arraycopy(this.g, 0, obj4, 0, this.e);
            System.arraycopy(this.f, 0, obj5, 0, this.e);
            this.d = obj3;
            this.g = obj4;
            this.f = obj5;
        }
        Object[] objArr = this.d;
        int i2 = this.e;
        this.e = i2 + 1;
        objArr[i2] = obj;
    }

    private Object t() {
        return this.d[this.e - 1];
    }

    private Object u() {
        Object[] objArr = this.d;
        int i = this.e - 1;
        this.e = i;
        Object obj = objArr[i];
        objArr[this.e] = null;
        return obj;
    }

    private String v() {
        StringBuilder stringBuilder = new StringBuilder(" at path ");
        stringBuilder.append(p());
        return stringBuilder.toString();
    }

    public final void a() {
        a(abp.BEGIN_ARRAY);
        a(((wm) t()).iterator());
        this.g[this.e - 1] = 0;
    }

    public final void b() {
        a(abp.END_ARRAY);
        u();
        u();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final void c() {
        a(abp.BEGIN_OBJECT);
        a(((wr) t()).h().iterator());
    }

    public final void close() {
        this.d = new Object[]{c};
        this.e = 1;
    }

    public final void d() {
        a(abp.END_OBJECT);
        u();
        u();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final boolean e() {
        abp f = f();
        return (f == abp.END_OBJECT || f == abp.END_ARRAY) ? false : true;
    }

    public final abp f() {
        while (this.e != 0) {
            Object t = t();
            if (t instanceof Iterator) {
                boolean z = this.d[this.e - 2] instanceof wr;
                Iterator it = (Iterator) t;
                if (!it.hasNext()) {
                    return z ? abp.END_OBJECT : abp.END_ARRAY;
                } else {
                    if (z) {
                        return abp.NAME;
                    }
                    a(it.next());
                }
            } else if (t instanceof wr) {
                return abp.BEGIN_OBJECT;
            } else {
                if (t instanceof wm) {
                    return abp.BEGIN_ARRAY;
                }
                if (t instanceof wt) {
                    wt wtVar = (wt) t;
                    if (wtVar.j()) {
                        return abp.STRING;
                    }
                    if (wtVar.h()) {
                        return abp.BOOLEAN;
                    }
                    if (wtVar.i()) {
                        return abp.NUMBER;
                    }
                    throw new AssertionError();
                } else if (t instanceof wq) {
                    return abp.NULL;
                } else {
                    if (t == c) {
                        throw new IllegalStateException("JsonReader is closed");
                    }
                    throw new AssertionError();
                }
            }
        }
        return abp.END_DOCUMENT;
    }

    public final String g() {
        a(abp.NAME);
        Entry entry = (Entry) ((Iterator) t()).next();
        String str = (String) entry.getKey();
        this.f[this.e - 1] = str;
        a(entry.getValue());
        return str;
    }

    public final String h() {
        abp f = f();
        if (f != abp.STRING) {
            if (f != abp.NUMBER) {
                StringBuilder stringBuilder = new StringBuilder("Expected ");
                stringBuilder.append(abp.STRING);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        String b = ((wt) u()).b();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
        return b;
    }

    public final boolean i() {
        a(abp.BOOLEAN);
        boolean f = ((wt) u()).f();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
        return f;
    }

    public final void j() {
        a(abp.NULL);
        u();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final double k() {
        abp f = f();
        if (f != abp.NUMBER) {
            if (f != abp.STRING) {
                StringBuilder stringBuilder = new StringBuilder("Expected ");
                stringBuilder.append(abp.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        double c = ((wt) t()).c();
        if (!q()) {
            if (Double.isNaN(c) || Double.isInfinite(c)) {
                throw new NumberFormatException("JSON forbids NaN and infinities: ".concat(String.valueOf(c)));
            }
        }
        u();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
        return c;
    }

    public final long l() {
        abp f = f();
        if (f != abp.NUMBER) {
            if (f != abp.STRING) {
                StringBuilder stringBuilder = new StringBuilder("Expected ");
                stringBuilder.append(abp.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        long d = ((wt) t()).d();
        u();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
        return d;
    }

    public final int m() {
        abp f = f();
        if (f != abp.NUMBER) {
            if (f != abp.STRING) {
                StringBuilder stringBuilder = new StringBuilder("Expected ");
                stringBuilder.append(abp.NUMBER);
                stringBuilder.append(" but was ");
                stringBuilder.append(f);
                stringBuilder.append(v());
                throw new IllegalStateException(stringBuilder.toString());
            }
        }
        int e = ((wt) t()).e();
        u();
        int i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
        return e;
    }

    public final void n() {
        int i;
        if (f() == abp.NAME) {
            g();
            this.f[this.e - 2] = "null";
        } else {
            u();
            i = this.e;
            if (i > 0) {
                this.f[i - 1] = "null";
            }
        }
        i = this.e;
        if (i > 0) {
            int[] iArr = this.g;
            i--;
            iArr[i] = iArr[i] + 1;
        }
    }

    public final void o() {
        a(abp.NAME);
        Entry entry = (Entry) ((Iterator) t()).next();
        a(entry.getValue());
        a(new wt((String) entry.getKey()));
    }

    public final String p() {
        StringBuilder stringBuilder = new StringBuilder("$");
        int i = 0;
        while (i < this.e) {
            Object[] objArr = this.d;
            if (objArr[i] instanceof wm) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.g[i]);
                    stringBuilder.append(']');
                }
            } else if (objArr[i] instanceof wr) {
                i++;
                if (objArr[i] instanceof Iterator) {
                    stringBuilder.append('.');
                    String[] strArr = this.f;
                    if (strArr[i] != null) {
                        stringBuilder.append(strArr[i]);
                    }
                }
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public final String toString() {
        return getClass().getSimpleName();
    }
}
