package defpackage;

final class bfm extends bda {
    final /* synthetic */ bfs a;
    final /* synthetic */ bfl c;

    bfm(bfl bfl, String str, Object[] objArr, bfs bfs) {
        this.c = bfl;
        this.a = bfs;
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
        r5 = this;
        r0 = r5.c;	 Catch:{ IOException -> 0x000c }
        r0 = r0.c;	 Catch:{ IOException -> 0x000c }
        r0 = r0.b;	 Catch:{ IOException -> 0x000c }
        r1 = r5.a;	 Catch:{ IOException -> 0x000c }
        r0.a(r1);	 Catch:{ IOException -> 0x000c }
        return;
    L_0x000c:
        r0 = move-exception;
        r1 = defpackage.bgo.c();
        r2 = 4;
        r3 = new java.lang.StringBuilder;
        r4 = "Http2Connection.Listener failure for ";
        r3.<init>(r4);
        r4 = r5.c;
        r4 = r4.c;
        r4 = r4.d;
        r3.append(r4);
        r3 = r3.toString();
        r1.a(r2, r3, r0);
        r0 = r5.a;	 Catch:{ IOException -> 0x0030 }
        r1 = defpackage.bes.PROTOCOL_ERROR;	 Catch:{ IOException -> 0x0030 }
        r0.a(r1);	 Catch:{ IOException -> 0x0030 }
    L_0x0030:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfm.b():void");
    }
}
