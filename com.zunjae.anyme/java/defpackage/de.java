package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import com.bumptech.glide.load.resource.bitmap.e;
import com.bumptech.glide.load.resource.bitmap.j;
import com.bumptech.glide.load.resource.bitmap.l;
import com.bumptech.glide.load.resource.bitmap.m;
import com.bumptech.glide.load.resource.bitmap.s;
import com.bumptech.glide.load.resource.bitmap.v;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class de {
    private static volatile de a;
    private final hs b;
    private final fb c;
    private final ga d;
    private final ha e;
    private final ee f;
    private final nd g = new nd();
    private final le h = new le();
    private final mc i;
    private final e j;
    private final kz k;
    private final l l;
    private final kz m;
    private final Handler n;
    private final hp o;

    de(fb fbVar, ha haVar, ga gaVar, Context context, ee eeVar) {
        this.c = fbVar;
        this.d = gaVar;
        this.e = haVar;
        this.f = eeVar;
        this.b = new hs(context);
        this.n = new Handler(Looper.getMainLooper());
        this.o = new hp(haVar, gaVar, eeVar);
        this.i = new mc();
        v vVar = new v(gaVar, eeVar);
        this.i.a(InputStream.class, Bitmap.class, vVar);
        j jVar = new j(gaVar, eeVar);
        this.i.a(ParcelFileDescriptor.class, Bitmap.class, jVar);
        s sVar = new s(vVar, jVar);
        this.i.a(hz.class, Bitmap.class, sVar);
        mb kcVar = new kc(context, gaVar);
        this.i.a(InputStream.class, ka.class, kcVar);
        this.i.a(hz.class, ks.class, new la(sVar, kcVar, gaVar));
        this.i.a(InputStream.class, File.class, new jx());
        a(File.class, ParcelFileDescriptor.class, new iq());
        a(File.class, InputStream.class, new jd());
        a(Integer.TYPE, ParcelFileDescriptor.class, new it());
        a(Integer.TYPE, InputStream.class, new jg());
        a(Integer.class, ParcelFileDescriptor.class, new it());
        a(Integer.class, InputStream.class, new jg());
        a(String.class, ParcelFileDescriptor.class, new iv());
        a(String.class, InputStream.class, new ji());
        a(Uri.class, ParcelFileDescriptor.class, new ix());
        a(Uri.class, InputStream.class, new jk());
        a(URL.class, InputStream.class, new jm());
        a(hu.class, InputStream.class, new iz());
        a(byte[].class, InputStream.class, new jb());
        this.h.a(Bitmap.class, m.class, new lc(context.getResources(), gaVar));
        this.h.a(ks.class, js.class, new lb(new lc(context.getResources(), gaVar)));
        this.j = new e(gaVar);
        this.k = new kz(gaVar, this.j);
        this.l = new l(gaVar);
        this.m = new kz(gaVar, this.l);
    }

    public static de a(Context context) {
        if (a == null) {
            synchronized (de.class) {
                if (a == null) {
                    context = context.getApplicationContext();
                    List a = new lz(context).a();
                    dg dgVar = new dg(context);
                    Iterator it = a.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                    a = dgVar.a();
                    it = a.iterator();
                    while (it.hasNext()) {
                        it.next();
                    }
                }
            }
        }
        return a;
    }

    public static di a(Activity activity) {
        return lt.a().a(activity);
    }

    public static di a(Fragment fragment) {
        return lt.a().a(fragment);
    }

    public static di a(FragmentActivity fragmentActivity) {
        return lt.a().a(fragmentActivity);
    }

    public static <T> ii<T, InputStream> a(Class<T> cls, Context context) {
        return de.a((Class) cls, InputStream.class, context);
    }

    private static <T, Y> ii<T, Y> a(Class<T> cls, Class<Y> cls2, Context context) {
        return cls == null ? null : de.a(context).b.a(cls, cls2);
    }

    public static void a(View view) {
        de.a(new df(view));
    }

    private <T, Y> void a(Class<T> cls, Class<Y> cls2, ij<T, Y> ijVar) {
        this.b.a((Class) cls, (Class) cls2, (ij) ijVar);
    }

    public static void a(ni<?> niVar) {
        nw.a();
        mi e = niVar.e();
        if (e != null) {
            e.c();
            niVar.a(null);
        }
    }

    public static di b(Context context) {
        return lt.a().a(context);
    }

    public static <T> ii<T, ParcelFileDescriptor> b(Class<T> cls, Context context) {
        return de.a((Class) cls, ParcelFileDescriptor.class, context);
    }

    public final ga a() {
        return this.d;
    }

    final <Z, R> ld<Z, R> a(Class<Z> cls, Class<R> cls2) {
        return this.h.a(cls, cls2);
    }

    public final void a(int i) {
        nw.a();
        this.e.a(i);
        this.d.a(i);
    }

    final fb b() {
        return this.c;
    }

    final <T, Z> mb<T, Z> b(Class<T> cls, Class<Z> cls2) {
        return this.i.a(cls, cls2);
    }

    final kz c() {
        return this.k;
    }

    final kz d() {
        return this.m;
    }

    public final void e() {
        nw.a();
        this.e.a();
        this.d.a();
    }

    public final void f() {
        nw.b();
        this.c.a();
    }
}
