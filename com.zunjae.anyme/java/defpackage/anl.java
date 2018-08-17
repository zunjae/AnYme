package defpackage;

import android.content.Context;
import com.zunjae.zapplib.a;

public final class anl {
    public static double a() {
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
        r0 = "KEY_LAST_NEW_VERSION";
        r1 = 0;
        r0 = defpackage.aux.b(r0, r1);
        r1 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        if (r0 != 0) goto L_0x000c;
    L_0x000b:
        return r1;
    L_0x000c:
        r3 = java.lang.Double.parseDouble(r0);	 Catch:{ Exception -> 0x0011 }
        return r3;
    L_0x0011:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: anl.a():double");
    }

    public static boolean a(Context context) {
        if (!"com.zunjae.support".contains(".support")) {
            if (!"com.zunjae.support".contains("zunjae.")) {
                throw new IllegalStateException("Wrong package name set");
            }
        }
        return a.a(context, "com.zunjae.support");
    }

    public static boolean b(Context context) {
        return !anl.a(context);
    }
}
