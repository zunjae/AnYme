package defpackage;

import java.util.Calendar;
import java.util.GregorianCalendar;

final class aat extends wz<Calendar> {
    aat() {
    }

    public final /* synthetic */ Object a(abn abn) {
        if (abn.f() == abp.NULL) {
            abn.j();
            return null;
        }
        abn.c();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (abn.f() != abp.END_OBJECT) {
            String g = abn.g();
            int m = abn.m();
            if ("year".equals(g)) {
                i = m;
            } else if ("month".equals(g)) {
                i2 = m;
            } else if ("dayOfMonth".equals(g)) {
                i3 = m;
            } else if ("hourOfDay".equals(g)) {
                i4 = m;
            } else if ("minute".equals(g)) {
                i5 = m;
            } else if ("second".equals(g)) {
                i6 = m;
            }
        }
        abn.d();
        return new GregorianCalendar(i, i2, i3, i4, i5, i6);
    }

    public final /* synthetic */ void a(abq abq, Object obj) {
        Calendar calendar = (Calendar) obj;
        if (calendar == null) {
            abq.f();
            return;
        }
        abq.d();
        abq.a("year");
        abq.a((long) calendar.get(1));
        abq.a("month");
        abq.a((long) calendar.get(2));
        abq.a("dayOfMonth");
        abq.a((long) calendar.get(5));
        abq.a("hourOfDay");
        abq.a((long) calendar.get(11));
        abq.a("minute");
        abq.a((long) calendar.get(12));
        abq.a("second");
        abq.a((long) calendar.get(13));
        abq.e();
    }
}
