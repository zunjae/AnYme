package defpackage;

final /* synthetic */ class bf {
    static final /* synthetic */ int[] a = new int[bd.values().length];
    static final /* synthetic */ int[] b = new int[bg.a().length];

    static {
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
        r0 = defpackage.bg.a();
        r0 = r0.length;
        r0 = new int[r0];
        b = r0;
        r0 = 1;
        r1 = b;	 Catch:{ NoSuchFieldError -> 0x0011 }
        r2 = defpackage.bg.a;	 Catch:{ NoSuchFieldError -> 0x0011 }
        r2 = r2 - r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
        r1[r2] = r0;	 Catch:{ NoSuchFieldError -> 0x0011 }
    L_0x0011:
        r1 = 2;
        r2 = b;	 Catch:{ NoSuchFieldError -> 0x0019 }
        r3 = defpackage.bg.b;	 Catch:{ NoSuchFieldError -> 0x0019 }
        r3 = r3 - r0;	 Catch:{ NoSuchFieldError -> 0x0019 }
        r2[r3] = r1;	 Catch:{ NoSuchFieldError -> 0x0019 }
    L_0x0019:
        r2 = 3;
        r3 = b;	 Catch:{ NoSuchFieldError -> 0x0021 }
        r4 = defpackage.bg.d;	 Catch:{ NoSuchFieldError -> 0x0021 }
        r4 = r4 - r0;	 Catch:{ NoSuchFieldError -> 0x0021 }
        r3[r4] = r2;	 Catch:{ NoSuchFieldError -> 0x0021 }
    L_0x0021:
        r3 = 4;
        r4 = b;	 Catch:{ NoSuchFieldError -> 0x0029 }
        r5 = defpackage.bg.c;	 Catch:{ NoSuchFieldError -> 0x0029 }
        r5 = r5 - r0;	 Catch:{ NoSuchFieldError -> 0x0029 }
        r4[r5] = r3;	 Catch:{ NoSuchFieldError -> 0x0029 }
    L_0x0029:
        r4 = defpackage.bd.values();
        r4 = r4.length;
        r4 = new int[r4];
        a = r4;
        r4 = a;	 Catch:{ NoSuchFieldError -> 0x003c }
        r5 = defpackage.bd.LEFT;	 Catch:{ NoSuchFieldError -> 0x003c }
        r5 = r5.ordinal();	 Catch:{ NoSuchFieldError -> 0x003c }
        r4[r5] = r0;	 Catch:{ NoSuchFieldError -> 0x003c }
    L_0x003c:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0046 }
        r4 = defpackage.bd.TOP;	 Catch:{ NoSuchFieldError -> 0x0046 }
        r4 = r4.ordinal();	 Catch:{ NoSuchFieldError -> 0x0046 }
        r0[r4] = r1;	 Catch:{ NoSuchFieldError -> 0x0046 }
    L_0x0046:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0050 }
        r1 = defpackage.bd.RIGHT;	 Catch:{ NoSuchFieldError -> 0x0050 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0050 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0050 }
    L_0x0050:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x005a }
        r1 = defpackage.bd.BOTTOM;	 Catch:{ NoSuchFieldError -> 0x005a }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x005a }
        r0[r1] = r3;	 Catch:{ NoSuchFieldError -> 0x005a }
    L_0x005a:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0065 }
        r1 = defpackage.bd.BASELINE;	 Catch:{ NoSuchFieldError -> 0x0065 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0065 }
        r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0065 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0065 }
    L_0x0065:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0070 }
        r1 = defpackage.bd.CENTER;	 Catch:{ NoSuchFieldError -> 0x0070 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0070 }
        r2 = 6;	 Catch:{ NoSuchFieldError -> 0x0070 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0070 }
    L_0x0070:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x007b }
        r1 = defpackage.bd.CENTER_X;	 Catch:{ NoSuchFieldError -> 0x007b }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007b }
        r2 = 7;	 Catch:{ NoSuchFieldError -> 0x007b }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007b }
    L_0x007b:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0087 }
        r1 = defpackage.bd.CENTER_Y;	 Catch:{ NoSuchFieldError -> 0x0087 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0087 }
        r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0087 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0087 }
    L_0x0087:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0093 }
        r1 = defpackage.bd.NONE;	 Catch:{ NoSuchFieldError -> 0x0093 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0093 }
        r2 = 9;	 Catch:{ NoSuchFieldError -> 0x0093 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0093 }
    L_0x0093:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.<clinit>():void");
    }
}
