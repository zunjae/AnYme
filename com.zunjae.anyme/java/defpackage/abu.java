package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class abu extends AnimatorListenerAdapter {
    final /* synthetic */ abv a;
    final /* synthetic */ View b;

    abu(abv abv, View view) {
        this.a = abv;
        this.b = view;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.a();
    }

    public final void onAnimationRepeat(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }
}
