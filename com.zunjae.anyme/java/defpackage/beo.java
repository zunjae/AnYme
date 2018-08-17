package defpackage;

import java.net.ProtocolException;

final class beo implements bhy {
    final /* synthetic */ bek a;
    private final bhl b = new bhl(this.a.d.a());
    private boolean c;
    private long d;

    beo(bek bek, long j) {
        this.a = bek;
        this.d = j;
    }

    public final bia a() {
        return this.b;
    }

    public final void a_(bhd bhd, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        bdb.a(bhd.b(), j);
        if (j <= this.d) {
            this.a.d.a_(bhd, j);
            this.d -= j;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("expected ");
        stringBuilder.append(this.d);
        stringBuilder.append(" bytes but received ");
        stringBuilder.append(j);
        throw new ProtocolException(stringBuilder.toString());
    }

    public final void close() {
        if (!this.c) {
            this.c = true;
            if (this.d <= 0) {
                bek.a(this.b);
                this.a.e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }
    }

    public final void flush() {
        if (!this.c) {
            this.a.d.flush();
        }
    }
}
