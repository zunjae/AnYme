package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

final class bkt implements Executor {
    private final Handler a = new Handler(Looper.getMainLooper());

    bkt() {
    }

    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }
}
