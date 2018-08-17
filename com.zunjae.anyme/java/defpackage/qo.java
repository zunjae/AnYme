package defpackage;

import java.util.concurrent.Callable;

final class qo implements Callable<T> {
    final /* synthetic */ Callable a;
    final /* synthetic */ qm b;

    qo(qm qmVar, Callable callable) {
        this.b = qmVar;
        this.a = callable;
    }

    public final T call() {
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
        r0 = r1.a;	 Catch:{ Exception -> 0x0007 }
        r0 = r0.call();	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        defpackage.avf.c();
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: qo.call():T");
    }
}
