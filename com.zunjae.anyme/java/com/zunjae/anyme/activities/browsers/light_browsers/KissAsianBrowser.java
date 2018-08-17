package com.zunjae.anyme.activities.browsers.light_browsers;

import android.view.Menu;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractLightBrowser;
import defpackage.ajg;

public final class KissAsianBrowser extends AbstractLightBrowser {
    protected final String c() {
        return "KissAsianVideo";
    }

    protected final void d() {
        super.d();
        this.c.setWebViewClient(new a());
        this.c.setWebChromeClient(new c());
        this.c.loadUrl("http://kissasian.ch/DramaList/Newest", ajg.a());
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.browser_cast).setVisible(false);
        menu.findItem(R.id.history_item).setVisible(false);
        return true;
    }
}
