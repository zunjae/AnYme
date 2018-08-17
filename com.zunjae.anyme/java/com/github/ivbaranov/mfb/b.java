package com.github.ivbaranov.mfb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class b extends AnimatorListenerAdapter {
    final /* synthetic */ MaterialFavoriteButton a;

    b(MaterialFavoriteButton materialFavoriteButton) {
        this.a = materialFavoriteButton;
    }

    public final void onAnimationStart(Animator animator) {
        MaterialFavoriteButton materialFavoriteButton;
        int b;
        if (this.a.m) {
            materialFavoriteButton = this.a;
            b = materialFavoriteButton.p;
        } else {
            materialFavoriteButton = this.a;
            b = materialFavoriteButton.q;
        }
        materialFavoriteButton.setImageResource(b);
    }
}
