package defpackage;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

public final class ajc extends ajb {
    private ajh a;

    public ajc(ajh ajh) {
        this.a = ajh;
    }

    public final void onPageFinished(android.webkit.WebView r6, java.lang.String r7) {
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
        super.onPageFinished(r6, r7);
        r0 = r5.a;
        if (r0 == 0) goto L_0x000e;
    L_0x0007:
        r1 = r6.getTitle();
        r0.b(r1);
    L_0x000e:
        r0 = "login.php";	 Catch:{ Exception -> 0x003f }
        r7 = r7.contains(r0);	 Catch:{ Exception -> 0x003f }
        if (r7 == 0) goto L_0x003f;	 Catch:{ Exception -> 0x003f }
    L_0x0016:
        r7 = defpackage.anq.c();	 Catch:{ Exception -> 0x003f }
        r0 = "javascript: document.getElementById(\"loginUserName\").value=\"%s\"";	 Catch:{ Exception -> 0x003f }
        r1 = 1;	 Catch:{ Exception -> 0x003f }
        r2 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x003f }
        r3 = r7.a();	 Catch:{ Exception -> 0x003f }
        r4 = 0;	 Catch:{ Exception -> 0x003f }
        r2[r4] = r3;	 Catch:{ Exception -> 0x003f }
        r0 = java.lang.String.format(r0, r2);	 Catch:{ Exception -> 0x003f }
        r2 = "javascript: document.getElementById(\"password\").value=\"%s\"";	 Catch:{ Exception -> 0x003f }
        r1 = new java.lang.Object[r1];	 Catch:{ Exception -> 0x003f }
        r7 = r7.b();	 Catch:{ Exception -> 0x003f }
        r1[r4] = r7;	 Catch:{ Exception -> 0x003f }
        r7 = java.lang.String.format(r2, r1);	 Catch:{ Exception -> 0x003f }
        r1 = 0;	 Catch:{ Exception -> 0x003f }
        r6.evaluateJavascript(r0, r1);	 Catch:{ Exception -> 0x003f }
        r6.evaluateJavascript(r7, r1);	 Catch:{ Exception -> 0x003f }
    L_0x003f:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: ajc.onPageFinished(android.webkit.WebView, java.lang.String):void");
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        ajh ajh = this.a;
        if (ajh != null) {
            ajh.a(str.toLowerCase());
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str.toLowerCase().contains("https://www.reddit.com/error")) {
            ajh ajh = this.a;
            if (ajh != null) {
                ajh.c(str.toLowerCase());
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
