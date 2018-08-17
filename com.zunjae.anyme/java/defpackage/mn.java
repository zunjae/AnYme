package defpackage;

import android.graphics.drawable.Drawable;

public final class mn<T extends Drawable> implements ms<T> {
    private final mx<T> a;
    private final int b;
    private mp<T> c;
    private mp<T> d;

    public mn() {
        this((byte) 0);
    }

    private mn(byte b) {
        this(new mx(new mo()));
    }

    private mn(mx<T> mxVar) {
        this.a = mxVar;
        this.b = 300;
    }

    public final mq<T> a(boolean z, boolean z2) {
        if (z) {
            return mt.b();
        }
        if (z2) {
            if (this.c == null) {
                this.c = new mp(this.a.a(false, true), this.b);
            }
            return this.c;
        }
        if (this.d == null) {
            this.d = new mp(this.a.a(false, false), this.b);
        }
        return this.d;
    }
}
