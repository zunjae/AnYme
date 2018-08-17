package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

public final class ahf extends ahh {
    private agm j = new agm();

    public ahf(age age) {
        super(age);
    }

    private ValueAnimator a(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ahg(this));
        return ofInt;
    }

    static /* synthetic */ void a(ahf ahf, ValueAnimator valueAnimator) {
        ahf.j.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
        age age = ahf.b;
        if (age != null) {
            age.a(ahf.j);
        }
    }

    private ahf c(float f) {
        Animator animator = this.c;
        if (animator != null) {
            long j = (long) (f * ((float) this.a));
            int size = ((AnimatorSet) animator).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.c).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }

    public final /* synthetic */ agp a(float f) {
        return c(f);
    }

    public final /* synthetic */ agp a(long j) {
        super.b(j);
        return this;
    }

    public final ahh a(int i, int i2, int i3, boolean z) {
        ahh ahh = this;
        int i4 = i;
        int i5 = i3;
        boolean z2 = z;
        if (b(i, i2, i3, z)) {
            ahh.c = ahh.d();
            ahh.d = i4;
            ahh.e = i2;
            ahh.f = i5;
            ahh.g = z2;
            int i6 = i5 * 2;
            ahh.h = i4 - i5;
            ahh.i = i4 + i5;
            ahh.j.b(ahh.h);
            ahh.j.c(ahh.i);
            ahh.j.a(i6);
            ahj a = a(z2);
            long j = ahh.a;
            double d = (double) j;
            Double.isNaN(d);
            long j2 = (long) (d * 0.8d);
            d = (double) j;
            Double.isNaN(d);
            long j3 = (long) (d * 0.2d);
            d = (double) j;
            Double.isNaN(d);
            long j4 = (long) (d * 0.5d);
            double d2 = (double) j;
            Double.isNaN(d2);
            long j5 = (long) (d2 * 0.5d);
            long j6 = j4;
            long j7 = j2;
            long j8 = j5;
            ValueAnimator a2 = a(a.a, a.b, j7, false, ahh.j);
            a(a.c, a.d, j7, true, ahh.j).setStartDelay(j3);
            long j9 = j6;
            ValueAnimator a3 = a(i6, i5, j9);
            a(i5, i6, j9).setStartDelay(j8);
            ((AnimatorSet) ahh.c).playTogether(new Animator[]{a2, r0, a3, r1});
        }
        return ahh;
    }

    public final /* synthetic */ ahh b(float f) {
        return c(f);
    }
}
