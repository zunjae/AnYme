package defpackage;

import android.graphics.Bitmap.Config;

final class fx implements gi {
    private final fy a;
    private int b;
    private int c;
    private Config d;

    public fx(fy fyVar) {
        this.a = fyVar;
    }

    public final void a() {
        this.a.a(this);
    }

    public final void a(int i, int i2, Config config) {
        this.b = i;
        this.c = i2;
        this.d = config;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fx) {
            fx fxVar = (fx) obj;
            if (this.b == fxVar.b && this.c == fxVar.c && this.d == fxVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = ((this.b * 31) + this.c) * 31;
        Config config = this.d;
        return i + (config != null ? config.hashCode() : 0);
    }

    public final String toString() {
        return fw.d(this.b, this.c, this.d);
    }
}
