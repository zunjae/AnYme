package com.zunjae.anyme.activities.browsers.nsfw;

import android.view.Menu;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractNSFWBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.g;

public final class HGBrowser extends AbstractNSFWBrowser {
    private final String j = getClass().getSimpleName();

    protected final String c(String str) {
        return "http://hentaigasm.com/?s=".concat(String.valueOf(str));
    }

    public final void c() {
        super.c();
        this.c.setWebViewClient(new g(this));
    }

    protected final String d() {
        return "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";
    }

    protected final boolean e() {
        return true;
    }

    public final String f() {
        return "http://hentaigasm.com/";
    }

    public final String g() {
        return "HentaiGasm";
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.item_go_homepage).setVisible(false);
        return true;
    }
}
