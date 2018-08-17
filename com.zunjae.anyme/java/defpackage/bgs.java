package defpackage;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;

public final class bgs implements HostnameVerifier {
    public static final bgs a = new bgs();

    private bgs() {
    }

    public static List<String> a(X509Certificate x509Certificate) {
        Collection a = bgs.a(x509Certificate, 7);
        Collection a2 = bgs.a(x509Certificate, 2);
        List<String> arrayList = new ArrayList(a.size() + a2.size());
        arrayList.addAll(a);
        arrayList.addAll(a2);
        return arrayList;
    }

    private static java.util.List<java.lang.String> a(java.security.cert.X509Certificate r4, int r5) {
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
        r0 = new java.util.ArrayList;
        r0.<init>();
        r4 = r4.getSubjectAlternativeNames();	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r4 != 0) goto L_0x0010;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x000b:
        r4 = java.util.Collections.emptyList();	 Catch:{ CertificateParsingException -> 0x0046 }
        return r4;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0010:
        r4 = r4.iterator();	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0014:
        r1 = r4.hasNext();	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r1 == 0) goto L_0x0045;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x001a:
        r1 = r4.next();	 Catch:{ CertificateParsingException -> 0x0046 }
        r1 = (java.util.List) r1;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0022:
        r2 = r1.size();	 Catch:{ CertificateParsingException -> 0x0046 }
        r3 = 2;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r2 < r3) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0029:
        r2 = 0;	 Catch:{ CertificateParsingException -> 0x0046 }
        r2 = r1.get(r2);	 Catch:{ CertificateParsingException -> 0x0046 }
        r2 = (java.lang.Integer) r2;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r2 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0032:
        r2 = r2.intValue();	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r2 != r5) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0038:
        r2 = 1;	 Catch:{ CertificateParsingException -> 0x0046 }
        r1 = r1.get(r2);	 Catch:{ CertificateParsingException -> 0x0046 }
        r1 = (java.lang.String) r1;	 Catch:{ CertificateParsingException -> 0x0046 }
        if (r1 == 0) goto L_0x0014;	 Catch:{ CertificateParsingException -> 0x0046 }
    L_0x0041:
        r0.add(r1);	 Catch:{ CertificateParsingException -> 0x0046 }
        goto L_0x0014;
    L_0x0045:
        return r0;
    L_0x0046:
        r4 = java.util.Collections.emptyList();
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgs.a(java.security.cert.X509Certificate, int):java.util.List<java.lang.String>");
    }

    private static boolean a(String str, String str2) {
        if (!(str == null || str.length() == 0 || str.startsWith("."))) {
            if (!str.endsWith("..")) {
                if (!(str2 == null || str2.length() == 0 || str2.startsWith("."))) {
                    if (!str2.endsWith("..")) {
                        StringBuilder stringBuilder;
                        if (!str.endsWith(".")) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str);
                            stringBuilder.append('.');
                            str = stringBuilder.toString();
                        }
                        if (!str2.endsWith(".")) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(str2);
                            stringBuilder.append('.');
                            str2 = stringBuilder.toString();
                        }
                        str2 = str2.toLowerCase(Locale.US);
                        if (!str2.contains("*")) {
                            return str.equals(str2);
                        }
                        if (str2.startsWith("*.")) {
                            if (str2.indexOf(42, 1) == -1) {
                                if (str.length() < str2.length() || "*.".equals(str2)) {
                                    return false;
                                }
                                str2 = str2.substring(1);
                                if (!str.endsWith(str2)) {
                                    return false;
                                }
                                int length = str.length() - str2.length();
                                return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean a(String str, X509Certificate x509Certificate) {
        return bdb.c(str) ? bgs.b(str, x509Certificate) : bgs.c(str, x509Certificate);
    }

    private static boolean b(String str, X509Certificate x509Certificate) {
        List a = bgs.a(x509Certificate, 7);
        int size = a.size();
        for (int i = 0; i < size; i++) {
            if (str.equalsIgnoreCase((String) a.get(i))) {
                return true;
            }
        }
        return false;
    }

    private static boolean c(String str, X509Certificate x509Certificate) {
        str = str.toLowerCase(Locale.US);
        for (String a : bgs.a(x509Certificate, 2)) {
            if (bgs.a(str, a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean verify(java.lang.String r2, javax.net.ssl.SSLSession r3) {
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
        r1 = this;
        r0 = 0;
        r3 = r3.getPeerCertificates();	 Catch:{ SSLException -> 0x000e }
        r3 = r3[r0];	 Catch:{ SSLException -> 0x000e }
        r3 = (java.security.cert.X509Certificate) r3;	 Catch:{ SSLException -> 0x000e }
        r2 = defpackage.bgs.a(r2, r3);	 Catch:{ SSLException -> 0x000e }
        return r2;
    L_0x000e:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgs.verify(java.lang.String, javax.net.ssl.SSLSession):boolean");
    }
}
