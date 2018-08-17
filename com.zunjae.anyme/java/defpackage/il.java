package defpackage;

import java.io.InputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class il implements ef<InputStream> {
    private static boolean a(java.io.InputStream r4, java.io.OutputStream r5) {
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
        r0 = defpackage.np.a();
        r0 = r0.b();
    L_0x0008:
        r1 = 0;
        r2 = r4.read(r0);	 Catch:{ IOException -> 0x0026, all -> 0x001d }
        r3 = -1;	 Catch:{ IOException -> 0x0026, all -> 0x001d }
        if (r2 == r3) goto L_0x0014;	 Catch:{ IOException -> 0x0026, all -> 0x001d }
    L_0x0010:
        r5.write(r0, r1, r2);	 Catch:{ IOException -> 0x0026, all -> 0x001d }
        goto L_0x0008;
    L_0x0014:
        r4 = defpackage.np.a();
        r4.a(r0);
        r4 = 1;
        return r4;
    L_0x001d:
        r4 = move-exception;
        r5 = defpackage.np.a();
        r5.a(r0);
        throw r4;
    L_0x0026:
        r4 = defpackage.np.a();
        r4.a(r0);
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: il.a(java.io.InputStream, java.io.OutputStream):boolean");
    }

    public final String a() {
        return BuildConfig.FLAVOR;
    }
}
