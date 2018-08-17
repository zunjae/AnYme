package defpackage;

import java.io.File;
import java.io.InputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class jv<T> implements ei<File, T> {
    private static final jw a = new jw();
    private ei<InputStream, T> b;
    private final jw c;

    public jv(ei<InputStream, T> eiVar) {
        this(eiVar, a);
    }

    private jv(ei<InputStream, T> eiVar, jw jwVar) {
        this.b = eiVar;
        this.c = jwVar;
    }

    private defpackage.ft<T> a(java.io.File r3, int r4, int r5) {
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
        r2 = this;
        r0 = 0;
        r1 = new java.io.FileInputStream;	 Catch:{ all -> 0x0013 }
        r1.<init>(r3);	 Catch:{ all -> 0x0013 }
        r3 = r2.b;	 Catch:{ all -> 0x0010 }
        r3 = r3.a(r1, r4, r5);	 Catch:{ all -> 0x0010 }
        r1.close();	 Catch:{ IOException -> 0x000f }
    L_0x000f:
        return r3;
    L_0x0010:
        r3 = move-exception;
        r0 = r1;
        goto L_0x0014;
    L_0x0013:
        r3 = move-exception;
    L_0x0014:
        if (r0 == 0) goto L_0x0019;
    L_0x0016:
        r0.close();	 Catch:{ IOException -> 0x0019 }
    L_0x0019:
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: jv.a(java.io.File, int, int):ft<T>");
    }

    public final String a() {
        return BuildConfig.FLAVOR;
    }
}
