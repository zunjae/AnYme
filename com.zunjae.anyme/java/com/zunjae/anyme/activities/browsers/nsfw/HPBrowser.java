package com.zunjae.anyme.activities.browsers.nsfw;

import com.zunjae.anyme.activities.browsers.abtracts.AbstractNSFWBrowser;

public final class HPBrowser extends AbstractNSFWBrowser {
    private final String j = getClass().getSimpleName();

    protected final String c(String str) {
        return "http://hentaipulse.com/";
    }

    public final void c() {
        super.c();
        this.c.setWebViewClient(new d());
    }

    protected final String d() {
        return "Mozilla/5.0 (Linux; U; Android 4.4.4; Nexus 5 Build/KTU84P) AppleWebkit/534.30 (KHTML, like Gecko) Version/4.0 Mobile Safari/534.30";
    }

    public final String f() {
        return "http://hentaipulse.com/";
    }

    public final String g() {
        return "Hentai Pulse";
    }
}
