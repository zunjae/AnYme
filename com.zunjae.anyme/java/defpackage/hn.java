package defpackage;

enum hn extends hl {
    hn(String str, int i) {
        super(str, i);
    }

    protected final void handle(Throwable th) {
        super.handle(th);
        throw new RuntimeException(th);
    }
}
