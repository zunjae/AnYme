package defpackage;

import java.util.Map;
import javax.annotation.Nullable;

public final class bcn {
    final bbz a;
    final String b;
    final bbx c;
    @Nullable
    final bcp d;
    final Map<Class<?>, Object> e;
    private volatile baw f;

    bcn(bco bco) {
        this.a = bco.a;
        this.b = bco.b;
        this.c = bco.c.a();
        this.d = bco.d;
        this.e = bdb.a(bco.e);
    }

    public final bbz a() {
        return this.a;
    }

    @Nullable
    public final String a(String str) {
        return this.c.a(str);
    }

    public final String b() {
        return this.b;
    }

    public final bbx c() {
        return this.c;
    }

    @Nullable
    public final bcp d() {
        return this.d;
    }

    public final bco e() {
        return new bco(this);
    }

    public final baw f() {
        baw baw = this.f;
        if (baw != null) {
            return baw;
        }
        baw = baw.a(this.c);
        this.f = baw;
        return baw;
    }

    public final boolean g() {
        return this.a.c();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request{method=");
        stringBuilder.append(this.b);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tags=");
        stringBuilder.append(this.e);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
