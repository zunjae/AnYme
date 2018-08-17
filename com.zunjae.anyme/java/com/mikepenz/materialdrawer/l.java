package com.mikepenz.materialdrawer;

import android.view.View;
import android.view.View.OnClickListener;

final class l implements OnClickListener {
    final /* synthetic */ f a;

    l(f fVar) {
        this.a = fVar;
    }

    public final void onClick(View view) {
        e eVar = this.a.R;
        boolean a;
        if (eVar != null) {
            view.getTag(R.id.material_drawer_profile_header);
            a = eVar.a();
        } else {
            a = false;
        }
        if (this.a.e.getVisibility() == 0 && !r0) {
            f fVar = this.a;
            view.getContext();
            fVar.f();
        }
    }
}
