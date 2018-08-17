package defpackage;

final class bff extends bda {
    final /* synthetic */ int a;
    final /* synthetic */ bhd c;
    final /* synthetic */ int d;
    final /* synthetic */ boolean e;
    final /* synthetic */ bfa f;

    bff(bfa bfa, String str, Object[] objArr, int i, bhd bhd, int i2, boolean z) {
        this.f = bfa;
        this.a = i;
        this.c = bhd;
        this.d = i2;
        this.e = z;
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
        r3 = this;
        r0 = r3.f;	 Catch:{ IOException -> 0x002b }
        r0 = r0.h;	 Catch:{ IOException -> 0x002b }
        r1 = r3.c;	 Catch:{ IOException -> 0x002b }
        r2 = r3.d;	 Catch:{ IOException -> 0x002b }
        r0.a(r1, r2);	 Catch:{ IOException -> 0x002b }
        r0 = r3.f;	 Catch:{ IOException -> 0x002b }
        r0 = r0.o;	 Catch:{ IOException -> 0x002b }
        r1 = r3.a;	 Catch:{ IOException -> 0x002b }
        r2 = defpackage.bes.CANCEL;	 Catch:{ IOException -> 0x002b }
        r0.a(r1, r2);	 Catch:{ IOException -> 0x002b }
        r0 = r3.f;	 Catch:{ IOException -> 0x002b }
        monitor-enter(r0);	 Catch:{ IOException -> 0x002b }
        r1 = r3.f;	 Catch:{ all -> 0x0028 }
        r1 = r1.q;	 Catch:{ all -> 0x0028 }
        r2 = r3.a;	 Catch:{ all -> 0x0028 }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x0028 }
        r1.remove(r2);	 Catch:{ all -> 0x0028 }
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        return;	 Catch:{ all -> 0x0028 }
    L_0x0028:
        r1 = move-exception;	 Catch:{ all -> 0x0028 }
        monitor-exit(r0);	 Catch:{ all -> 0x0028 }
        throw r1;	 Catch:{ IOException -> 0x002b }
    L_0x002b:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bff.b():void");
    }
}
