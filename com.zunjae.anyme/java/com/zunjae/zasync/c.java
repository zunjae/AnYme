package com.zunjae.zasync;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Handler;
import android.os.Looper;

public abstract class c<Result> {
    private boolean a = false;
    private ActivityLifecycleCallbacks b;
    private Application c;
    private boolean d = false;

    public c(Activity activity) {
        this.c = activity.getApplication();
        this.b = new d(this, activity);
        Application application = this.c;
        if (application != null) {
            application.registerActivityLifecycleCallbacks(this.b);
        }
    }

    static /* synthetic */ void a(c cVar, Object obj) {
        if (!cVar.a) {
            new Handler(Looper.getMainLooper()).post(new f(cVar, obj));
            Application application = cVar.c;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(cVar.b);
            }
        }
    }

    protected void a() {
    }

    protected void a(Result result) {
    }

    public final void a(boolean z) {
        this.d = z;
    }

    public abstract Result b();

    protected boolean c() {
        return false;
    }

    protected Result d() {
        return null;
    }

    public final void e() {
        this.a = true;
        Application application = this.c;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks(this.b);
        }
    }

    public final void f() {
        a();
        new Thread(new e(this)).start();
    }

    public int hashCode() {
        return super.hashCode();
    }
}
