package defpackage;

public final class baf {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    private baf(String str, int i, int i2, int i3) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public static defpackage.baf a(android.content.Context r3, java.lang.String r4) {
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
        if (r4 == 0) goto L_0x0025;
    L_0x0002:
        r0 = defpackage.awj.l(r3);	 Catch:{ Exception -> 0x0022 }
        defpackage.avf.c();	 Catch:{ Exception -> 0x0022 }
        r1 = new android.graphics.BitmapFactory$Options;	 Catch:{ Exception -> 0x0022 }
        r1.<init>();	 Catch:{ Exception -> 0x0022 }
        r2 = 1;	 Catch:{ Exception -> 0x0022 }
        r1.inJustDecodeBounds = r2;	 Catch:{ Exception -> 0x0022 }
        r3 = r3.getResources();	 Catch:{ Exception -> 0x0022 }
        android.graphics.BitmapFactory.decodeResource(r3, r0, r1);	 Catch:{ Exception -> 0x0022 }
        r3 = new baf;	 Catch:{ Exception -> 0x0022 }
        r2 = r1.outWidth;	 Catch:{ Exception -> 0x0022 }
        r1 = r1.outHeight;	 Catch:{ Exception -> 0x0022 }
        r3.<init>(r4, r0, r2, r1);	 Catch:{ Exception -> 0x0022 }
        goto L_0x0026;
    L_0x0022:
        defpackage.avf.c();
    L_0x0025:
        r3 = 0;
    L_0x0026:
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: baf.a(android.content.Context, java.lang.String):baf");
    }
}
