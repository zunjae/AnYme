package com.zunjae.anyme.activities.browsers.abtracts;

import defpackage.aux;

final class h implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ g b;

    h(g gVar, String str) {
        this.b = gVar;
        this.a = str;
    }

    public final void run() {
        if (aux.b("KEY_ASK_FOR_PLAYBACK", false)) {
            AbstractNSFWBrowser abstractNSFWBrowser = this.b.a;
            AbstractNSFWBrowser.a(abstractNSFWBrowser, this.a, abstractNSFWBrowser.c.getTitle());
            return;
        }
        abstractNSFWBrowser = this.b.a;
        abstractNSFWBrowser.a(this.a, abstractNSFWBrowser.c.getTitle());
    }
}
