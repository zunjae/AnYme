package defpackage;

import java.io.IOException;

final class bjz extends bhk {
    final /* synthetic */ bjy a;

    bjz(bjy bjy, bhz bhz) {
        this.a = bjy;
        super(bhz);
    }

    public final long a(bhd bhd, long j) {
        try {
            return super.a(bhd, j);
        } catch (IOException e) {
            this.a.a = e;
            throw e;
        }
    }
}
