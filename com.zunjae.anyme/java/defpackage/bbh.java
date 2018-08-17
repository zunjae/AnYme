package defpackage;

final class bbh implements Runnable {
    final /* synthetic */ bbg a;

    bbh(bbg bbg) {
        this.a = bbg;
    }

    public final void run() {
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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r6 = this;
    L_0x0000:
        r0 = r6.a;
        r1 = java.lang.System.nanoTime();
        r0 = r0.a(r1);
        r2 = -1;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x0011;
    L_0x0010:
        return;
    L_0x0011:
        r2 = 0;
        r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1));
        if (r4 <= 0) goto L_0x0000;
    L_0x0017:
        r2 = 1000000; // 0xf4240 float:1.401298E-39 double:4.940656E-318;
        r4 = r0 / r2;
        r2 = r2 * r4;
        r0 = r0 - r2;
        r2 = r6.a;
        monitor-enter(r2);
        r3 = r6.a;	 Catch:{ InterruptedException -> 0x002b }
        r0 = (int) r0;	 Catch:{ InterruptedException -> 0x002b }
        r3.wait(r4, r0);	 Catch:{ InterruptedException -> 0x002b }
        goto L_0x002b;
    L_0x0029:
        r0 = move-exception;
        goto L_0x002d;
    L_0x002b:
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        goto L_0x0000;	 Catch:{ all -> 0x0029 }
    L_0x002d:
        monitor-exit(r2);	 Catch:{ all -> 0x0029 }
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbh.run():void");
    }
}
