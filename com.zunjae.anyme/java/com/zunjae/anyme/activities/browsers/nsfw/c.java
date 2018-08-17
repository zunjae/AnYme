package com.zunjae.anyme.activities.browsers.nsfw;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.g;

final class c extends g {
    final /* synthetic */ HMBrowser b;

    private c(HMBrowser hMBrowser) {
        this.b = hMBrowser;
        super(hMBrowser);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        if (str.contains("about:blank")) {
            this.b.c.stopLoading();
            this.b.c.goBack();
        }
    }
}
