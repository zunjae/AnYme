package defpackage;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import me.zhanghai.android.materialprogressbar.R;

public final class bca {
    @Nullable
    String a;
    String b = BuildConfig.FLAVOR;
    String c = BuildConfig.FLAVOR;
    @Nullable
    String d;
    int e = -1;
    final List<String> f = new ArrayList();
    @Nullable
    List<String> g;
    @Nullable
    String h;

    public bca() {
        this.f.add(BuildConfig.FLAVOR);
    }

    private void a(java.lang.String r13, int r14, int r15) {
        /* JADX: method processing error */
/*
Error: jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:42)
	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:66)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:33)
	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:17)
	at jadx.core.ProcessClass.process(ProcessClass.java:37)
	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:59)
	at jadx.core.ProcessClass.process(ProcessClass.java:42)
	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:286)
	at jadx.api.JavaClass.decompile(JavaClass.java:62)
	at jadx.api.JadxDecompiler$1.run(JadxDecompiler.java:173)
*/
        /*
        r12 = this;
        if (r14 != r15) goto L_0x0003;
    L_0x0002:
        return;
    L_0x0003:
        r0 = r13.charAt(r14);
        r1 = 47;
        r2 = 1;
        if (r0 == r1) goto L_0x001e;
    L_0x000c:
        r1 = 92;
        if (r0 != r1) goto L_0x0011;
    L_0x0010:
        goto L_0x001e;
    L_0x0011:
        r0 = r12.f;
        r1 = r0.size();
        r1 = r1 - r2;
        r3 = "";
        r0.set(r1, r3);
        goto L_0x002c;
    L_0x001e:
        r0 = r12.f;
        r0.clear();
        r0 = r12.f;
        r1 = "";
        r0.add(r1);
    L_0x002a:
        r14 = r14 + 1;
    L_0x002c:
        r4 = r14;
        if (r4 >= r15) goto L_0x00db;
    L_0x002f:
        r14 = "/\\";
        r14 = defpackage.bdb.a(r13, r4, r15, r14);
        r0 = 0;
        if (r14 >= r15) goto L_0x003a;
    L_0x0038:
        r1 = 1;
        goto L_0x003b;
    L_0x003a:
        r1 = 0;
    L_0x003b:
        r6 = " \"<>^`{}|/\\?#";
        r7 = 1;
        r8 = 0;
        r9 = 0;
        r10 = 1;
        r11 = 0;
        r3 = r13;
        r5 = r14;
        r3 = defpackage.bbz.a(r3, r4, r5, r6, r7, r8, r9, r10, r11);
        r4 = ".";
        r4 = r3.equals(r4);
        if (r4 != 0) goto L_0x005b;
    L_0x0050:
        r4 = "%2e";
        r4 = r3.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x0059;
    L_0x0058:
        goto L_0x005b;
    L_0x0059:
        r4 = 0;
        goto L_0x005c;
    L_0x005b:
        r4 = 1;
    L_0x005c:
        if (r4 != 0) goto L_0x00d7;
    L_0x005e:
        r4 = "..";
        r4 = r3.equals(r4);
        if (r4 != 0) goto L_0x007e;
    L_0x0066:
        r4 = "%2e.";
        r4 = r3.equalsIgnoreCase(r4);
        if (r4 != 0) goto L_0x007e;
    L_0x006e:
        r4 = ".%2e";
        r4 = r3.equalsIgnoreCase(r4);
        if (r4 != 0) goto L_0x007e;
    L_0x0076:
        r4 = "%2e%2e";
        r4 = r3.equalsIgnoreCase(r4);
        if (r4 == 0) goto L_0x007f;
    L_0x007e:
        r0 = 1;
    L_0x007f:
        if (r0 == 0) goto L_0x00b1;
    L_0x0081:
        r0 = r12.f;
        r3 = r0.size();
        r3 = r3 - r2;
        r0 = r0.remove(r3);
        r0 = (java.lang.String) r0;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00a9;
    L_0x0094:
        r0 = r12.f;
        r0 = r0.isEmpty();
        if (r0 != 0) goto L_0x00a9;
    L_0x009c:
        r0 = r12.f;
        r3 = r0.size();
        r3 = r3 - r2;
        r4 = "";
        r0.set(r3, r4);
        goto L_0x00d7;
    L_0x00a9:
        r0 = r12.f;
        r3 = "";
        r0.add(r3);
        goto L_0x00d7;
    L_0x00b1:
        r0 = r12.f;
        r4 = r0.size();
        r4 = r4 - r2;
        r0 = r0.get(r4);
        r0 = (java.lang.String) r0;
        r0 = r0.isEmpty();
        if (r0 == 0) goto L_0x00cf;
    L_0x00c4:
        r0 = r12.f;
        r4 = r0.size();
        r4 = r4 - r2;
        r0.set(r4, r3);
        goto L_0x00d4;
    L_0x00cf:
        r0 = r12.f;
        r0.add(r3);
    L_0x00d4:
        if (r1 == 0) goto L_0x00d7;
    L_0x00d6:
        goto L_0x00a9;
    L_0x00d7:
        if (r1 == 0) goto L_0x002c;
    L_0x00d9:
        goto L_0x002a;
    L_0x00db:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bca.a(java.lang.String, int, int):void");
    }

    private static int b(String str, int i, int i2) {
        int i3 = 0;
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt != '\\' && charAt != '/') {
                break;
            }
            i3++;
            i++;
        }
        return i3;
    }

    private static int c(String str, int i, int i2) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt == ':') {
                return i;
            }
            if (charAt == '[') {
                do {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                } while (str.charAt(i) != ']');
            }
            i++;
        }
        return i2;
    }

    private static String d(String str, int i, int i2) {
        return bdb.a(bbz.a(str, i, i2, false));
    }

    private static int e(java.lang.String r10, int r11, int r12) {
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
        r0 = -1;
        r4 = "";	 Catch:{ NumberFormatException -> 0x001b }
        r5 = 0;	 Catch:{ NumberFormatException -> 0x001b }
        r6 = 0;	 Catch:{ NumberFormatException -> 0x001b }
        r7 = 0;	 Catch:{ NumberFormatException -> 0x001b }
        r8 = 1;	 Catch:{ NumberFormatException -> 0x001b }
        r9 = 0;	 Catch:{ NumberFormatException -> 0x001b }
        r1 = r10;	 Catch:{ NumberFormatException -> 0x001b }
        r2 = r11;	 Catch:{ NumberFormatException -> 0x001b }
        r3 = r12;	 Catch:{ NumberFormatException -> 0x001b }
        r10 = defpackage.bbz.a(r1, r2, r3, r4, r5, r6, r7, r8, r9);	 Catch:{ NumberFormatException -> 0x001b }
        r10 = java.lang.Integer.parseInt(r10);	 Catch:{ NumberFormatException -> 0x001b }
        if (r10 <= 0) goto L_0x001b;
    L_0x0015:
        r11 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r10 > r11) goto L_0x001b;
    L_0x001a:
        return r10;
    L_0x001b:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bca.e(java.lang.String, int, int):int");
    }

    final int a() {
        int i = this.e;
        return i != -1 ? i : bbz.a(this.a);
    }

    final bca a(@Nullable bbz bbz, String str) {
        int i;
        int i2;
        StringBuilder stringBuilder;
        char c;
        int a;
        int a2;
        Object obj;
        Object obj2;
        char charAt;
        String a3;
        int i3;
        bca bca = this;
        bbz bbz2 = bbz;
        String str2 = str;
        int a4 = bdb.a(str2, 0, str.length());
        int b = bdb.b(str2, a4, str.length());
        char c2 = ':';
        if (b - a4 >= 2) {
            char charAt2 = str2.charAt(a4);
            if (charAt2 < 'a' || charAt2 > 'z') {
                if (charAt2 >= 'A') {
                    if (charAt2 > 'Z') {
                    }
                }
            }
            i = a4 + 1;
            while (i < b) {
                char charAt3 = str2.charAt(i);
                if ((charAt3 >= 'a' && charAt3 <= 'z') || ((charAt3 >= 'A' && charAt3 <= 'Z') || ((charAt3 >= '0' && charAt3 <= '9') || charAt3 == '+' || charAt3 == '-' || charAt3 == '.'))) {
                    i++;
                } else if (charAt3 == ':') {
                    i2 = i;
                    if (i2 != -1) {
                        if (str.regionMatches(true, a4, "https:", 0, 6)) {
                            if (str.regionMatches(true, a4, "http:", 0, 5)) {
                                stringBuilder = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                                stringBuilder.append(str2.substring(0, i2));
                                stringBuilder.append("'");
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                            bca.a = "http";
                            a4 += 5;
                        } else {
                            bca.a = "https";
                            a4 += 6;
                        }
                    } else if (bbz2 == null) {
                        bca.a = bbz2.a;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
                    }
                    i = bca.b(str2, a4, b);
                    c = '#';
                    if (i < 2 && bbz2 != null) {
                        if (!bbz2.a.equals(bca.a)) {
                            bca.b = bbz.d();
                            bca.c = bbz.e();
                            bca.d = bbz2.b;
                            bca.e = bbz2.c;
                            bca.f.clear();
                            bca.f.addAll(bbz.i());
                            if (a4 == b || str2.charAt(a4) == '#') {
                                b(bbz.k());
                            }
                            i2 = a4;
                            a = bdb.a(str2, i2, b, "?#");
                            a(str2, i2, a);
                            if (a < b && str2.charAt(a) == '?') {
                                a2 = bdb.a(str2, a, b, '#');
                                bca.g = bbz.b(bbz.a(str, a + 1, a2, " \"'<>#", true, false, true, true, null));
                                a = a2;
                            }
                            if (a < b && str2.charAt(a) == '#') {
                                bca.h = bbz.a(str, a + 1, b, BuildConfig.FLAVOR, true, false, false, false, null);
                            }
                            return bca;
                        }
                    }
                    i = a4 + i;
                    obj = null;
                    obj2 = null;
                    while (true) {
                        a4 = bdb.a(str2, i, b, "@/\\?#");
                        charAt = a4 == b ? str2.charAt(a4) : '\uffff';
                        if (!(charAt == '\uffff' || charAt == r15 || charAt == '/' || charAt == '\\')) {
                            switch (charAt) {
                                case R.styleable.AppCompatTheme_dropDownListViewStyle /*63*/:
                                    break;
                                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*64*/:
                                    if (obj != null) {
                                        int a5 = bdb.a(str2, i, a4, c2);
                                        a2 = a5;
                                        i2 = a4;
                                        a3 = bbz.a(str, i, a5, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                        if (obj2 != null) {
                                            stringBuilder = new StringBuilder();
                                            stringBuilder.append(bca.b);
                                            stringBuilder.append("%40");
                                            stringBuilder.append(a3);
                                            a3 = stringBuilder.toString();
                                        }
                                        bca.b = a3;
                                        if (a2 != i2) {
                                            bca.c = bbz.a(str, a2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                            obj = 1;
                                        }
                                        obj2 = 1;
                                    } else {
                                        i2 = a4;
                                        StringBuilder stringBuilder2 = new StringBuilder();
                                        stringBuilder2.append(bca.c);
                                        stringBuilder2.append("%40");
                                        stringBuilder2.append(bbz.a(str, i, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                        bca.c = stringBuilder2.toString();
                                    }
                                    i = i2 + 1;
                                    c2 = ':';
                                    c = '#';
                                    continue;
                                    continue;
                                default:
                                    continue;
                                    continue;
                            }
                        }
                        i2 = a4;
                        a = bca.c(str2, i, i2);
                        i3 = a + 1;
                        if (i3 >= i2) {
                            bca.d = bca.d(str2, i, a);
                            bca.e = bca.e(str2, i3, i2);
                            if (bca.e != -1) {
                                stringBuilder = new StringBuilder("Invalid URL port: \"");
                                stringBuilder.append(str2.substring(i3, i2));
                                stringBuilder.append('\"');
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        } else {
                            bca.d = bca.d(str2, i, a);
                            bca.e = bbz.a(bca.a);
                        }
                        if (bca.d == null) {
                            StringBuilder stringBuilder3 = new StringBuilder("Invalid URL host: \"");
                            stringBuilder3.append(str2.substring(i, a));
                            stringBuilder3.append('\"');
                            throw new IllegalArgumentException(stringBuilder3.toString());
                        }
                        a = bdb.a(str2, i2, b, "?#");
                        a(str2, i2, a);
                        a2 = bdb.a(str2, a, b, '#');
                        bca.g = bbz.b(bbz.a(str, a + 1, a2, " \"'<>#", true, false, true, true, null));
                        a = a2;
                        bca.h = bbz.a(str, a + 1, b, BuildConfig.FLAVOR, true, false, false, false, null);
                        return bca;
                    }
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            if (str.regionMatches(true, a4, "https:", 0, 6)) {
                if (str.regionMatches(true, a4, "http:", 0, 5)) {
                    stringBuilder = new StringBuilder("Expected URL scheme 'http' or 'https' but was '");
                    stringBuilder.append(str2.substring(0, i2));
                    stringBuilder.append("'");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                bca.a = "http";
                a4 += 5;
            } else {
                bca.a = "https";
                a4 += 6;
            }
        } else if (bbz2 == null) {
            throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
        } else {
            bca.a = bbz2.a;
        }
        i = bca.b(str2, a4, b);
        c = '#';
        if (!bbz2.a.equals(bca.a)) {
            bca.b = bbz.d();
            bca.c = bbz.e();
            bca.d = bbz2.b;
            bca.e = bbz2.c;
            bca.f.clear();
            bca.f.addAll(bbz.i());
            b(bbz.k());
            i2 = a4;
            a = bdb.a(str2, i2, b, "?#");
            a(str2, i2, a);
            a2 = bdb.a(str2, a, b, '#');
            bca.g = bbz.b(bbz.a(str, a + 1, a2, " \"'<>#", true, false, true, true, null));
            a = a2;
            bca.h = bbz.a(str, a + 1, b, BuildConfig.FLAVOR, true, false, false, false, null);
            return bca;
        }
        i = a4 + i;
        obj = null;
        obj2 = null;
        while (true) {
            a4 = bdb.a(str2, i, b, "@/\\?#");
            if (a4 == b) {
            }
            switch (charAt) {
                case R.styleable.AppCompatTheme_dropDownListViewStyle /*63*/:
                    break;
                case R.styleable.AppCompatTheme_dropdownListPreferredItemHeight /*64*/:
                    if (obj != null) {
                        i2 = a4;
                        StringBuilder stringBuilder22 = new StringBuilder();
                        stringBuilder22.append(bca.c);
                        stringBuilder22.append("%40");
                        stringBuilder22.append(bbz.a(str, i, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                        bca.c = stringBuilder22.toString();
                    } else {
                        int a52 = bdb.a(str2, i, a4, c2);
                        a2 = a52;
                        i2 = a4;
                        a3 = bbz.a(str, i, a52, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        if (obj2 != null) {
                            stringBuilder = new StringBuilder();
                            stringBuilder.append(bca.b);
                            stringBuilder.append("%40");
                            stringBuilder.append(a3);
                            a3 = stringBuilder.toString();
                        }
                        bca.b = a3;
                        if (a2 != i2) {
                            bca.c = bbz.a(str, a2 + 1, i2, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            obj = 1;
                        }
                        obj2 = 1;
                    }
                    i = i2 + 1;
                    c2 = ':';
                    c = '#';
                    continue;
                    continue;
                default:
                    continue;
                    continue;
            }
            i2 = a4;
            a = bca.c(str2, i, i2);
            i3 = a + 1;
            if (i3 >= i2) {
                bca.d = bca.d(str2, i, a);
                bca.e = bbz.a(bca.a);
            } else {
                bca.d = bca.d(str2, i, a);
                bca.e = bca.e(str2, i3, i2);
                if (bca.e != -1) {
                    stringBuilder = new StringBuilder("Invalid URL port: \"");
                    stringBuilder.append(str2.substring(i3, i2));
                    stringBuilder.append('\"');
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            if (bca.d == null) {
                StringBuilder stringBuilder32 = new StringBuilder("Invalid URL host: \"");
                stringBuilder32.append(str2.substring(i, a));
                stringBuilder32.append('\"');
                throw new IllegalArgumentException(stringBuilder32.toString());
            }
            a = bdb.a(str2, i2, b, "?#");
            a(str2, i2, a);
            a2 = bdb.a(str2, a, b, '#');
            bca.g = bbz.b(bbz.a(str, a + 1, a2, " \"'<>#", true, false, true, true, null));
            a = a2;
            bca.h = bbz.a(str, a + 1, b, BuildConfig.FLAVOR, true, false, false, false, null);
            return bca;
        }
    }

    public final bca a(String str) {
        if (str != null) {
            String d = bca.d(str, 0, str.length());
            if (d != null) {
                this.d = d;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
        }
        throw new NullPointerException("host == null");
    }

    public final bca a(String str, @Nullable String str2) {
        if (str != null) {
            Object a;
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(bbz.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            List list = this.g;
            if (str2 != null) {
                a = bbz.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true);
            } else {
                a = null;
            }
            list.add(a);
            return this;
        }
        throw new NullPointerException("name == null");
    }

    public final bbz b() {
        if (this.a == null) {
            throw new IllegalStateException("scheme == null");
        } else if (this.d != null) {
            return new bbz(this);
        } else {
            throw new IllegalStateException("host == null");
        }
    }

    public final bca b(@Nullable String str) {
        List b;
        if (str != null) {
            b = bbz.b(bbz.a(str, " \"'<>#", true, false, true, true));
        } else {
            b = null;
        }
        this.g = b;
        return this;
    }

    public final bca b(String str, @Nullable String str2) {
        if (str != null) {
            Object a;
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(bbz.a(str, " \"'<>#&=", true, false, true, true));
            List list = this.g;
            if (str2 != null) {
                a = bbz.a(str2, " \"'<>#&=", true, false, true, true);
            } else {
                a = null;
            }
            list.add(a);
            return this;
        }
        throw new NullPointerException("encodedName == null");
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("://");
        if (!(this.b.isEmpty() && this.c.isEmpty())) {
            stringBuilder.append(this.b);
            if (!this.c.isEmpty()) {
                stringBuilder.append(':');
                stringBuilder.append(this.c);
            }
            stringBuilder.append('@');
        }
        if (this.d.indexOf(58) != -1) {
            stringBuilder.append('[');
            stringBuilder.append(this.d);
            stringBuilder.append(']');
        } else {
            stringBuilder.append(this.d);
        }
        int a = a();
        if (a != bbz.a(this.a)) {
            stringBuilder.append(':');
            stringBuilder.append(a);
        }
        bbz.a(stringBuilder, this.f);
        if (this.g != null) {
            stringBuilder.append('?');
            bbz.b(stringBuilder, this.g);
        }
        if (this.h != null) {
            stringBuilder.append('#');
            stringBuilder.append(this.h);
        }
        return stringBuilder.toString();
    }
}
