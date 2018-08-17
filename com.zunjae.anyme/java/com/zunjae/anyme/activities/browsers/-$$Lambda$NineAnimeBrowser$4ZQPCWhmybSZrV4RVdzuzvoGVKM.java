package com.zunjae.anyme.activities.browsers;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$NineAnimeBrowser$4ZQPCWhmybSZrV4RVdzuzvoGVKM implements ValueCallback {
    private final /* synthetic */ WebView f$0;

    public /* synthetic */ -$$Lambda$NineAnimeBrowser$4ZQPCWhmybSZrV4RVdzuzvoGVKM(WebView webView) {
        this.f$0 = webView;
    }

    public final void onReceiveValue(Object obj) {
        NineAnimeBrowser.a(this.f$0, (String) obj);
    }
}
