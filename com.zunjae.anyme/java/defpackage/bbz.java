package defpackage;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class bbz {
    private static final char[] d = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    final String b;
    final int c;
    private final String e;
    private final String f;
    private final List<String> g;
    @Nullable
    private final List<String> h;
    @Nullable
    private final String i;
    private final String j;

    bbz(bca bca) {
        this.a = bca.a;
        this.e = bbz.a(bca.b, false);
        this.f = bbz.a(bca.c, false);
        this.b = bca.d;
        this.c = bca.a();
        this.g = bbz.a(bca.f, false);
        List list = bca.g;
        String str = null;
        this.h = list != null ? bbz.a(list, true) : null;
        String str2 = bca.h;
        if (str2 != null) {
            str = bbz.a(str2, false);
        }
        this.i = str;
        this.j = bca.toString();
    }

    public static int a(String str) {
        return str.equals("http") ? 80 : str.equals("https") ? 443 : -1;
    }

    static String a(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3;
        String str3 = str;
        int i4 = i2;
        String str4 = str2;
        Charset charset2 = charset;
        int i5 = i;
        while (i5 < i4) {
            int codePointAt = str.codePointAt(i5);
            int i6 = 43;
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str4.indexOf(codePointAt) == -1 && (codePointAt != 37 || (z && (!z2 || bbz.a(str, i5, i4)))))) {
                if (codePointAt != 43 || !z3) {
                    i5 += Character.charCount(codePointAt);
                }
            }
            bhd bhd = new bhd();
            i3 = i;
            bhd.a(str, i, i5);
            bhd bhd2 = null;
            while (i5 < i4) {
                int codePointAt2 = str.codePointAt(i5);
                if (z) {
                    if (!(codePointAt2 == 9 || codePointAt2 == 10 || codePointAt2 == 12 || codePointAt2 == 13)) {
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 43;
                }
                if (codePointAt2 == i6 && z3) {
                    bhd.a(z ? "+" : "%2B");
                    i5 += Character.charCount(codePointAt2);
                    i6 = 43;
                } else {
                    if (codePointAt2 >= 32 && codePointAt2 != 127 && (codePointAt2 < 128 || !z4)) {
                        if (str4.indexOf(codePointAt2) == -1) {
                            if (codePointAt2 == 37) {
                                if (z) {
                                    if (z2 && !bbz.a(str, i5, i4)) {
                                    }
                                }
                            }
                            bhd.a(codePointAt2);
                            i5 += Character.charCount(codePointAt2);
                            i6 = 43;
                        }
                    }
                    if (bhd2 == null) {
                        bhd2 = new bhd();
                    }
                    if (charset2 != null) {
                        if (!charset2.equals(bdb.e)) {
                            bhd2.a(str, i5, Character.charCount(codePointAt2) + i5, charset2);
                            while (!bhd2.e()) {
                                i6 = bhd2.h() & 255;
                                bhd.b(37);
                                bhd.b(d[(i6 >> 4) & 15]);
                                bhd.b(d[i6 & 15]);
                            }
                            i5 += Character.charCount(codePointAt2);
                            i6 = 43;
                        }
                    }
                    bhd2.a(codePointAt2);
                    while (!bhd2.e()) {
                        i6 = bhd2.h() & 255;
                        bhd.b(37);
                        bhd.b(d[(i6 >> 4) & 15]);
                        bhd.b(d[i6 & 15]);
                    }
                    i5 += Character.charCount(codePointAt2);
                    i6 = 43;
                }
            }
            return bhd.o();
        }
        i3 = i;
        return str.substring(i, i2);
    }

    static String a(String str, int i, int i2, boolean z) {
        int i3 = i;
        while (i3 < i2) {
            char charAt = str.charAt(i3);
            if (charAt != '%') {
                if (charAt != '+' || !z) {
                    i3++;
                }
            }
            bhd bhd = new bhd();
            bhd.a(str, i, i3);
            bbz.a(bhd, str, i3, i2, z);
            return bhd.o();
        }
        return str.substring(i, i2);
    }

    static String a(String str, String str2, boolean z, Charset charset) {
        return bbz.a(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return bbz.a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    private static String a(String str, boolean z) {
        return bbz.a(str, 0, str.length(), z);
    }

    private static List<String> a(List<String> list, boolean z) {
        int size = list.size();
        List arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = (String) list.get(i);
            arrayList.add(str != null ? bbz.a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static void a(bhd bhd, String str, int i, int i2, boolean z) {
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37) {
                int i3 = i + 2;
                if (i3 < i2) {
                    int a = bdb.a(str.charAt(i + 1));
                    int a2 = bdb.a(str.charAt(i3));
                    if (!(a == -1 || a2 == -1)) {
                        bhd.b((a << 4) + a2);
                        i = i3;
                        i += Character.charCount(codePointAt);
                    }
                    bhd.a(codePointAt);
                    i += Character.charCount(codePointAt);
                }
            }
            if (codePointAt == 43 && z) {
                bhd.b(32);
                i += Character.charCount(codePointAt);
            }
            bhd.a(codePointAt);
            i += Character.charCount(codePointAt);
        }
    }

    static void a(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            stringBuilder.append('/');
            stringBuilder.append((String) list.get(i));
        }
    }

    private static boolean a(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && bdb.a(str.charAt(i + 1)) != -1 && bdb.a(str.charAt(i3)) != -1;
    }

    static List<String> b(String str) {
        List<String> arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            Object substring;
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 != -1) {
                if (indexOf2 <= indexOf) {
                    arrayList.add(str.substring(i, indexOf2));
                    substring = str.substring(indexOf2 + 1, indexOf);
                    arrayList.add(substring);
                    i = indexOf + 1;
                }
            }
            arrayList.add(str.substring(i, indexOf));
            substring = null;
            arrayList.add(substring);
            i = indexOf + 1;
        }
        return arrayList;
    }

    static void b(StringBuilder stringBuilder, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = (String) list.get(i);
            String str2 = (String) list.get(i + 1);
            if (i > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(str);
            if (str2 != null) {
                stringBuilder.append('=');
                stringBuilder.append(str2);
            }
        }
    }

    @javax.annotation.Nullable
    public static defpackage.bbz e(java.lang.String r0) {
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
        r0 = defpackage.bbz.f(r0);	 Catch:{ IllegalArgumentException -> 0x0005 }
        return r0;
    L_0x0005:
        r0 = 0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbz.e(java.lang.String):bbz");
    }

    public static bbz f(String str) {
        return new bca().a(null, str).b();
    }

    public final java.net.URI a() {
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
        r11 = this;
        r0 = new bca;
        r0.<init>();
        r1 = r11.a;
        r0.a = r1;
        r1 = r11.d();
        r0.b = r1;
        r1 = r11.e();
        r0.c = r1;
        r1 = r11.b;
        r0.d = r1;
        r1 = r11.c;
        r2 = r11.a;
        r2 = defpackage.bbz.a(r2);
        if (r1 == r2) goto L_0x0026;
    L_0x0023:
        r1 = r11.c;
        goto L_0x0027;
    L_0x0026:
        r1 = -1;
    L_0x0027:
        r0.e = r1;
        r1 = r0.f;
        r1.clear();
        r1 = r0.f;
        r2 = r11.i();
        r1.addAll(r2);
        r1 = r11.k();
        r0.b(r1);
        r1 = r11.i;
        if (r1 != 0) goto L_0x0044;
    L_0x0042:
        r1 = 0;
        goto L_0x0054;
    L_0x0044:
        r1 = r11.j;
        r2 = 35;
        r1 = r1.indexOf(r2);
        r1 = r1 + 1;
        r2 = r11.j;
        r1 = r2.substring(r1);
    L_0x0054:
        r0.h = r1;
        r1 = r0.f;
        r1 = r1.size();
        r2 = 0;
        r3 = 0;
    L_0x005e:
        if (r3 >= r1) goto L_0x007b;
    L_0x0060:
        r4 = r0.f;
        r4 = r4.get(r3);
        r5 = r4;
        r5 = (java.lang.String) r5;
        r4 = r0.f;
        r6 = "[]";
        r7 = 1;
        r8 = 1;
        r9 = 0;
        r10 = 1;
        r5 = defpackage.bbz.a(r5, r6, r7, r8, r9, r10);
        r4.set(r3, r5);
        r3 = r3 + 1;
        goto L_0x005e;
    L_0x007b:
        r1 = r0.g;
        if (r1 == 0) goto L_0x00a2;
    L_0x007f:
        r1 = r1.size();
    L_0x0083:
        if (r2 >= r1) goto L_0x00a2;
    L_0x0085:
        r3 = r0.g;
        r3 = r3.get(r2);
        r4 = r3;
        r4 = (java.lang.String) r4;
        if (r4 == 0) goto L_0x009f;
    L_0x0090:
        r3 = r0.g;
        r5 = "\\^`{|}";
        r6 = 1;
        r7 = 1;
        r8 = 1;
        r9 = 1;
        r4 = defpackage.bbz.a(r4, r5, r6, r7, r8, r9);
        r3.set(r2, r4);
    L_0x009f:
        r2 = r2 + 1;
        goto L_0x0083;
    L_0x00a2:
        r3 = r0.h;
        if (r3 == 0) goto L_0x00b2;
    L_0x00a6:
        r4 = " \"#<>\\^`{|}";
        r5 = 1;
        r6 = 1;
        r7 = 0;
        r8 = 0;
        r1 = defpackage.bbz.a(r3, r4, r5, r6, r7, r8);
        r0.h = r1;
    L_0x00b2:
        r0 = r0.toString();
        r1 = new java.net.URI;	 Catch:{ URISyntaxException -> 0x00bc }
        r1.<init>(r0);	 Catch:{ URISyntaxException -> 0x00bc }
        return r1;
    L_0x00bc:
        r1 = move-exception;
        r2 = "[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]";	 Catch:{ Exception -> 0x00ca }
        r3 = "";	 Catch:{ Exception -> 0x00ca }
        r0 = r0.replaceAll(r2, r3);	 Catch:{ Exception -> 0x00ca }
        r0 = java.net.URI.create(r0);	 Catch:{ Exception -> 0x00ca }
        return r0;
    L_0x00ca:
        r0 = new java.lang.RuntimeException;
        r0.<init>(r1);
        throw r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbz.a():java.net.URI");
    }

    public final String b() {
        return this.a;
    }

    @Nullable
    public final bbz c(String str) {
        bca d = d(str);
        return d != null ? d.b() : null;
    }

    public final boolean c() {
        return this.a.equals("https");
    }

    @javax.annotation.Nullable
    public final defpackage.bca d(java.lang.String r2) {
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
        r1 = this;
        r0 = new bca;	 Catch:{ IllegalArgumentException -> 0x000a }
        r0.<init>();	 Catch:{ IllegalArgumentException -> 0x000a }
        r2 = r0.a(r1, r2);	 Catch:{ IllegalArgumentException -> 0x000a }
        return r2;
    L_0x000a:
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbz.d(java.lang.String):bca");
    }

    public final String d() {
        if (this.e.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        int length = this.a.length() + 3;
        String str = this.j;
        return this.j.substring(length, bdb.a(str, length, str.length(), ":@"));
    }

    public final String e() {
        if (this.f.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        return this.j.substring(this.j.indexOf(58, this.a.length() + 3) + 1, this.j.indexOf(64));
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof bbz) && ((bbz) obj).j.equals(this.j);
    }

    public final String f() {
        return this.b;
    }

    public final int g() {
        return this.c;
    }

    public final String h() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        return this.j.substring(indexOf, bdb.a(str, indexOf, str.length(), "?#"));
    }

    public final int hashCode() {
        return this.j.hashCode();
    }

    public final List<String> i() {
        int indexOf = this.j.indexOf(47, this.a.length() + 3);
        String str = this.j;
        int a = bdb.a(str, indexOf, str.length(), "?#");
        List<String> arrayList = new ArrayList();
        while (indexOf < a) {
            indexOf++;
            int a2 = bdb.a(this.j, indexOf, a, '/');
            arrayList.add(this.j.substring(indexOf, a2));
            indexOf = a2;
        }
        return arrayList;
    }

    public final List<String> j() {
        return this.g;
    }

    @Nullable
    public final String k() {
        if (this.h == null) {
            return null;
        }
        int indexOf = this.j.indexOf(63) + 1;
        String str = this.j;
        return this.j.substring(indexOf, bdb.a(str, indexOf, str.length(), '#'));
    }

    @Nullable
    public final String l() {
        if (this.h == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        bbz.b(stringBuilder, this.h);
        return stringBuilder.toString();
    }

    public final String toString() {
        return this.j;
    }
}
