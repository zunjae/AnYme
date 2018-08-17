package com.zunjae.anyme.activities.browsers.light_browsers;

final class b implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ a b;

    b(a aVar, String str) {
        this.b = aVar;
        this.a = str;
    }

    public final void run() {
        KissAsianBrowser kissAsianBrowser = this.b.a;
        kissAsianBrowser.a(this.a, kissAsianBrowser.c.getTitle());
    }
}
