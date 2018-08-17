package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class asd {
    final /* synthetic */ asc a;
    private final String b;
    private final int c;

    asd(asc asc, String str, int i) {
        this.a = asc;
        this.b = biq.a(str);
        this.c = i;
    }

    public final int a() {
        return this.c;
    }

    public final String b() {
        return this.b.replaceAll("\u201d", "\"").replaceAll("\u201c", "\"").replaceAll("''", "\"");
    }

    public final java.lang.String c() {
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
        r0 = "\"([^\"]*)\"";
        r0 = java.util.regex.Pattern.compile(r0);
        r1 = r3.b();
        r0 = r0.matcher(r1);
        r1 = r0.find();
        r2 = 0;
        if (r1 == 0) goto L_0x002c;
    L_0x0015:
        r1 = 1;
        r0 = r0.group(r1);	 Catch:{ Exception -> 0x002c }
        r1 = " (";	 Catch:{ Exception -> 0x002c }
        r1 = r0.contains(r1);	 Catch:{ Exception -> 0x002c }
        if (r1 == 0) goto L_0x002b;	 Catch:{ Exception -> 0x002c }
    L_0x0022:
        r1 = " \\(";	 Catch:{ Exception -> 0x002c }
        r0 = r0.split(r1);	 Catch:{ Exception -> 0x002c }
        r1 = 0;	 Catch:{ Exception -> 0x002c }
        r0 = r0[r1];	 Catch:{ Exception -> 0x002c }
    L_0x002b:
        return r0;
    L_0x002c:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: asd.c():java.lang.String");
    }

    public final String d() {
        return this.b.replaceAll("\\(.*?\\) ?", BuildConfig.FLAVOR).replaceAll("\"", BuildConfig.FLAVOR).replaceAll("#[0-9]{0,4}: ", BuildConfig.FLAVOR).replaceAll("\\s++", " ").trim();
    }
}
