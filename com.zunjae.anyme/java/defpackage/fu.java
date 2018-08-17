package defpackage;

import android.os.Handler;
import android.os.Looper;

final class fu {
    private boolean a;
    private final Handler b = new Handler(Looper.getMainLooper(), new fv());

    fu() {
    }

    public final void a(ft<?> ftVar) {
        nw.a();
        if (this.a) {
            this.b.obtainMessage(1, ftVar).sendToTarget();
            return;
        }
        this.a = true;
        ftVar.d();
        this.a = false;
    }
}
