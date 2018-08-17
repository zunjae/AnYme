package defpackage;

import java.io.File;

public final class gw implements gn {
    private static gw a;
    private final gr b = new gr();
    private final hf c;
    private final File d;
    private final int e;
    private do f;

    private gw(File file, int i) {
        this.d = file;
        this.e = i;
        this.c = new hf();
    }

    public static synchronized gn a(File file, int i) {
        gn gnVar;
        synchronized (gw.class) {
            if (a == null) {
                a = new gw(file, i);
            }
            gnVar = a;
        }
        return gnVar;
    }

    private synchronized do b() {
        if (this.f == null) {
            this.f = do.a(this.d, (long) this.e);
        }
        return this.f;
    }

    private synchronized void c() {
        this.f = null;
    }

    public final java.io.File a(defpackage.eg r3) {
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
        r0 = r2.c;
        r3 = r0.a(r3);
        r0 = 0;
        r1 = r2.b();	 Catch:{ IOException -> 0x0016 }
        r3 = r1.a(r3);	 Catch:{ IOException -> 0x0016 }
        if (r3 == 0) goto L_0x0016;	 Catch:{ IOException -> 0x0016 }
    L_0x0011:
        r3 = r3.a();	 Catch:{ IOException -> 0x0016 }
        r0 = r3;
    L_0x0016:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.a(eg):java.io.File");
    }

    public final synchronized void a() {
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
        r1 = this;
        monitor-enter(r1);
        r0 = r1.b();	 Catch:{ IOException -> 0x0010, all -> 0x000d }
        r0.a();	 Catch:{ IOException -> 0x0010, all -> 0x000d }
        r1.c();	 Catch:{ IOException -> 0x0010, all -> 0x000d }
        monitor-exit(r1);
        return;
    L_0x000d:
        r0 = move-exception;
        monitor-exit(r1);
        throw r0;
    L_0x0010:
        monitor-exit(r1);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.a():void");
    }

    public final void a(defpackage.eg r3, defpackage.gp r4) {
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
        r0 = r2.c;
        r0 = r0.a(r3);
        r1 = r2.b;
        r1.a(r3);
        r1 = r2.b();	 Catch:{ IOException -> 0x002b, all -> 0x0031 }
        r0 = r1.b(r0);	 Catch:{ IOException -> 0x002b, all -> 0x0031 }
        if (r0 == 0) goto L_0x002b;
    L_0x0015:
        r1 = r0.a();	 Catch:{ all -> 0x0026 }
        r4 = r4.a(r1);	 Catch:{ all -> 0x0026 }
        if (r4 == 0) goto L_0x0022;	 Catch:{ all -> 0x0026 }
    L_0x001f:
        r0.b();	 Catch:{ all -> 0x0026 }
    L_0x0022:
        r0.d();	 Catch:{ IOException -> 0x002b, all -> 0x0031 }
        goto L_0x002b;	 Catch:{ IOException -> 0x002b, all -> 0x0031 }
    L_0x0026:
        r4 = move-exception;	 Catch:{ IOException -> 0x002b, all -> 0x0031 }
        r0.d();	 Catch:{ IOException -> 0x002b, all -> 0x0031 }
        throw r4;	 Catch:{ IOException -> 0x002b, all -> 0x0031 }
    L_0x002b:
        r4 = r2.b;
        r4.b(r3);
        return;
    L_0x0031:
        r4 = move-exception;
        r0 = r2.b;
        r0.b(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.a(eg, gp):void");
    }

    public final void b(defpackage.eg r2) {
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
        r1 = this;
        r0 = r1.c;
        r2 = r0.a(r2);
        r0 = r1.b();	 Catch:{ IOException -> 0x000d }
        r0.c(r2);	 Catch:{ IOException -> 0x000d }
    L_0x000d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: gw.b(eg):void");
    }
}
