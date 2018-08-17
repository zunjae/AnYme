package com.zunjae.anyme.activities.browsers.abtracts;

import android.support.v7.widget.Toolbar;

final class a implements Runnable {
    final /* synthetic */ Toolbar a;
    final /* synthetic */ String b;
    final /* synthetic */ AbstractAnimeBrowser c;

    a(AbstractAnimeBrowser abstractAnimeBrowser, Toolbar toolbar, String str) {
        this.c = abstractAnimeBrowser;
        this.a = toolbar;
        this.b = str;
    }

    public final void run() {
        this.a.setTitle(this.b);
    }
}
