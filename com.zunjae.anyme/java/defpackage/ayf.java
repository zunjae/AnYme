package defpackage;

import java.util.concurrent.ThreadFactory;

public final class ayf implements ThreadFactory {
    private final int a = 10;

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(this.a);
        thread.setName("Queue");
        return thread;
    }
}
