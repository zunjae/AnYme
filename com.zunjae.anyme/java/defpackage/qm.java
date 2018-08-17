package defpackage;

import java.util.concurrent.ExecutorService;

final class qm {
    private final ExecutorService a;

    public qm(ExecutorService executorService) {
        this.a = executorService;
    }

    final <T> T a(java.util.concurrent.Callable<T> r5) {
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
        r4 = this;
        r0 = 0;
        r1 = android.os.Looper.getMainLooper();	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        r2 = android.os.Looper.myLooper();	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        if (r1 != r2) goto L_0x001a;	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
    L_0x000b:
        r1 = r4.a;	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        r5 = r1.submit(r5);	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        r1 = 4;	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        r5 = r5.get(r1, r3);	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        return r5;	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
    L_0x001a:
        r1 = r4.a;	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        r5 = r1.submit(r5);	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        r5 = r5.get();	 Catch:{ RejectedExecutionException -> 0x0029, Exception -> 0x0025 }
        return r5;
    L_0x0025:
        defpackage.avf.c();
        return r0;
    L_0x0029:
        defpackage.avf.c();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a(java.util.concurrent.Callable):T");
    }

    final java.util.concurrent.Future<?> a(java.lang.Runnable r3) {
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
        r2 = this;
        r0 = r2.a;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1 = new qn;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1.<init>(r2, r3);	 Catch:{ RejectedExecutionException -> 0x000c }
        r3 = r0.submit(r1);	 Catch:{ RejectedExecutionException -> 0x000c }
        return r3;
    L_0x000c:
        defpackage.avf.c();
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.a(java.lang.Runnable):java.util.concurrent.Future<?>");
    }

    final <T> java.util.concurrent.Future<T> b(java.util.concurrent.Callable<T> r3) {
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
        r2 = this;
        r0 = r2.a;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1 = new qo;	 Catch:{ RejectedExecutionException -> 0x000c }
        r1.<init>(r2, r3);	 Catch:{ RejectedExecutionException -> 0x000c }
        r3 = r0.submit(r1);	 Catch:{ RejectedExecutionException -> 0x000c }
        return r3;
    L_0x000c:
        defpackage.avf.c();
        r3 = 0;
        return r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: qm.b(java.util.concurrent.Callable):java.util.concurrent.Future<T>");
    }
}
