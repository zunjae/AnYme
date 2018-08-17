package defpackage;

final class abc extends wz<T1> {
    final /* synthetic */ Class a;
    final /* synthetic */ abb b;

    abc(abb abb, Class cls) {
        this.b = abb;
        this.a = cls;
    }

    public final T1 a(abn abn) {
        T1 a = this.b.b.a(abn);
        if (a != null) {
            if (!this.a.isInstance(a)) {
                StringBuilder stringBuilder = new StringBuilder("Expected a ");
                stringBuilder.append(this.a.getName());
                stringBuilder.append(" but was ");
                stringBuilder.append(a.getClass().getName());
                throw new wv(stringBuilder.toString());
            }
        }
        return a;
    }

    public final void a(abq abq, T1 t1) {
        this.b.b.a(abq, t1);
    }
}
