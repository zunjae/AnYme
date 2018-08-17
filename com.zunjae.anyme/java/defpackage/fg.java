package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

final class fg extends WeakReference<fn<?>> {
    private final eg a;

    public fg(eg egVar, fn<?> fnVar, ReferenceQueue<? super fn<?>> referenceQueue) {
        super(fnVar, referenceQueue);
        this.a = egVar;
    }
}
