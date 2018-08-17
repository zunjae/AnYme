package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.util.Map;

public class hu {
    private final URL a;
    private final hv b;
    private final String c;
    private String d;
    private URL e;

    public hu(String str) {
        this(str, hv.b);
    }

    private hu(String str, hv hvVar) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("String url must not be empty or null: ".concat(String.valueOf(str)));
        } else if (hvVar != null) {
            this.c = str;
            this.a = null;
            this.b = hvVar;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }

    public hu(URL url) {
        this(url, hv.b);
    }

    private hu(URL url, hv hvVar) {
        if (url == null) {
            throw new IllegalArgumentException("URL must not be null!");
        } else if (hvVar != null) {
            this.a = url;
            this.c = null;
            this.b = hvVar;
        } else {
            throw new IllegalArgumentException("Headers must not be null");
        }
    }

    public final URL a() {
        if (this.e == null) {
            if (TextUtils.isEmpty(this.d)) {
                String str = this.c;
                if (TextUtils.isEmpty(str)) {
                    str = this.a.toString();
                }
                this.d = Uri.encode(str, "@#&=*+-_.,:!?()/~'%");
            }
            this.e = new URL(this.d);
        }
        return this.e;
    }

    public final Map<String, String> b() {
        return this.b.a();
    }

    public final String c() {
        String str = this.c;
        return str != null ? str : this.a.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof hu) {
            hu huVar = (hu) obj;
            if (c().equals(huVar.c()) && this.b.equals(huVar.b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (c().hashCode() * 31) + this.b.hashCode();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(c());
        stringBuilder.append('\n');
        stringBuilder.append(this.b.toString());
        return stringBuilder.toString();
    }
}
