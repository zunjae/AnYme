package defpackage;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

public final class bba {
    public static final bba a = new bbb().a();
    private final Set<bbc> b;
    @Nullable
    private final bgr c;

    bba(Set<bbc> set, @Nullable bgr bgr) {
        this.b = set;
        this.c = bgr;
    }

    private static bhi a(X509Certificate x509Certificate) {
        return bhi.a(x509Certificate.getPublicKey().getEncoded()).d();
    }

    public static String a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder stringBuilder = new StringBuilder("sha256/");
            stringBuilder.append(bba.a((X509Certificate) certificate).b());
            return stringBuilder.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    final bba a(@Nullable bgr bgr) {
        return bdb.a(this.c, (Object) bgr) ? this : new bba(this.b, bgr);
    }

    public final void a(String str, List<Certificate> list) {
        int indexOf;
        int i;
        String str2 = str;
        List emptyList = Collections.emptyList();
        Iterator it = this.b.iterator();
        List list2 = emptyList;
        while (true) {
            int i2 = 0;
            if (!it.hasNext()) {
                break;
            }
            bbc bbc = (bbc) it.next();
            if (bbc.a.startsWith("*.")) {
                indexOf = str2.indexOf(46);
                if ((str.length() - indexOf) - 1 == bbc.b.length()) {
                    i = indexOf + 1;
                    String str3 = bbc.b;
                    if (str.regionMatches(false, i, str3, 0, str3.length())) {
                        i2 = 1;
                    }
                }
            } else {
                i2 = str2.equals(bbc.b);
            }
            if (i2 != 0) {
                if (list2.isEmpty()) {
                    list2 = new ArrayList();
                }
                list2.add(bbc);
            }
        }
        if (!list2.isEmpty()) {
            StringBuilder stringBuilder;
            bgr bgr = r0.c;
            emptyList = bgr != null ? bgr.a(list, str2) : list;
            int size = emptyList.size();
            for (i = 0; i < size; i++) {
                X509Certificate x509Certificate = (X509Certificate) emptyList.get(i);
                int size2 = list2.size();
                Object obj = null;
                Object obj2 = obj;
                for (int i3 = 0; i3 < size2; i3++) {
                    bbc bbc2 = (bbc) list2.get(i3);
                    if (bbc2.c.equals("sha256/")) {
                        if (obj == null) {
                            obj = bba.a(x509Certificate);
                        }
                        if (bbc2.d.equals(obj)) {
                            return;
                        }
                    } else if (bbc2.c.equals("sha1/")) {
                        if (obj2 == null) {
                            obj2 = bhi.a(x509Certificate.getPublicKey().getEncoded()).c();
                        }
                        if (bbc2.d.equals(obj2)) {
                            return;
                        }
                    } else {
                        stringBuilder = new StringBuilder("unsupported hashAlgorithm: ");
                        stringBuilder.append(bbc2.c);
                        throw new AssertionError(stringBuilder.toString());
                    }
                }
            }
            stringBuilder = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
            i = emptyList.size();
            for (int i4 = 0; i4 < i; i4++) {
                Certificate certificate = (X509Certificate) emptyList.get(i4);
                stringBuilder.append("\n    ");
                stringBuilder.append(bba.a(certificate));
                stringBuilder.append(": ");
                stringBuilder.append(certificate.getSubjectDN().getName());
            }
            stringBuilder.append("\n  Pinned certificates for ");
            stringBuilder.append(str2);
            stringBuilder.append(":");
            indexOf = list2.size();
            while (i2 < indexOf) {
                bbc bbc3 = (bbc) list2.get(i2);
                stringBuilder.append("\n    ");
                stringBuilder.append(bbc3);
                i2++;
            }
            throw new SSLPeerUnverifiedException(stringBuilder.toString());
        }
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bba) {
            bba bba = (bba) obj;
            if (bdb.a(this.c, bba.c) && this.b.equals(bba.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        bgr bgr = this.c;
        return ((bgr != null ? bgr.hashCode() : 0) * 31) + this.b.hashCode();
    }
}
