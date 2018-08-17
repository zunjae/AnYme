package defpackage;

import javax.annotation.Nullable;

public final class bdh {
    @Nullable
    public final bcn a;
    @Nullable
    public final bcs b;

    bdh(bcn bcn, bcs bcs) {
        this.a = bcn;
        this.b = bcs;
    }

    public static boolean a(bcs bcs, bcn bcn) {
        switch (bcs.b()) {
            case 302:
            case 307:
                if (bcs.a("Expires") == null && bcs.j().c() == -1 && !bcs.j().e() && !bcs.j().d()) {
                    break;
                }
            case 200:
            case 203:
            case 204:
            case 300:
            case 301:
            case 308:
            case 404:
            case 405:
            case 410:
            case 414:
            case 501:
                if (!(bcs.j().b() || bcn.f().b())) {
                    return true;
                }
            default:
                break;
        }
        return false;
    }
}
