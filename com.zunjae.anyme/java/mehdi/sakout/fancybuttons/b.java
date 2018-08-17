package mehdi.sakout.fancybuttons;

import android.content.Context;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;

public final class b {
    private static Map<String, Typeface> a = new HashMap();

    public static int a(Context context, float f) {
        return Math.round(f / context.getResources().getDisplayMetrics().scaledDensity);
    }

    public static android.graphics.Typeface a(android.content.Context r6, java.lang.String r7, java.lang.String r8) {
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
        if (r7 != 0) goto L_0x0005;
    L_0x0002:
        r6 = android.graphics.Typeface.DEFAULT;
        return r6;
    L_0x0005:
        r0 = new java.io.File;
        r0.<init>(r7);
        r0 = r0.getName();
        r1 = "";
        r2 = android.text.TextUtils.isEmpty(r8);
        if (r2 != 0) goto L_0x001f;
    L_0x0016:
        r1 = new java.io.File;
        r1.<init>(r8);
        r1 = r1.getName();
    L_0x001f:
        r2 = a;
        r2 = r2.containsKey(r0);
        if (r2 == 0) goto L_0x0030;
    L_0x0027:
        r6 = a;
        r6 = r6.get(r0);
        r6 = (android.graphics.Typeface) r6;
        return r6;
    L_0x0030:
        r2 = 0;
        r3 = 1;
        r4 = r6.getResources();	 Catch:{ Exception -> 0x00d4 }
        r4 = r4.getAssets();	 Catch:{ Exception -> 0x00d4 }
        r5 = "";	 Catch:{ Exception -> 0x00d4 }
        r5 = r4.list(r5);	 Catch:{ Exception -> 0x00d4 }
        r5 = java.util.Arrays.asList(r5);	 Catch:{ Exception -> 0x00d4 }
        r7 = r5.contains(r7);	 Catch:{ Exception -> 0x00d4 }
        if (r7 == 0) goto L_0x0058;	 Catch:{ Exception -> 0x00d4 }
    L_0x004a:
        r6 = r6.getAssets();	 Catch:{ Exception -> 0x00d4 }
        r6 = android.graphics.Typeface.createFromAsset(r6, r0);	 Catch:{ Exception -> 0x00d4 }
        r7 = a;	 Catch:{ Exception -> 0x00d4 }
        r7.put(r0, r6);	 Catch:{ Exception -> 0x00d4 }
        return r6;	 Catch:{ Exception -> 0x00d4 }
    L_0x0058:
        r7 = "fonts";	 Catch:{ Exception -> 0x00d4 }
        r7 = r4.list(r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = java.util.Arrays.asList(r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = r7.contains(r0);	 Catch:{ Exception -> 0x00d4 }
        if (r7 == 0) goto L_0x0080;	 Catch:{ Exception -> 0x00d4 }
    L_0x0068:
        r6 = r6.getAssets();	 Catch:{ Exception -> 0x00d4 }
        r7 = "fonts/%s";	 Catch:{ Exception -> 0x00d4 }
        r8 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x00d4 }
        r8[r2] = r0;	 Catch:{ Exception -> 0x00d4 }
        r7 = java.lang.String.format(r7, r8);	 Catch:{ Exception -> 0x00d4 }
        r6 = android.graphics.Typeface.createFromAsset(r6, r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = a;	 Catch:{ Exception -> 0x00d4 }
        r7.put(r0, r6);	 Catch:{ Exception -> 0x00d4 }
        return r6;	 Catch:{ Exception -> 0x00d4 }
    L_0x0080:
        r7 = "iconfonts";	 Catch:{ Exception -> 0x00d4 }
        r7 = r4.list(r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = java.util.Arrays.asList(r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = r7.contains(r0);	 Catch:{ Exception -> 0x00d4 }
        if (r7 == 0) goto L_0x00a8;	 Catch:{ Exception -> 0x00d4 }
    L_0x0090:
        r6 = r6.getAssets();	 Catch:{ Exception -> 0x00d4 }
        r7 = "iconfonts/%s";	 Catch:{ Exception -> 0x00d4 }
        r8 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x00d4 }
        r8[r2] = r0;	 Catch:{ Exception -> 0x00d4 }
        r7 = java.lang.String.format(r7, r8);	 Catch:{ Exception -> 0x00d4 }
        r6 = android.graphics.Typeface.createFromAsset(r6, r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = a;	 Catch:{ Exception -> 0x00d4 }
        r7.put(r0, r6);	 Catch:{ Exception -> 0x00d4 }
        return r6;	 Catch:{ Exception -> 0x00d4 }
    L_0x00a8:
        r7 = android.text.TextUtils.isEmpty(r8);	 Catch:{ Exception -> 0x00d4 }
        if (r7 != 0) goto L_0x00cc;	 Catch:{ Exception -> 0x00d4 }
    L_0x00ae:
        r7 = "";	 Catch:{ Exception -> 0x00d4 }
        r7 = r4.list(r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = java.util.Arrays.asList(r7);	 Catch:{ Exception -> 0x00d4 }
        r7 = r7.contains(r8);	 Catch:{ Exception -> 0x00d4 }
        if (r7 == 0) goto L_0x00cc;	 Catch:{ Exception -> 0x00d4 }
    L_0x00be:
        r6 = r6.getAssets();	 Catch:{ Exception -> 0x00d4 }
        r6 = android.graphics.Typeface.createFromAsset(r6, r8);	 Catch:{ Exception -> 0x00d4 }
        r7 = a;	 Catch:{ Exception -> 0x00d4 }
        r7.put(r1, r6);	 Catch:{ Exception -> 0x00d4 }
        return r6;	 Catch:{ Exception -> 0x00d4 }
    L_0x00cc:
        r6 = new java.lang.Exception;	 Catch:{ Exception -> 0x00d4 }
        r7 = "Font not Found";	 Catch:{ Exception -> 0x00d4 }
        r6.<init>(r7);	 Catch:{ Exception -> 0x00d4 }
        throw r6;	 Catch:{ Exception -> 0x00d4 }
    L_0x00d4:
        r6 = mehdi.sakout.fancybuttons.FancyButton.a;
        r6 = "Unable to find %s font. Using Typeface.DEFAULT instead.";
        r7 = new java.lang.Object[r3];
        r7[r2] = r0;
        java.lang.String.format(r6, r7);
        r6 = a;
        r7 = android.graphics.Typeface.DEFAULT;
        r6.put(r0, r7);
        r6 = android.graphics.Typeface.DEFAULT;
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: mehdi.sakout.fancybuttons.b.a(android.content.Context, java.lang.String, java.lang.String):android.graphics.Typeface");
    }

    public static int b(Context context, float f) {
        return Math.round(f * context.getResources().getDisplayMetrics().scaledDensity);
    }
}
