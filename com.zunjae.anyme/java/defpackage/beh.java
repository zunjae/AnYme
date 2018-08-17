package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

public final class beh implements bcb {
    private final bch a;
    private final boolean b;
    private volatile bdu c;
    private Object d;
    private volatile boolean e;

    public beh(bch bch, boolean z) {
        this.a = bch;
        this.b = z;
    }

    private static int a(bcs bcs, int i) {
        String a = bcs.a("Retry-After");
        return a == null ? i : a.matches("\\d+") ? Integer.valueOf(a).intValue() : Integer.MAX_VALUE;
    }

    private bas a(bbz bbz) {
        HostnameVerifier i;
        SSLSocketFactory sSLSocketFactory;
        bba j;
        beh beh = this;
        if (bbz.c()) {
            SSLSocketFactory h = beh.a.h();
            i = beh.a.i();
            sSLSocketFactory = h;
            j = beh.a.j();
        } else {
            sSLSocketFactory = null;
            i = sSLSocketFactory;
            j = i;
        }
        return new bas(bbz.f(), bbz.g(), beh.a.f(), beh.a.g(), sSLSocketFactory, i, j, beh.a.k(), beh.a.b(), beh.a.p(), beh.a.q(), beh.a.c());
    }

    private static boolean a(bcs bcs, bbz bbz) {
        bbz a = bcs.a().a();
        return a.f().equals(bbz.f()) && a.g() == bbz.g() && a.b().equals(bbz.b());
    }

    private boolean a(IOException iOException, bdu bdu, boolean z, bcn bcn) {
        bdu.a(iOException);
        return !this.a.o() ? false : !(z && (bcn.d() instanceof bej)) && beh.a(iOException, z) && bdu.g();
    }

