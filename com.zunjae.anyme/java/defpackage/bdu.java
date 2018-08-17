package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Socket;
import java.util.List;

public final class bdu {
    static final /* synthetic */ boolean d = true;
    public final bas a;
    public final bay b;
    public final bbq c;
    private bdt e;
    private bcx f;
    private final bbg g;
    private final Object h;
    private final bds i;
    private int j;
    private bdp k;
    private boolean l;
    private boolean m;
    private boolean n;
    private bdz o;

    public bdu(bbg bbg, bas bas, bay bay, bbq bbq, Object obj) {
        this.g = bbg;
        this.a = bas;
        this.b = bay;
        this.c = bbq;
        this.i = new bds(bas, h(), bay, bbq);
        this.h = obj;
    }

    private bdp a(int i, int i2, int i3, int i4, boolean z) {
        Socket a;
        bdp bdp;
        bcx bcx;
        Object obj;
        synchronized (this.g) {
            if (r1.m) {
                throw new IllegalStateException("released");
            } else if (r1.o != null) {
                throw new IllegalStateException("codec != null");
            } else if (r1.n) {
                throw new IOException("Canceled");
            } else {
                if (!d) {
                    if (!Thread.holdsLock(r1.g)) {
                        throw new AssertionError();
                    }
                }
                bdp bdp2 = r1.k;
                Socket socket = null;
                a = (bdp2 == null || !bdp2.a) ? null : a(false, false, (boolean) d);
                bdp = r1.k != null ? r1.k : null;
                if (bdp == null) {
                    bcz.a.a(r1.g, r1.a, r1, null);
                    if (r1.k != null) {
                        bdp = r1.k;
                        bcx = null;
                        obj = 1;
                    } else {
                        bcx = r1.f;
                    }
                } else {
                    bcx = null;
                }
                obj = null;
            }
        }
        bdb.a(a);
        if (bdp != null) {
            return bdp;
        }
        Object obj2;
        List c;
        int size;
        int i5;
        bcx bcx2;
        if (bcx == null) {
            bdt bdt = r1.e;
            if (bdt == null || !bdt.a()) {
                r1.e = r1.i.b();
                obj2 = 1;
                synchronized (r1.g) {
                    if (r1.n) {
                        if (obj2 != null) {
                            c = r1.e.c();
                            size = c.size();
                            for (i5 = 0; i5 < size; i5++) {
                                bcx2 = (bcx) c.get(i5);
                                bcz.a.a(r1.g, r1.a, r1, bcx2);
                                if (r1.k != null) {
                                    bdp = r1.k;
                                    r1.f = bcx2;
                                    obj = 1;
                                    break;
                                }
                            }
                        }
                        if (obj == null) {
                            if (bcx == null) {
                                bcx = r1.e.b();
                            }
                            r1.f = bcx;
                            r1.j = 0;
                            bdp = new bdp(r1.g, bcx);
                            a(bdp, false);
                        }
                    } else {
                        throw new IOException("Canceled");
                    }
                }
                if (obj != null) {
                    return bdp;
                }
                bdp.a(i, i2, i3, i4, z);
                h().b(bdp.b());
                synchronized (r1.g) {
                    r1.l = d;
                    bcz.a.b(r1.g, bdp);
                    if (bdp.f()) {
                        socket = bcz.a.a(r1.g, r1.a, r1);
                        bdp = r1.k;
                    }
                }
                bdb.a(socket);
                return bdp;
            }
        }
        obj2 = null;
        synchronized (r1.g) {
            if (r1.n) {
                throw new IOException("Canceled");
            }
            if (obj2 != null) {
                c = r1.e.c();
                size = c.size();
                for (i5 = 0; i5 < size; i5++) {
                    bcx2 = (bcx) c.get(i5);
                    bcz.a.a(r1.g, r1.a, r1, bcx2);
                    if (r1.k != null) {
                        bdp = r1.k;
                        r1.f = bcx2;
                        obj = 1;
                        break;
                    }
                }
            }
            if (obj == null) {
                if (bcx == null) {
                    bcx = r1.e.b();
                }
                r1.f = bcx;
                r1.j = 0;
                bdp = new bdp(r1.g, bcx);
                a(bdp, false);
            }
        }
        if (obj != null) {
            return bdp;
        }
        bdp.a(i, i2, i3, i4, z);
        h().b(bdp.b());
        synchronized (r1.g) {
            r1.l = d;
            bcz.a.b(r1.g, bdp);
            if (bdp.f()) {
                socket = bcz.a.a(r1.g, r1.a, r1);
                bdp = r1.k;
            }
        }
        bdb.a(socket);
        return bdp;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private defpackage.bdp a(int r4, int r5, int r6, int r7, boolean r8, boolean r9) {
        /*
        r3 = this;
    L_0x0000:
        r0 = r3.a(r4, r5, r6, r7, r8);
        r1 = r3.g;
        monitor-enter(r1);
        r2 = r0.b;	 Catch:{ all -> 0x0019 }
        if (r2 != 0) goto L_0x000d;
    L_0x000b:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        return r0;
    L_0x000d:
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        r1 = r0.a(r9);
        if (r1 != 0) goto L_0x0018;
    L_0x0014:
        r3.e();
        goto L_0x0000;
    L_0x0018:
        return r0;
    L_0x0019:
        r4 = move-exception;
        monitor-exit(r1);	 Catch:{ all -> 0x0019 }
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdu.a(int, int, int, int, boolean, boolean):bdp");
    }

    private Socket a(boolean z, boolean z2, boolean z3) {
        if (!d) {
            if (!Thread.holdsLock(this.g)) {
                throw new AssertionError();
            }
        }
        if (z3) {
            this.o = null;
        }
        if (z2) {
            this.m = d;
        }
        bdp bdp = this.k;
        if (bdp != null) {
            if (z) {
                bdp.a = d;
            }
            if (this.o == null && (this.m || this.k.a)) {
                Socket d;
                b(this.k);
                if (this.k.d.isEmpty()) {
                    this.k.e = System.nanoTime();
                    if (bcz.a.a(this.g, this.k)) {
                        d = this.k.d();
                        this.k = null;
                        return d;
                    }
                }
                d = null;
                this.k = null;
                return d;
            }
        }
        return null;
    }

    private void b(bdp bdp) {
        int size = bdp.d.size();
        for (int i = 0; i < size; i++) {
            if (((Reference) bdp.d.get(i)).get() == this) {
                bdp.d.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    private bdq h() {
        return bcz.a.a(this.g);
    }

    public final bdz a() {
        bdz bdz;
        synchronized (this.g) {
            bdz = this.o;
        }
        return bdz;
    }

    public final bdz a(bch bch, bcc bcc, boolean z) {
        try {
            bdz a = a(bcc.c(), bcc.d(), bcc.e(), bch.a(), bch.o(), z).a(bch, bcc, this);
            synchronized (this.g) {
                this.o = a;
            }
            return a;
        } catch (IOException e) {
            throw new bdr(e);
        }
    }

    public final Socket a(bdp bdp) {
        if (!d) {
            if (!Thread.holdsLock(this.g)) {
                throw new AssertionError();
            }
        }
        if (this.o == null && this.k.d.size() == 1) {
            Reference reference = (Reference) this.k.d.get(0);
            Socket a = a((boolean) d, false, false);
            this.k = bdp;
            bdp.d.add(reference);
            return a;
        }
        throw new IllegalStateException();
    }

    public final void a(bdp bdp, boolean z) {
        if (!d) {
            if (!Thread.holdsLock(this.g)) {
                throw new AssertionError();
            }
        }
        if (this.k == null) {
            this.k = bdp;
            this.l = z;
            bdp.d.add(new bdv(this, this.h));
            return;
        }
        throw new IllegalStateException();
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.io.IOException r7) {
        /*
        r6 = this;
        r0 = r6.g;
        monitor-enter(r0);
        r1 = r7 instanceof defpackage.bgc;	 Catch:{ all -> 0x0053 }
        r2 = 0;
        r3 = 0;
        r4 = 1;
        if (r1 == 0) goto L_0x0023;
    L_0x000a:
        r7 = (defpackage.bgc) r7;	 Catch:{ all -> 0x0053 }
        r7 = r7.a;	 Catch:{ all -> 0x0053 }
        r1 = defpackage.bes.REFUSED_STREAM;	 Catch:{ all -> 0x0053 }
        if (r7 != r1) goto L_0x001c;
    L_0x0012:
        r7 = r6.j;	 Catch:{ all -> 0x0053 }
        r7 = r7 + r4;
        r6.j = r7;	 Catch:{ all -> 0x0053 }
        r7 = r6.j;	 Catch:{ all -> 0x0053 }
        if (r7 <= r4) goto L_0x0049;
    L_0x001b:
        goto L_0x0020;
    L_0x001c:
        r1 = defpackage.bes.CANCEL;	 Catch:{ all -> 0x0053 }
        if (r7 == r1) goto L_0x0049;
    L_0x0020:
        r6.f = r2;	 Catch:{ all -> 0x0053 }
        goto L_0x0047;
    L_0x0023:
        r1 = r6.k;	 Catch:{ all -> 0x0053 }
        if (r1 == 0) goto L_0x0049;
    L_0x0027:
        r1 = r6.k;	 Catch:{ all -> 0x0053 }
        r1 = r1.f();	 Catch:{ all -> 0x0053 }
        if (r1 == 0) goto L_0x0033;
    L_0x002f:
        r1 = r7 instanceof defpackage.ber;	 Catch:{ all -> 0x0053 }
        if (r1 == 0) goto L_0x0049;
    L_0x0033:
        r1 = r6.k;	 Catch:{ all -> 0x0053 }
        r1 = r1.b;	 Catch:{ all -> 0x0053 }
        if (r1 != 0) goto L_0x0047;
    L_0x0039:
        r1 = r6.f;	 Catch:{ all -> 0x0053 }
        if (r1 == 0) goto L_0x0020;
    L_0x003d:
        if (r7 == 0) goto L_0x0020;
    L_0x003f:
        r1 = r6.i;	 Catch:{ all -> 0x0053 }
        r5 = r6.f;	 Catch:{ all -> 0x0053 }
        r1.a(r5, r7);	 Catch:{ all -> 0x0053 }
        goto L_0x0020;
    L_0x0047:
        r7 = 1;
        goto L_0x004a;
    L_0x0049:
        r7 = 0;
    L_0x004a:
        r7 = r6.a(r7, r3, r4);	 Catch:{ all -> 0x0053 }
        monitor-exit(r0);	 Catch:{ all -> 0x0053 }
        defpackage.bdb.a(r7);
        return;
    L_0x0053:
        r7 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0053 }
        throw r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdu.a(java.io.IOException):void");
    }

    public final void a(boolean z, bdz bdz) {
        Socket a;
        synchronized (this.g) {
            if (bdz != null) {
                if (bdz == this.o) {
                    if (!z) {
                        bdp bdp = this.k;
                        bdp.b++;
                    }
                    a = a(z, false, (boolean) d);
                }
            }
            StringBuilder stringBuilder = new StringBuilder("expected ");
            stringBuilder.append(this.o);
            stringBuilder.append(" but was ");
            stringBuilder.append(bdz);
            throw new IllegalStateException(stringBuilder.toString());
        }
        bdb.a(a);
    }

    public final bcx b() {
        return this.f;
    }

    public final synchronized bdp c() {
        return this.k;
    }

    public final void d() {
        Socket a;
        synchronized (this.g) {
            a = a(false, (boolean) d, false);
        }
        bdb.a(a);
    }

    public final void e() {
        Socket a;
        synchronized (this.g) {
            a = a((boolean) d, false, false);
        }
        bdb.a(a);
    }

    public final void f() {
        synchronized (this.g) {
            this.n = d;
            bdz bdz = this.o;
            bdp bdp = this.k;
        }
        if (bdz != null) {
            bdz.c();
            return;
        }
        if (bdp != null) {
            bdp.c();
        }
    }

    public final boolean g() {
        if (this.f == null) {
            bdt bdt = this.e;
            if (bdt == null || !bdt.a()) {
                if (!this.i.a()) {
                    return false;
                }
            }
        }
        return d;
    }

    public final String toString() {
        bdp c = c();
        return c != null ? c.toString() : this.a.toString();
    }
}
