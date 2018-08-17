package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.Inflater;

public final class bhn implements bhz {
    private final bhh a;
    private final Inflater b;
    private int c;
    private boolean d;

    bhn(bhh bhh, Inflater inflater) {
        if (bhh == null) {
            throw new IllegalArgumentException("source == null");
        } else if (inflater != null) {
            this.a = bhh;
            this.b = inflater;
        } else {
            throw new IllegalArgumentException("inflater == null");
        }
    }

    private void b() {
        int i = this.c;
        if (i != 0) {
            i -= this.b.getRemaining();
            this.c -= i;
            this.a.h((long) i);
        }
    }

    public final long a(bhd bhd, long j) {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (this.d) {
            throw new IllegalStateException("closed");
        } else if (j == 0) {
            return 0;
        } else {
            bhv bhv;
            while (true) {
                Object obj = null;
                if (this.b.needsInput()) {
                    b();
                    if (this.b.getRemaining() != 0) {
                        throw new IllegalStateException("?");
                    } else if (this.a.e()) {
                        obj = 1;
                    } else {
                        bhv = this.a.c().a;
                        int i = bhv.c;
                        int i2 = bhv.b;
                        this.c = i - i2;
                        this.b.setInput(bhv.a, i2, this.c);
                    }
                }
                try {
                    bhv = bhd.e(1);
                    int inflate = this.b.inflate(bhv.a, bhv.c, (int) Math.min(j, (long) (8192 - bhv.c)));
                    if (inflate > 0) {
                        bhv.c += inflate;
                        long j2 = (long) inflate;
                        bhd.b += j2;
                        return j2;
                    } else if (this.b.finished()) {
                        break;
                    } else if (this.b.needsDictionary()) {
                        break;
                    } else if (obj != null) {
                        throw new EOFException("source exhausted prematurely");
                    }
                } catch (Throwable e) {
                    throw new IOException(e);
                }
            }
            b();
            if (bhv.b == bhv.c) {
                bhd.a = bhv.b();
                bhw.a(bhv);
            }
            return -1;
        }
    }

    public final bia a() {
        return this.a.a();
    }

    public final void close() {
        if (!this.d) {
            this.b.end();
            this.d = true;
            this.a.close();
        }
    }
}
