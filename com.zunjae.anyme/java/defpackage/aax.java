package defpackage;

final class aax implements xb {
    aax() {
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        Class a = abm_T.a();
        if (Enum.class.isAssignableFrom(a)) {
            if (a != Enum.class) {
                if (!a.isEnum()) {
                    a = a.getSuperclass();
                }
                return new abk(a);
            }
        }
        return null;
    }
}
