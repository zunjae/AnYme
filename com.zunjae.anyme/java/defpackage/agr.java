package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class agr implements AnimatorUpdateListener {
    final /* synthetic */ agq a;

    agr(agq agq) {
        this.a = agq;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        agq.a(this.a, valueAnimator);
    }
}
