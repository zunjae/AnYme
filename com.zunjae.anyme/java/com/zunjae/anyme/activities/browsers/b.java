package com.zunjae.anyme.activities.browsers;

import android.webkit.ValueCallback;

final class b implements ValueCallback<String> {
    final /* synthetic */ AnimePaheBrowser a;

    b(AnimePaheBrowser animePaheBrowser) {
        this.a = animePaheBrowser;
    }

    public final /* synthetic */ void onReceiveValue(java.lang.Object r3) {
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
        r2 = this;
        r3 = (java.lang.String) r3;
        r0 = defpackage.bit.c(r3);	 Catch:{ Exception -> 0x0021 }
        if (r0 == 0) goto L_0x0021;	 Catch:{ Exception -> 0x0021 }
    L_0x0008:
        r0 = "null";	 Catch:{ Exception -> 0x0021 }
        r0 = r3.equals(r0);	 Catch:{ Exception -> 0x0021 }
        if (r0 != 0) goto L_0x0021;	 Catch:{ Exception -> 0x0021 }
    L_0x0010:
        r0 = "\\D+";	 Catch:{ Exception -> 0x0021 }
        r1 = "";	 Catch:{ Exception -> 0x0021 }
        r3 = r3.replaceAll(r0, r1);	 Catch:{ Exception -> 0x0021 }
        r3 = java.lang.Integer.parseInt(r3);	 Catch:{ Exception -> 0x0021 }
        r0 = r2.a;	 Catch:{ Exception -> 0x0021 }
        r0.a(r3);	 Catch:{ Exception -> 0x0021 }
    L_0x0021:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.b.onReceiveValue(java.lang.Object):void");
    }
}
