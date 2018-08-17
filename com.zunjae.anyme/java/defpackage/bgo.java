package defpackage;

import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

public class bgo {
    private static final bgo a;
    private static final Logger b = Logger.getLogger(bch.class.getName());

    static {
        bgo a = bgf.a();
        if (a == null) {
            boolean z;
            if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
                z = true;
            } else {
                z = "Conscrypt".equals(Security.getProviders()[0].getName());
            }
            if (z) {
                a = bgj.a();
                if (a != null) {
                }
            }
            a = bgk.a();
            if (a == null) {
                a = bgl.a();
                if (a == null) {
                    a = new bgo();
                }
            }
        }
        a = a;
    }

    public static List<String> a(List<bck> list) {
        List<String> arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            bck bck = (bck) list.get(i);
            if (bck != bck.HTTP_1_0) {
                arrayList.add(bck.toString());
            }
        }
        return arrayList;
    }

    public static bgo c() {
        return a;
    }

    public bgr a(X509TrustManager x509TrustManager) {
        return new bgp(b(x509TrustManager));
    }

    public Object a(String str) {
        return b.isLoggable(Level.FINE) ? new Throwable(str) : null;
    }

    @Nullable
    public String a(SSLSocket sSLSocket) {
        return null;
    }

    public void a(int i, String str, Throwable th) {
        b.log(i == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
            str = stringBuilder.toString();
        }
        a(5, str, (Throwable) obj);
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        socket.connect(inetSocketAddress, i);
    }

    public void a(SSLSocket sSLSocket, String str, List<bck> list) {
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    public bgt b(X509TrustManager x509TrustManager) {
        return new bgq(x509TrustManager.getAcceptedIssuers());
    }

    public javax.net.ssl.SSLContext b() {
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
        r3 = this;
        r0 = "java.specification.version";
        r0 = java.lang.System.getProperty(r0);
        r1 = "1.7";
        r0 = r1.equals(r0);
        if (r0 == 0) goto L_0x0015;
    L_0x000e:
        r0 = "TLSv1.2";	 Catch:{ NoSuchAlgorithmException -> 0x0015 }
        r0 = javax.net.ssl.SSLContext.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0015 }
        return r0;
    L_0x0015:
        r0 = "TLS";	 Catch:{ NoSuchAlgorithmException -> 0x001c }
        r0 = javax.net.ssl.SSLContext.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x001c }
        return r0;
    L_0x001c:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "No TLS provider";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgo.b():javax.net.ssl.SSLContext");
    }

    public void b(SSLSocket sSLSocket) {
    }

    public boolean b(String str) {
        return true;
    }
}
