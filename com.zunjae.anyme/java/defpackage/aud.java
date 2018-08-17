package defpackage;

import android.content.Context;
import com.zunjae.zapplib.a;

public final class aud {
    public static boolean a(Context context) {
        return a.a(context, "com.dv.adm", "com.dv.adm.pay");
    }

    public static void b(android.content.Context r3) {
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
        r0 = new android.content.Intent;	 Catch:{ ActivityNotFoundException -> 0x0011 }
        r1 = "android.intent.action.VIEW";	 Catch:{ ActivityNotFoundException -> 0x0011 }
        r2 = "market://details?id=com.dv.adm";	 Catch:{ ActivityNotFoundException -> 0x0011 }
        r2 = android.net.Uri.parse(r2);	 Catch:{ ActivityNotFoundException -> 0x0011 }
        r0.<init>(r1, r2);	 Catch:{ ActivityNotFoundException -> 0x0011 }
        r3.startActivity(r0);	 Catch:{ ActivityNotFoundException -> 0x0011 }
        return;
    L_0x0011:
        r0 = new android.content.Intent;
        r1 = "android.intent.action.VIEW";
        r2 = "https://play.google.com/store/apps/details?id=com.dv.adm";
        r2 = android.net.Uri.parse(r2);
        r0.<init>(r1, r2);
        r3.startActivity(r0);
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: aud.b(android.content.Context):void");
    }
}
