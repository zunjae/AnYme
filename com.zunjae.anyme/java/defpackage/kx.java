package defpackage;

import android.graphics.Bitmap;
import java.io.OutputStream;

public final class kx implements ej<ks> {
    private final ej<Bitmap> a;
    private final ej<ka> b;
    private String c;

    public kx(ej<Bitmap> ejVar, ej<ka> ejVar2) {
        this.a = ejVar;
        this.b = ejVar2;
    }

    public final String a() {
        if (this.c == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a.a());
            stringBuilder.append(this.b.a());
            this.c = stringBuilder.toString();
        }
        return this.c;
    }

    public final /* synthetic */ boolean a(Object obj, OutputStream outputStream) {
        ks ksVar = (ks) ((ft) obj).b();
        ft b = ksVar.b();
        return b != null ? this.a.a(b, outputStream) : this.b.a(ksVar.c(), outputStream);
    }
}
