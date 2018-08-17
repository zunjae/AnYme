package defpackage;

import android.graphics.Canvas;
import android.view.MotionEvent;
import mehdi.sakout.fancybuttons.R;

public final class ahm {
    private agf a;
    private ahv b;
    private ahq c;
    private aho d;

    public ahm(ahq ahq) {
        this.c = ahq;
        this.b = new ahv(ahq);
    }

    public final void a(agf agf) {
        this.a = agf;
    }

    public final void a(aho aho) {
        this.d = aho;
    }

    public final void a(Canvas canvas) {
        int r = this.c.r();
        int i = 0;
        while (i < r) {
            int b = aih.b(this.c, i);
            int c = aih.c(this.c, i);
            boolean k = this.c.k();
            int o = this.c.o();
            int p = this.c.p();
            int i2 = (k || !(i == o || i == this.c.q())) ? 0 : 1;
            int i3 = (k && (i == o || i == p)) ? 1 : 0;
            k = i3 | i2;
            this.b.a(i, b, c);
            if (this.a != null && k) {
                switch (ahn.a[this.c.t().ordinal()]) {
                    case tw.a /*1*/:
                        this.b.a(canvas, true);
                        break;
                    case tw.b /*2*/:
                        this.b.a(canvas, this.a);
                        break;
                    case f.c /*3*/:
                        this.b.b(canvas, this.a);
                        break;
                    case mh.d /*4*/:
                        this.b.c(canvas, this.a);
                        break;
                    case mh.e /*5*/:
                        this.b.d(canvas, this.a);
                        break;
                    case mh.f /*6*/:
                        this.b.e(canvas, this.a);
                        break;
                    case mh.g /*7*/:
                        this.b.f(canvas, this.a);
                        break;
                    case mh.h /*8*/:
                        this.b.g(canvas, this.a);
                        break;
                    case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                        this.b.h(canvas, this.a);
                        break;
                    case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                        this.b.i(canvas, this.a);
                        break;
                    default:
                        break;
                }
            }
            this.b.a(canvas, k);
            i++;
        }
    }

    public final void a(MotionEvent motionEvent) {
        if (motionEvent != null) {
            if (motionEvent.getAction() == 1) {
                motionEvent.getX();
                motionEvent.getY();
                if (this.d != null) {
                    ahq ahq = this.c;
                    if (ahq != null) {
                        ahq.s();
                        ahr ahr = ahr.HORIZONTAL;
                        ahq.s();
                        ahr ahr2 = ahr.HORIZONTAL;
                    }
                }
            }
        }
    }
}
