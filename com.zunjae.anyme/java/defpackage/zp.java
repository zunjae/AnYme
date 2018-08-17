package defpackage;

import java.util.Map;

public final class zp<T> extends wz<T> {
    private final yn<T> a;
    private final Map<String, zq> b;

    zp(yn<T> ynVar, Map<String, zq> map) {
        this.a = ynVar;
        this.b = map;
    }

    public final T a(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        Object a = this.a.a();
        try {
            abn.c();
            while (abn.e()) {
                zq zqVar = (zq) this.b.get(abn.g());
                if (zqVar != null) {
                    if (zqVar.j) {
                        zqVar.a(abn, a);
                    }
                }
                abn.n();
            }
            abn.d();
            return a;
        } catch (Throwable e) {
            throw new wv(e);
        } catch (IllegalAccessException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void a(abq abq, T t) {
        if (t == null) {
            abq.f();
            return;
        }
        abq.d();
        try {
            for (zq zqVar : this.b.values()) {
                if (zqVar.a(t)) {
                    abq.a(zqVar.h);
                    zqVar.a(abq, (Object) t);
                }
            }
            abq.e();
        } catch (IllegalAccessException e) {
            throw new AssertionError(e);
        }
    }
}
