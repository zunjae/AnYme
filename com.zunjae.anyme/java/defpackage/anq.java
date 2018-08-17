package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import com.afollestad.materialdialogs.e;
import com.afollestad.materialdialogs.j;
import com.afollestad.materialdialogs.o;
import com.zunjae.anyme.AnymeActivity;
import com.zunjae.anyme.AppDatabase;

public final class anq {
    public static String a(aln aln) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(aln.a());
        stringBuilder.append(":");
        stringBuilder.append(aln.b());
        String stringBuilder2 = stringBuilder.toString();
        stringBuilder = new StringBuilder("Basic ");
        stringBuilder.append(Base64.encodeToString(stringBuilder2.getBytes(), 2));
        return stringBuilder.toString();
    }

    public static void a(Activity activity) {
        new o(activity).a((CharSequence) "Are you sure you want to log out?").d().e().a(new -$$Lambda$anq$AVpQtb7hFlrtN4CYn6wlq7jV-NI(activity)).l();
    }

    private static /* synthetic */ void a(Activity activity, j jVar, e eVar) {
        anq.a((Context) activity);
        Intent intent = new Intent(activity, AnymeActivity.class);
        intent.addFlags(268468224);
        activity.startActivity(intent);
        activity.finish();
    }

    public static void a(Context context) {
        aux.a();
        Thread thread = new Thread(new -$$Lambda$anq$fJRB4eNpL02hYXxm5lqGTHTYdWU(context));
    }

    public static boolean a() {
        String b = aux.b("KEY_KANONAPP_TOKEN", null);
        return b != null && b.length() == 10;
    }

    private static /* synthetic */ void b(Context context) {
        alb.a(context);
        AppDatabase.a(context).d();
    }

    public static boolean b() {
        return !anq.a();
    }

    public static aln c() {
        return (aln) aux.a("KEY_USER_CREDENTIALSV3", aln.class);
    }

    public static boolean d() {
        aln c = anq.c();
        if (c == null) {
            return false;
        }
        return ((bit.b(c.b()) ^ 1) == 0 || (bit.b(c.a()) ^ 1) == 0) ? false : true;
    }

    public static arm e() {
        return (arm) aux.a("KEY_MALUSERPROFILE2", arm.class);
    }
}
