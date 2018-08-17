package defpackage;

final class aag extends wz<String> {
    aag() {
    }

    public final /* synthetic */ Object a(abn abn) {
        abp f = abn.f();
        if (f != abp.NULL) {
            return f == abp.BOOLEAN ? Boolean.toString(abn.i()) : abn.h();
        } else {
            abn.j();
            return null;
        }
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        abq.b((String) obj);
    }
}
