package defpackage;

final class aba implements xb {
    final /* synthetic */ Class a;
    final /* synthetic */ Class b;
    final /* synthetic */ wz c;

    aba(Class cls, Class cls2, wz wzVar) {
        this.a = cls;
        this.b = cls2;
        this.c = wzVar;
    }

    public final <T> wz<T> a(we weVar, abm<T> abm_T) {
        Class a = abm_T.a();
        if (a != this.a) {
            if (a != this.b) {
                return null;
            }
        }
        return this.c;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Factory[type=");
        stringBuilder.append(this.a.getName());
        stringBuilder.append("+");
        stringBuilder.append(this.b.getName());
        stringBuilder.append(",adapter=");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
