package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public final class afa extends aed<afa, afb> implements afj<afa> {
    private adw a;
    private adx b;
    private adx l;
    private boolean m = false;
    private adu n;
    private adu o;
    private adu p;
    private adu q;
    private Typeface r = null;
    private boolean s = false;

    public final afa a(adl adl) {
        this.a = new adw(adl);
        return this;
    }

    public final afa a(String str) {
        this.b = new adx(str);
        return this;
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new afb(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        viewHolder = (afb) viewHolder;
        super.a(viewHolder, list);
        Context context = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(hashCode());
        viewHolder.itemView.setEnabled(d());
        viewHolder.itemView.setSelected(e());
        int a = afu.a(this.n, context, R.attr.material_drawer_selected, R.color.material_drawer_selected);
        int a2 = afu.a(this.o, context, R.attr.material_drawer_primary_text, R.color.material_drawer_primary_text);
        int a3 = afu.a(this.p, context, R.attr.material_drawer_primary_icon, R.color.material_drawer_primary_icon);
        int a4 = afu.a(this.q, context, R.attr.material_drawer_primary_text, R.color.material_drawer_primary_text);
        ViewCompat.setBackground(viewHolder.a, afz.a(context, a, l()));
        afx.a(this.b, viewHolder.c);
        viewHolder.c.setTextColor(a2);
        afx.b(this.l, viewHolder.d);
        viewHolder.d.setTextColor(a4);
        if (this.r != null) {
            viewHolder.c.setTypeface(this.r);
            viewHolder.d.setTypeface(this.r);
        }
        adw.a(this.a, viewHolder.b, a3, this.m, 2);
        afs.a(viewHolder.a);
    }

    public final boolean f() {
        return this.s;
    }

    public final int g() {
        return R.id.material_drawer_item_profile_setting;
    }

    public final int i() {
        return R.layout.material_drawer_item_profile_setting;
    }

    public final /* bridge */ /* synthetic */ Object j() {
        this.s = false;
        return this;
    }

    public final adx n() {
        return this.b;
    }

    public final adx o() {
        return this.l;
    }

    public final adw p() {
        return this.a;
    }
}
