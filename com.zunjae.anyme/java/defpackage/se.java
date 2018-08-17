package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

@axv(a = {sn.class})
public class se extends avp<Void> {
    private final long a;
    private final ConcurrentHashMap<String, String> b;
    private sk c;
    private sk d;
    private sl k;
    private qp l;
    private String m;
    private String n;
    private String o;
    private float p;
    private boolean q;
    private final tn r;
    private azk s;
    private qm t;
    private sn u;

    public se() {
        this((byte) 0);
    }

    private se(byte b) {
        this(awr.a("Crashlytics Exception Handler"));
    }

    private se(ExecutorService executorService) {
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = 1.0f;
        this.k = new sj();
        this.r = null;
        this.q = false;
        this.t = new qm(executorService);
        this.b = new ConcurrentHashMap();
        this.a = System.currentTimeMillis();
    }

    private boolean a(android.content.Context r20) {
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
        r19 = this;
        r11 = r19;
        r12 = r20;
        r0 = r11.q;
        r13 = 0;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r13;
    L_0x000a:
        r0 = new awh;
        r0.<init>();
        r2 = defpackage.awh.a(r20);
        if (r2 != 0) goto L_0x0016;
    L_0x0015:
        return r13;
    L_0x0016:
        r3 = defpackage.awj.m(r20);
        r0 = "com.crashlytics.RequireBuildId";
        r14 = 1;
        r0 = defpackage.awj.a(r12, r0, r14);
        if (r0 != 0) goto L_0x0028;
    L_0x0023:
        defpackage.avf.c();
    L_0x0026:
        r0 = 1;
        goto L_0x0030;
    L_0x0028:
        r0 = defpackage.awj.d(r3);
        if (r0 != 0) goto L_0x002f;
    L_0x002e:
        goto L_0x0026;
    L_0x002f:
        r0 = 0;
    L_0x0030:
        if (r0 == 0) goto L_0x0123;
    L_0x0032:
        defpackage.avf.c();	 Catch:{ Exception -> 0x011c }
        r8 = new azp;	 Catch:{ Exception -> 0x011c }
        r8.<init>(r11);	 Catch:{ Exception -> 0x011c }
        r0 = new sk;	 Catch:{ Exception -> 0x011c }
        r1 = "crash_marker";	 Catch:{ Exception -> 0x011c }
        r0.<init>(r1, r8);	 Catch:{ Exception -> 0x011c }
        r11.d = r0;	 Catch:{ Exception -> 0x011c }
        r0 = new sk;	 Catch:{ Exception -> 0x011c }
        r1 = "initialization_marker";	 Catch:{ Exception -> 0x011c }
        r0.<init>(r1, r8);	 Catch:{ Exception -> 0x011c }
        r11.c = r0;	 Catch:{ Exception -> 0x011c }
        r0 = new azr;	 Catch:{ Exception -> 0x011c }
        r1 = r19.m();	 Catch:{ Exception -> 0x011c }
        r4 = "com.crashlytics.android.core.CrashlyticsCore";	 Catch:{ Exception -> 0x011c }
        r0.<init>(r1, r4);	 Catch:{ Exception -> 0x011c }
        r9 = new to;	 Catch:{ Exception -> 0x011c }
        r9.<init>(r0, r11);	 Catch:{ Exception -> 0x011c }
        r0 = r11.r;	 Catch:{ Exception -> 0x011c }
        if (r0 == 0) goto L_0x0068;	 Catch:{ Exception -> 0x011c }
    L_0x0060:
        r0 = new so;	 Catch:{ Exception -> 0x011c }
        r1 = r11.r;	 Catch:{ Exception -> 0x011c }
        r0.<init>(r1);	 Catch:{ Exception -> 0x011c }
        goto L_0x0069;	 Catch:{ Exception -> 0x011c }
    L_0x0068:
        r0 = 0;	 Catch:{ Exception -> 0x011c }
    L_0x0069:
        r1 = new ayz;	 Catch:{ Exception -> 0x011c }
        r4 = defpackage.avf.c();	 Catch:{ Exception -> 0x011c }
        r1.<init>(r4);	 Catch:{ Exception -> 0x011c }
        r11.s = r1;	 Catch:{ Exception -> 0x011c }
        r1 = r11.s;	 Catch:{ Exception -> 0x011c }
        r1.a(r0);	 Catch:{ Exception -> 0x011c }
        r10 = r19.l();	 Catch:{ Exception -> 0x011c }
        r5 = r20.getPackageName();	 Catch:{ Exception -> 0x011c }
        r4 = r10.h();	 Catch:{ Exception -> 0x011c }
        r0 = r20.getPackageManager();	 Catch:{ Exception -> 0x011c }
        r0 = r0.getPackageInfo(r5, r13);	 Catch:{ Exception -> 0x011c }
        r1 = r0.versionCode;	 Catch:{ Exception -> 0x011c }
        r6 = java.lang.Integer.toString(r1);	 Catch:{ Exception -> 0x011c }
        r1 = r0.versionName;	 Catch:{ Exception -> 0x011c }
        if (r1 != 0) goto L_0x009a;	 Catch:{ Exception -> 0x011c }
    L_0x0097:
        r0 = "0.0";	 Catch:{ Exception -> 0x011c }
        goto L_0x009c;	 Catch:{ Exception -> 0x011c }
    L_0x009a:
        r0 = r0.versionName;	 Catch:{ Exception -> 0x011c }
    L_0x009c:
        r7 = r0;	 Catch:{ Exception -> 0x011c }
        r0 = new pu;	 Catch:{ Exception -> 0x011c }
        r1 = r0;	 Catch:{ Exception -> 0x011c }
        r1.<init>(r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x011c }
        r7 = new tg;	 Catch:{ Exception -> 0x011c }
        r1 = r0.d;	 Catch:{ Exception -> 0x011c }
        r7.<init>(r12, r1);	 Catch:{ Exception -> 0x011c }
        r16 = defpackage.su.a(r19);	 Catch:{ Exception -> 0x011c }
        r17 = defpackage.oo.a(r20);	 Catch:{ Exception -> 0x011c }
        defpackage.avf.c();	 Catch:{ Exception -> 0x011c }
        r1 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x011c }
        r2 = "Installer package name is: ";	 Catch:{ Exception -> 0x011c }
        r1.<init>(r2);	 Catch:{ Exception -> 0x011c }
        r2 = r0.c;	 Catch:{ Exception -> 0x011c }
        r1.append(r2);	 Catch:{ Exception -> 0x011c }
        r6 = new qp;	 Catch:{ Exception -> 0x011c }
        r2 = r11.t;	 Catch:{ Exception -> 0x011c }
        r3 = r11.s;	 Catch:{ Exception -> 0x011c }
        r18 = r0;	 Catch:{ Exception -> 0x011c }
        r0 = r6;	 Catch:{ Exception -> 0x011c }
        r1 = r19;	 Catch:{ Exception -> 0x011c }
        r4 = r10;	 Catch:{ Exception -> 0x011c }
        r5 = r9;	 Catch:{ Exception -> 0x011c }
        r10 = r6;	 Catch:{ Exception -> 0x011c }
        r6 = r8;	 Catch:{ Exception -> 0x011c }
        r8 = r7;	 Catch:{ Exception -> 0x011c }
        r7 = r18;	 Catch:{ Exception -> 0x011c }
        r9 = r16;	 Catch:{ Exception -> 0x011c }
        r15 = r10;	 Catch:{ Exception -> 0x011c }
        r10 = r17;	 Catch:{ Exception -> 0x011c }
        r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10);	 Catch:{ Exception -> 0x011c }
        r11.l = r15;	 Catch:{ Exception -> 0x011c }
        r0 = r11.c;	 Catch:{ Exception -> 0x011c }
        r0 = r0.b();	 Catch:{ Exception -> 0x011c }
        r1 = r11.t;	 Catch:{ Exception -> 0x011c }
        r2 = new si;	 Catch:{ Exception -> 0x011c }
        r3 = r11.d;	 Catch:{ Exception -> 0x011c }
        r2.<init>(r3);	 Catch:{ Exception -> 0x011c }
        r1 = r1.a(r2);	 Catch:{ Exception -> 0x011c }
        r1 = (java.lang.Boolean) r1;	 Catch:{ Exception -> 0x011c }
        r2 = java.lang.Boolean.TRUE;	 Catch:{ Exception -> 0x011c }
        r2.equals(r1);	 Catch:{ Exception -> 0x011c }
        r1 = new awv;	 Catch:{ Exception -> 0x011c }
        r1.<init>();	 Catch:{ Exception -> 0x011c }
        r1 = defpackage.awv.a(r20);	 Catch:{ Exception -> 0x011c }
        r2 = r11.l;	 Catch:{ Exception -> 0x011c }
        r3 = java.lang.Thread.getDefaultUncaughtExceptionHandler();	 Catch:{ Exception -> 0x011c }
        r2.a(r3, r1);	 Catch:{ Exception -> 0x011c }
        if (r0 == 0) goto L_0x0118;	 Catch:{ Exception -> 0x011c }
    L_0x010b:
        r0 = defpackage.awj.n(r20);	 Catch:{ Exception -> 0x011c }
        if (r0 == 0) goto L_0x0118;	 Catch:{ Exception -> 0x011c }
    L_0x0111:
        defpackage.avf.c();	 Catch:{ Exception -> 0x011c }
        r19.q();	 Catch:{ Exception -> 0x011c }
        return r13;
    L_0x0118:
        defpackage.avf.c();
        return r14;
    L_0x011c:
        defpackage.avf.c();
        r0 = 0;
        r11.l = r0;
        return r13;
    L_0x0123:
        r0 = new ayh;
        r1 = "This app relies on Crashlytics. Please sign up for access at https://fabric.io/sign_up,\ninstall an Android build tool and ask a team member to invite you to this app's organization.";
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: se.a(android.content.Context):boolean");
    }

    private void q() {
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
        r0 = new sf;
        r0.<init>(r4);
        r1 = r4.p();
        r1 = r1.iterator();
    L_0x000d:
        r2 = r1.hasNext();
        if (r2 == 0) goto L_0x001d;
    L_0x0013:
        r2 = r1.next();
        r2 = (defpackage.ayg) r2;
        r0.a(r2);
        goto L_0x000d;
    L_0x001d:
        r1 = r4.n();
        r1 = r1.b();
        r0 = r1.submit(r0);
        defpackage.avf.c();
        r1 = 4;
        r3 = java.util.concurrent.TimeUnit.SECONDS;	 Catch:{ InterruptedException -> 0x003c, ExecutionException -> 0x0038, TimeoutException -> 0x0034 }
        r0.get(r1, r3);	 Catch:{ InterruptedException -> 0x003c, ExecutionException -> 0x0038, TimeoutException -> 0x0034 }
        return;
    L_0x0034:
        defpackage.avf.c();
        return;
    L_0x0038:
        defpackage.avf.c();
        return;
    L_0x003c:
        defpackage.avf.c();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: se.q():void");
    }

    private void r() {
        this.t.b(new sh(this));
    }

    public final String a() {
        return "2.6.3.25";
    }

    public final void a(String str) {
        String str2 = "CrashlyticsCore";
        if (!this.q) {
            Object obj;
            long currentTimeMillis;
            qp qpVar;
            StringBuilder stringBuilder;
            se seVar = (se) avf.a(se.class);
            if (seVar != null) {
                if (seVar.l != null) {
                    obj = 1;
                    if (obj != null) {
                        currentTimeMillis = System.currentTimeMillis() - this.a;
                        qpVar = this.l;
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(awj.c());
                        stringBuilder.append("/");
                        stringBuilder.append(str2);
                        stringBuilder.append(" ");
                        stringBuilder.append(str);
                        qpVar.a(currentTimeMillis, stringBuilder.toString());
                    }
                }
            }
            avf.c();
            obj = null;
            if (obj != null) {
                currentTimeMillis = System.currentTimeMillis() - this.a;
                qpVar = this.l;
                stringBuilder = new StringBuilder();
                stringBuilder.append(awj.c());
                stringBuilder.append("/");
                stringBuilder.append(str2);
                stringBuilder.append(" ");
                stringBuilder.append(str);
                qpVar.a(currentTimeMillis, stringBuilder.toString());
            }
        }
    }

    public final String b() {
        return "com.crashlytics.sdk.android.crashlytics-core";
    }

    protected final java.lang.Void c() {
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
        r0 = r4.t;
        r1 = new sg;
        r1.<init>(r4);
        r0.a(r1);
        r0 = r4.l;
        r0.c();
        r0 = 0;
        r1 = r4.l;	 Catch:{ Exception -> 0x0068 }
        r1.f();	 Catch:{ Exception -> 0x0068 }
        r1 = defpackage.bai.a();	 Catch:{ Exception -> 0x0068 }
        r1 = r1.b();	 Catch:{ Exception -> 0x0068 }
        if (r1 != 0) goto L_0x0026;	 Catch:{ Exception -> 0x0068 }
    L_0x001f:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0068 }
        r4.r();
        return r0;
    L_0x0026:
        r2 = r4.l;	 Catch:{ Exception -> 0x0068 }
        r2.a(r1);	 Catch:{ Exception -> 0x0068 }
        r2 = r1.d;	 Catch:{ Exception -> 0x0068 }
        r2 = r2.c;	 Catch:{ Exception -> 0x0068 }
        if (r2 != 0) goto L_0x0038;	 Catch:{ Exception -> 0x0068 }
    L_0x0031:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0068 }
        r4.r();
        return r0;
    L_0x0038:
        r2 = r4.u;	 Catch:{ Exception -> 0x0068 }
        if (r2 == 0) goto L_0x0043;	 Catch:{ Exception -> 0x0068 }
    L_0x003c:
        r2 = r4.u;	 Catch:{ Exception -> 0x0068 }
        r2 = r2.a();	 Catch:{ Exception -> 0x0068 }
        goto L_0x0044;	 Catch:{ Exception -> 0x0068 }
    L_0x0043:
        r2 = r0;	 Catch:{ Exception -> 0x0068 }
    L_0x0044:
        if (r2 == 0) goto L_0x0051;	 Catch:{ Exception -> 0x0068 }
    L_0x0046:
        r3 = r4.l;	 Catch:{ Exception -> 0x0068 }
        r2 = r3.a(r2);	 Catch:{ Exception -> 0x0068 }
        if (r2 != 0) goto L_0x0051;	 Catch:{ Exception -> 0x0068 }
    L_0x004e:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0068 }
    L_0x0051:
        r2 = r4.l;	 Catch:{ Exception -> 0x0068 }
        r3 = r1.b;	 Catch:{ Exception -> 0x0068 }
        r2 = r2.a(r3);	 Catch:{ Exception -> 0x0068 }
        if (r2 != 0) goto L_0x005e;	 Catch:{ Exception -> 0x0068 }
    L_0x005b:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0068 }
    L_0x005e:
        r2 = r4.l;	 Catch:{ Exception -> 0x0068 }
        r3 = r4.p;	 Catch:{ Exception -> 0x0068 }
        r2.a(r3, r1);	 Catch:{ Exception -> 0x0068 }
        goto L_0x006b;
    L_0x0066:
        r0 = move-exception;
        goto L_0x006f;
    L_0x0068:
        defpackage.avf.c();	 Catch:{ all -> 0x0066 }
    L_0x006b:
        r4.r();
        return r0;
    L_0x006f:
        r4.r();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: se.c():java.lang.Void");
    }

    protected final /* synthetic */ Object d() {
        return c();
    }

    protected final boolean e() {
        return a(super.m());
    }

    final Map<String, String> f() {
        return Collections.unmodifiableMap(this.b);
    }

    final String g() {
        return l().a() ? this.m : null;
    }

    final String h() {
        return l().a() ? this.n : null;
    }

    final String i() {
        return l().a() ? this.o : null;
    }

    final void j() {
        this.d.a();
    }
}
