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
import defpackage.alb;
import defpackage.bim;
import defpackage.bit;

public final class UserLoginBrowser extends AbstractBrowser {
    private final String i = "https://myanimelist.net/login.php";
    private final String j = UserLoginBrowser.class.getName();
    private String k;
    private String l;
    private boolean m = false;
    @BindView
    ProgressBar progressBar;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, String str, String str2) {
        Intent intent = new Intent(context, UserLoginBrowser.class);
        intent.putExtra("username", str);
        intent.putExtra("password", str2);
        return intent;
    }

    public final void onBackPressed() {
    }

    protected final void onCreate(Bundle bundle) {
        Object obj;
        super.onCreate(bundle);
        setContentView(R.layout.activity_explorebrowser);
        ButterKnife.a(this);
        this.k = getIntent().getStringExtra("username");
        this.l = getIntent().getStringExtra("password");
        CharSequence[] charSequenceArr = new CharSequence[]{this.k, this.l};
        if (!bim.b(charSequenceArr)) {
            int i = 0;
            while (i < 2) {
                if (!bit.b(charSequenceArr[i])) {
                    i++;
                }
            }
            obj = null;
            if (obj != null) {
                alb.a(this.b);
                a(this.toolbar, "Login with your MAL account", null, true);
                this.c = (WebView) findViewById(R.id.exploreBrowserWebView);
                WebSettings settings = this.c.getSettings();
                settings.setJavaScriptEnabled(true);
                settings.setBuiltInZoomControls(false);
                settings.setDisplayZoomControls(false);
                settings.setDomStorageEnabled(true);
                settings.setUserAgentString(this.d);
                this.c.setWebViewClient(new r());
                this.c.setWebChromeClient(new q(this));
                this.c.loadUrl("https://myanimelist.net/login.php");
            }
            throw new IllegalArgumentException("Incorrectly set the intent");
        }
        obj = 1;
        if (obj != null) {
            throw new IllegalArgumentException("Incorrectly set the intent");
        }
        alb.a(this.b);
        a(this.toolbar, "Login with your MAL account", null, true);
        this.c = (WebView) findViewById(R.id.exploreBrowserWebView);
        WebSettings settings2 = this.c.getSettings();
        settings2.setJavaScriptEnabled(true);
        settings2.setBuiltInZoomControls(false);
        settings2.setDisplayZoomControls(false);
        settings2.setDomStorageEnabled(true);
        settings2.setUserAgentString(this.d);
        this.c.setWebViewClient(new r());
        this.c.setWebChromeClient(new q(this));
        this.c.loadUrl("https://myanimelist.net/login.php");
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.browser_cast).setVisible(false);
        menu.findItem(R.id.browser_downloader).setVisible(false);
        return true;
    }
}
