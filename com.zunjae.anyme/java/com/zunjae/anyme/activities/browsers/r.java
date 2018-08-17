package com.zunjae.anyme.activities.browsers;

import android.webkit.CookieManager;
import android.webkit.WebView;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import defpackage.ajb;
import defpackage.anh;
import defpackage.anp;
import defpackage.aux;

final class r extends ajb {
    final /* synthetic */ UserLoginBrowser a;

    private r(UserLoginBrowser userLoginBrowser) {
        this.a = userLoginBrowser;
    }

    private /* synthetic */ void a(j jVar, e eVar) {
        this.a.m = true;
    }

    private /* synthetic */ void b() {
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
        r0 = new com.afollestad.materialdialogs.o;	 Catch:{ Exception -> 0x0023 }
        r1 = r2.a;	 Catch:{ Exception -> 0x0023 }
        r0.<init>(r1);	 Catch:{ Exception -> 0x0023 }
        r1 = "Notice";	 Catch:{ Exception -> 0x0023 }
        r0 = r0.a(r1);	 Catch:{ Exception -> 0x0023 }
        r1 = "Click on the login button to authorize AnYme with MyAnimeList";	 Catch:{ Exception -> 0x0023 }
        r0 = r0.b(r1);	 Catch:{ Exception -> 0x0023 }
        r0 = r0.d();	 Catch:{ Exception -> 0x0023 }
        r1 = new com.zunjae.anyme.activities.browsers.-$$Lambda$r$vqqnc4B1OZt5nBCNBbt3qcYB0_I;	 Catch:{ Exception -> 0x0023 }
        r1.<init>(r2);	 Catch:{ Exception -> 0x0023 }
        r0 = r0.a(r1);	 Catch:{ Exception -> 0x0023 }
        r0.l();	 Catch:{ Exception -> 0x0023 }
    L_0x0023:
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zunjae.anyme.activities.browsers.r.b():void");
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        String toLowerCase = str.toLowerCase();
        if (toLowerCase.equals("https://myanimelist.net/login.php")) {
            this.a.c.evaluateJavascript(anh.a("#loginUserName", this.a.k), null);
            this.a.c.evaluateJavascript(anh.a("#password", this.a.l), null);
            if (!this.a.m) {
                this.a.runOnUiThread(new -$$Lambda$r$eCySPUVGkO6YDVG2LvaCq8iAnME(this));
            }
        }
        if (toLowerCase.equals(aux.b("KEY_LOGIN_SUCCESS_ENDPOINT", "https://myanimelist.net/"))) {
            toLowerCase = CookieManager.getInstance().getCookie(toLowerCase);
            if (toLowerCase != null && toLowerCase.contains("MALHLOGSESSID")) {
                anp.a(toLowerCase);
                this.a.setResult(1);
                this.a.finish();
            }
        }
    }
}
