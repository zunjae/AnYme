package defpackage;

import zv.zw;

public final class zv<T> extends wz<T> {
    final we a;
    private final wu<T> b;
    private final wn<T> c;
    private final abm<T> d;
    private final xb e;
    private final zw f = new zw();
    private wz<T> g;

    public zv(wu<T> wuVar, wn<T> wnVar, we weVar, abm<T> abm_T) {
        this.b = wuVar;
        this.c = wnVar;
        this.a = weVar;
        this.d = abm_T;
        this.e = null;
    }

    private wz<T> b() {
        wz<T> wzVar = this.g;
        if (wzVar != null) {
            return wzVar;
        }
        wzVar = this.a.a(this.e, this.d);
        this.g = wzVar;
        return wzVar;
    }

    public final T a(abn abn) {
        return this.c == null ? b().a(abn) : yp.a(abn) instanceof wq ? null : this.c.a();
    }

    public final void a(abq abq, T t) {
        wu wuVar = this.b;
        if (wuVar == null) {
            b().a(abq, t);
        } else if (t == null) {
            abq.f();
        } else {
            yp.a(wuVar.a(), abq);
        }
    }
}
