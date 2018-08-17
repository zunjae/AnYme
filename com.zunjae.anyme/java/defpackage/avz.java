package defpackage;

final class avz {
    public final String a;
    public final boolean b;

    avz(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            if (getClass() == obj.getClass()) {
                avz avz = (avz) obj;
                if (this.b != avz.b) {
                    return false;
                }
                String str = this.a;
                if (str == null) {
                    return avz.a == null;
                } else {
                    if (!str.equals(avz.a)) {
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        return ((str != null ? str.hashCode() : 0) * 31) + this.b;
    }
}
