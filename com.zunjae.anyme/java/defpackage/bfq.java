package defpackage;

import java.util.logging.Level;

final class bfq implements bhz {
    int a;
    byte b;
    int c;
    int d;
    short e;
    private final bhh f;

    bfq(bhh bhh) {
        this.f = bhh;
    }

    public final long a(bhd bhd, long j) {
        int i;
        while (true) {
            i = this.d;
            if (i != 0) {
                break;
            }
            this.f.h((long) this.e);
            this.e = (short) 0;
            if ((this.b & 4) != 0) {
                return -1;
            }
            int i2 = this.c;
            int a = bfp.a(this.f);
            this.d = a;
            this.a = a;
            byte h = (byte) (this.f.h() & 255);
            this.b = (byte) (this.f.h() & 255);
            if (bfp.a.isLoggable(Level.FINE)) {
                bfp.a.fine(bex.a(true, this.c, this.a, h, this.b));
            }
            this.c = this.f.j() & Integer.MAX_VALUE;
            if (h != (byte) 9) {
                throw bex.b("%s != TYPE_CONTINUATION", Byte.valueOf(h));
            } else if (this.c != i2) {
                throw bex.b("TYPE_CONTINUATION streamId changed", new Object[0]);
            }
        }
        long a2 = this.f.a(bhd, Math.min(j, (long) i));
        if (a2 == -1) {
            return -1;
        }
        this.d = (int) (((long) this.d) - a2);
        return a2;
    }

    public final bia a() {
        return this.f.a();
    }

    public final void close() {
    }
}
