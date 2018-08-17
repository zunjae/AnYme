package defpackage;

final class bfo extends bda {
    final /* synthetic */ bgb a;
    final /* synthetic */ bfl c;

    bfo(bfl bfl, String str, Object[] objArr, bgb bgb) {
        this.c = bfl;
        this.a = bgb;
        super(str, objArr);
    }

    public final void b() {
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
        r0 = r2.c;	 Catch:{ IOException -> 0x000c }
        r0 = r0.c;	 Catch:{ IOException -> 0x000c }
        r0 = r0.o;	 Catch:{ IOException -> 0x000c }
        r1 = r2.a;	 Catch:{ IOException -> 0x000c }
        r0.a(r1);	 Catch:{ IOException -> 0x000c }
        return;
    L_0x000c:
        r0 = r2.c;
        r0 = r0.c;
        r0.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfo.b():void");
    }
}
