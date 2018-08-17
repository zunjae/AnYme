package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class ahg implements AnimatorUpdateListener {
    final /* synthetic */ ahf a;

    ahg(ahf ahf) {
        this.a = ahf;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ahf.a(this.a, valueAnimator);
    }
}
