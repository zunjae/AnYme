package com.zunjae.anyme.activities.browsers;

final class j implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ h b;

    j(h hVar, String str) {
        this.b = hVar;
        this.a = str;
    }

    public final void run() {
        this.b.a.c.evaluateJavascript(this.a, null);
    }
}
