package defpackage;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class zr extends wz<Date> {
    public static final xb a = new zs();
    private final DateFormat b = new SimpleDateFormat("MMM d, yyyy");

    private synchronized void a(abq abq, Date date) {
        abq.b(date == null ? null : this.b.format(date));
    }

    private synchronized Date b(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        try {
            return new Date(this.b.parse(abn.h()).getTime());
        } catch (Throwable e) {
            throw new wv(e);
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        return b(abn);
    }
}
