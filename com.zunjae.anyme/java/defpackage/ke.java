package defpackage;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.c;

public final class ke implements ek<ka> {
    private final ek<Bitmap> a;
    private final ga b;

    public ke(ek<Bitmap> ekVar, ga gaVar) {
        this.a = ekVar;
        this.b = gaVar;
    }

    public final ft<ka> a(ft<ka> ftVar, int i, int i2) {
        ka kaVar = (ka) ftVar.b();
        Bitmap b = ((ka) ftVar.b()).b();
        Bitmap bitmap = (Bitmap) this.a.a(new c(b, this.b), i, i2).b();
        return !bitmap.equals(b) ? new kd(new ka(kaVar, bitmap, this.a)) : ftVar;
    }

    public final String a() {
        return this.a.a();
    }
}
