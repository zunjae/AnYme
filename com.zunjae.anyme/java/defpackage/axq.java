package defpackage;

final class axq implements Runnable {
    final /* synthetic */ Runnable a;
    final /* synthetic */ axp b;

    axq(axp axp, Runnable runnable) {
        this.b = axp;
        this.a = runnable;
    }

    public final void run() {
        try {
            this.a.run();
        } finally {
            this.b.a();
        }
    }
}
