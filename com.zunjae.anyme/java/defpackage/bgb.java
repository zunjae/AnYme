package defpackage;

public final class bgb {
    private int a;
    private final int[] b = new int[10];

    final int a() {
        return Integer.bitCount(this.a);
    }

    final bgb a(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.b;
            if (i < iArr.length) {
                this.a = (1 << i) | this.a;
                iArr[i] = i2;
            }
        }
        return this;
    }

    final boolean a(int i) {
        return ((1 << i) & this.a) != 0;
    }

    final int b() {
        return (this.a & 2) != 0 ? this.b[1] : -1;
    }

    final int b(int i) {
        return this.b[i];
    }

    final int c() {
        return (this.a & 16) != 0 ? this.b[4] : Integer.MAX_VALUE;
    }

    final int c(int i) {
        return (this.a & 32) != 0 ? this.b[5] : i;
    }

    final int d() {
        return (this.a & 128) != 0 ? this.b[7] : 65535;
    }
}
