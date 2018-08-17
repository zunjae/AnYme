package defpackage;

final class yr implements CharSequence {
    char[] a;

    yr() {
    }

    public final char charAt(int i) {
        return this.a[i];
    }

    public final int length() {
        return this.a.length;
    }

    public final CharSequence subSequence(int i, int i2) {
        return new String(this.a, i, i2 - i);
    }
}
