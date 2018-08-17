package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class avc implements ActivityLifecycleCallbacks {
    final /* synthetic */ avd a;
    final /* synthetic */ avb b;

    avc(avb avb, avd avd) {
        this.b = avb;
        this.a = avd;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.a(activity);
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
        this.a.d(activity);
    }

    public final void onActivityResumed(Activity activity) {
        this.a.c(activity);
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        this.a.b(activity);
    }

    public final void onActivityStopped(Activity activity) {
        this.a.e(activity);
    }
}
