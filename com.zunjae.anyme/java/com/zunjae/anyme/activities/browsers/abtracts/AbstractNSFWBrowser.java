package com.zunjae.anyme.activities.browsers.abtracts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.Toolbar;
import android.text.Html;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.zunjae.anyme.R;
import defpackage.ajg;
import defpackage.anl;
import defpackage.aul;
import defpackage.bit;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public abstract class AbstractNSFWBrowser extends AbstractBrowser {
    protected Toolbar i;
    private ProgressBar j;
    private Snackbar k;
    private String l = BuildConfig.FLAVOR;

    public static Intent a(Context context, Class cls, String str) {
        Intent intent = new Intent(context, cls);
        intent.putExtra("customSearchQuery", str);
        return intent;
    }

    static /* synthetic */ void a(AbstractNSFWBrowser abstractNSFWBrowser, String str, String str2) {
        Snackbar snackbar = abstractNSFWBrowser.k;
        if (snackbar != null && snackbar.isShown()) {
            abstractNSFWBrowser.k.dismiss();
        }
        abstractNSFWBrowser.k = Snackbar.make(abstractNSFWBrowser.findViewById(R.id.myCoordinatorLayout), Html.fromHtml("<font color=\"#ffffff\">Open in videoplayer app</font>"), -2).setAction("PLAY", new -$$Lambda$AbstractNSFWBrowser$E5tI62FBAFQHfpNx38KTtts3ywU(abstractNSFWBrowser, str, str2)).setActionTextColor(ContextCompat.getColor(abstractNSFWBrowser.b, R.color.md_white_1000));
        abstractNSFWBrowser.k.show();
    }

    private /* synthetic */ void a(String str, String str2, View view) {
        a(str, str2);
    }

    protected abstract String c(String str);

    @SuppressLint({"SetJavaScriptEnabled"})
    protected void c() {
        this.c = (WebView) findViewById(R.id.webView);
        WebSettings settings = this.c.getSettings();
        if (e()) {
            settings.setSupportZoom(true);
            settings.setBuiltInZoomControls(false);
        }
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(d());
        this.c.setWebChromeClient(new i(this, this.j));
    }

    protected String d() {
        return "Mozilla/5.0 (Linux; U; Android 4.4.4; Nexus 5 Build/KTU84P) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
    }

    protected boolean e() {
        return false;
    }

    protected abstract String f();

    protected abstract String g();

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_abstract_browser);
        if (anl.b(this.b)) {
            throw new IllegalArgumentException("Not supposed to enter this... WTF");
        }
        WebView webView;
        String c;
        this.i = (Toolbar) findViewById(R.id.toolbar);
        this.j = (ProgressBar) findViewById(R.id.browserProgressBar);
        this.c = (WebView) findViewById(R.id.webView);
        if (getIntent() != null) {
            this.l = getIntent().getStringExtra("customSearchQuery");
        }
        a(this.i, g());
        c();
        if (bit.c(this.l)) {
            webView = this.c;
            c = c(this.l);
        } else {
            webView = this.c;
            c = f();
        }
        webView.loadUrl(c, ajg.a());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_activity_abstractnsfwbrowser, menu);
        new aul(this).h(menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.item_go_homepage) {
            this.c.stopLoading();
            this.c.loadUrl(f());
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
