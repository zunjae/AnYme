package com.leinardi.android.speeddial;

import android.view.View;
import android.view.View.OnClickListener;

final class b implements OnClickListener {
    final /* synthetic */ FabWithLabelView a;

    b(FabWithLabelView fabWithLabelView) {
        this.a = fabWithLabelView;
    }

    public final void onClick(View view) {
        d speedDialActionItem = this.a.getSpeedDialActionItem();
        if (this.a.g != null && speedDialActionItem != null) {
            this.a.g.onActionSelected(speedDialActionItem);
        }
    }
}
