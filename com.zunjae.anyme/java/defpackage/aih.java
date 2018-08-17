package defpackage;

public final class aih {
    private static int a(ahq ahq) {
        int a = ahq.a();
        return ahq.t() == ago.DROP ? a * 3 : a;
    }

    public static int a(ahq ahq, int i) {
        return ahq == null ? 0 : ahq.s() == ahr.HORIZONTAL ? aih.b(ahq, i) : aih.c(ahq, i);
    }

    public static int b(ahq ahq, int i) {
        if (ahq == null) {
            return 0;
        }
        return (ahq.s() == ahr.HORIZONTAL ? aih.d(ahq, i) : aih.a(ahq)) + ahq.c();
    }

    public static int c(ahq ahq, int i) {
        if (ahq == null) {
            return 0;
        }
        return (ahq.s() == ahr.HORIZONTAL ? aih.a(ahq) : aih.d(ahq, i)) + ahq.d();
    }

    private static int d(ahq ahq, int i) {
        int r = ahq.r();
        int a = ahq.a();
        int g = ahq.g();
        int b = ahq.b();
        int i2 = 0;
        for (int i3 = 0; i3 < r; i3++) {
            int i4 = g / 2;
            i2 += a + i4;
            if (i == i3) {
                return i2;
            }
            i2 += (a + b) + i4;
        }
        if (ahq.t() == ago.DROP) {
            i2 += a * 2;
        }
        return i2;
    }
}
