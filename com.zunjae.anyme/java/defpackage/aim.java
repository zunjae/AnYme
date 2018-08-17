package defpackage;

import java.util.concurrent.ConcurrentLinkedQueue;

final class aim extends ThreadLocal<ConcurrentLinkedQueue<aio>> {
    final /* synthetic */ ail a;

    aim(ail ail) {
        this.a = ail;
    }

    protected final /* synthetic */ Object initialValue() {
        return new ConcurrentLinkedQueue();
    }
}
