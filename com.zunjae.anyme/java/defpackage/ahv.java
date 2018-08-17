package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;

public final class ahv {
    private ahx a;
    private ahy b;
    private aic c;
    private aig d;
    private aid e;
    private aia f;
    private aif g;
    private ahz h;
    private aie i;
    private aib j;
    private int k;
    private int l;
    private int m;

    public ahv(ahq ahq) {
        Paint paint = new Paint();
        paint.setStyle(Style.FILL);
        paint.setAntiAlias(true);
        this.a = new ahx(paint, ahq);
        this.b = new ahy(paint, ahq);
        this.c = new aic(paint, ahq);
        this.d = new aig(paint, ahq);
        this.e = new aid(paint, ahq);
        this.f = new aia(paint, ahq);
        this.g = new aif(paint, ahq);
        this.h = new ahz(paint, ahq);
        this.i = new aie(paint, ahq);
        this.j = new aib(paint, ahq);
    }

    public final void a(int i, int i2, int i3) {
        this.k = i;
        this.l = i2;
        this.m = i3;
    }

    public final void a(Canvas canvas, agf agf) {
        ahy ahy = this.b;
        if (ahy != null) {
            ahy.a(canvas, agf, this.k, this.l, this.m);
        }
    }

    public final void a(Canvas canvas, boolean z) {
        if (this.b != null) {
            this.a.a(canvas, this.k, z, this.l, this.m);
        }
    }

    public final void b(Canvas canvas, agf agf) {
        aic aic = this.c;
        if (aic != null) {
            aic.a(canvas, agf, this.k, this.l, this.m);
        }
    }

    public final void c(Canvas canvas, agf agf) {
        aig aig = this.d;
        if (aig != null) {
            aig.a(canvas, agf, this.l, this.m);
        }
    }

    public final void d(Canvas canvas, agf agf) {
        aid aid = this.e;
        if (aid != null) {
            aid.a(canvas, agf, this.l, this.m);
        }
    }

    public final void e(Canvas canvas, agf agf) {
        aia aia = this.f;
        if (aia != null) {
            aia.a(canvas, agf, this.k, this.l, this.m);
        }
    }

    public final void f(Canvas canvas, agf agf) {
        aif aif = this.g;
        if (aif != null) {
            aif.a(canvas, agf, this.l, this.m);
        }
    }

    public final void g(Canvas canvas, agf agf) {
        ahz ahz = this.h;
        if (ahz != null) {
            ahz.a(canvas, agf, this.l, this.m);
        }
    }

    public final void h(Canvas canvas, agf agf) {
        aie aie = this.i;
        if (aie != null) {
            aie.a(canvas, agf, this.k, this.l, this.m);
        }
    }

    public final void i(Canvas canvas, agf agf) {
        aib aib = this.j;
        if (aib != null) {
            aib.a(canvas, agf, this.k, this.l, this.m);
        }
    }
}
