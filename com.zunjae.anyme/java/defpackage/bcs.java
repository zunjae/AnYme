package defpackage;

import java.io.Closeable;
import javax.annotation.Nullable;

public final class bcs implements Closeable {
    final bcn a;
    final bck b;
    final int c;
    final String d;
    @Nullable
    final bbw e;
    final bbx f;
    @Nullable
    final bcu g;
    @Nullable
    final bcs h;
    @Nullable
    final bcs i;
    @Nullable
    final bcs j;
    final long k;
    final long l;
    private volatile baw m;

    bcs(bct bct) {
        this.a = bct.a;
        this.b = bct.b;
        this.c = bct.c;
        this.d = bct.d;
        this.e = bct.e;
        this.f = bct.f.a();
        this.g = bct.g;
        this.h = bct.h;
        this.i = bct.i;
        this.j = bct.j;
        this.k = bct.k;
        this.l = bct.l;
    }

    public final bcn a() {
        return this.a;
    }

    @Nullable
    public final String a(String str) {
        str = this.f.a(str);
        return str != null ? str : null;
    }

    public final int b() {
        return this.c;
    }

    public final boolean c() {
        int i = this.c;
        return i >= 200 && i < 300;
    }

    public final void close() {
        bcu bcu = this.g;
        if (bcu != null) {
            bcu.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String d() {
        return this.d;
    }

    public final bbw e() {
        return this.e;
    }

    public final bbx f() {
        return this.f;
    }

    @Nullable
    public final bcu g() {
        return this.g;
    }

    public final bct h() {
        return new bct(this);
    }

    @Nullable
    public final bcs i() {
        return this.j;
    }

    public final baw j() {
        baw baw = this.m;
        if (baw != null) {
            return baw;
        }
        baw = baw.a(this.f);
        this.m = baw;
        return baw;
    }

    public final long k() {
        return this.k;
    }

    public final long l() {
        return this.l;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Response{protocol=");
        stringBuilder.append(this.b);
        stringBuilder.append(", code=");
        stringBuilder.append(this.c);
        stringBuilder.append(", message=");
        stringBuilder.append(this.d);
        stringBuilder.append(", url=");
        stringBuilder.append(this.a.a);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}
