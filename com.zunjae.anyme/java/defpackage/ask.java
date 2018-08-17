package defpackage;

import java.util.ArrayList;

public final class ask {
    @xe(a = "mal_id")
    public int a;
    @xe(a = "title")
    public String b;
    @xe(a = "image_url")
    public String c;
    @xe(a = "type")
    public String d;
    @xe(a = "synopsis")
    public String e;
    @xe(a = "genre")
    public ArrayList<asj> f;
    @xe(a = "score")
    public double g;

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
        r3 = this;
        r0 = new java.util.ArrayList;	 Catch:{ Exception -> 0x0028 }
        r0.<init>();	 Catch:{ Exception -> 0x0028 }
        r1 = r3.f;	 Catch:{ Exception -> 0x0028 }
        r1 = r1.iterator();	 Catch:{ Exception -> 0x0028 }
    L_0x000b:
        r2 = r1.hasNext();	 Catch:{ Exception -> 0x0028 }
        if (r2 == 0) goto L_0x001d;	 Catch:{ Exception -> 0x0028 }
    L_0x0011:
        r2 = r1.next();	 Catch:{ Exception -> 0x0028 }
        r2 = (defpackage.asj) r2;	 Catch:{ Exception -> 0x0028 }
        r2 = r2.a;	 Catch:{ Exception -> 0x0028 }
        r0.add(r2);	 Catch:{ Exception -> 0x0028 }
        goto L_0x000b;	 Catch:{ Exception -> 0x0028 }
    L_0x001d:
        r1 = ", ";	 Catch:{ Exception -> 0x0028 }
        r0 = r0.iterator();	 Catch:{ Exception -> 0x0028 }
        r0 = defpackage.bit.a(r0, r1);	 Catch:{ Exception -> 0x0028 }
        return r0;
    L_0x0028:
        r0 = "";
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: ask.a():java.lang.String");
    }
}
