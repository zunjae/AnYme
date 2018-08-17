package defpackage;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

final class od implements ays {
    final ScheduledExecutorService a;
    pl b = new ou();
    private final avp c;
    private final Context d;
    private final ok e;
    private final pr f;
    private final azk g;
    private final oy h;

    public od(avp avp, Context context, ok okVar, pr prVar, azk azk, ScheduledExecutorService scheduledExecutorService, oy oyVar) {
        this.c = avp;
        this.d = context;
        this.e = okVar;
        this.f = prVar;
        this.g = azk;
        this.a = scheduledExecutorService;
        this.h = oyVar;
    }

    private void a(java.lang.Runnable r2) {
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
        r0 = r1.a;	 Catch:{ Exception -> 0x000a }
        r2 = r0.submit(r2);	 Catch:{ Exception -> 0x000a }
        r2.get();	 Catch:{ Exception -> 0x000a }
        return;
    L_0x000a:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: od.a(java.lang.Runnable):void");
    }

    private void b(java.lang.Runnable r2) {
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
        r0 = r1.a;	 Catch:{ Exception -> 0x0006 }
        r0.submit(r2);	 Catch:{ Exception -> 0x0006 }
        return;
    L_0x0006:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: od.b(java.lang.Runnable):void");
    }

    public final void a() {
        b(new of(this));
    }

    public final void a(azt azt, String str) {
        b(new oe(this, azt, str));
    }

    public final void a(pn pnVar) {
        a(pnVar, false, false);
    }

    final void a(pn pnVar, boolean z, boolean z2) {
        Runnable ojVar = new oj(this, pnVar, z2);
        if (z) {
            a(ojVar);
        } else {
            b(ojVar);
        }
    }

    public final void b() {
        b(new og(this));
    }

    public final void b(pn pnVar) {
        a(pnVar, false, true);
    }

    public final void c() {
        b(new oh(this));
    }

    public final void d() {
        b(new oi(this));
    }
}
