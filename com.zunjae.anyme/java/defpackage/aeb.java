package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public abstract class aeb<Item extends aeb> extends aei<Item, aec> implements afh<Item> {
    protected adx a;
    protected adt b = new adt();

    public final Item a(String str) {
        this.a = new adx(str);
        return this;
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new aec(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        View b;
        int i;
        aec aec = (aec) viewHolder;
        super.a((ViewHolder) aec, list);
        Context context = aec.itemView.getContext();
        a(aec);
        if (afx.b(this.a, aec.f)) {
            this.b.a(aec.f, a(b(context), c(context)));
            b = aec.e;
            i = 0;
        } else {
            b = aec.e;
            i = 8;
        }
        b.setVisibility(i);
        if (w() != null) {
            aec.f.setTypeface(w());
        }
    }

    public int g() {
        return R.id.material_drawer_item_primary;
    }

    public int i() {
        return R.layout.material_drawer_item_primary;
    }
}
