package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class ahc implements AnimatorUpdateListener {
    final /* synthetic */ ahb a;

    ahc(ahb ahb) {
        this.a = ahb;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ahb.a(this.a, valueAnimator);
    }
}
