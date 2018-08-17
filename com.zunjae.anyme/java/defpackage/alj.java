package defpackage;

public final class alj {
    @xe(a = "id")
    public Integer a;
    @xe(a = "image")
    public String b;
    @xe(a = "directory")
    private String c;

    @android.annotation.SuppressLint({"DefaultLocale"})
    public final java.lang.String a() {
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
        r5 = this;
        r0 = "";
        r1 = 0;
        r2 = r5.b;	 Catch:{ Exception -> 0x0029 }
        r3 = ".";	 Catch:{ Exception -> 0x0029 }
        r2 = r2.contains(r3);	 Catch:{ Exception -> 0x0029 }
        if (r2 == 0) goto L_0x0029;	 Catch:{ Exception -> 0x0029 }
    L_0x000d:
        r2 = new java.lang.StringBuilder;	 Catch:{ Exception -> 0x0029 }
        r2.<init>();	 Catch:{ Exception -> 0x0029 }
        r3 = r5.b;	 Catch:{ Exception -> 0x0029 }
        r4 = ".";	 Catch:{ Exception -> 0x0029 }
        r3 = r3.split(r4);	 Catch:{ Exception -> 0x0029 }
        r3 = r3[r1];	 Catch:{ Exception -> 0x0029 }
        r2.append(r3);	 Catch:{ Exception -> 0x0029 }
        r3 = ".jpg";	 Catch:{ Exception -> 0x0029 }
        r2.append(r3);	 Catch:{ Exception -> 0x0029 }
        r2 = r2.toString();	 Catch:{ Exception -> 0x0029 }
        r0 = r2;
    L_0x0029:
        r2 = "https://rule34.xxx/thumbnails/%s/thumbnail_%s?%d";
        r3 = 3;
        r3 = new java.lang.Object[r3];
        r4 = r5.c;
        r3[r1] = r4;
        r1 = 1;
        r3[r1] = r0;
        r0 = 2;
        r1 = r5.a;
        r3[r0] = r1;
        r0 = java.lang.String.format(r2, r3);
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: alj.a():java.lang.String");
    }
}
