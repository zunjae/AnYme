package defpackage;

import java.io.IOException;

final class bez extends bhk {
    boolean a = false;
    long b = 0;
    final /* synthetic */ bey c;

    bez(bey bey, bhz bhz) {
        this.c = bey;
        super(bhz);
    }

    private void c() {
        if (!this.a) {
            this.a = true;
            bdz bdz = this.c;
            bdz.a.a(false, bdz);
        }
    }

    public final long a(bhd bhd, long j) {
        try {
            long a = b().a(bhd, j);
            if (a > 0) {
                this.b += a;
            }
            return a;
        } catch (IOException e) {
            c();
            throw e;
        }
    }

    public final void close() {
        super.close();
        c();
    }
}
