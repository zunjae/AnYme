package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;

final class kb extends ConstantState {
    dz a;
    byte[] b;
    Context c;
    ek<Bitmap> d;
    int e;
    int f;
    dx g;
    ga h;
    Bitmap i;

    public kb(dz dzVar, byte[] bArr, Context context, ek<Bitmap> ekVar, int i, int i2, dx dxVar, ga gaVar, Bitmap bitmap) {
        if (bitmap != null) {
            this.a = dzVar;
            this.b = bArr;
            this.h = gaVar;
            this.i = bitmap;
            this.c = context.getApplicationContext();
            this.d = ekVar;
            this.e = i;
            this.f = i2;
            this.g = dxVar;
            return;
        }
        throw new NullPointerException("The first frame of the GIF must not be null");
    }

    public final int getChangingConfigurations() {
        return 0;
    }

    public final Drawable newDrawable() {
        return new ka(this);
    }

    public final Drawable newDrawable(Resources resources) {
        return newDrawable();
    }
}
