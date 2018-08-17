package defpackage;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public final class bdp extends bfi implements bbf {
    public boolean a;
    public int b;
    public int c = 1;
    public final List<Reference<bdu>> d = new ArrayList();
    public long e = Long.MAX_VALUE;
    private final bbg g;
    private final bcx h;
    private Socket i;
    private Socket j;
    private bbw k;
    private bck l;
    private bfa m;
    private bhh n;
    private bhg o;

    public bdp(bbg bbg, bcx bcx) {
        this.g = bbg;
        this.h = bcx;
    }

    private void a(int i) {
        this.j.setSoTimeout(0);
        this.m = new bfh().a(this.j, this.h.a().a().f(), this.n, this.o).a((bfi) this).a(i).a();
        this.m.b();
    }

    private void a(int i, int i2) {
        Socket socket;
        Proxy b = this.h.b();
        bas a = this.h.a();
        if (b.type() != Type.DIRECT) {
            if (b.type() != Type.HTTP) {
                socket = new Socket(b);
                this.i = socket;
                this.i.setSoTimeout(i2);
                bgo.c().a(this.i, this.h.c(), i);
                this.n = bho.a(bho.b(this.i));
                this.o = bho.a(bho.a(this.i));
            }
        }
        socket = a.c().createSocket();
        this.i = socket;
        this.i.setSoTimeout(i2);
        try {
            bgo.c().a(this.i, this.h.c(), i);
            try {
                this.n = bho.a(bho.b(this.i));
                this.o = bho.a(bho.a(this.i));
            } catch (Throwable e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (Throwable e2) {
            StringBuilder stringBuilder = new StringBuilder("Failed to connect to ");
            stringBuilder.append(this.h.c());
            ConnectException connectException = new ConnectException(stringBuilder.toString());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final bck a() {
        return this.l;
    }

    public final bdz a(bch bch, bcc bcc, bdu bdu) {
        bfa bfa = this.m;
        if (bfa != null) {
            return new bey(bch, bcc, bdu, bfa);
        }
        this.j.setSoTimeout(bcc.d());
        this.n.a().a((long) bcc.d(), TimeUnit.MILLISECONDS);
        this.o.a().a((long) bcc.e(), TimeUnit.MILLISECONDS);
        return new bek(bch, bdu, this.n, this.o);
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r18, int r19, int r20, int r21, boolean r22) {
        /*
        r17 = this;
        r1 = r17;
        r2 = r21;
        r0 = r1.l;
        if (r0 != 0) goto L_0x0368;
    L_0x0008:
        r0 = r1.h;
        r0 = r0.a();
        r0 = r0.e();
        r3 = new bdo;
        r3.<init>(r0);
        r4 = r1.h;
        r4 = r4.a();
        r4 = r4.h();
        if (r4 != 0) goto L_0x006f;
    L_0x0023:
        r4 = defpackage.bbi.d;
        r0 = r0.contains(r4);
        if (r0 == 0) goto L_0x0062;
    L_0x002b:
        r0 = r1.h;
        r0 = r0.a();
        r0 = r0.a();
        r0 = r0.f();
        r4 = defpackage.bgo.c();
        r4 = r4.b(r0);
        if (r4 == 0) goto L_0x0044;
    L_0x0043:
        goto L_0x0081;
    L_0x0044:
        r2 = new bdr;
        r3 = new java.net.UnknownServiceException;
        r4 = new java.lang.StringBuilder;
        r5 = "CLEARTEXT communication to ";
        r4.<init>(r5);
        r4.append(r0);
        r0 = " not permitted by network security policy";
        r4.append(r0);
        r0 = r4.toString();
        r3.<init>(r0);
        r2.<init>(r3);
        throw r2;
    L_0x0062:
        r0 = new bdr;
        r2 = new java.net.UnknownServiceException;
        r3 = "CLEARTEXT communication not enabled for client";
        r2.<init>(r3);
        r0.<init>(r2);
        throw r0;
    L_0x006f:
        r0 = r1.h;
        r0 = r0.a();
        r0 = r0.d();
        r4 = defpackage.bck.H2_PRIOR_KNOWLEDGE;
        r0 = r0.contains(r4);
        if (r0 != 0) goto L_0x035b;
    L_0x0081:
        r4 = 0;
        r5 = r4;
    L_0x0083:
        r0 = r1.h;	 Catch:{ IOException -> 0x0325 }
        r0 = r0.d();	 Catch:{ IOException -> 0x0325 }
        r6 = 0;
        r7 = 1;
        if (r0 == 0) goto L_0x0191;
    L_0x008d:
        r0 = new bco;	 Catch:{ IOException -> 0x0325 }
        r0.<init>();	 Catch:{ IOException -> 0x0325 }
        r8 = r1.h;	 Catch:{ IOException -> 0x0325 }
        r8 = r8.a();	 Catch:{ IOException -> 0x0325 }
        r8 = r8.a();	 Catch:{ IOException -> 0x0325 }
        r0 = r0.a(r8);	 Catch:{ IOException -> 0x0325 }
        r8 = "Host";
        r9 = r1.h;	 Catch:{ IOException -> 0x0325 }
        r9 = r9.a();	 Catch:{ IOException -> 0x0325 }
        r9 = r9.a();	 Catch:{ IOException -> 0x0325 }
        r9 = defpackage.bdb.a(r9, r7);	 Catch:{ IOException -> 0x0325 }
        r0 = r0.a(r8, r9);	 Catch:{ IOException -> 0x0325 }
        r8 = "Proxy-Connection";
        r9 = "Keep-Alive";
        r0 = r0.a(r8, r9);	 Catch:{ IOException -> 0x0325 }
        r8 = "User-Agent";
        r9 = "okhttp/3.11.0";
        r0 = r0.a(r8, r9);	 Catch:{ IOException -> 0x0325 }
        r0 = r0.a();	 Catch:{ IOException -> 0x0325 }
        r8 = r0.a();	 Catch:{ IOException -> 0x0325 }
        r17.a(r18, r19);	 Catch:{ IOException -> 0x0325 }
        r9 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0325 }
        r10 = "CONNECT ";
        r9.<init>(r10);	 Catch:{ IOException -> 0x0325 }
        r8 = defpackage.bdb.a(r8, r7);	 Catch:{ IOException -> 0x0325 }
        r9.append(r8);	 Catch:{ IOException -> 0x0325 }
        r8 = " HTTP/1.1";
        r9.append(r8);	 Catch:{ IOException -> 0x0325 }
        r8 = r9.toString();	 Catch:{ IOException -> 0x0325 }
        r9 = new bek;	 Catch:{ IOException -> 0x0325 }
        r10 = r1.n;	 Catch:{ IOException -> 0x0325 }
        r11 = r1.o;	 Catch:{ IOException -> 0x0325 }
        r9.<init>(r4, r4, r10, r11);	 Catch:{ IOException -> 0x0325 }
        r10 = r1.n;	 Catch:{ IOException -> 0x0325 }
        r10 = r10.a();	 Catch:{ IOException -> 0x0325 }
        r11 = r19;
        r12 = (long) r11;
        r14 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x018e }
        r10.a(r12, r14);	 Catch:{ IOException -> 0x018e }
        r10 = r1.o;	 Catch:{ IOException -> 0x018e }
        r10 = r10.a();	 Catch:{ IOException -> 0x018e }
        r12 = r20;
        r13 = (long) r12;
        r15 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0323 }
        r10.a(r13, r15);	 Catch:{ IOException -> 0x0323 }
        r10 = r0.c();	 Catch:{ IOException -> 0x0323 }
        r9.a(r10, r8);	 Catch:{ IOException -> 0x0323 }
        r9.b();	 Catch:{ IOException -> 0x0323 }
        r8 = r9.a(r6);	 Catch:{ IOException -> 0x0323 }
        r0 = r8.a(r0);	 Catch:{ IOException -> 0x0323 }
        r0 = r0.a();	 Catch:{ IOException -> 0x0323 }
        r13 = defpackage.bec.a(r0);	 Catch:{ IOException -> 0x0323 }
        r15 = -1;
        r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1));
        if (r8 != 0) goto L_0x012d;
    L_0x012b:
        r13 = 0;
    L_0x012d:
        r8 = r9.a(r13);	 Catch:{ IOException -> 0x0323 }
        r9 = 2147483647; // 0x7fffffff float:NaN double:1.060997895E-314;
        r10 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ IOException -> 0x0323 }
        defpackage.bdb.a(r8, r9, r10);	 Catch:{ IOException -> 0x0323 }
        r8.close();	 Catch:{ IOException -> 0x0323 }
        r8 = r0.b();	 Catch:{ IOException -> 0x0323 }
        r9 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;
        if (r8 == r9) goto L_0x0168;
    L_0x0144:
        r6 = 407; // 0x197 float:5.7E-43 double:2.01E-321;
        if (r8 == r6) goto L_0x0160;
    L_0x0148:
        r6 = new java.io.IOException;	 Catch:{ IOException -> 0x0323 }
        r7 = new java.lang.StringBuilder;	 Catch:{ IOException -> 0x0323 }
        r8 = "Unexpected response code for CONNECT: ";
        r7.<init>(r8);	 Catch:{ IOException -> 0x0323 }
        r0 = r0.b();	 Catch:{ IOException -> 0x0323 }
        r7.append(r0);	 Catch:{ IOException -> 0x0323 }
        r0 = r7.toString();	 Catch:{ IOException -> 0x0323 }
        r6.<init>(r0);	 Catch:{ IOException -> 0x0323 }
        throw r6;	 Catch:{ IOException -> 0x0323 }
    L_0x0160:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0323 }
        r6 = "Failed to authenticate with proxy";
        r0.<init>(r6);	 Catch:{ IOException -> 0x0323 }
        throw r0;	 Catch:{ IOException -> 0x0323 }
    L_0x0168:
        r0 = r1.n;	 Catch:{ IOException -> 0x0323 }
        r0 = r0.c();	 Catch:{ IOException -> 0x0323 }
        r0 = r0.e();	 Catch:{ IOException -> 0x0323 }
        if (r0 == 0) goto L_0x0186;
    L_0x0174:
        r0 = r1.o;	 Catch:{ IOException -> 0x0323 }
        r0 = r0.c();	 Catch:{ IOException -> 0x0323 }
        r0 = r0.e();	 Catch:{ IOException -> 0x0323 }
        if (r0 == 0) goto L_0x0186;
    L_0x0180:
        r0 = r1.i;	 Catch:{ IOException -> 0x0323 }
        if (r0 != 0) goto L_0x0198;
    L_0x0184:
        goto L_0x0284;
    L_0x0186:
        r0 = new java.io.IOException;	 Catch:{ IOException -> 0x0323 }
        r6 = "TLS tunnel buffered too many bytes!";
        r0.<init>(r6);	 Catch:{ IOException -> 0x0323 }
        throw r0;	 Catch:{ IOException -> 0x0323 }
    L_0x018e:
        r0 = move-exception;
        goto L_0x0328;
    L_0x0191:
        r11 = r19;
        r12 = r20;
        r17.a(r18, r19);	 Catch:{ IOException -> 0x0323 }
    L_0x0198:
        r0 = r1.h;	 Catch:{ IOException -> 0x0323 }
        r0 = r0.a();	 Catch:{ IOException -> 0x0323 }
        r0 = r0.h();	 Catch:{ IOException -> 0x0323 }
        if (r0 != 0) goto L_0x01cd;
    L_0x01a4:
        r0 = r1.h;	 Catch:{ IOException -> 0x0323 }
        r0 = r0.a();	 Catch:{ IOException -> 0x0323 }
        r0 = r0.d();	 Catch:{ IOException -> 0x0323 }
        r6 = defpackage.bck.H2_PRIOR_KNOWLEDGE;	 Catch:{ IOException -> 0x0323 }
        r0 = r0.contains(r6);	 Catch:{ IOException -> 0x0323 }
        if (r0 == 0) goto L_0x01c3;
    L_0x01b6:
        r0 = r1.i;	 Catch:{ IOException -> 0x0323 }
        r1.j = r0;	 Catch:{ IOException -> 0x0323 }
        r0 = defpackage.bck.H2_PRIOR_KNOWLEDGE;	 Catch:{ IOException -> 0x0323 }
        r1.l = r0;	 Catch:{ IOException -> 0x0323 }
    L_0x01be:
        r1.a(r2);	 Catch:{ IOException -> 0x0323 }
        goto L_0x0284;
    L_0x01c3:
        r0 = r1.i;	 Catch:{ IOException -> 0x0323 }
        r1.j = r0;	 Catch:{ IOException -> 0x0323 }
        r0 = defpackage.bck.HTTP_1_1;	 Catch:{ IOException -> 0x0323 }
        r1.l = r0;	 Catch:{ IOException -> 0x0323 }
        goto L_0x0284;
    L_0x01cd:
        r0 = r1.h;	 Catch:{ IOException -> 0x0323 }
        r0 = r0.a();	 Catch:{ IOException -> 0x0323 }
        r8 = r0.h();	 Catch:{ IOException -> 0x0323 }
        r9 = r1.i;	 Catch:{ AssertionError -> 0x0306, all -> 0x0303 }
        r10 = r0.a();	 Catch:{ AssertionError -> 0x0306, all -> 0x0303 }
        r10 = r10.f();	 Catch:{ AssertionError -> 0x0306, all -> 0x0303 }
        r13 = r0.a();	 Catch:{ AssertionError -> 0x0306, all -> 0x0303 }
        r13 = r13.g();	 Catch:{ AssertionError -> 0x0306, all -> 0x0303 }
        r7 = r8.createSocket(r9, r10, r13, r7);	 Catch:{ AssertionError -> 0x0306, all -> 0x0303 }
        r7 = (javax.net.ssl.SSLSocket) r7;	 Catch:{ AssertionError -> 0x0306, all -> 0x0303 }
        r8 = r3.a(r7);	 Catch:{ AssertionError -> 0x0301 }
        r9 = r8.a();	 Catch:{ AssertionError -> 0x0301 }
        if (r9 == 0) goto L_0x020c;
    L_0x01f9:
        r9 = defpackage.bgo.c();	 Catch:{ AssertionError -> 0x0301 }
        r10 = r0.a();	 Catch:{ AssertionError -> 0x0301 }
        r10 = r10.f();	 Catch:{ AssertionError -> 0x0301 }
        r13 = r0.d();	 Catch:{ AssertionError -> 0x0301 }
        r9.a(r7, r10, r13);	 Catch:{ AssertionError -> 0x0301 }
    L_0x020c:
        r7.startHandshake();	 Catch:{ AssertionError -> 0x0301 }
        r9 = r7.getSession();	 Catch:{ AssertionError -> 0x0301 }
        r10 = defpackage.bbw.a(r9);	 Catch:{ AssertionError -> 0x0301 }
        r13 = r0.i();	 Catch:{ AssertionError -> 0x0301 }
        r14 = r0.a();	 Catch:{ AssertionError -> 0x0301 }
        r14 = r14.f();	 Catch:{ AssertionError -> 0x0301 }
        r9 = r13.verify(r14, r9);	 Catch:{ AssertionError -> 0x0301 }
        if (r9 == 0) goto L_0x02b3;
    L_0x0229:
        r6 = r0.j();	 Catch:{ AssertionError -> 0x0301 }
        r0 = r0.a();	 Catch:{ AssertionError -> 0x0301 }
        r0 = r0.f();	 Catch:{ AssertionError -> 0x0301 }
        r9 = r10.b();	 Catch:{ AssertionError -> 0x0301 }
        r6.a(r0, r9);	 Catch:{ AssertionError -> 0x0301 }
        r0 = r8.a();	 Catch:{ AssertionError -> 0x0301 }
        if (r0 == 0) goto L_0x024b;
    L_0x0242:
        r0 = defpackage.bgo.c();	 Catch:{ AssertionError -> 0x0301 }
        r0 = r0.a(r7);	 Catch:{ AssertionError -> 0x0301 }
        goto L_0x024c;
    L_0x024b:
        r0 = r4;
    L_0x024c:
        r1.j = r7;	 Catch:{ AssertionError -> 0x0301 }
        r6 = r1.j;	 Catch:{ AssertionError -> 0x0301 }
        r6 = defpackage.bho.b(r6);	 Catch:{ AssertionError -> 0x0301 }
        r6 = defpackage.bho.a(r6);	 Catch:{ AssertionError -> 0x0301 }
        r1.n = r6;	 Catch:{ AssertionError -> 0x0301 }
        r6 = r1.j;	 Catch:{ AssertionError -> 0x0301 }
        r6 = defpackage.bho.a(r6);	 Catch:{ AssertionError -> 0x0301 }
        r6 = defpackage.bho.a(r6);	 Catch:{ AssertionError -> 0x0301 }
        r1.o = r6;	 Catch:{ AssertionError -> 0x0301 }
        r1.k = r10;	 Catch:{ AssertionError -> 0x0301 }
        if (r0 == 0) goto L_0x026f;
    L_0x026a:
        r0 = defpackage.bck.get(r0);	 Catch:{ AssertionError -> 0x0301 }
        goto L_0x0271;
    L_0x026f:
        r0 = defpackage.bck.HTTP_1_1;	 Catch:{ AssertionError -> 0x0301 }
    L_0x0271:
        r1.l = r0;	 Catch:{ AssertionError -> 0x0301 }
        if (r7 == 0) goto L_0x027c;
    L_0x0275:
        r0 = defpackage.bgo.c();	 Catch:{ IOException -> 0x0323 }
        r0.b(r7);	 Catch:{ IOException -> 0x0323 }
    L_0x027c:
        r0 = r1.l;	 Catch:{ IOException -> 0x0323 }
        r6 = defpackage.bck.HTTP_2;	 Catch:{ IOException -> 0x0323 }
        if (r0 != r6) goto L_0x0284;
    L_0x0282:
        goto L_0x01be;
    L_0x0284:
        r0 = r1.h;
        r0 = r0.d();
        if (r0 == 0) goto L_0x029e;
    L_0x028c:
        r0 = r1.i;
        if (r0 == 0) goto L_0x0291;
    L_0x0290:
        goto L_0x029e;
    L_0x0291:
        r0 = new java.net.ProtocolException;
        r2 = "Too many tunnel connections attempted: 21";
        r0.<init>(r2);
        r2 = new bdr;
        r2.<init>(r0);
        throw r2;
    L_0x029e:
        r0 = r1.m;
        if (r0 == 0) goto L_0x02b2;
    L_0x02a2:
        r2 = r1.g;
        monitor-enter(r2);
        r0 = r1.m;	 Catch:{ all -> 0x02af }
        r0 = r0.a();	 Catch:{ all -> 0x02af }
        r1.c = r0;	 Catch:{ all -> 0x02af }
        monitor-exit(r2);	 Catch:{ all -> 0x02af }
        return;
    L_0x02af:
        r0 = move-exception;
        monitor-exit(r2);	 Catch:{ all -> 0x02af }
        throw r0;
    L_0x02b2:
        return;
    L_0x02b3:
        r8 = r10.b();	 Catch:{ AssertionError -> 0x0301 }
        r6 = r8.get(r6);	 Catch:{ AssertionError -> 0x0301 }
        r6 = (java.security.cert.X509Certificate) r6;	 Catch:{ AssertionError -> 0x0301 }
        r8 = new javax.net.ssl.SSLPeerUnverifiedException;	 Catch:{ AssertionError -> 0x0301 }
        r9 = new java.lang.StringBuilder;	 Catch:{ AssertionError -> 0x0301 }
        r10 = "Hostname ";
        r9.<init>(r10);	 Catch:{ AssertionError -> 0x0301 }
        r0 = r0.a();	 Catch:{ AssertionError -> 0x0301 }
        r0 = r0.f();	 Catch:{ AssertionError -> 0x0301 }
        r9.append(r0);	 Catch:{ AssertionError -> 0x0301 }
        r0 = " not verified:\n    certificate: ";
        r9.append(r0);	 Catch:{ AssertionError -> 0x0301 }
        r0 = defpackage.bba.a(r6);	 Catch:{ AssertionError -> 0x0301 }
        r9.append(r0);	 Catch:{ AssertionError -> 0x0301 }
        r0 = "\n    DN: ";
        r9.append(r0);	 Catch:{ AssertionError -> 0x0301 }
        r0 = r6.getSubjectDN();	 Catch:{ AssertionError -> 0x0301 }
        r0 = r0.getName();	 Catch:{ AssertionError -> 0x0301 }
        r9.append(r0);	 Catch:{ AssertionError -> 0x0301 }
        r0 = "\n    subjectAltNames: ";
        r9.append(r0);	 Catch:{ AssertionError -> 0x0301 }
        r0 = defpackage.bgs.a(r6);	 Catch:{ AssertionError -> 0x0301 }
        r9.append(r0);	 Catch:{ AssertionError -> 0x0301 }
        r0 = r9.toString();	 Catch:{ AssertionError -> 0x0301 }
        r8.<init>(r0);	 Catch:{ AssertionError -> 0x0301 }
        throw r8;	 Catch:{ AssertionError -> 0x0301 }
    L_0x0301:
        r0 = move-exception;
        goto L_0x0308;
    L_0x0303:
        r0 = move-exception;
        r7 = r4;
        goto L_0x0316;
    L_0x0306:
        r0 = move-exception;
        r7 = r4;
    L_0x0308:
        r6 = defpackage.bdb.a(r0);	 Catch:{ all -> 0x0315 }
        if (r6 == 0) goto L_0x0314;
    L_0x030e:
        r6 = new java.io.IOException;	 Catch:{ all -> 0x0315 }
        r6.<init>(r0);	 Catch:{ all -> 0x0315 }
        throw r6;	 Catch:{ all -> 0x0315 }
    L_0x0314:
        throw r0;	 Catch:{ all -> 0x0315 }
    L_0x0315:
        r0 = move-exception;
    L_0x0316:
        if (r7 == 0) goto L_0x031f;
    L_0x0318:
        r6 = defpackage.bgo.c();	 Catch:{ IOException -> 0x0323 }
        r6.b(r7);	 Catch:{ IOException -> 0x0323 }
    L_0x031f:
        defpackage.bdb.a(r7);	 Catch:{ IOException -> 0x0323 }
        throw r0;	 Catch:{ IOException -> 0x0323 }
    L_0x0323:
        r0 = move-exception;
        goto L_0x032a;
    L_0x0325:
        r0 = move-exception;
        r11 = r19;
    L_0x0328:
        r12 = r20;
    L_0x032a:
        r6 = r1.j;
        defpackage.bdb.a(r6);
        r6 = r1.i;
        defpackage.bdb.a(r6);
        r1.j = r4;
        r1.i = r4;
        r1.n = r4;
        r1.o = r4;
        r1.k = r4;
        r1.l = r4;
        r1.m = r4;
        if (r5 != 0) goto L_0x034b;
    L_0x0344:
        r5 = new bdr;
        r5.<init>(r0);
    L_0x0349:
        r6 = r5;
        goto L_0x034f;
    L_0x034b:
        r5.a(r0);
        goto L_0x0349;
    L_0x034f:
        if (r22 == 0) goto L_0x035a;
    L_0x0351:
        r0 = r3.a(r0);
        if (r0 == 0) goto L_0x035a;
    L_0x0357:
        r5 = r6;
        goto L_0x0083;
    L_0x035a:
        throw r6;
    L_0x035b:
        r0 = new bdr;
        r2 = new java.net.UnknownServiceException;
        r3 = "H2_PRIOR_KNOWLEDGE cannot be used with HTTPS";
        r2.<init>(r3);
        r0.<init>(r2);
        throw r0;
    L_0x0368:
        r0 = new java.lang.IllegalStateException;
        r2 = "already connected";
        r0.<init>(r2);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdp.a(int, int, int, int, boolean):void");
    }

    public final void a(bfa bfa) {
        synchronized (this.g) {
            this.c = bfa.a();
        }
    }

    public final void a(bfs bfs) {
        bfs.a(bes.REFUSED_STREAM);
    }

    public final boolean a(defpackage.bas r5, @javax.annotation.Nullable defpackage.bcx r6) {
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
        r4 = this;
        r0 = r4.d;
        r0 = r0.size();
        r1 = r4.c;
        r2 = 0;
        if (r0 >= r1) goto L_0x00a1;
    L_0x000b:
        r0 = r4.a;
        if (r0 == 0) goto L_0x0011;
    L_0x000f:
        goto L_0x00a1;
    L_0x0011:
        r0 = defpackage.bcz.a;
        r1 = r4.h;
        r1 = r1.a();
        r0 = r0.a(r1, r5);
        if (r0 != 0) goto L_0x0020;
    L_0x001f:
        return r2;
    L_0x0020:
        r0 = r5.a();
        r0 = r0.f();
        r1 = r4.h;
        r1 = r1.a();
        r1 = r1.a();
        r1 = r1.f();
        r0 = r0.equals(r1);
        r1 = 1;
        if (r0 == 0) goto L_0x003e;
    L_0x003d:
        return r1;
    L_0x003e:
        r0 = r4.m;
        if (r0 != 0) goto L_0x0043;
    L_0x0042:
        return r2;
    L_0x0043:
        if (r6 != 0) goto L_0x0046;
    L_0x0045:
        return r2;
    L_0x0046:
        r0 = r6.b();
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0053;
    L_0x0052:
        return r2;
    L_0x0053:
        r0 = r4.h;
        r0 = r0.b();
        r0 = r0.type();
        r3 = java.net.Proxy.Type.DIRECT;
        if (r0 == r3) goto L_0x0062;
    L_0x0061:
        return r2;
    L_0x0062:
        r0 = r4.h;
        r0 = r0.c();
        r3 = r6.c();
        r0 = r0.equals(r3);
        if (r0 != 0) goto L_0x0073;
    L_0x0072:
        return r2;
    L_0x0073:
        r6 = r6.a();
        r6 = r6.i();
        r0 = defpackage.bgs.a;
        if (r6 == r0) goto L_0x0080;
    L_0x007f:
        return r2;
    L_0x0080:
        r6 = r5.a();
        r6 = r4.a(r6);
        if (r6 != 0) goto L_0x008b;
    L_0x008a:
        return r2;
    L_0x008b:
        r6 = r5.j();	 Catch:{ SSLPeerUnverifiedException -> 0x00a1 }
        r5 = r5.a();	 Catch:{ SSLPeerUnverifiedException -> 0x00a1 }
        r5 = r5.f();	 Catch:{ SSLPeerUnverifiedException -> 0x00a1 }
        r0 = r4.k;	 Catch:{ SSLPeerUnverifiedException -> 0x00a1 }
        r0 = r0.b();	 Catch:{ SSLPeerUnverifiedException -> 0x00a1 }
        r6.a(r5, r0);	 Catch:{ SSLPeerUnverifiedException -> 0x00a1 }
        return r1;
    L_0x00a1:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdp.a(bas, bcx):boolean");
    }

    public final boolean a(bbz bbz) {
        if (bbz.g() != this.h.a().a().g()) {
            return false;
        }
        if (bbz.f().equals(this.h.a().a().f())) {
            return true;
        }
        if (this.k != null) {
            bgs bgs = bgs.a;
            if (bgs.a(bbz.f(), (X509Certificate) this.k.b().get(0))) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(boolean r5) {
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
        r4 = this;
        r0 = r4.j;
        r0 = r0.isClosed();
        r1 = 0;
        if (r0 != 0) goto L_0x0051;
    L_0x0009:
        r0 = r4.j;
        r0 = r0.isInputShutdown();
        if (r0 != 0) goto L_0x0051;
    L_0x0011:
        r0 = r4.j;
        r0 = r0.isOutputShutdown();
        if (r0 == 0) goto L_0x001a;
    L_0x0019:
        goto L_0x0051;
    L_0x001a:
        r0 = r4.m;
        r2 = 1;
        if (r0 == 0) goto L_0x0027;
    L_0x001f:
        r5 = r0.c();
        if (r5 != 0) goto L_0x0026;
    L_0x0025:
        return r2;
    L_0x0026:
        return r1;
    L_0x0027:
        if (r5 == 0) goto L_0x0050;
    L_0x0029:
        r5 = r4.j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r5 = r5.getSoTimeout();	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0 = r4.j;	 Catch:{ all -> 0x0048 }
        r0.setSoTimeout(r2);	 Catch:{ all -> 0x0048 }
        r0 = r4.n;	 Catch:{ all -> 0x0048 }
        r0 = r0.e();	 Catch:{ all -> 0x0048 }
        if (r0 == 0) goto L_0x0042;
    L_0x003c:
        r0 = r4.j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        return r1;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x0042:
        r0 = r4.j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r0.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        return r2;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x0048:
        r0 = move-exception;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r3 = r4.j;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        r3.setSoTimeout(r5);	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
        throw r0;	 Catch:{ SocketTimeoutException -> 0x0050, IOException -> 0x004f }
    L_0x004f:
        return r1;
    L_0x0050:
        return r2;
    L_0x0051:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdp.a(boolean):boolean");
    }

    public final bcx b() {
        return this.h;
    }

    public final void c() {
        bdb.a(this.i);
    }

    public final Socket d() {
        return this.j;
    }

    public final bbw e() {
        return this.k;
    }

    public final boolean f() {
        return this.m != null;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Connection{");
        stringBuilder.append(this.h.a().a().f());
        stringBuilder.append(":");
        stringBuilder.append(this.h.a().a().g());
        stringBuilder.append(", proxy=");
        stringBuilder.append(this.h.b());
        stringBuilder.append(" hostAddress=");
        stringBuilder.append(this.h.c());
        stringBuilder.append(" cipherSuite=");
        bbw bbw = this.k;
        stringBuilder.append(bbw != null ? bbw.a() : "none");
        stringBuilder.append(" protocol=");
        stringBuilder.append(this.l);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
