package defpackage;

import javax.annotation.Nullable;

public final class bbj {
    boolean a;
    @Nullable
    String[] b;
    @Nullable
    String[] c;
    boolean d;

    public bbj(bbi bbi) {
        this.a = bbi.e;
        this.b = bbi.g;
        this.c = bbi.h;
        this.d = bbi.f;
    }

    bbj(boolean z) {
        this.a = z;
    }

    public final bbj a() {
        if (this.a) {
            this.d = true;
            return this;
        }
        throw new IllegalStateException("no TLS extensions for cleartext connections");
    }

    public final bbj a(bbd... bbdArr) {
        if (this.a) {
            String[] strArr = new String[bbdArr.length];
            for (int i = 0; i < bbdArr.length; i++) {
                strArr[i] = bbdArr[i].bk;
            }
            return a(strArr);
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    public final bbj a(bcy... bcyArr) {
        if (this.a) {
            String[] strArr = new String[bcyArr.length];
            for (int i = 0; i < bcyArr.length; i++) {
                strArr[i] = bcyArr[i].javaName;
            }
            return b(strArr);
        }
        throw new IllegalStateException("no TLS versions for cleartext connections");
    }

    public final bbj a(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no cipher suites for cleartext connections");
        } else if (strArr.length != 0) {
            this.b = (String[]) strArr.clone();
            return this;
        } else {
            throw new IllegalArgumentException("At least one cipher suite is required");
        }
    }

    public final bbi b() {
        return new bbi(this);
    }

    public final bbj b(String... strArr) {
        if (!this.a) {
            throw new IllegalStateException("no TLS versions for cleartext connections");
        } else if (strArr.length != 0) {
            this.c = (String[]) strArr.clone();
            return this;
        } else {
            throw new IllegalArgumentException("At least one TLS version is required");
        }
    }
}
