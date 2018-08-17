package defpackage;

import android.graphics.Bitmap;

public class ks {
    private final ft<ka> a;
    private final ft<Bitmap> b;

    public ks(ft<Bitmap> ftVar, ft<ka> ftVar2) {
        if (ftVar != null) {
            if (ftVar2 != null) {
                throw new IllegalArgumentException("Can only contain either a bitmap resource or a gif resource, not both");
            }
        }
        if (ftVar == null) {
            if (ftVar2 == null) {
                throw new IllegalArgumentException("Must contain either a bitmap resource or a gif resource");
            }
        }
        this.b = ftVar;
        this.a = ftVar2;
    }

    public final int a() {
        ft ftVar = this.b;
        return ftVar != null ? ftVar.c() : this.a.c();
    }

    public final ft<Bitmap> b() {
        return this.b;
    }

    public final ft<ka> c() {
        return this.a;
    }
}
