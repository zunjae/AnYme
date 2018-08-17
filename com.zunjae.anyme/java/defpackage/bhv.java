package defpackage;

import javax.annotation.Nullable;

final class bhv {
    final byte[] a;
    int b;
    int c;
    boolean d;
    boolean e;
    bhv f;
    bhv g;

    bhv() {
        this.a = new byte[8192];
        this.e = true;
        this.d = false;
    }

    bhv(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2;
        this.d = true;
        this.e = false;
    }

    final bhv a() {
        this.d = true;
        return new bhv(this.a, this.b, this.c);
    }

    public final bhv a(bhv bhv) {
        bhv.g = this;
        bhv.f = this.f;
        this.f.g = bhv;
        this.f = bhv;
        return bhv;
    }

    public final void a(bhv bhv, int i) {
        if (bhv.e) {
            int i2 = bhv.c;
            if (i2 + i > 8192) {
                if (bhv.d) {
                    throw new IllegalArgumentException();
                }
                int i3 = i2 + i;
                int i4 = bhv.b;
                if (i3 - i4 <= 8192) {
                    Object obj = bhv.a;
                    System.arraycopy(obj, i4, obj, 0, i2 - i4);
                    bhv.c -= bhv.b;
                    bhv.b = 0;
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.a, this.b, bhv.a, bhv.c, i);
            bhv.c += i;
            this.b += i;
            return;
        }
        throw new IllegalArgumentException();
    }

    @Nullable
    public final bhv b() {
        bhv bhv = this.f;
        if (bhv == this) {
            bhv = null;
        }
        bhv bhv2 = this.g;
        bhv2.f = this.f;
        this.f.g = bhv2;
        this.f = null;
        this.g = null;
        return bhv;
    }
}
