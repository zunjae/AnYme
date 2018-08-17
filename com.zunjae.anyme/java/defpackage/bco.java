package defpackage;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.Nullable;

public final class bco {
    bbz a;
    String b;
    bby c;
    bcp d;
    Map<Class<?>, Object> e;

    public bco() {
        this.e = Collections.emptyMap();
        this.b = "GET";
        this.c = new bby();
    }

    bco(bcn bcn) {
        this.e = Collections.emptyMap();
        this.a = bcn.a;
        this.b = bcn.b;
        this.d = bcn.d;
        this.e = bcn.e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap(bcn.e);
        this.c = bcn.c.b();
    }

    public final bcn a() {
        if (this.a != null) {
            return new bcn(this);
        }
        throw new IllegalStateException("url == null");
    }

    public final bco a(bbx bbx) {
        this.c = bbx.b();
        return this;
    }

    public final bco a(bbz bbz) {
        if (bbz != null) {
            this.a = bbz;
            return this;
        }
        throw new NullPointerException("url == null");
    }

    public final bco a(String str) {
        if (str != null) {
            StringBuilder stringBuilder;
            int i;
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                stringBuilder = new StringBuilder("http:");
                i = 3;
            } else {
                if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                    stringBuilder = new StringBuilder("https:");
                    i = 4;
                }
                return a(bbz.f(str));
            }
            stringBuilder.append(str.substring(i));
            str = stringBuilder.toString();
            return a(bbz.f(str));
        }
        throw new NullPointerException("url == null");
    }

    public final bco a(String str, @Nullable bcp bcp) {
        if (str == null) {
            throw new NullPointerException("method == null");
        } else if (str.length() != 0) {
            StringBuilder stringBuilder;
            if (bcp != null) {
                if (!bed.a(str)) {
                    stringBuilder = new StringBuilder("method ");
                    stringBuilder.append(str);
                    stringBuilder.append(" must not have a request body.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            if (bcp == null) {
                Object obj;
                if (!(str.equals("POST") || str.equals("PUT") || str.equals("PATCH") || str.equals("PROPPATCH"))) {
                    if (!str.equals("REPORT")) {
                        obj = null;
                        if (obj == null) {
                            stringBuilder = new StringBuilder("method ");
                            stringBuilder.append(str);
                            stringBuilder.append(" must have a request body.");
                            throw new IllegalArgumentException(stringBuilder.toString());
                        }
                    }
                }
                obj = 1;
                if (obj == null) {
                    stringBuilder = new StringBuilder("method ");
                    stringBuilder.append(str);
                    stringBuilder.append(" must have a request body.");
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
            }
            this.b = str;
            this.d = bcp;
            return this;
        } else {
            throw new IllegalArgumentException("method.length() == 0");
        }
    }

    public final bco a(String str, String str2) {
        this.c.c(str, str2);
        return this;
    }

    public final bco b(String str) {
        this.c.a(str);
        return this;
    }

    public final bco b(String str, String str2) {
        this.c.a(str, str2);
        return this;
    }
}
