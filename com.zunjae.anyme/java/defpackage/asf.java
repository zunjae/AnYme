package defpackage;

public final class asf {
    @xe(a = "url")
    public String a;
    @xe(a = "name")
    public String b;

    public final int a() {
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
        r0 = r2.a;	 Catch:{ Exception -> 0x0010 }
        r1 = "/";	 Catch:{ Exception -> 0x0010 }
        r0 = r0.split(r1);	 Catch:{ Exception -> 0x0010 }
        r1 = 5;	 Catch:{ Exception -> 0x0010 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0010 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x0010 }
        return r0;
    L_0x0010:
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: asf.a():int");
    }
}
