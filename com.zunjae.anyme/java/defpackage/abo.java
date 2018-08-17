package defpackage;

final class abo extends yd {
    abo() {
    }

    public final void a(abn abn) {
        if (abn instanceof ze) {
            ((ze) abn).o();
            return;
        }
        int i = abn.a;
        if (i == 0) {
            i = abn.r();
        }
        if (i == 13) {
            abn.a = 9;
        } else if (i == 12) {
            abn.a = 8;
        } else if (i == 14) {
            abn.a = 10;
        } else {
            StringBuilder stringBuilder = new StringBuilder("Expected a name but was ");
            stringBuilder.append(abn.f());
            stringBuilder.append(abn.s());
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
