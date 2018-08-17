package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.util.Pair;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public final class aey extends aed<aey, aez> implements afj<aey> {
    protected boolean a = false;
    protected adw b;
    protected adx l;
    protected adx m;
    protected adu n;
    protected adu o;
    protected adu p;
    protected adu q;
    protected Typeface r = null;
    protected Pair<Integer, ColorStateList> s;

    private ColorStateList a(int i, int i2) {
        Pair pair = this.s;
        if (pair == null || i + i2 != ((Integer) pair.first).intValue()) {
            this.s = new Pair(Integer.valueOf(i + i2), afs.a(i, i2));
        }
        return (ColorStateList) this.s.second;
    }

    public final aey a(String str) {
        this.b = new adw(str);
        return this;
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new aez(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        afu afu;
        int i;
        int i2;
        afx afx;
        viewHolder = (aez) viewHolder;
        super.a(viewHolder, list);
        Context context = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(hashCode());
        viewHolder.itemView.setEnabled(d());
        viewHolder.itemView.setSelected(e());
        int a = afu.a(this.n, context, R.attr.material_drawer_selected, R.color.material_drawer_selected);
        if (d()) {
            afu = this.o;
            i = R.attr.material_drawer_primary_text;
            i2 = R.color.material_drawer_primary_text;
        } else {
            afu = this.q;
            i = R.attr.material_drawer_hint_text;
            i2 = R.color.material_drawer_hint_text;
        }
        int a2 = afu.a(afu, context, i, i2);
        i = afu.a(this.p, context, R.attr.material_drawer_selected_text, R.color.material_drawer_selected_text);
        ViewCompat.setBackground(viewHolder.a, afz.a(context, a, l()));
        if (this.a) {
            viewHolder.c.setVisibility(0);
            afx.a(this.l, viewHolder.c);
        } else {
            viewHolder.c.setVisibility(8);
        }
        if (!this.a && this.m == null) {
            afx = this.l;
            if (afx != null) {
                afx.a(afx, viewHolder.d);
                if (this.r != null) {
                    viewHolder.c.setTypeface(this.r);
                    viewHolder.d.setTypeface(this.r);
                }
                if (this.a) {
                    viewHolder.c.setTextColor(a(a2, i));
                }
                viewHolder.d.setTextColor(a(a2, i));
                afo.a().a(viewHolder.b);
                afw.b(this.b, viewHolder.b, afr.PROFILE_DRAWER_ITEM.name());
                afs.a(viewHolder.a);
            }
        }
        afx = this.m;
        afx.a(afx, viewHolder.d);
        if (this.r != null) {
            viewHolder.c.setTypeface(this.r);
            viewHolder.d.setTypeface(this.r);
        }
        if (this.a) {
            viewHolder.c.setTextColor(a(a2, i));
        }
        viewHolder.d.setTextColor(a(a2, i));
        afo.a().a(viewHolder.b);
        afw.b(this.b, viewHolder.b, afr.PROFILE_DRAWER_ITEM.name());
        afs.a(viewHolder.a);
    }

    public final aey b(String str) {
        this.l = new adx(str);
        return this;
    }

    public final aey c(String str) {
        this.m = new adx(str);
        return this;
    }

    public final int g() {
        return R.id.material_drawer_item_profile;
    }

    public final int i() {
        return R.layout.material_drawer_item_profile;
    }

    public final adx n() {
        return this.l;
    }

    public final adx o() {
        return this.m;
    }

    public final adw p() {
        return this.b;
    }
}
