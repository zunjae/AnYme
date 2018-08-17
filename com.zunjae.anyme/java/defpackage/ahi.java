package defpackage;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;

final class ahi implements AnimatorUpdateListener {
    final /* synthetic */ agn a;
    final /* synthetic */ boolean b;
    final /* synthetic */ ahh c;

    ahi(ahh ahh, agn agn, boolean z) {
        this.c = ahh;
        this.a = agn;
        this.b = z;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ahh.a(this.c, this.a, valueAnimator, this.b);
    }
}
