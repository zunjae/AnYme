package defpackage;

import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class avy {
    private static final Pattern b = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final avp a;
    private final String c;
    private final azk d;
    private final int e;
    private final String f;

    public avy(avp avp, String str, String str2, azk azk, int i) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (azk != null) {
            this.a = avp;
            this.f = str;
            if (!awj.d(this.f)) {
                str2 = b.matcher(str2).replaceFirst(this.f);
            }
            this.c = str2;
            this.d = azk;
            this.e = i;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }

    protected final azc a(Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder("Crashlytics Android SDK/");
        stringBuilder.append(this.a.a());
        return this.d.a(this.e, this.c, map).e().d().a("User-Agent", stringBuilder.toString()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    protected final String a() {
        return this.c;
    }

    protected final azc b() {
        return a(Collections.emptyMap());
    }
}
