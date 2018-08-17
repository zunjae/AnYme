package defpackage;

import android.animation.Animator;
import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;

public final class ahb extends agp<ValueAnimator> {
    private agk d = new agk();
    private int e = -1;
    private int f = -1;

    public ahb(age age) {
        super(age);
    }

    static /* synthetic */ void a(ahb ahb, ValueAnimator valueAnimator) {
        ahb.d.a(((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue());
        age age = ahb.b;
        if (age != null) {
            age.a(ahb.d);
        }
    }

    public final /* synthetic */ agp a(float f) {
        Animator animator = this.c;
        if (animator != null) {
            long j = (long) (f * ((float) this.a));
            if (((ValueAnimator) animator).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    public final ahb a(int i, int i2) {
        if (this.c != null) {
            Object obj;
            if (this.e == i) {
                if (this.f == i2) {
                    obj = null;
                    if (obj != null) {
                        this.e = i;
                        this.f = i2;
                        PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{this.e, this.f}).setEvaluator(new IntEvaluator());
                        ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{r4});
                    }
                }
            }
            obj = 1;
            if (obj != null) {
                this.e = i;
                this.f = i2;
                PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", new int[]{this.e, this.f}).setEvaluator(new IntEvaluator());
                ((ValueAnimator) this.c).setValues(new PropertyValuesHolder[]{r4});
            }
        }
        return this;
    }

    public final /* synthetic */ Animator a() {
        Animator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ahc(this));
        return valueAnimator;
    }
}
