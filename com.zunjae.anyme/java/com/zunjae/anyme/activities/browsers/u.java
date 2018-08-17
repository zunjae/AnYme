package com.zunjae.anyme.activities.browsers;

import android.graphics.Bitmap;
import android.webkit.WebView;
import defpackage.ajb;
import defpackage.ajf;

final class u extends ajb {
    final /* synthetic */ ZeroChanBrowser a;

    private u(ZeroChanBrowser zeroChanBrowser) {
        this.a = zeroChanBrowser;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str.endsWith("?m=0")) {
            this.a.c.stopLoading();
            this.a.c.loadUrl(str.replace("?m=0", "?m=1"));
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (!ajf.a(str)) {
            this.a.toolbar.setSubtitle(str);
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return str.endsWith("?m=0") ? super.shouldOverrideUrlLoading(webView, str.replace("?m=0", "?m=1")) : super.shouldOverrideUrlLoading(webView, str);
    }
}
