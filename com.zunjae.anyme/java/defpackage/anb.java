package defpackage;

import java.util.Comparator;

public final class anb {
    @xe(a = "image")
    private String a;
    @xe(a = "title")
    private String b;
    @xe(a = "score")
    private String c;
    @xe(a = "id")
    private Integer d;
    @xe(a = "description")
    private String e;

    public static Comparator<anb> d() {
        return new anc();
    }

    public final String a() {
        return this.a.contains("{{MI}}") ? this.a.replace("{{MI}}", "https://myanimelist.cdn-dena.com/images/anime/") : this.a;
    }

    public final String b() {
        return this.b;
    }

    public final double c() {
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
        r2 = this;
        r0 = r2.c;	 Catch:{ Exception -> 0x0007 }
        r0 = java.lang.Double.parseDouble(r0);	 Catch:{ Exception -> 0x0007 }
        return r0;
    L_0x0007:
        r0 = -4616189618054758400; // 0xbff0000000000000 float:0.0 double:-1.0;
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: anb.c():double");
    }

    public final Integer e() {
        return this.d;
    }

    public final String f() {
        return this.e;
    }
}
