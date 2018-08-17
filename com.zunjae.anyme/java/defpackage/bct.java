package defpackage;

import javax.annotation.Nullable;

public final class bct {
    bcn a;
    bck b;
    int c;
    String d;
    @Nullable
    bbw e;
    bby f;
    bcu g;
    bcs h;
    bcs i;
    bcs j;
    long k;
    long l;

    public bct() {
        this.c = -1;
        this.f = new bby();
    }

    bct(bcs bcs) {
        this.c = -1;
        this.a = bcs.a;
        this.b = bcs.b;
        this.c = bcs.c;
        this.d = bcs.d;
        this.e = bcs.e;
        this.f = bcs.f.b();
        this.g = bcs.g;
        this.h = bcs.h;
        this.i = bcs.i;
        this.j = bcs.j;
        this.k = bcs.k;
        this.l = bcs.l;
    }

    private static void a(String str, bcs bcs) {
        StringBuilder stringBuilder;
        if (bcs.g != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".body != null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (bcs.h != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".networkResponse != null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (bcs.i != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".cacheResponse != null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (bcs.j != null) {
            stringBuilder = new StringBuilder();
            stringBuilder.append(str);
            stringBuilder.append(".priorResponse != null");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    public final bcs a() {
        if (this.a == null) {
            throw new IllegalStateException("request == null");
        } else if (this.b == null) {
            throw new IllegalStateException("protocol == null");
        } else if (this.c < 0) {
            StringBuilder stringBuilder = new StringBuilder("code < 0: ");
            stringBuilder.append(this.c);
            throw new IllegalStateException(stringBuilder.toString());
        } else if (this.d != null) {
            return new bcs(this);
        } else {
            throw new IllegalStateException("message == null");
        }
    }

    public final bct a(int i) {
        this.c = i;
        return this;
    }

    public final bct a(long j) {
        this.k = j;
        return this;
    }

    public final bct a(@Nullable bbw bbw) {
        this.e = bbw;
        return this;
    }

    public final bct a(bbx bbx) {
        this.f = bbx.b();
        return this;
    }

    public final bct a(bck bck) {
        this.b = bck;
        return this;
    }

    public final bct a(bcn bcn) {
        this.a = bcn;
        return this;
    }

    public final bct a(@Nullable bcs bcs) {
        if (bcs != null) {
            bct.a("networkResponse", bcs);
        }
        this.h = bcs;
        return this;
    }

    public final bct a(@Nullable bcu bcu) {
        this.g = bcu;
        return this;
    }

    public final bct a(String str) {
        this.d = str;
        return this;
    }

    public final bct a(String str, String str2) {
        this.f.a(str, str2);
        return this;
    }

    public final bct b(long j) {
        this.l = j;
        return this;
    }

    public final bct b(@Nullable bcs bcs) {
        if (bcs != null) {
            bct.a("cacheResponse", bcs);
        }
        this.i = bcs;
        return this;
    }

    public final bct c(@Nullable bcs bcs) {
        if (bcs != null) {
            if (bcs.g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }
        this.j = bcs;
        return this;
    }
}
