package defpackage;

import java.lang.reflect.Type;
import java.util.concurrent.Executor;

final class bju extends bjp {
    final Executor a;

    bju(Executor executor) {
        this.a = executor;
    }

    public final bjo<?, ?> a(Type type) {
        return bld.a(type) != bjn.class ? null : new bjv(this, bld.e(type));
    }
}
