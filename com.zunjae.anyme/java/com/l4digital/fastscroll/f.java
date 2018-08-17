package com.l4digital.fastscroll;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class f extends AnimatorListenerAdapter {
    final /* synthetic */ FastScroller a;

    f(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.l.setVisibility(8);
        this.a.j = null;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.l.setVisibility(8);
        this.a.j = null;
    }
}
