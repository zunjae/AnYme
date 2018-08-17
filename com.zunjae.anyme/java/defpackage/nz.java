package defpackage;

import android.os.Looper;
import java.util.Collections;
import java.util.Map;

public class nz extends avp<Boolean> {
    boolean a = false;
    pk b;

    private static void a(String str) {
        avf.c();
        StringBuilder stringBuilder = new StringBuilder("Method ");
        stringBuilder.append(str);
        stringBuilder.append(" is not supported when using Crashlytics through Firebase.");
    }

    public static nz c() {
        return (nz) avf.a(nz.class);
    }

    private java.lang.Boolean f() {
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
        r5 = this;
        r0 = defpackage.bai.a();	 Catch:{ Exception -> 0x0048 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0048 }
        if (r0 != 0) goto L_0x0010;	 Catch:{ Exception -> 0x0048 }
    L_0x000a:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0048 }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ Exception -> 0x0048 }
        return r0;	 Catch:{ Exception -> 0x0048 }
    L_0x0010:
        r1 = r0.d;	 Catch:{ Exception -> 0x0048 }
        r1 = r1.d;	 Catch:{ Exception -> 0x0048 }
        if (r1 == 0) goto L_0x0036;	 Catch:{ Exception -> 0x0048 }
    L_0x0016:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0048 }
        r1 = r5.b;	 Catch:{ Exception -> 0x0048 }
        r0 = r0.e;	 Catch:{ Exception -> 0x0048 }
        r2 = r5.m();	 Catch:{ Exception -> 0x0048 }
        r3 = "com.crashlytics.ApiEndpoint";	 Catch:{ Exception -> 0x0048 }
        r2 = defpackage.awj.b(r2, r3);	 Catch:{ Exception -> 0x0048 }
        r3 = r1.c;	 Catch:{ Exception -> 0x0048 }
        r4 = r0.j;	 Catch:{ Exception -> 0x0048 }
        r3.a(r4);	 Catch:{ Exception -> 0x0048 }
        r1 = r1.a;	 Catch:{ Exception -> 0x0048 }
        r1.a(r0, r2);	 Catch:{ Exception -> 0x0048 }
        r0 = java.lang.Boolean.TRUE;	 Catch:{ Exception -> 0x0048 }
        return r0;	 Catch:{ Exception -> 0x0048 }
    L_0x0036:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0048 }
        r0 = r5.b;	 Catch:{ Exception -> 0x0048 }
        r1 = r0.b;	 Catch:{ Exception -> 0x0048 }
        r1.a();	 Catch:{ Exception -> 0x0048 }
        r0 = r0.a;	 Catch:{ Exception -> 0x0048 }
        r0.a();	 Catch:{ Exception -> 0x0048 }
        r0 = java.lang.Boolean.FALSE;	 Catch:{ Exception -> 0x0048 }
        return r0;
    L_0x0048:
        defpackage.avf.c();
        r0 = java.lang.Boolean.FALSE;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.f():java.lang.Boolean");
    }

    public final String a() {
        return "1.4.2.25";
    }

    public final void a(awn awn) {
        pk pkVar = this.b;
        if (pkVar != null) {
            String a = awn.a();
            String b = awn.b();
            if (Looper.myLooper() != Looper.getMainLooper()) {
                avf.c();
                od odVar = pkVar.a;
                Map singletonMap = Collections.singletonMap("sessionId", a);
                pn pnVar = new pn(po.CRASH);
                pnVar.c = singletonMap;
                pnVar.e = Collections.singletonMap("exceptionName", b);
                odVar.a(pnVar, true, false);
                return;
            }
            throw new IllegalStateException("onCrash called from main thread!!!");
        }
    }

    public final void a(os osVar) {
        if (osVar == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.a) {
            nz.a("logContentView");
        } else {
            pk pkVar = this.b;
            if (pkVar != null) {
                pkVar.a(osVar);
            }
        }
    }

    public final void a(ot otVar) {
        if (otVar == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.a) {
            nz.a("logCustom");
        } else {
            pk pkVar = this.b;
            if (pkVar != null) {
                avf.c();
                new StringBuilder("Logged custom event: ").append(otVar);
                od odVar = pkVar.a;
                pn pnVar = new pn(po.CUSTOM);
                pnVar.d = otVar.a();
                pnVar.e = otVar.c.b;
                odVar.a(pnVar);
            }
        }
    }

    public final void a(ph phVar) {
        if (phVar == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.a) {
            nz.a("logSearch");
        } else {
            pk pkVar = this.b;
            if (pkVar != null) {
                pkVar.a(phVar);
            }
        }
    }

    public final void a(ps psVar) {
        if (psVar == null) {
            throw new NullPointerException("event must not be null");
        } else if (this.a) {
            nz.a("logSignUp");
        } else {
            pk pkVar = this.b;
            if (pkVar != null) {
                pkVar.a(psVar);
            }
        }
    }

    public final String b() {
        return "com.crashlytics.sdk.android:answers";
    }

    protected final /* synthetic */ Object d() {
        return f();
    }

    @android.annotation.SuppressLint({"NewApi"})
    protected final boolean e() {
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
        r18 = this;
        r8 = r18;
        r9 = 0;
        r10 = r18.m();	 Catch:{ Exception -> 0x00a1 }
        r0 = r10.getPackageManager();	 Catch:{ Exception -> 0x00a1 }
        r1 = r10.getPackageName();	 Catch:{ Exception -> 0x00a1 }
        r2 = r0.getPackageInfo(r1, r9);	 Catch:{ Exception -> 0x00a1 }
        r3 = r2.versionCode;	 Catch:{ Exception -> 0x00a1 }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ Exception -> 0x00a1 }
        r4 = r2.versionName;	 Catch:{ Exception -> 0x00a1 }
        if (r4 != 0) goto L_0x0020;	 Catch:{ Exception -> 0x00a1 }
    L_0x001d:
        r4 = "0.0";	 Catch:{ Exception -> 0x00a1 }
        goto L_0x0022;	 Catch:{ Exception -> 0x00a1 }
    L_0x0020:
        r4 = r2.versionName;	 Catch:{ Exception -> 0x00a1 }
    L_0x0022:
        r5 = android.os.Build.VERSION.SDK_INT;	 Catch:{ Exception -> 0x00a1 }
        r6 = 9;	 Catch:{ Exception -> 0x00a1 }
        if (r5 < r6) goto L_0x002d;	 Catch:{ Exception -> 0x00a1 }
    L_0x0028:
        r0 = r2.firstInstallTime;	 Catch:{ Exception -> 0x00a1 }
    L_0x002a:
        r16 = r0;	 Catch:{ Exception -> 0x00a1 }
        goto L_0x003d;	 Catch:{ Exception -> 0x00a1 }
    L_0x002d:
        r0 = r0.getApplicationInfo(r1, r9);	 Catch:{ Exception -> 0x00a1 }
        r1 = new java.io.File;	 Catch:{ Exception -> 0x00a1 }
        r0 = r0.sourceDir;	 Catch:{ Exception -> 0x00a1 }
        r1.<init>(r0);	 Catch:{ Exception -> 0x00a1 }
        r0 = r1.lastModified();	 Catch:{ Exception -> 0x00a1 }
        goto L_0x002a;	 Catch:{ Exception -> 0x00a1 }
    L_0x003d:
        r0 = r18.l();	 Catch:{ Exception -> 0x00a1 }
        r5 = new pr;	 Catch:{ Exception -> 0x00a1 }
        r5.<init>(r10, r0, r3, r4);	 Catch:{ Exception -> 0x00a1 }
        r3 = new ok;	 Catch:{ Exception -> 0x00a1 }
        r0 = new azp;	 Catch:{ Exception -> 0x00a1 }
        r0.<init>(r8);	 Catch:{ Exception -> 0x00a1 }
        r3.<init>(r10, r0);	 Catch:{ Exception -> 0x00a1 }
        r6 = new ayz;	 Catch:{ Exception -> 0x00a1 }
        r0 = defpackage.avf.c();	 Catch:{ Exception -> 0x00a1 }
        r6.<init>(r0);	 Catch:{ Exception -> 0x00a1 }
        r13 = new ava;	 Catch:{ Exception -> 0x00a1 }
        r13.<init>(r10);	 Catch:{ Exception -> 0x00a1 }
        r0 = "Answers Events Handler";	 Catch:{ Exception -> 0x00a1 }
        r7 = defpackage.awr.b(r0);	 Catch:{ Exception -> 0x00a1 }
        r14 = new op;	 Catch:{ Exception -> 0x00a1 }
        r14.<init>(r7);	 Catch:{ Exception -> 0x00a1 }
        r11 = new oy;	 Catch:{ Exception -> 0x00a1 }
        r11.<init>(r10);	 Catch:{ Exception -> 0x00a1 }
        r12 = new od;	 Catch:{ Exception -> 0x00a1 }
        r0 = r12;	 Catch:{ Exception -> 0x00a1 }
        r1 = r18;	 Catch:{ Exception -> 0x00a1 }
        r2 = r10;	 Catch:{ Exception -> 0x00a1 }
        r4 = r5;	 Catch:{ Exception -> 0x00a1 }
        r5 = r6;	 Catch:{ Exception -> 0x00a1 }
        r6 = r7;	 Catch:{ Exception -> 0x00a1 }
        r7 = r11;	 Catch:{ Exception -> 0x00a1 }
        r0.<init>(r1, r2, r3, r4, r5, r6, r7);	 Catch:{ Exception -> 0x00a1 }
        r0 = new azr;	 Catch:{ Exception -> 0x00a1 }
        r1 = "settings";	 Catch:{ Exception -> 0x00a1 }
        r0.<init>(r10, r1);	 Catch:{ Exception -> 0x00a1 }
        r15 = new om;	 Catch:{ Exception -> 0x00a1 }
        r15.<init>(r0);	 Catch:{ Exception -> 0x00a1 }
        r0 = new pk;	 Catch:{ Exception -> 0x00a1 }
        r11 = r0;	 Catch:{ Exception -> 0x00a1 }
        r11.<init>(r12, r13, r14, r15, r16);	 Catch:{ Exception -> 0x00a1 }
        r8.b = r0;	 Catch:{ Exception -> 0x00a1 }
        r0 = r8.b;	 Catch:{ Exception -> 0x00a1 }
        r0.b();	 Catch:{ Exception -> 0x00a1 }
        r0 = new awv;	 Catch:{ Exception -> 0x00a1 }
        r0.<init>();	 Catch:{ Exception -> 0x00a1 }
        r0 = defpackage.awv.a(r10);	 Catch:{ Exception -> 0x00a1 }
        r8.a = r0;	 Catch:{ Exception -> 0x00a1 }
        r0 = 1;
        return r0;
    L_0x00a1:
        defpackage.avf.c();
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: nz.e():boolean");
    }
}
