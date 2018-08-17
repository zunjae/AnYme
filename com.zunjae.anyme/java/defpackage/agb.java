package defpackage;

import mehdi.sakout.fancybuttons.R;

public final class agb {
    private agd a;
    private age b;
    private agp c;
    private ahq d;
    private float e;
    private boolean f;

    public agb(ahq ahq, age age) {
        this.a = new agd(age);
        this.b = age;
        this.d = ahq;
    }

    private void c() {
        switch (agc.a[this.d.t().ordinal()]) {
            case tw.a /*1*/:
                this.b.a(null);
                break;
            case tw.b /*2*/:
                d();
                return;
            case f.c /*3*/:
                e();
                return;
            case mh.d /*4*/:
                f();
                return;
            case mh.e /*5*/:
                h();
                return;
            case mh.f /*6*/:
                g();
                return;
            case mh.g /*7*/:
                i();
                return;
            case mh.h /*8*/:
                j();
                return;
            case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                k();
                return;
            case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                l();
                break;
            default:
                break;
        }
    }

    private void d() {
        int j = this.d.j();
        int i = this.d.i();
        agp a = this.a.a().a(i, j).a(this.d.n());
        if (this.f) {
            a.a(this.e);
        } else {
            a.b();
        }
        this.c = a;
    }

    private void e() {
        int j = this.d.j();
        int i = this.d.i();
        int a = this.d.a();
        float h = this.d.h();
        agp a2 = this.a.b().a(i, j, a, h).a(this.d.n());
        if (this.f) {
            a2.a(this.e);
        } else {
            a2.b();
        }
        this.c = a2;
    }

    private void f() {
        int o = this.d.k() ? this.d.o() : this.d.q();
        int p = this.d.k() ? this.d.p() : this.d.o();
        agp b = this.a.c().a(aih.a(this.d, o), aih.a(this.d, p), this.d.a(), p > o).b(this.d.n());
        if (this.f) {
            b.a(this.e);
        } else {
            b.b();
        }
        this.c = b;
    }

    private void g() {
        agp a = this.a.d().a(aih.a(this.d, this.d.k() ? this.d.o() : this.d.q()), aih.a(this.d, this.d.k() ? this.d.p() : this.d.o())).a(this.d.n());
        if (this.f) {
            a.a(this.e);
        } else {
            a.b();
        }
        this.c = a;
    }

    private void h() {
        int j = this.d.j();
        int i = this.d.i();
        int a = this.d.a();
        int g = this.d.g();
        agp a2 = this.a.e().a(i, j, a, g).a(this.d.n());
        if (this.f) {
            a2.a(this.e);
        } else {
            a2.b();
        }
        this.c = a2;
    }

    private void i() {
        int o = this.d.k() ? this.d.o() : this.d.q();
        int p = this.d.k() ? this.d.p() : this.d.o();
        agp b = this.a.f().a(aih.a(this.d, o), aih.a(this.d, p), this.d.a(), p > o).b(this.d.n());
        if (this.f) {
            b.a(this.e);
        } else {
            b.b();
        }
        this.c = b;
    }

    private void j() {
        int o = this.d.k() ? this.d.o() : this.d.q();
        int p = this.d.k() ? this.d.p() : this.d.o();
        int a = aih.a(this.d, o);
        int a2 = aih.a(this.d, p);
        o = this.d.d();
        p = this.d.c();
        if (this.d.s() != ahr.HORIZONTAL) {
            o = p;
        }
        int a3 = this.d.a();
        agp a4 = this.a.g().b(this.d.n()).a(a, a2, (a3 * 3) + o, a3 + o, a3);
        if (this.f) {
            a4.a(this.e);
        } else {
            a4.b();
        }
        this.c = a4;
    }

    private void k() {
        agp a = this.a.h().a(aih.a(this.d, this.d.k() ? this.d.o() : this.d.q()), aih.a(this.d, this.d.k() ? this.d.p() : this.d.o())).a(this.d.n());
        if (this.f) {
            a.a(this.e);
        } else {
            a.b();
        }
        this.c = a;
    }

    private void l() {
        int j = this.d.j();
        int i = this.d.i();
        int a = this.d.a();
        float h = this.d.h();
        agp a2 = this.a.i().a(i, j, a, h).a(this.d.n());
        if (this.f) {
            a2.a(this.e);
        } else {
            a2.b();
        }
        this.c = a2;
    }

    public final void a() {
        this.f = false;
        this.e = 0.0f;
        c();
    }

    public final void a(float f) {
        this.f = true;
        this.e = f;
        c();
    }

    public final void b() {
        agp agp = this.c;
        if (agp != null) {
            agp.c();
        }
    }
}
