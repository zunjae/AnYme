package defpackage;

import me.zhanghai.android.materialprogressbar.BuildConfig;

public final class ja implements je<byte[]> {
    private final String a;

    public ja() {
        this(BuildConfig.FLAVOR);
    }

    @Deprecated
    private ja(String str) {
        this.a = str;
    }

    public final /* synthetic */ en a(Object obj, int i, int i2) {
        return new em((byte[]) obj, this.a);
    }
}
