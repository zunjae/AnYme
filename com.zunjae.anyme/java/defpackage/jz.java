package defpackage;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;

final class jz implements dx {
    private final ga a;

    public jz(ga gaVar) {
        this.a = gaVar;
    }

    public final Bitmap a(int i, int i2, Config config) {
        return this.a.b(i, i2, config);
    }

    public final void a(Bitmap bitmap) {
        if (!this.a.a(bitmap)) {
            bitmap.recycle();
        }
    }
}
