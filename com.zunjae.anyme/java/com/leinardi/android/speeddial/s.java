package com.leinardi.android.speeddial;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class s implements AnimationListener {
    final /* synthetic */ View a;

    s(View view) {
        this.a = view;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
