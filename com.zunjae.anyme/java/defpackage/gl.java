package defpackage;

import android.graphics.Bitmap.Config;

final class gl implements gi {
    private final gm a;
    private int b;
    private Config c;

    public gl(gm gmVar) {
        this.a = gmVar;
    }

    public final void a() {
        this.a.a(this);
    }

    public final void a(int i, Config config) {
        this.b = i;
        this.c = config;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
        r3 = this;
        r0 = r4 instanceof defpackage.gl;
        r1 = 0;
        if (r0 == 0) goto L_0x0020;
    L_0x0005:
        r4 = (defpackage.gl) r4;
        r0 = r3.b;
        r2 = r4.b;
        if (r0 != r2) goto L_0x0020;
    L_0x000d:
        r0 = r3.c;
        if (r0 != 0) goto L_0x0016;
    L_0x0011:
        r4 = r4.c;
        if (r4 != 0) goto L_0x0020;
    L_0x0015:
        goto L_0x001e;
    L_0x0016:
        r4 = r4.c;
        r4 = r0.equals(r4);
        if (r4 == 0) goto L_0x0020;
    L_0x001e:
        r4 = 1;
        return r4;
    L_0x0020:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: gl.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = this.b * 31;
        Config config = this.c;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return gj.b(this.b, this.c);
    }
}
