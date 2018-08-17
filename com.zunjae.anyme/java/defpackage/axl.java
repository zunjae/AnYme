package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class axl extends FutureTask<Result> {
    final /* synthetic */ axi a;

    axl(axi axi, Callable callable) {
        this.a = axi;
        super(callable);
    }

    protected final void done() {
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
        r0 = r3.a;	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
        r1 = r3.get();	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
        defpackage.axi.b(r0, r1);	 Catch:{ InterruptedException -> 0x001e, ExecutionException -> 0x0011, CancellationException -> 0x000a }
        return;
    L_0x000a:
        r0 = r3.a;
        r1 = 0;
        defpackage.axi.b(r0, r1);
        return;
    L_0x0011:
        r0 = move-exception;
        r1 = new java.lang.RuntimeException;
        r0 = r0.getCause();
        r2 = "An error occured while executing doInBackground()";
        r1.<init>(r2, r0);
        throw r1;
    L_0x001e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: axl.done():void");
    }
}
