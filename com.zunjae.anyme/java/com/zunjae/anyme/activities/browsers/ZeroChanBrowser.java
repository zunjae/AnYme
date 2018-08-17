package com.zunjae.anyme.activities.browsers;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.widget.ProgressBar;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractBrowser;
import com.zunjae.anyme.dialogs.ADMWarningDialog;
import defpackage.ajg;
import defpackage.are;
import defpackage.aux;
import defpackage.bit;

public final class ZeroChanBrowser extends AbstractBrowser {
    private final String i = getClass().getSimpleName();
    private final String j = "Anime Photos";
    private final String k = "<AnYme>handle_get_images</AnYme>";
    private boolean l = true;
    private boolean m = true;
    private String n;
    private are o;
    @BindView
    ProgressBar progressBar;
    @BindView
    Toolbar toolbar;

    public static Intent a(Context context, are are, String str) {
        Intent intent = new Intent(context, ZeroChanBrowser.class);
        intent.putExtra("anime", are);
        intent.putExtra("zeroChanURL", str);
        return intent;
    }

    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_zerochanbrowser);
        ButterKnife.a(this);
        this.o = (are) getIntent().getParcelableExtra("anime");
        this.n = getIntent().getStringExtra("zeroChanURL");
        this.l = aux.b("preference_key_zerochan_high_quality", true);
        this.m = aux.b("preference_key_zerochan_separate_images", true);
        if (this.o == null || bit.b(this.n)) {
            throw new IllegalArgumentException("Incorrectly set the arguments");
        }
        a(this.toolbar, this.o.g());
        this.c = (WebView) findViewById(R.id.webView);
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(this.d);
        registerForContextMenu(this.c);
        this.c.setWebViewClient(new u());
        this.c.setWebChromeClient(new t());
        this.c.loadUrl(this.n);
    }

    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        HitTestResult hitTestResult = this.c.getHitTestResult();
        OnMenuItemClickListener sVar = new s(this, hitTestResult.getExtra());
        if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
            contextMenu.setHeaderTitle(hitTestResult.getExtra());
            contextMenu.add(0, 100, 0, "Download Image").setOnMenuItemClickListener(sVar);
            contextMenu.add(0, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSearchResultTitle, 0, "Set as Toolbar Image").setOnMenuItemClickListener(sVar);
            contextMenu.add(0, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textColorAlertDialogListItem, 0, "Copy URL to clipboard").setOnMenuItemClickListener(sVar);
            contextMenu.add(0, me.zhanghai.android.materialprogressbar.R.styleable.AppCompatTheme_textAppearanceSmallPopupMenu, 0, "Share Image URL").setOnMenuItemClickListener(sVar);
        }
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.browser_cast).setVisible(false);
        return true;
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.browser_downloader) {
            return super.onOptionsItemSelected(menuItem);
        }
        if (ADMWarningDialog.a()) {
            new ADMWarningDialog().show(getSupportFragmentManager(), "GENERIC");
        }
        this.c.loadUrl(ajg.a("<AnYme>handle_get_images</AnYme>"));
        return true;
    }
}
