package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Pair;
import com.mikepenz.materialdrawer.R;

public abstract class aej<T, VH extends ViewHolder> extends aed<T, VH> {
    protected adw l;
    protected adw m;
    protected adx n;
    protected boolean o = false;
    protected adu p;
    protected adu q;
    protected adu r;
    protected adu s;
    protected adu t;
    protected adu u;
    protected adu v;
    protected Typeface w = null;
    protected Pair<Integer, ColorStateList> x;
    protected int y = 1;

    protected final int a(Context context) {
        return afu.a(this.p, context, R.attr.material_drawer_selected, R.color.material_drawer_selected);
    }

    protected final ColorStateList a(int i, int i2) {
        Pair pair = this.x;
        if (pair == null || i + i2 != ((Integer) pair.first).intValue()) {
            this.x = new Pair(Integer.valueOf(i + i2), afs.a(i, i2));
        }
        return (ColorStateList) this.x.second;
    }

    public final T a(adl adl) {
        this.l = new adw(adl);
        if (VERSION.SDK_INT >= 21) {
            this.m = new adw(adl);
        } else {
            this.o = true;
        }
        return this;
    }

    protected int b(Context context) {
        afu afu;
        int i;
        int i2;
        if (d()) {
            afu = this.q;
            i = R.attr.material_drawer_primary_text;
            i2 = R.color.material_drawer_primary_text;
        } else {
            afu = this.s;
            i = R.attr.material_drawer_hint_text;
            i2 = R.color.material_drawer_hint_text;
        }
        return afu.a(afu, context, i, i2);
    }

    protected final int c(Context context) {
        return afu.a(this.r, context, R.attr.material_drawer_selected_text, R.color.material_drawer_selected_text);
    }

    public final T c(String str) {
        this.n = new adx(str);
        return this;
    }

    public final int d(Context context) {
        afu afu;
        int i;
        int i2;
        if (d()) {
            afu = this.t;
            i = R.attr.material_drawer_primary_icon;
            i2 = R.color.material_drawer_primary_icon;
        } else {
            afu = this.v;
            i = R.attr.material_drawer_hint_icon;
            i2 = R.color.material_drawer_hint_icon;
        }
        return afu.a(afu, context, i, i2);
    }

    protected final int e(Context context) {
        return afu.a(this.u, context, R.attr.material_drawer_selected_text, R.color.material_drawer_selected_text);
    }

    public final T p() {
        this.l = new adw((int) com.zunjae.anyme.R.drawable.discord_icon);
        return this;
    }

    public final adu q() {
        return this.q;
    }

    public final adu r() {
        return this.s;
    }

    public final boolean s() {
        return this.o;
    }

    public final adw t() {
        return this.l;
    }

    public final adw u() {
        return this.m;
    }

    public final adx v() {
        return this.n;
    }

    public final Typeface w() {
        return this.w;
    }
}
