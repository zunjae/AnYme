package defpackage;

import java.io.Closeable;
import java.io.Reader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

public abstract class bcu implements Closeable {
    private Reader a;

    public static bcu a(@Nullable bcd bcd, long j, bhh bhh) {
        if (bhh != null) {
            return new bcv(bcd, j, bhh);
        }
        throw new NullPointerException("source == null");
    }

    public static bcu a(byte[] bArr) {
        return bcu.a(null, (long) bArr.length, new bhd().b(bArr));
    }

    private Charset f() {
        bcd a = a();
        return a != null ? a.a(bdb.e) : bdb.e;
    }

    @Nullable
    public abstract bcd a();

    public abstract long b();

    public abstract bhh c();

    public void close() {
        bdb.a(c());
    }

    public final Reader d() {
        Reader reader = this.a;
        if (reader != null) {
            return reader;
        }
        reader = new bcw(c(), f());
        this.a = reader;
        return reader;
    }

    public final String e() {
        Closeable c = c();
        try {
            String a = c.a(bdb.a((bhh) c, f()));
            return a;
        } finally {
            bdb.a(c);
        }
    }
}
