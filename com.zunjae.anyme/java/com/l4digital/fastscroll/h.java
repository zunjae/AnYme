package com.l4digital.fastscroll;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class h extends AnimatorListenerAdapter {
    final /* synthetic */ FastScroller a;

    h(FastScroller fastScroller) {
        this.a = fastScroller;
    }

    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.a.o.setVisibility(8);
        this.a.i = null;
    }

    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        this.a.o.setVisibility(8);
        this.a.i = null;
    }
}
