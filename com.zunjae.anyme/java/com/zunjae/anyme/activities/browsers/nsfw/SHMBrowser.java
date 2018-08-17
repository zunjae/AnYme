package com.zunjae.anyme.activities.browsers.nsfw;

import com.zunjae.anyme.activities.browsers.abtracts.AbstractNSFWBrowser;

public final class SHMBrowser extends AbstractNSFWBrowser {
    private final String j = getClass().getSimpleName();

    protected final String c(String str) {
        return "http://streamhentaimovies.com/";
    }

    public final void c() {
        super.c();
        this.c.setWebViewClient(new e());
    }

    protected final String d() {
        return "Mozilla/5.0 (iPhone; CPU iPhone OS 6_0 like Mac OS X) AppleWebKit/536.26 (KHTML, like Gecko) Version/6.0 Mobile/10A5376e Safari/8536.25";
    }

    public final String f() {
        return "http://streamhentaimovies.com/";
    }

    public final String g() {
        return "StreamHentaiMovies";
    }
}
