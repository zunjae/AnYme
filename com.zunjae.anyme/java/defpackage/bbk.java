package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import javax.annotation.Nullable;

public final class bbk {
    private static final Pattern a = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private bbk(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            int i3;
            char charAt = str.charAt(i);
            if ((charAt >= ' ' || charAt == '\t') && charAt < '\u007f' && ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'z') && (charAt < 'A' || charAt > 'Z')))) {
                if (charAt != ':') {
                    i3 = 0;
                    if (i3 == (z ^ 1)) {
                        return i;
                    }
                    i++;
                }
            }
            i3 = 1;
            if (i3 == (z ^ 1)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            return parseLong <= 0 ? Long.MIN_VALUE : parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith("-") ? Long.MIN_VALUE : Long.MAX_VALUE;
            } else {
                throw e;
            }
        }
    }

    @javax.annotation.Nullable
    private static defpackage.bbk a(long r30, defpackage.bbz r32, java.lang.String r33) {
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
        r2 = r33;
        r3 = r33.length();
        r4 = 59;
        r5 = 0;
        r6 = defpackage.bdb.a(r2, r5, r3, r4);
        r7 = 61;
        r8 = defpackage.bdb.a(r2, r5, r6, r7);
        r9 = 0;
        if (r8 != r6) goto L_0x0017;
    L_0x0016:
        return r9;
    L_0x0017:
        r11 = defpackage.bdb.c(r2, r5, r8);
        r10 = r11.isEmpty();
        if (r10 != 0) goto L_0x0302;
    L_0x0021:
        r10 = defpackage.bdb.b(r11);
        r12 = -1;
        if (r10 == r12) goto L_0x002a;
    L_0x0028:
        goto L_0x0302;
    L_0x002a:
        r10 = 1;
        r8 = r8 + r10;
        r8 = defpackage.bdb.c(r2, r8, r6);
        r13 = defpackage.bdb.b(r8);
        if (r13 == r12) goto L_0x0037;
    L_0x0036:
        return r9;
    L_0x0037:
        r6 = r6 + r10;
        r21 = r9;
        r17 = -1;
        r19 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r22 = 0;
        r23 = 0;
        r24 = 1;
        r25 = 0;
    L_0x0049:
        if (r6 >= r3) goto L_0x0240;
    L_0x004b:
        r15 = defpackage.bdb.a(r2, r6, r3, r4);
        r13 = defpackage.bdb.a(r2, r6, r15, r7);
        r6 = defpackage.bdb.c(r2, r6, r13);
        if (r13 >= r15) goto L_0x0060;
    L_0x0059:
        r13 = r13 + 1;
        r13 = defpackage.bdb.c(r2, r13, r15);
        goto L_0x0062;
    L_0x0060:
        r13 = "";
    L_0x0062:
        r14 = "expires";
        r14 = r6.equalsIgnoreCase(r14);
        if (r14 == 0) goto L_0x01cd;
    L_0x006a:
        r6 = r13.length();	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = defpackage.bbk.a(r13, r5, r6, r5);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r7 = d;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r7 = r7.matcher(r13);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r4 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r5 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r26 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r27 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r28 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r29 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0082:
        if (r14 >= r6) goto L_0x0130;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0084:
        r12 = r14 + 1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r12 = defpackage.bbk.a(r13, r12, r6, r10);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r7.region(r14, r12);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r5 != r14) goto L_0x00c0;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0090:
        r14 = d;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = r7.usePattern(r14);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = r14.matches();	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r14 == 0) goto L_0x00bc;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x009c:
        r5 = r7.group(r10);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r5 = java.lang.Integer.parseInt(r5);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = 2;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = r7.group(r14);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = java.lang.Integer.parseInt(r14);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r10 = 3;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r10 = r7.group(r10);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r10 = java.lang.Integer.parseInt(r10);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r29 = r10;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r28 = r14;	 Catch:{ IllegalArgumentException -> 0x01ca }
        goto L_0x0124;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00bc:
        r10 = r27;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        goto L_0x00c2;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00c0:
        r10 = r27;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00c2:
        if (r10 != r14) goto L_0x00dc;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00c4:
        r14 = c;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = r7.usePattern(r14);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = r14.matches();	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r14 == 0) goto L_0x00dc;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00d0:
        r14 = 1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r10 = r7.group(r14);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r10 = java.lang.Integer.parseInt(r10);	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00d9:
        r27 = r10;	 Catch:{ IllegalArgumentException -> 0x01ca }
        goto L_0x0124;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00dc:
        r14 = r26;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r14 != r2) goto L_0x0108;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00e1:
        r2 = b;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r7.usePattern(r2);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r2.matches();	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r2 == 0) goto L_0x0107;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x00ed:
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = r7.group(r2);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = java.util.Locale.US;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r14.toLowerCase(r2);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = b;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = r14.pattern();	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r14.indexOf(r2);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r2 / 4;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r26 = r2;	 Catch:{ IllegalArgumentException -> 0x01ca }
        goto L_0x00d9;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0107:
        r2 = -1;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0108:
        if (r4 != r2) goto L_0x0120;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x010a:
        r2 = a;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r7.usePattern(r2);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r2.matches();	 Catch:{ IllegalArgumentException -> 0x01ca }
        if (r2 == 0) goto L_0x0120;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0116:
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r4 = r7.group(r2);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = java.lang.Integer.parseInt(r4);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r4 = r2;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0120:
        r27 = r10;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r26 = r14;	 Catch:{ IllegalArgumentException -> 0x01ca }
    L_0x0124:
        r12 = r12 + 1;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = 0;	 Catch:{ IllegalArgumentException -> 0x01ca }
        r14 = defpackage.bbk.a(r13, r12, r6, r2);	 Catch:{ IllegalArgumentException -> 0x01ca }
        r2 = r33;
        r10 = 1;
        goto L_0x0082;
    L_0x0130:
        r14 = r26;
        r10 = r27;
        r2 = 70;
        if (r4 < r2) goto L_0x013e;
    L_0x0138:
        r2 = 99;
        if (r4 > r2) goto L_0x013e;
    L_0x013c:
        r4 = r4 + 1900;
    L_0x013e:
        if (r4 < 0) goto L_0x0146;
    L_0x0140:
        r2 = 69;
        if (r4 > r2) goto L_0x0146;
    L_0x0144:
        r4 = r4 + 2000;
    L_0x0146:
        r2 = 1601; // 0x641 float:2.243E-42 double:7.91E-321;
        if (r4 < r2) goto L_0x01c2;
    L_0x014a:
        r2 = -1;
        if (r14 == r2) goto L_0x01ba;
    L_0x014d:
        if (r10 <= 0) goto L_0x01b2;
    L_0x014f:
        r6 = 31;
        if (r10 > r6) goto L_0x01b2;
    L_0x0153:
        if (r5 < 0) goto L_0x01aa;
    L_0x0155:
        r6 = 23;
        if (r5 > r6) goto L_0x01aa;
    L_0x0159:
        r12 = r28;
        if (r12 < 0) goto L_0x01a2;
    L_0x015d:
        r7 = 59;
        if (r12 > r7) goto L_0x01a4;
    L_0x0161:
        r6 = r29;
        if (r6 < 0) goto L_0x019c;
    L_0x0165:
        if (r6 > r7) goto L_0x019c;
    L_0x0167:
        r13 = new java.util.GregorianCalendar;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = defpackage.bdb.g;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.<init>(r2);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = 0;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.setLenient(r2);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.set(r2, r4);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = r14 + -1;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r4 = 2;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.set(r4, r2);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = 5;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.set(r2, r10);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = 11;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.set(r2, r5);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = 12;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.set(r2, r12);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = 13;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.set(r2, r6);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = 14;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r4 = 0;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13.set(r2, r4);	 Catch:{ IllegalArgumentException -> 0x0233 }
        r4 = r13.getTimeInMillis();	 Catch:{ IllegalArgumentException -> 0x0233 }
        r19 = r4;	 Catch:{ IllegalArgumentException -> 0x0233 }
        goto L_0x01dd;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x019c:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01a2:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01a4:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01aa:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01b2:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01ba:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01c2:
        r7 = 59;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01ca:
        r7 = 59;
        goto L_0x0233;
    L_0x01cd:
        r7 = 59;
        r2 = "max-age";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x01e0;
    L_0x01d7:
        r4 = defpackage.bbk.a(r13);	 Catch:{  }
        r17 = r4;
    L_0x01dd:
        r25 = 1;
        goto L_0x0233;
    L_0x01e0:
        r2 = "domain";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0213;
    L_0x01e8:
        r2 = ".";	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = r13.endsWith(r2);	 Catch:{ IllegalArgumentException -> 0x0233 }
        if (r2 != 0) goto L_0x020d;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01f0:
        r2 = ".";	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2 = r13.startsWith(r2);	 Catch:{ IllegalArgumentException -> 0x0233 }
        if (r2 == 0) goto L_0x01fd;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01f8:
        r2 = 1;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r13 = r13.substring(r2);	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x01fd:
        r2 = defpackage.bdb.a(r13);	 Catch:{ IllegalArgumentException -> 0x0233 }
        if (r2 == 0) goto L_0x0207;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x0203:
        r9 = r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r24 = 0;	 Catch:{ IllegalArgumentException -> 0x0233 }
        goto L_0x0233;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x0207:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x020d:
        r2 = new java.lang.IllegalArgumentException;	 Catch:{ IllegalArgumentException -> 0x0233 }
        r2.<init>();	 Catch:{ IllegalArgumentException -> 0x0233 }
        throw r2;	 Catch:{ IllegalArgumentException -> 0x0233 }
    L_0x0213:
        r2 = "path";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x021e;
    L_0x021b:
        r21 = r13;
        goto L_0x0233;
    L_0x021e:
        r2 = "secure";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0229;
    L_0x0226:
        r22 = 1;
        goto L_0x0233;
    L_0x0229:
        r2 = "httponly";
        r2 = r6.equalsIgnoreCase(r2);
        if (r2 == 0) goto L_0x0233;
    L_0x0231:
        r23 = 1;
    L_0x0233:
        r6 = r15 + 1;
        r2 = r33;
        r4 = 59;
        r5 = 0;
        r7 = 61;
        r10 = 1;
        r12 = -1;
        goto L_0x0049;
    L_0x0240:
        r2 = -9223372036854775808;
        r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r4 != 0) goto L_0x024a;
    L_0x0246:
        r0 = r32;
        r13 = r2;
        goto L_0x0281;
    L_0x024a:
        r2 = -1;
        r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r4 == 0) goto L_0x027d;
    L_0x0250:
        r2 = 9223372036854775; // 0x20c49ba5e353f7 float:-3.943512E-16 double:4.663754807431093E-308;
        r4 = (r17 > r2 ? 1 : (r17 == r2 ? 0 : -1));
        if (r4 > 0) goto L_0x025e;
    L_0x0259:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        r17 = r17 * r2;
        goto L_0x0263;
    L_0x025e:
        r17 = 9223372036854775807; // 0x7fffffffffffffff float:NaN double:NaN;
    L_0x0263:
        r2 = 0;
        r2 = r30 + r17;
        r4 = (r2 > r30 ? 1 : (r2 == r30 ? 0 : -1));
        if (r4 < 0) goto L_0x0274;
    L_0x026a:
        r0 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
        r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1));
        if (r4 <= 0) goto L_0x0246;
    L_0x0273:
        goto L_0x0279;
    L_0x0274:
        r0 = 253402300799999; // 0xe677d21fdbff float:-1.71647681E11 double:1.251973714024093E-309;
    L_0x0279:
        r13 = r0;
        r0 = r32;
        goto L_0x0281;
    L_0x027d:
        r0 = r32;
        r13 = r19;
    L_0x0281:
        r1 = r0.b;
        if (r9 != 0) goto L_0x0288;
    L_0x0285:
        r15 = r1;
        r2 = 0;
        goto L_0x02b7;
    L_0x0288:
        r2 = r1.equals(r9);
        if (r2 == 0) goto L_0x0290;
    L_0x028e:
        r3 = 1;
        goto L_0x02b1;
    L_0x0290:
        r2 = r1.endsWith(r9);
        if (r2 == 0) goto L_0x02b0;
    L_0x0296:
        r2 = r1.length();
        r3 = r9.length();
        r2 = r2 - r3;
        r3 = 1;
        r2 = r2 - r3;
        r2 = r1.charAt(r2);
        r4 = 46;
        if (r2 != r4) goto L_0x02b0;
    L_0x02a9:
        r2 = defpackage.bdb.c(r1);
        if (r2 != 0) goto L_0x02b0;
    L_0x02af:
        goto L_0x02b1;
    L_0x02b0:
        r3 = 0;
    L_0x02b1:
        if (r3 != 0) goto L_0x02b5;
    L_0x02b3:
        r2 = 0;
        return r2;
    L_0x02b5:
        r2 = 0;
        r15 = r9;
    L_0x02b7:
        r1 = r1.length();
        r3 = r15.length();
        if (r1 == r3) goto L_0x02cc;
    L_0x02c1:
        r1 = okhttp3.internal.publicsuffix.PublicSuffixDatabase.a();
        r1 = r1.a(r15);
        if (r1 != 0) goto L_0x02cc;
    L_0x02cb:
        return r2;
    L_0x02cc:
        r9 = r21;
        if (r9 == 0) goto L_0x02dc;
    L_0x02d0:
        r1 = "/";
        r1 = r9.startsWith(r1);
        if (r1 != 0) goto L_0x02d9;
    L_0x02d8:
        goto L_0x02dc;
    L_0x02d9:
        r16 = r9;
        goto L_0x02f2;
    L_0x02dc:
        r0 = r32.h();
        r1 = 47;
        r1 = r0.lastIndexOf(r1);
        if (r1 == 0) goto L_0x02ee;
    L_0x02e8:
        r2 = 0;
        r0 = r0.substring(r2, r1);
        goto L_0x02f0;
    L_0x02ee:
        r0 = "/";
    L_0x02f0:
        r16 = r0;
    L_0x02f2:
        r0 = new bbk;
        r10 = r0;
        r12 = r8;
        r17 = r22;
        r18 = r23;
        r19 = r24;
        r20 = r25;
        r10.<init>(r11, r12, r13, r15, r16, r17, r18, r19, r20);
        return r0;
    L_0x0302:
        r0 = r9;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: bbk.a(long, bbz, java.lang.String):bbk");
    }

    public static List<bbk> a(bbz bbz, bbx bbx) {
        String str = "Set-Cookie";
        int a = bbx.a();
        List list = null;
        List list2 = null;
        for (int i = 0; i < a; i++) {
            if (str.equalsIgnoreCase(bbx.a(i))) {
                if (list2 == null) {
                    list2 = new ArrayList(2);
                }
                list2.add(bbx.b(i));
            }
        }
        List unmodifiableList = list2 != null ? Collections.unmodifiableList(list2) : Collections.emptyList();
        int size = unmodifiableList.size();
        for (int i2 = 0; i2 < size; i2++) {
            bbk a2 = bbk.a(System.currentTimeMillis(), bbz, (String) unmodifiableList.get(i2));
            if (a2 != null) {
                if (list == null) {
                    list = new ArrayList();
                }
                list.add(a2);
            }
        }
        return list != null ? Collections.unmodifiableList(list) : Collections.emptyList();
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof bbk)) {
            return false;
        }
        bbk bbk = (bbk) obj;
        return bbk.e.equals(this.e) && bbk.f.equals(this.f) && bbk.h.equals(this.h) && bbk.i.equals(this.i) && bbk.g == this.g && bbk.j == this.j && bbk.k == this.k && bbk.l == this.l && bbk.m == this.m;
    }

    public final int hashCode() {
        int hashCode = (((((((this.e.hashCode() + 527) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        long j = this.g;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (this.j ^ 1)) * 31) + (this.k ^ 1)) * 31) + (this.l ^ 1)) * 31) + (this.m ^ 1);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.e);
        stringBuilder.append('=');
        stringBuilder.append(this.f);
        if (this.l) {
            String str;
            if (this.g == Long.MIN_VALUE) {
                str = "; max-age=0";
            } else {
                stringBuilder.append("; expires=");
                str = bea.a(new Date(this.g));
            }
            stringBuilder.append(str);
        }
        if (!this.m) {
            stringBuilder.append("; domain=");
            stringBuilder.append(this.h);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.i);
        if (this.j) {
            stringBuilder.append("; secure");
        }
        if (this.k) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }
}
