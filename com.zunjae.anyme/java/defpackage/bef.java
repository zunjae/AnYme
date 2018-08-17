package defpackage;

import javax.annotation.Nullable;

public final class bef extends bcu {
    @Nullable
    private final String a;
    private final long b;
    private final bhh c;

    public bef(@Nullable String str, long j, bhh bhh) {
        this.a = str;
        this.b = j;
        this.c = bhh;
    }

    public final bcd a() {
        String str = this.a;
        return str != null ? bcd.b(str) : null;
    }

    public final long b() {
        return this.b;
    }

    public final bhh c() {
        return this.c;
    }
}
