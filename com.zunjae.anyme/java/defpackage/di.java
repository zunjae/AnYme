package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;

public final class di implements lp {
    private final Context a;
    private final lo b;
    private final lu c;
    private final lv d;
    private final de e;
    private final dm f;

    public di(Context context, lo loVar, lu luVar) {
        lv lvVar = new lv();
        lk lkVar = new lk();
        this(context, loVar, luVar, lvVar);
    }

    private di(Context context, lo loVar, lu luVar, lv lvVar) {
        this.a = context.getApplicationContext();
        this.b = loVar;
        this.c = luVar;
        this.d = lvVar;
        this.e = de.a(context);
        this.f = new dm(this);
        lp a = lk.a(context, new dn(lvVar));
        if (nw.d()) {
            new Handler(Looper.getMainLooper()).post(new dj(this, loVar));
        } else {
            loVar.a(this);
        }
        loVar.a(a);
    }

    private <T> da<T> a(Class<T> cls) {
        ii a = de.a((Class) cls, this.a);
        ii b = de.b((Class) cls, this.a);
        if (a == null) {
            if (b == null) {
                StringBuilder stringBuilder = new StringBuilder("Unknown type ");
                stringBuilder.append(cls);
                stringBuilder.append(". You must provide a Model of a type for which there is a registered ModelLoader, if you are using a custom model, you must first call Glide#register with a ModelLoaderFactory for your custom model class");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
        }
        return new da(cls, a, b, this.a, this.e, this.d, this.b, this.f);
    }

    public final da<Uri> a(Uri uri) {
        return (da) a(Uri.class).a((Object) uri);
    }

    public final da<Integer> a(Integer num) {
        return (da) ((da) a(Integer.class).a(nm.a(this.a))).a((Object) num);
    }

    public final da<String> a(String str) {
        return (da) a(String.class).a((Object) str);
    }

    public final <A, T> dk<A, T> a(ii<A, T> iiVar, Class<T> cls) {
        return new dk(this, iiVar, cls);
    }

    public final void a() {
        this.e.e();
    }

    public final void a(int i) {
        this.e.a(i);
    }

    public final void a_() {
        this.d.c();
    }

    public final void b() {
        nw.a();
        this.d.b();
    }

    public final void c() {
        nw.a();
        this.d.a();
    }
}
