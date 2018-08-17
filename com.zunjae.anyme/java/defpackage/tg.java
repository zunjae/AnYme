package defpackage;

import android.content.Context;

final class tg implements ui {
    private final Context a;
    private final String b;

    public tg(Context context, String str) {
        this.a = context;
        this.b = str;
    }

    public final java.lang.String a() {
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
        r4 = this;
        r0 = r4.a;
        r0 = r0.getPackageManager();
        r1 = 0;
        r2 = r4.b;	 Catch:{ Exception -> 0x001a }
        r3 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ Exception -> 0x001a }
        r0 = r0.getApplicationInfo(r2, r3);	 Catch:{ Exception -> 0x001a }
        r0 = r0.metaData;	 Catch:{ Exception -> 0x001a }
        if (r0 == 0) goto L_0x001a;	 Catch:{ Exception -> 0x001a }
    L_0x0013:
        r2 = "io.fabric.unity.crashlytics.version";	 Catch:{ Exception -> 0x001a }
        r0 = r0.getString(r2);	 Catch:{ Exception -> 0x001a }
        r1 = r0;
    L_0x001a:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: tg.a():java.lang.String");
    }
}
