package com.zunjae.anyme.activities.browsers.nsfw;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.g;

final class a extends g {
    final /* synthetic */ HABrowser b;

    private a(HABrowser hABrowser) {
        this.b = hABrowser;
        super(hABrowser);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        String toLowerCase = str.toLowerCase();
        if (toLowerCase.contains("hentai-videos")) {
            this.b.c.evaluateJavascript("javascript: document.getElementsByClassName('after-content flex-row justify-center flex-wrap')[0].remove();", null);
            this.b.c.evaluateJavascript("javascript: document.getElementsByClassName('actions-container')[0].remove();", null);
        }
        this.b.c.evaluateJavascript("javascript: document.getElementsByClassName('footer flex-col')[0].remove();", null);
        this.b.c.evaluateJavascript("javascript: document.getElementsByClassName('flex-row justify-center align-center transition-all smart-banner-content')[0].remove();", null);
        if (toLowerCase.contains("hanime.tv/apps") || toLowerCase.contains("contentabc.com")) {
            this.b.c.stopLoading();
            this.b.c.goBack();
        }
    }
}
