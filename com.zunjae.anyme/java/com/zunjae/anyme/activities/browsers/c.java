package com.zunjae.anyme.activities.browsers;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import defpackage.ajb;
import defpackage.anh;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class c extends com.zunjae.anyme.activities.browsers.abtracts.c {
    final /* synthetic */ AnimePaheBrowser a;

    private c(AnimePaheBrowser animePaheBrowser) {
        this.a = animePaheBrowser;
        super(animePaheBrowser);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str.toLowerCase().equals(this.a.k.a(this.a.d.d(), this.a.d.g()).toLowerCase())) {
            if (this.a.d.g().toUpperCase().replaceAll("[^A-Za-z]+", BuildConfig.FLAVOR).length() > 0) {
                this.a.c.evaluateJavascript(anh.b(String.format("a[href=\"#%s\"]", new Object[]{Character.valueOf(this.a.d.g().toUpperCase().replaceAll("[^A-Za-z]+", BuildConfig.FLAVOR).charAt(0))})), null);
            }
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return str.matches("^.*=[0-9]{1,6},[0-9]{1,6}.*$") ? ajb.a() : (str.contains("d.upld.me") && str.endsWith(".jpg")) ? ajb.a() : super.shouldInterceptRequest(webView, str);
    }
}
