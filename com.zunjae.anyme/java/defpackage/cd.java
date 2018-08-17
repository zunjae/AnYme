package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R;
import android.view.ViewConfiguration;

public final class cd {
    private Context a;

    private cd(Context context) {
        this.a = context;
    }

    public static cd a(Context context) {
        return new cd(context);
    }

    public final int a() {
        Configuration configuration = this.a.getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp <= 600 && i <= 600 && (i <= 960 || i2 <= 720)) {
            if (i <= 720 || i2 <= 960) {
                if (i < 500 && (i <= 640 || i2 <= 480)) {
                    if (i <= 480 || i2 <= 640) {
                        return i >= 360 ? 3 : 2;
                    }
                }
                return 4;
            }
        }
        return 5;
    }

    public final boolean b() {
        return VERSION.SDK_INT >= 19 || !ViewConfiguration.get(this.a).hasPermanentMenuKey();
    }

    public final int c() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public final boolean d() {
        return this.a.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs);
    }

    public final int e() {
        TypedArray obtainStyledAttributes = this.a.obtainStyledAttributes(null, R.styleable.ActionBar, R.attr.actionBarStyle, 0);
        int layoutDimension = obtainStyledAttributes.getLayoutDimension(R.styleable.ActionBar_height, 0);
        Resources resources = this.a.getResources();
        if (!d()) {
            layoutDimension = Math.min(layoutDimension, resources.getDimensionPixelSize(R.dimen.abc_action_bar_stacked_max_height));
        }
        obtainStyledAttributes.recycle();
        return layoutDimension;
    }

    public final boolean f() {
        return this.a.getApplicationInfo().targetSdkVersion < 14;
    }

    public final int g() {
        return this.a.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_stacked_tab_max_width);
    }
}
