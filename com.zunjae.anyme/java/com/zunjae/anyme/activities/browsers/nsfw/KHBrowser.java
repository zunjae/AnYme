package com.zunjae.anyme.activities.browsers.nsfw;

import android.view.Menu;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractNSFWBrowser;
import com.zunjae.anyme.activities.browsers.abtracts.g;

public final class KHBrowser extends AbstractNSFWBrowser {
    private final String j = getClass().getSimpleName();

    protected final String c(String str) {
        StringBuilder stringBuilder = new StringBuilder("http://kisshentai.net/M");
        stringBuilder.append(String.format("?key=%s&sort=search", new Object[]{str}));
        return stringBuilder.toString();
    }

    public final void c() {
        super.c();
        this.c.setWebViewClient(new g(this));
    }

    protected final String d() {
        return "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";
    }

    public final String f() {
        return "http://kisshentai.net/M";
    }

    public final String g() {
        return "KissHentai";
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.item_go_homepage).setVisible(false);
        return true;
    }
}
