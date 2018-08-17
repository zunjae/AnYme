package defpackage;

import java.io.Closeable;

public abstract class aze<V> extends azi<V> {
    private final Closeable a;
    private final boolean b;

    protected aze(Closeable closeable, boolean z) {
        this.a = closeable;
        this.b = z;
    }

    protected final void b() {
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
        r0 = r2.a;
        r1 = r0 instanceof java.io.Flushable;
        if (r1 == 0) goto L_0x000b;
    L_0x0006:
        r0 = (java.io.Flushable) r0;
        r0.flush();
    L_0x000b:
        r0 = r2.b;
        if (r0 == 0) goto L_0x0015;
    L_0x000f:
        r0 = r2.a;	 Catch:{ IOException -> 0x0014 }
        r0.close();	 Catch:{ IOException -> 0x0014 }
    L_0x0014:
        return;
    L_0x0015:
        r0 = r2.a;
        r0.close();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aze.b():void");
    }
}
