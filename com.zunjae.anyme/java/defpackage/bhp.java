package defpackage;

import java.io.OutputStream;

final class bhp implements bhy {
    final /* synthetic */ bia a;
    final /* synthetic */ OutputStream b;

    bhp(bia bia, OutputStream outputStream) {
        this.a = bia;
        this.b = outputStream;
    }

    public final bia a() {
        return this.a;
    }

    public final void a_(bhd bhd, long j) {
        bic.a(bhd.b, 0, j);
        while (j > 0) {
            this.a.g();
            bhv bhv = bhd.a;
            int min = (int) Math.min(j, (long) (bhv.c - bhv.b));
            this.b.write(bhv.a, bhv.b, min);
            bhv.b += min;
            long j2 = (long) min;
            j -= j2;
            bhd.b -= j2;
            if (bhv.b == bhv.c) {
                bhd.a = bhv.b();
                bhw.a(bhv);
            }
        }
    }

    public final void close() {
        this.b.close();
    }

    public final void flush() {
        this.b.flush();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("sink(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
