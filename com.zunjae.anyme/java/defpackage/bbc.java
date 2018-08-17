package defpackage;

final class bbc {
    final String a;
    final String b;
    final String c;
    final bhi d;

    public final boolean equals(Object obj) {
        if (obj instanceof bbc) {
            bbc bbc = (bbc) obj;
            if (this.a.equals(bbc.a) && this.c.equals(bbc.c) && this.d.equals(bbc.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append(this.d.b());
        return stringBuilder.toString();
    }
}
