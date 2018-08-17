package defpackage;

public final class mx<R> implements ms<R> {
    private final mw a;
    private mq<R> b;

    mx(mw mwVar) {
        this.a = mwVar;
    }

    public final mq<R> a(boolean z, boolean z2) {
        if (!z) {
            if (z2) {
                if (this.b == null) {
                    this.b = new mv(this.a);
                }
                return this.b;
            }
        }
        return mt.b();
    }
}
