package defpackage;

import java.util.concurrent.atomic.AtomicLong;

final class wi extends wz<AtomicLong> {
    final /* synthetic */ wz a;

    wi(wz wzVar) {
        this.a = wzVar;
    }

    public final /* synthetic */ Object a(abn abn) {
        return new AtomicLong(((Number) this.a.a(abn)).longValue());
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        this.a.a(abq, Long.valueOf(((AtomicLong) obj).get()));
    }
}
