package defpackage;

import android.support.v7.widget.RecyclerView.LayoutParams;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public final class aev extends aed<aev, aew> implements afj<aev> {
    protected adw a;
    protected adv b;

    public aev() {
        j();
    }

    public aev(aey aey) {
        this.a = aey.b;
        this.e = aey.e;
        j();
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new aew(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        viewHolder = (aew) viewHolder;
        super.a(viewHolder, list);
        if (this.b != null) {
            LayoutParams layoutParams = (LayoutParams) viewHolder.itemView.getLayoutParams();
            layoutParams.height = this.b.a(viewHolder.itemView.getContext());
            viewHolder.itemView.setLayoutParams(layoutParams);
        }
        viewHolder.itemView.setId(hashCode());
        viewHolder.itemView.setEnabled(d());
        afw.b(this.a, viewHolder.a, null);
    }

    public final int g() {
        return R.id.material_drawer_item_mini_profile;
    }

    public final int i() {
        return R.layout.material_drawer_item_mini_profile;
    }

    public final adx n() {
        return null;
    }

    public final adx o() {
        return null;
    }

    public final adw p() {
        return this.a;
    }
}
