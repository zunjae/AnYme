package defpackage;

import javax.annotation.Nullable;

final class bhw {
    @Nullable
    static bhv a;
    static long b;

    private bhw() {
    }

    static bhv a() {
        synchronized (bhw.class) {
            if (a != null) {
                bhv bhv = a;
                a = bhv.f;
                bhv.f = null;
                b -= 8192;
                return bhv;
            }
            return new bhv();
        }
    }

    static void a(bhv bhv) {
        if (bhv.f != null || bhv.g != null) {
            throw new IllegalArgumentException();
        } else if (!bhv.d) {
            synchronized (bhw.class) {
                if (b + 8192 > 65536) {
                    return;
                }
                b += 8192;
                bhv.f = a;
                bhv.c = 0;
                bhv.b = 0;
                a = bhv;
            }
        }
    }
}
