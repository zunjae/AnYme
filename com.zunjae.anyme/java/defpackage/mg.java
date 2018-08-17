package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import java.util.Queue;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class mg<A, T, Z, R> implements mi, ml, nf {
    private static final Queue<mg<?, ?, ?, ?>> a = nw.a(0);
    private ft<?> A;
    private fe B;
    private long C;
    private int D;
    private final String b = String.valueOf(hashCode());
    private eg c;
    private Drawable d;
    private int e;
    private int f;
    private int g;
    private Context h;
    private ek<Z> i;
    private mf<A, T, Z, R> j;
    private mj k;
    private A l;
    private Class<R> m;
    private boolean n;
    private int o;
    private ni<R> p;
    private mk<? super A, R> q;
    private float r;
    private fb s;
    private ms<R> t;
    private int u;
    private int v;
    private fa w;
    private Drawable x;
    private Drawable y;
    private boolean z;

    private mg() {
    }

    public static <A, T, Z, R> mg<A, T, Z, R> a(mf<A, T, Z, R> mfVar, A a, eg egVar, Context context, int i, ni<R> niVar, float f, Drawable drawable, int i2, Drawable drawable2, int i3, Drawable drawable3, int i4, mk<? super A, R> mkVar, mj mjVar, fb fbVar, ek<Z> ekVar, Class<R> cls, boolean z, ms<R> msVar, int i5, int i6, fa faVar) {
        A a2 = a;
        ek<Z> ekVar2 = ekVar;
        mg<A, T, Z, R> mgVar = (mg) a.poll();
        if (mgVar == null) {
            mgVar = new mg();
        }
        mg<A, T, Z, R> mgVar2 = mgVar;
        mgVar2.j = mfVar;
        mgVar2.l = a2;
        mgVar2.c = egVar;
        mgVar2.d = drawable3;
        mgVar2.e = i4;
        mgVar2.h = context.getApplicationContext();
        mgVar2.o = i;
        mgVar2.p = niVar;
        mgVar2.r = f;
        mgVar2.x = drawable;
        mgVar2.f = i2;
        mgVar2.y = drawable2;
        mgVar2.g = i3;
        mgVar2.q = mkVar;
        mgVar2.k = mjVar;
        mgVar2.s = fbVar;
        mgVar2.i = ekVar2;
        mgVar2.m = cls;
        mgVar2.n = z;
        mgVar2.t = msVar;
        mgVar2.u = i5;
        mgVar2.v = i6;
        mgVar2.w = faVar;
        mgVar2.D = mh.a;
        if (a2 != null) {
            String str;
            Object c;
            String str2;
            mg.a("ModelLoader", mfVar.e(), "try .using(ModelLoader)");
            mg.a("Transcoder", mfVar.f(), "try .as*(Class).transcode(ResourceTranscoder)");
            mg.a("Transformation", ekVar2, "try .transform(UnitTransformation.get())");
            if (faVar.cacheSource()) {
                str = "SourceEncoder";
                c = mfVar.c();
                str2 = "try .sourceEncoder(Encoder) or .diskCacheStrategy(NONE/RESULT)";
            } else {
                str = "SourceDecoder";
                c = mfVar.b();
                str2 = "try .decoder/.imageDecoder/.videoDecoder(ResourceDecoder) or .diskCacheStrategy(ALL/SOURCE)";
            }
            mg.a(str, c, str2);
            if (faVar.cacheSource() || faVar.cacheResult()) {
                mg.a("CacheDecoder", mfVar.a(), "try .cacheDecoder(ResouceDecoder) or .diskCacheStrategy(NONE)");
            }
            if (faVar.cacheResult()) {
                mg.a("Encoder", mfVar.d(), "try .encode(ResourceEncoder) or .diskCacheStrategy(NONE/SOURCE)");
            }
        }
        return mgVar2;
    }

    private void a(String str) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str);
        stringBuilder.append(" this: ");
        stringBuilder.append(this.b);
    }

    private static void a(String str, Object obj, String str2) {
        if (obj == null) {
            StringBuilder stringBuilder = new StringBuilder(str);
            stringBuilder.append(" must not be null");
            stringBuilder.append(", ");
            stringBuilder.append(str2);
            throw new NullPointerException(stringBuilder.toString());
        }
    }

    private void b(ft ftVar) {
        fb.a(ftVar);
        this.A = null;
    }

    private void i() {
        if (k()) {
            Drawable drawable;
            if (this.l == null) {
                if (this.d == null && this.e > 0) {
                    this.d = this.h.getResources().getDrawable(this.e);
                }
                drawable = this.d;
            } else {
                drawable = null;
            }
            if (drawable == null) {
                if (this.y == null && this.g > 0) {
                    this.y = this.h.getResources().getDrawable(this.g);
                }
                drawable = this.y;
            }
            if (drawable == null) {
                drawable = j();
            }
            this.p.b(drawable);
        }
    }

    private Drawable j() {
        if (this.x == null && this.f > 0) {
            this.x = this.h.getResources().getDrawable(this.f);
        }
        return this.x;
    }

    private boolean k() {
        mj mjVar = this.k;
        if (mjVar != null) {
            if (!mjVar.b(this)) {
                return false;
            }
        }
        return true;
    }

    private boolean l() {
        mj mjVar = this.k;
        if (mjVar != null) {
            if (mjVar.i()) {
                return false;
            }
        }
        return true;
    }

    public final void a() {
        this.j = null;
        this.l = null;
        this.h = null;
        this.p = null;
        this.x = null;
        this.y = null;
        this.d = null;
        this.q = null;
        this.k = null;
        this.i = null;
        this.t = null;
        this.z = false;
        this.B = null;
        a.offer(this);
    }

    public final void a(int i, int i2) {
        mg mgVar = this;
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder stringBuilder = new StringBuilder("Got onSizeReady in ");
            stringBuilder.append(ns.a(mgVar.C));
            a(stringBuilder.toString());
        }
        if (mgVar.D == mh.c) {
            mgVar.D = mh.b;
            int round = Math.round(mgVar.r * ((float) i));
            int round2 = Math.round(mgVar.r * ((float) i2));
            en a = mgVar.j.e().a(mgVar.l, round, round2);
            if (a == null) {
                StringBuilder stringBuilder2 = new StringBuilder("Failed to load model: '");
                stringBuilder2.append(mgVar.l);
                stringBuilder2.append("'");
                a(new Exception(stringBuilder2.toString()));
                return;
            }
            ld f = mgVar.j.f();
            if (Log.isLoggable("GenericRequest", 2)) {
                stringBuilder = new StringBuilder("finished setup for calling load in ");
                stringBuilder.append(ns.a(mgVar.C));
                a(stringBuilder.toString());
            }
            boolean z = true;
            mgVar.z = true;
            mgVar.B = mgVar.s.a(mgVar.c, round, round2, a, mgVar.j, mgVar.i, f, mgVar.o, mgVar.n, mgVar.w, this);
            if (mgVar.A == null) {
                z = false;
            }
            mgVar.z = z;
            if (Log.isLoggable("GenericRequest", 2)) {
                stringBuilder = new StringBuilder("finished onSizeReady in ");
                stringBuilder.append(ns.a(mgVar.C));
                a(stringBuilder.toString());
            }
        }
    }

    public final void a(ft<?> ftVar) {
        if (ftVar == null) {
            StringBuilder stringBuilder = new StringBuilder("Expected to receive a Resource<R> with an object of ");
            stringBuilder.append(this.m);
            stringBuilder.append(" inside, but instead got null.");
            a(new Exception(stringBuilder.toString()));
            return;
        }
        Object b = ftVar.b();
        if (b != null) {
            if (this.m.isAssignableFrom(b.getClass())) {
                Object obj;
                boolean l;
                mk mkVar;
                mj mjVar;
                double c;
                mj mjVar2 = this.k;
                if (mjVar2 != null) {
                    if (!mjVar2.a(this)) {
                        obj = null;
                        if (obj != null) {
                            b(ftVar);
                            this.D = mh.d;
                            return;
                        }
                        l = l();
                        this.D = mh.d;
                        this.A = ftVar;
                        mkVar = this.q;
                        if (mkVar != null) {
                            mkVar.b();
                        }
                        this.p.a(b, this.t.a(this.z, l));
                        mjVar = this.k;
                        if (mjVar != null) {
                            mjVar.c(this);
                        }
                        if (Log.isLoggable("GenericRequest", 2)) {
                            stringBuilder = new StringBuilder("Resource ready in ");
                            stringBuilder.append(ns.a(this.C));
                            stringBuilder.append(" size: ");
                            c = (double) ftVar.c();
                            Double.isNaN(c);
                            stringBuilder.append(c * 9.5367431640625E-7d);
                            stringBuilder.append(" fromCache: ");
                            stringBuilder.append(this.z);
                            a(stringBuilder.toString());
                        }
                        return;
                    }
                }
                obj = 1;
                if (obj != null) {
                    l = l();
                    this.D = mh.d;
                    this.A = ftVar;
                    mkVar = this.q;
                    if (mkVar != null) {
                        mkVar.b();
                    }
                    this.p.a(b, this.t.a(this.z, l));
                    mjVar = this.k;
                    if (mjVar != null) {
                        mjVar.c(this);
                    }
                    if (Log.isLoggable("GenericRequest", 2)) {
                        stringBuilder = new StringBuilder("Resource ready in ");
                        stringBuilder.append(ns.a(this.C));
                        stringBuilder.append(" size: ");
                        c = (double) ftVar.c();
                        Double.isNaN(c);
                        stringBuilder.append(c * 9.5367431640625E-7d);
                        stringBuilder.append(" fromCache: ");
                        stringBuilder.append(this.z);
                        a(stringBuilder.toString());
                    }
                    return;
                }
                b(ftVar);
                this.D = mh.d;
                return;
            }
        }
        b(ftVar);
        StringBuilder stringBuilder2 = new StringBuilder("Expected to receive an object of ");
        stringBuilder2.append(this.m);
        stringBuilder2.append(" but instead got ");
        stringBuilder2.append(b != null ? b.getClass() : BuildConfig.FLAVOR);
        stringBuilder2.append("{");
        stringBuilder2.append(b);
        stringBuilder2.append("} inside Resource{");
        stringBuilder2.append(ftVar);
        stringBuilder2.append("}.");
        stringBuilder2.append(b != null ? BuildConfig.FLAVOR : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
        a(new Exception(stringBuilder2.toString()));
    }

    public final void a(Exception exception) {
        this.D = mh.e;
        mk mkVar = this.q;
        if (mkVar != null) {
            l();
            mkVar.a();
        }
        i();
    }

    public final void b() {
        this.C = ns.a();
        if (this.l == null) {
            a(null);
            return;
        }
        this.D = mh.c;
        if (nw.a(this.u, this.v)) {
            a(this.u, this.v);
        } else {
            this.p.a((nf) this);
        }
        if (!f()) {
            if ((this.D == mh.e ? 1 : null) == null && k()) {
                this.p.a(j());
            }
        }
        if (Log.isLoggable("GenericRequest", 2)) {
            StringBuilder stringBuilder = new StringBuilder("finished run method in ");
            stringBuilder.append(ns.a(this.C));
            a(stringBuilder.toString());
        }
    }

    public final void c() {
        nw.a();
        if (this.D != mh.g) {
            this.D = mh.f;
            fe feVar = this.B;
            if (feVar != null) {
                feVar.a();
                this.B = null;
            }
            ft ftVar = this.A;
            if (ftVar != null) {
                b(ftVar);
            }
            if (k()) {
                this.p.c(j());
            }
            this.D = mh.g;
        }
    }

    public final void d() {
        c();
        this.D = mh.h;
    }

    public final boolean e() {
        int i = this.D;
        if (i != mh.b) {
            if (i != mh.c) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.D == mh.d;
    }

    public final boolean g() {
        return f();
    }

    public final boolean h() {
        int i = this.D;
        if (i != mh.f) {
            if (i != mh.g) {
                return false;
            }
        }
        return true;
    }
}
