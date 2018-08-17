package defpackage;

import java.io.Reader;

final class blj<T> implements bjq<bcu, T> {
    private final we a;
    private final wz<T> b;

    blj(we weVar, wz<T> wzVar) {
        this.a = weVar;
        this.b = wzVar;
    }

    private T a(bcu bcu) {
        we weVar = this.a;
        T d = bcu.d();
        abn a = weVar.a((Reader) d);
        try {
            d = this.b.a(a);
            if (a.f() == abp.END_DOCUMENT) {
                return d;
            }
            throw new wp("JSON document was not fully consumed.");
        } finally {
            bcu.close();
        }
    }
}
