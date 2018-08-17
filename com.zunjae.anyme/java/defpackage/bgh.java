package defpackage;

import java.lang.reflect.Method;
import javax.net.ssl.X509TrustManager;

final class bgh implements bgt {
    private final X509TrustManager a;
    private final Method b;

    bgh(X509TrustManager x509TrustManager, Method method) {
        this.b = method;
        this.a = x509TrustManager;
    }

    public final java.security.cert.X509Certificate a(java.security.cert.X509Certificate r6) {
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
        r5 = this;
        r0 = 0;
        r1 = r5.b;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        r2 = r5.a;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        r3 = 1;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        r3 = new java.lang.Object[r3];	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        r4 = 0;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        r3[r4] = r6;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        r6 = r1.invoke(r2, r3);	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        r6 = (java.security.cert.TrustAnchor) r6;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        if (r6 == 0) goto L_0x0018;	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
    L_0x0013:
        r6 = r6.getTrustedCert();	 Catch:{ IllegalAccessException -> 0x0019, InvocationTargetException -> 0x0018 }
        return r6;
    L_0x0018:
        return r0;
    L_0x0019:
        r6 = move-exception;
        r0 = "unable to get issues and signature";
        r6 = defpackage.bdb.a(r0, r6);
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgh.a(java.security.cert.X509Certificate):java.security.cert.X509Certificate");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bgh)) {
            return false;
        }
        bgh bgh = (bgh) obj;
        return this.a.equals(bgh.a) && this.b.equals(bgh.b);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }
}
