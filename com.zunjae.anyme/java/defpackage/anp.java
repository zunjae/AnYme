package defpackage;

import com.zunjae.zasync.a;

public final class anp {
    private static final String a = "anp";

    public static void a(amz amz) {
        amz.a(a.a(2));
        aux.a("KEY_DISCOVERY_ANIME_V5", (Object) amz);
        aux.b("KEY_DISCOVERY_ANIME_V4");
        aux.b("KEY_DISCOVERY_ANIME_V3");
        aux.b("KEY_DISCOVERY_ANIME_V2");
        aux.b("KEY_DISCOVERY_ANIME");
    }

    public static void a(String str) {
        if (str != null && str.contains("MALHLOGSESSID")) {
            aux.a("KEY_USER_COOKIES", str);
            aux.a("KEY_USER_COOKIES_EXPIRATION_DATE", a.a(5));
        }
    }

    public static boolean a() {
        return aux.c("KEY_DISCOVERY_ANIME_V5");
    }

    public static amz b() {
        return (amz) aux.a("KEY_DISCOVERY_ANIME_V5", amz.class);
    }

    public static boolean c() {
        return System.currentTimeMillis() > aux.a("KEY_USER_COOKIES_EXPIRATION_DATE");
    }

    public static String d() {
        return aux.b("KEY_USER_COOKIES", null);
    }

    public static boolean e() {
        return aux.c("KEY_USER_COOKIES");
    }
}
