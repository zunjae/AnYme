package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class arp {
    private final long a;
    private final long b;
    private final String c;
    private final String d;

    public arp(long j, String str, String str2, long j2) {
        this.a = j;
        this.c = str;
        this.d = str2;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.d.replace("r/130x194/", BuildConfig.FLAVOR);
    }
}
