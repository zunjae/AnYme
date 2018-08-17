package defpackage;

import java.security.KeyStoreException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

final class azm implements X509TrustManager {
    private static final X509Certificate[] a = new X509Certificate[0];
    private final TrustManager[] b;
    private final azn c;
    private final long d;
    private final List<byte[]> e = new LinkedList();
    private final Set<X509Certificate> f = Collections.synchronizedSet(new HashSet());

    public azm(azn azn, azl azl) {
        this.b = azm.a(azn);
        this.c = azn;
        this.d = -1;
        for (String a : azl.c()) {
            this.e.add(azm.a(a));
        }
    }

    private boolean a(X509Certificate x509Certificate) {
        try {
            byte[] digest = MessageDigest.getInstance("SHA1").digest(x509Certificate.getPublicKey().getEncoded());
            for (byte[] equals : this.e) {
                if (Arrays.equals(equals, digest)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable e) {
            throw new CertificateException(e);
        }
    }

    private static byte[] a(String str) {
        int length = str.length();
        byte[] bArr = new byte[(length / 2)];
        for (int i = 0; i < length; i += 2) {
            bArr[i / 2] = (byte) ((Character.digit(str.charAt(i), 16) << 4) + Character.digit(str.charAt(i + 1), 16));
        }
        return bArr;
    }

    private static TrustManager[] a(azn azn) {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance("X509");
            instance.init(azn.a);
            return instance.getTrustManagers();
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        } catch (KeyStoreException e2) {
            throw new AssertionError(e2);
        }
    }

    public final void checkClientTrusted(X509Certificate[] x509CertificateArr, String str) {
        throw new CertificateException("Client certificates not supported!");
    }

    public final void checkServerTrusted(X509Certificate[] x509CertificateArr, String str) {
        if (!this.f.contains(x509CertificateArr[0])) {
            int i;
            for (TrustManager trustManager : this.b) {
                ((X509TrustManager) trustManager).checkServerTrusted(x509CertificateArr, str);
            }
            if (this.d == -1 || System.currentTimeMillis() - this.d <= 15552000000L) {
                X509Certificate[] a = ayy.a(x509CertificateArr, this.c);
                int length = a.length;
                i = 0;
                while (i < length) {
                    if (!a(a[i])) {
                        i++;
                    }
                }
                throw new CertificateException("No valid pins found in chain!");
            }
            avf.c();
            StringBuilder stringBuilder = new StringBuilder("Certificate pins are stale, (");
            stringBuilder.append(System.currentTimeMillis() - this.d);
            stringBuilder.append(" millis vs 15552000000 millis) falling back to system trust.");
            this.f.add(x509CertificateArr[0]);
        }
    }

    public final X509Certificate[] getAcceptedIssuers() {
        return a;
    }
}
