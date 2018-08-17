package defpackage;

import android.os.Looper;
import android.util.Log;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;

public final class fb implements fk, fo, hb {
    private final Map<eg, fh> a;
    private final fm b;
    private final ha c;
    private final fc d;
    private final Map<eg, WeakReference<fn<?>>> e;
    private final fu f;
    private final fd g;
    private ReferenceQueue<fn<?>> h;

    public fb(ha haVar, go goVar, ExecutorService executorService, ExecutorService executorService2) {
        this(haVar, goVar, executorService, executorService2, (byte) 0);
    }

    private fb(ha haVar, go goVar, ExecutorService executorService, ExecutorService executorService2, byte b) {
        this.c = haVar;
        this.g = new fd(goVar);
        this.e = new HashMap();
        this.b = new fm();
        this.a = new HashMap();
        this.d = new fc(executorService, executorService2, this);
        this.f = new fu();
        haVar.a((hb) this);
    }

    public static void a(ft ftVar) {
        nw.a();
        if (ftVar instanceof fn) {
            ((fn) ftVar).f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    private static void a(String str, long j, eg egVar) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" in ");
        stringBuilder.append(ns.a(j));
        stringBuilder.append("ms, key: ");
        stringBuilder.append(egVar);
    }

    private ReferenceQueue<fn<?>> b() {
        if (this.h == null) {
            this.h = new ReferenceQueue();
            Looper.myQueue().addIdleHandler(new ff(this.e, this.h));
        }
        return this.h;
    }

    public final <T, Z, R> fe a(eg egVar, int i, int i2, en<T> enVar, mb<T, Z> mbVar, ek<Z> ekVar, ld<Z, R> ldVar, int i3, boolean z, fa faVar, ml mlVar) {
        ft a;
        fb fbVar = this;
        boolean z2 = z;
        ml mlVar2 = mlVar;
        nw.a();
        long a2 = ns.a();
        eg egVar2 = r5;
        fl flVar = new fl(enVar.b(), egVar, i, i2, mbVar.a(), mbVar.b(), ekVar, mbVar.d(), ldVar, mbVar.c());
        if (z2) {
            a = fbVar.c.a(egVar2);
            a = a == null ? null : a instanceof fn ? (fn) a : new fn(a, true);
            if (a != null) {
                a.e();
                fbVar.e.put(egVar2, new fg(egVar2, a, b()));
            }
        } else {
            a = null;
        }
        if (a != null) {
            mlVar2.a(a);
            if (Log.isLoggable("Engine", 2)) {
                fb.a("Loaded resource from cache", a2, egVar2);
            }
            return null;
        }
        fh fhVar;
        long j = a2;
        if (z2) {
            WeakReference weakReference = (WeakReference) fbVar.e.get(egVar2);
            if (weakReference != null) {
                a = (fn) weakReference.get();
                if (a != null) {
                    a.e();
                } else {
                    fbVar.e.remove(egVar2);
                }
                if (a == null) {
                    mlVar2.a(a);
                    if (Log.isLoggable("Engine", 2)) {
                        fb.a("Loaded resource from active resources", j, egVar2);
                    }
                    return null;
                }
                fhVar = (fh) fbVar.a.get(egVar2);
                if (fhVar == null) {
                    fhVar.a(mlVar2);
                    if (Log.isLoggable("Engine", 2)) {
                        fb.a("Added to existing load", j, egVar2);
                    }
                    return new fe(mlVar2, fhVar);
                }
                fh a3 = fbVar.d.a(egVar2, z2);
                fp fpVar = new fp(a3, new ew(egVar2, i, i2, enVar, mbVar, ekVar, ldVar, fbVar.g, faVar, i3), i3);
                fbVar.a.put(egVar2, a3);
                a3.a(mlVar2);
                a3.a(fpVar);
                if (Log.isLoggable("Engine", 2)) {
                    fb.a("Started new load", j, egVar2);
                }
                return new fe(mlVar2, a3);
            }
        }
        a = null;
        if (a == null) {
            fhVar = (fh) fbVar.a.get(egVar2);
            if (fhVar == null) {
                fh a32 = fbVar.d.a(egVar2, z2);
                fp fpVar2 = new fp(a32, new ew(egVar2, i, i2, enVar, mbVar, ekVar, ldVar, fbVar.g, faVar, i3), i3);
                fbVar.a.put(egVar2, a32);
                a32.a(mlVar2);
                a32.a(fpVar2);
                if (Log.isLoggable("Engine", 2)) {
                    fb.a("Started new load", j, egVar2);
                }
                return new fe(mlVar2, a32);
            }
            fhVar.a(mlVar2);
            if (Log.isLoggable("Engine", 2)) {
                fb.a("Added to existing load", j, egVar2);
            }
            return new fe(mlVar2, fhVar);
        }
        mlVar2.a(a);
        if (Log.isLoggable("Engine", 2)) {
            fb.a("Loaded resource from active resources", j, egVar2);
        }
        return null;
    }

    public final void a() {
        this.g.a().a();
    }

    public final void a(eg egVar, fn<?> fnVar) {
        nw.a();
        if (fnVar != null) {
            fnVar.a(egVar, this);
            if (fnVar.a()) {
                this.e.put(egVar, new fg(egVar, fnVar, b()));
            }
        }
        this.a.remove(egVar);
    }

    public final void a(fh fhVar, eg egVar) {
        nw.a();
        if (fhVar.equals((fh) this.a.get(egVar))) {
            this.a.remove(egVar);
        }
    }

    public final void b(eg egVar, fn fnVar) {
        nw.a();
        this.e.remove(egVar);
        if (fnVar.a()) {
            this.c.a(egVar, fnVar);
        } else {
            this.f.a(fnVar);
        }
    }

    public final void b(ft<?> ftVar) {
        nw.a();
        this.f.a(ftVar);
    }
}
