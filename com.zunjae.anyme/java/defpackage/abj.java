package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

final class abj extends wz<AtomicBoolean> {
    abj() {
    }

    public final /* synthetic */ Object a(abn abn) {
        return new AtomicBoolean(abn.i());
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        abq.a(((AtomicBoolean) obj).get());
    }
}
