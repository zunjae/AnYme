package com.zunjae.anyme.activities.browsers;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ajg;

final class e extends WebChromeClient {
    final /* synthetic */ BasicWebViewBrowser a;

    e(BasicWebViewBrowser basicWebViewBrowser) {
        this.a = basicWebViewBrowser;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.a.progressBar);
    }
}
