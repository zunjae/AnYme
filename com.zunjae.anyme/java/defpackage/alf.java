package defpackage;

import android.content.Context;
import com.zunjae.zapplib.a;
import java.util.ArrayList;
import java.util.Iterator;
import mehdi.sakout.fancybuttons.R;

public final class alf {
    private final String a;
    private final String b;
    private final int c;

    private alf(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public static int a(alf alf) {
        return alf.a.equals(alf.g().a) ? 2 : alf.a.equals(alf.e().a) ? 1 : alf.a.equals(alf.f().a) ? 4 : alf.a.equals(alf.h().a) ? 3 : alf.a.equals(alf.j().a) ? 5 : alf.a.equals(alf.i().a) ? 6 : 0;
    }

    public static alf a(int i) {
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                return null;
            case tw.a /*1*/:
                return alf.e();
            case tw.b /*2*/:
                return alf.g();
            case f.c /*3*/:
                return alf.h();
            case mh.d /*4*/:
                return alf.f();
            case mh.e /*5*/:
                return alf.j();
            case mh.f /*6*/:
                return alf.i();
            default:
                throw new IllegalArgumentException("No switch case found for id: ".concat(String.valueOf(i)));
        }
    }

    public static ArrayList<alf> a() {
        ArrayList<alf> arrayList = new ArrayList();
        arrayList.add(alf.j());
        arrayList.add(alf.h());
        arrayList.add(alf.g());
        arrayList.add(alf.e());
        arrayList.add(alf.f());
        arrayList.add(alf.i());
        return arrayList;
    }

    public static boolean a(Context context) {
        Iterator it = alf.a().iterator();
        while (it.hasNext()) {
            if (a.a(context, ((alf) it.next()).b)) {
                return true;
            }
        }
        return false;
    }

    private static alf e() {
        return new alf("AllCast", "com.koushikdutta.cast", com.zunjae.anyme.R.drawable.allcast);
    }

    private static alf f() {
        return new alf("Web Video Cast", "com.instantbits.cast.webvideo", com.zunjae.anyme.R.drawable.webvideocast);
    }

    private static alf g() {
        return new alf("All Screen", "com.toxic.apps.chrome", com.zunjae.anyme.R.drawable.allscreen);
    }

    private static alf h() {
        return new alf("LocalCast", "de.stefanpledl.localcast", com.zunjae.anyme.R.drawable.localcast);
    }

    private static alf i() {
        return new alf("Yatse", "org.leetzone.android.yatsewidgetfree", com.zunjae.anyme.R.drawable.yatse);
    }

    private static alf j() {
        return new alf("BubbleUPnP", "com.bubblesoft.android.bubbleupnp", com.zunjae.anyme.R.drawable.bubbleupnp);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.b;
    }

    public final int d() {
        return this.c;
    }
}
