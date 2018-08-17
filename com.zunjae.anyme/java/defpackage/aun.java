package defpackage;

import com.zunjae.anyme.activities.AbstractActivity;
import java.util.Date;

public final class aun {
    public static void a() {
        if (aun.d()) {
            nz.c().a(new ps().a("Register"));
        }
    }

    public static void a(AbstractActivity abstractActivity) {
        if (aun.d()) {
            nz.c().a(new os().a(abstractActivity.getClass().getSimpleName()));
        }
    }

    public static void a(String str) {
        if (aun.d()) {
            nz.c().a((ot) new ot("Playback").a("Type", str));
        }
    }

    public static void b() {
        if (aun.d()) {
            nz.c().a((ot) new ot("LightBrowser").a("Account", String.valueOf(anq.d())));
        }
    }

    public static void b(String str) {
        if (aun.d()) {
            nz.c().a(new ph().a(str));
        }
    }

    public static void c() {
        if (aun.d()) {
            nz c = nz.c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(anq.c().a());
            stringBuilder.append(" ");
            stringBuilder.append(new Date().toString());
            c.a((ot) new ot("DiscordJoin").a("Username", stringBuilder.toString()));
        }
    }

    public static void c(String str) {
        if (aun.d()) {
            nz.c().a((ot) new ot("Streaming Site").a("Site Name", str));
        }
    }

    private static boolean d() {
        return avf.e();
    }
}
