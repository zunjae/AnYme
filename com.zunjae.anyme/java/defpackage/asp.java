package defpackage;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import mehdi.sakout.fancybuttons.R;

public final class asp {
    @xe(a = "WaifuId")
    private int a;
    @xe(a = "AnimeId")
    private int b;
    @xe(a = "WaifuName")
    private String c;
    @xe(a = "ImageURL")
    private String d;
    @xe(a = "DateCreated")
    private long e = (System.currentTimeMillis() / 1000);
    @xe(a = "TotalFavoriteCount")
    private int f;

    public asp(int i, int i2, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
    }

    public static void a(List<asp> list, int i) {
        Comparator comparator;
        switch (i) {
            case R.styleable.FancyButtonsAttrs_android_enabled /*0*/:
                comparator = -$$Lambda$asp$bzWxT1xofjDC4shSRhWRwBWcqsI.INSTANCE;
                break;
            case tw.b /*2*/:
                comparator = -$$Lambda$asp$lbaQZ094fodw-6i2CKGN0_HQ-8M.INSTANCE;
                break;
            default:
                comparator = -$$Lambda$asp$d2yfkilRs8J-y7rINO5EnZy-xDk.INSTANCE;
                break;
        }
        Collections.sort(list, comparator);
    }

    public final int a() {
        return this.f;
    }

    public final void a(long j) {
        this.e = j;
    }

    public final int b() {
        return this.a;
    }

    public final int c() {
        return this.b;
    }

    public final String d() {
        return this.c;
    }

    public final String e() {
        return this.d;
    }

    public final long f() {
        return this.e;
    }
}
