package defpackage;

import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

final class ben extends bel {
    final /* synthetic */ bek e;
    private final bbz f;
    private long g = -1;
    private boolean h = true;

    ben(bek bek, bbz bbz) {
        this.e = bek;
        super(bek);
        this.f = bbz;
    }

    public final long a(bhd bhd, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else if (!this.h) {
            return -1;
        } else {
            long j2 = this.g;
            if (j2 == 0 || j2 == -1) {
                if (this.g != -1) {
                    this.e.c.p();
                }
                try {
                    this.g = this.e.c.m();
                    String trim = this.e.c.p().trim();
                    if (this.g < 0 || !(trim.isEmpty() || trim.startsWith(";"))) {
                        StringBuilder stringBuilder = new StringBuilder("expected chunk size and optional extensions but was \"");
                        stringBuilder.append(this.g);
                        stringBuilder.append(trim);
                        stringBuilder.append("\"");
                        throw new ProtocolException(stringBuilder.toString());
                    }
                    if (this.g == 0) {
                        this.h = false;
                        bec.a(this.e.a.d(), this.f, this.e.d());
                        a(true);
                    }
                    if (!this.h) {
                        return -1;
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long a = super.a(bhd, Math.min(j, this.g));
            if (a != -1) {
                this.g -= a;
                return a;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            a(false);
            throw protocolException;
        }
    }

    public final void close() {
        if (!this.b) {
            if (this.h && !bdb.a((bhz) this, TimeUnit.MILLISECONDS)) {
                a(false);
            }
            this.b = true;
        }
    }
}
