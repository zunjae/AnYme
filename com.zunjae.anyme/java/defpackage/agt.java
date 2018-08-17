package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class agt implements AnimatorUpdateListener {
    final /* synthetic */ int a;
    final /* synthetic */ ags b;

    agt(ags ags, int i) {
        this.b = ags;
        this.a = i;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ags.a(this.b, valueAnimator, this.a);
    }
}
