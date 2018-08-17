package com.greenfrvr.hashtagview;

final class k {
    boolean a = false;
    int b = 0;
    int c = 0;

    private k() {
    }

    static k a() {
        return new k();
    }

    final void a(int i, boolean z, int i2) {
        this.c = i;
        this.a = z;
        this.b = i2;
    }

    final int b() {
        return (this.a ? this.b : 0) + this.c;
    }
}
