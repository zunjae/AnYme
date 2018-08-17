package defpackage;

final class uc extends awi {
    final /* synthetic */ tx a;
    private final float b;
    private final ub c;

    uc(tx txVar, float f, ub ubVar) {
        this.a = txVar;
        this.b = f;
        this.c = ubVar;
    }

    public final void a() {
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
        r6 = this;
        defpackage.avf.c();	 Catch:{ Exception -> 0x00f3 }
        r0 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f3 }
        r1 = "Starting report processing in ";	 Catch:{ Exception -> 0x00f3 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x00f3 }
        r1 = r6.b;	 Catch:{ Exception -> 0x00f3 }
        r0.append(r1);	 Catch:{ Exception -> 0x00f3 }
        r1 = " second(s)...";	 Catch:{ Exception -> 0x00f3 }
        r0.append(r1);	 Catch:{ Exception -> 0x00f3 }
        r0 = r6.b;	 Catch:{ Exception -> 0x00f3 }
        r1 = 0;
        r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1));
        if (r0 <= 0) goto L_0x002f;
    L_0x001b:
        r0 = r6.b;	 Catch:{ InterruptedException -> 0x0026 }
        r1 = 1148846080; // 0x447a0000 float:1000.0 double:5.676053805E-315;	 Catch:{ InterruptedException -> 0x0026 }
        r0 = r0 * r1;	 Catch:{ InterruptedException -> 0x0026 }
        r0 = (long) r0;	 Catch:{ InterruptedException -> 0x0026 }
        java.lang.Thread.sleep(r0);	 Catch:{ InterruptedException -> 0x0026 }
        goto L_0x002f;
    L_0x0026:
        r0 = java.lang.Thread.currentThread();	 Catch:{ Exception -> 0x00f3 }
        r0.interrupt();	 Catch:{ Exception -> 0x00f3 }
        goto L_0x00f6;	 Catch:{ Exception -> 0x00f3 }
    L_0x002f:
        r0 = r6.a;	 Catch:{ Exception -> 0x00f3 }
        r0 = r0.a();	 Catch:{ Exception -> 0x00f3 }
        r1 = r6.a;	 Catch:{ Exception -> 0x00f3 }
        r1 = r1.g;	 Catch:{ Exception -> 0x00f3 }
        r1 = r1.a();	 Catch:{ Exception -> 0x00f3 }
        if (r1 != 0) goto L_0x00f6;	 Catch:{ Exception -> 0x00f3 }
    L_0x0041:
        r1 = r0.isEmpty();	 Catch:{ Exception -> 0x00f3 }
        if (r1 != 0) goto L_0x0079;	 Catch:{ Exception -> 0x00f3 }
    L_0x0047:
        r1 = r6.c;	 Catch:{ Exception -> 0x00f3 }
        r1 = r1.a();	 Catch:{ Exception -> 0x00f3 }
        if (r1 != 0) goto L_0x0079;	 Catch:{ Exception -> 0x00f3 }
    L_0x004f:
        defpackage.avf.c();	 Catch:{ Exception -> 0x00f3 }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f3 }
        r2 = "User declined to send. Removing ";	 Catch:{ Exception -> 0x00f3 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x00f3 }
        r2 = r0.size();	 Catch:{ Exception -> 0x00f3 }
        r1.append(r2);	 Catch:{ Exception -> 0x00f3 }
        r2 = " Report(s).";	 Catch:{ Exception -> 0x00f3 }
        r1.append(r2);	 Catch:{ Exception -> 0x00f3 }
        r0 = r0.iterator();	 Catch:{ Exception -> 0x00f3 }
    L_0x0069:
        r1 = r0.hasNext();	 Catch:{ Exception -> 0x00f3 }
        if (r1 == 0) goto L_0x00f6;	 Catch:{ Exception -> 0x00f3 }
    L_0x006f:
        r1 = r0.next();	 Catch:{ Exception -> 0x00f3 }
        r1 = (defpackage.tv) r1;	 Catch:{ Exception -> 0x00f3 }
        r1.f();	 Catch:{ Exception -> 0x00f3 }
        goto L_0x0069;	 Catch:{ Exception -> 0x00f3 }
    L_0x0079:
        r1 = 0;	 Catch:{ Exception -> 0x00f3 }
    L_0x007a:
        r2 = r0.isEmpty();	 Catch:{ Exception -> 0x00f3 }
        if (r2 != 0) goto L_0x00f6;	 Catch:{ Exception -> 0x00f3 }
    L_0x0080:
        r2 = r6.a;	 Catch:{ Exception -> 0x00f3 }
        r2 = r2.g;	 Catch:{ Exception -> 0x00f3 }
        r2 = r2.a();	 Catch:{ Exception -> 0x00f3 }
        if (r2 != 0) goto L_0x00f6;	 Catch:{ Exception -> 0x00f3 }
    L_0x008c:
        defpackage.avf.c();	 Catch:{ Exception -> 0x00f3 }
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f3 }
        r3 = "Attempting to send ";	 Catch:{ Exception -> 0x00f3 }
        r2.<init>(r3);	 Catch:{ Exception -> 0x00f3 }
        r3 = r0.size();	 Catch:{ Exception -> 0x00f3 }
        r2.append(r3);	 Catch:{ Exception -> 0x00f3 }
        r3 = " report(s)";	 Catch:{ Exception -> 0x00f3 }
        r2.append(r3);	 Catch:{ Exception -> 0x00f3 }
        r0 = r0.iterator();	 Catch:{ Exception -> 0x00f3 }
    L_0x00a6:
        r2 = r0.hasNext();	 Catch:{ Exception -> 0x00f3 }
        if (r2 == 0) goto L_0x00b8;	 Catch:{ Exception -> 0x00f3 }
    L_0x00ac:
        r2 = r0.next();	 Catch:{ Exception -> 0x00f3 }
        r2 = (defpackage.tv) r2;	 Catch:{ Exception -> 0x00f3 }
        r3 = r6.a;	 Catch:{ Exception -> 0x00f3 }
        r3.a(r2);	 Catch:{ Exception -> 0x00f3 }
        goto L_0x00a6;	 Catch:{ Exception -> 0x00f3 }
    L_0x00b8:
        r0 = r6.a;	 Catch:{ Exception -> 0x00f3 }
        r0 = r0.a();	 Catch:{ Exception -> 0x00f3 }
        r2 = r0.isEmpty();	 Catch:{ Exception -> 0x00f3 }
        if (r2 != 0) goto L_0x007a;	 Catch:{ Exception -> 0x00f3 }
    L_0x00c4:
        r2 = defpackage.tx.b;	 Catch:{ Exception -> 0x00f3 }
        r3 = r1 + 1;	 Catch:{ Exception -> 0x00f3 }
        r4 = defpackage.tx.b;	 Catch:{ Exception -> 0x00f3 }
        r4 = r4.length;	 Catch:{ Exception -> 0x00f3 }
        r4 = r4 + -1;	 Catch:{ Exception -> 0x00f3 }
        r1 = java.lang.Math.min(r1, r4);	 Catch:{ Exception -> 0x00f3 }
        r1 = r2[r1];	 Catch:{ Exception -> 0x00f3 }
        r1 = (long) r1;	 Catch:{ Exception -> 0x00f3 }
        defpackage.avf.c();	 Catch:{ Exception -> 0x00f3 }
        r4 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x00f3 }
        r5 = "Report submisson: scheduling delayed retry in ";	 Catch:{ Exception -> 0x00f3 }
        r4.<init>(r5);	 Catch:{ Exception -> 0x00f3 }
        r4.append(r1);	 Catch:{ Exception -> 0x00f3 }
        r5 = " seconds";	 Catch:{ Exception -> 0x00f3 }
        r4.append(r5);	 Catch:{ Exception -> 0x00f3 }
        r4 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r1 = r1 * r4;
        java.lang.Thread.sleep(r1);	 Catch:{ InterruptedException -> 0x0026 }
        r1 = r3;
        goto L_0x007a;
    L_0x00f3:
        defpackage.avf.c();
    L_0x00f6:
        r0 = r6.a;
        r0.h = null;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: uc.a():void");
    }
}
