package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

final class abi extends wz<AtomicInteger> {
    abi() {
    }

    private static AtomicInteger b(abn abn) {
        try {
            return new AtomicInteger(abn.m());
        } catch (Throwable e) {
            throw new wv(e);
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        return abi.b(abn);
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        abq.a((long) ((AtomicInteger) obj).get());
    }
}
