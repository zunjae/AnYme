package defpackage;

final class axc {
    static final axc a = new axc(0, 0);
    final int b;
    final int c;

    axc(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(getClass().getSimpleName());
        stringBuilder.append("[position = ");
        stringBuilder.append(this.b);
        stringBuilder.append(", length = ");
        stringBuilder.append(this.c);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
