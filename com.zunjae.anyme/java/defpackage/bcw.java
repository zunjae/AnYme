package defpackage;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

final class bcw extends Reader {
    private final bhh a;
    private final Charset b;
    private boolean c;
    private Reader d;

    bcw(bhh bhh, Charset charset) {
        this.a = bhh;
        this.b = charset;
    }

    public final void close() {
        this.c = true;
        Reader reader = this.d;
        if (reader != null) {
            reader.close();
        } else {
            this.a.close();
        }
    }

    public final int read(char[] cArr, int i, int i2) {
        if (this.c) {
            throw new IOException("Stream closed");
        }
        Reader reader = this.d;
        if (reader == null) {
            Reader inputStreamReader = new InputStreamReader(this.a.f(), bdb.a(this.a, this.b));
            this.d = inputStreamReader;
            reader = inputStreamReader;
        }
        return reader.read(cArr, i, i2);
    }
}
