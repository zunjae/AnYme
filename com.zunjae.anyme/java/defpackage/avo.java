package defpackage;

final class avo<Result> extends axx<Void, Void, Result> {
    final avp<Result> a;

    public avo(avp<Result> avp_Result) {
        this.a = avp_Result;
    }

    private axh a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.b());
        stringBuilder.append(".");
        stringBuilder.append(str);
        axh axh = new axh(stringBuilder.toString(), "KitInitialization");
        axh.a();
        return axh;
    }

    public final int a() {
        return axw.c;
    }

    protected final void b() {
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
        super.b();
        r0 = "onPreExecute";
        r0 = r2.a(r0);
        r1 = r2.a;	 Catch:{ ayh -> 0x0024, Exception -> 0x001a }
        r1 = r1.e();	 Catch:{ ayh -> 0x0024, Exception -> 0x001a }
        r0.b();
        if (r1 != 0) goto L_0x0017;
    L_0x0014:
        r2.h();
    L_0x0017:
        return;
    L_0x0018:
        r1 = move-exception;
        goto L_0x0026;
    L_0x001a:
        defpackage.avf.c();	 Catch:{ all -> 0x0018 }
        r0.b();
        r2.h();
        return;
    L_0x0024:
        r1 = move-exception;
        throw r1;	 Catch:{ all -> 0x0018 }
    L_0x0026:
        r0.b();
        r2.h();
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: avo.b():void");
    }

    protected final void c() {
        this.a.h.a();
    }

    protected final void d() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a.b());
        stringBuilder.append(" Initialization was cancelled");
        this.a.h.a(new avn(stringBuilder.toString()));
    }

    protected final /* synthetic */ Object e() {
        axh a = a("doInBackground");
        Object d = !d_() ? this.a.d() : null;
        a.b();
        return d;
    }
}
