package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;

public class avf {
    static volatile avf a;
    static final avs b = new ave((byte) 0);
    final avs c;
    final boolean d;
    private final Context e;
    private final Map<Class<? extends avp>, avp> f;
    private final ExecutorService g;
    private final Handler h;
    private final avl<avf> i;
    private final avl<?> j;
    private final aww k;
    private ava l;
    private WeakReference<Activity> m;
    private AtomicBoolean n = new AtomicBoolean(false);

    avf(Context context, Map<Class<? extends avp>, avp> map, aye aye, Handler handler, avs avs, boolean z, avl avl, aww aww, Activity activity) {
        this.e = context;
        this.f = map;
        this.g = aye;
        this.h = handler;
        this.c = avs;
        this.d = z;
        this.i = avl;
        this.j = new avh(this, map.size());
        this.k = aww;
        a(activity);
    }

    static /* synthetic */ Activity a(Context context) {
        return context instanceof Activity ? (Activity) context : null;
    }

    public static avf a(Context context, avp... avpArr) {
        if (a == null) {
            synchronized (avf.class) {
                if (a == null) {
                    avf a = new avi(context).a(avpArr).a();
                    a = a;
                    a.l = new ava(a.e);
                    a.l.a(new avg(a));
                    Context context2 = a.e;
                    Future submit = a.g.submit(new avk(context2.getPackageCodePath()));
                    Collection values = a.f.values();
                    avt avt = new avt(submit, values);
                    List<avp> arrayList = new ArrayList(values);
                    Collections.sort(arrayList);
                    avt.a(context2, a, avl.d, a.k);
                    for (avp a2 : arrayList) {
                        a2.a(context2, a, a.j, a.k);
                    }
                    avt.k();
                    StringBuilder stringBuilder = avf.c().a(3) ? new StringBuilder("Initializing io.fabric.sdk.android:fabric [Version: 1.4.3.25], with the following kits:\n") : null;
                    for (avp avp : arrayList) {
                        avp.f.a(avt.f);
                        avf.a(a.f, avp);
                        avp.k();
                        if (stringBuilder != null) {
                            stringBuilder.append(avp.b());
                            stringBuilder.append(" [Version: ");
                            stringBuilder.append(avp.a());
                            stringBuilder.append("]\n");
                        }
                    }
                }
            }
        }
        return a;
    }

    public static <T extends avp> T a(Class<T> cls) {
        avf avf = a;
        if (avf != null) {
            return (avp) avf.f.get(cls);
        }
        throw new IllegalStateException("Must Initialize Fabric before using singleton()");
    }

    static /* synthetic */ Map a(Collection collection) {
        Map hashMap = new HashMap(collection.size());
        avf.a(hashMap, collection);
        return hashMap;
    }

    private static void a(Map<Class<? extends avp>, avp> map, avp avp) {
        axv axv = avp.j;
        if (axv != null) {
            for (Class cls : axv.a()) {
                if (cls.isInterface()) {
                    for (avp avp2 : map.values()) {
                        if (cls.isAssignableFrom(avp2.getClass())) {
                            avp.f.a(avp2.f);
                        }
                    }
                } else if (((avp) map.get(cls)) != null) {
                    avp.f.a(((avp) map.get(cls)).f);
                } else {
                    throw new ayh("Referenced Kit was null, does the kit exist?");
                }
            }
        }
    }

    private static void a(Map<Class<? extends avp>, avp> map, Collection<? extends avp> collection) {
        for (avp avp : collection) {
            map.put(avp.getClass(), avp);
            if (avp instanceof avq) {
                avf.a((Map) map, ((avq) avp).c());
            }
        }
    }

    public static avs c() {
        avf avf = a;
        return avf == null ? b : avf.c;
    }

    public static boolean d() {
        avf avf = a;
        return avf == null ? false : avf.d;
    }

    public static boolean e() {
        avf avf = a;
        return avf != null && avf.n.get();
    }

    public final Activity a() {
        WeakReference weakReference = this.m;
        return weakReference != null ? (Activity) weakReference.get() : null;
    }

    public final avf a(Activity activity) {
        this.m = new WeakReference(activity);
        return this;
    }

    public final ExecutorService b() {
        return this.g;
    }
}
