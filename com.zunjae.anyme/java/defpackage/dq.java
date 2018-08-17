package defpackage;

import java.io.File;

public final class dq {
    final /* synthetic */ do a;
    private final dr b;
    private final boolean[] c;
    private boolean d;

    private dq(do doVar, dr drVar) {
        this.a = doVar;
        this.b = drVar;
        this.c = drVar.f ? null : new boolean[doVar.h];
    }

    public final File a() {
        File file;
        synchronized (this.a) {
            if (this.b.g == this) {
                if (!this.b.f) {
                    this.c[0] = true;
                }
                file = this.b.b[0];
                if (!this.a.b.exists()) {
                    this.a.b.mkdirs();
                }
            } else {
                throw new IllegalStateException();
            }
        }
        return file;
    }

    public final void b() {
        this.a.a(this, true);
        this.d = true;
    }

    public final void c() {
        this.a.a(this, false);
    }

    public final void d() {
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
        r0 = r1.d;
        if (r0 != 0) goto L_0x0007;
    L_0x0004:
        r1.c();	 Catch:{ IOException -> 0x0007 }
    L_0x0007:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: dq.d():void");
    }
}
