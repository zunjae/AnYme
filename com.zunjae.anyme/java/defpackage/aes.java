package defpackage;

import android.view.View;
import android.widget.ImageView;
import com.mikepenz.materialdrawer.R;

public final class aes extends aek {
    public ImageView e;

    public aes(View view) {
        super(view);
        this.e = (ImageView) view.findViewById(R.id.material_drawer_arrow);
        this.e.setImageDrawable(new adf(view.getContext(), adz.mdf_expand_more).g(16).d(2).a(-16777216));
    }
}
