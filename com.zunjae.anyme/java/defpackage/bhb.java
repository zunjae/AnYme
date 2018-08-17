package defpackage;

final class bhb extends Thread {
    bhb() {
        super("Okio Watchdog");
        setDaemon(true);
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r3 = this;
    L_0x0000:
        r0 = defpackage.bgy.class;	 Catch:{ InterruptedException -> 0x0000 }
        monitor-enter(r0);	 Catch:{ InterruptedException -> 0x0000 }
        r1 = defpackage.bgy.e();	 Catch:{ all -> 0x0019 }
        if (r1 != 0) goto L_0x000b;	 Catch:{ all -> 0x0019 }
    L_0x0009:
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        goto L_0x0000;	 Catch:{ all -> 0x0019 }
    L_0x000b:
        r2 = defpackage.bgy.b;	 Catch:{ all -> 0x0019 }
        if (r1 != r2) goto L_0x0014;	 Catch:{ all -> 0x0019 }
    L_0x000f:
        r1 = 0;	 Catch:{ all -> 0x0019 }
        defpackage.bgy.b = r1;	 Catch:{ all -> 0x0019 }
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        return;	 Catch:{ all -> 0x0019 }
    L_0x0014:
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        r1.a();	 Catch:{ InterruptedException -> 0x0000 }
        goto L_0x0000;
    L_0x0019:
        r1 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x0019 }
        throw r1;	 Catch:{ InterruptedException -> 0x0000 }
        */
        throw new UnsupportedOperationException("Method not decompiled: bhb.run():void");
    }
}
