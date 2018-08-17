package defpackage;

import android.content.Context;
import android.support.v4.view.ViewCompat;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public final class aeo extends aed<aeo, aep> {
    public final /* synthetic */ ViewHolder a(View view) {
        return new aep(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        viewHolder = (aep) viewHolder;
        super.a(viewHolder, list);
        Context context = viewHolder.itemView.getContext();
        viewHolder.itemView.setId(hashCode());
        viewHolder.a.setClickable(false);
        viewHolder.a.setEnabled(false);
        viewHolder.a.setMinimumHeight(1);
        ViewCompat.setImportantForAccessibility(viewHolder.a, 2);
        viewHolder.b.setBackgroundColor(afz.a(context, R.attr.material_drawer_divider, R.color.material_drawer_divider));
    }

    public final int g() {
        return R.id.material_drawer_item_divider;
    }

    public final int i() {
        return R.layout.material_drawer_item_divider;
    }
}
