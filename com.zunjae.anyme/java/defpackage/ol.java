package defpackage;

import android.app.Activity;
import java.util.concurrent.ScheduledFuture;

final class ol extends avd {
    private final pk a;
    private final op b;

    public ol(pk pkVar, op opVar) {
        this.a = pkVar;
        this.b = opVar;
    }

    public final void a(Activity activity) {
    }

    public final void b(Activity activity) {
        this.a.a(activity, po.START);
    }

    public final void c(Activity activity) {
        this.a.a(activity, po.RESUME);
        op opVar = this.b;
        opVar.b = false;
        ScheduledFuture scheduledFuture = (ScheduledFuture) opVar.a.getAndSet(null);
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void d(Activity activity) {
        this.a.a(activity, po.PAUSE);
        this.b.a();
    }

    public final void e(Activity activity) {
        this.a.a(activity, po.STOP);
    }
}
