package org.jsoup.helper;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.jsoup.Connection.Base;
import org.jsoup.Connection.Method;

abstract class b<T extends Base> implements Base<T> {
    URL a;
    Method b;
    Map<String, String> c;
    Map<String, String> d;

    private b() {
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
    }

    private static java.lang.String a(java.lang.String r9) {
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
        r0 = "ISO-8859-1";	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r0 = r9.getBytes(r0);	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r1 = r0.length;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r2 = 3;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r3 = 0;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r4 = 1;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r1 < r2) goto L_0x002f;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x000c:
        r1 = r0[r3];	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r1 = r1 & 255;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r5 = 239; // 0xef float:3.35E-43 double:1.18E-321;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r1 != r5) goto L_0x002f;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0014:
        r1 = r0[r4];	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r1 = r1 & 255;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r5 = 187; // 0xbb float:2.62E-43 double:9.24E-322;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r1 != r5) goto L_0x001e;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x001c:
        r1 = 1;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        goto L_0x001f;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x001e:
        r1 = 0;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x001f:
        r5 = 2;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r5 = r0[r5];	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r5 = r5 & 255;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r6 = 191; // 0xbf float:2.68E-43 double:9.44E-322;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r5 != r6) goto L_0x002a;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0028:
        r5 = 1;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        goto L_0x002b;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x002a:
        r5 = 0;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x002b:
        r1 = r1 & r5;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r1 == 0) goto L_0x002f;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x002e:
        goto L_0x0030;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x002f:
        r2 = 0;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0030:
        r1 = r0.length;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0031:
        if (r2 >= r1) goto L_0x0061;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0033:
        r5 = r0[r2];	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r6 = r5 & 128;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r6 == 0) goto L_0x005f;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0039:
        r6 = r5 & 224;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r7 = 192; // 0xc0 float:2.69E-43 double:9.5E-322;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r6 != r7) goto L_0x0042;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x003f:
        r5 = r2 + 1;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        goto L_0x0053;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0042:
        r6 = r5 & 240;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r8 = 224; // 0xe0 float:3.14E-43 double:1.107E-321;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r6 != r8) goto L_0x004b;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0048:
        r5 = r2 + 2;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        goto L_0x0053;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x004b:
        r5 = r5 & 248;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r6 = 240; // 0xf0 float:3.36E-43 double:1.186E-321;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r5 != r6) goto L_0x0062;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0051:
        r5 = r2 + 3;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0053:
        if (r2 >= r5) goto L_0x005f;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0055:
        r2 = r2 + 1;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r6 = r0[r2];	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r6 = r6 & r7;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r8 = 128; // 0x80 float:1.794E-43 double:6.32E-322;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        if (r6 == r8) goto L_0x0053;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x005e:
        goto L_0x0062;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x005f:
        r2 = r2 + r4;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        goto L_0x0031;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0061:
        r3 = 1;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0062:
        if (r3 != 0) goto L_0x0065;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0064:
        return r9;	 Catch:{ UnsupportedEncodingException -> 0x006d }
    L_0x0065:
        r1 = new java.lang.String;	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r2 = "UTF-8";	 Catch:{ UnsupportedEncodingException -> 0x006d }
        r1.<init>(r0, r2);	 Catch:{ UnsupportedEncodingException -> 0x006d }
        return r1;
    L_0x006d:
        return r9;
        */
        throw new UnsupportedOperationException("Method not decompiled: org.jsoup.helper.b.a(java.lang.String):java.lang.String");
    }

    private String b(String str) {
        Validate.notNull(str, "Header name must not be null");
        String str2 = (String) this.c.get(str);
        if (str2 == null) {
            str2 = (String) this.c.get(str.toLowerCase());
        }
        if (str2 != null) {
            return str2;
        }
        Entry c = c(str);
        return c != null ? (String) c.getValue() : str2;
    }

    private Entry<String, String> c(String str) {
        str = str.toLowerCase();
        for (Entry<String, String> entry : this.c.entrySet()) {
            if (((String) entry.getKey()).toLowerCase().equals(str)) {
                return entry;
            }
        }
        return null;
    }

    public String cookie(String str) {
        Validate.notEmpty(str, "Cookie name must not be empty");
        return (String) this.d.get(str);
    }

    public T cookie(String str, String str2) {
        Validate.notEmpty(str, "Cookie name must not be empty");
        Validate.notNull(str2, "Cookie value must not be null");
        this.d.put(str, str2);
        return this;
    }

    public Map<String, String> cookies() {
        return this.d;
    }

    public boolean hasCookie(String str) {
        Validate.notEmpty(str, "Cookie name must not be empty");
        return this.d.containsKey(str);
    }

    public boolean hasHeader(String str) {
        Validate.notEmpty(str, "Header name must not be empty");
        return b(str) != null;
    }

    public boolean hasHeaderWithValue(String str, String str2) {
        return hasHeader(str) && header(str).equalsIgnoreCase(str2);
    }

    public String header(String str) {
        Validate.notNull(str, "Header name must not be null");
        str = b(str);
        return str != null ? a(str) : str;
    }

    public T header(String str, String str2) {
        Validate.notEmpty(str, "Header name must not be empty");
        Validate.notNull(str2, "Header value must not be null");
        removeHeader(str);
        this.c.put(str, str2);
        return this;
    }

    public Map<String, String> headers() {
        return this.c;
    }

    public T method(Method method) {
        Validate.notNull(method, "Method must not be null");
        this.b = method;
        return this;
    }

    public Method method() {
        return this.b;
    }

    public T removeCookie(String str) {
        Validate.notEmpty(str, "Cookie name must not be empty");
        this.d.remove(str);
        return this;
    }

    public T removeHeader(String str) {
        Validate.notEmpty(str, "Header name must not be empty");
        Entry c = c(str);
        if (c != null) {
            this.c.remove(c.getKey());
        }
        return this;
    }

    public URL url() {
        return this.a;
    }

    public T url(URL url) {
        Validate.notNull(url, "URL must not be null");
        this.a = url;
        return this;
    }
}
