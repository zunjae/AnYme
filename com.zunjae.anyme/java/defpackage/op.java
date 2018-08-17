package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

final class op {
    final AtomicReference<ScheduledFuture<?>> a = new AtomicReference();
    boolean b = true;
    private final ScheduledExecutorService c;
    private final List<or> d = new ArrayList();
    private volatile boolean e = true;

    public op(ScheduledExecutorService scheduledExecutorService) {
        this.c = scheduledExecutorService;
    }

    static /* synthetic */ void a(op opVar) {
        for (or a : opVar.d) {
            a.a();
        }
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
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r7 = this;
        r0 = r7.e;
        if (r0 == 0) goto L_0x0024;
    L_0x0004:
        r0 = r7.b;
        if (r0 != 0) goto L_0x0024;
    L_0x0008:
        r0 = 1;
        r7.b = r0;
        r0 = r7.a;	 Catch:{ RejectedExecutionException -> 0x0021 }
        r1 = 0;	 Catch:{ RejectedExecutionException -> 0x0021 }
        r2 = r7.c;	 Catch:{ RejectedExecutionException -> 0x0021 }
        r3 = new oq;	 Catch:{ RejectedExecutionException -> 0x0021 }
        r3.<init>(r7);	 Catch:{ RejectedExecutionException -> 0x0021 }
        r4 = 5000; // 0x1388 float:7.006E-42 double:2.4703E-320;	 Catch:{ RejectedExecutionException -> 0x0021 }
        r6 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ RejectedExecutionException -> 0x0021 }
        r2 = r2.schedule(r3, r4, r6);	 Catch:{ RejectedExecutionException -> 0x0021 }
        r0.compareAndSet(r1, r2);	 Catch:{ RejectedExecutionException -> 0x0021 }
        return;
    L_0x0021:
        defpackage.avf.c();
    L_0x0024:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: op.a():void");
    }

    public final void a(or orVar) {
        this.d.add(orVar);
    }

    public final void a(boolean z) {
        this.e = z;
    }
}
