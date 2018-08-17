package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class agz implements AnimatorUpdateListener {
    final /* synthetic */ agy a;

    agz(agy agy) {
        this.a = agy;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        agy.a(this.a, valueAnimator);
    }
}
