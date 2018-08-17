package defpackage;

public final class atm {
    private static final String a = "atm";

    public static defpackage.asc a(long r6) {
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
        r0 = 0;
        r1 = new bco;	 Catch:{ Exception -> 0x008c }
        r1.<init>();	 Catch:{ Exception -> 0x008c }
        r2 = "KEY_JIKAN_ANIME_ENDPOINT";	 Catch:{ Exception -> 0x008c }
        r3 = "https://api.jikan.moe/anime/%d";	 Catch:{ Exception -> 0x008c }
        r2 = defpackage.aux.b(r2, r3);	 Catch:{ Exception -> 0x008c }
        r3 = 1;	 Catch:{ Exception -> 0x008c }
        r3 = new java.lang.Object[r3];	 Catch:{ Exception -> 0x008c }
        r4 = 0;	 Catch:{ Exception -> 0x008c }
        r6 = java.lang.Long.valueOf(r6);	 Catch:{ Exception -> 0x008c }
        r3[r4] = r6;	 Catch:{ Exception -> 0x008c }
        r6 = java.lang.String.format(r2, r3);	 Catch:{ Exception -> 0x008c }
        r6 = r1.a(r6);	 Catch:{ Exception -> 0x008c }
        r7 = "User-Agent";	 Catch:{ Exception -> 0x008c }
        r1 = "Mozilla/5.0";	 Catch:{ Exception -> 0x008c }
        r6 = r6.a(r7, r1);	 Catch:{ Exception -> 0x008c }
        r6 = r6.a();	 Catch:{ Exception -> 0x008c }
        r7 = defpackage.atp.a();	 Catch:{ Exception -> 0x008c }
        r6 = r7.a(r6);	 Catch:{ Exception -> 0x008c }
        r6 = r6.a();	 Catch:{ Exception -> 0x008c }
        r7 = r6.c();	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        if (r7 != 0) goto L_0x0044;
    L_0x003e:
        if (r6 == 0) goto L_0x0043;
    L_0x0040:
        r6.close();	 Catch:{ Exception -> 0x008c }
    L_0x0043:
        return r0;
    L_0x0044:
        r7 = r6.g();	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r7 = r7.e();	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r1 = "\"related\":[]";	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r2 = "\"related\":{}";	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r7 = r7.replace(r1, r2);	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r1 = defpackage.ato.a();	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r2 = defpackage.asc.class;	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r7 = r1.a(r7, r2);	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r7 = (defpackage.asc) r7;	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        r1 = r7.a();	 Catch:{ Throwable -> 0x0075, all -> 0x0072 }
        if (r1 == 0) goto L_0x006c;
    L_0x0066:
        if (r6 == 0) goto L_0x006b;
    L_0x0068:
        r6.close();	 Catch:{ Exception -> 0x008c }
    L_0x006b:
        return r7;	 Catch:{ Exception -> 0x008c }
    L_0x006c:
        if (r6 == 0) goto L_0x0071;	 Catch:{ Exception -> 0x008c }
    L_0x006e:
        r6.close();	 Catch:{ Exception -> 0x008c }
    L_0x0071:
        return r0;
    L_0x0072:
        r7 = move-exception;
        r1 = r0;
        goto L_0x007b;
    L_0x0075:
        r7 = move-exception;
        throw r7;	 Catch:{ all -> 0x0077 }
    L_0x0077:
        r1 = move-exception;
        r5 = r1;
        r1 = r7;
        r7 = r5;
    L_0x007b:
        if (r6 == 0) goto L_0x008b;
    L_0x007d:
        if (r1 == 0) goto L_0x0088;
    L_0x007f:
        r6.close();	 Catch:{ Throwable -> 0x0083 }
        goto L_0x008b;
    L_0x0083:
        r6 = move-exception;
        r1.addSuppressed(r6);	 Catch:{ Exception -> 0x008c }
        goto L_0x008b;	 Catch:{ Exception -> 0x008c }
    L_0x0088:
        r6.close();	 Catch:{ Exception -> 0x008c }
    L_0x008b:
        throw r7;	 Catch:{ Exception -> 0x008c }
    L_0x008c:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: atm.a(long):asc");
    }

    public static void a(String str) {
        if (bit.c(str)) {
            aux.a("KEY_JIKAN_ANIME_ENDPOINT", str);
        }
    }
}
