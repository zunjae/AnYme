package com.leinardi.android.speeddial;

import android.support.v7.widget.CardView;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class k implements AnimationListener {
    final /* synthetic */ CardView a;
    final /* synthetic */ SpeedDialView b;

    k(SpeedDialView speedDialView, CardView cardView) {
        this.b = speedDialView;
        this.a = cardView;
    }

    public final void onAnimationEnd(Animation animation) {
        this.a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}
