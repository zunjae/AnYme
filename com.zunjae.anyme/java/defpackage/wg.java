package defpackage;

final class wg extends wz<Number> {
    final /* synthetic */ we a;

    wg(we weVar) {
        this.a = weVar;
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() != abp.NULL) {
            return Float.valueOf((float) abn.k());
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
        we.a((double) number.floatValue());
        abq.a(number);
    }
}
