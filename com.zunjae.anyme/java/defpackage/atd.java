package defpackage;

import android.os.AsyncTask;

final class atd extends AsyncTask<Void, Void, Void> {
    private final aqw a;
    private final ast b;

    private atd(aqw aqw, ast ast) {
        this.a = aqw;
        this.b = ast;
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
        r1 = r3.b;	 Catch:{ Exception -> 0x0026 }
        r1 = r1.q();	 Catch:{ Exception -> 0x0026 }
        if (r1 != 0) goto L_0x000a;	 Catch:{ Exception -> 0x0026 }
    L_0x0009:
        return r0;	 Catch:{ Exception -> 0x0026 }
    L_0x000a:
        defpackage.ati.a();	 Catch:{ Exception -> 0x0026 }
        r2 = defpackage.ati.b();	 Catch:{ Exception -> 0x0026 }
        r1 = r2.a(r1);	 Catch:{ Exception -> 0x0026 }
        r1 = r1.a();	 Catch:{ Exception -> 0x0026 }
        r1 = r1.b();	 Catch:{ Exception -> 0x0026 }
        r1 = (java.util.List) r1;	 Catch:{ Exception -> 0x0026 }
        if (r1 == 0) goto L_0x0026;	 Catch:{ Exception -> 0x0026 }
    L_0x0021:
        r2 = r3.a;	 Catch:{ Exception -> 0x0026 }
        r2.c(r1);	 Catch:{ Exception -> 0x0026 }
    L_0x0026:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: atd.a():java.lang.Void");
    }

    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return a();
    }
}
