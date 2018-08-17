package defpackage;

import java.io.InputStream;
import java.net.HttpURLConnection;

public final class eq implements en<InputStream> {
    private static final es a = new er();
    private final hu b;
    private final es c;
    private HttpURLConnection d;
    private InputStream e;
    private volatile boolean f;

    public eq(hu huVar) {
        this(huVar, a);
    }

    private eq(hu huVar, es esVar) {
        this.b = huVar;
        this.c = esVar;
    }

    private java.io.InputStream a(java.net.URL r4, int r5, java.net.URL r6, java.util.Map<java.lang.String, java.lang.String> r7) {
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
    L_0x0000:
        r0 = 5;
        if (r5 >= r0) goto L_0x0103;
    L_0x0003:
        if (r6 == 0) goto L_0x001c;
    L_0x0005:
        r0 = r4.toURI();	 Catch:{ URISyntaxException -> 0x001c }
        r6 = r6.toURI();	 Catch:{ URISyntaxException -> 0x001c }
        r6 = r0.equals(r6);	 Catch:{ URISyntaxException -> 0x001c }
        if (r6 != 0) goto L_0x0014;	 Catch:{ URISyntaxException -> 0x001c }
    L_0x0013:
        goto L_0x001c;	 Catch:{ URISyntaxException -> 0x001c }
    L_0x0014:
        r6 = new java.io.IOException;	 Catch:{ URISyntaxException -> 0x001c }
        r0 = "In re-direct loop";	 Catch:{ URISyntaxException -> 0x001c }
        r6.<init>(r0);	 Catch:{ URISyntaxException -> 0x001c }
        throw r6;	 Catch:{ URISyntaxException -> 0x001c }
    L_0x001c:
        r6 = r3.c;
        r6 = r6.a(r4);
        r3.d = r6;
        r6 = r7.entrySet();
        r6 = r6.iterator();
    L_0x002c:
        r0 = r6.hasNext();
        if (r0 == 0) goto L_0x004a;
    L_0x0032:
        r0 = r6.next();
        r0 = (java.util.Map.Entry) r0;
        r1 = r3.d;
        r2 = r0.getKey();
        r2 = (java.lang.String) r2;
        r0 = r0.getValue();
        r0 = (java.lang.String) r0;
        r1.addRequestProperty(r2, r0);
        goto L_0x002c;
    L_0x004a:
        r6 = r3.d;
        r0 = 2500; // 0x9c4 float:3.503E-42 double:1.235E-320;
        r6.setConnectTimeout(r0);
        r6 = r3.d;
        r6.setReadTimeout(r0);
        r6 = r3.d;
        r0 = 0;
        r6.setUseCaches(r0);
        r6 = r3.d;
        r0 = 1;
        r6.setDoInput(r0);
        r6 = r3.d;
        r6.connect();
        r6 = r3.f;
        if (r6 == 0) goto L_0x006d;
    L_0x006b:
        r4 = 0;
        return r4;
    L_0x006d:
        r6 = r3.d;
        r6 = r6.getResponseCode();
        r0 = r6 / 100;
        r1 = 2;
        r2 = 3;
        if (r0 != r1) goto L_0x00b3;
    L_0x0079:
        r4 = r3.d;
        r5 = r4.getContentEncoding();
        r5 = android.text.TextUtils.isEmpty(r5);
        if (r5 == 0) goto L_0x0095;
    L_0x0085:
        r5 = r4.getContentLength();
        r4 = r4.getInputStream();
        r5 = (long) r5;
        r4 = defpackage.nq.a(r4, r5);
    L_0x0092:
        r3.e = r4;
        goto L_0x00b0;
    L_0x0095:
        r5 = "HttpUrlFetcher";
        r5 = android.util.Log.isLoggable(r5, r2);
        if (r5 == 0) goto L_0x00ab;
    L_0x009d:
        r5 = new java.lang.StringBuilder;
        r6 = "Got non empty content encoding: ";
        r5.<init>(r6);
        r6 = r4.getContentEncoding();
        r5.append(r6);
    L_0x00ab:
        r4 = r4.getInputStream();
        goto L_0x0092;
    L_0x00b0:
        r4 = r3.e;
        return r4;
    L_0x00b3:
        if (r0 != r2) goto L_0x00d6;
    L_0x00b5:
        r6 = r3.d;
        r0 = "Location";
        r6 = r6.getHeaderField(r0);
        r0 = android.text.TextUtils.isEmpty(r6);
        if (r0 != 0) goto L_0x00ce;
    L_0x00c3:
        r0 = new java.net.URL;
        r0.<init>(r4, r6);
        r5 = r5 + 1;
        r6 = r4;
        r4 = r0;
        goto L_0x0000;
    L_0x00ce:
        r4 = new java.io.IOException;
        r5 = "Received empty or null redirect url";
        r4.<init>(r5);
        throw r4;
    L_0x00d6:
        r4 = -1;
        if (r6 != r4) goto L_0x00e1;
    L_0x00d9:
        r4 = new java.io.IOException;
        r5 = "Unable to retrieve response code from HttpUrlConnection.";
        r4.<init>(r5);
        throw r4;
    L_0x00e1:
        r4 = new java.io.IOException;
        r5 = new java.lang.StringBuilder;
        r7 = "Request failed ";
        r5.<init>(r7);
        r5.append(r6);
        r6 = ": ";
        r5.append(r6);
        r6 = r3.d;
        r6 = r6.getResponseMessage();
        r5.append(r6);
        r5 = r5.toString();
        r4.<init>(r5);
        throw r4;
    L_0x0103:
        r4 = new java.io.IOException;
        r5 = "Too many (> 5) redirects!";
        r4.<init>(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.a(java.net.URL, int, java.net.URL, java.util.Map):java.io.InputStream");
    }

    public final /* synthetic */ Object a(int i) {
        return a(this.b.a(), 0, null, this.b.b());
    }

    public final void a() {
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
        r1 = this;
        r0 = r1.e;
        if (r0 == 0) goto L_0x0007;
    L_0x0004:
        r0.close();	 Catch:{ IOException -> 0x0007 }
    L_0x0007:
        r0 = r1.d;
        if (r0 == 0) goto L_0x000e;
    L_0x000b:
        r0.disconnect();
    L_0x000e:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: eq.a():void");
    }

    public final String b() {
        return this.b.c();
    }

    public final void c() {
        this.f = true;
    }
}
