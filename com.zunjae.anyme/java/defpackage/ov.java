package defpackage;

import android.content.Context;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicReference;

final class ov implements pl {
    final pp a;
    ayu b;
    awh c = new awh();
    ow d = new pb();
    boolean e = true;
    boolean f = true;
    volatile int g = -1;
    boolean h = false;
    boolean i = false;
    private final avp j;
    private final azk k;
    private final Context l;
    private final pi m;
    private final ScheduledExecutorService n;
    private final AtomicReference<ScheduledFuture<?>> o = new AtomicReference();
    private final oy p;

    public ov(avp avp, Context context, ScheduledExecutorService scheduledExecutorService, pi piVar, azk azk, pp ppVar, oy oyVar) {
        this.j = avp;
        this.l = context;
        this.n = scheduledExecutorService;
        this.m = piVar;
        this.k = azk;
        this.a = ppVar;
        this.p = oyVar;
    }

    private void a(long r9, long r11) {
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
        r8 = this;
        r0 = r8.o;
        r0 = r0.get();
        if (r0 != 0) goto L_0x000a;
    L_0x0008:
        r0 = 1;
        goto L_0x000b;
    L_0x000a:
        r0 = 0;
    L_0x000b:
        if (r0 == 0) goto L_0x003d;
    L_0x000d:
        r2 = new ayx;
        r0 = r8.l;
        r2.<init>(r0, r8);
        r0 = r8.l;
        r1 = new java.lang.StringBuilder;
        r3 = "Scheduling time based file roll over every ";
        r1.<init>(r3);
        r1.append(r11);
        r3 = " seconds";
        r1.append(r3);
        defpackage.awj.e(r0);
        r0 = r8.o;	 Catch:{ RejectedExecutionException -> 0x0038 }
        r1 = r8.n;	 Catch:{ RejectedExecutionException -> 0x0038 }
        r7 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ RejectedExecutionException -> 0x0038 }
        r3 = r9;	 Catch:{ RejectedExecutionException -> 0x0038 }
        r5 = r11;	 Catch:{ RejectedExecutionException -> 0x0038 }
        r9 = r1.scheduleAtFixedRate(r2, r3, r5, r7);	 Catch:{ RejectedExecutionException -> 0x0038 }
        r0.set(r9);	 Catch:{ RejectedExecutionException -> 0x0038 }
        return;
    L_0x0038:
        r9 = r8.l;
        defpackage.awj.f(r9);
    L_0x003d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ov.a(long, long):void");
    }

    public final void a() {
        if (this.b == null) {
            awj.e(this.l);
            return;
        }
        awj.e(this.l);
        List e = this.m.e();
        int i = 0;
        while (e.size() > 0) {
            try {
                Context context = this.l;
                String.format(Locale.US, "attempt to send batch of %d files", new Object[]{Integer.valueOf(e.size())});
                awj.e(context);
                boolean a = this.b.a(e);
                if (a) {
                    i += e.size();
                    this.m.a(e);
                }
                if (!a) {
                    break;
                }
                e = this.m.e();
            } catch (Exception e2) {
                Context context2 = this.l;
                new StringBuilder("Failed to send batch of analytics files to server: ").append(e2.getMessage());
                awj.f(context2);
            }
        }
        if (i == 0) {
            this.m.g();
        }
    }

    public final void a(azt azt, String str) {
        this.b = new on(new pj(this.j, str, azt.a, this.k, awh.a(this.l)), new pe(new aym(new pd(new ayk()), new ayj(5))));
        this.m.a(azt);
        this.h = azt.f;
        this.i = azt.g;
        avf.c();
        new StringBuilder("Firebase analytics forwarding ").append(this.h ? "enabled" : "disabled");
        avf.c();
        new StringBuilder("Firebase analytics including purchase events ").append(this.i ? "enabled" : "disabled");
        this.e = azt.h;
        avf.c();
        new StringBuilder("Custom event tracking ").append(this.e ? "enabled" : "disabled");
        this.f = azt.i;
        avf.c();
        new StringBuilder("Predefined event tracking ").append(this.f ? "enabled" : "disabled");
        if (azt.k > 1) {
            avf.c();
            this.d = new pf(azt.k);
        }
        this.g = azt.b;
        a(0, (long) this.g);
    }

    public final void a(defpackage.pn r13) {
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
        r12 = this;
        r1 = r12.a;
        r11 = new pm;
        r2 = r13.b;
        r4 = r13.a;
        r5 = r13.c;
        r6 = r13.d;
        r7 = r13.e;
        r8 = r13.f;
        r9 = r13.g;
        r10 = 0;
        r0 = r11;
        r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9);
        r13 = r12.e;
        if (r13 != 0) goto L_0x0033;
    L_0x001b:
        r13 = defpackage.po.CUSTOM;
        r0 = r11.c;
        r13 = r13.equals(r0);
        if (r13 == 0) goto L_0x0033;
    L_0x0025:
        defpackage.avf.c();
        r13 = new java.lang.StringBuilder;
        r0 = "Custom events tracking disabled - skipping event: ";
        r13.<init>(r0);
    L_0x002f:
        r13.append(r11);
        return;
    L_0x0033:
        r13 = r12.f;
        if (r13 != 0) goto L_0x004c;
    L_0x0037:
        r13 = defpackage.po.PREDEFINED;
        r0 = r11.c;
        r13 = r13.equals(r0);
        if (r13 == 0) goto L_0x004c;
    L_0x0041:
        defpackage.avf.c();
        r13 = new java.lang.StringBuilder;
        r0 = "Predefined events tracking disabled - skipping event: ";
        r13.<init>(r0);
        goto L_0x002f;
    L_0x004c:
        r13 = r12.d;
        r13 = r13.a(r11);
        if (r13 == 0) goto L_0x005f;
    L_0x0054:
        defpackage.avf.c();
        r13 = new java.lang.StringBuilder;
        r0 = "Skipping filtered event: ";
        r13.<init>(r0);
        goto L_0x002f;
    L_0x005f:
        r13 = r12.m;	 Catch:{ IOException -> 0x0065 }
        r13.a(r11);	 Catch:{ IOException -> 0x0065 }
        goto L_0x0072;
    L_0x0065:
        defpackage.avf.c();
        r13 = new java.lang.StringBuilder;
        r0 = "Failed to write event: ";
        r13.<init>(r0);
        r13.append(r11);
    L_0x0072:
        r13 = r12.g;
        r0 = -1;
        r1 = 0;
        r2 = 1;
        if (r13 == r0) goto L_0x007b;
    L_0x0079:
        r13 = 1;
        goto L_0x007c;
    L_0x007b:
        r13 = 0;
    L_0x007c:
        if (r13 == 0) goto L_0x0085;
    L_0x007e:
        r13 = r12.g;
        r3 = (long) r13;
        r5 = (long) r13;
        r12.a(r3, r5);
    L_0x0085:
        r13 = defpackage.po.CUSTOM;
        r0 = r11.c;
        r13 = r13.equals(r0);
        if (r13 != 0) goto L_0x0099;
    L_0x008f:
        r13 = defpackage.po.PREDEFINED;
        r0 = r11.c;
        r13 = r13.equals(r0);
        if (r13 == 0) goto L_0x009a;
    L_0x0099:
        r1 = 1;
    L_0x009a:
        r13 = "purchase";
        r0 = r11.g;
        r13 = r13.equals(r0);
        r0 = r12.h;
        if (r0 == 0) goto L_0x00c2;
    L_0x00a6:
        if (r1 != 0) goto L_0x00a9;
    L_0x00a8:
        goto L_0x00c2;
    L_0x00a9:
        if (r13 == 0) goto L_0x00b0;
    L_0x00ab:
        r13 = r12.i;
        if (r13 != 0) goto L_0x00b0;
    L_0x00af:
        return;
    L_0x00b0:
        r13 = r12.p;	 Catch:{ Exception -> 0x00b6 }
        r13.a(r11);	 Catch:{ Exception -> 0x00b6 }
        return;
    L_0x00b6:
        defpackage.avf.c();
        r13 = new java.lang.StringBuilder;
        r0 = "Failed to map event to Firebase: ";
        r13.<init>(r0);
        goto L_0x002f;
    L_0x00c2:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ov.a(pn):void");
    }

    public final void b() {
        this.m.f();
    }

    public final boolean c() {
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
        r0 = r1.m;	 Catch:{ IOException -> 0x0007 }
        r0 = r0.d();	 Catch:{ IOException -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = r1.l;
        defpackage.awj.f(r0);
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ov.c():boolean");
    }

    public final void d() {
        if (this.o.get() != null) {
            awj.e(this.l);
            ((ScheduledFuture) this.o.get()).cancel(false);
            this.o.set(null);
        }
    }
}
