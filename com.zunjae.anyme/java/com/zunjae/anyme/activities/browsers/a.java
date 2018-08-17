package com.zunjae.anyme.activities.browsers;

import com.zunjae.anyme.activities.browsers.abtracts.c;

class a extends c {
    final /* synthetic */ AnimeHeavenBrowser a;
    private final String c;

    private a(AnimeHeavenBrowser animeHeavenBrowser) {
        this.a = animeHeavenBrowser;
        super(animeHeavenBrowser);
        this.c = a.class.getSimpleName();
    }

    public android.webkit.WebResourceResponse shouldInterceptRequest(android.webkit.WebView r6, java.lang.String r7) {
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
        r0 = r7.toLowerCase();
        r1 = "block.js";
        r0 = r0.contains(r1);
        if (r0 == 0) goto L_0x0026;
    L_0x000c:
        r0 = new android.webkit.WebResourceResponse;	 Catch:{ Exception -> 0x0026 }
        r1 = "text/javascript";	 Catch:{ Exception -> 0x0026 }
        r2 = "utf-8";	 Catch:{ Exception -> 0x0026 }
        r3 = r5.a;	 Catch:{ Exception -> 0x0026 }
        r3 = r3.b;	 Catch:{ Exception -> 0x0026 }
        r3 = r3.getResources();	 Catch:{ Exception -> 0x0026 }
        r4 = 2131623936; // 0x7f0e0000 float:1.8875038E38 double:1.0531621566E-314;	 Catch:{ Exception -> 0x0026 }
        r3 = r3.openRawResource(r4);	 Catch:{ Exception -> 0x0026 }
        r0.<init>(r1, r2, r3);	 Catch:{ Exception -> 0x0026 }
        return r0;
    L_0x0026:
        r6 = super.shouldInterceptRequest(r6, r7);
        return r6;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.a.shouldInterceptRequest(android.webkit.WebView, java.lang.String):android.webkit.WebResourceResponse");
    }
}
