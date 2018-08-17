package com.zunjae.anyme.activities.browsers;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ajg;

final class m extends WebChromeClient {
    final /* synthetic */ SearchResultsBrowser a;

    m(SearchResultsBrowser searchResultsBrowser) {
        this.a = searchResultsBrowser;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.a.progressBar);
    }
}
