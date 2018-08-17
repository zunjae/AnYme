package com.zunjae.anyme.activities.browsers.nsfw;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.g;

final class d extends g {
    final /* synthetic */ HPBrowser b;

    private d(HPBrowser hPBrowser) {
        this.b = hPBrowser;
        super(hPBrowser);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        str.toLowerCase();
    }
}
