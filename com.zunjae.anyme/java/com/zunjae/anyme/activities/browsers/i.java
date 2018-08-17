package com.zunjae.anyme.activities.browsers;

final class i implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ h b;

    i(h hVar, String str) {
        this.b = hVar;
        this.a = str;
    }

    public final void run() {
        this.b.a.c.evaluateJavascript(this.a, null);
    }
}
