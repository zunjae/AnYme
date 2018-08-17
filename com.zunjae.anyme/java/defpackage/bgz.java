package defpackage;

import java.io.IOException;

final class bgz implements bhy {
    final /* synthetic */ bhy a;
    final /* synthetic */ bgy b;

    bgz(bgy bgy, bhy bhy) {
        this.b = bgy;
        this.a = bhy;
    }

    public final bia a() {
        return this.b;
    }

    public final void a_(bhd bhd, long j) {
        bic.a(bhd.b, 0, j);
        while (true) {
            long j2 = 0;
            if (j > 0) {
                bhv bhv = bhd.a;
                while (j2 < 65536) {
                    j2 += (long) (bhv.c - bhv.b);
                    if (j2 >= j) {
                        j2 = j;
                        break;
                    }
                    bhv = bhv.f;
                }
                this.b.c();
                try {
                    this.a.a_(bhd, j2);
                    j -= j2;
                    this.b.a(true);
                } catch (IOException e) {
                    throw this.b.b(e);
                } catch (Throwable th) {
                    this.b.a(false);
                }
            } else {
                return;
            }
        }
    }

    public final void close() {
        this.b.c();
        try {
            this.a.close();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.b(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final void flush() {
        this.b.c();
        try {
            this.a.flush();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.b(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.sink(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
