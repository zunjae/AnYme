package com.zunjae.anyme.activities.browsers;

import android.app.Activity;
import android.arch.lifecycle.as;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractBrowser;
import com.zunjae.anyme.rewrite.viewmodels.AnimeViewModel;
import defpackage.ajc;
import defpackage.alg;
import defpackage.alv;
import defpackage.are;
import defpackage.aty;
import defpackage.aub;
import defpackage.aul;
import java.util.ArrayList;
import me.zhanghai.android.materialprogressbar.BuildConfig;
import mehdi.sakout.fancybuttons.FancyButton;

public class SearchResultsBrowser extends AbstractBrowser {
    @BindString
    String DESKTOP_USERAGENT;
    @BindView
    FancyButton addToPTWButton;
    private final String i = getClass().getSimpleName();
    private final ArrayList<Integer> j = new ArrayList();
    private alv k;
    private AnimeViewModel l;
    private int m = -1;
    @BindView
    ProgressBar progressBar;
    @BindView
    Toolbar toolbar;

    private /* synthetic */ void a(alg alg) {
        if (alg.c()) {
            Toast.makeText(this.b, "Added this Anime to your Plan to Watch", 1).show();
            this.j.add(Integer.valueOf(this.m));
            this.m = -1;
            this.addToPTWButton.setVisibility(8);
            return;
        }
        aub.a((Activity) this, alg);
    }

    @OnClick
    public void onAddToPTWButtonClicked() {
        int i = this.m;
        if (i > 0) {
            new aty(this, are.a((long) i, BuildConfig.FLAVOR, null), this.l, new -$$Lambda$SearchResultsBrowser$LD0kYDO3PG8qSpf5dQhvAIBQP-E(this)).f();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Incorrect id ");
        stringBuilder.append(this.m);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_searchresultbrowser);
        ButterKnife.a(this);
        this.l = (AnimeViewModel) as.a(this).a(AnimeViewModel.class);
        this.k = (alv) getIntent().getParcelableExtra("animeSearchResult");
        a(this.toolbar, "Advanced Search");
        this.c = (WebView) findViewById(R.id.searchResultsWebView);
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setBuiltInZoomControls(true);
        settings.setDisplayZoomControls(false);
        settings.setUserAgentString(this.DESKTOP_USERAGENT);
        settings.setDomStorageEnabled(true);
        this.c.setWebViewClient(new ajc(new l(this)));
        this.c.setWebChromeClient(new m(this));
        this.c.loadUrl(this.k.b());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.menu_activity_basic_browser, menu);
        new aul(this).g(menu);
        return true;
    }
}