    private static boolean a(IOException iOException, boolean z) {
        return iOException instanceof ProtocolException ? false : iOException instanceof InterruptedIOException ? (iOException instanceof SocketTimeoutException) && !z : (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    public final void a() {
        this.e = true;
        bdu bdu = this.c;
        if (bdu != null) {
            bdu.f();
        }
    }

    public final void a(Object obj) {
        this.d = obj;
    }

    public final boolean b() {
        return this.e;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bcs intercept(defpackage.bcc r15) {
        /*
        r14 = this;
        r0 = r15.a();
        r15 = (defpackage.bee) r15;
        r7 = r15.h();
        r8 = r15.i();
        r9 = new bdu;
        r1 = r14.a;
        r2 = r1.l();
        r1 = r0.a();
        r3 = r14.a(r1);
        r6 = r14.d;
        r1 = r9;
        r4 = r7;
        r5 = r8;
        r1.<init>(r2, r3, r4, r5, r6);
        r14.c = r9;
        r10 = 0;
        r11 = 0;
        r1 = r11;
        r2 = 0;
    L_0x002c:
        r3 = r14.e;
        if (r3 != 0) goto L_0x023e;
    L_0x0030:
        r3 = 1;
        r4 = r15.a(r0, r9, r11, r11);	 Catch:{ bdr -> 0x0225, IOException -> 0x0215 }
        if (r1 == 0) goto L_0x0050;
    L_0x0037:
        r0 = r4.h();
        r1 = r1.h();
        r1 = r1.a(r11);
        r1 = r1.a();
        r0 = r0.c(r1);
        r0 = r0.a();
        goto L_0x0051;
    L_0x0050:
        r0 = r4;
    L_0x0051:
        r1 = r9.b();	 Catch:{ IOException -> 0x020e }
        if (r0 == 0) goto L_0x0208;
    L_0x0057:
        r4 = r0.b();	 Catch:{ IOException -> 0x020e }
        r5 = r0.a();	 Catch:{ IOException -> 0x020e }
        r5 = r5.b();	 Catch:{ IOException -> 0x020e }
        switch(r4) {
            case 300: goto L_0x00e6;
            case 301: goto L_0x00e6;
            case 302: goto L_0x00e6;
            case 303: goto L_0x00e6;
            case 307: goto L_0x00d6;
            case 308: goto L_0x00d6;
            case 401: goto L_0x017a;
            case 407: goto L_0x00b7;
            case 408: goto L_0x008a;
            case 503: goto L_0x0068;
            default: goto L_0x0066;
        };	 Catch:{ IOException -> 0x020e }
    L_0x0066:
        goto L_0x017a;
    L_0x0068:
        r1 = r0.i();	 Catch:{ IOException -> 0x020e }
        if (r1 == 0) goto L_0x007a;
    L_0x006e:
        r1 = r0.i();	 Catch:{ IOException -> 0x020e }
        r1 = r1.b();	 Catch:{ IOException -> 0x020e }
        r3 = 503; // 0x1f7 float:7.05E-43 double:2.485E-321;
        if (r1 == r3) goto L_0x017a;
    L_0x007a:
        r1 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r1 = defpackage.beh.a(r0, r1);	 Catch:{ IOException -> 0x020e }
        if (r1 != 0) goto L_0x017a;
    L_0x0083:
        r1 = r0.a();	 Catch:{ IOException -> 0x020e }
    L_0x0087:
        r12 = r1;
        goto L_0x017b;
    L_0x008a:
        r1 = r14.a;	 Catch:{ IOException -> 0x020e }
        r1 = r1.o();	 Catch:{ IOException -> 0x020e }
        if (r1 == 0) goto L_0x017a;
    L_0x0092:
        r1 = r0.a();	 Catch:{ IOException -> 0x020e }
        r1 = r1.d();	 Catch:{ IOException -> 0x020e }
        r1 = r1 instanceof defpackage.bej;	 Catch:{ IOException -> 0x020e }
        if (r1 != 0) goto L_0x017a;
    L_0x009e:
        r1 = r0.i();	 Catch:{ IOException -> 0x020e }
        if (r1 == 0) goto L_0x00b0;
    L_0x00a4:
        r1 = r0.i();	 Catch:{ IOException -> 0x020e }
        r1 = r1.b();	 Catch:{ IOException -> 0x020e }
        r3 = 408; // 0x198 float:5.72E-43 double:2.016E-321;
        if (r1 == r3) goto L_0x017a;
    L_0x00b0:
        r1 = defpackage.beh.a(r0, r10);	 Catch:{ IOException -> 0x020e }
        if (r1 > 0) goto L_0x017a;
    L_0x00b6:
        goto L_0x0083;
    L_0x00b7:
        if (r1 == 0) goto L_0x00be;
    L_0x00b9:
        r1 = r1.b();	 Catch:{ IOException -> 0x020e }
        goto L_0x00c4;
    L_0x00be:
        r1 = r14.a;	 Catch:{ IOException -> 0x020e }
        r1 = r1.b();	 Catch:{ IOException -> 0x020e }
    L_0x00c4:
        r1 = r1.type();	 Catch:{ IOException -> 0x020e }
        r3 = java.net.Proxy.Type.HTTP;	 Catch:{ IOException -> 0x020e }
        if (r1 != r3) goto L_0x00ce;
    L_0x00cc:
        goto L_0x017a;
    L_0x00ce:
        r15 = new java.net.ProtocolException;	 Catch:{ IOException -> 0x020e }
        r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy";
        r15.<init>(r0);	 Catch:{ IOException -> 0x020e }
        throw r15;	 Catch:{ IOException -> 0x020e }
    L_0x00d6:
        r1 = "GET";
        r1 = r5.equals(r1);	 Catch:{ IOException -> 0x020e }
        if (r1 != 0) goto L_0x00e6;
    L_0x00de:
        r1 = "HEAD";
        r1 = r5.equals(r1);	 Catch:{ IOException -> 0x020e }
        if (r1 == 0) goto L_0x017a;
    L_0x00e6:
        r1 = r14.a;	 Catch:{ IOException -> 0x020e }
        r1 = r1.n();	 Catch:{ IOException -> 0x020e }
        if (r1 == 0) goto L_0x017a;
    L_0x00ee:
        r1 = "Location";
        r1 = r0.a(r1);	 Catch:{ IOException -> 0x020e }
        if (r1 == 0) goto L_0x017a;
    L_0x00f6:
        r4 = r0.a();	 Catch:{ IOException -> 0x020e }
        r4 = r4.a();	 Catch:{ IOException -> 0x020e }
        r1 = r4.c(r1);	 Catch:{ IOException -> 0x020e }
        if (r1 == 0) goto L_0x017a;
    L_0x0104:
        r4 = r1.b();	 Catch:{ IOException -> 0x020e }
        r6 = r0.a();	 Catch:{ IOException -> 0x020e }
        r6 = r6.a();	 Catch:{ IOException -> 0x020e }
        r6 = r6.b();	 Catch:{ IOException -> 0x020e }
        r4 = r4.equals(r6);	 Catch:{ IOException -> 0x020e }
        if (r4 != 0) goto L_0x0122;
    L_0x011a:
        r4 = r14.a;	 Catch:{ IOException -> 0x020e }
        r4 = r4.m();	 Catch:{ IOException -> 0x020e }
        if (r4 == 0) goto L_0x017a;
    L_0x0122:
        r4 = r0.a();	 Catch:{ IOException -> 0x020e }
        r4 = r4.e();	 Catch:{ IOException -> 0x020e }
        r6 = defpackage.bed.a(r5);	 Catch:{ IOException -> 0x020e }
        if (r6 == 0) goto L_0x0165;
    L_0x0130:
        r6 = "PROPFIND";
        r6 = r5.equals(r6);	 Catch:{ IOException -> 0x020e }
        r12 = "PROPFIND";
        r12 = r5.equals(r12);	 Catch:{ IOException -> 0x020e }
        r3 = r3 ^ r12;
        if (r3 == 0) goto L_0x0145;
    L_0x013f:
        r3 = "GET";
        r4.a(r3, r11);	 Catch:{ IOException -> 0x020e }
        goto L_0x0154;
    L_0x0145:
        if (r6 == 0) goto L_0x0150;
    L_0x0147:
        r3 = r0.a();	 Catch:{ IOException -> 0x020e }
        r3 = r3.d();	 Catch:{ IOException -> 0x020e }
        goto L_0x0151;
    L_0x0150:
        r3 = r11;
    L_0x0151:
        r4.a(r5, r3);	 Catch:{ IOException -> 0x020e }
    L_0x0154:
        if (r6 != 0) goto L_0x0165;
    L_0x0156:
        r3 = "Transfer-Encoding";
        r4.b(r3);	 Catch:{ IOException -> 0x020e }
        r3 = "Content-Length";
        r4.b(r3);	 Catch:{ IOException -> 0x020e }
        r3 = "Content-Type";
        r4.b(r3);	 Catch:{ IOException -> 0x020e }
    L_0x0165:
        r3 = defpackage.beh.a(r0, r1);	 Catch:{ IOException -> 0x020e }
        if (r3 != 0) goto L_0x0170;
    L_0x016b:
        r3 = "Authorization";
        r4.b(r3);	 Catch:{ IOException -> 0x020e }
    L_0x0170:
        r1 = r4.a(r1);	 Catch:{ IOException -> 0x020e }
        r1 = r1.a();	 Catch:{ IOException -> 0x020e }
        goto L_0x0087;
    L_0x017a:
        r12 = r11;
    L_0x017b:
        if (r12 != 0) goto L_0x0185;
    L_0x017d:
        r15 = r14.b;
        if (r15 != 0) goto L_0x0184;
    L_0x0181:
        r9.d();
    L_0x0184:
        return r0;
    L_0x0185:
        r1 = r0.g();
        defpackage.bdb.a(r1);
        r13 = r2 + 1;
        r1 = 20;
        if (r13 > r1) goto L_0x01f5;
    L_0x0192:
        r1 = r12.d();
        r1 = r1 instanceof defpackage.bej;
        if (r1 != 0) goto L_0x01e6;
    L_0x019a:
        r1 = r12.a();
        r1 = defpackage.beh.a(r0, r1);
        if (r1 != 0) goto L_0x01c2;
    L_0x01a4:
        r9.d();
        r9 = new bdu;
        r1 = r14.a;
        r2 = r1.l();
        r1 = r12.a();
        r3 = r14.a(r1);
        r6 = r14.d;
        r1 = r9;
        r4 = r7;
        r5 = r8;
        r1.<init>(r2, r3, r4, r5, r6);
        r14.c = r9;
        goto L_0x01c8;
    L_0x01c2:
        r1 = r9.a();
        if (r1 != 0) goto L_0x01cd;
    L_0x01c8:
        r1 = r0;
        r0 = r12;
        r2 = r13;
        goto L_0x002c;
    L_0x01cd:
        r15 = new java.lang.IllegalStateException;
        r1 = new java.lang.StringBuilder;
        r2 = "Closing the body of ";
        r1.<init>(r2);
        r1.append(r0);
        r0 = " didn't close its backing stream. Bad interceptor?";
        r1.append(r0);
        r0 = r1.toString();
        r15.<init>(r0);
        throw r15;
    L_0x01e6:
        r9.d();
        r15 = new java.net.HttpRetryException;
        r0 = r0.b();
        r1 = "Cannot retry streamed HTTP body";
        r15.<init>(r1, r0);
        throw r15;
    L_0x01f5:
        r9.d();
        r15 = new java.net.ProtocolException;
        r0 = java.lang.String.valueOf(r13);
        r1 = "Too many follow-up requests: ";
        r0 = r1.concat(r0);
        r15.<init>(r0);
        throw r15;
    L_0x0208:
        r15 = new java.lang.IllegalStateException;	 Catch:{ IOException -> 0x020e }
        r15.<init>();	 Catch:{ IOException -> 0x020e }
        throw r15;	 Catch:{ IOException -> 0x020e }
    L_0x020e:
        r15 = move-exception;
        r9.d();
        throw r15;
    L_0x0213:
        r15 = move-exception;
        goto L_0x0237;
    L_0x0215:
        r4 = move-exception;
        r5 = r4 instanceof defpackage.ber;	 Catch:{ all -> 0x0213 }
        if (r5 != 0) goto L_0x021b;
    L_0x021a:
        goto L_0x021c;
    L_0x021b:
        r3 = 0;
    L_0x021c:
        r3 = r14.a(r4, r9, r3, r0);	 Catch:{ all -> 0x0213 }
        if (r3 == 0) goto L_0x0224;
    L_0x0222:
        goto L_0x002c;
    L_0x0224:
        throw r4;	 Catch:{ all -> 0x0213 }
    L_0x0225:
        r3 = move-exception;
        r4 = r3.b();	 Catch:{ all -> 0x0213 }
        r4 = r14.a(r4, r9, r10, r0);	 Catch:{ all -> 0x0213 }
        if (r4 == 0) goto L_0x0232;
    L_0x0230:
        goto L_0x002c;
    L_0x0232:
        r15 = r3.a();	 Catch:{ all -> 0x0213 }
        throw r15;	 Catch:{ all -> 0x0213 }
    L_0x0237:
        r9.a(r11);
        r9.d();
        throw r15;
    L_0x023e:
        r9.d();
        r15 = new java.io.IOException;
        r0 = "Canceled";
        r15.<init>(r0);
        throw r15;
        */
        throw new UnsupportedOperationException("Method not decompiled: beh.intercept(bcc):bcs");
    }
}
