package com.zunjae.anyme.activities.browsers.nsfw;

import android.view.Menu;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractNSFWBrowser;

public final class HABrowser extends AbstractNSFWBrowser {
    private final String j = getClass().getSimpleName();

    protected final String c(String str) {
        return null;
    }

    public final void c() {
        super.c();
        this.c.setWebViewClient(new a());
    }

    public final String f() {
        return "https://hanime.tv/";
    }

    public final String g() {
        return "HAnime";
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.item_go_homepage).setVisible(false);
        return true;
    }
}
