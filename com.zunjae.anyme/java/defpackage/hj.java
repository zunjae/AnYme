package defpackage;

import android.os.Process;

final class hj extends Thread {
    final /* synthetic */ hi a;

    hj(hi hiVar, Runnable runnable, String str) {
        this.a = hiVar;
        super(runnable, str);
    }

    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
