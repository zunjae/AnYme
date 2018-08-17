package defpackage;

import java.util.ArrayList;

public final class alc {
    public static int a(int i) {
        return aux.b(alc.c(i), 0);
    }

    public static int a(boolean z) {
        String str;
        int i;
        if (z) {
            str = "@@KEY_Custom_Image_Height";
            i = 500;
        } else {
            str = "@@KEY_Custom_Image_Height";
            i = -1;
        }
        return aux.b(str, i);
    }

    public static void a(int i, int i2) {
        aux.a(alc.c(i), i2);
    }

    public static void a(String str) {
        if (!bit.b(str)) {
            str = str.toLowerCase();
            ArrayList arrayList = new ArrayList();
            arrayList.add("360p");
            arrayList.add("480p");
            arrayList.add("720p");
            arrayList.add("1080p");
            if (arrayList.contains(str)) {
                aux.a("KEY_QUALITY_SELECTOR_PREFERRED", str);
            }
        }
    }

    public static int b(int i) {
        return aux.b(alc.d(i), 0);
    }

    public static void b(int i, int i2) {
        aux.a(alc.d(i), i2);
    }

    private static String c(int i) {
        return "SyncEpisodeAnime".concat(String.valueOf(i));
    }

    private static String d(int i) {
        return "SkipIntroAnime".concat(String.valueOf(i));
    }
}
