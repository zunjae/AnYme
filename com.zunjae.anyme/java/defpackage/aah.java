package defpackage;

import java.math.BigDecimal;

final class aah extends wz<BigDecimal> {
    aah() {
    }

    private static BigDecimal b(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        try {
            return new BigDecimal(abn.h());
        } catch (Throwable e) {
            throw new wv(e);
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        return aah.b(abn);
    }

    public final /* bridge */ /* synthetic */ void a(abq abq, Object obj) {
        abq.a((BigDecimal) obj);
    }
}
