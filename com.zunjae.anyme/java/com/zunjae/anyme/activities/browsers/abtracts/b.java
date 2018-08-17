package com.zunjae.anyme.activities.browsers.abtracts;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ajg;

public class b extends WebChromeClient {
    final /* synthetic */ AbstractAnimeBrowser b;

    public b(AbstractAnimeBrowser abstractAnimeBrowser) {
        this.b = abstractAnimeBrowser;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.b.f);
    }
}
