package com.leinardi.android.speeddial;

import android.view.View;

final class v implements Runnable {
    final /* synthetic */ View a;

    v(View view) {
        this.a = view;
    }

    public final void run() {
        this.a.setPressed(false);
        this.a.performClick();
    }
}
