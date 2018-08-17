package defpackage;

import android.content.Context;

final class oy {
    private final Context a;
    private final pa b;
    private ox c;

    public oy(Context context) {
        this(context, new pa());
    }

    private oy(Context context, pa paVar) {
        this.a = context;
        this.b = paVar;
    }

    public final void a(pm pmVar) {
        if (this.c == null) {
            this.c = oo.a(this.a);
        }
        ox oxVar = this.c;
        if (oxVar == null) {
            avf.c();
            return;
        }
        oz a = pa.a(pmVar);
        if (a == null) {
            avf.c();
            new StringBuilder("Fabric event was not mappable to Firebase event: ").append(pmVar);
            return;
        }
        oxVar.a(a.a(), a.b());
        if ("levelEnd".equals(pmVar.g)) {
            oxVar.a("post_score", a.b());
        }
    }
}
