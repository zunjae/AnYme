package defpackage;

import java.util.List;

final class bfl extends bda implements bfr {
    final bfp a;
    final /* synthetic */ bfa c;

    bfl(bfa bfa, bfp bfp) {
        this.c = bfa;
        super("OkHttp %s", bfa.d);
        this.a = bfp;
    }

    public final void a(int i) {
        synchronized (this.c) {
            bfs[] bfsArr = (bfs[]) this.c.c.values().toArray(new bfs[this.c.c.size()]);
            this.c.g = true;
        }
        for (bfs bfs : bfsArr) {
            if (bfs.c > i && bfs.b()) {
                bfs.c(bes.REFUSED_STREAM);
                this.c.b(bfs.c);
            }
        }
    }

    public final void a(int i, long j) {
        if (i == 0) {
            synchronized (this.c) {
                bfa bfa = this.c;
                bfa.j += j;
                this.c.notifyAll();
            }
            return;
        }
        bfs a = this.c.a(i);
        if (a != null) {
            synchronized (a) {
                a.a(j);
            }
        }
    }

    public final void a(int i, bes bes) {
        if (bfa.c(i)) {
            this.c.c(i, bes);
            return;
        }
        bfs b = this.c.b(i);
        if (b != null) {
            b.c(bes);
        }
    }

    public final void a(int i, List<bet> list) {
        this.c.a(i, (List) list);
    }

