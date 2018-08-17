package com.zunjae.anyme.activities.browsers.nsfw;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.g;

final class e extends g {
    final /* synthetic */ SHMBrowser b;
    private final String c;
    private final String d;

    private e(SHMBrowser sHMBrowser) {
        this.b = sHMBrowser;
        super(sHMBrowser);
        this.c = "javascript: document.querySelector(\"[class^='pum pum-overlay pum-theme']\").remove();";
        this.d = "javascript: document.getElementById('main-nav').remove();";
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str.toLowerCase().contains("http://streamhentaimovies.com")) {
            this.b.c.evaluateJavascript("javascript: document.querySelector(\"[class^='pum pum-overlay pum-theme']\").remove();", null);
            this.b.c.evaluateJavascript("javascript: document.getElementById('main-nav').remove();", null);
        }
    }
}
