package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class dr {
    File[] a;
    File[] b;
    final /* synthetic */ do c;
    private final String d;
    private final long[] e;
    private boolean f;
    private dq g;
    private long h;

    private dr(do doVar, String str) {
        this.c = doVar;
        this.d = str;
        this.e = new long[doVar.h];
        this.a = new File[doVar.h];
        this.b = new File[doVar.h];
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.append('.');
        int length = stringBuilder.length();
        for (int i = 0; i < doVar.h; i++) {
            stringBuilder.append(i);
            this.a[i] = new File(doVar.b, stringBuilder.toString());
            stringBuilder.append(".tmp");
            this.b[i] = new File(doVar.b, stringBuilder.toString());
            stringBuilder.setLength(length);
        }
    }

    private static IOException a(String[] strArr) {
        StringBuilder stringBuilder = new StringBuilder("unexpected journal line: ");
        stringBuilder.append(Arrays.toString(strArr));
        throw new IOException(stringBuilder.toString());
    }

    static /* synthetic */ void a(defpackage.dr r4, java.lang.String[] r5) {
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
        r0 = r5.length;
        r1 = r4.c;
        r1 = r1.h;
        if (r0 != r1) goto L_0x0020;
    L_0x0009:
        r0 = 0;
    L_0x000a:
        r1 = r5.length;	 Catch:{ NumberFormatException -> 0x001b }
        if (r0 >= r1) goto L_0x001a;	 Catch:{ NumberFormatException -> 0x001b }
    L_0x000d:
        r1 = r4.e;	 Catch:{ NumberFormatException -> 0x001b }
        r2 = r5[r0];	 Catch:{ NumberFormatException -> 0x001b }
        r2 = java.lang.Long.parseLong(r2);	 Catch:{ NumberFormatException -> 0x001b }
        r1[r0] = r2;	 Catch:{ NumberFormatException -> 0x001b }
        r0 = r0 + 1;
        goto L_0x000a;
    L_0x001a:
        return;
    L_0x001b:
        r4 = defpackage.dr.a(r5);
        throw r4;
    L_0x0020:
        r4 = defpackage.dr.a(r5);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: dr.a(dr, java.lang.String[]):void");
    }

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        for (long j : this.e) {
            stringBuilder.append(' ');
            stringBuilder.append(j);
        }
        return stringBuilder.toString();
    }
}
