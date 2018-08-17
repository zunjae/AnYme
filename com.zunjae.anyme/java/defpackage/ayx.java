package defpackage;

import android.content.Context;

public final class ayx implements Runnable {
    private final Context a;
    private final ayt b;

    public ayx(Context context, ayt ayt) {
        this.a = context;
        this.b = ayt;
    }

    public final void run() {
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
        r0 = r1.a;	 Catch:{ Exception -> 0x0013 }
        defpackage.awj.e(r0);	 Catch:{ Exception -> 0x0013 }
        r0 = r1.b;	 Catch:{ Exception -> 0x0013 }
        r0 = r0.c();	 Catch:{ Exception -> 0x0013 }
        if (r0 != 0) goto L_0x0012;	 Catch:{ Exception -> 0x0013 }
    L_0x000d:
        r0 = r1.b;	 Catch:{ Exception -> 0x0013 }
        r0.d();	 Catch:{ Exception -> 0x0013 }
    L_0x0012:
        return;
    L_0x0013:
        r0 = r1.a;
        defpackage.awj.f(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayx.run():void");
    }
}
