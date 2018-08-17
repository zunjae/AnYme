package defpackage;

import android.content.Context;
import java.io.BufferedReader;
import org.json.JSONArray;
import org.json.JSONObject;

final class pw {
    private final Context a;
    private final px b;

    pw(Context context, px pxVar) {
        this.a = context;
        this.b = pxVar;
    }

    private java.io.File a(java.io.File r4) {
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
        r3 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 9;
        if (r0 >= r1) goto L_0x0007;
    L_0x0006:
        return r4;
    L_0x0007:
        r0 = r4.getAbsolutePath();
        r1 = "/data";
        r0 = r0.startsWith(r1);
        if (r0 == 0) goto L_0x0034;
    L_0x0013:
        r0 = r3.a;	 Catch:{ NameNotFoundException -> 0x0031 }
        r0 = r0.getPackageManager();	 Catch:{ NameNotFoundException -> 0x0031 }
        r1 = r3.a;	 Catch:{ NameNotFoundException -> 0x0031 }
        r1 = r1.getPackageName();	 Catch:{ NameNotFoundException -> 0x0031 }
        r2 = 0;	 Catch:{ NameNotFoundException -> 0x0031 }
        r0 = r0.getApplicationInfo(r1, r2);	 Catch:{ NameNotFoundException -> 0x0031 }
        r1 = new java.io.File;	 Catch:{ NameNotFoundException -> 0x0031 }
        r0 = r0.nativeLibraryDir;	 Catch:{ NameNotFoundException -> 0x0031 }
        r2 = r4.getName();	 Catch:{ NameNotFoundException -> 0x0031 }
        r1.<init>(r0, r2);	 Catch:{ NameNotFoundException -> 0x0031 }
        r4 = r1;
        goto L_0x0034;
    L_0x0031:
        defpackage.avf.c();
    L_0x0034:
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.a(java.io.File):java.io.File");
    }

    private static byte[] a(org.json.JSONArray r2) {
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
        r0 = new org.json.JSONObject;
        r0.<init>();
        r1 = "binary_images";	 Catch:{ JSONException -> 0x0013 }
        r0.put(r1, r2);	 Catch:{ JSONException -> 0x0013 }
        r2 = r0.toString();
        r2 = r2.getBytes();
        return r2;
    L_0x0013:
        defpackage.avf.c();
        r2 = 0;
        r2 = new byte[r2];
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.a(org.json.JSONArray):byte[]");
    }

    private static String b(JSONArray jSONArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < jSONArray.length(); i++) {
            stringBuilder.append(jSONArray.getString(i));
        }
        return stringBuilder.toString();
    }

    private org.json.JSONArray b(java.lang.String r4) {
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
        r3 = this;
        r0 = new org.json.JSONArray;
        r0.<init>();
        r1 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x002d }
        r1.<init>(r4);	 Catch:{ JSONException -> 0x002d }
        r4 = "maps";	 Catch:{ JSONException -> 0x002d }
        r4 = r1.getJSONArray(r4);	 Catch:{ JSONException -> 0x002d }
        r4 = defpackage.pw.b(r4);	 Catch:{ JSONException -> 0x002d }
        r1 = "\\|";
        r4 = r4.split(r1);
        r1 = 0;
    L_0x001b:
        r2 = r4.length;
        if (r1 >= r2) goto L_0x002c;
    L_0x001e:
        r2 = r4[r1];
        r2 = r3.c(r2);
        if (r2 == 0) goto L_0x0029;
    L_0x0026:
        r0.put(r2);
    L_0x0029:
        r1 = r1 + 1;
        goto L_0x001b;
    L_0x002c:
        return r0;
    L_0x002d:
        defpackage.avf.c();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.b(java.lang.String):org.json.JSONArray");
    }

    private org.json.JSONObject c(java.lang.String r7) {
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
        r6 = this;
        r7 = defpackage.tq.a(r7);
        r0 = 0;
        if (r7 == 0) goto L_0x006c;
    L_0x0007:
        r1 = r7.c;
        r2 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r1 = r1.indexOf(r2);
        r2 = -1;
        if (r1 == r2) goto L_0x001e;
    L_0x0012:
        r1 = r7.d;
        r3 = 47;
        r1 = r1.indexOf(r3);
        if (r1 == r2) goto L_0x001e;
    L_0x001c:
        r1 = 1;
        goto L_0x001f;
    L_0x001e:
        r1 = 0;
    L_0x001f:
        if (r1 != 0) goto L_0x0022;
    L_0x0021:
        goto L_0x006c;
    L_0x0022:
        r1 = r7.d;
        r2 = new java.io.File;
        r2.<init>(r1);
        r1 = r2.exists();
        if (r1 != 0) goto L_0x0033;
    L_0x002f:
        r2 = r6.a(r2);
    L_0x0033:
        r1 = r6.b;	 Catch:{ IOException -> 0x005d }
        r1 = r1.a(r2);	 Catch:{ IOException -> 0x005d }
        r2 = new org.json.JSONObject;	 Catch:{ JSONException -> 0x0059 }
        r2.<init>();	 Catch:{ JSONException -> 0x0059 }
        r3 = "base_address";	 Catch:{ JSONException -> 0x0059 }
        r4 = r7.a;	 Catch:{ JSONException -> 0x0059 }
        r2.put(r3, r4);	 Catch:{ JSONException -> 0x0059 }
        r3 = "size";	 Catch:{ JSONException -> 0x0059 }
        r4 = r7.b;	 Catch:{ JSONException -> 0x0059 }
        r2.put(r3, r4);	 Catch:{ JSONException -> 0x0059 }
        r3 = "name";	 Catch:{ JSONException -> 0x0059 }
        r7 = r7.d;	 Catch:{ JSONException -> 0x0059 }
        r2.put(r3, r7);	 Catch:{ JSONException -> 0x0059 }
        r7 = "uuid";	 Catch:{ JSONException -> 0x0059 }
        r2.put(r7, r1);	 Catch:{ JSONException -> 0x0059 }
        return r2;
    L_0x0059:
        defpackage.avf.c();
        return r0;
    L_0x005d:
        defpackage.avf.c();
        r1 = new java.lang.StringBuilder;
        r2 = "Could not generate ID for file ";
        r1.<init>(r2);
        r7 = r7.d;
        r1.append(r7);
    L_0x006c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: pw.c(java.lang.String):org.json.JSONObject");
    }

    final byte[] a(BufferedReader bufferedReader) {
        JSONArray jSONArray = new JSONArray();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return pw.a(jSONArray);
            }
            JSONObject c = c(readLine);
            if (c != null) {
                jSONArray.put(c);
            }
        }
    }

    final byte[] a(String str) {
        return pw.a(b(str));
    }
}
