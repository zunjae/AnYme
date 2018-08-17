package defpackage;

import android.graphics.Bitmap;
import java.io.File;
import java.io.InputStream;

public final class la implements mb<hz, ks> {
    private final ei<File, ks> a;
    private final ei<hz, ks> b;
    private final ej<ks> c;
    private final ef<hz> d;

    public la(mb<hz, Bitmap> mbVar, mb<InputStream, ka> mbVar2, ga gaVar) {
        ei kuVar = new ku(mbVar.b(), mbVar2.b(), gaVar);
        this.a = new jv(new ky(kuVar));
        this.b = kuVar;
        this.c = new kx(mbVar.d(), mbVar2.d());
        this.d = mbVar.c();
    }

    public final ei<File, ks> a() {
        return this.a;
    }

    public final ei<hz, ks> b() {
        return this.b;
    }

    public final ef<hz> c() {
        return this.d;
    }

    public final ej<ks> d() {
        return this.c;
    }
}
