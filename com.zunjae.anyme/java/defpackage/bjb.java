package defpackage;

import java.util.Arrays;
import java.util.EnumSet;

public final class bjb extends biv {
    private final EnumSet<bjc> b = EnumSet.copyOf(Arrays.asList(new bjc[]{bjc.semiColonRequired}));

    private boolean a(bjc bjc) {
        EnumSet enumSet = this.b;
        return enumSet == null ? false : enumSet.contains(bjc);
    }

    public final int a(java.lang.CharSequence r8, int r9, java.io.Writer r10) {
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
        r7 = this;
        r0 = r8.length();
        r1 = r8.charAt(r9);
        r2 = 0;
        r3 = 38;
        if (r1 != r3) goto L_0x00ca;
    L_0x000d:
        r1 = r0 + -2;
        if (r9 >= r1) goto L_0x00ca;
    L_0x0011:
        r1 = r9 + 1;
        r1 = r8.charAt(r1);
        r3 = 35;
        if (r1 != r3) goto L_0x00ca;
    L_0x001b:
        r9 = r9 + 2;
        r1 = r8.charAt(r9);
        r3 = 120; // 0x78 float:1.68E-43 double:5.93E-322;
        r4 = 1;
        if (r1 == r3) goto L_0x002d;
    L_0x0026:
        r3 = 88;
        if (r1 != r3) goto L_0x002b;
    L_0x002a:
        goto L_0x002d;
    L_0x002b:
        r1 = 0;
        goto L_0x0033;
    L_0x002d:
        r9 = r9 + 1;
        if (r9 != r0) goto L_0x0032;
    L_0x0031:
        return r2;
    L_0x0032:
        r1 = 1;
    L_0x0033:
        r3 = r9;
    L_0x0034:
        if (r3 >= r0) goto L_0x0069;
    L_0x0036:
        r5 = r8.charAt(r3);
        r6 = 48;
        if (r5 < r6) goto L_0x0046;
    L_0x003e:
        r5 = r8.charAt(r3);
        r6 = 57;
        if (r5 <= r6) goto L_0x0066;
    L_0x0046:
        r5 = r8.charAt(r3);
        r6 = 97;
        if (r5 < r6) goto L_0x0056;
    L_0x004e:
        r5 = r8.charAt(r3);
        r6 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        if (r5 <= r6) goto L_0x0066;
    L_0x0056:
        r5 = r8.charAt(r3);
        r6 = 65;
        if (r5 < r6) goto L_0x0069;
    L_0x005e:
        r5 = r8.charAt(r3);
        r6 = 70;
        if (r5 > r6) goto L_0x0069;
    L_0x0066:
        r3 = r3 + 1;
        goto L_0x0034;
    L_0x0069:
        if (r3 == r0) goto L_0x0075;
    L_0x006b:
        r0 = r8.charAt(r3);
        r5 = 59;
        if (r0 != r5) goto L_0x0075;
    L_0x0073:
        r0 = 1;
        goto L_0x0076;
    L_0x0075:
        r0 = 0;
    L_0x0076:
        if (r0 != 0) goto L_0x0092;
    L_0x0078:
        r5 = defpackage.bjc.semiColonRequired;
        r5 = r7.a(r5);
        if (r5 == 0) goto L_0x0081;
    L_0x0080:
        return r2;
    L_0x0081:
        r5 = defpackage.bjc.errorIfNoSemiColon;
        r5 = r7.a(r5);
        if (r5 != 0) goto L_0x008a;
    L_0x0089:
        goto L_0x0092;
    L_0x008a:
        r8 = new java.lang.IllegalArgumentException;
        r9 = "Semi-colon required at end of numeric entity";
        r8.<init>(r9);
        throw r8;
    L_0x0092:
        if (r1 == 0) goto L_0x00a3;
    L_0x0094:
        r8 = r8.subSequence(r9, r3);	 Catch:{ NumberFormatException -> 0x00ca }
        r8 = r8.toString();	 Catch:{ NumberFormatException -> 0x00ca }
        r5 = 16;	 Catch:{ NumberFormatException -> 0x00ca }
        r8 = java.lang.Integer.parseInt(r8, r5);	 Catch:{ NumberFormatException -> 0x00ca }
        goto L_0x00b1;	 Catch:{ NumberFormatException -> 0x00ca }
    L_0x00a3:
        r8 = r8.subSequence(r9, r3);	 Catch:{ NumberFormatException -> 0x00ca }
        r8 = r8.toString();	 Catch:{ NumberFormatException -> 0x00ca }
        r5 = 10;	 Catch:{ NumberFormatException -> 0x00ca }
        r8 = java.lang.Integer.parseInt(r8, r5);	 Catch:{ NumberFormatException -> 0x00ca }
    L_0x00b1:
        r5 = 65535; // 0xffff float:9.1834E-41 double:3.23786E-319;
        if (r8 <= r5) goto L_0x00c1;
    L_0x00b6:
        r8 = java.lang.Character.toChars(r8);
        r2 = r8[r2];
        r10.write(r2);
        r8 = r8[r4];
    L_0x00c1:
        r10.write(r8);
        r3 = r3 + 2;
        r3 = r3 - r9;
        r3 = r3 + r1;
        r3 = r3 + r0;
        return r3;
    L_0x00ca:
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bjb.a(java.lang.CharSequence, int, java.io.Writer):int");
    }
}
