package defpackage;

final /* synthetic */ class agc {
    static final /* synthetic */ int[] a = new int[ago.values().length];

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
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r0 = defpackage.ago.values();
        r0 = r0.length;
        r0 = new int[r0];
        a = r0;
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1 = defpackage.ago.NONE;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
        r2 = 1;	 Catch:{ NoSuchFieldError -> 0x0014 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
    L_0x0014:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
        r1 = defpackage.ago.COLOR;	 Catch:{ NoSuchFieldError -> 0x001f }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
        r2 = 2;	 Catch:{ NoSuchFieldError -> 0x001f }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
    L_0x001f:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
        r1 = defpackage.ago.SCALE;	 Catch:{ NoSuchFieldError -> 0x002a }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
        r2 = 3;	 Catch:{ NoSuchFieldError -> 0x002a }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
    L_0x002a:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r1 = defpackage.ago.WORM;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
        r2 = 4;	 Catch:{ NoSuchFieldError -> 0x0035 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
    L_0x0035:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r1 = defpackage.ago.FILL;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0040 }
        r2 = 5;	 Catch:{ NoSuchFieldError -> 0x0040 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0040 }
    L_0x0040:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x004b }
        r1 = defpackage.ago.SLIDE;	 Catch:{ NoSuchFieldError -> 0x004b }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x004b }
        r2 = 6;	 Catch:{ NoSuchFieldError -> 0x004b }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x004b }
    L_0x004b:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r1 = defpackage.ago.THIN_WORM;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0056 }
        r2 = 7;	 Catch:{ NoSuchFieldError -> 0x0056 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0056 }
    L_0x0056:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r1 = defpackage.ago.DROP;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0062 }
        r2 = 8;	 Catch:{ NoSuchFieldError -> 0x0062 }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0062 }
    L_0x0062:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x006e }
        r1 = defpackage.ago.SWAP;	 Catch:{ NoSuchFieldError -> 0x006e }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x006e }
        r2 = 9;	 Catch:{ NoSuchFieldError -> 0x006e }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x006e }
    L_0x006e:
        r0 = a;	 Catch:{ NoSuchFieldError -> 0x007a }
        r1 = defpackage.ago.SCALE_DOWN;	 Catch:{ NoSuchFieldError -> 0x007a }
        r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x007a }
        r2 = 10;	 Catch:{ NoSuchFieldError -> 0x007a }
        r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x007a }
    L_0x007a:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: agc.<clinit>():void");
    }
}
