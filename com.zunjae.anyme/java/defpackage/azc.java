package defpackage;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URI;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import org.jsoup.helper.HttpConnection;

public final class azc {
    private static final String[] b = new String[0];
    private static azf c = azf.a;
    public final URL a;
    private HttpURLConnection d = null;
    private final String e;
    private azj f;
    private boolean g;
    private boolean h = true;
    private boolean i = false;
    private int j = 8192;
    private String k;
    private int l;

    private azc(CharSequence charSequence, String str) {
        try {
            this.a = new URL(charSequence.toString());
            this.e = str;
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    private azc a(InputStream inputStream, OutputStream outputStream) {
        return (azc) new azd(this, inputStream, this.h, inputStream, outputStream).call();
    }

    public static azc a(CharSequence charSequence) {
        return new azc(charSequence, "PUT");
    }

    public static azc a(CharSequence charSequence, Map<?, ?> map) {
        return new azc(azc.c(azc.c(charSequence, (Map) map)), "GET");
    }

    private azc a(String str, String str2, String str3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("form-data; name=\"");
        stringBuilder.append(str);
        if (str2 != null) {
            stringBuilder.append("\"; filename=\"");
            stringBuilder.append(str2);
        }
        stringBuilder.append('\"');
        e("Content-Disposition", stringBuilder.toString());
        if (str3 != null) {
            e("Content-Type", str3);
        }
        return d((CharSequence) "\r\n");
    }

    public static azc b(CharSequence charSequence) {
        return new azc(charSequence, "DELETE");
    }

    public static azc b(CharSequence charSequence, Map<?, ?> map) {
        return new azc(azc.c(azc.c(charSequence, (Map) map)), "POST");
    }

    private static String c(CharSequence charSequence) {
        try {
            URL url = new URL(charSequence.toString());
            String host = url.getHost();
            int port = url.getPort();
            if (port != -1) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(host);
                stringBuilder.append(':');
                stringBuilder.append(Integer.toString(port));
                host = stringBuilder.toString();
            }
            try {
                host = new URI(url.getProtocol(), host, url.getPath(), url.getQuery(), null).toASCIIString();
                int indexOf = host.indexOf(63);
                if (indexOf <= 0) {
                    return host;
                }
                indexOf++;
                if (indexOf >= host.length()) {
                    return host;
                }
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(host.substring(0, indexOf));
                stringBuilder2.append(host.substring(indexOf).replace("+", "%2B"));
                return stringBuilder2.toString();
            } catch (Throwable e) {
                IOException iOException = new IOException("Parsing URI failed");
                iOException.initCause(e);
                throw new azh(iOException);
            }
        } catch (IOException e2) {
            throw new azh(e2);
        }
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String c(java.lang.CharSequence r6, java.util.Map<?, ?> r7) {
        /*
        r6 = r6.toString();
        if (r7 == 0) goto L_0x0095;
    L_0x0006:
        r0 = r7.isEmpty();
        if (r0 == 0) goto L_0x000e;
    L_0x000c:
        goto L_0x0095;
    L_0x000e:
        r0 = new java.lang.StringBuilder;
        r0.<init>(r6);
        r1 = 58;
        r1 = r6.indexOf(r1);
        r1 = r1 + 2;
        r2 = 47;
        r3 = r6.lastIndexOf(r2);
        if (r1 != r3) goto L_0x0026;
    L_0x0023:
        r0.append(r2);
    L_0x0026:
        r1 = 63;
        r2 = r6.indexOf(r1);
        r3 = r0.length();
        r3 = r3 + -1;
        r4 = -1;
        r5 = 38;
        if (r2 != r4) goto L_0x003b;
    L_0x0037:
        r0.append(r1);
        goto L_0x0046;
    L_0x003b:
        if (r2 >= r3) goto L_0x0046;
    L_0x003d:
        r6 = r6.charAt(r3);
        if (r6 == r5) goto L_0x0046;
    L_0x0043:
        r0.append(r5);
    L_0x0046:
        r6 = r7.entrySet();
        r6 = r6.iterator();
        r7 = r6.next();
        r7 = (java.util.Map.Entry) r7;
        r1 = r7.getKey();
        r1 = r1.toString();
        r0.append(r1);
        r1 = 61;
        r0.append(r1);
        r7 = r7.getValue();
        if (r7 == 0) goto L_0x006d;
    L_0x006a:
        r0.append(r7);
    L_0x006d:
        r7 = r6.hasNext();
        if (r7 == 0) goto L_0x0091;
    L_0x0073:
        r0.append(r5);
        r7 = r6.next();
        r7 = (java.util.Map.Entry) r7;
        r2 = r7.getKey();
        r2 = r2.toString();
        r0.append(r2);
        r0.append(r1);
        r7 = r7.getValue();
        if (r7 == 0) goto L_0x006d;
    L_0x0090:
        goto L_0x006a;
    L_0x0091:
        r6 = r0.toString();
    L_0x0095:
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: azc.c(java.lang.CharSequence, java.util.Map):java.lang.String");
    }

    private static String c(String str) {
        return (str == null || str.length() <= 0) ? "UTF-8" : str;
    }

    /* JADX WARNING: inconsistent code. */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String c(java.lang.String r8, java.lang.String r9) {
        /*
        r0 = 0;
        if (r8 == 0) goto L_0x006f;
    L_0x0003:
        r1 = r8.length();
        if (r1 != 0) goto L_0x000a;
    L_0x0009:
        goto L_0x006f;
    L_0x000a:
        r1 = r8.length();
        r2 = 59;
        r3 = r8.indexOf(r2);
        r4 = 1;
        r3 = r3 + r4;
        if (r3 == 0) goto L_0x006f;
    L_0x0018:
        if (r3 != r1) goto L_0x001b;
    L_0x001a:
        goto L_0x006f;
    L_0x001b:
        r5 = r8.indexOf(r2, r3);
        r6 = -1;
        if (r5 != r6) goto L_0x0023;
    L_0x0022:
        r5 = r1;
    L_0x0023:
        if (r3 >= r5) goto L_0x006f;
    L_0x0025:
        r7 = 61;
        r7 = r8.indexOf(r7, r3);
        if (r7 == r6) goto L_0x0066;
    L_0x002d:
        if (r7 >= r5) goto L_0x0066;
    L_0x002f:
        r3 = r8.substring(r3, r7);
        r3 = r3.trim();
        r3 = r9.equals(r3);
        if (r3 == 0) goto L_0x0066;
    L_0x003d:
        r7 = r7 + 1;
        r3 = r8.substring(r7, r5);
        r3 = r3.trim();
        r7 = r3.length();
        if (r7 == 0) goto L_0x0066;
    L_0x004d:
        r8 = 2;
        if (r7 <= r8) goto L_0x0065;
    L_0x0050:
        r8 = 0;
        r8 = r3.charAt(r8);
        r9 = 34;
        if (r9 != r8) goto L_0x0065;
    L_0x0059:
        r7 = r7 - r4;
        r8 = r3.charAt(r7);
        if (r9 != r8) goto L_0x0065;
    L_0x0060:
        r8 = r3.substring(r4, r7);
        return r8;
    L_0x0065:
        return r3;
    L_0x0066:
        r3 = r5 + 1;
        r5 = r8.indexOf(r2, r3);
        if (r5 != r6) goto L_0x0023;
    L_0x006e:
        goto L_0x0022;
    L_0x006f:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: azc.c(java.lang.String, java.lang.String):java.lang.String");
    }

    private azc d(CharSequence charSequence) {
        try {
            k();
            this.f.a(charSequence.toString());
            return this;
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    private azc d(String str, String str2) {
        try {
            l();
            a(str, null, null);
            this.f.a(str2);
            return this;
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    private String d(String str) {
        j();
        int headerFieldInt = a().getHeaderFieldInt("Content-Length", -1);
        OutputStream byteArrayOutputStream = headerFieldInt > 0 ? new ByteArrayOutputStream(headerFieldInt) : new ByteArrayOutputStream();
        try {
            a(new BufferedInputStream(h(), this.j), byteArrayOutputStream);
            return byteArrayOutputStream.toString(azc.c(str));
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    private azc e(String str, String str2) {
        return d((CharSequence) str).d((CharSequence) ": ").d((CharSequence) str2).d((CharSequence) "\r\n");
    }

    private HttpURLConnection g() {
        try {
            HttpURLConnection a = this.k != null ? c.a(this.a, new Proxy(Type.HTTP, new InetSocketAddress(this.k, this.l))) : c.a(this.a);
            a.setRequestMethod(this.e);
            return a;
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    private InputStream h() {
        InputStream inputStream;
        if (b() < 400) {
            try {
                inputStream = a().getInputStream();
            } catch (IOException e) {
                throw new azh(e);
            }
        }
        inputStream = a().getErrorStream();
        if (inputStream == null) {
            try {
                inputStream = a().getInputStream();
            } catch (IOException e2) {
                throw new azh(e2);
            }
        }
        if (this.i) {
            if ("gzip".equals(a(HttpConnection.CONTENT_ENCODING))) {
                try {
                    return new GZIPInputStream(inputStream);
                } catch (IOException e22) {
                    throw new azh(e22);
                }
            }
        }
        return inputStream;
    }

    private defpackage.azc i() {
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
        r2 = this;
        r0 = r2.f;
        if (r0 != 0) goto L_0x0005;
    L_0x0004:
        return r2;
    L_0x0005:
        r1 = r2.g;
        if (r1 == 0) goto L_0x000e;
    L_0x0009:
        r1 = "\r\n--00content0boundary00--\r\n";
        r0.a(r1);
    L_0x000e:
        r0 = r2.h;
        if (r0 == 0) goto L_0x0018;
    L_0x0012:
        r0 = r2.f;	 Catch:{ IOException -> 0x001d }
        r0.close();	 Catch:{ IOException -> 0x001d }
        goto L_0x001d;
    L_0x0018:
        r0 = r2.f;
        r0.close();
    L_0x001d:
        r0 = 0;
        r2.f = r0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: azc.i():azc");
    }

    private azc j() {
        try {
            return i();
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    private azc k() {
        if (this.f != null) {
            return this;
        }
        a().setDoOutput(true);
        this.f = new azj(a().getOutputStream(), azc.c(a().getRequestProperty("Content-Type"), "charset"), this.j);
        return this;
    }

    private azc l() {
        azj azj;
        String str;
        if (this.g) {
            azj = this.f;
            str = "\r\n--00content0boundary00\r\n";
        } else {
            this.g = true;
            a("Content-Type", "multipart/form-data; boundary=00content0boundary00").k();
            azj = this.f;
            str = "--00content0boundary00\r\n";
        }
        azj.a(str);
        return this;
    }

    public final azc a(String str, Number number) {
        return d(str, number != null ? number.toString() : null);
    }

    public final azc a(String str, String str2) {
        a().setRequestProperty(str, str2);
        return this;
    }

    public final defpackage.azc a(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.io.File r7) {
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
        r0 = 0;
        r1 = new java.io.BufferedInputStream;	 Catch:{ IOException -> 0x001b }
        r2 = new java.io.FileInputStream;	 Catch:{ IOException -> 0x001b }
        r2.<init>(r7);	 Catch:{ IOException -> 0x001b }
        r1.<init>(r2);	 Catch:{ IOException -> 0x001b }
        r4 = r3.a(r4, r5, r6, r1);	 Catch:{ IOException -> 0x0016, all -> 0x0013 }
        r1.close();	 Catch:{ IOException -> 0x0012 }
    L_0x0012:
        return r4;
    L_0x0013:
        r4 = move-exception;
        r0 = r1;
        goto L_0x0022;
    L_0x0016:
        r4 = move-exception;
        r0 = r1;
        goto L_0x001c;
    L_0x0019:
        r4 = move-exception;
        goto L_0x0022;
    L_0x001b:
        r4 = move-exception;
    L_0x001c:
        r5 = new azh;	 Catch:{ all -> 0x0019 }
        r5.<init>(r4);	 Catch:{ all -> 0x0019 }
        throw r5;	 Catch:{ all -> 0x0019 }
    L_0x0022:
        if (r0 == 0) goto L_0x0027;
    L_0x0024:
        r0.close();	 Catch:{ IOException -> 0x0027 }
    L_0x0027:
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: azc.a(java.lang.String, java.lang.String, java.lang.String, java.io.File):azc");
    }

    public final azc a(String str, String str2, String str3, InputStream inputStream) {
        try {
            l();
            a(str, str2, str3);
            a(inputStream, this.f);
            return this;
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    public final String a(String str) {
        j();
        return a().getHeaderField(str);
    }

    public final HttpURLConnection a() {
        if (this.d == null) {
            this.d = g();
        }
        return this.d;
    }

    public final int b() {
        try {
            i();
            return a().getResponseCode();
        } catch (IOException e) {
            throw new azh(e);
        }
    }

    public final azc b(String str, String str2) {
        return d(str, str2);
    }

    public final String c() {
        return d(azc.c(a("Content-Type"), "charset"));
    }

    public final azc d() {
        a().setConnectTimeout(10000);
        return this;
    }

    public final azc e() {
        a().setUseCaches(false);
        return this;
    }

    public final String f() {
        return a().getRequestMethod();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a().getRequestMethod());
        stringBuilder.append(' ');
        stringBuilder.append(a().getURL());
        return stringBuilder.toString();
    }
}
