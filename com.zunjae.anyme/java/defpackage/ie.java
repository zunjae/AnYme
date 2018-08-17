package defpackage;

final class ie implements ib {
    private final String a;

    ie(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ie)) {
            return false;
        }
        return this.a.equals(((ie) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("StringHeaderFactory{value='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
