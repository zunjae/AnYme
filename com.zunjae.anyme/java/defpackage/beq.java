package defpackage;

final class beq extends bel {
    final /* synthetic */ bek e;
    private boolean f;

    beq(bek bek) {
        this.e = bek;
        super(bek);
    }

    public final long a(bhd bhd, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.b) {
            throw new IllegalStateException("closed");
        } else if (this.f) {
            return -1;
        } else {
            long a = super.a(bhd, j);
            if (a != -1) {
                return a;
            }
            this.f = true;
            a(true);
            return -1;
        }
    }

    public final void close() {
        if (!this.b) {
            if (!this.f) {
                a(false);
            }
            this.b = true;
        }
    }
}
