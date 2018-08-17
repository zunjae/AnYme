package defpackage;

final class bad extends avy implements baq {
    public bad(avp avp, String str, String str2, azk azk) {
        this(avp, str, str2, azk, azb.a);
    }

    private bad(avp avp, String str, String str2, azk azk, int i) {
        super(avp, str, str2, azk, i);
    }

    private org.json.JSONObject a(java.lang.String r2) {
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
        r1 = this;
        r0 = new org.json.JSONObject;	 Catch:{ Exception -> 0x0006 }
        r0.<init>(r2);	 Catch:{ Exception -> 0x0006 }
        return r0;
    L_0x0006:
        defpackage.avf.c();
        r2 = new java.lang.StringBuilder;
        r0 = "Failed to parse settings JSON from ";
        r2.<init>(r0);
        r0 = r1.a();
        r2.append(r0);
        defpackage.avf.c();
        r2 = 0;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: bad.a(java.lang.String):org.json.JSONObject");
    }

    private static void a(azc azc, String str, String str2) {
        if (str2 != null) {
            azc.a(str, str2);
        }
    }

    public final org.json.JSONObject a(defpackage.bap r6) {
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
        r5 = this;
        r0 = 0;
        r1 = new java.util.HashMap;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r1.<init>();	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r2 = "build_version";	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r3 = r6.h;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r1.put(r2, r3);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r2 = "display_version";	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r3 = r6.g;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r1.put(r2, r3);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r2 = "source";	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r3 = r6.i;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r3 = java.lang.Integer.toString(r3);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r1.put(r2, r3);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r2 = r6.j;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        if (r2 == 0) goto L_0x002a;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
    L_0x0023:
        r2 = "icon_hash";	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r3 = r6.j;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r1.put(r2, r3);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
    L_0x002a:
        r2 = r6.f;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r3 = defpackage.awj.d(r2);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        if (r3 != 0) goto L_0x0037;	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
    L_0x0032:
        r3 = "instance";	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r1.put(r3, r2);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
    L_0x0037:
        r2 = r5.a(r1);	 Catch:{ azh -> 0x00e6, all -> 0x00e3 }
        r3 = "X-CRASHLYTICS-API-KEY";	 Catch:{ azh -> 0x00e7 }
        r4 = r6.a;	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r4);	 Catch:{ azh -> 0x00e7 }
        r3 = "X-CRASHLYTICS-API-CLIENT-TYPE";	 Catch:{ azh -> 0x00e7 }
        r4 = "android";	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r4);	 Catch:{ azh -> 0x00e7 }
        r3 = "X-CRASHLYTICS-API-CLIENT-VERSION";	 Catch:{ azh -> 0x00e7 }
        r4 = r5.a;	 Catch:{ azh -> 0x00e7 }
        r4 = r4.a();	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r4);	 Catch:{ azh -> 0x00e7 }
        r3 = "Accept";	 Catch:{ azh -> 0x00e7 }
        r4 = "application/json";	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r4);	 Catch:{ azh -> 0x00e7 }
        r3 = "X-CRASHLYTICS-DEVICE-MODEL";	 Catch:{ azh -> 0x00e7 }
        r4 = r6.b;	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r4);	 Catch:{ azh -> 0x00e7 }
        r3 = "X-CRASHLYTICS-OS-BUILD-VERSION";	 Catch:{ azh -> 0x00e7 }
        r4 = r6.c;	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r4);	 Catch:{ azh -> 0x00e7 }
        r3 = "X-CRASHLYTICS-OS-DISPLAY-VERSION";	 Catch:{ azh -> 0x00e7 }
        r4 = r6.d;	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r4);	 Catch:{ azh -> 0x00e7 }
        r3 = "X-CRASHLYTICS-INSTALLATION-ID";	 Catch:{ azh -> 0x00e7 }
        r6 = r6.e;	 Catch:{ azh -> 0x00e7 }
        defpackage.bad.a(r2, r3, r6);	 Catch:{ azh -> 0x00e7 }
        defpackage.avf.c();	 Catch:{ azh -> 0x00e7 }
        r6 = new java.lang.StringBuilder;	 Catch:{ azh -> 0x00e7 }
        r3 = "Requesting settings from ";	 Catch:{ azh -> 0x00e7 }
        r6.<init>(r3);	 Catch:{ azh -> 0x00e7 }
        r3 = r5.a();	 Catch:{ azh -> 0x00e7 }
        r6.append(r3);	 Catch:{ azh -> 0x00e7 }
        defpackage.avf.c();	 Catch:{ azh -> 0x00e7 }
        r6 = new java.lang.StringBuilder;	 Catch:{ azh -> 0x00e7 }
        r3 = "Settings query params were: ";	 Catch:{ azh -> 0x00e7 }
        r6.<init>(r3);	 Catch:{ azh -> 0x00e7 }
        r6.append(r1);	 Catch:{ azh -> 0x00e7 }
        r6 = r2.b();	 Catch:{ azh -> 0x00e7 }
        defpackage.avf.c();	 Catch:{ azh -> 0x00e7 }
        r1 = 200; // 0xc8 float:2.8E-43 double:9.9E-322;	 Catch:{ azh -> 0x00e7 }
        if (r6 == r1) goto L_0x00af;	 Catch:{ azh -> 0x00e7 }
    L_0x00a0:
        r1 = 201; // 0xc9 float:2.82E-43 double:9.93E-322;	 Catch:{ azh -> 0x00e7 }
        if (r6 == r1) goto L_0x00af;	 Catch:{ azh -> 0x00e7 }
    L_0x00a4:
        r1 = 202; // 0xca float:2.83E-43 double:1.0E-321;	 Catch:{ azh -> 0x00e7 }
        if (r6 == r1) goto L_0x00af;	 Catch:{ azh -> 0x00e7 }
    L_0x00a8:
        r1 = 203; // 0xcb float:2.84E-43 double:1.003E-321;	 Catch:{ azh -> 0x00e7 }
        if (r6 != r1) goto L_0x00ad;	 Catch:{ azh -> 0x00e7 }
    L_0x00ac:
        goto L_0x00af;	 Catch:{ azh -> 0x00e7 }
    L_0x00ad:
        r6 = 0;	 Catch:{ azh -> 0x00e7 }
        goto L_0x00b0;	 Catch:{ azh -> 0x00e7 }
    L_0x00af:
        r6 = 1;	 Catch:{ azh -> 0x00e7 }
    L_0x00b0:
        if (r6 == 0) goto L_0x00bc;	 Catch:{ azh -> 0x00e7 }
    L_0x00b2:
        r6 = r2.c();	 Catch:{ azh -> 0x00e7 }
        r6 = r5.a(r6);	 Catch:{ azh -> 0x00e7 }
        r0 = r6;	 Catch:{ azh -> 0x00e7 }
        goto L_0x00cd;	 Catch:{ azh -> 0x00e7 }
    L_0x00bc:
        defpackage.avf.c();	 Catch:{ azh -> 0x00e7 }
        r6 = new java.lang.StringBuilder;	 Catch:{ azh -> 0x00e7 }
        r1 = "Failed to retrieve settings from ";	 Catch:{ azh -> 0x00e7 }
        r6.<init>(r1);	 Catch:{ azh -> 0x00e7 }
        r1 = r5.a();	 Catch:{ azh -> 0x00e7 }
        r6.append(r1);	 Catch:{ azh -> 0x00e7 }
    L_0x00cd:
        if (r2 == 0) goto L_0x00f7;
    L_0x00cf:
        defpackage.avf.c();
        r6 = new java.lang.StringBuilder;
        r1 = "Settings request ID: ";
        r6.<init>(r1);
    L_0x00d9:
        r1 = "X-REQUEST-ID";
        r1 = r2.a(r1);
        r6.append(r1);
        goto L_0x00f7;
    L_0x00e3:
        r6 = move-exception;
        r2 = r0;
        goto L_0x00f9;
    L_0x00e6:
        r2 = r0;
    L_0x00e7:
        defpackage.avf.c();	 Catch:{ all -> 0x00f8 }
        if (r2 == 0) goto L_0x00f7;
    L_0x00ec:
        defpackage.avf.c();
        r6 = new java.lang.StringBuilder;
        r1 = "Settings request ID: ";
        r6.<init>(r1);
        goto L_0x00d9;
    L_0x00f7:
        return r0;
    L_0x00f8:
        r6 = move-exception;
    L_0x00f9:
        if (r2 == 0) goto L_0x010e;
    L_0x00fb:
        defpackage.avf.c();
        r0 = new java.lang.StringBuilder;
        r1 = "Settings request ID: ";
        r0.<init>(r1);
        r1 = "X-REQUEST-ID";
        r1 = r2.a(r1);
        r0.append(r1);
    L_0x010e:
        throw r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: bad.a(bap):org.json.JSONObject");
    }
}
