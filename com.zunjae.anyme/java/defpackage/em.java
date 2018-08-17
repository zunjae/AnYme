package defpackage;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public final class em implements en<InputStream> {
    private final byte[] a;
    private final String b;

    public em(byte[] bArr, String str) {
        this.a = bArr;
        this.b = str;
    }

    public final /* synthetic */ Object a(int i) {
        return new ByteArrayInputStream(this.a);
    }

    public final void a() {
    }

    public final String b() {
        return this.b;
    }

    public final void c() {
    }
}
