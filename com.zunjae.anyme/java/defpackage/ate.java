package defpackage;

import android.os.AsyncTask;

final class ate extends AsyncTask<Void, Void, Void> {
    private final aqw a;

    ate(aqw aqw) {
        this.a = aqw;
    }

    private java.lang.Void a() {
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
        defpackage.ati.a();	 Catch:{ Exception -> 0x001d }
        r1 = defpackage.ati.b();	 Catch:{ Exception -> 0x001d }
        r1 = r1.a();	 Catch:{ Exception -> 0x001d }
        r1 = r1.a();	 Catch:{ Exception -> 0x001d }
        r1 = r1.b();	 Catch:{ Exception -> 0x001d }
        r1 = (java.util.List) r1;	 Catch:{ Exception -> 0x001d }
        if (r1 == 0) goto L_0x001d;	 Catch:{ Exception -> 0x001d }
    L_0x0018:
        r2 = r3.a;	 Catch:{ Exception -> 0x001d }
        r2.a(r1);	 Catch:{ Exception -> 0x001d }
    L_0x001d:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ate.a():java.lang.Void");
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }
}
