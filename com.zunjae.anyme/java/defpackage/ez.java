package defpackage;

final class ez<DataType> implements gp {
    final /* synthetic */ ew a;
    private final ef<DataType> b;
    private final DataType c;

    public ez(ew ewVar, ef<DataType> efVar, DataType dataType) {
        this.a = ewVar;
        this.b = efVar;
        this.c = dataType;
    }

    public final boolean a(java.io.File r4) {
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
        r0 = 0;
        r1 = r3.a;	 Catch:{ FileNotFoundException -> 0x0028, all -> 0x0021 }
        r1.l;	 Catch:{ FileNotFoundException -> 0x0028, all -> 0x0021 }
        r1 = new java.io.BufferedOutputStream;	 Catch:{ FileNotFoundException -> 0x0028, all -> 0x0021 }
        r2 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0028, all -> 0x0021 }
        r2.<init>(r4);	 Catch:{ FileNotFoundException -> 0x0028, all -> 0x0021 }
        r1.<init>(r2);	 Catch:{ FileNotFoundException -> 0x0028, all -> 0x0021 }
        r4 = r3.b;	 Catch:{ FileNotFoundException -> 0x001f, all -> 0x001c }
        r0 = r3.c;	 Catch:{ FileNotFoundException -> 0x001f, all -> 0x001c }
        r4 = r4.a(r0, r1);	 Catch:{ FileNotFoundException -> 0x001f, all -> 0x001c }
        r1.close();	 Catch:{ IOException -> 0x002e }
        goto L_0x002e;
    L_0x001c:
        r4 = move-exception;
        r0 = r1;
        goto L_0x0022;
    L_0x001f:
        r0 = r1;
        goto L_0x0028;
    L_0x0021:
        r4 = move-exception;
    L_0x0022:
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0.close();	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        throw r4;
    L_0x0028:
        if (r0 == 0) goto L_0x002d;
    L_0x002a:
        r0.close();	 Catch:{ IOException -> 0x002d }
    L_0x002d:
        r4 = 0;
    L_0x002e:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: ez.a(java.io.File):boolean");
    }
}
