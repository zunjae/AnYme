package defpackage;

import java.io.IOException;
import java.io.InputStream;

final class bhq implements bhz {
    final /* synthetic */ bia a;
    final /* synthetic */ InputStream b;

    bhq(bia bia, InputStream inputStream) {
        this.a = bia;
        this.b = inputStream;
    }

    public final long a(bhd bhd, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (j == 0) {
            return 0;
        } else {
            try {
                this.a.g();
                bhv e = bhd.e(1);
                int read = this.b.read(e.a, e.c, (int) Math.min(j, (long) (8192 - e.c)));
                if (read == -1) {
                    return -1;
                }
                e.c += read;
                j = (long) read;
                bhd.b += j;
                return j;
            } catch (AssertionError e2) {
                if (bho.a(e2)) {
                    throw new IOException(e2);
                }
                throw e2;
            }
        }
    }

    public final bia a() {
        return this.a;
    }

    public final void close() {
        this.b.close();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("source(");
        stringBuilder.append(this.b);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
