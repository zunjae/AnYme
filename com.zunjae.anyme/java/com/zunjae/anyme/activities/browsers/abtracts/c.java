package com.zunjae.anyme.activities.browsers.abtracts;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import defpackage.ajb;
import defpackage.ajf;
import defpackage.ajg;
import defpackage.anh;
import defpackage.bid;
import java.util.Iterator;
import java.util.Map.Entry;

public class c extends ajb {
    final /* synthetic */ AbstractAnimeBrowser b;

    public c(AbstractAnimeBrowser abstractAnimeBrowser) {
        this.b = abstractAnimeBrowser;
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.b.w = str;
        String toLowerCase = str.toLowerCase();
        if (this.b.c(toLowerCase)) {
            this.b.c().a(str, this.b.d.d());
        }
        if (this.b.d(toLowerCase)) {
            AbstractAnimeBrowser abstractAnimeBrowser = this.b;
            abstractAnimeBrowser.a(abstractAnimeBrowser.c);
            if (!this.b.x) {
                abstractAnimeBrowser = this.b;
                abstractAnimeBrowser.c(abstractAnimeBrowser.c);
                this.b.x = true;
            }
        }
        if (bid.b(this.b.p)) {
            Iterator it = this.b.p.iterator();
            while (it.hasNext()) {
                anh anh = (anh) it.next();
                if (!anh.c() || toLowerCase.contains(anh.a())) {
                    this.b.c.evaluateJavascript(anh.b(), null);
                }
            }
        }
        for (Entry entry : this.b.f().entrySet()) {
            String str2 = (String) entry.getKey();
            String str3 = (String) entry.getValue();
            if (str.equalsIgnoreCase(str2)) {
                this.b.c.stopLoading();
                this.b.c.loadUrl(str3, ajg.a());
            }
        }
        AbstractAnimeBrowser abstractAnimeBrowser2 = this.b;
        abstractAnimeBrowser2.d(abstractAnimeBrowser2.c);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (this.b.d(str)) {
            this.b.e(str);
        }
        if (!ajf.a(str)) {
            this.b.e.setSubtitle(str);
        }
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str.endsWith("?autostart=true")) {
            str = str.replace("?autostart=true", "?autostart=false");
        }
        if (str.contains("https://www.rapidvideo.com/e/") && this.b.v) {
            AbstractAnimeBrowser abstractAnimeBrowser = this.b;
            new d(abstractAnimeBrowser, abstractAnimeBrowser.t, str).f();
            return ajb.a();
        }
        if (ajf.a(str)) {
            abstractAnimeBrowser = this.b;
            if (abstractAnimeBrowser.i) {
                AbstractAnimeBrowser.a(abstractAnimeBrowser, str);
            }
        }
        return super.shouldInterceptRequest(webView, str);
    }
}
