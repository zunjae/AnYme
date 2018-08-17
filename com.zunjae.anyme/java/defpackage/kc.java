package defpackage;

import android.content.Context;
import java.io.File;
import java.io.InputStream;

public final class kc implements mb<InputStream, ka> {
    private final kn a;
    private final kq b;
    private final il c;
    private final jv<ka> d = new jv(this.a);

    public kc(Context context, ga gaVar) {
        this.a = new kn(context, gaVar);
        this.b = new kq(gaVar);
        this.c = new il();
    }

    public final ei<File, ka> a() {
        return this.d;
    }

    public final ei<InputStream, ka> b() {
        return this.a;
    }

    public final ef<InputStream> c() {
        return this.c;
    }

    public final ej<ka> d() {
        return this.b;
    }
}
