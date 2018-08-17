package defpackage;

import java.io.IOException;

final class bha implements bhz {
    final /* synthetic */ bhz a;
    final /* synthetic */ bgy b;

    bha(bgy bgy, bhz bhz) {
        this.b = bgy;
        this.a = bhz;
    }

    public final long a(bhd bhd, long j) {
        this.b.c();
        try {
            long a = this.a.a(bhd, j);
            this.b.a(true);
            return a;
        } catch (IOException e) {
            throw this.b.b(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final bia a() {
        return this.b;
    }

    public final void close() {
        try {
            this.a.close();
            this.b.a(true);
        } catch (IOException e) {
            throw this.b.b(e);
        } catch (Throwable th) {
            this.b.a(false);
        }
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AsyncTimeout.source(");
        stringBuilder.append(this.a);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}
