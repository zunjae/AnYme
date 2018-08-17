package defpackage;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

public final class awr {
    public static ExecutorService a(String str) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(awr.c(str));
        awr.a(str, newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    private static final void a(String str, ExecutorService executorService) {
        awr.a(str, executorService, TimeUnit.SECONDS);
    }

    private static void a(String str, ExecutorService executorService, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new awu(str, executorService, timeUnit), "Crashlytics Shutdown Hook for ".concat(String.valueOf(str))));
    }

    public static ScheduledExecutorService b(String str) {
        Object newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(awr.c(str));
        awr.a(str, newSingleThreadScheduledExecutor);
        return newSingleThreadScheduledExecutor;
    }

    private static ThreadFactory c(String str) {
        return new aws(str, new AtomicLong(1));
    }
}
