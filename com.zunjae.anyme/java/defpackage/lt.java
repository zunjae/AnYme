package defpackage;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public final class lt implements Callback {
    private static final lt c = new lt();
    final Map<FragmentManager, lr> a = new HashMap();
    final Map<android.support.v4.app.FragmentManager, lw> b = new HashMap();
    private volatile di d;
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    lt() {
    }

    @TargetApi(11)
    private di a(Context context, FragmentManager fragmentManager) {
        lr a = a(fragmentManager);
        di b = a.b();
        if (b != null) {
            return b;
        }
        b = new di(context, a.a(), a.c());
        a.a(b);
        return b;
    }

    private di a(Context context, android.support.v4.app.FragmentManager fragmentManager) {
        lw a = a(fragmentManager);
        di b = a.b();
        if (b != null) {
            return b;
        }
        b = new di(context, a.a(), a.c());
        a.a(b);
        return b;
    }

    public static lt a() {
        return c;
    }

    private di b(Context context) {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new di(context.getApplicationContext(), new lh(), new ln());
                }
            }
        }
        return this.d;
    }

    @TargetApi(17)
    private static void b(Activity activity) {
        if (VERSION.SDK_INT < 17) {
            return;
        }
        if (activity.isDestroyed()) {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        }
    }

    @TargetApi(11)
    public final di a(Activity activity) {
        if (!nw.d()) {
            if (VERSION.SDK_INT >= 11) {
                lt.b(activity);
                return a((Context) activity, activity.getFragmentManager());
            }
        }
        return a(activity.getApplicationContext());
    }

    public final di a(Context context) {
        while (context != null) {
            if (nw.c() && !(context instanceof Application)) {
                if (context instanceof FragmentActivity) {
                    return a((FragmentActivity) context);
                }
                if (context instanceof Activity) {
                    return a((Activity) context);
                }
                if (context instanceof ContextWrapper) {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            return b(context);
        }
        throw new IllegalArgumentException("You cannot start a load on a null Context");
    }

    public final di a(Fragment fragment) {
        if (fragment.getActivity() == null) {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        } else if (nw.d()) {
            return a(fragment.getActivity().getApplicationContext());
        } else {
            return a(fragment.getActivity(), fragment.getChildFragmentManager());
        }
    }

    public final di a(FragmentActivity fragmentActivity) {
        if (nw.d()) {
            return a(fragmentActivity.getApplicationContext());
        }
        lt.b((Activity) fragmentActivity);
        return a((Context) fragmentActivity, fragmentActivity.getSupportFragmentManager());
    }

    @TargetApi(17)
    final lr a(FragmentManager fragmentManager) {
        lr lrVar = (lr) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (lrVar != null) {
            return lrVar;
        }
        lrVar = (lr) this.a.get(fragmentManager);
        if (lrVar != null) {
            return lrVar;
        }
        android.app.Fragment lrVar2 = new lr();
        this.a.put(fragmentManager, lrVar2);
        fragmentManager.beginTransaction().add(lrVar2, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.e.obtainMessage(1, fragmentManager).sendToTarget();
        return lrVar2;
    }

    final lw a(android.support.v4.app.FragmentManager fragmentManager) {
        lw lwVar = (lw) fragmentManager.findFragmentByTag("com.bumptech.glide.manager");
        if (lwVar != null) {
            return lwVar;
        }
        lwVar = (lw) this.b.get(fragmentManager);
        if (lwVar != null) {
            return lwVar;
        }
        lwVar = new lw();
        this.b.put(fragmentManager, lwVar);
        fragmentManager.beginTransaction().add(lwVar, "com.bumptech.glide.manager").commitAllowingStateLoss();
        this.e.obtainMessage(2, fragmentManager).sendToTarget();
        return lwVar;
    }

    public final boolean handleMessage(Message message) {
        Map map;
        Object obj;
        Object obj2 = null;
        boolean z = true;
        switch (message.what) {
            case tw.a /*1*/:
                obj2 = (FragmentManager) message.obj;
                map = this.a;
                break;
            case tw.b /*2*/:
                obj2 = (android.support.v4.app.FragmentManager) message.obj;
                map = this.b;
                break;
            default:
                z = false;
                obj = null;
                break;
        }
        obj = map.remove(obj2);
        if (z && r4 == null && Log.isLoggable("RMRetriever", 5)) {
            new StringBuilder("Failed to remove expected request manager fragment, manager: ").append(obj2);
        }
        return z;
    }
}
