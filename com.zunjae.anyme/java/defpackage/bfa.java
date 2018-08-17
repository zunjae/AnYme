package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class bfa implements Closeable {
    static final /* synthetic */ boolean r = true;
    private static final ExecutorService s = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), bdb.a("OkHttp Http2Connection", (boolean) r));
    final boolean a;
    final bfi b;
    final Map<Integer, bfs> c = new LinkedHashMap();
    final String d;
    int e;
    int f;
    boolean g;
    final bfz h;
    long i = 0;
    long j;
    bgb k = new bgb();
    final bgb l = new bgb();
    boolean m = false;
    final Socket n;
    final bfw o;
    final bfl p;
    final Set<Integer> q = new LinkedHashSet();
    private final ScheduledExecutorService t;
    private final ExecutorService u;
    private boolean v;

    bfa(bfh bfh) {
        bfh bfh2 = bfh;
        this.h = bfh2.f;
        boolean z = bfh2.g;
        this.a = z;
        this.b = bfh2.e;
        r0.f = z ? 1 : 2;
        if (bfh2.g) {
            r0.f += 2;
        }
        if (bfh2.g) {
            r0.k.a(7, 16777216);
        }
        r0.d = bfh2.b;
        r0.t = new ScheduledThreadPoolExecutor(1, bdb.a(bdb.a("OkHttp %s Writer", r0.d), false));
        if (bfh2.h != 0) {
            ScheduledExecutorService scheduledExecutorService = r0.t;
            Runnable bfk = new bfk(r0, false, 0, 0);
            int i = bfh2.h;
            scheduledExecutorService.scheduleAtFixedRate(bfk, (long) i, (long) i, TimeUnit.MILLISECONDS);
        }
        r0.u = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), bdb.a(bdb.a("OkHttp %s Push Observer", r0.d), (boolean) r));
        r0.l.a(7, 65535);
        r0.l.a(5, 16384);
        r0.j = (long) r0.l.d();
        r0.n = bfh2.a;
        r0.o = new bfw(bfh2.d, r0.a);
        r0.p = new bfl(r0, new bfp(bfh2.c, r0.a));
    }

    private synchronized void a(bda bda) {
        if (!c()) {
            this.u.execute(bda);
        }
    }

    private void a(bes bes) {
        synchronized (this.o) {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = r;
                int i = this.e;
                this.o.a(i, bes, bdb.a);
            }
        }
    }

    private bfs b(List<bet> list, boolean z) {
        bfs bfs;
        Object obj;
        boolean z2 = z ^ 1;
        synchronized (this.o) {
            int i;
            synchronized (this) {
                if (this.f > 1073741823) {
                    a(bes.REFUSED_STREAM);
                }
                if (this.g) {
                    throw new ber();
                }
                i = this.f;
                this.f += 2;
                bfs = new bfs(i, this, z2, false, list);
                if (z && this.j != 0) {
                    if (bfs.b != 0) {
                        obj = null;
                        if (bfs.a()) {
                            this.c.put(Integer.valueOf(i), bfs);
                        }
                    }
                }
                obj = 1;
                if (bfs.a()) {
                    this.c.put(Integer.valueOf(i), bfs);
                }
            }
            this.o.a(z2, i, (List) list);
        }
        if (obj != null) {
            this.o.b();
        }
        return bfs;
    }

    static boolean c(int i) {
        return (i == 0 || (i & 1) != 0) ? false : r;
    }

    private void e() {
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
        r1 = this;
        r0 = defpackage.bes.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0005 }
        r1.a(r0, r0);	 Catch:{ IOException -> 0x0005 }
    L_0x0005:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfa.e():void");
    }

    public final synchronized int a() {
        return this.l.c();
    }

    final synchronized bfs a(int i) {
        return (bfs) this.c.get(Integer.valueOf(i));
    }

    public final bfs a(List<bet> list, boolean z) {
        return b((List) list, z);
    }

    final void a(int r10, long r11) {
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
        r9 = this;
        r0 = r9.t;	 Catch:{ RejectedExecutionException -> 0x001f }
        r8 = new bfc;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp Window Update %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9.d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r10);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r11;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r8);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfa.a(int, long):void");
    }

    final void a(int r9, defpackage.bes r10) {
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
        r8 = this;
        r0 = r8.t;	 Catch:{ RejectedExecutionException -> 0x001f }
        r7 = new bfb;	 Catch:{ RejectedExecutionException -> 0x001f }
        r3 = "OkHttp %s stream %d";	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8.d;	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x001f }
        r4[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1 = r7;	 Catch:{ RejectedExecutionException -> 0x001f }
        r2 = r8;	 Catch:{ RejectedExecutionException -> 0x001f }
        r5 = r9;	 Catch:{ RejectedExecutionException -> 0x001f }
        r6 = r10;	 Catch:{ RejectedExecutionException -> 0x001f }
        r1.<init>(r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001f }
        r0.execute(r7);	 Catch:{ RejectedExecutionException -> 0x001f }
    L_0x001f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfa.a(int, bes):void");
    }

    final void a(int i, bhh bhh, int i2, boolean z) {
        bhd bhd = new bhd();
        long j = (long) i2;
        bhh.a(j);
        bhh.a(bhd, j);
        if (bhd.b() == j) {
            a(new bff(this, "OkHttp %s Push Data[%s]", new Object[]{this.d, Integer.valueOf(i)}, i, bhd, i2, z));
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(bhd.b());
        stringBuilder.append(" != ");
        stringBuilder.append(i2);
        throw new IOException(stringBuilder.toString());
    }

    final void a(int r9, java.util.List<defpackage.bet> r10) {
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
        r8 = this;
        monitor-enter(r8);
        r0 = r8.q;	 Catch:{ all -> 0x003c }
        r1 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003c }
        r0 = r0.contains(r1);	 Catch:{ all -> 0x003c }
        if (r0 == 0) goto L_0x0014;	 Catch:{ all -> 0x003c }
    L_0x000d:
        r10 = defpackage.bes.PROTOCOL_ERROR;	 Catch:{ all -> 0x003c }
        r8.a(r9, r10);	 Catch:{ all -> 0x003c }
        monitor-exit(r8);	 Catch:{ all -> 0x003c }
        return;	 Catch:{ all -> 0x003c }
    L_0x0014:
        r0 = r8.q;	 Catch:{ all -> 0x003c }
        r1 = java.lang.Integer.valueOf(r9);	 Catch:{ all -> 0x003c }
        r0.add(r1);	 Catch:{ all -> 0x003c }
        monitor-exit(r8);	 Catch:{ all -> 0x003c }
        r0 = new bfd;	 Catch:{ RejectedExecutionException -> 0x003b }
        r4 = "OkHttp %s Push Request[%s]";	 Catch:{ RejectedExecutionException -> 0x003b }
        r1 = 2;	 Catch:{ RejectedExecutionException -> 0x003b }
        r5 = new java.lang.Object[r1];	 Catch:{ RejectedExecutionException -> 0x003b }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x003b }
        r2 = r8.d;	 Catch:{ RejectedExecutionException -> 0x003b }
        r5[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x003b }
        r1 = 1;	 Catch:{ RejectedExecutionException -> 0x003b }
        r2 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x003b }
        r5[r1] = r2;	 Catch:{ RejectedExecutionException -> 0x003b }
        r2 = r0;	 Catch:{ RejectedExecutionException -> 0x003b }
        r3 = r8;	 Catch:{ RejectedExecutionException -> 0x003b }
        r6 = r9;	 Catch:{ RejectedExecutionException -> 0x003b }
        r7 = r10;	 Catch:{ RejectedExecutionException -> 0x003b }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ RejectedExecutionException -> 0x003b }
        r8.a(r0);	 Catch:{ RejectedExecutionException -> 0x003b }
    L_0x003b:
        return;
    L_0x003c:
        r9 = move-exception;
        monitor-exit(r8);	 Catch:{ all -> 0x003c }
        throw r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfa.a(int, java.util.List):void");
    }

    final void a(int r9, java.util.List<defpackage.bet> r10, boolean r11) {
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
        r8 = this;
        r7 = new bfe;	 Catch:{ RejectedExecutionException -> 0x001e }
        r2 = "OkHttp %s Push Headers[%s]";	 Catch:{ RejectedExecutionException -> 0x001e }
        r0 = 2;	 Catch:{ RejectedExecutionException -> 0x001e }
        r3 = new java.lang.Object[r0];	 Catch:{ RejectedExecutionException -> 0x001e }
        r0 = 0;	 Catch:{ RejectedExecutionException -> 0x001e }
        r1 = r8.d;	 Catch:{ RejectedExecutionException -> 0x001e }
        r3[r0] = r1;	 Catch:{ RejectedExecutionException -> 0x001e }
        r0 = 1;	 Catch:{ RejectedExecutionException -> 0x001e }
        r1 = java.lang.Integer.valueOf(r9);	 Catch:{ RejectedExecutionException -> 0x001e }
        r3[r0] = r1;	 Catch:{ RejectedExecutionException -> 0x001e }
        r0 = r7;	 Catch:{ RejectedExecutionException -> 0x001e }
        r1 = r8;	 Catch:{ RejectedExecutionException -> 0x001e }
        r4 = r9;	 Catch:{ RejectedExecutionException -> 0x001e }
        r5 = r10;	 Catch:{ RejectedExecutionException -> 0x001e }
        r6 = r11;	 Catch:{ RejectedExecutionException -> 0x001e }
        r0.<init>(r1, r2, r3, r4, r5, r6);	 Catch:{ RejectedExecutionException -> 0x001e }
        r8.a(r7);	 Catch:{ RejectedExecutionException -> 0x001e }
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfa.a(int, java.util.List, boolean):void");
    }

    public final void a(int r9, boolean r10, defpackage.bhd r11, long r12) {
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
        r8 = this;
        r0 = 0;
        r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        r3 = 0;
        if (r2 != 0) goto L_0x000d;
    L_0x0007:
        r12 = r8.o;
        r12.a(r10, r9, r11, r3);
        return;
    L_0x000d:
        r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r2 <= 0) goto L_0x006a;
    L_0x0011:
        monitor-enter(r8);
    L_0x0012:
        r4 = r8.j;	 Catch:{ InterruptedException -> 0x005b }
        r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1));	 Catch:{ InterruptedException -> 0x005b }
        if (r2 > 0) goto L_0x0030;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0018:
        r2 = r8.c;	 Catch:{ InterruptedException -> 0x005b }
        r4 = java.lang.Integer.valueOf(r9);	 Catch:{ InterruptedException -> 0x005b }
        r2 = r2.containsKey(r4);	 Catch:{ InterruptedException -> 0x005b }
        if (r2 == 0) goto L_0x0028;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0024:
        r8.wait();	 Catch:{ InterruptedException -> 0x005b }
        goto L_0x0012;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0028:
        r9 = new java.io.IOException;	 Catch:{ InterruptedException -> 0x005b }
        r10 = "stream closed";	 Catch:{ InterruptedException -> 0x005b }
        r9.<init>(r10);	 Catch:{ InterruptedException -> 0x005b }
        throw r9;	 Catch:{ InterruptedException -> 0x005b }
    L_0x0030:
        r4 = r8.j;	 Catch:{ all -> 0x0059 }
        r4 = java.lang.Math.min(r12, r4);	 Catch:{ all -> 0x0059 }
        r2 = (int) r4;	 Catch:{ all -> 0x0059 }
        r4 = r8.o;	 Catch:{ all -> 0x0059 }
        r4 = r4.c();	 Catch:{ all -> 0x0059 }
        r2 = java.lang.Math.min(r2, r4);	 Catch:{ all -> 0x0059 }
        r4 = r8.j;	 Catch:{ all -> 0x0059 }
        r6 = (long) r2;	 Catch:{ all -> 0x0059 }
        r4 = r4 - r6;	 Catch:{ all -> 0x0059 }
        r8.j = r4;	 Catch:{ all -> 0x0059 }
        monitor-exit(r8);	 Catch:{ all -> 0x0059 }
        r4 = 0;
        r12 = r12 - r6;
        r4 = r8.o;
        if (r10 == 0) goto L_0x0054;
    L_0x004e:
        r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1));
        if (r5 != 0) goto L_0x0054;
    L_0x0052:
        r5 = 1;
        goto L_0x0055;
    L_0x0054:
        r5 = 0;
    L_0x0055:
        r4.a(r5, r9, r11, r2);
        goto L_0x000d;
    L_0x0059:
        r9 = move-exception;
        goto L_0x0068;
    L_0x005b:
        r9 = java.lang.Thread.currentThread();	 Catch:{ all -> 0x0059 }
        r9.interrupt();	 Catch:{ all -> 0x0059 }
        r9 = new java.io.InterruptedIOException;	 Catch:{ all -> 0x0059 }
        r9.<init>();	 Catch:{ all -> 0x0059 }
        throw r9;	 Catch:{ all -> 0x0059 }
    L_0x0068:
        monitor-exit(r8);	 Catch:{ all -> 0x0059 }
        throw r9;
    L_0x006a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfa.a(int, boolean, bhd, long):void");
    }

    final synchronized void a(long j) {
        this.i += j;
        if (this.i >= ((long) (this.k.d() / 2))) {
            a(0, this.i);
            this.i = 0;
        }
    }

    final void a(bes bes, bes bes2) {
        IOException iOException;
        if (!r) {
            if (Thread.holdsLock(this)) {
                throw new AssertionError();
            }
        }
        bfs[] bfsArr = null;
        try {
            a(bes);
            iOException = null;
        } catch (IOException e) {
            iOException = e;
        }
        synchronized (this) {
            if (!this.c.isEmpty()) {
                bfsArr = (bfs[]) this.c.values().toArray(new bfs[this.c.size()]);
                this.c.clear();
            }
        }
        if (bfsArr != null) {
            for (bfs a : bfsArr) {
                try {
                    a.a(bes2);
                } catch (IOException e2) {
                    if (iOException != null) {
                        iOException = e2;
                    }
                }
            }
        }
        try {
            this.o.close();
        } catch (IOException e3) {
            if (iOException == null) {
                iOException = e3;
            }
        }
        try {
            this.n.close();
        } catch (IOException e4) {
            iOException = e4;
        }
        this.t.shutdown();
        this.u.shutdown();
        if (iOException != null) {
            throw iOException;
        }
    }

    final void a(boolean r3, int r4, int r5) {
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
        r2 = this;
        if (r3 != 0) goto L_0x0012;
    L_0x0002:
        monitor-enter(r2);
        r0 = r2.v;	 Catch:{ all -> 0x000f }
        r1 = 1;	 Catch:{ all -> 0x000f }
        r2.v = r1;	 Catch:{ all -> 0x000f }
        monitor-exit(r2);	 Catch:{ all -> 0x000f }
        if (r0 == 0) goto L_0x0012;
    L_0x000b:
        r2.e();
        return;
    L_0x000f:
        r3 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x000f }
        throw r3;
    L_0x0012:
        r0 = r2.o;	 Catch:{ IOException -> 0x0018 }
        r0.a(r3, r4, r5);	 Catch:{ IOException -> 0x0018 }
        return;
    L_0x0018:
        r2.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfa.a(boolean, int, int):void");
    }

    final synchronized bfs b(int i) {
        bfs bfs;
        bfs = (bfs) this.c.remove(Integer.valueOf(i));
        notifyAll();
        return bfs;
    }

    public final void b() {
        this.o.a();
        this.o.b(this.k);
        int d = this.k.d();
        if (d != 65535) {
            this.o.a(0, (long) (d - 65535));
        }
        new Thread(this.p).start();
    }

    final void b(int i, bes bes) {
        this.o.a(i, bes);
    }

    final void c(int i, bes bes) {
        a(new bfg(this, "OkHttp %s Push Reset[%s]", new Object[]{this.d, Integer.valueOf(i)}, i, bes));
    }

    public final synchronized boolean c() {
        return this.g;
    }

    public final void close() {
        a(bes.NO_ERROR, bes.CANCEL);
    }
}
