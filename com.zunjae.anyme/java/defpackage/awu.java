package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

final class awu extends awi {
    final /* synthetic */ String a;
    final /* synthetic */ ExecutorService b;
    final /* synthetic */ long c = 2;
    final /* synthetic */ TimeUnit d;

    awu(String str, ExecutorService executorService, TimeUnit timeUnit) {
        this.a = str;
        this.b = executorService;
        this.d = timeUnit;
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
        r5 = this;
        defpackage.avf.c();	 Catch:{ InterruptedException -> 0x0038 }
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0038 }
        r1 = "Executing shutdown hook for ";	 Catch:{ InterruptedException -> 0x0038 }
        r0.<init>(r1);	 Catch:{ InterruptedException -> 0x0038 }
        r1 = r5.a;	 Catch:{ InterruptedException -> 0x0038 }
        r0.append(r1);	 Catch:{ InterruptedException -> 0x0038 }
        r0 = r5.b;	 Catch:{ InterruptedException -> 0x0038 }
        r0.shutdown();	 Catch:{ InterruptedException -> 0x0038 }
        r0 = r5.b;	 Catch:{ InterruptedException -> 0x0038 }
        r1 = r5.c;	 Catch:{ InterruptedException -> 0x0038 }
        r3 = r5.d;	 Catch:{ InterruptedException -> 0x0038 }
        r0 = r0.awaitTermination(r1, r3);	 Catch:{ InterruptedException -> 0x0038 }
        if (r0 != 0) goto L_0x0037;	 Catch:{ InterruptedException -> 0x0038 }
    L_0x0020:
        defpackage.avf.c();	 Catch:{ InterruptedException -> 0x0038 }
        r0 = new java.lang.StringBuilder;	 Catch:{ InterruptedException -> 0x0038 }
        r0.<init>();	 Catch:{ InterruptedException -> 0x0038 }
        r1 = r5.a;	 Catch:{ InterruptedException -> 0x0038 }
        r0.append(r1);	 Catch:{ InterruptedException -> 0x0038 }
        r1 = " did not shut down in the allocated time. Requesting immediate shutdown.";	 Catch:{ InterruptedException -> 0x0038 }
        r0.append(r1);	 Catch:{ InterruptedException -> 0x0038 }
        r0 = r5.b;	 Catch:{ InterruptedException -> 0x0038 }
        r0.shutdownNow();	 Catch:{ InterruptedException -> 0x0038 }
    L_0x0037:
        return;
    L_0x0038:
        defpackage.avf.c();
        r0 = java.util.Locale.US;
        r1 = "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.";
        r2 = 1;
        r2 = new java.lang.Object[r2];
        r3 = 0;
        r4 = r5.a;
        r2[r3] = r4;
        java.lang.String.format(r0, r1, r2);
        r0 = r5.b;
        r0.shutdownNow();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: awu.a():void");
    }
}
