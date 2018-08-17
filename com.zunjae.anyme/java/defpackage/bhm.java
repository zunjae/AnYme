package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Inflater;

public final class bhm implements bhz {
    private int a = 0;
    private final bhh b;
    private final Inflater c;
    private final bhn d;
    private final CRC32 e = new CRC32();

    public bhm(bhz bhz) {
        if (bhz != null) {
            this.c = new Inflater(true);
            this.b = bho.a(bhz);
            this.d = new bhn(this.b, this.c);
            return;
        }
        throw new IllegalArgumentException("source == null");
    }

    private void a(bhd bhd, long j, long j2) {
        bhv bhv = bhd.a;
        while (true) {
            int i = bhv.c;
            int i2 = bhv.b;
            if (j < ((long) (i - i2))) {
                break;
            }
            j -= (long) (i - i2);
            bhv = bhv.f;
        }
        while (j2 > 0) {
            int i3 = (int) (((long) bhv.b) + j);
            int min = (int) Math.min((long) (bhv.c - i3), j2);
            this.e.update(bhv.a, i3, min);
            j2 -= (long) min;
            bhv = bhv.f;
            j = 0;
        }
    }

    private static void a(String str, int i, int i2) {
        if (i2 != i) {
            throw new IOException(String.format("%s: actual 0x%08x != expected 0x%08x", new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}));
        }
    }

    public final long a(bhd bhd, long j) {
        bhm bhm = this;
        bhd bhd2 = bhd;
        long j2 = j;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        } else if (j2 == 0) {
            return 0;
        } else {
            if (bhm.a == 0) {
                long t;
                bhm.b.a(10);
                byte c = bhm.b.c().c(3);
                Object obj = ((c >> 1) & 1) == 1 ? 1 : null;
                if (obj != null) {
                    a(bhm.b.c(), 0, 10);
                }
                bhm.a("ID1ID2", 8075, bhm.b.i());
                bhm.b.h(8);
                if (((c >> 2) & 1) == 1) {
                    long j3;
                    bhm.b.a(2);
                    if (obj != null) {
                        a(bhm.b.c(), 0, 2);
                    }
                    long k = (long) bhm.b.c().k();
                    bhm.b.a(k);
                    if (obj != null) {
                        j3 = k;
                        a(bhm.b.c(), 0, k);
                    } else {
                        j3 = k;
                    }
                    bhm.b.h(j3);
                }
                if (((c >> 3) & 1) == 1) {
                    t = bhm.b.t();
                    if (t != -1) {
                        if (obj != null) {
                            a(bhm.b.c(), 0, t + 1);
                        }
                        bhm.b.h(t + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((c >> 4) & 1) == 1) {
                    t = bhm.b.t();
                    if (t != -1) {
                        if (obj != null) {
                            a(bhm.b.c(), 0, t + 1);
                        }
                        bhm.b.h(t + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (obj != null) {
                    bhm.a("FHCRC", bhm.b.k(), (short) ((int) bhm.e.getValue()));
                    bhm.e.reset();
                }
                bhm.a = 1;
            }
            if (bhm.a == 1) {
                long j4 = bhd2.b;
                j2 = bhm.d.a(bhd2, j2);
                if (j2 != -1) {
                    a(bhd, j4, j2);
                    return j2;
                }
                bhm.a = 2;
            }
            if (bhm.a == 2) {
                bhm.a("CRC", bhm.b.l(), (int) bhm.e.getValue());
                bhm.a("ISIZE", bhm.b.l(), (int) bhm.c.getBytesWritten());
                bhm.a = 3;
                if (!bhm.b.e()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1;
        }
    }

    public final bia a() {
        return this.b.a();
    }

    public final void close() {
        this.d.close();
    }
}
