package defpackage;

import android.content.Context;
import com.zunjae.zapplib.a;

public final class ann {
    private static final String a = "ann";

    public static int a() {
        return aux.b("KEY_BROWSER_VERSION", 0);
    }

    public static alf a(Context context) {
        int b = aux.b("KEY_REMEMBER_CAST_APP", 0);
        if (b == 0) {
            return null;
        }
        alf a = alf.a(b);
        return (a != null && a.a(context, a.c())) ? a : null;
    }

    public static alr a(int i) {
        i = aux.b(ann.d(i), -1);
        if (i != -1) {
            return alr.a(i);
        }
        alr alr = (alr) aux.a("KEY_STREAMING_APPV2", alr.class);
        if (alr == null) {
            alr = alr.a();
        }
        return alr;
    }

    public static void a(int i, alr alr) {
        aux.a(ann.d(i), alr.c());
    }

    public static void a(alr alr) {
        aux.a("KEY_STREAMING_APPV2", (Object) alr);
    }

    public static void b(int i) {
        aux.b(ann.d(i));
    }

    public static void c(int i) {
        aux.a("KEY_REMEMBER_CAST_APP", i);
    }

    private static String d(int i) {
        return "KEY_PREFERRED_STREAM_SITEV2".concat(String.valueOf(i));
    }
}
