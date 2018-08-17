package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

final class dt implements Closeable {
    private final InputStream a;
    private final Charset b;
    private byte[] c;
    private int d;
    private int e;

    public dt(InputStream inputStream, Charset charset) {
        this(inputStream, charset, (byte) 0);
    }

    private dt(InputStream inputStream, Charset charset, byte b) {
        if (inputStream == null || charset == null) {
            throw new NullPointerException();
        } else if (charset.equals(dv.a)) {
            this.a = inputStream;
            this.b = charset;
            this.c = new byte[8192];
        } else {
            throw new IllegalArgumentException("Unsupported encoding");
        }
    }

    private void c() {
        InputStream inputStream = this.a;
        byte[] bArr = this.c;
        int read = inputStream.read(bArr, 0, bArr.length);
        if (read != -1) {
            this.d = 0;
            this.e = read;
            return;
        }
        throw new EOFException();
    }

    public final String a() {
        synchronized (this.a) {
            if (this.c != null) {
                int i;
                if (this.d >= this.e) {
                    c();
                }
                for (int i2 = this.d; i2 != this.e; i2++) {
                    if (this.c[i2] == (byte) 10) {
                        int i3;
                        String str;
                        if (i2 != this.d) {
                            i3 = i2 - 1;
                            if (this.c[i3] == (byte) 13) {
                                str = new String(this.c, this.d, i3 - this.d, this.b.name());
                                this.d = i2 + 1;
                                return str;
                            }
                        }
                        i3 = i2;
                        str = new String(this.c, this.d, i3 - this.d, this.b.name());
                        this.d = i2 + 1;
                        return str;
                    }
                }
                ByteArrayOutputStream duVar = new du(this, (this.e - this.d) + 80);
                loop1:
                while (true) {
                    duVar.write(this.c, this.d, this.e - this.d);
                    this.e = -1;
                    c();
                    i = this.d;
                    while (i != this.e) {
                        if (this.c[i] == (byte) 10) {
                            break loop1;
                        }
                        i++;
                    }
                }
                if (i != this.d) {
                    duVar.write(this.c, this.d, i - this.d);
                }
                this.d = i + 1;
                String byteArrayOutputStream = duVar.toString();
                return byteArrayOutputStream;
            }
            throw new IOException("LineReader is closed");
        }
    }

    public final boolean b() {
        return this.e == -1;
    }

    public final void close() {
        synchronized (this.a) {
            if (this.c != null) {
                this.c = null;
                this.a.close();
            }
        }
    }
}
