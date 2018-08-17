package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class ahe implements AnimatorUpdateListener {
    final /* synthetic */ ahd a;

    ahe(ahd ahd) {
        this.a = ahd;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ahd.a(this.a, valueAnimator);
    }
}
