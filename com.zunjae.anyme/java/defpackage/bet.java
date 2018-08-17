package defpackage;

public final class bet {
    public static final bhi a = bhi.a(":");
    public static final bhi b = bhi.a(":status");
    public static final bhi c = bhi.a(":method");
    public static final bhi d = bhi.a(":path");
    public static final bhi e = bhi.a(":scheme");
    public static final bhi f = bhi.a(":authority");
    public final bhi g;
    public final bhi h;
    final int i;

    public bet(bhi bhi, bhi bhi2) {
        this.g = bhi;
        this.h = bhi2;
        this.i = (bhi.g() + 32) + bhi2.g();
    }

    public bet(bhi bhi, String str) {
        this(bhi, bhi.a(str));
    }

    public bet(String str, String str2) {
        this(bhi.a(str), bhi.a(str2));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof bet) {
            bet bet = (bet) obj;
            if (this.g.equals(bet.g) && this.h.equals(bet.h)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.g.hashCode() + 527) * 31) + this.h.hashCode();
    }

    public final String toString() {
        return bdb.a("%s: %s", this.g.a(), this.h.a());
    }
}
