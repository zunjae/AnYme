package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

final class aws implements ThreadFactory {
    final /* synthetic */ String a;
    final /* synthetic */ AtomicLong b;

    aws(String str, AtomicLong atomicLong) {
        this.a = str;
        this.b = atomicLong;
    }

    public final Thread newThread(Runnable runnable) {
        Thread newThread = Executors.defaultThreadFactory().newThread(new awt(this, runnable));
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append(this.b.getAndIncrement());
        newThread.setName(stringBuilder.toString());
        return newThread;
    }
}
