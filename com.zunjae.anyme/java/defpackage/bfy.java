package defpackage;

final class bfy {
    final bfy[] a;
    final int b;
    final int c;

    bfy() {
        this.a = new bfy[256];
        this.b = 0;
        this.c = 0;
    }

    bfy(int i, int i2) {
        this.a = null;
        this.b = i;
        i = i2 & 7;
        if (i == 0) {
            i = 8;
        }
        this.c = i;
    }
}
