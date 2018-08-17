package com.zunjae.anyme.activities.browsers;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.AbstractActivity;

public final class UnKissAnime extends AbstractActivity {
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_unkissanime);
        WebView webView = new WebView(this);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString("Mozilla/5.0 (Linux; U; Android 4.4.4; Nexus 5 Build/KTU84P) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30");
        webView.setWebChromeClient(new o());
        webView.setWebViewClient(new p());
        webView.loadUrl("http://kissanime.ru/M");
    }
}
