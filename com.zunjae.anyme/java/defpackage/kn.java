package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.io.InputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class kn implements ei<InputStream, ka> {
    private static final kp a = new kp();
    private static final ko b = new ko();
    private final Context c;
    private final kp d;
    private final ga e;
    private final ko f;
    private final jz g;

    public kn(Context context, ga gaVar) {
        this(context, gaVar, a, b);
    }

    private kn(Context context, ga gaVar, kp kpVar, ko koVar) {
        this.c = context;
        this.e = gaVar;
        this.f = koVar;
        this.g = new jz(gaVar);
        this.d = kpVar;
    }

    private kd a(InputStream inputStream, int i, int i2) {
        byte[] a = kn.a(inputStream);
        ea a2 = this.d.a(a);
        dw a3 = this.f.a(this.g);
        try {
            dz b = a2.b();
            kd kdVar = null;
            if (b.a() > 0) {
                if (b.b() == 0) {
                    a3.a(b, a);
                    a3.a();
                    Bitmap f = a3.f();
                    if (f != null) {
                        kdVar = new kd(new ka(this.c, this.g, this.e, jq.b(), i, i2, b, a, f));
                    }
                }
            }
            this.d.a(a2);
            this.f.a(a3);
            return kdVar;
        } catch (Throwable th) {
            this.d.a(a2);
            this.f.a(a3);
        }
    }

    private static byte[] a(java.io.InputStream r4) {
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
        r0 = new java.io.ByteArrayOutputStream;
        r1 = 16384; // 0x4000 float:2.2959E-41 double:8.0948E-320;
        r0.<init>(r1);
        r1 = new byte[r1];	 Catch:{ IOException -> 0x0018 }
    L_0x0009:
        r2 = r4.read(r1);	 Catch:{ IOException -> 0x0018 }
        r3 = -1;	 Catch:{ IOException -> 0x0018 }
        if (r2 == r3) goto L_0x0015;	 Catch:{ IOException -> 0x0018 }
    L_0x0010:
        r3 = 0;	 Catch:{ IOException -> 0x0018 }
        r0.write(r1, r3, r2);	 Catch:{ IOException -> 0x0018 }
        goto L_0x0009;	 Catch:{ IOException -> 0x0018 }
    L_0x0015:
        r0.flush();	 Catch:{ IOException -> 0x0018 }
    L_0x0018:
        r4 = r0.toByteArray();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: kn.a(java.io.InputStream):byte[]");
    }

    public final String a() {
        return BuildConfig.FLAVOR;
    }
}
