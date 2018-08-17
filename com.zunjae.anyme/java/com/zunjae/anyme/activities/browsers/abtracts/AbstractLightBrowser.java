package com.zunjae.anyme.activities.browsers.abtracts;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.zunjae.anyme.R;
import com.zunjae.anyme.dialogs.animeDialog.VideoHistoryDialog;
import defpackage.alo;
import defpackage.anr;
import defpackage.aui;
import defpackage.aul;
import defpackage.aun;
import defpackage.aux;
import defpackage.avf;
import java.util.Iterator;

public abstract class AbstractLightBrowser extends AbstractBrowser {
    protected Toolbar i;
    protected ProgressBar j;

    protected final void a(alo alo) {
        Object obj;
        String c = c();
        Iterator it = anr.a(c).iterator();
        while (it.hasNext()) {
            if (((alo) it.next()).e().equals(alo.e())) {
                obj = 1;
                break;
            }
        }
        obj = null;
        if (obj == null) {
            aux.c(c, alo, alo.class);
        }
    }

    protected abstract String c();

    @SuppressLint({"SetJavaScriptEnabled"})
    protected void d() {
        this.c = (WebView) findViewById(R.id.webView);
        WebSettings settings = this.c.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setDomStorageEnabled(true);
        settings.setUserAgentString(this.d);
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_kissbrowser);
        this.i = (Toolbar) findViewById(R.id.toolbar);
        this.j = (ProgressBar) findViewById(R.id.browserProgressBar);
        a(this.i, "Loading...", "Please wait...", true);
        d();
        if (avf.e()) {
            aun.b();
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity_videobrowser, menu);
        new aul(this).b(menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == R.id.history_item) {
            if (anr.a(c()).size() > 0) {
                VideoHistoryDialog.a(c()).show(getSupportFragmentManager(), "VideoHistoryDialog");
            } else {
                Toast.makeText(this.b, "No shows found in your history", 1).show();
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public void onStart() {
        super.onStart();
        aui.a().a((Object) this);
    }

    public void onStop() {
        super.onStop();
        aui.a().b((Object) this);
    }
}
