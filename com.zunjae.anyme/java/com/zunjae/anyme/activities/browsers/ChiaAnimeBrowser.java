package com.zunjae.anyme.activities.browsers;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.b;
import defpackage.ant;
import defpackage.anx;

public final class ChiaAnimeBrowser extends AbstractAnimeBrowser {
    private static int f(java.lang.String r2) {
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
        r0 = "episode-";	 Catch:{ Exception -> 0x0016 }
        r2 = r2.split(r0);	 Catch:{ Exception -> 0x0016 }
        r0 = 1;	 Catch:{ Exception -> 0x0016 }
        r2 = r2[r0];	 Catch:{ Exception -> 0x0016 }
        r0 = "[^\\d.]";	 Catch:{ Exception -> 0x0016 }
        r1 = "";	 Catch:{ Exception -> 0x0016 }
        r2 = r2.replaceAll(r0, r1);	 Catch:{ Exception -> 0x0016 }
        r2 = java.lang.Integer.parseInt(r2);	 Catch:{ Exception -> 0x0016 }
        return r2;
    L_0x0016:
        r2 = -1;
        return r2;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.ChiaAnimeBrowser.f(java.lang.String):int");
    }

    public final void a(WebView webView) {
    }

    public final void b(WebView webView) {
        webView.setWebChromeClient(new b(this));
        webView.setWebViewClient(new f());
    }

    public final ant c() {
        return new anx();
    }

    public final boolean c(String str) {
        return str.contains("chia-anime.tv/show/");
    }

    public final boolean d(String str) {
        return str.contains("chia-anime.tv/view/") && str.contains("episode");
    }

    public final void e(String str) {
        a(f(str));
    }
}
