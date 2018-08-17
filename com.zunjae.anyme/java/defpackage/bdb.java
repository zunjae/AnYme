package defpackage;

import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import mehdi.sakout.fancybuttons.R;

public final class bdb {
    public static final byte[] a = new byte[0];
    public static final String[] b = new String[0];
    public static final bcu c = bcu.a(a);
    public static final bcp d = bcp.a(a);
    public static final Charset e = Charset.forName("UTF-8");
    public static final Charset f = Charset.forName("ISO-8859-1");
    public static final TimeZone g = TimeZone.getTimeZone("GMT");
    public static final Comparator<String> h = new bdc();
    private static final bhi i = bhi.b("efbbbf");
    private static final bhi j = bhi.b("feff");
    private static final bhi k = bhi.b("fffe");
    private static final bhi l = bhi.b("0000ffff");
    private static final bhi m = bhi.b("ffff0000");
    private static final Charset n = Charset.forName("UTF-16BE");
    private static final Charset o = Charset.forName("UTF-16LE");
    private static final Charset p = Charset.forName("UTF-32BE");
    private static final Charset q = Charset.forName("UTF-32LE");
    private static final Method r;
    private static final Pattern s = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    static {
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
        r0 = 0;
        r1 = new byte[r0];
        a = r1;
        r1 = new java.lang.String[r0];
        b = r1;
        r1 = a;
        r1 = defpackage.bcu.a(r1);
        c = r1;
        r1 = a;
        r1 = defpackage.bcp.a(r1);
        d = r1;
        r1 = "efbbbf";
        r1 = defpackage.bhi.b(r1);
        i = r1;
        r1 = "feff";
        r1 = defpackage.bhi.b(r1);
        j = r1;
        r1 = "fffe";
        r1 = defpackage.bhi.b(r1);
        k = r1;
        r1 = "0000ffff";
        r1 = defpackage.bhi.b(r1);
        l = r1;
        r1 = "ffff0000";
        r1 = defpackage.bhi.b(r1);
        m = r1;
        r1 = "UTF-8";
        r1 = java.nio.charset.Charset.forName(r1);
        e = r1;
        r1 = "ISO-8859-1";
        r1 = java.nio.charset.Charset.forName(r1);
        f = r1;
        r1 = "UTF-16BE";
        r1 = java.nio.charset.Charset.forName(r1);
        n = r1;
        r1 = "UTF-16LE";
        r1 = java.nio.charset.Charset.forName(r1);
        o = r1;
        r1 = "UTF-32BE";
        r1 = java.nio.charset.Charset.forName(r1);
        p = r1;
        r1 = "UTF-32LE";
        r1 = java.nio.charset.Charset.forName(r1);
        q = r1;
        r1 = "GMT";
        r1 = java.util.TimeZone.getTimeZone(r1);
        g = r1;
        r1 = new bdc;
        r1.<init>();
        h = r1;
        r1 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0090 }
        r2 = "addSuppressed";	 Catch:{ Exception -> 0x0090 }
        r3 = 1;	 Catch:{ Exception -> 0x0090 }
        r3 = new java.lang.Class[r3];	 Catch:{ Exception -> 0x0090 }
        r4 = java.lang.Throwable.class;	 Catch:{ Exception -> 0x0090 }
        r3[r0] = r4;	 Catch:{ Exception -> 0x0090 }
        r0 = r1.getDeclaredMethod(r2, r3);	 Catch:{ Exception -> 0x0090 }
        goto L_0x0091;
    L_0x0090:
        r0 = 0;
    L_0x0091:
        r = r0;
        r0 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)";
        r0 = java.util.regex.Pattern.compile(r0);
        s = r0;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.<clinit>():void");
    }

    public static int a(char c) {
        if (c >= '0' && c <= '9') {
            return c - 48;
        }
        int i = 97;
        if (c < 'a' || c > 'f') {
            i = 65;
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - i) + 10;
    }

    public static int a(String str, int i, int i2) {
        while (i < i2) {
            switch (str.charAt(i)) {
                case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
                case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
                case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                    i++;
                default:
                    return i;
            }
        }
        return i2;
    }

    public static int a(String str, int i, int i2, char c) {
        while (i < i2) {
            if (str.charAt(i) == c) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, int i, int i2, String str2) {
        while (i < i2) {
            if (str2.indexOf(str.charAt(i)) != -1) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int a(String str, long j, TimeUnit timeUnit) {
        StringBuilder stringBuilder;
        if (j < 0) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" < 0");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (timeUnit != null) {
            long toMillis = timeUnit.toMillis(j);
            if (toMillis <= 2147483647L) {
                if (toMillis == 0) {
                    if (j > 0) {
                        stringBuilder = new StringBuilder();
                        stringBuilder.append(str);
                        stringBuilder.append(" too small.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                }
                return (int) toMillis;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(" too large.");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else {
            throw new NullPointerException("unit == null");
        }
    }

    public static int a(Comparator<String> comparator, String[] strArr, String str) {
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            if (comparator.compare(strArr[i], str) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static java.lang.AssertionError a(java.lang.String r1, java.lang.Exception r2) {
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
        r0 = new java.lang.AssertionError;
        r0.<init>(r1);
        r0.initCause(r2);	 Catch:{ IllegalStateException -> 0x0008 }
    L_0x0008:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.a(java.lang.String, java.lang.Exception):java.lang.AssertionError");
    }

    public static String a(bbz bbz, boolean z) {
        String stringBuilder;
        if (bbz.f().contains(":")) {
            StringBuilder stringBuilder2 = new StringBuilder("[");
            stringBuilder2.append(bbz.f());
            stringBuilder2.append("]");
            stringBuilder = stringBuilder2.toString();
        } else {
            stringBuilder = bbz.f();
        }
        if (!z) {
            if (bbz.g() == bbz.a(bbz.b())) {
                return stringBuilder;
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(stringBuilder);
        stringBuilder3.append(":");
        stringBuilder3.append(bbz.g());
        return stringBuilder3.toString();
    }

    public static java.lang.String a(java.lang.String r8) {
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
        r0 = ":";
        r0 = r8.contains(r0);
        r1 = 0;
        if (r0 == 0) goto L_0x00a9;
    L_0x0009:
        r0 = "[";
        r0 = r8.startsWith(r0);
        r2 = 0;
        if (r0 == 0) goto L_0x0025;
    L_0x0012:
        r0 = "]";
        r0 = r8.endsWith(r0);
        if (r0 == 0) goto L_0x0025;
    L_0x001a:
        r0 = r8.length();
        r3 = 1;
        r0 = r0 - r3;
        r0 = defpackage.bdb.d(r8, r3, r0);
        goto L_0x002d;
    L_0x0025:
        r0 = r8.length();
        r0 = defpackage.bdb.d(r8, r2, r0);
    L_0x002d:
        if (r0 != 0) goto L_0x0030;
    L_0x002f:
        return r1;
    L_0x0030:
        r0 = r0.getAddress();
        r1 = r0.length;
        r3 = 16;
        if (r1 != r3) goto L_0x0090;
    L_0x0039:
        r8 = -1;
        r8 = 0;
        r1 = 0;
        r4 = -1;
    L_0x003d:
        r5 = r0.length;
        if (r8 >= r5) goto L_0x005c;
    L_0x0040:
        r5 = r8;
    L_0x0041:
        if (r5 >= r3) goto L_0x0050;
    L_0x0043:
        r6 = r0[r5];
        if (r6 != 0) goto L_0x0050;
    L_0x0047:
        r6 = r5 + 1;
        r6 = r0[r6];
        if (r6 != 0) goto L_0x0050;
    L_0x004d:
        r5 = r5 + 2;
        goto L_0x0041;
    L_0x0050:
        r6 = r5 - r8;
        if (r6 <= r1) goto L_0x0059;
    L_0x0054:
        r7 = 4;
        if (r6 < r7) goto L_0x0059;
    L_0x0057:
        r4 = r8;
        r1 = r6;
    L_0x0059:
        r8 = r5 + 2;
        goto L_0x003d;
    L_0x005c:
        r8 = new bhd;
        r8.<init>();
    L_0x0061:
        r5 = r0.length;
        if (r2 >= r5) goto L_0x008b;
    L_0x0064:
        r5 = 58;
        if (r2 != r4) goto L_0x0072;
    L_0x0068:
        r8.b(r5);
        r2 = r2 + r1;
        if (r2 != r3) goto L_0x0061;
    L_0x006e:
        r8.b(r5);
        goto L_0x0061;
    L_0x0072:
        if (r2 <= 0) goto L_0x0077;
    L_0x0074:
        r8.b(r5);
    L_0x0077:
        r5 = r0[r2];
        r5 = r5 & 255;
        r5 = r5 << 8;
        r6 = r2 + 1;
        r6 = r0[r6];
        r6 = r6 & 255;
        r5 = r5 | r6;
        r5 = (long) r5;
        r8.j(r5);
        r2 = r2 + 2;
        goto L_0x0061;
    L_0x008b:
        r8 = r8.o();
        return r8;
    L_0x0090:
        r0 = new java.lang.AssertionError;
        r1 = new java.lang.StringBuilder;
        r2 = "Invalid IPv6 address: '";
        r1.<init>(r2);
        r1.append(r8);
        r8 = "'";
        r1.append(r8);
        r8 = r1.toString();
        r0.<init>(r8);
        throw r0;
    L_0x00a9:
        r8 = java.net.IDN.toASCII(r8);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r0 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r8 = r8.toLowerCase(r0);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        r0 = r8.isEmpty();	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r0 == 0) goto L_0x00ba;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00b9:
        return r1;	 Catch:{ IllegalArgumentException -> 0x00c2 }
    L_0x00ba:
        r0 = defpackage.bdb.d(r8);	 Catch:{ IllegalArgumentException -> 0x00c2 }
        if (r0 == 0) goto L_0x00c1;
    L_0x00c0:
        return r1;
    L_0x00c1:
        return r8;
    L_0x00c2:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.a(java.lang.String):java.lang.String");
    }

    public static String a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    public static Charset a(bhh bhh, Charset charset) {
        if (bhh.b(i)) {
            bhh.h((long) i.g());
            return e;
        } else if (bhh.b(j)) {
            bhh.h((long) j.g());
            return n;
        } else if (bhh.b(k)) {
            bhh.h((long) k.g());
            return o;
        } else if (bhh.b(l)) {
            bhh.h((long) l.g());
            return p;
        } else if (!bhh.b(m)) {
            return charset;
        } else {
            bhh.h((long) m.g());
            return q;
        }
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList(new ArrayList(list));
    }

    public static <T> List<T> a(T... tArr) {
        return Collections.unmodifiableList(Arrays.asList((Object[]) tArr.clone()));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        return map.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(new LinkedHashMap(map));
    }

    public static ThreadFactory a(String str, boolean z) {
        return new bdd(str, z);
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            StringBuilder stringBuilder = new StringBuilder("Unexpected default trust managers:");
            stringBuilder.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(stringBuilder.toString());
        } catch (Exception e) {
            throw bdb.a("No System TLS", e);
        }
    }

    public static void a(long j, long j2) {
        if ((j2 | 0) < 0 || 0 > j || j - 0 < j2) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public static void a(java.io.Closeable r0) {
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
        if (r0 == 0) goto L_0x0008;
    L_0x0002:
        r0.close();	 Catch:{ RuntimeException -> 0x0006, Exception -> 0x0008 }
        return;
    L_0x0006:
        r0 = move-exception;
        throw r0;
    L_0x0008:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.a(java.io.Closeable):void");
    }

    public static void a(java.lang.Throwable r3, java.lang.Throwable r4) {
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
        r0 = r;
        if (r0 == 0) goto L_0x000d;
    L_0x0004:
        r1 = 1;
        r1 = new java.lang.Object[r1];	 Catch:{ InvocationTargetException -> 0x000d, InvocationTargetException -> 0x000d }
        r2 = 0;	 Catch:{ InvocationTargetException -> 0x000d, InvocationTargetException -> 0x000d }
        r1[r2] = r4;	 Catch:{ InvocationTargetException -> 0x000d, InvocationTargetException -> 0x000d }
        r0.invoke(r3, r1);	 Catch:{ InvocationTargetException -> 0x000d, InvocationTargetException -> 0x000d }
    L_0x000d:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.a(java.lang.Throwable, java.lang.Throwable):void");
    }

    public static void a(java.net.Socket r1) {
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
        if (r1 == 0) goto L_0x0011;
    L_0x0002:
        r1.close();	 Catch:{ AssertionError -> 0x0008, RuntimeException -> 0x0006, Exception -> 0x0011 }
        return;
    L_0x0006:
        r1 = move-exception;
        throw r1;
    L_0x0008:
        r1 = move-exception;
        r0 = defpackage.bdb.a(r1);
        if (r0 == 0) goto L_0x0010;
    L_0x000f:
        return;
    L_0x0010:
        throw r1;
    L_0x0011:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.a(java.net.Socket):void");
    }

    public static boolean a(defpackage.bhz r11, int r12, java.util.concurrent.TimeUnit r13) {
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
        r0 = java.lang.System.nanoTime();
        r2 = r11.a();
        r2 = r2.g_();
        r3 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
        if (r2 == 0) goto L_0x001d;
    L_0x0013:
        r2 = r11.a();
        r5 = r2.d();
        r5 = r5 - r0;
        goto L_0x001e;
    L_0x001d:
        r5 = r3;
    L_0x001e:
        r2 = r11.a();
        r7 = (long) r12;
        r12 = r13.toNanos(r7);
        r12 = java.lang.Math.min(r5, r12);
        r12 = r12 + r0;
        r2.a(r12);
        r12 = new bhd;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r12.<init>();	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
    L_0x0034:
        r7 = 8192; // 0x2000 float:1.14794E-41 double:4.0474E-320;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r7 = r11.a(r12, r7);	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r9 = -1;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        r13 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1));	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        if (r13 == 0) goto L_0x0044;	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
    L_0x0040:
        r12.s();	 Catch:{ InterruptedIOException -> 0x0070, all -> 0x005a }
        goto L_0x0034;
    L_0x0044:
        r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r12 != 0) goto L_0x0050;
    L_0x0048:
        r11 = r11.a();
        r11.f();
        goto L_0x0058;
    L_0x0050:
        r11 = r11.a();
        r0 = r0 + r5;
        r11.a(r0);
    L_0x0058:
        r11 = 1;
        return r11;
    L_0x005a:
        r12 = move-exception;
        r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r13 != 0) goto L_0x0067;
    L_0x005f:
        r11 = r11.a();
        r11.f();
        goto L_0x006f;
    L_0x0067:
        r11 = r11.a();
        r0 = r0 + r5;
        r11.a(r0);
    L_0x006f:
        throw r12;
    L_0x0070:
        r12 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1));
        if (r12 != 0) goto L_0x007c;
    L_0x0074:
        r11 = r11.a();
        r11.f();
        goto L_0x0084;
    L_0x007c:
        r11 = r11.a();
        r0 = r0 + r5;
        r11.a(r0);
    L_0x0084:
        r11 = 0;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.a(bhz, int, java.util.concurrent.TimeUnit):boolean");
    }

    public static boolean a(defpackage.bhz r1, java.util.concurrent.TimeUnit r2) {
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
        r0 = 100;
        r1 = defpackage.bdb.a(r1, r0, r2);	 Catch:{ IOException -> 0x0007 }
        return r1;
    L_0x0007:
        r1 = 0;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.a(bhz, java.util.concurrent.TimeUnit):boolean");
    }

    public static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    public static String[] a(Comparator<? super String> comparator, String[] strArr, String[] strArr2) {
        List arrayList = new ArrayList();
        for (Object obj : strArr) {
            for (Object compare : strArr2) {
                if (comparator.compare(obj, compare) == 0) {
                    arrayList.add(obj);
                    break;
                }
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static String[] a(String[] strArr, String str) {
        Object obj = new String[(strArr.length + 1)];
        System.arraycopy(strArr, 0, obj, 0, strArr.length);
        obj[obj.length - 1] = str;
        return obj;
    }

    public static int b(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt > '\u001f') {
                if (charAt < '\u007f') {
                    i++;
                }
            }
            return i;
        }
        return -1;
    }

    public static int b(String str, int i, int i2) {
        i2--;
        while (i2 >= i) {
            switch (str.charAt(i2)) {
                case R.styleable.FancyButtonsAttrs_fb_disabledTextColor /*9*/:
                case R.styleable.FancyButtonsAttrs_fb_focusColor /*10*/:
                case R.styleable.FancyButtonsAttrs_fb_fontIconSize /*12*/:
                case R.styleable.FancyButtonsAttrs_fb_ghost /*13*/:
                case R.styleable.FancyButtonsAttrs_fb_textPosition /*32*/:
                    i2--;
                default:
                    return i2 + 1;
            }
        }
        return i;
    }

    public static boolean b(Comparator<String> comparator, String[] strArr, String[] strArr2) {
        if (!(strArr == null || strArr2 == null || strArr.length == 0)) {
            if (strArr2.length != 0) {
                for (Object obj : strArr) {
                    for (Object compare : strArr2) {
                        if (comparator.compare(obj, compare) == 0) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static String c(String str, int i, int i2) {
        i = bdb.a(str, i, i2);
        return str.substring(i, bdb.b(str, i, i2));
    }

    public static boolean c(String str) {
        return s.matcher(str).matches();
    }

    @javax.annotation.Nullable
    private static java.net.InetAddress d(java.lang.String r16, int r17, int r18) {
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
        r0 = r16;
        r1 = r18;
        r2 = 16;
        r3 = new byte[r2];
        r4 = -1;
        r5 = 0;
        r6 = r17;
        r7 = 0;
        r8 = -1;
        r9 = -1;
    L_0x000f:
        r10 = 0;
        if (r6 >= r1) goto L_0x00d4;
    L_0x0012:
        if (r7 != r2) goto L_0x0015;
    L_0x0014:
        return r10;
    L_0x0015:
        r11 = r6 + 2;
        r12 = 255; // 0xff float:3.57E-43 double:1.26E-321;
        r13 = 4;
        if (r11 > r1) goto L_0x0033;
    L_0x001c:
        r14 = "::";
        r15 = 2;
        r14 = r0.regionMatches(r6, r14, r5, r15);
        if (r14 == 0) goto L_0x0033;
    L_0x0025:
        if (r8 == r4) goto L_0x0028;
    L_0x0027:
        return r10;
    L_0x0028:
        r7 = r7 + 2;
        if (r11 != r1) goto L_0x002f;
    L_0x002c:
        r8 = r7;
        goto L_0x00d4;
    L_0x002f:
        r8 = r7;
        r9 = r11;
        goto L_0x00a2;
    L_0x0033:
        if (r7 == 0) goto L_0x00a1;
    L_0x0035:
        r11 = ":";
        r14 = 1;
        r11 = r0.regionMatches(r6, r11, r5, r14);
        if (r11 == 0) goto L_0x0042;
    L_0x003e:
        r6 = r6 + 1;
        goto L_0x00a1;
    L_0x0042:
        r11 = ".";
        r6 = r0.regionMatches(r6, r11, r5, r14);
        if (r6 == 0) goto L_0x00a0;
    L_0x004a:
        r6 = r7 + -2;
        r11 = r6;
    L_0x004d:
        if (r9 >= r1) goto L_0x0094;
    L_0x004f:
        if (r11 != r2) goto L_0x0052;
    L_0x0051:
        goto L_0x009a;
    L_0x0052:
        if (r11 == r6) goto L_0x005f;
    L_0x0054:
        r15 = r0.charAt(r9);
        r14 = 46;
        if (r15 == r14) goto L_0x005d;
    L_0x005c:
        goto L_0x009a;
    L_0x005d:
        r9 = r9 + 1;
    L_0x005f:
        r14 = r9;
        r15 = 0;
    L_0x0061:
        if (r14 >= r1) goto L_0x0082;
    L_0x0063:
        r5 = r0.charAt(r14);
        r2 = 48;
        if (r5 < r2) goto L_0x0082;
    L_0x006b:
        r4 = 57;
        if (r5 > r4) goto L_0x0082;
    L_0x006f:
        if (r15 != 0) goto L_0x0074;
    L_0x0071:
        if (r9 == r14) goto L_0x0074;
    L_0x0073:
        goto L_0x0097;
    L_0x0074:
        r15 = r15 * 10;
        r15 = r15 + r5;
        r15 = r15 - r2;
        if (r15 <= r12) goto L_0x007b;
    L_0x007a:
        goto L_0x0097;
    L_0x007b:
        r14 = r14 + 1;
        r2 = 16;
        r4 = -1;
        r5 = 0;
        goto L_0x0061;
    L_0x0082:
        r2 = r14 - r9;
        if (r2 != 0) goto L_0x0087;
    L_0x0086:
        goto L_0x0097;
    L_0x0087:
        r2 = r11 + 1;
        r4 = (byte) r15;
        r3[r11] = r4;
        r11 = r2;
        r9 = r14;
        r2 = 16;
        r4 = -1;
        r5 = 0;
        r14 = 1;
        goto L_0x004d;
    L_0x0094:
        r6 = r6 + r13;
        if (r11 == r6) goto L_0x0099;
    L_0x0097:
        r5 = 0;
        goto L_0x009a;
    L_0x0099:
        r5 = 1;
    L_0x009a:
        if (r5 != 0) goto L_0x009d;
    L_0x009c:
        return r10;
    L_0x009d:
        r7 = r7 + 2;
        goto L_0x00d4;
    L_0x00a0:
        return r10;
    L_0x00a1:
        r9 = r6;
    L_0x00a2:
        r6 = r9;
        r2 = 0;
    L_0x00a4:
        if (r6 >= r1) goto L_0x00b7;
    L_0x00a6:
        r4 = r0.charAt(r6);
        r4 = defpackage.bdb.a(r4);
        r5 = -1;
        if (r4 == r5) goto L_0x00b7;
    L_0x00b1:
        r2 = r2 << 4;
        r2 = r2 + r4;
        r6 = r6 + 1;
        goto L_0x00a4;
    L_0x00b7:
        r4 = r6 - r9;
        if (r4 == 0) goto L_0x00d3;
    L_0x00bb:
        if (r4 <= r13) goto L_0x00be;
    L_0x00bd:
        goto L_0x00d3;
    L_0x00be:
        r4 = r7 + 1;
        r5 = r2 >>> 8;
        r5 = r5 & r12;
        r5 = (byte) r5;
        r3[r7] = r5;
        r7 = r4 + 1;
        r2 = r2 & 255;
        r2 = (byte) r2;
        r3[r4] = r2;
        r2 = 16;
        r4 = -1;
        r5 = 0;
        goto L_0x000f;
    L_0x00d3:
        return r10;
    L_0x00d4:
        r0 = 16;
        if (r7 == r0) goto L_0x00ea;
    L_0x00d8:
        r1 = -1;
        if (r8 != r1) goto L_0x00dc;
    L_0x00db:
        return r10;
    L_0x00dc:
        r1 = r7 - r8;
        r2 = 16 - r1;
        java.lang.System.arraycopy(r3, r8, r3, r2, r1);
        r2 = 16 - r7;
        r2 = r2 + r8;
        r0 = 0;
        java.util.Arrays.fill(r3, r8, r2, r0);
    L_0x00ea:
        r0 = java.net.InetAddress.getByAddress(r3);	 Catch:{ UnknownHostException -> 0x00ef }
        return r0;
    L_0x00ef:
        r0 = new java.lang.AssertionError;
        r0.<init>();
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bdb.d(java.lang.String, int, int):java.net.InetAddress");
    }

    private static boolean d(String str) {
        int i = 0;
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt > '\u001f') {
                if (charAt < '\u007f') {
                    if (" #%/:?@[\\]".indexOf(charAt) != -1) {
                        return true;
                    }
                    i++;
                }
            }
            return true;
        }
        return false;
    }
}
