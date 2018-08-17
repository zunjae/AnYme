package defpackage;

import java.math.BigInteger;

final class aai extends wz<BigInteger> {
    aai() {
    }

    private static BigInteger b(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        try {
            return new BigInteger(abn.h());
        } catch (Throwable e) {
            throw new wv(e);
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        return aai.b(abn);
    }

    public final /* bridge */ /* synthetic */ void a(abq abq, Object obj) {
        abq.a((BigInteger) obj);
    }
}
