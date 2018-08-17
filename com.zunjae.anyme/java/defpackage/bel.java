package defpackage;

import java.io.IOException;

abstract class bel implements bhz {
    protected final bhl a;
    protected boolean b;
    protected long c;
    final /* synthetic */ bek d;

    private bel(bek bek) {
        this.d = bek;
        this.a = new bhl(this.d.c.a());
        this.c = 0;
    }

    public long a(bhd bhd, long j) {
        try {
            long a = this.d.c.a(bhd, j);
            if (a > 0) {
                this.c += a;
            }
            return a;
        } catch (IOException e) {
            a(false);
            throw e;
        }
    }

    public final bia a() {
        return this.a;
    }

    protected final void a(boolean z) {
        int i = this.d.e;
        if (i != 6) {
            if (i == 5) {
                bek.a(this.a);
                bdz bdz = this.d;
                bdz.e = 6;
                bdu bdu = bdz.b;
                if (bdu != null) {
                    bdu.a(z ^ 1, bdz);
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder("state: ");
            stringBuilder.append(this.d.e);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
