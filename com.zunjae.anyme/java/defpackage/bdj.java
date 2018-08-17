package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

public final class bdj implements Closeable, Flushable {
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");
    static final /* synthetic */ boolean j = true;
    final bgd b;
    final int c;
    bhg d;
    final LinkedHashMap<String, bdl> e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    private long k;
    private long l;
    private final Executor m;
    private final Runnable n;

    private boolean a() {
        int i = this.f;
        return (i < 2000 || i < this.e.size()) ? false : j;
    }

    private boolean a(defpackage.bdl r7) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'jadx.core.dex.attributes.IAttribute jadx.core.dex.attributes.AttrNode.get(jadx.core.dex.attributes.AType)' on a null object reference
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.searchTryCatchDominators(ProcessTryCatchRegions.java:75)
	at jadx.core.dex.visitors.regions.ProcessTryCatchRegions.process(ProcessTryCatchRegions.java:45)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.postProcessRegions(RegionMakerVisitor.java:63)
	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:58)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:31)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r6 = this;
        r0 = r7.f;
        r1 = 0;
        if (r0 == 0) goto L_0x0025;
    L_0x0005:
        r2 = r0.a;
        r2 = r2.f;
        if (r2 != r0) goto L_0x0025;
    L_0x000b:
        r2 = 0;
    L_0x000c:
        r3 = r0.b;
        r4 = r3.c;
        if (r2 >= r4) goto L_0x0020;
    L_0x0012:
        r3 = r3.b;	 Catch:{ IOException -> 0x001d }
        r4 = r0.a;	 Catch:{ IOException -> 0x001d }
        r4 = r4.d;	 Catch:{ IOException -> 0x001d }
        r4 = r4[r2];	 Catch:{ IOException -> 0x001d }
        r3.a(r4);	 Catch:{ IOException -> 0x001d }
    L_0x001d:
        r2 = r2 + 1;
        goto L_0x000c;
    L_0x0020:
        r0 = r0.a;
        r2 = 0;
        r0.f = r2;
    L_0x0025:
        r0 = r6.c;
        if (r1 >= r0) goto L_0x0042;
    L_0x0029:
        r0 = r6.b;
        r2 = r7.c;
        r2 = r2[r1];
        r0.a(r2);
        r2 = r6.l;
        r0 = r7.b;
        r4 = r0[r1];
        r2 = r2 - r4;
        r6.l = r2;
        r2 = 0;
        r0[r1] = r2;
        r1 = r1 + 1;
        goto L_0x0025;
    L_0x0042:
        r0 = r6.f;
        r1 = 1;
        r0 = r0 + r1;
        r6.f = r0;
        r0 = r6.d;
        r2 = "REMOVE";
        r0 = r0.b(r2);
        r2 = 32;
        r0 = r0.h(r2);
        r2 = r7.a;
        r0 = r0.b(r2);
        r2 = 10;
        r0.h(r2);
        r0 = r6.e;
        r7 = r7.a;
        r0.remove(r7);
        r7 = r6.a();
        if (r7 == 0) goto L_0x0075;
    L_0x006e:
        r7 = r6.m;
        r0 = r6.n;
        r7.execute(r0);
    L_0x0075:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdj.a(bdl):boolean");
    }

    private synchronized boolean b() {
        return this.h;
    }

    private synchronized void c() {
        if (b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void d() {
        while (this.l > this.k) {
            a((bdl) this.e.values().iterator().next());
        }
        this.i = false;
    }

    final synchronized void a(bdk bdk) {
        bdl bdl = bdk.a;
        if (bdl.f == bdk) {
            bhg bhg;
            for (int i = 0; i < this.c; i++) {
                this.b.a(bdl.d[i]);
            }
            this.f++;
            bdl.f = null;
            if ((0 | bdl.e) != 0) {
                bdl.e = j;
                this.d.b("CLEAN").h(32);
                this.d.b(bdl.a);
                bdl.a(this.d);
                bhg = this.d;
            } else {
                this.e.remove(bdl.a);
                this.d.b("REMOVE").h(32);
                this.d.b(bdl.a);
                bhg = this.d;
            }
            bhg.h(10);
            this.d.flush();
            if (this.l > this.k || a()) {
                this.m.execute(this.n);
            }
        } else {
            throw new IllegalStateException();
        }
    }

    public final synchronized void close() {
        if (this.g) {
            if (!this.h) {
                for (bdl bdl : (bdl[]) this.e.values().toArray(new bdl[this.e.size()])) {
                    if (bdl.f != null) {
                        bdl.f.a();
                    }
                }
                d();
                this.d.close();
                this.d = null;
                this.h = j;
                return;
            }
        }
        this.h = j;
    }

    public final synchronized void flush() {
        if (this.g) {
            c();
            d();
            this.d.flush();
        }
    }
}
