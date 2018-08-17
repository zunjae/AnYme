package com.mikepenz.fastadapter;

final class l implements j {
    l() {
    }

    public final boolean a(b bVar, int i, int i2, int i3) {
        if (i > i2) {
            if (i2 > 0) {
                bVar.c(i3, i2);
            }
            bVar.a(i3 + i2, i - i2);
        } else {
            if (i > 0 && i < i2) {
                bVar.c(i3, i);
                i3 += i;
                i2 -= i;
            } else if (i != 0) {
                bVar.i();
            }
            bVar.b(i3, i2);
        }
        return false;
    }
}
