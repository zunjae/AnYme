package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public final class bii {
    @Deprecated
    public static final Charset a = StandardCharsets.ISO_8859_1;
    @Deprecated
    public static final Charset b = StandardCharsets.US_ASCII;
    @Deprecated
    public static final Charset c = StandardCharsets.UTF_16;
    @Deprecated
    public static final Charset d = StandardCharsets.UTF_16BE;
    @Deprecated
    public static final Charset e = StandardCharsets.UTF_16LE;
    @Deprecated
    public static final Charset f = StandardCharsets.UTF_8;

    public static Charset a(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
