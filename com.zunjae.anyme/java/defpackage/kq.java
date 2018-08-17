package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class kq implements ej<ka> {
    private static final kr a = new kr();
    private final dx b;
    private final ga c;
    private final kr d;

    public kq(ga gaVar) {
        this(gaVar, a);
    }

    private kq(ga gaVar, kr krVar) {
        this.c = gaVar;
        this.b = new jz(gaVar);
        this.d = krVar;
    }

    private boolean a(defpackage.ft<defpackage.ka> r10, java.io.OutputStream r11) {
        /* JADX: method processing error */
/*
Error: java.lang.NullPointerException: Attempt to invoke virtual method 'int java.util.BitSet.nextSetBit(int)' on a null object reference
	at jadx.core.dex.visitors.ssa.SSATransform.placePhi(SSATransform.java:82)
	at jadx.core.dex.visitors.ssa.SSATransform.process(SSATransform.java:50)
	at jadx.core.dex.visitors.ssa.SSATransform.visit(SSATransform.java:42)
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
        r9 = this;
        r0 = defpackage.ns.a();
        r10 = r10.b();
        r10 = (defpackage.ka) r10;
        r2 = r10.c();
        r3 = r2 instanceof defpackage.jq;
        if (r3 == 0) goto L_0x001b;
    L_0x0012:
        r10 = r10.d();
        r10 = defpackage.kq.a(r10, r11);
        return r10;
    L_0x001b:
        r3 = r10.d();
        r4 = new ea;
        r4.<init>();
        r4.a(r3);
        r4 = r4.b();
        r5 = r9.b;
        r6 = new dw;
        r6.<init>(r5);
        r6.a(r4, r3);
        r6.a();
        r3 = new eb;
        r3.<init>();
        r11 = r3.a(r11);
        r4 = 0;
        if (r11 != 0) goto L_0x0045;
    L_0x0044:
        return r4;
    L_0x0045:
        r11 = 0;
    L_0x0046:
        r5 = r6.c();
        if (r11 >= r5) goto L_0x0095;
    L_0x004c:
        r5 = r6.f();
        r7 = r9.c;
        r8 = new com.bumptech.glide.load.resource.bitmap.c;
        r8.<init>(r5, r7);
        r5 = r10.getIntrinsicWidth();
        r7 = r10.getIntrinsicHeight();
        r5 = r2.a(r8, r5, r7);
        r7 = r8.equals(r5);
        if (r7 != 0) goto L_0x006c;
    L_0x0069:
        r8.d();
    L_0x006c:
        r7 = r5.b();	 Catch:{ all -> 0x0090 }
        r7 = (android.graphics.Bitmap) r7;	 Catch:{ all -> 0x0090 }
        r7 = r3.a(r7);	 Catch:{ all -> 0x0090 }
        if (r7 != 0) goto L_0x007c;
    L_0x0078:
        r5.d();
        return r4;
    L_0x007c:
        r7 = r6.d();	 Catch:{ all -> 0x0090 }
        r7 = r6.a(r7);	 Catch:{ all -> 0x0090 }
        r3.a(r7);	 Catch:{ all -> 0x0090 }
        r6.a();	 Catch:{ all -> 0x0090 }
        r5.d();
        r11 = r11 + 1;
        goto L_0x0046;
    L_0x0090:
        r10 = move-exception;
        r5.d();
        throw r10;
    L_0x0095:
        r11 = r3.a();
        r2 = "GifEncoder";
        r3 = 2;
        r2 = android.util.Log.isLoggable(r2, r3);
        if (r2 == 0) goto L_0x00ce;
    L_0x00a2:
        r2 = new java.lang.StringBuilder;
        r3 = "Encoded gif with ";
        r2.<init>(r3);
        r3 = r6.c();
        r2.append(r3);
        r3 = " frames and ";
        r2.append(r3);
        r10 = r10.d();
        r10 = r10.length;
        r2.append(r10);
        r10 = " bytes in ";
        r2.append(r10);
        r0 = defpackage.ns.a(r0);
        r2.append(r0);
        r10 = " ms";
        r2.append(r10);
    L_0x00ce:
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.a(ft, java.io.OutputStream):boolean");
    }

    private static boolean a(byte[] r0, java.io.OutputStream r1) {
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
        r1.write(r0);	 Catch:{ IOException -> 0x0005 }
        r0 = 1;
        goto L_0x0006;
    L_0x0005:
        r0 = 0;
    L_0x0006:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: kq.a(byte[], java.io.OutputStream):boolean");
    }

    public final String a() {
        return BuildConfig.FLAVOR;
    }
}
