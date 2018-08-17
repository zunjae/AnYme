package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.mikepenz.materialdrawer.R;
import java.util.List;

public abstract class aee<Item extends aee> extends aei<Item, aeh> {
    private OnCheckedChangeListener A = new aeg(this);
    private boolean a = true;
    private boolean b = false;
    private aea z = null;

    public final Item a(aea aea) {
        this.z = aea;
        return this;
    }

    public final /* synthetic */ ViewHolder a(View view) {
        return new aeh(view);
    }

    public final /* synthetic */ void a(ViewHolder viewHolder, List list) {
        aeh aeh = (aeh) viewHolder;
        super.a((ViewHolder) aeh, list);
        a(aeh);
        aeh.e.setOnCheckedChangeListener(null);
        aeh.e.setChecked(this.b);
        aeh.e.setOnCheckedChangeListener(this.A);
        aeh.e.setEnabled(this.a);
        a(new aef(this, aeh));
    }

    public final Item d(boolean z) {
        this.b = z;
        return this;
    }

    public final int g() {
        return R.id.material_drawer_item_primary_switch;
    }

    public final int i() {
        return R.layout.material_drawer_item_switch;
    }

    public final aea n() {
        return this.z;
    }
}
