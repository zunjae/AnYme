package defpackage;

import java.util.concurrent.ThreadFactory;

public final class hi implements ThreadFactory {
    int a = 0;

    public final Thread newThread(Runnable runnable) {
        StringBuilder stringBuilder = new StringBuilder("fifo-pool-thread-");
        stringBuilder.append(this.a);
        Thread hjVar = new hj(this, runnable, stringBuilder.toString());
        this.a++;
        return hjVar;
    }
}
