package defpackage;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

public abstract class aiz extends WebChromeClient {
    private ProgressBar a;

    public aiz(ProgressBar progressBar) {
        this.a = progressBar;
    }

    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        ajg.a(i, this.a);
    }
}
