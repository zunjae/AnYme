package com.leinardi.android.speeddial;

import android.view.View;
import android.view.View.OnClickListener;

final class j implements OnClickListener {
    final /* synthetic */ SpeedDialView a;

    j(SpeedDialView speedDialView) {
        this.a = speedDialView;
    }

    public final void onClick(View view) {
        if (this.a.d() || this.a.c.isEmpty()) {
            if (this.a.j == null || !this.a.j.a()) {
                this.a.b();
            }
            return;
        }
        this.a.a();
    }
}
