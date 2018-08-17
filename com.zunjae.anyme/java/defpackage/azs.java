package defpackage;

abstract class azs extends avy {
    public azs(avp avp, String str, String str2, azk azk, int i) {
        super(avp, str, str2, azk, i);
    }

    private defpackage.azc a(defpackage.azc r8, defpackage.azv r9) {
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
        r7 = this;
        r0 = "app[identifier]";
        r1 = r9.b;
        r8 = r8.b(r0, r1);
        r0 = "app[name]";
        r1 = r9.f;
        r8 = r8.b(r0, r1);
        r0 = "app[display_version]";
        r1 = r9.c;
        r8 = r8.b(r0, r1);
        r0 = "app[build_version]";
        r1 = r9.d;
        r8 = r8.b(r0, r1);
        r0 = "app[source]";
        r1 = r9.g;
        r1 = java.lang.Integer.valueOf(r1);
        r8 = r8.a(r0, r1);
        r0 = "app[minimum_sdk_version]";
        r1 = r9.h;
        r8 = r8.b(r0, r1);
        r0 = "app[built_sdk_version]";
        r1 = r9.i;
        r8 = r8.b(r0, r1);
        r0 = r9.e;
        r0 = defpackage.awj.d(r0);
        if (r0 != 0) goto L_0x004b;
    L_0x0044:
        r0 = "app[instance_identifier]";
        r1 = r9.e;
        r8.b(r0, r1);
    L_0x004b:
        r0 = r9.j;
        if (r0 == 0) goto L_0x00b5;
    L_0x004f:
        r0 = 0;
        r1 = r7.a;	 Catch:{ NotFoundException -> 0x009c }
        r1 = r1.m();	 Catch:{ NotFoundException -> 0x009c }
        r1 = r1.getResources();	 Catch:{ NotFoundException -> 0x009c }
        r2 = r9.j;	 Catch:{ NotFoundException -> 0x009c }
        r2 = r2.b;	 Catch:{ NotFoundException -> 0x009c }
        r1 = r1.openRawResource(r2);	 Catch:{ NotFoundException -> 0x009c }
        r0 = "app[icon][hash]";	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r2 = r9.j;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r2 = r2.a;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r0 = r8.b(r0, r2);	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r2 = "app[icon][data]";	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r3 = "icon.png";	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r4 = "application/octet-stream";	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r0 = r0.a(r2, r3, r4, r1);	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r2 = "app[icon][width]";	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r3 = r9.j;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r3 = r3.c;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r0 = r0.a(r2, r3);	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r2 = "app[icon][height]";	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r3 = r9.j;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r3 = r3.d;	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r3 = java.lang.Integer.valueOf(r3);	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        r0.a(r2, r3);	 Catch:{ NotFoundException -> 0x0097, all -> 0x0095 }
        defpackage.awj.a(r1);
        goto L_0x00b5;
    L_0x0095:
        r8 = move-exception;
        goto L_0x00b1;
    L_0x0097:
        r0 = r1;
        goto L_0x009c;
    L_0x0099:
        r8 = move-exception;
        r1 = r0;
        goto L_0x00b1;
    L_0x009c:
        defpackage.avf.c();	 Catch:{ all -> 0x0099 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0099 }
        r2 = "Failed to find app icon with resource ID: ";	 Catch:{ all -> 0x0099 }
        r1.<init>(r2);	 Catch:{ all -> 0x0099 }
        r2 = r9.j;	 Catch:{ all -> 0x0099 }
        r2 = r2.b;	 Catch:{ all -> 0x0099 }
        r1.append(r2);	 Catch:{ all -> 0x0099 }
        defpackage.awj.a(r0);
        goto L_0x00b5;
    L_0x00b1:
        defpackage.awj.a(r1);
        throw r8;
    L_0x00b5:
        r9 = r9.k;
        if (r9 == 0) goto L_0x00fa;
    L_0x00b9:
        r9 = r9.iterator();
    L_0x00bd:
        r0 = r9.hasNext();
        if (r0 == 0) goto L_0x00fa;
    L_0x00c3:
        r0 = r9.next();
        r0 = (defpackage.avr) r0;
        r1 = java.util.Locale.US;
        r2 = "app[build][libraries][%s][version]";
        r3 = 1;
        r4 = new java.lang.Object[r3];
        r5 = r0.a();
        r6 = 0;
        r4[r6] = r5;
        r1 = java.lang.String.format(r1, r2, r4);
        r2 = r0.b();
        r8.b(r1, r2);
        r1 = java.util.Locale.US;
        r2 = "app[build][libraries][%s][type]";
        r3 = new java.lang.Object[r3];
        r4 = r0.a();
        r3[r6] = r4;
        r1 = java.lang.String.format(r1, r2, r3);
        r0 = r0.c();
        r8.b(r1, r0);
        goto L_0x00bd;
    L_0x00fa:
        return r8;
        */
        throw new UnsupportedOperationException("Method not decompiled: azs.a(azc, azv):azc");
    }

    public boolean a(azv azv) {
        azc a = a(b().a("X-CRASHLYTICS-API-KEY", azv.a).a("X-CRASHLYTICS-API-CLIENT-TYPE", "android").a("X-CRASHLYTICS-API-CLIENT-VERSION", this.a.a()), azv);
        avf.c();
        new StringBuilder("Sending app info to ").append(a());
        if (azv.j != null) {
            avf.c();
            new StringBuilder("App icon hash is ").append(azv.j.a);
            avf.c();
            StringBuilder stringBuilder = new StringBuilder("App icon size is ");
            stringBuilder.append(azv.j.c);
            stringBuilder.append("x");
            stringBuilder.append(azv.j.d);
        }
        int b = a.b();
        String str = "POST".equals(a.f()) ? "Create" : "Update";
        avf.c();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(str);
        stringBuilder2.append(" app request ID: ");
        stringBuilder2.append(a.a("X-REQUEST-ID"));
        avf.c();
        return axf.a(b) == 0;
    }
}
