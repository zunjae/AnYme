package defpackage;

import android.graphics.Bitmap;

public final class kz implements ek<ks> {
    private final ek<Bitmap> a;
    private final ek<ka> b;

    private kz(ek<Bitmap> ekVar, ek<ka> ekVar2) {
        this.a = ekVar;
        this.b = ekVar2;
    }

    public kz(ga gaVar, ek<Bitmap> ekVar) {
        this((ek) ekVar, new ke(ekVar, gaVar));
    }

    public final ft<ks> a(ft<ks> ftVar, int i, int i2) {
        ft a;
        ft b = ((ks) ftVar.b()).b();
        ft c = ((ks) ftVar.b()).c();
        if (b != null) {
            ek ekVar = this.a;
            if (ekVar != null) {
                a = ekVar.a(b, i, i2);
                if (!b.equals(a)) {
                    return new kt(new ks(a, ((ks) ftVar.b()).c()));
                }
                return ftVar;
            }
        }
        if (c != null) {
            ek ekVar2 = this.b;
            if (ekVar2 != null) {
                a = ekVar2.a(c, i, i2);
                if (!c.equals(a)) {
                    ftVar = new kt(new ks(((ks) ftVar.b()).b(), a));
                }
            }
        }
        return ftVar;
    }

    public final String a() {
        return this.a.a();
    }
}
