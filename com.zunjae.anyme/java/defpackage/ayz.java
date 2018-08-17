package defpackage;

import java.util.Locale;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

public final class ayz implements azk {
    private final avs a;
    private azl b;
    private SSLSocketFactory c;
    private boolean d;

    public ayz() {
        this(new ave((byte) 0));
    }

    public ayz(avs avs) {
        this.a = avs;
    }

    private synchronized void a() {
        this.d = false;
        this.c = null;
    }

    private synchronized SSLSocketFactory b() {
        if (this.c == null && !this.d) {
            this.c = c();
        }
        return this.c;
    }

    private synchronized javax.net.ssl.SSLSocketFactory c() {
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
        monitor-enter(r7);
        r0 = 1;
        r7.d = r0;	 Catch:{ all -> 0x002f }
        r1 = 0;
        r2 = r7.b;	 Catch:{ Exception -> 0x002d }
        r3 = "TLS";	 Catch:{ Exception -> 0x002d }
        r3 = javax.net.ssl.SSLContext.getInstance(r3);	 Catch:{ Exception -> 0x002d }
        r4 = new azn;	 Catch:{ Exception -> 0x002d }
        r5 = r2.a();	 Catch:{ Exception -> 0x002d }
        r6 = r2.b();	 Catch:{ Exception -> 0x002d }
        r4.<init>(r5, r6);	 Catch:{ Exception -> 0x002d }
        r5 = new azm;	 Catch:{ Exception -> 0x002d }
        r5.<init>(r4, r2);	 Catch:{ Exception -> 0x002d }
        r0 = new javax.net.ssl.TrustManager[r0];	 Catch:{ Exception -> 0x002d }
        r2 = 0;	 Catch:{ Exception -> 0x002d }
        r0[r2] = r5;	 Catch:{ Exception -> 0x002d }
        r3.init(r1, r0, r1);	 Catch:{ Exception -> 0x002d }
        r0 = r3.getSocketFactory();	 Catch:{ Exception -> 0x002d }
        monitor-exit(r7);
        return r0;
    L_0x002d:
        monitor-exit(r7);
        return r1;
    L_0x002f:
        r0 = move-exception;
        monitor-exit(r7);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ayz.c():javax.net.ssl.SSLSocketFactory");
    }

    public final azc a(int i, String str, Map<String, String> map) {
        azc a;
        int i2 = 1;
        switch (aza.a[i - 1]) {
            case tw.a /*1*/:
                a = azc.a((CharSequence) str, (Map) map);
                break;
            case tw.b /*2*/:
                a = azc.b((CharSequence) str, (Map) map);
                break;
            case f.c /*3*/:
                a = azc.a((CharSequence) str);
                break;
            case mh.d /*4*/:
                a = azc.b((CharSequence) str);
                break;
            default:
                throw new IllegalArgumentException("Unsupported HTTP method!");
        }
        if (str == null || !str.toLowerCase(Locale.US).startsWith("https")) {
            i2 = 0;
        }
        if (!(i2 == 0 || this.b == null)) {
            SSLSocketFactory b = b();
            if (b != null) {
                ((HttpsURLConnection) a.a()).setSSLSocketFactory(b);
            }
        }
        return a;
    }

    public final void a(azl azl) {
        if (this.b != azl) {
            this.b = azl;
            a();
        }
    }
}
