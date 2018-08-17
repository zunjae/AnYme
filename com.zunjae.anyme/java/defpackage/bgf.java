package defpackage;

import android.os.Build.VERSION;
import android.util.Log;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

final class bgf extends bgo {
    private final Class<?> a;
    private final bgn<Socket> b;
    private final bgn<Socket> c;
    private final bgn<Socket> d;
    private final bgn<Socket> e;
    private final bgi f = bgi.a();

    private bgf(Class<?> cls, bgn<Socket> bgn_java_net_Socket, bgn<Socket> bgn_java_net_Socket2, bgn<Socket> bgn_java_net_Socket3, bgn<Socket> bgn_java_net_Socket4) {
        this.a = cls;
        this.b = bgn_java_net_Socket;
        this.c = bgn_java_net_Socket2;
        this.d = bgn_java_net_Socket3;
        this.e = bgn_java_net_Socket4;
    }

    public static defpackage.bgo a() {
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
        r0 = 0;
        r1 = "com.android.org.conscrypt.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0009 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0009 }
    L_0x0007:
        r3 = r1;
        goto L_0x0010;
    L_0x0009:
        r1 = "org.apache.harmony.xnet.provider.jsse.SSLParametersImpl";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = java.lang.Class.forName(r1);	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x0007;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0010:
        r4 = new bgn;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setUseSessionTickets";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = 1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = 0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5[r7] = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r4.<init>(r0, r1, r5);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5 = new bgn;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = "setHostname";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = java.lang.String.class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6[r7] = r8;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r5.<init>(r0, r1, r6);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1 = defpackage.bgf.d();	 Catch:{ ClassNotFoundException -> 0x0056 }
        if (r1 == 0) goto L_0x004d;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x0032:
        r1 = new bgn;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "getAlpnSelectedProtocol";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = new java.lang.Class[r7];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r1.<init>(r6, r8, r9);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = new bgn;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r8 = "setAlpnProtocols";	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0056 }
        r9 = byte[].class;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2[r7] = r9;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6.<init>(r0, r8, r2);	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r6 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        goto L_0x004f;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004d:
        r6 = r0;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r7 = r6;	 Catch:{ ClassNotFoundException -> 0x0056 }
    L_0x004f:
        r1 = new bgf;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2 = r1;	 Catch:{ ClassNotFoundException -> 0x0056 }
        r2.<init>(r3, r4, r5, r6, r7);	 Catch:{ ClassNotFoundException -> 0x0056 }
        return r1;
    L_0x0056:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.a():bgo");
    }

    private boolean a(java.lang.String r6, java.lang.Class<?> r7, java.lang.Object r8) {
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
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = 1;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r3 = java.lang.String.class;	 Catch:{ NoSuchMethodException -> 0x001d }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r2[r4] = r3;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r7.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x001d }
        r1 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x001d }
        r1[r4] = r6;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.invoke(r8, r1);	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = (java.lang.Boolean) r0;	 Catch:{ NoSuchMethodException -> 0x001d }
        r0 = r0.booleanValue();	 Catch:{ NoSuchMethodException -> 0x001d }
        return r0;
    L_0x001d:
        r6 = r5.b(r6, r7, r8);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.a(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    private boolean b(java.lang.String r4, java.lang.Class<?> r5, java.lang.Object r6) {
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
        r3 = this;
        r0 = "isCleartextTrafficPermitted";	 Catch:{ NoSuchMethodException -> 0x0016 }
        r1 = 0;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r2 = new java.lang.Class[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.getMethod(r0, r2);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r0 = new java.lang.Object[r1];	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.invoke(r6, r0);	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = (java.lang.Boolean) r5;	 Catch:{ NoSuchMethodException -> 0x0016 }
        r5 = r5.booleanValue();	 Catch:{ NoSuchMethodException -> 0x0016 }
        return r5;
    L_0x0016:
        r4 = super.b(r4);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.b(java.lang.String, java.lang.Class, java.lang.Object):boolean");
    }

    private static boolean d() {
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
        r0 = "GMSCore_OpenSSL";
        r0 = java.security.Security.getProvider(r0);
        r1 = 1;
        if (r0 == 0) goto L_0x000a;
    L_0x0009:
        return r1;
    L_0x000a:
        r0 = "android.net.Network";	 Catch:{ ClassNotFoundException -> 0x0010 }
        java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0010 }
        return r1;
    L_0x0010:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.d():boolean");
    }

    public final defpackage.bgr a(javax.net.ssl.X509TrustManager r8) {
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
        r7 = this;
        r0 = "android.net.http.X509TrustManagerExtensions";	 Catch:{ Exception -> 0x0036 }
        r0 = java.lang.Class.forName(r0);	 Catch:{ Exception -> 0x0036 }
        r1 = 1;	 Catch:{ Exception -> 0x0036 }
        r2 = new java.lang.Class[r1];	 Catch:{ Exception -> 0x0036 }
        r3 = javax.net.ssl.X509TrustManager.class;	 Catch:{ Exception -> 0x0036 }
        r4 = 0;	 Catch:{ Exception -> 0x0036 }
        r2[r4] = r3;	 Catch:{ Exception -> 0x0036 }
        r2 = r0.getConstructor(r2);	 Catch:{ Exception -> 0x0036 }
        r3 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x0036 }
        r3[r4] = r8;	 Catch:{ Exception -> 0x0036 }
        r2 = r2.newInstance(r3);	 Catch:{ Exception -> 0x0036 }
        r3 = "checkServerTrusted";	 Catch:{ Exception -> 0x0036 }
        r5 = 3;	 Catch:{ Exception -> 0x0036 }
        r5 = new java.lang.Class[r5];	 Catch:{ Exception -> 0x0036 }
        r6 = java.security.cert.X509Certificate[].class;	 Catch:{ Exception -> 0x0036 }
        r5[r4] = r6;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r1 = 2;	 Catch:{ Exception -> 0x0036 }
        r4 = java.lang.String.class;	 Catch:{ Exception -> 0x0036 }
        r5[r1] = r4;	 Catch:{ Exception -> 0x0036 }
        r0 = r0.getMethod(r3, r5);	 Catch:{ Exception -> 0x0036 }
        r1 = new bgg;	 Catch:{ Exception -> 0x0036 }
        r1.<init>(r2, r0);	 Catch:{ Exception -> 0x0036 }
        return r1;
    L_0x0036:
        r8 = super.a(r8);
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.a(javax.net.ssl.X509TrustManager):bgr");
    }

    public final Object a(String str) {
        return this.f.a(str);
    }

    @Nullable
    public final String a(SSLSocket sSLSocket) {
        bgn bgn = this.d;
        if (bgn == null || !bgn.a((Object) sSLSocket)) {
            return null;
        }
        byte[] bArr = (byte[]) this.d.b(sSLSocket, new Object[0]);
        return bArr != null ? new String(bArr, bdb.e) : null;
    }

    public final void a(int i, String str, Throwable th) {
        int i2 = 5;
        if (i != 5) {
            i2 = 3;
        }
        if (th != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append('\n');
            stringBuilder.append(Log.getStackTraceString(th));
            str = stringBuilder.toString();
        }
        int i3 = 0;
        int length = str.length();
        while (i3 < length) {
            int min;
            int indexOf = str.indexOf(10, i3);
            if (indexOf == -1) {
                indexOf = length;
            }
            while (true) {
                min = Math.min(indexOf, i3 + 4000);
                Log.println(i2, "OkHttp", str.substring(i3, min));
                if (min >= indexOf) {
                    break;
                }
                i3 = min;
            }
            i3 = min + 1;
        }
    }

    public final void a(String str, Object obj) {
        if (!this.f.a(obj)) {
            a(5, str, null);
        }
    }

    public final void a(Socket socket, InetSocketAddress inetSocketAddress, int i) {
        IOException iOException;
        try {
            socket.connect(inetSocketAddress, i);
        } catch (AssertionError e) {
            if (bdb.a(e)) {
                throw new IOException(e);
            }
            throw e;
        } catch (Throwable e2) {
            iOException = new IOException("Exception in connect");
            iOException.initCause(e2);
            throw iOException;
        } catch (Throwable e22) {
            if (VERSION.SDK_INT == 26) {
                iOException = new IOException("Exception in connect");
                iOException.initCause(e22);
                throw iOException;
            }
            throw e22;
        }
    }

    public final void a(SSLSocket sSLSocket, String str, List<bck> list) {
        if (str != null) {
            this.b.a(sSLSocket, Boolean.TRUE);
            this.c.a(sSLSocket, str);
        }
        bgn bgn = this.e;
        if (bgn != null && bgn.a((Object) sSLSocket)) {
            Object[] objArr = new Object[1];
            bhd bhd = new bhd();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                bck bck = (bck) list.get(i);
                if (bck != bck.HTTP_1_0) {
                    bhd.b(bck.toString().length());
                    bhd.a(bck.toString());
                }
            }
            objArr[0] = bhd.r();
            this.e.b(sSLSocket, objArr);
        }
    }

    public final defpackage.bgt b(javax.net.ssl.X509TrustManager r7) {
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
        r6 = this;
        r0 = r7.getClass();	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = "findTrustAnchorByIssuerAndSignature";	 Catch:{ NoSuchMethodException -> 0x001b }
        r2 = 1;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ NoSuchMethodException -> 0x001b }
        r4 = 0;	 Catch:{ NoSuchMethodException -> 0x001b }
        r5 = java.security.cert.X509Certificate.class;	 Catch:{ NoSuchMethodException -> 0x001b }
        r3[r4] = r5;	 Catch:{ NoSuchMethodException -> 0x001b }
        r0 = r0.getDeclaredMethod(r1, r3);	 Catch:{ NoSuchMethodException -> 0x001b }
        r0.setAccessible(r2);	 Catch:{ NoSuchMethodException -> 0x001b }
        r1 = new bgh;	 Catch:{ NoSuchMethodException -> 0x001b }
        r1.<init>(r7, r0);	 Catch:{ NoSuchMethodException -> 0x001b }
        return r1;
    L_0x001b:
        r7 = super.b(r7);
        return r7;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.b(javax.net.ssl.X509TrustManager):bgt");
    }

    public final javax.net.ssl.SSLContext b() {
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
        r3 = this;
        r0 = android.os.Build.VERSION.SDK_INT;
        r1 = 16;
        if (r0 < r1) goto L_0x0011;
    L_0x0006:
        r1 = 22;
        if (r0 >= r1) goto L_0x0011;
    L_0x000a:
        r0 = "TLSv1.2";	 Catch:{ NoSuchAlgorithmException -> 0x0011 }
        r0 = javax.net.ssl.SSLContext.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0011 }
        return r0;
    L_0x0011:
        r0 = "TLS";	 Catch:{ NoSuchAlgorithmException -> 0x0018 }
        r0 = javax.net.ssl.SSLContext.getInstance(r0);	 Catch:{ NoSuchAlgorithmException -> 0x0018 }
        return r0;
    L_0x0018:
        r0 = move-exception;
        r1 = new java.lang.IllegalStateException;
        r2 = "No TLS provider";
        r1.<init>(r2, r0);
        throw r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.b():javax.net.ssl.SSLContext");
    }

    public final boolean b(java.lang.String r5) {
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
        r4 = this;
        r0 = "android.security.NetworkSecurityPolicy";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = java.lang.Class.forName(r0);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = "getInstance";	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = new java.lang.Class[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r0.getMethod(r1, r3);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r3 = 0;	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r2 = new java.lang.Object[r2];	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r1 = r1.invoke(r3, r2);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        r0 = r4.a(r5, r0, r1);	 Catch:{ ClassNotFoundException -> 0x0023, ClassNotFoundException -> 0x0023, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b, IllegalAccessException -> 0x001b }
        return r0;
    L_0x001b:
        r5 = move-exception;
        r0 = "unable to determine cleartext support";
        r5 = defpackage.bdb.a(r0, r5);
        throw r5;
    L_0x0023:
        r5 = super.b(r5);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: bgf.b(java.lang.String):boolean");
    }
}
