package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;
import org.jsoup.helper.StringUtil;

public final class arg {
    private final long a;
    private final long b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final int h;

    public arg(long j, int i, String str, String str2, String str3, String str4, String str5, long j2) {
        this.a = j;
        this.c = str;
        this.h = i;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        return this.f;
    }

    public final int e() {
        return this.h;
    }

    public final String f() {
        return this.g;
    }

    public final String g() {
        return this.c;
    }

    public final String h() {
        return this.d.replace("r/130x194/", BuildConfig.FLAVOR);
    }

    public final String i() {
        return StringUtil.isBlank(this.e) ? BuildConfig.FLAVOR : this.e;
    }
}
