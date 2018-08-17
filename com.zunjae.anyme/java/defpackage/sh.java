package defpackage;

import java.util.concurrent.Callable;

final class sh implements Callable<Boolean> {
    final /* synthetic */ se a;

    sh(se seVar) {
        this.a = seVar;
    }

    private java.lang.Boolean a() {
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
        r1 = this;
        r0 = r1.a;	 Catch:{ Exception -> 0x0012 }
        r0 = r0.c;	 Catch:{ Exception -> 0x0012 }
        r0 = r0.c();	 Catch:{ Exception -> 0x0012 }
        defpackage.avf.c();	 Catch:{ Exception -> 0x0012 }
        r0 = java.lang.Boolean.valueOf(r0);	 Catch:{ Exception -> 0x0012 }
        return r0;
    L_0x0012:
        defpackage.avf.c();
        r0 = java.lang.Boolean.FALSE;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: sh.a():java.lang.Boolean");
    }

    public final /* synthetic */ Object call() {
        return a();
    }
}
