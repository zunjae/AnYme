package defpackage;

import android.graphics.Typeface;

public final class ady implements adm {
    private static Typeface a;

    public final adl getIcon(String str) {
        return adz.valueOf(str);
    }

    public final String getMappingPrefix() {
        return "mdf";
    }

    public final android.graphics.Typeface getTypeface(android.content.Context r2) {
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
        r1 = this;
        r0 = a;
        if (r0 != 0) goto L_0x0013;
    L_0x0004:
        r2 = r2.getAssets();	 Catch:{ Exception -> 0x0011 }
        r0 = "fonts/materialdrawerfont-font-v5.0.0.ttf";	 Catch:{ Exception -> 0x0011 }
        r2 = android.graphics.Typeface.createFromAsset(r2, r0);	 Catch:{ Exception -> 0x0011 }
        a = r2;	 Catch:{ Exception -> 0x0011 }
        goto L_0x0013;
    L_0x0011:
        r2 = 0;
        return r2;
    L_0x0013:
        r2 = a;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: ady.getTypeface(android.content.Context):android.graphics.Typeface");
    }
}
