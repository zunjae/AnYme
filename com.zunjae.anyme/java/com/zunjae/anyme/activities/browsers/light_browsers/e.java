package com.zunjae.anyme.activities.browsers.light_browsers;

import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ajg;
import defpackage.alo;
import defpackage.bit;
import org.jsoup.Jsoup;

final class e extends WebChromeClient {
    final /* synthetic */ LightKissBrowser a;

    private e(LightKissBrowser lightKissBrowser) {
        this.a = lightKissBrowser;
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        jsResult.confirm();
        if (str2.contains("<AnYme>handle_save_to_history</AnYme>")) {
            alo alo = new alo(Jsoup.parse(str2).select("#divContentList > article > div.post-content > h2 > a").text(), str);
            boolean c = bit.c(alo.b());
            boolean c2 = bit.c(alo.c());
            Object obj = null;
            Object obj2 = (alo.c().endsWith("/m") || alo.c().endsWith("m/") || alo.c().endsWith("&sort=search")) ? null : 1;
            boolean contains = alo.c().contains("kissanime");
            boolean contains2 = alo.c().contains("/m/anime");
            if (c && c2 && obj2 != null && contains && contains2) {
                obj = 1;
            }
            if (obj != null) {
                this.a.a(alo);
            }
        }
        return true;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.a.j);
    }
}
