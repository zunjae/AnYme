package defpackage;

import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R;

public class aek extends ViewHolder {
    protected View a;
    protected ImageView b;
    protected TextView c;
    protected TextView d;

    public aek(View view) {
        super(view);
        this.a = view;
        this.b = (ImageView) view.findViewById(R.id.material_drawer_icon);
        this.c = (TextView) view.findViewById(R.id.material_drawer_name);
        this.d = (TextView) view.findViewById(R.id.material_drawer_description);
    }
}
