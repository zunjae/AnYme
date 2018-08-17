package defpackage;

final class oh implements Runnable {
    final /* synthetic */ od a;

    oh(od odVar) {
        this.a = odVar;
    }

    public final void run() {
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
        r10 = this;
        r0 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r0 = r0.f;	 Catch:{ Exception -> 0x0070 }
        r7 = r0.a();	 Catch:{ Exception -> 0x0070 }
        r0 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r0 = r0.e;	 Catch:{ Exception -> 0x0070 }
        r1 = android.os.Looper.myLooper();	 Catch:{ Exception -> 0x0070 }
        r2 = android.os.Looper.getMainLooper();	 Catch:{ Exception -> 0x0070 }
        if (r1 == r2) goto L_0x0068;	 Catch:{ Exception -> 0x0070 }
    L_0x001a:
        r1 = new pq;	 Catch:{ Exception -> 0x0070 }
        r1.<init>();	 Catch:{ Exception -> 0x0070 }
        r2 = new axg;	 Catch:{ Exception -> 0x0070 }
        r2.<init>();	 Catch:{ Exception -> 0x0070 }
        r3 = r0.b;	 Catch:{ Exception -> 0x0070 }
        r3 = r3.a();	 Catch:{ Exception -> 0x0070 }
        r4 = new ayv;	 Catch:{ Exception -> 0x0070 }
        r5 = r0.a;	 Catch:{ Exception -> 0x0070 }
        r6 = "session_analytics.tap";	 Catch:{ Exception -> 0x0070 }
        r8 = "session_analytics_to_send";	 Catch:{ Exception -> 0x0070 }
        r4.<init>(r5, r3, r6, r8);	 Catch:{ Exception -> 0x0070 }
        r5 = new pi;	 Catch:{ Exception -> 0x0070 }
        r0 = r0.a;	 Catch:{ Exception -> 0x0070 }
        r5.<init>(r0, r1, r2, r4);	 Catch:{ Exception -> 0x0070 }
        r0 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r5.a(r0);	 Catch:{ Exception -> 0x0070 }
        r0 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r9 = new ov;	 Catch:{ Exception -> 0x0070 }
        r1 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r2 = r1.c;	 Catch:{ Exception -> 0x0070 }
        r1 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r3 = r1.d;	 Catch:{ Exception -> 0x0070 }
        r1 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r4 = r1.a;	 Catch:{ Exception -> 0x0070 }
        r1 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r6 = r1.g;	 Catch:{ Exception -> 0x0070 }
        r1 = r10.a;	 Catch:{ Exception -> 0x0070 }
        r8 = r1.h;	 Catch:{ Exception -> 0x0070 }
        r1 = r9;	 Catch:{ Exception -> 0x0070 }
        r1.<init>(r2, r3, r4, r5, r6, r7, r8);	 Catch:{ Exception -> 0x0070 }
        r0.b = r9;	 Catch:{ Exception -> 0x0070 }
        return;	 Catch:{ Exception -> 0x0070 }
    L_0x0068:
        r0 = new java.lang.IllegalStateException;	 Catch:{ Exception -> 0x0070 }
        r1 = "AnswersFilesManagerProvider cannot be called on the main thread";	 Catch:{ Exception -> 0x0070 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0070 }
        throw r0;	 Catch:{ Exception -> 0x0070 }
    L_0x0070:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: oh.run():void");
    }
}
