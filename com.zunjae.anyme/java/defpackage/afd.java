package defpackage;

import android.content.Context;
import android.graphics.Typeface;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public final class afd extends aed<afd, afe> {
    private adx a;
    private boolean b = true;
    private adu l;
    private Typeface m = null;

    public final afd a(String str) {
        this.a = new adx(str);
        return this;
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new afe(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        View c;
        viewHolder = (afe) viewHolder;
        super.a(viewHolder, list);
        Context context = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(hashCode());
        int i = 0;
        viewHolder.a.setClickable(false);
        viewHolder.a.setEnabled(false);
        viewHolder.c.setTextColor(afu.a(this.l, context, R.attr.material_drawer_secondary_text, R.color.material_drawer_secondary_text));
        afx.a(this.a, viewHolder.c);
        if (this.m != null) {
            viewHolder.c.setTypeface(this.m);
        }
        if (this.b) {
            c = viewHolder.b;
        } else {
            c = viewHolder.b;
            i = 8;
        }
        c.setVisibility(i);
        viewHolder.b.setBackgroundColor(afz.a(context, R.attr.material_drawer_divider, R.color.material_drawer_divider));
    }

    public final boolean d() {
        return false;
    }

    public final boolean e() {
        return false;
    }

    public final int g() {
        return R.id.material_drawer_item_section;
    }

    public final int i() {
        return R.layout.material_drawer_item_section;
    }
}
