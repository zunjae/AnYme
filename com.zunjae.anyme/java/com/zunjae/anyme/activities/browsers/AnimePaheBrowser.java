package com.zunjae.anyme.activities.browsers;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractAnimeBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.b;
import defpackage.anh;
import defpackage.ant;
import defpackage.anw;
import java.util.ArrayList;

public final class AnimePaheBrowser extends AbstractAnimeBrowser {
    private static final String l = "AnimePaheBrowser";
    private anw k = new anw();
    private final String m = "document.getElementById(\"episodeMenu\").innerHTML;";

    public final void a(WebView webView) {
        webView.evaluateJavascript("document.getElementById(\"episodeMenu\").innerHTML;", new b(this));
    }

    public final void b(WebView webView) {
        webView.setWebChromeClient(new b(this));
        webView.setWebViewClient(new c());
    }

    public final ant c() {
        return this.k;
    }

    public final boolean c(String str) {
        return str.contains("animepahe.com/anime/");
    }

    protected final ArrayList<anh> d() {
        ArrayList<anh> arrayList = new ArrayList();
        arrayList.add(new anh("/anime/", anh.a("div[class=\"anime-content\"]")));
        arrayList.add(new anh("/anime/", anh.a("header[class=\"anime-header\"]")));
        arrayList.add(new anh("/anime/", anh.a("nav[class=\"anime-nav\"]")));
        arrayList.add(new anh("animepahe", anh.a("div[class=\"alert alert-top alert-dismissible fade show\"]")));
        return arrayList;
    }

    public final boolean d(String str) {
        return str.contains("animepahe.com/play/");
    }

    protected final String e() {
        return "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";
    }

    public final void e(String str) {
    }
}
