package defpackage;

final class bfb extends bda {
    final /* synthetic */ int a;
    final /* synthetic */ bes c;
    final /* synthetic */ bfa d;

    bfb(bfa bfa, String str, Object[] objArr, int i, bes bes) {
        this.d = bfa;
        this.a = i;
        this.c = bes;
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
        r3 = this;
        r0 = r3.d;	 Catch:{ IOException -> 0x000a }
        r1 = r3.a;	 Catch:{ IOException -> 0x000a }
        r2 = r3.c;	 Catch:{ IOException -> 0x000a }
        r0.b(r1, r2);	 Catch:{ IOException -> 0x000a }
        return;
    L_0x000a:
        r0 = r3.d;
        r0.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfb.b():void");
    }
}
