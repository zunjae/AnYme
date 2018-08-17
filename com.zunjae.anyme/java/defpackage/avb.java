package defpackage;

import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import java.util.HashSet;
import java.util.Set;

final class avb {
    private final Set<ActivityLifecycleCallbacks> a = new HashSet();
    private final Application b;

    avb(Application application) {
        this.b = application;
    }

    static /* synthetic */ void a(avb avb) {
        for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : avb.a) {
            avb.b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
        }
    }

    static /* synthetic */ boolean a(avb avb, avd avd) {
        if (avb.b == null) {
            return false;
        }
        ActivityLifecycleCallbacks avc = new avc(avb, avd);
        avb.b.registerActivityLifecycleCallbacks(avc);
        avb.a.add(avc);
        return true;
    }
}
