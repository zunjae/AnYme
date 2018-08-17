package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class bbd {
    public static final bbd A = bbd.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    public static final bbd B = bbd.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    public static final bbd C = bbd.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    public static final bbd D = bbd.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
    public static final bbd E = bbd.a("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final bbd F = bbd.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    public static final bbd G = bbd.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    public static final bbd H = bbd.a("TLS_DH_anon_WITH_AES_128_CBC_SHA");
    public static final bbd I = bbd.a("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final bbd J = bbd.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    public static final bbd K = bbd.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    public static final bbd L = bbd.a("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    public static final bbd M = bbd.a("TLS_RSA_WITH_NULL_SHA256");
    public static final bbd N = bbd.a("TLS_RSA_WITH_AES_128_CBC_SHA256");
    public static final bbd O = bbd.a("TLS_RSA_WITH_AES_256_CBC_SHA256");
    public static final bbd P = bbd.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    public static final bbd Q = bbd.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final bbd R = bbd.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    public static final bbd S = bbd.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final bbd T = bbd.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final bbd U = bbd.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    public static final bbd V = bbd.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    public static final bbd W = bbd.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    public static final bbd X = bbd.a("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    public static final bbd Y = bbd.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final bbd Z = bbd.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    static final Comparator<String> a = new bbe();
    public static final bbd aA = bbd.a("TLS_ECDH_RSA_WITH_NULL_SHA");
    public static final bbd aB = bbd.a("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    public static final bbd aC = bbd.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final bbd aD = bbd.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    public static final bbd aE = bbd.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    public static final bbd aF = bbd.a("TLS_ECDHE_RSA_WITH_NULL_SHA");
    public static final bbd aG = bbd.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    public static final bbd aH = bbd.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final bbd aI = bbd.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final bbd aJ = bbd.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final bbd aK = bbd.a("TLS_ECDH_anon_WITH_NULL_SHA");
    public static final bbd aL = bbd.a("TLS_ECDH_anon_WITH_RC4_128_SHA");
    public static final bbd aM = bbd.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final bbd aN = bbd.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    public static final bbd aO = bbd.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    public static final bbd aP = bbd.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final bbd aQ = bbd.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final bbd aR = bbd.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final bbd aS = bbd.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final bbd aT = bbd.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final bbd aU = bbd.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    public static final bbd aV = bbd.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    public static final bbd aW = bbd.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    public static final bbd aX = bbd.a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final bbd aY = bbd.a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final bbd aZ = bbd.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final bbd aa = bbd.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final bbd ab = bbd.a("TLS_PSK_WITH_RC4_128_SHA");
    public static final bbd ac = bbd.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    public static final bbd ad = bbd.a("TLS_PSK_WITH_AES_128_CBC_SHA");
    public static final bbd ae = bbd.a("TLS_PSK_WITH_AES_256_CBC_SHA");
    public static final bbd af = bbd.a("TLS_RSA_WITH_SEED_CBC_SHA");
    public static final bbd ag = bbd.a("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final bbd ah = bbd.a("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final bbd ai = bbd.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final bbd aj = bbd.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final bbd ak = bbd.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    public static final bbd al = bbd.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    public static final bbd am = bbd.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    public static final bbd an = bbd.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    public static final bbd ao = bbd.a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    public static final bbd ap = bbd.a("TLS_FALLBACK_SCSV");
    public static final bbd aq = bbd.a("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    public static final bbd ar = bbd.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    public static final bbd as = bbd.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final bbd at = bbd.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    public static final bbd au = bbd.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    public static final bbd av = bbd.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    public static final bbd aw = bbd.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    public static final bbd ax = bbd.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final bbd ay = bbd.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final bbd az = bbd.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final bbd b = bbd.a("SSL_RSA_WITH_NULL_MD5");
    public static final bbd ba = bbd.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final bbd bb = bbd.a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final bbd bc = bbd.a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final bbd bd = bbd.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    public static final bbd be = bbd.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    public static final bbd bf = bbd.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    public static final bbd bg = bbd.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    public static final bbd bh = bbd.a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final bbd bi = bbd.a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final bbd bj = bbd.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    private static final Map<String, bbd> bl = new TreeMap(a);
    public static final bbd c = bbd.a("SSL_RSA_WITH_NULL_SHA");
    public static final bbd d = bbd.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    public static final bbd e = bbd.a("SSL_RSA_WITH_RC4_128_MD5");
    public static final bbd f = bbd.a("SSL_RSA_WITH_RC4_128_SHA");
    public static final bbd g = bbd.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final bbd h = bbd.a("SSL_RSA_WITH_DES_CBC_SHA");
    public static final bbd i = bbd.a("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final bbd j = bbd.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    public static final bbd k = bbd.a("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    public static final bbd l = bbd.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    public static final bbd m = bbd.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final bbd n = bbd.a("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    public static final bbd o = bbd.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final bbd p = bbd.a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    public static final bbd q = bbd.a("SSL_DH_anon_WITH_RC4_128_MD5");
    public static final bbd r = bbd.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    public static final bbd s = bbd.a("SSL_DH_anon_WITH_DES_CBC_SHA");
    public static final bbd t = bbd.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final bbd u = bbd.a("TLS_KRB5_WITH_DES_CBC_SHA");
    public static final bbd v = bbd.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    public static final bbd w = bbd.a("TLS_KRB5_WITH_RC4_128_SHA");
    public static final bbd x = bbd.a("TLS_KRB5_WITH_DES_CBC_MD5");
    public static final bbd y = bbd.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    public static final bbd z = bbd.a("TLS_KRB5_WITH_RC4_128_MD5");
    final String bk;

    private bbd(String str) {
        if (str != null) {
            this.bk = str;
            return;
        }
        throw new NullPointerException();
    }

    public static synchronized bbd a(String str) {
        bbd bbd;
        synchronized (bbd.class) {
            bbd = (bbd) bl.get(str);
            if (bbd == null) {
                bbd = new bbd(str);
                bl.put(str, bbd);
            }
        }
        return bbd;
    }

    static List<bbd> a(String... strArr) {
        List arrayList = new ArrayList(strArr.length);
        for (String a : strArr) {
            arrayList.add(bbd.a(a));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        return this.bk;
    }
}
