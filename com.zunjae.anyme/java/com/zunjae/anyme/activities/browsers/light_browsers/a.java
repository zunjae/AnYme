package com.zunjae.anyme.activities.browsers.light_browsers;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import defpackage.ajb;
import defpackage.ajf;

final class a extends ajb {
    final /* synthetic */ KissAsianBrowser a;

    private a(KissAsianBrowser kissAsianBrowser) {
        this.a = kissAsianBrowser;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (!ajf.a(str)) {
            this.a.i.setSubtitle(str);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (ajf.a(str) && this.a.g) {
            this.a.c.post(new b(this, str));
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
