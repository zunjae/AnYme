package defpackage;

import android.view.View;
import android.widget.TextView;
import com.mikepenz.materialdrawer.R;

public final class aec extends aek {
    private View e;
    private TextView f;

    public aec(View view) {
        super(view);
        this.e = view.findViewById(R.id.material_drawer_badge_container);
        this.f = (TextView) view.findViewById(R.id.material_drawer_badge);
    }
}
