package defpackage;

final class aay implements xb {
    final /* synthetic */ Class a;
    final /* synthetic */ wz b;

    aay(Class cls, wz wzVar) {
        this.a = cls;
        this.b = wzVar;
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        return abm_T.a() == this.a ? this.b : null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Factory[type=");
        stringBuilder.append(this.a.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
