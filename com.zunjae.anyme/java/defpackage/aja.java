package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public abstract class aja extends WebViewClient {
    private static final ByteArrayInputStream a = new ByteArrayInputStream(BuildConfig.FLAVOR.getBytes());

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        return ajd.a(webResourceRequest.getUrl().toString()) ? new WebResourceResponse("text/plain", "UTF-8", a) : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str, ajg.a());
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
