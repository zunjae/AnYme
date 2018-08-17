package defpackage;

import java.lang.reflect.Type;

final class bjs extends bjp {
    static final bjp a = new bjs();

    bjs() {
    }

    public final bjo<?, ?> a(Type type) {
        return bld.a(type) != bjn.class ? null : new bjt(this, bld.e(type));
    }
}
