package defpackage;

final class bfc extends bda {
    final /* synthetic */ int a;
    final /* synthetic */ long c;
    final /* synthetic */ bfa d;

    bfc(bfa bfa, String str, Object[] objArr, int i, long j) {
        this.d = bfa;
        this.a = i;
        this.c = j;
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
        r4 = this;
        r0 = r4.d;	 Catch:{ IOException -> 0x000c }
        r0 = r0.o;	 Catch:{ IOException -> 0x000c }
        r1 = r4.a;	 Catch:{ IOException -> 0x000c }
        r2 = r4.c;	 Catch:{ IOException -> 0x000c }
        r0.a(r1, r2);	 Catch:{ IOException -> 0x000c }
        return;
    L_0x000c:
        r0 = r4.d;
        r0.e();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfc.b():void");
    }
}
