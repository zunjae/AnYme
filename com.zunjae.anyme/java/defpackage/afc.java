package defpackage;

import android.content.Context;
import com.mikepenz.materialdrawer.R;

public final class afc extends aeb<afc> {
    protected final int b(Context context) {
        afu q;
        int i;
        int i2;
        if (d()) {
            q = q();
            i = R.attr.material_drawer_secondary_text;
            i2 = R.color.material_drawer_secondary_text;
        } else {
            q = r();
            i = R.attr.material_drawer_hint_text;
            i2 = R.color.material_drawer_hint_text;
        }
        return afu.a(q, context, i, i2);
    }

    public final int g() {
        return R.id.material_drawer_item_secondary;
    }

    public final int i() {
        return R.layout.material_drawer_item_secondary;
    }
}
