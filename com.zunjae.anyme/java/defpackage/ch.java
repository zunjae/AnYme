package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.os.Build.VERSION;
import android.support.v7.appcompat.R;
import android.view.LayoutInflater;

public final class ch extends ContextWrapper {
    private int a;
    private Theme b;
    private LayoutInflater c;
    private Configuration d;
    private Resources e;

    public ch() {
        super(null);
    }

    public ch(Context context, int i) {
        super(context);
        this.a = i;
    }

    public ch(Context context, Theme theme) {
        super(context);
        this.b = theme;
    }

    private void b() {
        if ((this.b == null ? 1 : null) != null) {
            this.b = getResources().newTheme();
            Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.b.setTo(theme);
            }
        }
        this.b.applyStyle(this.a, true);
    }

    public final int a() {
        return this.a;
    }

    protected final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    public final Resources getResources() {
        if (this.e == null) {
            Resources resources;
            Configuration configuration = this.d;
            if (configuration == null) {
                resources = super.getResources();
            } else if (VERSION.SDK_INT >= 17) {
                resources = createConfigurationContext(configuration).getResources();
            }
            this.e = resources;
        }
        return this.e;
    }

    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.c == null) {
            this.c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.c;
    }

    public final Theme getTheme() {
        Theme theme = this.b;
        if (theme != null) {
            return theme;
        }
        if (this.a == 0) {
            this.a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.b;
    }

    public final void setTheme(int i) {
        if (this.a != i) {
            this.a = i;
            b();
        }
    }
}
