package defpackage;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

public final class azj extends BufferedOutputStream {
    private final CharsetEncoder a;

    public azj(OutputStream outputStream, String str, int i) {
        super(outputStream, i);
        this.a = Charset.forName(azc.c(str)).newEncoder();
    }

    public final azj a(String str) {
        ByteBuffer encode = this.a.encode(CharBuffer.wrap(str));
        super.write(encode.array(), 0, encode.limit());
        return this;
    }
}
