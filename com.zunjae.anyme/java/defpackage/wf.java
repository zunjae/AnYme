package defpackage;

final class wf extends wz<Number> {
    final /* synthetic */ we a;

    wf(we weVar) {
        this.a = weVar;
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() != abp.NULL) {
            return Double.valueOf(abn.k());
        }
        abn.j();
        return null;
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Number number = (Number) obj;
        if (number == null) {
            abq.f();
            return;
        }
        we.a(number.doubleValue());
        abq.a(number);
    }
}
