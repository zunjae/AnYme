package com.zunjae.anyme.activities.browsers.nsfw;

import android.content.Intent;
import android.view.Menu;
import com.zunjae.anyme.R;
import com.zunjae.anyme.activities.browsers.abtracts.AbstractNSFWBrowser;
import com.zunjae.anyme.services.HHCustomJSService;
import defpackage.ano;
import defpackage.aux;

public final class HHBrowser extends AbstractNSFWBrowser {
    private final String j = getClass().getSimpleName();
    private final boolean k = aux.b("KEY_SHOULD_USE_ADVANCED_ADBLOCKER", true);
    private boolean l = false;

    protected final String c(String str) {
        return "http://hentaihaven.org/search/".concat(String.valueOf(str));
    }

    public final void c() {
        super.c();
        this.l = ano.a(this.b);
        if (!this.l) {
            startService(new Intent(this, HHCustomJSService.class));
        }
        this.c.setWebViewClient(new b());
    }

    protected final String d() {
        return "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";
    }

    public final String f() {
        return "http://hentaihaven.org/";
    }

    public final String g() {
        return "HentaiHaven";
    }

    public final boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.item_go_homepage).setVisible(false);
        return true;
    }
}
