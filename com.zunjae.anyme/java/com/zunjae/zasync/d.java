package com.zunjae.zasync;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

final class d implements ActivityLifecycleCallbacks {
    final /* synthetic */ Activity a;
    final /* synthetic */ c b;

    d(c cVar, Activity activity) {
        this.b = cVar;
        this.a = activity;
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        if (activity.getClass() == this.a.getClass()) {
            this.b.e();
        }
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }
}
