package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class agx implements AnimatorUpdateListener {
    final /* synthetic */ agw a;

    agx(agw agw) {
        this.a = agw;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        agw.a(this.a, valueAnimator);
    }
}
