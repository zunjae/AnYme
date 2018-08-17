package com.afollestad.materialdialogs;

final class l implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ k b;

    l(k kVar, int i) {
        this.b = kVar;
        this.a = i;
    }

    public final void run() {
        this.b.a.g.requestFocus();
        this.b.a.b.X.scrollToPosition(this.a);
    }
}
