package defpackage;

final class aaw extends wz<Boolean> {
    aaw() {
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() != abp.NULL) {
            return abn.f() == abp.STRING ? Boolean.valueOf(Boolean.parseBoolean(abn.h())) : Boolean.valueOf(abn.i());
        } else {
            abn.j();
            return null;
        }
    }

    public final /* bridge */ /* synthetic */ void a(abq abq, Object obj) {
        abq.a((Boolean) obj);
    }
}
