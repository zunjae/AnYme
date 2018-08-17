package defpackage;

import java.util.List;

final class bfd extends bda {
    final /* synthetic */ int a;
    final /* synthetic */ List c;
    final /* synthetic */ bfa d;

    bfd(bfa bfa, String str, Object[] objArr, int i, List list) {
        this.d = bfa;
        this.a = i;
        this.c = list;
        super(str, objArr);
    }

    public final void b() {
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
        r3 = this;
        r0 = r3.d;	 Catch:{ IOException -> 0x0020 }
        r0 = r0.o;	 Catch:{ IOException -> 0x0020 }
        r1 = r3.a;	 Catch:{ IOException -> 0x0020 }
        r2 = defpackage.bes.CANCEL;	 Catch:{ IOException -> 0x0020 }
        r0.a(r1, r2);	 Catch:{ IOException -> 0x0020 }
        r0 = r3.d;	 Catch:{ IOException -> 0x0020 }
        monitor-enter(r0);	 Catch:{ IOException -> 0x0020 }
        r1 = r3.d;	 Catch:{ all -> 0x001d }
        r1 = r1.q;	 Catch:{ all -> 0x001d }
        r2 = r3.a;	 Catch:{ all -> 0x001d }
        r2 = java.lang.Integer.valueOf(r2);	 Catch:{ all -> 0x001d }
        r1.remove(r2);	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        return;	 Catch:{ all -> 0x001d }
    L_0x001d:
        r1 = move-exception;	 Catch:{ all -> 0x001d }
        monitor-exit(r0);	 Catch:{ all -> 0x001d }
        throw r1;	 Catch:{ IOException -> 0x0020 }
    L_0x0020:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: bfd.b():void");
    }
}
