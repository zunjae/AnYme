package defpackage;

import android.os.Process;

public abstract class awi implements Runnable {
    protected abstract void a();

    public final void run() {
        Process.setThreadPriority(10);
        a();
    }
}
