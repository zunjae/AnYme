package com.zunjae.anyme.activities.browsers;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import defpackage.ajg;

final class q extends WebChromeClient {
    final /* synthetic */ UserLoginBrowser a;

    q(UserLoginBrowser userLoginBrowser) {
        this.a = userLoginBrowser;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.a.progressBar);
    }
}
