package defpackage;

public final class mm implements mi, mj {
    private mi a;
    private mi b;
    private mj c;

    public mm() {
        this(null);
    }

    public mm(mj mjVar) {
        this.c = mjVar;
    }

    private boolean j() {
        mj mjVar = this.c;
        return mjVar != null && mjVar.i();
    }

    public final void a() {
        this.a.a();
        this.b.a();
    }

    public final void a(mi miVar, mi miVar2) {
        this.a = miVar;
        this.b = miVar2;
    }

    public final boolean a(mi miVar) {
        Object obj;
        mj mjVar = this.c;
        if (mjVar != null) {
            if (!mjVar.a(this)) {
                obj = null;
                return obj == null && (miVar.equals(this.a) || !this.a.g());
            }
        }
        obj = 1;
        if (obj == null) {
        }
    }

    public final void b() {
        if (!this.b.e()) {
            this.b.b();
        }
        if (!this.a.e()) {
            this.a.b();
        }
    }

    public final boolean b(mi miVar) {
        Object obj;
        mj mjVar = this.c;
        if (mjVar != null) {
            if (!mjVar.b(this)) {
                obj = null;
                return obj == null && miVar.equals(this.a) && !i();
            }
        }
        obj = 1;
        if (obj == null) {
        }
    }

    public final void c() {
        this.b.c();
        this.a.c();
    }

    public final void c(mi miVar) {
        if (!miVar.equals(this.b)) {
            mj mjVar = this.c;
            if (mjVar != null) {
                mjVar.c(this);
            }
            if (!this.b.f()) {
                this.b.c();
            }
        }
    }

    public final void d() {
        this.a.d();
        this.b.d();
    }

    public final boolean e() {
        return this.a.e();
    }

    public final boolean f() {
        if (!this.a.f()) {
            if (!this.b.f()) {
                return false;
            }
        }
        return true;
    }

    public final boolean g() {
        if (!this.a.g()) {
            if (!this.b.g()) {
                return false;
            }
        }
        return true;
    }

    public final boolean h() {
        return this.a.h();
    }

    public final boolean i() {
        if (!j()) {
            if (!g()) {
                return false;
            }
        }
        return true;
    }
}
