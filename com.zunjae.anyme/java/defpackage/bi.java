package defpackage;

import java.util.ArrayList;
import mehdi.sakout.fancybuttons.R;

public final class bi extends be {
    protected float ac = -1.0f;
    protected int ad = -1;
    protected int ae = -1;
    private az af = this.s;
    private int ag;
    private boolean ah;
    private int ai;
    private bm aj;
    private int ak;

    public bi() {
        int i = 0;
        this.ag = 0;
        this.ah = false;
        this.ai = 0;
        this.aj = new bm();
        this.ak = 8;
        this.A.clear();
        this.A.add(this.af);
        int length = this.z.length;
        while (i < length) {
            this.z[i] = this.af;
            i++;
        }
    }

    public final ArrayList<az> A() {
        return this.A;
    }

    public final void F() {
        if (this.C != null) {
            int b = ao.b(this.af);
            if (this.ag == 1) {
                f(b);
                g(0);
                i(this.C.p());
                h(0);
                return;
            }
            f(0);
            g(b);
            h(this.C.n());
            i(0);
        }
    }

    public final az a(bd bdVar) {
        switch (bj.a[bdVar.ordinal()]) {
            case tw.a /*1*/:
            case tw.b /*2*/:
                if (this.ag == 1) {
                    return this.af;
                }
                break;
            case f.c /*3*/:
            case mh.d /*4*/:
                if (this.ag == 0) {
                    return this.af;
                }
                break;
            case mh.e /*5*/:
            case mh.f /*6*/:
            case mh.g /*7*/:
            case mh.h /*8*/:
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                return null;
            default:
                break;
        }
        throw new AssertionError(bdVar.name());
    }

    public final void a(int i) {
        if (this.ag != i) {
            this.ag = i;
            this.A.clear();
            this.af = this.ag == 1 ? this.r : this.s;
            this.A.add(this.af);
            i = this.z.length;
            for (int i2 = 0; i2 < i; i2++) {
                this.z[i2] = this.af;
            }
        }
    }

    public final void a(ao aoVar) {
        bh bhVar = (bh) this.C;
        if (bhVar != null) {
            Object a = bhVar.a(bd.LEFT);
            Object a2 = bhVar.a(bd.RIGHT);
            be beVar = this.C;
            Object obj = (beVar == null || beVar.B[0] != bg.b) ? null : 1;
            if (this.ag == 0) {
                a = bhVar.a(bd.TOP);
                a2 = bhVar.a(bd.BOTTOM);
                be beVar2 = this.C;
                obj = (beVar2 == null || beVar2.B[1] != bg.b) ? null : 1;
            }
            au a3;
            if (this.ad != -1) {
                a3 = aoVar.a(this.af);
                aoVar.c(a3, aoVar.a(a), this.ad, 6);
                if (obj != null) {
                    aoVar.a(aoVar.a(a2), a3, 0, 5);
                }
            } else if (this.ae != -1) {
                a3 = aoVar.a(this.af);
                au a4 = aoVar.a(a2);
                aoVar.c(a3, a4, -this.ae, 6);
                if (obj != null) {
                    aoVar.a(a3, aoVar.a(a), 0, 5);
                    aoVar.a(a4, a3, 0, 5);
                }
            } else {
                if (this.ac != -1.0f) {
                    aoVar.a(ao.a(aoVar, aoVar.a(this.af), aoVar.a(a), aoVar.a(a2), this.ac, this.ah));
                }
            }
        }
    }

    public final boolean a() {
        return true;
    }

    public final void b(int i) {
        be beVar = this.C;
        if (beVar != null) {
            int i2;
            if (this.ag == 1) {
                this.s.a().a(beVar.s.a(), 0);
                this.u.a().a(beVar.s.a(), 0);
                if (this.ad != -1) {
                    this.r.a().a(beVar.r.a(), this.ad);
                    this.t.a().a(beVar.r.a(), this.ad);
                    return;
                } else if (this.ae != -1) {
                    this.r.a().a(beVar.t.a(), -this.ae);
                    this.t.a().a(beVar.t.a(), -this.ae);
                    return;
                } else if (this.ac != -1.0f && beVar.D() == bg.a) {
                    i2 = (int) (((float) beVar.D) * this.ac);
                    this.r.a().a(beVar.r.a(), i2);
                    this.t.a().a(beVar.r.a(), i2);
                    return;
                }
            }
            this.r.a().a(beVar.r.a(), 0);
            this.t.a().a(beVar.r.a(), 0);
            if (this.ad != -1) {
                this.s.a().a(beVar.s.a(), this.ad);
                this.u.a().a(beVar.s.a(), this.ad);
            } else if (this.ae != -1) {
                this.s.a().a(beVar.u.a(), -this.ae);
                this.u.a().a(beVar.u.a(), -this.ae);
            } else if (this.ac != -1.0f && beVar.E() == bg.a) {
                i2 = (int) (((float) beVar.E) * this.ac);
                this.s.a().a(beVar.s.a(), i2);
                this.u.a().a(beVar.s.a(), i2);
            }
        }
    }

    public final void e(float f) {
        if (f > -1.0f) {
            this.ac = f;
            this.ad = -1;
            this.ae = -1;
        }
    }

    public final void s(int i) {
        if (i >= 0) {
            this.ac = -1.0f;
            this.ad = i;
            this.ae = -1;
        }
    }

    public final void t(int i) {
        if (i >= 0) {
            this.ac = -1.0f;
            this.ad = -1;
            this.ae = i;
        }
    }
}
