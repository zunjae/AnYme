package defpackage;

final class oj implements Runnable {
    final /* synthetic */ pn a;
    final /* synthetic */ boolean b;
    final /* synthetic */ od c;

    oj(od odVar, pn pnVar, boolean z) {
        this.c = odVar;
        this.a = pnVar;
        this.b = z;
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
        r2 = this;
        r0 = r2.c;	 Catch:{ Exception -> 0x0015 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0015 }
        r1 = r2.a;	 Catch:{ Exception -> 0x0015 }
        r0.a(r1);	 Catch:{ Exception -> 0x0015 }
        r0 = r2.b;	 Catch:{ Exception -> 0x0015 }
        if (r0 == 0) goto L_0x0014;	 Catch:{ Exception -> 0x0015 }
    L_0x000d:
        r0 = r2.c;	 Catch:{ Exception -> 0x0015 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0015 }
        r0.c();	 Catch:{ Exception -> 0x0015 }
    L_0x0014:
        return;
    L_0x0015:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: oj.run():void");
    }
}
