package defpackage;

import android.content.Context;
import android.os.Build.VERSION;
import java.util.concurrent.ExecutorService;

public final class dg {
    private final Context a;
    private fb b;
    private ga c;
    private ha d;
    private ExecutorService e;
    private ExecutorService f;
    private ee g;
    private go h;

    public dg(Context context) {
        this.a = context.getApplicationContext();
    }

    final de a() {
        if (this.e == null) {
            this.e = new hg(Math.max(1, Runtime.getRuntime().availableProcessors()));
        }
        if (this.f == null) {
            this.f = new hg(1);
        }
        hc hcVar = new hc(this.a);
        if (this.c == null) {
            if (VERSION.SDK_INT >= 11) {
                this.c = new ge(hcVar.b());
            } else {
                this.c = new gb();
            }
        }
        if (this.d == null) {
            this.d = new gz(hcVar.a());
        }
        if (this.h == null) {
            this.h = new gx(this.a);
        }
        if (this.b == null) {
            this.b = new fb(this.d, this.h, this.f, this.e);
        }
        if (this.g == null) {
            this.g = ee.DEFAULT;
        }
        return new de(this.b, this.d, this.c, this.a, this.g);
    }
}
