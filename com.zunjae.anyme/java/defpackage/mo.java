package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;

final class mo implements mw {
    private final int a = 300;

    mo() {
    }

    public final Animation a() {
        Animation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setDuration((long) this.a);
        return alphaAnimation;
    }
}
