package defpackage;

final class bem implements bhy {
    final /* synthetic */ bek a;
    private final bhl b = new bhl(this.a.d.a());
    private boolean c;

    bem(bek bek) {
        this.a = bek;
    }

    public final bia a() {
        return this.b;
    }

    public final void a_(bhd bhd, long j) {
        if (this.c) {
            throw new IllegalStateException("closed");
        } else if (j != 0) {
            this.a.d.k(j);
            this.a.d.b("\r\n");
            this.a.d.a_(bhd, j);
            this.a.d.b("\r\n");
        }
    }

    public final synchronized void close() {
        if (!this.c) {
            this.c = true;
            this.a.d.b("0\r\n\r\n");
            bek.a(this.b);
            this.a.e = 3;
        }
    }

    public final synchronized void flush() {
        if (!this.c) {
            this.a.d.flush();
        }
    }
}
