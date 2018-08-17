package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

final class bjh extends bjr {
    bjh() {
    }

    public final bjq<?, bcp> a(Type type) {
        return bcp.class.isAssignableFrom(bld.a(type)) ? bjj.a : null;
    }

    public final bjq<bcu, ?> a(Type type, Annotation[] annotationArr) {
        return type == bcu.class ? bld.a(annotationArr, bmg.class) ? bjk.a : bji.a : type == Void.class ? bjm.a : null;
    }
}
