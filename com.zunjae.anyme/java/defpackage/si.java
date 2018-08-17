package defpackage;

import java.util.concurrent.Callable;

final class si implements Callable<Boolean> {
    private final sk a;

    public si(sk skVar) {
        this.a = skVar;
    }

    public final /* synthetic */ Object call() {
        if (!this.a.b()) {
            return Boolean.FALSE;
        }
        avf.c();
        this.a.c();
        return Boolean.TRUE;
    }
}
