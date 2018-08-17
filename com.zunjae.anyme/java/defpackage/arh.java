package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class arh {
    private String a;
    private String b;
    private String c = BuildConfig.FLAVOR;
    private long d;
    private boolean e = false;

    public arh(String str) {
        this.a = str;
    }

    public arh(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final void a(long j) {
        this.d = j;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final void a(boolean z) {
        this.e = z;
    }

    public final boolean a() {
        return this.e;
    }

    public final long b() {
        return this.d;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final String c() {
        return this.a;
    }

    public final String d() {
        if (this.a.split(", ").length != 2) {
            return this.a;
        }
        return String.format("%s %s", new Object[]{this.a.split(", ")[1], this.a.split(", ")[0]});
    }

    public final String e() {
        return this.b;
    }

    public final int f() {
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
        r0 = r2.b;	 Catch:{ Exception -> 0x0010 }
        r1 = "/";	 Catch:{ Exception -> 0x0010 }
        r0 = r0.split(r1);	 Catch:{ Exception -> 0x0010 }
        r1 = 4;	 Catch:{ Exception -> 0x0010 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0010 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x0010 }
        return r0;
    L_0x0010:
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: arh.f():int");
    }

    public final java.lang.String g() {
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
        r0 = r2.c;	 Catch:{ Exception -> 0x0032 }
        r1 = "/images";	 Catch:{ Exception -> 0x0032 }
        r0 = r0.split(r1);	 Catch:{ Exception -> 0x0032 }
        r1 = 1;	 Catch:{ Exception -> 0x0032 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0032 }
        r1 = "\\?s";	 Catch:{ Exception -> 0x0032 }
        r0 = r0.split(r1);	 Catch:{ Exception -> 0x0032 }
        r1 = 0;	 Catch:{ Exception -> 0x0032 }
        r0 = r0[r1];	 Catch:{ Exception -> 0x0032 }
        r1 = "characters";	 Catch:{ Exception -> 0x0032 }
        r1 = r0.contains(r1);	 Catch:{ Exception -> 0x0032 }
        if (r1 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x0032 }
    L_0x001c:
        r1 = ".jpg";	 Catch:{ Exception -> 0x0032 }
        r1 = r0.contains(r1);	 Catch:{ Exception -> 0x0032 }
        if (r1 == 0) goto L_0x002f;	 Catch:{ Exception -> 0x0032 }
    L_0x0024:
        r1 = "https://myanimelist.cdn-dena.com/images";	 Catch:{ Exception -> 0x0032 }
        r0 = java.lang.String.valueOf(r0);	 Catch:{ Exception -> 0x0032 }
        r0 = r1.concat(r0);	 Catch:{ Exception -> 0x0032 }
        return r0;	 Catch:{ Exception -> 0x0032 }
    L_0x002f:
        r0 = r2.c;	 Catch:{ Exception -> 0x0032 }
        return r0;
    L_0x0032:
        r0 = r2.c;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: arh.g():java.lang.String");
    }

    public final String h() {
        return this.c;
    }
}
