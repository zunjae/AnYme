package com.zunjae.anyme.activities.browsers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractBrowser;
import defpackage.ajc;

public final class BasicWebViewBrowser extends AbstractBrowser {
    private final String i = "BasicWebViewBrowser";
    private String j;
    @BindView
    ProgressBar progressBar;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, String str) {
        Intent intent = new Intent(context, BasicWebViewBrowser.class);
        intent.putExtra("url", str);
        return intent;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_explorebrowser);
        ButterKnife.a(this);
        this.j = getIntent().getStringExtra("url");
        a(this.toolbar, "Please wait...", "Loading page...", true);
        this.c = (WebView) findViewById(R.id.exploreBrowserWebView);
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(false);
        settings.setDisplayZoomControls(false);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(this.d);
        this.c.setWebViewClient(new ajc(new d(this)));
        this.c.setWebChromeClient(new e(this));
        this.c.loadUrl(this.j);
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.browser_cast).setVisible(false);
        menu.findItem(R.id.browser_downloader).setVisible(false);
        return true;
    }
}
