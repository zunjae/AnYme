package com.zunjae.anyme.activities.browsers;

import android.webkit.WebView;
import com.zunjae.anyme.activities.browsers.abtracts.c;

final class g extends c {
    final /* synthetic */ GoGoBrowser a;

    private g(GoGoBrowser goGoBrowser) {
        this.a = goGoBrowser;
        super(goGoBrowser);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        str = str.toLowerCase();
        if (str.contains("gogoanime") && str.contains("episode-")) {
            webView.evaluateJavascript("javascript: document.getElementsByClassName('open')[0].style.display = \"none\";", null);
            webView.evaluateJavascript("document.querySelector(\"li[class='anime']\").style.display=\"none\";", null);
            webView.evaluateJavascript("javascript: document.getElementsByClassName('bestream')[0].style.display = \"none\";", null);
            webView.evaluateJavascript("javascript: document.getElementsByClassName('your')[0].style.display = \"none\";", null);
            webView.evaluateJavascript("javascript: document.getElementsByClassName('open')[1].style.display = \"none\";", null);
        }
    }
}
