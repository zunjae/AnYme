package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R;

public final class afb extends ViewHolder {
    private View a;
    private ImageView b;
    private TextView c;
    private TextView d;

    private afb(View view) {
        super(view);
        this.a = view;
        this.b = (ImageView) view.findViewById(R.id.material_drawer_icon);
        this.c = (TextView) view.findViewById(R.id.material_drawer_name);
        this.d = (TextView) view.findViewById(R.id.material_drawer_description);
    }
}
