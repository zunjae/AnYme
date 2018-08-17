package com.zunjae.anyme.activities.browsers.light_browsers;

import android.graphics.Bitmap;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import defpackage.ajb;
import defpackage.ajf;
import defpackage.ajg;
import defpackage.aux;
import defpackage.bit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class d extends ajb {
    final /* synthetic */ LightKissBrowser a;

    private d(LightKissBrowser lightKissBrowser) {
        this.a = lightKissBrowser;
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        this.a.o = str;
        if (!ajf.a(str)) {
            this.a.i.setSubtitle(str);
            this.a.i.setTitle(webView.getTitle());
        }
        if (str.toLowerCase().contains("m/anime/")) {
            this.a.c.loadUrl(String.format("javascript: alert(\"%s\" + document.documentElement.innerHTML);", new Object[]{"<AnYme>handle_save_to_history</AnYme>"}), ajg.a());
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        if (str.toLowerCase().contains("m/anime/")) {
            LightKissBrowser lightKissBrowser = this.a;
            String[] split = str.split("/");
            lightKissBrowser.n = split[split.length - 1].replace("-", " ");
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str.contains("https://www.rapidvideo.com/e/") && aux.b("KEY_SHOULD_INTERCEPT_RAPID_VIDEO", false)) {
            LightKissBrowser lightKissBrowser = this.a;
            new f(lightKissBrowser, lightKissBrowser, str).f();
            return ajb.a();
        }
        if (ajf.a(str) && this.a.g) {
            lightKissBrowser = this.a;
            lightKissBrowser.a(str, lightKissBrowser.n);
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (str.endsWith("kissanime.ru/")) {
            this.a.c.loadUrl(LightKissBrowser.e(), ajg.a());
            return true;
        } else if (!ajf.a(str)) {
            return super.shouldOverrideUrlLoading(webView, str);
        } else {
            if (bit.b(this.a.n)) {
                this.a.a(str, BuildConfig.FLAVOR);
            } else {
                LightKissBrowser lightKissBrowser = this.a;
                lightKissBrowser.a(str, lightKissBrowser.n);
            }
            return true;
        }
    }
}
