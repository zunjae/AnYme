package defpackage;

import java.security.cert.Certificate;
import java.util.List;
import javax.annotation.Nullable;

public final class bbw {
    private final bcy a;
    private final bbd b;
    private final List<Certificate> c;
    private final List<Certificate> d;

    private bbw(bcy bcy, bbd bbd, List<Certificate> list, List<Certificate> list2) {
        this.a = bcy;
        this.b = bbd;
        this.c = list;
        this.d = list2;
    }

    public static defpackage.bbw a(javax.net.ssl.SSLSession r4) {
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
        r0 = r4.getCipherSuite();
        if (r0 == 0) goto L_0x0062;
    L_0x0006:
        r1 = "SSL_NULL_WITH_NULL_NULL";
        r1 = r1.equals(r0);
        if (r1 != 0) goto L_0x005a;
    L_0x000e:
        r0 = defpackage.bbd.a(r0);
        r1 = r4.getProtocol();
        if (r1 == 0) goto L_0x0052;
    L_0x0018:
        r2 = "NONE";
        r2 = r2.equals(r1);
        if (r2 != 0) goto L_0x004a;
    L_0x0020:
        r1 = defpackage.bcy.forJavaName(r1);
        r2 = r4.getPeerCertificates();	 Catch:{ SSLPeerUnverifiedException -> 0x0029 }
        goto L_0x002a;
    L_0x0029:
        r2 = 0;
    L_0x002a:
        if (r2 == 0) goto L_0x0031;
    L_0x002c:
        r2 = defpackage.bdb.a(r2);
        goto L_0x0035;
    L_0x0031:
        r2 = java.util.Collections.emptyList();
    L_0x0035:
        r4 = r4.getLocalCertificates();
        if (r4 == 0) goto L_0x0040;
    L_0x003b:
        r4 = defpackage.bdb.a(r4);
        goto L_0x0044;
    L_0x0040:
        r4 = java.util.Collections.emptyList();
    L_0x0044:
        r3 = new bbw;
        r3.<init>(r1, r0, r2, r4);
        return r3;
    L_0x004a:
        r4 = new java.io.IOException;
        r0 = "tlsVersion == NONE";
        r4.<init>(r0);
        throw r4;
    L_0x0052:
        r4 = new java.lang.IllegalStateException;
        r0 = "tlsVersion == null";
        r4.<init>(r0);
        throw r4;
    L_0x005a:
        r4 = new java.io.IOException;
        r0 = "cipherSuite == SSL_NULL_WITH_NULL_NULL";
        r4.<init>(r0);
        throw r4;
    L_0x0062:
        r4 = new java.lang.IllegalStateException;
        r0 = "cipherSuite == null";
        r4.<init>(r0);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbw.a(javax.net.ssl.SSLSession):bbw");
    }

    public final bbd a() {
        return this.b;
    }

    public final List<Certificate> b() {
        return this.c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof bbw)) {
            return false;
        }
        bbw bbw = (bbw) obj;
        return this.a.equals(bbw.a) && this.b.equals(bbw.b) && this.c.equals(bbw.c) && this.d.equals(bbw.d);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }
}
