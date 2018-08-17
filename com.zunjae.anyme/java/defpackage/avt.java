package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.Future;

final class avt extends avp<Boolean> {
    private final azk a = new ayz();
    private PackageManager b;
    private String c;
    private PackageInfo d;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private final Future<Map<String, avr>> p;
    private final Collection<avp> q;

    public avt(Future<Map<String, avr>> future, Collection<avp> collection) {
        this.p = future;
        this.q = collection;
    }

    private azv a(baf baf, Collection<avr> collection) {
        Context context = this.g;
        awh awh = new awh();
        return new azv(awh.a(context), this.i.c(), this.l, this.k, awj.a(awj.m(context)), this.n, awp.determineFrom(this.m).getId(), this.o, "0", baf, collection);
    }

    private static Map<String, avr> a(Map<String, avr> map, Collection<avp> collection) {
        for (avp avp : collection) {
            if (!map.containsKey(avp.b())) {
                map.put(avp.b(), new avr(avp.b(), avp.a(), "binary"));
            }
        }
        return map;
    }

    private java.lang.Boolean c() {
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
        r7 = this;
        r0 = r7.g;
        r0 = defpackage.awj.k(r0);
        r1 = r7.f();
        r2 = 0;
        if (r1 == 0) goto L_0x0096;
    L_0x000d:
        r3 = r7.p;	 Catch:{ Exception -> 0x0093 }
        if (r3 == 0) goto L_0x001a;	 Catch:{ Exception -> 0x0093 }
    L_0x0011:
        r3 = r7.p;	 Catch:{ Exception -> 0x0093 }
        r3 = r3.get();	 Catch:{ Exception -> 0x0093 }
        r3 = (java.util.Map) r3;	 Catch:{ Exception -> 0x0093 }
        goto L_0x001f;	 Catch:{ Exception -> 0x0093 }
    L_0x001a:
        r3 = new java.util.HashMap;	 Catch:{ Exception -> 0x0093 }
        r3.<init>();	 Catch:{ Exception -> 0x0093 }
    L_0x001f:
        r4 = r7.q;	 Catch:{ Exception -> 0x0093 }
        r3 = defpackage.avt.a(r3, r4);	 Catch:{ Exception -> 0x0093 }
        r1 = r1.a;	 Catch:{ Exception -> 0x0093 }
        r3 = r3.values();	 Catch:{ Exception -> 0x0093 }
        r4 = 1;	 Catch:{ Exception -> 0x0093 }
        r5 = "new";	 Catch:{ Exception -> 0x0093 }
        r6 = r1.b;	 Catch:{ Exception -> 0x0093 }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x0093 }
        if (r5 == 0) goto L_0x005c;	 Catch:{ Exception -> 0x0093 }
    L_0x0036:
        r4 = r7.g;	 Catch:{ Exception -> 0x0093 }
        r0 = defpackage.baf.a(r4, r0);	 Catch:{ Exception -> 0x0093 }
        r0 = r7.a(r0, r3);	 Catch:{ Exception -> 0x0093 }
        r3 = new azz;	 Catch:{ Exception -> 0x0093 }
        r4 = r7.g();	 Catch:{ Exception -> 0x0093 }
        r1 = r1.c;	 Catch:{ Exception -> 0x0093 }
        r5 = r7.a;	 Catch:{ Exception -> 0x0093 }
        r3.<init>(r7, r4, r1, r5);	 Catch:{ Exception -> 0x0093 }
        r0 = r3.a(r0);	 Catch:{ Exception -> 0x0093 }
        if (r0 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x0093 }
    L_0x0053:
        r0 = defpackage.bai.a();	 Catch:{ Exception -> 0x0093 }
        goto L_0x006a;	 Catch:{ Exception -> 0x0093 }
    L_0x0058:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0093 }
        goto L_0x0096;	 Catch:{ Exception -> 0x0093 }
    L_0x005c:
        r5 = "configured";	 Catch:{ Exception -> 0x0093 }
        r6 = r1.b;	 Catch:{ Exception -> 0x0093 }
        r5 = r5.equals(r6);	 Catch:{ Exception -> 0x0093 }
        if (r5 == 0) goto L_0x0070;	 Catch:{ Exception -> 0x0093 }
    L_0x0066:
        r0 = defpackage.bai.a();	 Catch:{ Exception -> 0x0093 }
    L_0x006a:
        r0 = r0.d();	 Catch:{ Exception -> 0x0093 }
        r2 = r0;	 Catch:{ Exception -> 0x0093 }
        goto L_0x0096;	 Catch:{ Exception -> 0x0093 }
    L_0x0070:
        r5 = r1.f;	 Catch:{ Exception -> 0x0093 }
        if (r5 == 0) goto L_0x0091;	 Catch:{ Exception -> 0x0093 }
    L_0x0074:
        defpackage.avf.c();	 Catch:{ Exception -> 0x0093 }
        r5 = r7.g;	 Catch:{ Exception -> 0x0093 }
        r0 = defpackage.baf.a(r5, r0);	 Catch:{ Exception -> 0x0093 }
        r0 = r7.a(r0, r3);	 Catch:{ Exception -> 0x0093 }
        r3 = new bar;	 Catch:{ Exception -> 0x0093 }
        r5 = r7.g();	 Catch:{ Exception -> 0x0093 }
        r1 = r1.c;	 Catch:{ Exception -> 0x0093 }
        r6 = r7.a;	 Catch:{ Exception -> 0x0093 }
        r3.<init>(r7, r5, r1, r6);	 Catch:{ Exception -> 0x0093 }
        r3.a(r0);	 Catch:{ Exception -> 0x0093 }
    L_0x0091:
        r2 = 1;
        goto L_0x0096;
    L_0x0093:
        defpackage.avf.c();
    L_0x0096:
        r0 = java.lang.Boolean.valueOf(r2);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: avt.c():java.lang.Boolean");
    }

    private defpackage.bam f() {
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
        r7 = this;
        r0 = defpackage.bai.a();	 Catch:{ Exception -> 0x0021 }
        r2 = r7.i;	 Catch:{ Exception -> 0x0021 }
        r3 = r7.a;	 Catch:{ Exception -> 0x0021 }
        r4 = r7.k;	 Catch:{ Exception -> 0x0021 }
        r5 = r7.l;	 Catch:{ Exception -> 0x0021 }
        r6 = r7.g();	 Catch:{ Exception -> 0x0021 }
        r1 = r7;	 Catch:{ Exception -> 0x0021 }
        r0 = r0.a(r1, r2, r3, r4, r5, r6);	 Catch:{ Exception -> 0x0021 }
        r0.c();	 Catch:{ Exception -> 0x0021 }
        r0 = defpackage.bai.a();	 Catch:{ Exception -> 0x0021 }
        r0 = r0.b();	 Catch:{ Exception -> 0x0021 }
        return r0;
    L_0x0021:
        defpackage.avf.c();
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: avt.f():bam");
    }

    private String g() {
        return awj.b(this.g, "com.crashlytics.ApiEndpoint");
    }

    public final String a() {
        return "1.4.3.25";
    }

    public final String b() {
        return "io.fabric.sdk.android:fabric";
    }

    protected final /* synthetic */ Object d() {
        return c();
    }

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
        r3 = this;
        r0 = 0;
        r1 = r3.i;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.h();	 Catch:{ NameNotFoundException -> 0x005e }
        r3.m = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r3.g;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.getPackageManager();	 Catch:{ NameNotFoundException -> 0x005e }
        r3.b = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r3.g;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.getPackageName();	 Catch:{ NameNotFoundException -> 0x005e }
        r3.c = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r3.b;	 Catch:{ NameNotFoundException -> 0x005e }
        r2 = r3.c;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.getPackageInfo(r2, r0);	 Catch:{ NameNotFoundException -> 0x005e }
        r3.d = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r3.d;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.versionCode;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ NameNotFoundException -> 0x005e }
        r3.k = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r3.d;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.versionName;	 Catch:{ NameNotFoundException -> 0x005e }
        if (r1 != 0) goto L_0x0036;	 Catch:{ NameNotFoundException -> 0x005e }
    L_0x0033:
        r1 = "0.0";	 Catch:{ NameNotFoundException -> 0x005e }
        goto L_0x003a;	 Catch:{ NameNotFoundException -> 0x005e }
    L_0x0036:
        r1 = r3.d;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.versionName;	 Catch:{ NameNotFoundException -> 0x005e }
    L_0x003a:
        r3.l = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r3.b;	 Catch:{ NameNotFoundException -> 0x005e }
        r2 = r3.g;	 Catch:{ NameNotFoundException -> 0x005e }
        r2 = r2.getApplicationInfo();	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.getApplicationLabel(r2);	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.toString();	 Catch:{ NameNotFoundException -> 0x005e }
        r3.n = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r3.g;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.getApplicationInfo();	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = r1.targetSdkVersion;	 Catch:{ NameNotFoundException -> 0x005e }
        r1 = java.lang.Integer.toString(r1);	 Catch:{ NameNotFoundException -> 0x005e }
        r3.o = r1;	 Catch:{ NameNotFoundException -> 0x005e }
        r0 = 1;
        return r0;
    L_0x005e:
        defpackage.avf.c();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: avt.e():boolean");
    }
}
