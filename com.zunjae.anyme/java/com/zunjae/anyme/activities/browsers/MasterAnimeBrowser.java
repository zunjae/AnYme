package com.zunjae.anyme.activities.browsers;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.b;
import com.zunjae.anyme.activities.browsers.abtracts.c;
import defpackage.ant;
import defpackage.aoa;

public final class MasterAnimeBrowser extends AbstractAnimeBrowser {
    private static int f(java.lang.String r1) {
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
        r0 = "/";	 Catch:{ Exception -> 0x0010 }
        r1 = r1.split(r0);	 Catch:{ Exception -> 0x0010 }
        r0 = r1.length;	 Catch:{ Exception -> 0x0010 }
        r0 = r0 + -1;	 Catch:{ Exception -> 0x0010 }
        r1 = r1[r0];	 Catch:{ Exception -> 0x0010 }
        r1 = java.lang.Integer.parseInt(r1);	 Catch:{ Exception -> 0x0010 }
        return r1;
    L_0x0010:
        r1 = -1;
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.MasterAnimeBrowser.f(java.lang.String):int");
    }

    public final void a(WebView webView) {
    }

    public final void b(WebView webView) {
        webView.setWebChromeClient(new b(this));
        webView.setWebViewClient(new c(this));
    }

    public final ant c() {
        return new aoa();
    }

    public final boolean c(String str) {
        return str.contains("masterani.me/anime/info/");
    }

    public final boolean d(String str) {
        return str.contains("/anime/watch/");
    }

    public final void e(String str) {
        a(f(str));
    }
}
