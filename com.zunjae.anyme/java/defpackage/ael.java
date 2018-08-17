package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public final class ael extends aed<ael, aen> {
    private adv a;
    private View b;
    private int l = aem.a;
    private boolean m = true;

    public final ael a(int i) {
        this.l = i;
        return this;
    }

    public final ael a(adv adv) {
        this.a = adv;
        return this;
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new aen(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        viewHolder = (aen) viewHolder;
        super.a(viewHolder, list);
        Context context = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(hashCode());
        viewHolder.a.setEnabled(false);
        if (this.b.getParent() != null) {
            ((ViewGroup) this.b.getParent()).removeView(this.b);
        }
        int i = -2;
        if (this.a != null) {
            LayoutParams layoutParams = (LayoutParams) viewHolder.a.getLayoutParams();
            int a = this.a.a(context);
            layoutParams.height = a;
            viewHolder.a.setLayoutParams(layoutParams);
            i = a;
        }
        ((ViewGroup) viewHolder.a).removeAllViews();
        boolean z = this.m;
        View view = new View(context);
        view.setMinimumHeight(z);
        view.setBackgroundColor(afz.a(context, R.attr.material_drawer_divider, R.color.material_drawer_divider));
        float f = (float) z;
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, (int) afz.a(f, context));
        if (this.a != null) {
            i -= (int) afz.a(f, context);
        }
        ViewGroup.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, i);
        i = this.l;
        if (i == aem.a) {
            ((ViewGroup) viewHolder.a).addView(this.b, layoutParams3);
            layoutParams2.bottomMargin = context.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
            ((ViewGroup) viewHolder.a).addView(view, layoutParams2);
            return;
        }
        if (i == aem.b) {
            layoutParams2.topMargin = context.getResources().getDimensionPixelSize(R.dimen.material_drawer_padding);
            ((ViewGroup) viewHolder.a).addView(view, layoutParams2);
        }
        ((ViewGroup) viewHolder.a).addView(this.b, layoutParams3);
    }

    public final ael b(View view) {
        this.b = view;
        return this;
    }

    public final ael d(boolean z) {
        this.m = z;
        return this;
    }

    public final int g() {
        return R.id.material_drawer_item_container;
    }

    public final int i() {
        return R.layout.material_drawer_item_container;
    }
}
