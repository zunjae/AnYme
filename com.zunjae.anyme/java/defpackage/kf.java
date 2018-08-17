package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

final class kf {
    private final kh a;
    private final dw b;
    private final Handler c;
    private boolean d;
    private boolean e;
    private db<dw, dw, Bitmap, Bitmap> f;
    private kg g;
    private boolean h;

    public kf(Context context, kh khVar, dw dwVar, int i, int i2) {
        ei kmVar = new km(de.a(context).a());
        ii kkVar = new kk();
        this(khVar, dwVar, de.b(context).a(kkVar, dw.class).a((Object) dwVar).a(Bitmap.class).a(jn.b()).a(kmVar).a(true).b(fa.NONE).b(i, i2));
    }

    private kf(kh khVar, dw dwVar, db<dw, dw, Bitmap, Bitmap> dbVar) {
        this.d = false;
        this.e = false;
        Handler handler = new Handler(Looper.getMainLooper(), new ki());
        this.a = khVar;
        this.b = dwVar;
        this.c = handler;
        this.f = dbVar;
    }

    private void e() {
        if (!this.d) {
            return;
        }
        if (!this.e) {
            this.e = true;
            this.b.a();
            this.f.b(new kj()).a(new kg(this.c, this.b.d(), SystemClock.uptimeMillis() + ((long) this.b.b())));
        }
    }

    public final void a() {
        if (!this.d) {
            this.d = true;
            this.h = false;
            e();
        }
    }

    public final void a(ek<Bitmap> ekVar) {
        if (ekVar != null) {
            this.f = this.f.a(ekVar);
            return;
        }
        throw new NullPointerException("Transformation must not be null");
    }

    final void a(kg kgVar) {
        if (this.h) {
            this.c.obtainMessage(2, kgVar).sendToTarget();
            return;
        }
        kg kgVar2 = this.g;
        this.g = kgVar;
        this.a.b(kgVar.b);
        if (kgVar2 != null) {
            this.c.obtainMessage(2, kgVar2).sendToTarget();
        }
        this.e = false;
        e();
    }

    public final void b() {
        this.d = false;
    }

    public final void c() {
        this.d = false;
        ni niVar = this.g;
        if (niVar != null) {
            de.a(niVar);
            this.g = null;
        }
        this.h = true;
    }

    public final Bitmap d() {
        kg kgVar = this.g;
        return kgVar != null ? kgVar.a() : null;
    }
}
