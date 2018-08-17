package defpackage;

import android.content.Context;

public final class auh {
    public static boolean a(Context context) {
        return auh.b(context);
    }

    private static boolean b(android.content.Context r2) {
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
        r0 = 0;
        r1 = "connectivity";	 Catch:{ Exception -> 0x0015 }
        r2 = r2.getSystemService(r1);	 Catch:{ Exception -> 0x0015 }
        r2 = (android.net.ConnectivityManager) r2;	 Catch:{ Exception -> 0x0015 }
        r2 = r2.getActiveNetworkInfo();	 Catch:{ Exception -> 0x0015 }
        r2 = r2.getType();	 Catch:{ Exception -> 0x0015 }
        if (r2 != 0) goto L_0x0015;
    L_0x0013:
        r2 = 1;
        return r2;
    L_0x0015:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: auh.b(android.content.Context):boolean");
    }
}
