package com.zunjae.anyme.activities.browsers.nsfw;

import com.zunjae.anyme.activities.browsers.abtracts.g;

final class b extends g {
    final /* synthetic */ HHBrowser b;

    private b(HHBrowser hHBrowser) {
        this.b = hHBrowser;
        super(hHBrowser);
    }

    public final android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r5, java.lang.String r6) {
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
        r4 = this;
        r0 = r6.toLowerCase();
        r1 = "http://hentaihaven.org/basement/js/scripts.min.js";
        r0 = r0.equalsIgnoreCase(r1);
        if (r0 == 0) goto L_0x0030;
    L_0x000c:
        r0 = r4.b;
        r0 = r0.k;
        if (r0 == 0) goto L_0x0030;
    L_0x0014:
        r0 = r4.b;
        r0 = r0.l;
        if (r0 == 0) goto L_0x0030;
    L_0x001c:
        r0 = new android.webkit.WebResourceResponse;	 Catch:{ Exception -> 0x0030 }
        r1 = "text/javascript";	 Catch:{ Exception -> 0x0030 }
        r2 = "utf-8";	 Catch:{ Exception -> 0x0030 }
        r3 = r4.b;	 Catch:{ Exception -> 0x0030 }
        r3 = r3.b;	 Catch:{ Exception -> 0x0030 }
        r3 = defpackage.ano.c(r3);	 Catch:{ Exception -> 0x0030 }
        r0.<init>(r1, r2, r3);	 Catch:{ Exception -> 0x0030 }
        return r0;
    L_0x0030:
        r5 = super.shouldInterceptRequest(r5, r6);
        return r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.nsfw.b.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }
}
