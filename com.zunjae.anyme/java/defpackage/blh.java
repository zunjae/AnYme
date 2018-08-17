package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

public final class blh extends bjr {
    private final we a;

    private blh(we weVar) {
        this.a = weVar;
    }

    public static blh a() {
        return new blh(new we());
    }

    public final bjq<?, bcp> a(Type type) {
        return new bli(this.a, this.a.a(abm.a(type)));
    }

    public final bjq<bcu, ?> a(Type type, Annotation[] annotationArr) {
        return new blj(this.a, this.a.a(abm.a(type)));
    }
}
