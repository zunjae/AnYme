package defpackage;

final class yc extends wz<T> {
    final /* synthetic */ boolean a;
    final /* synthetic */ boolean b;
    final /* synthetic */ we c;
    final /* synthetic */ abm d;
    final /* synthetic */ yb e;
    private wz<T> f;

    yc(yb ybVar, boolean z, boolean z2, we weVar, abm abm) {
        this.e = ybVar;
        this.a = z;
        this.b = z2;
        this.c = weVar;
        this.d = abm;
    }

    private wz<T> b() {
        wz<T> wzVar = this.f;
        if (wzVar != null) {
            return wzVar;
        }
        wzVar = this.c.a(this.e, this.d);
        this.f = wzVar;
        return wzVar;
    }

    public final T a(abn abn) {
        if (!this.a) {
            return b().a(abn);
        }
        abn.n();
        return null;
    }

    public final void a(abq abq, T t) {
        if (this.b) {
            abq.f();
        } else {
            b().a(abq, t);
        }
    }
}
