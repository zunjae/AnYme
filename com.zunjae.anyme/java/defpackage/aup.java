package defpackage;

import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;

public final class aup {
    public static Animation a(double d, int i) {
        Animation alphaAnimation = new AlphaAnimation(1.0f, (float) d);
        alphaAnimation.setDuration((long) i);
        alphaAnimation.setInterpolator(new LinearInterpolator());
        alphaAnimation.setRepeatCount(-1);
        alphaAnimation.setRepeatMode(2);
        return alphaAnimation;
    }
}
