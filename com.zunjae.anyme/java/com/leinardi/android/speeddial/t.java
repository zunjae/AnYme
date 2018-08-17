package com.leinardi.android.speeddial;

import android.view.View;
import android.view.ViewGroup;

final class t implements Runnable {
    final /* synthetic */ boolean a;
    final /* synthetic */ View b;

    t(boolean z, View view) {
        this.a = z;
        this.b = view;
    }

    public final void run() {
        if (this.a) {
            ViewGroup viewGroup = (ViewGroup) this.b.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.b);
            }
            return;
        }
        this.b.setVisibility(8);
    }
}
