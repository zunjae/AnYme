package defpackage;

import java.io.File;

final class sk {
    private final String a;
    private final azo b;

    public sk(String str, azo azo) {
        this.a = str;
        this.b = azo;
    }

    private File d() {
        return new File(this.b.a(), this.a);
    }

    public final boolean a() {
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
        r0 = r2.d();	 Catch:{ IOException -> 0x0009 }
        r0 = r0.createNewFile();	 Catch:{ IOException -> 0x0009 }
        goto L_0x0019;
    L_0x0009:
        defpackage.avf.c();
        r0 = new java.lang.StringBuilder;
        r1 = "Error creating marker: ";
        r0.<init>(r1);
        r1 = r2.a;
        r0.append(r1);
        r0 = 0;
    L_0x0019:
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: sk.a():boolean");
    }

    public final boolean b() {
        return d().exists();
    }

    public final boolean c() {
        return d().delete();
    }
}
