package defpackage;

final class abb implements xb {
    final /* synthetic */ Class a;
    final /* synthetic */ wz b;

    abb(Class cls, wz wzVar) {
        this.a = cls;
        this.b = wzVar;
    }

    public final <T2> wz<T2> a(we weVar, abm<T2> abm_T2) {
        Class a = abm_T2.a();
        return !this.a.isAssignableFrom(a) ? null : new abc(this, a);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Factory[typeHierarchy=");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
