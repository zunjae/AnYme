package defpackage;

import com.zunjae.zasync.b;

public final class arm implements b {
    @xe(a = "userId")
    private final String a;
    @xe(a = "meanScoreText")
    private final String b;
    @xe(a = "daysWastedText")
    private final String c;
    @xe(a = "expirationDate")
    private final long d;

    public arm(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final String a() {
        return this.a;
    }

    public final long b() {
        return this.d;
    }

    public final String c() {
        return this.c.replace("Days:", "Days Wasted:");
    }
}
