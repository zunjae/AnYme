package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import com.mikepenz.materialdrawer.R;

public final class aep extends ViewHolder {
    private View a;
    private View b;

    private aep(View view) {
        super(view);
        this.a = view;
        this.b = view.findViewById(R.id.material_drawer_divider);
    }
}
