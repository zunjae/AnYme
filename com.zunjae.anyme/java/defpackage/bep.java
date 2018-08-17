package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class bep extends bel {
    final /* synthetic */ bek e;
    private long f;

    bep(bek bek, long j) {
        this.e = bek;
        super(bek);
        this.f = j;
        if (this.f == 0) {
            a(true);
        }
    }

    public final long a(bhd bhd, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else {
            long j2 = this.f;
            if (j2 == 0) {
                return -1;
            }
            long a = super.a(bhd, Math.min(j2, j));
            if (a != -1) {
                this.f -= a;
                if (this.f == 0) {
                    a(true);
                }
                return a;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false);
            throw protocolException;
        }
    }

    public final void close() {
        if (!this.b) {
            if (!(this.f == 0 || bdb.a((bhz) this, TimeUnit.MILLISECONDS))) {
                a(false);
            }
            this.b = true;
        }
    }
}
