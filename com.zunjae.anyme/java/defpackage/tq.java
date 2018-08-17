package defpackage;

import java.util.regex.Pattern;

final class tq {
    private static final Pattern a = Pattern.compile("\\s*(\\p{XDigit}+)-\\s*(\\p{XDigit}+)\\s+(.{4})\\s+\\p{XDigit}+\\s+.+\\s+\\d+\\s+(.*)");

    public static defpackage.tp a(java.lang.String r10) {
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
        r0 = a;
        r10 = r0.matcher(r10);
        r0 = r10.matches();
        r1 = 0;
        if (r0 != 0) goto L_0x000e;
    L_0x000d:
        return r1;
    L_0x000e:
        r0 = 1;
        r0 = r10.group(r0);	 Catch:{ Exception -> 0x003e }
        r2 = 16;	 Catch:{ Exception -> 0x003e }
        r0 = java.lang.Long.valueOf(r0, r2);	 Catch:{ Exception -> 0x003e }
        r4 = r0.longValue();	 Catch:{ Exception -> 0x003e }
        r0 = 2;	 Catch:{ Exception -> 0x003e }
        r0 = r10.group(r0);	 Catch:{ Exception -> 0x003e }
        r0 = java.lang.Long.valueOf(r0, r2);	 Catch:{ Exception -> 0x003e }
        r2 = r0.longValue();	 Catch:{ Exception -> 0x003e }
        r0 = 0;	 Catch:{ Exception -> 0x003e }
        r6 = r2 - r4;	 Catch:{ Exception -> 0x003e }
        r0 = 3;	 Catch:{ Exception -> 0x003e }
        r8 = r10.group(r0);	 Catch:{ Exception -> 0x003e }
        r0 = 4;	 Catch:{ Exception -> 0x003e }
        r9 = r10.group(r0);	 Catch:{ Exception -> 0x003e }
        r10 = new tp;	 Catch:{ Exception -> 0x003e }
        r3 = r10;	 Catch:{ Exception -> 0x003e }
        r3.<init>(r4, r6, r8, r9);	 Catch:{ Exception -> 0x003e }
        return r10;
    L_0x003e:
        defpackage.avf.c();
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: tq.a(java.lang.String):tp");
    }
}
