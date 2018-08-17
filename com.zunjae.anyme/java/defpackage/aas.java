package defpackage;

import java.sql.Timestamp;
import java.util.Date;

final class aas extends wz<Timestamp> {
    final /* synthetic */ wz a;
    final /* synthetic */ aar b;

    aas(aar aar, wz wzVar) {
        this.b = aar;
        this.a = wzVar;
    }

    public final /* synthetic */ Object a(abn abn) {
        Date date = (Date) this.a.a(abn);
        return date != null ? new Timestamp(date.getTime()) : null;
    }

    public final /* bridge */ /* synthetic */ void a(abq abq, Object obj) {
        this.a.a(abq, (Timestamp) obj);
    }
}
