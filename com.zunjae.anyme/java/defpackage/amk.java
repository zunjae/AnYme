package defpackage;

public final class amk {
    @xe(a = "mal_id")
    private String a;
    @xe(a = "episodes")
    private Integer b;
    @xe(a = "image_url")
    private String c;
    @xe(a = "synopsis")
    private String d;
    @xe(a = "type")
    private String e;
    @xe(a = "title")
    private String f;
    private boolean g = false;

    public final boolean a() {
        return this.g;
    }

    public final void b() {
        this.g = true;
    }

    public final int c() {
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
        r0 = r1.a;	 Catch:{ Exception -> 0x0007 }
        r0 = java.lang.Integer.parseInt(r0);	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = -1;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: amk.c():int");
    }

    public final Integer d() {
        return this.b;
    }

    public final String e() {
        return this.c;
    }

    public final String f() {
        return this.d;
    }

    public final String g() {
        return this.e;
    }

    public final String h() {
        return this.f;
    }
}
