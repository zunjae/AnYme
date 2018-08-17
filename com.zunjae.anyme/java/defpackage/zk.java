package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class zk extends wz<Object> {
    public static final xb a = new zl();
    private final we b;

    zk(we weVar) {
        this.b = weVar;
    }

    public final Object a(abn abn) {
        switch (zm.a[abn.f().ordinal()]) {
            case tw.a /*1*/:
                List arrayList = new ArrayList();
                abn.a();
                while (abn.e()) {
                    arrayList.add(a(abn));
                }
                abn.b();
                return arrayList;
            case tw.b /*2*/:
                Map yfVar = new yf();
                abn.c();
                while (abn.e()) {
                    yfVar.put(abn.g(), a(abn));
                }
                abn.d();
                return yfVar;
            case f.c /*3*/:
                return abn.h();
            case mh.d /*4*/:
                return Double.valueOf(abn.k());
            case mh.e /*5*/:
                return Boolean.valueOf(abn.i());
            case mh.f /*6*/:
                abn.j();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    public final void a(abq abq, Object obj) {
        if (obj == null) {
            abq.f();
            return;
        }
        wz a = this.b.a(obj.getClass());
        if (a instanceof zk) {
            abq.d();
            abq.e();
            return;
        }
        a.a(abq, obj);
    }
}
