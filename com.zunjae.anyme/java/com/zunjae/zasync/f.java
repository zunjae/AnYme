package com.zunjae.zasync;

final class f implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ c b;

    f(c cVar, Object obj) {
        this.b = cVar;
        this.a = obj;
    }

    public final void run() {
        this.b.a(this.a);
    }
}
