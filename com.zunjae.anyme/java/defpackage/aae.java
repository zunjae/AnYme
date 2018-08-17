package defpackage;

final class aae extends wz<Number> {
    aae() {
    }

    public final /* synthetic */ Object a(abn abn) {
        abp f = abn.f();
        int i = abd.a[f.ordinal()];
        if (i != 1) {
            switch (i) {
                case f.c /*3*/:
                    break;
                case mh.d /*4*/:
                    abn.j();
                    return null;
                default:
                    throw new wv("Expecting number, got: ".concat(String.valueOf(f)));
            }
        }
        return new ye(abn.h());
    }

    public final /* bridge */ /* synthetic */ void a(abq abq, Object obj) {
        abq.a((Number) obj);
    }
}
