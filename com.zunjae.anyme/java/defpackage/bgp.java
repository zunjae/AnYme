package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class bgp extends bgr {
    private final bgt a;

    public bgp(bgt bgt) {
        this.a = bgt;
    }

    private static boolean a(java.security.cert.X509Certificate r2, java.security.cert.X509Certificate r3) {
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
        r0 = r2.getIssuerDN();
        r1 = r3.getSubjectDN();
        r0 = r0.equals(r1);
        r1 = 0;
        if (r0 != 0) goto L_0x0010;
    L_0x000f:
        return r1;
    L_0x0010:
        r3 = r3.getPublicKey();	 Catch:{ GeneralSecurityException -> 0x0019 }
        r2.verify(r3);	 Catch:{ GeneralSecurityException -> 0x0019 }
        r2 = 1;
        return r2;
    L_0x0019:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgp.a(java.security.cert.X509Certificate, java.security.cert.X509Certificate):boolean");
    }

    public final List<Certificate> a(List<Certificate> list, String str) {
        Deque arrayDeque = new ArrayDeque(list);
        list = new ArrayList();
        list.add(arrayDeque.removeFirst());
        Object obj = null;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(list.size() - 1);
            X509Certificate a = this.a.a(x509Certificate);
            if (a != null) {
                if (list.size() > 1 || !x509Certificate.equals(a)) {
                    list.add(a);
                }
                if (bgp.a(a, a)) {
                    return list;
                }
                obj = 1;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    a = (X509Certificate) it.next();
                    if (bgp.a(x509Certificate, a)) {
                        it.remove();
                        list.add(a);
                    }
                }
                if (obj != null) {
                    return list;
                }
                throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed ".concat(String.valueOf(x509Certificate)));
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: ".concat(String.valueOf(list)));
    }

    public final boolean equals(Object obj) {
        return obj == this ? true : (obj instanceof bgp) && ((bgp) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
