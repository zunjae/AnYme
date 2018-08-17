package com.zunjae.anyme.activities.browsers;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.c;
import defpackage.ajg;

final class h extends c {
    final /* synthetic */ KissBrowser a;
    private final String c;
    private final String d;

    private h(KissBrowser kissBrowser) {
        this.a = kissBrowser;
        super(kissBrowser);
        this.c = "CustomKissAnimeClient";
        this.d = "kissanime.ru/";
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str.toLowerCase().contains("/m/anime/")) {
            if (this.a.d.v() != 2 || this.a.d.f()) {
                this.a.c.evaluateJavascript(ajg.a("<AnYme>handle_scroll_to_episode</AnYme>"), null);
            } else {
                this.a.c.evaluateJavascript("javascript: document.querySelector('[class=\"underline\"]').scrollIntoView()", null);
            }
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (str.contains("GetEpisode")) {
            this.a.c.post(new i(this, ajg.a("<AnYme>handle_episode_download</AnYme>")));
            this.a.c.post(new j(this, ajg.a("<AnYme>handle_episode_number</AnYme>")));
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.endsWith("kissanime.ru/")) {
            return super.shouldOverrideUrlLoading(webView, str);
        }
        this.a.c.loadUrl(this.a.k.a(this.a.d.d(), this.a.d.g()), ajg.a());
        return true;
    }
}
