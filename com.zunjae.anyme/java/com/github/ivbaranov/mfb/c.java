package com.github.ivbaranov.mfb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class c extends AnimatorListenerAdapter {
    final /* synthetic */ MaterialFavoriteButton a;

    c(MaterialFavoriteButton materialFavoriteButton) {
        this.a = materialFavoriteButton;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a.x != null) {
            this.a.x;
            this.a.m;
        }
    }
}
