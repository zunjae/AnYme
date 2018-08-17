package com.zunjae.anyme.activities.browsers.abtracts;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import defpackage.ajb;
import defpackage.ajf;

public class g extends ajb {
    final /* synthetic */ AbstractNSFWBrowser a;

    public g(AbstractNSFWBrowser abstractNSFWBrowser) {
        this.a = abstractNSFWBrowser;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (!ajf.a(str)) {
            this.a.i.setSubtitle(str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.a.i.setTitle(webView.getTitle());
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (ajf.a(str)) {
            AbstractNSFWBrowser abstractNSFWBrowser = this.a;
            if (abstractNSFWBrowser.g) {
                abstractNSFWBrowser.c.post(new h(this, str));
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
