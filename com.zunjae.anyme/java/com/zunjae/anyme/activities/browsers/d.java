package com.zunjae.anyme.activities.browsers;

import android.widget.Toast;
import defpackage.ajh;

final class d implements ajh {
    final /* synthetic */ BasicWebViewBrowser a;

    d(BasicWebViewBrowser basicWebViewBrowser) {
        this.a = basicWebViewBrowser;
    }

    private /* synthetic */ void d(String str) {
        if (str.toLowerCase().contains("https://www.reddit.com/error")) {
            Toast.makeText(this.a.b, "Unable to load data from Reddit. Please refresh and it'll probably work again (Reddit's search servers overloaded)", 1).show();
        }
    }

    public final void a(String str) {
        this.a.toolbar.setSubtitle(str);
    }

    public final void b(String str) {
        this.a.toolbar.setTitle(str);
    }

    public final void c(String str) {
        this.a.runOnUiThread(new -$$Lambda$d$5yUy9eE9UkJf0YAq9bZKXxn-sf4(this, str));
    }
}
