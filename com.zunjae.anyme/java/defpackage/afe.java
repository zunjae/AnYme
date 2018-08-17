package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R;

public final class afe extends ViewHolder {
    private View a;
    private View b;
    private TextView c;

    private afe(View view) {
        super(view);
        this.a = view;
        this.b = view.findViewById(R.id.material_drawer_divider);
        this.c = (TextView) view.findViewById(R.id.material_drawer_name);
    }
}
