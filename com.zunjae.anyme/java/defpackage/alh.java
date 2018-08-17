package defpackage;

import android.support.v4.app.Fragment;
import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class alh {
    private final Fragment a;
    private final String b;

    public alh(Fragment fragment) {
        this.a = fragment;
        this.b = BuildConfig.FLAVOR;
    }

    public alh(Fragment fragment, String str) {
        this.a = fragment;
        this.b = str;
    }

    public final Fragment a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }
}
