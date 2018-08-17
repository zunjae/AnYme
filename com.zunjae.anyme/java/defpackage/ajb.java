package defpackage;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public abstract class ajb extends WebViewClient {
    private static final ByteArrayInputStream a = new ByteArrayInputStream(BuildConfig.FLAVOR.getBytes());

    protected static WebResourceResponse a() {
        return new WebResourceResponse("text/plain", "UTF-8", a);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
    }

    @TargetApi(21)
    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        webResourceRequest.getUrl();
        return ajd.a(webResourceRequest.getUrl().toString()) ? ajb.a() : super.shouldInterceptRequest(webView, webResourceRequest);
    }

    @TargetApi(20)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return ajd.a(str) ? ajb.a() : super.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        webView.loadUrl(str, ajg.a());
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
