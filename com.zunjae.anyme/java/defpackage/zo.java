package defpackage;

import java.lang.reflect.Field;

final class zo extends zq {
    final /* synthetic */ Field a;
    final /* synthetic */ boolean b;
    final /* synthetic */ wz c;
    final /* synthetic */ we d;
    final /* synthetic */ abm e;
    final /* synthetic */ boolean f;
    final /* synthetic */ zn g;

    zo(zn znVar, String str, boolean z, boolean z2, Field field, boolean z3, wz wzVar, we weVar, abm abm, boolean z4) {
        this.g = znVar;
        this.a = field;
        this.b = z3;
        this.c = wzVar;
        this.d = weVar;
        this.e = abm;
        this.f = z4;
        super(str, z, z2);
    }

    final void a(abn abn, Object obj) {
        Object a = this.c.a(abn);
        if (a != null || !this.f) {
            this.a.set(obj, a);
        }
    }

    final void a(abq abq, Object obj) {
        (this.b ? this.c : new zx(this.d, this.c, this.e.b())).a(abq, this.a.get(obj));
    }

    public final boolean a(Object obj) {
        return this.i && this.a.get(obj) != obj;
    }
}
