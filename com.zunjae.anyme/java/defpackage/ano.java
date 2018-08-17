package defpackage;

import android.content.Context;

public final class ano {
    private static final String a = "ano";

    public static void a(Context context, String str) {
        if (str != null && str.length() > 0 && str.contains("function")) {
            auk.a(context, "HH_custom_min.js", str);
        }
    }

    public static boolean a(Context context) {
        return auk.b(context, "HH_custom_min.js");
    }

    public static boolean b(Context context) {
        return !auk.b(context, "HH_custom_min.js");
    }

    public static java.io.InputStream c(android.content.Context r1) {
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
        r0 = "HH_custom_min.js";	 Catch:{ IOException -> 0x000b }
        r1 = defpackage.auk.a(r1, r0);	 Catch:{ IOException -> 0x000b }
        r1 = defpackage.bij.a(r1);	 Catch:{ IOException -> 0x000b }
        return r1;
    L_0x000b:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: ano.c(android.content.Context):java.io.InputStream");
    }
}
