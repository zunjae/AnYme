package defpackage;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

final class bdf implements bhz {
    boolean a;
    final /* synthetic */ bhh b;
    final /* synthetic */ bdg c;
    final /* synthetic */ bhg d;
    final /* synthetic */ bde e;

    bdf(bde bde, bhh bhh, bdg bdg, bhg bhg) {
        this.e = bde;
        this.b = bhh;
        this.c = bdg;
        this.d = bhg;
    }

    public final long a(bhd bhd, long j) {
        try {
            j = this.b.a(bhd, j);
            if (j == -1) {
                if (!this.a) {
                    this.a = true;
                    this.d.close();
                }
                return -1;
            }
            bhd.a(this.d.c(), bhd.b() - j, j);
            this.d.v();
            return j;
        } catch (IOException e) {
            if (!this.a) {
                this.a = true;
            }
            throw e;
        }
    }

    public final bia a() {
        return this.b.a();
    }

    public final void close() {
        if (!(this.a || bdb.a((bhz) this, TimeUnit.MILLISECONDS))) {
            this.a = true;
        }
        this.b.close();
    }
}
