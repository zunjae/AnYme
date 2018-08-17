package com.zunjae.anyme.activities.browsers.light_browsers;

import android.webkit.WebView;
import defpackage.aiz;
import defpackage.ajg;

final class c extends aiz {
    final /* synthetic */ KissAsianBrowser a;

    private c(KissAsianBrowser kissAsianBrowser) {
        this.a = kissAsianBrowser;
    }

    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.a.j);
    }
}
