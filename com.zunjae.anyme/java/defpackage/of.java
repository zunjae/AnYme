package defpackage;

final class of implements Runnable {
    final /* synthetic */ od a;

    of(od odVar) {
        this.a = odVar;
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
        r3 = this;
        r0 = r3.a;	 Catch:{ Exception -> 0x0011 }
        r0 = r0.b;	 Catch:{ Exception -> 0x0011 }
        r1 = r3.a;	 Catch:{ Exception -> 0x0011 }
        r2 = new ou;	 Catch:{ Exception -> 0x0011 }
        r2.<init>();	 Catch:{ Exception -> 0x0011 }
        r1.b = r2;	 Catch:{ Exception -> 0x0011 }
        r0.b();	 Catch:{ Exception -> 0x0011 }
        return;
    L_0x0011:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: of.run():void");
    }
}
