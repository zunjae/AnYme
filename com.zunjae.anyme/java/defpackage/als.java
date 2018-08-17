package defpackage;

import java.util.Date;

public final class als {
    private static final String a = "als";

    public static alm a(long j) {
        alm alm = new alm();
        j = new Date((System.currentTimeMillis() / 1000) - j).getTime();
        alm.a = Math.abs((int) (j / 31556926));
        double d = (double) j;
        Double.isNaN(d);
        alm.b = Math.abs((int) (d / 2629743.83d));
        alm.c = Math.abs((int) (j / 604800));
        alm.d = Math.abs((int) (j / 86400));
        alm.e = Math.abs((int) (j / 3600));
        alm.f = Math.abs((int) (j / 60));
        alm.g = Math.abs((int) j);
        return alm;
    }
}
