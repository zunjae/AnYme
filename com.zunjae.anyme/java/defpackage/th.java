package defpackage;

import java.io.File;
import java.nio.charset.Charset;
import org.json.JSONObject;

final class th {
    private static final Charset a = Charset.forName("UTF-8");
    private final File b;

    public th(File file) {
        this.b = file;
    }

    private static String a(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? jSONObject.optString(str, null) : null;
    }

    public final defpackage.uj a(java.lang.String r5) {
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
        r5 = r4.b(r5);
        r0 = r5.exists();
        if (r0 != 0) goto L_0x000d;
    L_0x000a:
        r5 = defpackage.uj.a;
        return r5;
    L_0x000d:
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ Exception -> 0x003e }
        r1.<init>(r5);	 Catch:{ Exception -> 0x003e }
        r5 = defpackage.awj.a(r1);	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r0 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r0.<init>(r5);	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r5 = "userId";	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r5 = defpackage.th.a(r0, r5);	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r2 = "userName";	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r2 = defpackage.th.a(r0, r2);	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r3 = "userEmail";	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r0 = defpackage.th.a(r0, r3);	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r3 = new uj;	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        r3.<init>(r5, r2, r0);	 Catch:{ Exception -> 0x0039, all -> 0x0037 }
        defpackage.awj.a(r1);
        return r3;
    L_0x0037:
        r5 = move-exception;
        goto L_0x0047;
    L_0x0039:
        r0 = r1;
        goto L_0x003e;
    L_0x003b:
        r5 = move-exception;
        r1 = r0;
        goto L_0x0047;
    L_0x003e:
        defpackage.avf.c();	 Catch:{ all -> 0x003b }
        defpackage.awj.a(r0);
        r5 = defpackage.uj.a;
        return r5;
    L_0x0047:
        defpackage.awj.a(r1);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: th.a(java.lang.String):uj");
    }

    public final File b(String str) {
        File file = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("user.meta");
        return new File(file, stringBuilder.toString());
    }

    public final File c(String str) {
        File file = this.b;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append("keys.meta");
        return new File(file, stringBuilder.toString());
    }
}
