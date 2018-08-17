package defpackage;

import java.lang.Thread.UncaughtExceptionHandler;
import java.util.concurrent.atomic.AtomicBoolean;

final class sp implements UncaughtExceptionHandler {
    private final sq a;
    private final sr b;
    private final boolean c;
    private final UncaughtExceptionHandler d;
    private final AtomicBoolean e = new AtomicBoolean(false);

    public sp(sq sqVar, sr srVar, boolean z, UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = sqVar;
        this.b = srVar;
        this.c = z;
        this.d = uncaughtExceptionHandler;
    }

    final boolean a() {
        return this.e.get();
    }

    public final void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
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
        r4 = this;
        r0 = r4.e;
        r1 = 1;
        r0.set(r1);
        r0 = 0;
        r1 = r4.a;	 Catch:{ Exception -> 0x0020 }
        r2 = r4.b;	 Catch:{ Exception -> 0x0020 }
        r3 = r4.c;	 Catch:{ Exception -> 0x0020 }
        r1.a(r2, r5, r6, r3);	 Catch:{ Exception -> 0x0020 }
    L_0x0010:
        defpackage.avf.c();
        r1 = r4.d;
        r1.uncaughtException(r5, r6);
        r5 = r4.e;
        r5.set(r0);
        return;
    L_0x001e:
        r1 = move-exception;
        goto L_0x0024;
    L_0x0020:
        defpackage.avf.c();	 Catch:{ all -> 0x001e }
        goto L_0x0010;
    L_0x0024:
        defpackage.avf.c();
        r2 = r4.d;
        r2.uncaughtException(r5, r6);
        r5 = r4.e;
        r5.set(r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: sp.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
