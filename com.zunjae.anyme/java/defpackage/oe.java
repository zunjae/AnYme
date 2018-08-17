package defpackage;

final class oe implements Runnable {
    final /* synthetic */ azt a;
    final /* synthetic */ String b;
    final /* synthetic */ od c;

    oe(od odVar, azt azt, String str) {
        this.c = odVar;
        this.a = azt;
        this.b = str;
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
        r0 = r3.c;	 Catch:{ Exception -> 0x000c }
        r0 = r0.b;	 Catch:{ Exception -> 0x000c }
        r1 = r3.a;	 Catch:{ Exception -> 0x000c }
        r2 = r3.b;	 Catch:{ Exception -> 0x000c }
        r0.a(r1, r2);	 Catch:{ Exception -> 0x000c }
        return;
    L_0x000c:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: oe.run():void");
    }
}
