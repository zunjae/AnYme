package defpackage;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class axj implements ThreadFactory {
    private final AtomicInteger a = new AtomicInteger(1);

    axj() {
    }

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder("AsyncTask #");
        stringBuilder.append(this.a.getAndIncrement());
        return new Thread(runnable, stringBuilder.toString());
    }
}