    public final void a(defpackage.bgb r12) {
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
        r11 = this;
        r0 = r11.c;
        monitor-enter(r0);
        r1 = r11.c;	 Catch:{ all -> 0x00ad }
        r1 = r1.l;	 Catch:{ all -> 0x00ad }
        r1 = r1.d();	 Catch:{ all -> 0x00ad }
        r2 = r11.c;	 Catch:{ all -> 0x00ad }
        r2 = r2.l;	 Catch:{ all -> 0x00ad }
        r3 = 0;	 Catch:{ all -> 0x00ad }
        r4 = 0;	 Catch:{ all -> 0x00ad }
    L_0x0011:
        r5 = 10;	 Catch:{ all -> 0x00ad }
        if (r4 >= r5) goto L_0x0025;	 Catch:{ all -> 0x00ad }
    L_0x0015:
        r5 = r12.a(r4);	 Catch:{ all -> 0x00ad }
        if (r5 == 0) goto L_0x0022;	 Catch:{ all -> 0x00ad }
    L_0x001b:
        r5 = r12.b(r4);	 Catch:{ all -> 0x00ad }
        r2.a(r4, r5);	 Catch:{ all -> 0x00ad }
    L_0x0022:
        r4 = r4 + 1;
        goto L_0x0011;
    L_0x0025:
        r2 = 1;
        r4 = r11.c;	 Catch:{ RejectedExecutionException -> 0x003e }
        r4 = r4.t;	 Catch:{ RejectedExecutionException -> 0x003e }
        r5 = new bfo;	 Catch:{ RejectedExecutionException -> 0x003e }
        r6 = "OkHttp %s ACK Settings";	 Catch:{ RejectedExecutionException -> 0x003e }
        r7 = new java.lang.Object[r2];	 Catch:{ RejectedExecutionException -> 0x003e }
        r8 = r11.c;	 Catch:{ RejectedExecutionException -> 0x003e }
        r8 = r8.d;	 Catch:{ RejectedExecutionException -> 0x003e }
        r7[r3] = r8;	 Catch:{ RejectedExecutionException -> 0x003e }
        r5.<init>(r11, r6, r7, r12);	 Catch:{ RejectedExecutionException -> 0x003e }
        r4.execute(r5);	 Catch:{ RejectedExecutionException -> 0x003e }
    L_0x003e:
        r12 = r11.c;	 Catch:{ all -> 0x00ad }
        r12 = r12.l;	 Catch:{ all -> 0x00ad }
        r12 = r12.d();	 Catch:{ all -> 0x00ad }
        r4 = -1;	 Catch:{ all -> 0x00ad }
        r5 = 0;	 Catch:{ all -> 0x00ad }
        r7 = 0;	 Catch:{ all -> 0x00ad }
        if (r12 == r4) goto L_0x007e;	 Catch:{ all -> 0x00ad }
    L_0x004c:
        if (r12 == r1) goto L_0x007e;	 Catch:{ all -> 0x00ad }
    L_0x004e:
        r12 = r12 - r1;	 Catch:{ all -> 0x00ad }
        r8 = (long) r12;	 Catch:{ all -> 0x00ad }
        r12 = r11.c;	 Catch:{ all -> 0x00ad }
        r12 = r12.m;	 Catch:{ all -> 0x00ad }
        if (r12 != 0) goto L_0x005a;	 Catch:{ all -> 0x00ad }
    L_0x0056:
        r12 = r11.c;	 Catch:{ all -> 0x00ad }
        r12.m = r2;	 Catch:{ all -> 0x00ad }
    L_0x005a:
        r12 = r11.c;	 Catch:{ all -> 0x00ad }
        r12 = r12.c;	 Catch:{ all -> 0x00ad }
        r12 = r12.isEmpty();	 Catch:{ all -> 0x00ad }
        if (r12 != 0) goto L_0x007f;	 Catch:{ all -> 0x00ad }
    L_0x0064:
        r12 = r11.c;	 Catch:{ all -> 0x00ad }
        r12 = r12.c;	 Catch:{ all -> 0x00ad }
        r12 = r12.values();	 Catch:{ all -> 0x00ad }
        r1 = r11.c;	 Catch:{ all -> 0x00ad }
        r1 = r1.c;	 Catch:{ all -> 0x00ad }
        r1 = r1.size();	 Catch:{ all -> 0x00ad }
        r1 = new defpackage.bfs[r1];	 Catch:{ all -> 0x00ad }
        r12 = r12.toArray(r1);	 Catch:{ all -> 0x00ad }
        r7 = r12;	 Catch:{ all -> 0x00ad }
        r7 = (defpackage.bfs[]) r7;	 Catch:{ all -> 0x00ad }
        goto L_0x007f;	 Catch:{ all -> 0x00ad }
    L_0x007e:
        r8 = r5;	 Catch:{ all -> 0x00ad }
    L_0x007f:
        r12 = defpackage.bfa.s;	 Catch:{ all -> 0x00ad }
        r1 = new bfn;	 Catch:{ all -> 0x00ad }
        r4 = "OkHttp %s settings";	 Catch:{ all -> 0x00ad }
        r2 = new java.lang.Object[r2];	 Catch:{ all -> 0x00ad }
        r10 = r11.c;	 Catch:{ all -> 0x00ad }
        r10 = r10.d;	 Catch:{ all -> 0x00ad }
        r2[r3] = r10;	 Catch:{ all -> 0x00ad }
        r1.<init>(r11, r4, r2);	 Catch:{ all -> 0x00ad }
        r12.execute(r1);	 Catch:{ all -> 0x00ad }
        monitor-exit(r0);	 Catch:{ all -> 0x00ad }
        if (r7 == 0) goto L_0x00ac;
    L_0x0098:
        r12 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1));
        if (r12 == 0) goto L_0x00ac;
    L_0x009c:
        r12 = r7.length;
    L_0x009d:
        if (r3 >= r12) goto L_0x00ac;
    L_0x009f:
        r0 = r7[r3];
        monitor-enter(r0);
        r0.a(r8);	 Catch:{ all -> 0x00a9 }
        monitor-exit(r0);	 Catch:{ all -> 0x00a9 }
        r3 = r3 + 1;	 Catch:{ all -> 0x00a9 }
        goto L_0x009d;	 Catch:{ all -> 0x00a9 }
    L_0x00a9:
        r12 = move-exception;	 Catch:{ all -> 0x00a9 }
        monitor-exit(r0);	 Catch:{ all -> 0x00a9 }
        throw r12;
    L_0x00ac:
        return;
    L_0x00ad:
        r12 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x00ad }
        throw r12;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfl.a(bgb):void");
    }

    public final void a(boolean r4, int r5, int r6) {
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
        r3 = this;
        if (r4 == 0) goto L_0x0014;
    L_0x0002:
        r4 = r3.c;
        monitor-enter(r4);
        r5 = r3.c;	 Catch:{ all -> 0x0011 }
        r5.v = false;	 Catch:{ all -> 0x0011 }
        r5 = r3.c;	 Catch:{ all -> 0x0011 }
        r5.notifyAll();	 Catch:{ all -> 0x0011 }
        monitor-exit(r4);	 Catch:{ all -> 0x0011 }
        return;	 Catch:{ all -> 0x0011 }
    L_0x0011:
        r5 = move-exception;	 Catch:{ all -> 0x0011 }
        monitor-exit(r4);	 Catch:{ all -> 0x0011 }
        throw r5;
    L_0x0014:
        r4 = r3.c;	 Catch:{ RejectedExecutionException -> 0x0025 }
        r4 = r4.t;	 Catch:{ RejectedExecutionException -> 0x0025 }
        r0 = new bfk;	 Catch:{ RejectedExecutionException -> 0x0025 }
        r1 = r3.c;	 Catch:{ RejectedExecutionException -> 0x0025 }
        r2 = 1;	 Catch:{ RejectedExecutionException -> 0x0025 }
        r0.<init>(r1, r2, r5, r6);	 Catch:{ RejectedExecutionException -> 0x0025 }
        r4.execute(r0);	 Catch:{ RejectedExecutionException -> 0x0025 }
    L_0x0025:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfl.a(boolean, int, int):void");
    }

    public final void a(boolean z, int i, bhh bhh, int i2) {
        if (bfa.c(i)) {
            this.c.a(i, bhh, i2, z);
            return;
        }
        bfs a = this.c.a(i);
        if (a == null) {
            this.c.a(i, bes.PROTOCOL_ERROR);
            long j = (long) i2;
            this.c.a(j);
            bhh.h(j);
            return;
        }
        a.a(bhh, i2);
        if (z) {
            a.f();
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(boolean r11, int r12, java.util.List<defpackage.bet> r13) {
        /*
        r10 = this;
        r0 = defpackage.bfa.c(r12);
        if (r0 == 0) goto L_0x000c;
    L_0x0006:
        r0 = r10.c;
        r0.a(r12, r13, r11);
        return;
    L_0x000c:
        r0 = r10.c;
        monitor-enter(r0);
        r1 = r10.c;	 Catch:{ all -> 0x0078 }
        r1 = r1.a(r12);	 Catch:{ all -> 0x0078 }
        if (r1 != 0) goto L_0x006e;
    L_0x0017:
        r1 = r10.c;	 Catch:{ all -> 0x0078 }
        r1 = r1.g;	 Catch:{ all -> 0x0078 }
        if (r1 == 0) goto L_0x001f;
    L_0x001d:
        monitor-exit(r0);	 Catch:{ all -> 0x0078 }
        return;
    L_0x001f:
        r1 = r10.c;	 Catch:{ all -> 0x0078 }
        r1 = r1.e;	 Catch:{ all -> 0x0078 }
        if (r12 > r1) goto L_0x0027;
    L_0x0025:
        monitor-exit(r0);	 Catch:{ all -> 0x0078 }
        return;
    L_0x0027:
        r1 = r12 % 2;
        r2 = r10.c;	 Catch:{ all -> 0x0078 }
        r2 = r2.f;	 Catch:{ all -> 0x0078 }
        r3 = 2;
        r2 = r2 % r3;
        if (r1 != r2) goto L_0x0033;
    L_0x0031:
        monitor-exit(r0);	 Catch:{ all -> 0x0078 }
        return;
    L_0x0033:
        r1 = new bfs;	 Catch:{ all -> 0x0078 }
        r6 = r10.c;	 Catch:{ all -> 0x0078 }
        r7 = 0;
        r4 = r1;
        r5 = r12;
        r8 = r11;
        r9 = r13;
        r4.<init>(r5, r6, r7, r8, r9);	 Catch:{ all -> 0x0078 }
        r11 = r10.c;	 Catch:{ all -> 0x0078 }
        r11.e = r12;	 Catch:{ all -> 0x0078 }
        r11 = r10.c;	 Catch:{ all -> 0x0078 }
        r11 = r11.c;	 Catch:{ all -> 0x0078 }
        r13 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x0078 }
        r11.put(r13, r1);	 Catch:{ all -> 0x0078 }
        r11 = defpackage.bfa.s;	 Catch:{ all -> 0x0078 }
        r13 = new bfm;	 Catch:{ all -> 0x0078 }
        r2 = "OkHttp %s stream %d";
        r3 = new java.lang.Object[r3];	 Catch:{ all -> 0x0078 }
        r4 = 0;
        r5 = r10.c;	 Catch:{ all -> 0x0078 }
        r5 = r5.d;	 Catch:{ all -> 0x0078 }
        r3[r4] = r5;	 Catch:{ all -> 0x0078 }
        r4 = 1;
        r12 = java.lang.Integer.valueOf(r12);	 Catch:{ all -> 0x0078 }
        r3[r4] = r12;	 Catch:{ all -> 0x0078 }
        r13.<init>(r10, r2, r3, r1);	 Catch:{ all -> 0x0078 }
        r11.execute(r13);	 Catch:{ all -> 0x0078 }
        monitor-exit(r0);	 Catch:{ all -> 0x0078 }
        return;
    L_0x006e:
        monitor-exit(r0);	 Catch:{ all -> 0x0078 }
        r1.a(r13);
        if (r11 == 0) goto L_0x0077;
    L_0x0074:
        r1.f();
    L_0x0077:
        return;
    L_0x0078:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0078 }
        throw r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfl.a(boolean, int, java.util.List):void");
    }

    protected final void b() {
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
        r5 = this;
        r0 = defpackage.bes.INTERNAL_ERROR;
        r1 = r5.a;	 Catch:{ IOException -> 0x0022, all -> 0x001f }
        r1.a(r5);	 Catch:{ IOException -> 0x0022, all -> 0x001f }
    L_0x0007:
        r1 = r5.a;	 Catch:{ IOException -> 0x0022, all -> 0x001f }
        r2 = 0;	 Catch:{ IOException -> 0x0022, all -> 0x001f }
        r1 = r1.a(r2, r5);	 Catch:{ IOException -> 0x0022, all -> 0x001f }
        if (r1 != 0) goto L_0x0007;	 Catch:{ IOException -> 0x0022, all -> 0x001f }
    L_0x0010:
        r1 = defpackage.bes.NO_ERROR;	 Catch:{ IOException -> 0x0022, all -> 0x001f }
        r2 = defpackage.bes.CANCEL;	 Catch:{ IOException -> 0x0023 }
        r0 = r5.c;	 Catch:{ IOException -> 0x0019 }
        r0.a(r1, r2);	 Catch:{ IOException -> 0x0019 }
    L_0x0019:
        r0 = r5.a;
        defpackage.bdb.a(r0);
        return;
    L_0x001f:
        r2 = move-exception;
        r1 = r0;
        goto L_0x0033;
    L_0x0022:
        r1 = r0;
    L_0x0023:
        r2 = defpackage.bes.PROTOCOL_ERROR;	 Catch:{ all -> 0x0032 }
        r1 = defpackage.bes.PROTOCOL_ERROR;	 Catch:{ all -> 0x002d }
        r0 = r5.c;	 Catch:{ IOException -> 0x0019 }
        r0.a(r2, r1);	 Catch:{ IOException -> 0x0019 }
        goto L_0x0019;
    L_0x002d:
        r1 = move-exception;
        r4 = r2;
        r2 = r1;
        r1 = r4;
        goto L_0x0033;
    L_0x0032:
        r2 = move-exception;
    L_0x0033:
        r3 = r5.c;	 Catch:{ IOException -> 0x0038 }
        r3.a(r1, r0);	 Catch:{ IOException -> 0x0038 }
    L_0x0038:
        r0 = r5.a;
        defpackage.bdb.a(r0);
        throw r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfl.b():void");
    }
}
