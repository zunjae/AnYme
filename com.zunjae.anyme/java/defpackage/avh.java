package defpackage;

import java.util.concurrent.CountDownLatch;

final class avh implements avl {
    final CountDownLatch a = new CountDownLatch(this.b);
    final /* synthetic */ int b;
    final /* synthetic */ avf c;

    avh(avf avf, int i) {
        this.c = avf;
        this.b = i;
    }

    public final void a() {
        this.a.countDown();
        if (this.a.getCount() == 0) {
            this.c.n.set(true);
            this.c.i.a();
        }
    }

    public final void a(Exception exception) {
        this.c.i.a(exception);
    }
}
