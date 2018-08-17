package defpackage;

import android.content.Context;
import me.zhanghai.android.materialprogressbar.BuildConfig;

final class awz implements avx<String> {
    final /* synthetic */ awy a;

    awz(awy awy) {
        this.a = awy;
    }

    public final /* synthetic */ Object a(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? BuildConfig.FLAVOR : installerPackageName;
    }
}
