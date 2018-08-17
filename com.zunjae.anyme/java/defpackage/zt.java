package defpackage;

import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public final class zt extends wz<Time> {
    public static final xb a = new zu();
    private final DateFormat b = new SimpleDateFormat("hh:mm:ss a");

    private synchronized void a(abq abq, Time time) {
        abq.b(time == null ? null : this.b.format(time));
    }

    private synchronized Time b(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        try {
            return new Time(this.b.parse(abn.h()).getTime());
        } catch (Throwable e) {
            throw new wv(e);
        }
    }

    public final /* synthetic */ Object a(abn abn) {
        return b(abn);
    }
}
